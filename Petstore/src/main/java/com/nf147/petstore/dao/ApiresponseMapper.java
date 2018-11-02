package com.nf147.petstore.dao;

import com.nf147.petstore.entity.Apiresponse;
import java.util.List;

public interface ApiresponseMapper {
    int deleteByPrimaryKey(Integer apCode);

    int insert(Apiresponse record);

    Apiresponse selectByPrimaryKey(Integer apCode);

    List<Apiresponse> selectAll();

    int updateByPrimaryKey(Apiresponse record);
}