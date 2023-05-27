package com.lezijie.note;

import comlezijie.note.dao.UserDao;
import comlezijie.note.po.User;
import comlezijie.note.service.UserService;
import comlezijie.note.util.DBUtil;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


import static comlezijie.note.util.DBUtil.getConnection;

/**

 * 单元测试方法
 * 1.方法的返回值建议使用void，一般没有返回值
 * 2.参数列表，建议空参，一般没有参数
 * 3. 方法上需要设置@Test注解
 * 4.每个方法独立运行
 */
public class TestDB {
//    使用工厂日志类   记录日志
    private Logger logger=LoggerFactory.getLogger(TestDB.class);
// 单元测试 数据库连接
    @Test
    public void testDB(){
        System.out.println(getConnection());
        //使用日志
        logger.info("获取数据库连接："+ DBUtil.getConnection());
        // 记录日志
        logger.info("在"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"时，获取数据库连接");
       UserDao userDao=new UserDao();
        User user = userDao.queryUserByName02("admin");
        logger.info(user.getUpwd());



    }


}
