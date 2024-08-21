package com.itheima.Mapper;


import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;

@Mapper//自动放入ioc容器
public interface EmpMapper {

    @Delete("delete  from emp where id=${id} ")
    public void delete(Integer id);

    @Options(keyProperty = "id", useGeneratedKeys = true)
    @Insert("insert into emp(username,  name, gender, image, job, entrydate, dept_id, create_time, update_time) " +
            "values (#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
    public void insert(Emp emp);

    @Select("select * from emp where name like concat('%',#{name},'%') and  gender=#{gender} " +
            "and entrydate between #{begin} and  #{end}")
    public List<Emp> list(String name, short gender, LocalDate begin, LocalDate end);




}
