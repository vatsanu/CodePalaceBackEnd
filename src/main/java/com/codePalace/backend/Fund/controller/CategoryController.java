package com.codePalace.backend.Fund.controller;

import com.codePalace.backend.Fund.model.Category;
import com.codePalace.backend.Fund.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;
    @RequestMapping(value = "category",method = RequestMethod.GET)
    public List<Category> getCategories(){

        return (List<Category>) categoryRepository.findAll();
    }
}
