package com.lab5.service;

import java.util.List;

import com.lab5.entity.Flower;

public interface FlowerService {
    List<Flower> getFlowers();
    void saveOrUpdate(Flower flower);
    Flower getFlower(int id);
    void delete(int id);
}
