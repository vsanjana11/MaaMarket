package com.medical.maamarket.service;

import com.medical.maamarket.Entity.Items;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

import java.util.List;

public interface ItemsService {
    List<Items> findAll();
    Items findByName(String itemName);

    void deleteByName(Items name);

    Items save(Items items);
}
