package com.app.mytoys.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
public class Toy {

    @Id
    private String id;
    private String name;
    private Date purchaseDate;
    private boolean working;
}
