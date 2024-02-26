package com.medical.maamarket.service;

import com.medical.maamarket.Entity.Items;

import java.util.List;

public interface ItemsService {
    List<Items> findAll();
    void deleteByName(String name);

    Items save(Items items);
}
