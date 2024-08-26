package com.itheima.Service;



import com.itheima.Mapper.UserMapper;
import com.itheima.pojo.User;
import com.itheima.pojo.model.MessageModel;
import com.itheima.util.GetSqlSession;
import com.itheima.util.StringUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


public class UserService {


    public static MessageModel userLogin(String uname, String upwd) throws IOException {
        MessageModel messageModel = new MessageModel();
        //回显数据
        User u = new User();
        u.setUsername(uname);
        u.setPassword(upwd);
        messageModel.setObject(u);

        if(StringUtil.isEmpty(uname) || StringUtil.isEmpty(upwd)){
            messageModel.setCode(0);
            messageModel.setMsg("用户姓名和密码不能为空！");

            return messageModel;
        }


        // 加载mybatis的核心配置文件，获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = GetSqlSession.getSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        //------------------------------  bug  ---------------------------------------------------
        User user = userMapper.selectUser(uname);


        if (user == null){
            messageModel.setCode(0);
            messageModel.setMsg("用户不存在！");
            return messageModel;
        }

        if (!upwd.equals(user.getPassword())){
            messageModel.setCode(0);
            messageModel.setMsg("用户密码不正确！");
            return messageModel;
        }

        messageModel.setObject(user);

        return messageModel;
    }
}







