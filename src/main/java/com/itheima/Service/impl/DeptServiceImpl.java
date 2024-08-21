package com.itheima.Service.impl;


import com.itheima.Mapper.DeptMapper;
import com.itheima.Service.DeptService;
import com.itheima.pojo.Dept;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service

public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;


//    public List<Dept> findAll() {
////        List<Dept> departments =deptMapper.select();
////        log.info("找到了");
////       System.out.println(departments);
//       List<Dept> departments = new ArrayList<>();
//       // 假设从数据库提取数据并填充到 departments 列表中
//       log.info("找到了");
//       System.out.println(departments);
//       return departments;
 @Override
   public List<Dept> getAllDepts() {


       List<Dept> departments = deptMapper.findAll();
       log.info("查询到了");
       System.out.println(departments);
       return departments; // 调用 Mapper 的方法
   }

   public  String updateAllDepts( Dept dept) {
       deptMapper.save(dept);
       log.info("成功插入");
       return "success";
   }

    public  String updateUsers( Dept dept) {
        deptMapper.change(dept);
        log.info("成功删除");
        return "success";
    }

    public  String deleteUsers( Integer id) {
        deptMapper.delete(id);
        log.info("成功删除");
        return "success";
    }
}
