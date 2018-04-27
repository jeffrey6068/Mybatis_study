package MybatisDemo.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import MybatisDemo.po.Users;
import MybatisDemo.utils.MyBatisUtil;

public class TestTwoLevelCache {
	/*
	 * 测试二级缓存
	 * 
	 */
@Test
	public void testCache2() {
    String statement = "MybatisDemo.mapper.UsersMapper.getUser";//映射sql的标识字符串
    SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();	
    SqlSession openSession1 = sqlSessionFactory.openSession();
    SqlSession openSession2 = sqlSessionFactory.openSession();
    Users users = openSession1.selectOne(statement, 1);
    //openSession1.commit();
    System.out.println("users="+users);
    users = openSession2.selectOne(statement, 1);
    System.out.println("users="+users);}
}
