package com.medical.maamarket.Controller;

import com.medical.maamarket.Entity.Items;
import com.medical.maamarket.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
=======
import org.springframework.web.bind.annotation.*;
>>>>>>> 61ba450f991389d91498e686e3e85d53d7e42154

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

<<<<<<< HEAD
    @GetMapping("/getItemByName/{itemName}")
    public Items getItemByName(@PathVariable String itemName) {

        return itemsService.findByName(itemName);
    }
=======
    @PostMapping("/Items")
    public Items addItem(@RequestBody Items theItem)
    {
        theItem.setItem_id(0);
        Items dbitem = itemsService.save(theItem);
        return dbitem;
>>>>>>> 61ba450f991389d91498e686e3e85d53d7e42154
    }
}
