package com.sakashita.nameapp;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NameMapper {

    @Select("SELECT * FROM names")
    List<Name> findAll();

    @Select("SELECT * FROM names WHERE name LIKE CONCAT(#{startsWith}, '%')")
    List<Name> findByNameStartsWith(String startsWith);
}
