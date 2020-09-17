//package com.neusoft.test;
//
//import com.neusoft.dao.IUserDao;
//import com.neusoft.domain.User;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Date;
//import java.util.List;
//
//public class MybatisTest1
//{
//    private InputStream in;
//    private SqlSession sqlSession;
//    private IUserDao userDao;
//
//    // 在测试方法之前执行
//    @Before
//    public void init() throws IOException
//    {
//        // 1. 读取配置文件
//        in = Resources.getResourceAsStream("SqlMapConfig.xml");
//        // 2. 创建 SqlSessionFactory工厂
//        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//        SqlSessionFactory factory = builder.build(in);
//        // 3. 使用 工厂生产的 SqlSession对象
//        sqlSession = factory.openSession();
//        // 4. 使用SqlSession 创建Dao 接口 的代理对象
//        userDao = sqlSession.getMapper(IUserDao.class);
//    }
//
//    @After
//    public void destroy() throws IOException
//    {
//        // 提交事物
//        sqlSession.commit();
//        sqlSession.close();
//        in.close();
//    }
//
//    @Test
//    public void testFindAll()
//    {
//        List<User> users = userDao.findAll();
//        for (User user : users)
//        {
//            System.out.println(user);
//        }
//    }
//
//    @Test
//    public void testFindOne()
//    {
//        User user = userDao.findById(45);
//        System.out.println(user);
//
//    }
//
//    @Test
//    public void testSave()
//    {
//        User user = new User();
//        user.setUsername("李海");
//        user.setBirthday(new Date());
//        user.setSex("男");
//        user.setAdress("sddsd");
//
//        System.out.println(user);
//        int i = userDao.saveUser(user);
//        System.out.println(i);
//        System.out.println(user);
//    }
//
//    @Test
//    public void  testUpdate(){
//        User user = new User();
//        user.setUsername("李bai");
//        user.setId(49);
//        user.setBirthday(new Date());
//        user.setSex("男");
//        user.setAdress("sddsd");
//
//        System.out.println(user);
//        int i = userDao.updateUser(user);
//        System.out.println(i);
//        System.out.println(user);
//    }
//    @Test
//    public void testDelete(){
//        int i = userDao.deleteUser(49);
//        System.out.println(i);
//    }
//
//    @Test
//    public void testLike(){
//        List<User> users = userDao.findByName("%李%");
//        System.out.println(users);
//    }
//
//    @Test
//    public void testTotal(){
//        int total = userDao.findTotal();
//        System.out.println(total);
//    }
//}
