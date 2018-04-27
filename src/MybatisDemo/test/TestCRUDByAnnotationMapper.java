package MybatisDemo.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import MybatisDemo.mapper.UserMapper;
import MybatisDemo.mapper.UsersMapperI;
import MybatisDemo.po.Users;
import MybatisDemo.utils.MyBatisUtil;

public class TestCRUDByAnnotationMapper {
@Test
public void testadd() {
	SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
	UsersMapperI mapper = sqlSession.getMapper(UsersMapperI.class);
	Users users = new Users();
	users.setName("关振辉");
	users.setAge(20);
	int add = mapper.add(users);

 //使用SqlSession执行完SQL之后需要关闭SqlSession
 sqlSession.close();
 System.out.println(add);
}


}
