package com.medical.maamarket.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "items")
public class items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int item_id;
    private String  item_name;
    private String item_desc;
    private String item_quantity;
    private String item_price;
}
