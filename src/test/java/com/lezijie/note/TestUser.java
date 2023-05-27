package com.lezijie.note;

import comlezijie.note.dao.UserDao;
import comlezijie.note.po.User;
import org.junit.Test;

public class TestUser {
    @Test
    public void testQueryUserByName(){
        UserDao userDao=new UserDao();
        User user=userDao.queryUserByName("admin");
        System.out.println(user.getUpwd());
    }
}
