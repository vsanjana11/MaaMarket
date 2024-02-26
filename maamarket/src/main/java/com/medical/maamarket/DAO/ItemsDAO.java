package com.medical.maamarket.DAO;

import com.medical.maamarket.Entity.Items;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemsDAO {

    @Autowired
    EntityManager entityManager;
    public List<Items> findAll(){
        TypedQuery<Items> theQuery = entityManager.createQuery("from Items",Items.class);
        List<Items> items = theQuery.getResultList();
        return items;
    }
}
