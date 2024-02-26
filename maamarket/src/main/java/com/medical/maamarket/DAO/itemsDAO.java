package com.medical.maamarket.DAO;

import com.medical.maamarket.Entity.Items;

import java.util.List;

public interface itemsDAO {
    List<Items> findAll();
    void deleteByName(String name);

    Items save(Items items);

}
