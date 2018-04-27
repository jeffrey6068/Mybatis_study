package MybatisDemo.test;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import MybatisDemo.utils.MyBatisUtil;

public class TestProcedure {
	@Test
	public void testGetUserCoun() {
		// TODO Auto-generated method stub
		SqlSession sqlSession = MyBatisUtil.getSqlSession();
		 String statement = "MybatisDemo.mapper.UsersMapper.getUsersCount";//映射sql的标识字符串
		 Map<String, Integer> parameterMap = new HashMap<String, Integer>();
	        parameterMap.put("sexid", 1);
	        parameterMap.put("userscount", -1);
	        sqlSession.selectOne(statement, parameterMap);
	        Integer result = parameterMap.get("userscount");
	        System.out.println(result);
	        sqlSession.close();
	}

}
