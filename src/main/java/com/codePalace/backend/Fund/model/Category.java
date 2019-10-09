package com.codePalace.backend.Fund.model;

import org.springframework.data.annotation.Id;

public class Category {

    @Id
    String categoryId;
    String categoryName;

    public Category() {
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
