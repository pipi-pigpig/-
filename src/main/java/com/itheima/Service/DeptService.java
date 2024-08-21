package com.itheima.Service;


import com.itheima.pojo.Dept;

import java.util.List;

//接口里面用来写方法
public interface DeptService {
    //查看部门

    List<Dept> getAllDepts();
     String updateAllDepts( Dept dept);

    String updateUsers(Dept dept);

    String deleteUsers(Integer id);

}
