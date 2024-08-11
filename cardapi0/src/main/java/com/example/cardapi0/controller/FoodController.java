package com.example.cardapi0.controller;

import com.example.cardapi0.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("food")

/*
Criado para conectar com o Banco de Dados.
 */
public class FoodController {
    @Autowired
    private FoodRepository repository;


    @GetMapping
    public <foodList> List<foodList> getAll(){

        List<foodList> foodList = (List<foodList>) repository.findAll();



        return foodList;
    }
}
