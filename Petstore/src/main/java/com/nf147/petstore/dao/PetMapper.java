package com.nf147.petstore.dao;

import com.nf147.petstore.entity.Pet;
import java.util.List;

public interface PetMapper {
    int deleteByPrimaryKey(int caId);

    int insert(Pet pet);

    Pet selectByPrimaryKey(Integer petId);

    List<Pet> selectAll();

    int updateByPrimaryKey(Pet record);
}