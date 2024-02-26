package com.medical.maamarket.service;

import com.medical.maamarket.DAO.ItemsDAOImpl;
import com.medical.maamarket.Entity.Items;
import jakarta.transaction.Transactional;
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
    public Items findByName(String itemName) {
        Items items = itemsDAO.findByName(itemName);
        return items;
    }

    @Transactional
    @Override
    public void deleteByName(Items name) {
        itemsDAO.deleteByName(name);
    }

    @Transactional
    @Override
    public Items save(Items items) {
        return itemsDAO.save(items);
    }
}
