package com.influencer.service;

import com.influencer.model.Category;
import com.influencer.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public Category getCategory() {
        return categoryRepository.getCatagory(1);
    }
}
