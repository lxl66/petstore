package com.nf147.petstore.dao;

import com.nf147.petstore.entity.Orders;
import java.util.List;

public interface OrdersMapper {
    int deleteByPrimaryKey(Integer orId);

    int insert(Orders record);

    Orders selectByPrimaryKey(Integer orId);

    List<Orders> selectAll();

    int updateByPrimaryKey(Orders record);
}