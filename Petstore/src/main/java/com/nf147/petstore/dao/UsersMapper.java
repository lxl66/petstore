package com.nf147.petstore.dao;

import com.nf147.petstore.entity.Users;
import java.util.List;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer uId);
    int deleteByName(String userName);

    int insert(Users record);

    Users selectByPrimaryKey(Integer uId);

    List<Users> selectAll();

    int updateByPrimaryKey(Users record);

    Users getByName(String userName);
}