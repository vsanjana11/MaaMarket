package com.medical.maamarket.service;

import com.medical.maamarket.DAO.ItemsDAOImpl;
import com.medical.maamarket.Entity.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemsService{
    private ItemsDAOImpl itemsDAO;

    @Autowired
    public ItemServiceImpl(ItemsDAOImpl itemsDAO){
        this.itemsDAO = itemsDAO;
    }
    @Override
    public List<Items> findAll() {
        List<Items> items = itemsDAO.findAll();
        return items;
    }

    @Override
    public void deleteByName(String name) {
        itemsDAO.deleteByName(name);
    }

    @Override
    public Items save(Items items) {
        return itemsDAO.save(items);
    }
}
