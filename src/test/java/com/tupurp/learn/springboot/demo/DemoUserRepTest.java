package com.tupurp.learn.springboot.demo;

import com.tupurp.learn.springboot.demo.dao.UserRep;
import com.tupurp.learn.springboot.demo.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class DemoUserRepTest {

    @Autowired
    private UserRep userRep;
    @Test
    public void test()throws Exception{
        //userRep.save(new User(1L,"张三","zhangsan@qq.com","15305161111","pass"));
        //userRep.save(new User(2L,"李四","lisi@qq.com","15305162222","pass"));

       // Assert.assertEquals(2,userRep.findAll().size());


    }
}
