package com.medical.maamarket.service;

import com.medical.maamarket.DAO.ItemsDAO;
import com.medical.maamarket.Entity.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemsService{
    private ItemsDAO itemsDAO;

    @Autowired
    public ItemServiceImpl(ItemsDAO itemsDAO){
        this.itemsDAO = itemsDAO;
    }
    @Override
    public List<Items> findAll() {
        List<Items> items = itemsDAO.findAll();
        return items;
    }
}
