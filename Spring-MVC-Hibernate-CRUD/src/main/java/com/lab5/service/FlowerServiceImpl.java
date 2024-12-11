package com.lab5.service;

import com.lab5.dao.FlowerDAO;
import com.lab5.entity.Flower;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class FlowerServiceImpl implements FlowerService {
    private final FlowerDAO flowerDAO;

    @Autowired
    public FlowerServiceImpl(FlowerDAO flowerDAO) {
        this.flowerDAO = flowerDAO;
    }


    @Override
    @Transactional
    public List<Flower> getFlowers() {
        return flowerDAO.getFlowers();
    }

    @Override
    @Transactional
    public void saveOrUpdate(Flower flower) {
        flowerDAO.saveOrUpdate(flower);
    }

    @Override
    @Transactional
    public Flower getFlower(int id) {
        return flowerDAO.getFlower(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        flowerDAO.delete(id);
    }
}
