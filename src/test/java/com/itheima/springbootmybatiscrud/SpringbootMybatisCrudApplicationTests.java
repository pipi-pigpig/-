package com.itheima.springbootmybatiscrud;

import com.itheima.Mapper.DeptMapper;
import com.itheima.Mapper.EmpMapper;
import com.itheima.pojo.Dept;
import com.itheima.pojo.Emp;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
@Slf4j
class SpringbootMybatisCrudApplicationTests {

    @Autowired//注入
    private EmpMapper empMapper;
    @Autowired//注入
    private DeptMapper deptMapper;

    @Test
    public void testDelete() {
        empMapper.delete(17);
    }

    @Test
    public void testInsert() {
        Emp emp = new Emp();
        emp.setUsername("可怜的Tom");
        emp.setName("汤姆");
        emp.setImage("1.jpg");
        emp.setGender((short) 1);
        emp.setJob((short) 1);
        emp.setEntrydate(LocalDate.of(2005,2,4));
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        emp.getDeptId();

        empMapper.insert(emp);
    }

    @Test
    public void testList(){
        List<Emp> list = empMapper.list("张",(short)1,LocalDate.of(2010,1,1),LocalDate.of(2020,1,1) );
        System.out.println(list);
    }


    @Test
    public void getAllDepts() {


        List<Dept> departments = deptMapper.findAll();
        log.info("找到了");
        System.out.println(departments);
        //return departments; // 调用 Mapper 的方法
    }
}
