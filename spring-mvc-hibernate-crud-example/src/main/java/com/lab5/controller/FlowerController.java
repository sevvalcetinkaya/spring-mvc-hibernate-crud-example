package com.lab5.controller;

import com.lab5.entity.Flower;
import com.lab5.service.FlowerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/flower")
public class FlowerController {
    private final FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping("/list")
    public String listFlower(Model model){
        // if record not available in database then getCustomers() given an error
        try{
            List<Flower> flowers = flowerService.getFlowers();
            model.addAttribute("flowers", flowers);
        }catch (Exception e){
            model.addAttribute("flowers", null);
        }
        return "flowers-list";
    }

    @GetMapping("/show-flower-form")
    public String showFlowerForm(Model model){
        model.addAttribute("flower", new Flower());
        return "flower-form";
    }

    @GetMapping("/update-form")
    public String updateFlowerForm(@RequestParam("id")int id,Model model){
        model.addAttribute("flower", flowerService.getFlower(id));
        return "flower-form";
    }

    @PostMapping("/save")
    public String saveFlower(@ModelAttribute("flower") Flower flower){
        flowerService.saveOrUpdate(flower);
        return "redirect:/flower/list";
    }

    @GetMapping("/delete")
    public String deleteFlower(@RequestParam("id") int id){
        flowerService.delete(id);
        return "redirect:/flower/list";
    }
}