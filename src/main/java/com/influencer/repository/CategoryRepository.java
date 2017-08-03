package com.influencer.repository;

import com.influencer.model.Category;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CategoryRepository extends SqlSessionDaoSupport {
    private static String QUERY_PREFIX = "category.";

    public Category getCatagory(long categoryId) {
        Map<String, Object> params = new HashMap<>();
        params.put("categoryId", categoryId);
        Category category = this.getSqlSession().selectOne(QUERY_PREFIX + "selectCategory", params);
        return category;
    }

}
