package com.medical.maamarket.Controller;

import com.medical.maamarket.Entity.Items;
import com.medical.maamarket.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Items")
public class ItemsController {
    @Autowired
    ItemsService itemsService;

    @GetMapping("/AllItems")
    public List<Items> getAllItems(){
        return itemsService.findAll();
    }

    @PostMapping("/Items")
    public Items addItem(@RequestBody Items theItem)
    {
        theItem.setItem_id(0);
        Items dbitem = itemsService.save(theItem);
        return dbitem;
    }
}
