package com.nf147.petstore.dao;

import com.nf147.petstore.entity.Category;
import java.util.List;

public interface CategoryMapper {
    int deleteByPrimaryKey(Integer caId);

    int insert(Category record);

    Category selectByPrimaryKey(Integer caId);

    List<Category> selectAll();

    int updateByPrimaryKey(Category record);
}