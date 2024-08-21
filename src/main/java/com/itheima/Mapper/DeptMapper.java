package com.itheima.Mapper;

import com.itheima.pojo.Dept;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface DeptMapper {

//    @Select("select * from dept")

//    public List<Dept> select();
    List<Dept> findAll();

    void save(Dept dept);

    void change(Dept dept);
    void delete(Integer id);
}
