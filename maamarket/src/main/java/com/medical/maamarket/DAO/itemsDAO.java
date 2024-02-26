package com.medical.maamarket.DAO;

import com.medical.maamarket.Entity.Items;

import java.util.List;

public interface itemsDAO {
    List<Items> findAll();
<<<<<<< HEAD
    Items findByName(String itemName);
=======
    void deleteByName(String name);

    Items save(Items items);

>>>>>>> 61ba450f991389d91498e686e3e85d53d7e42154
}
