package MybatisDemo.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import MybatisDemo.mapper.UserMapper;
import MybatisDemo.po.Users;
import MybatisDemo.utils.MyBatisUtil;

public class TestCRUDByXmlMapper {
//@Test
public void testDelete() {
	SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
/*	UserMapper mapper = sqlSession.getMapper(UserMapper.class);
	Users users = new Users();
	users.setId(3);*/
 String statement ="MybatisDemo.mapper.UsersMapper.deleteUser";
 //执行删除操作
 int retResult = sqlSession.delete(statement,1);
 //使用SqlSession执行完SQL之后需要关闭SqlSession
 sqlSession.close();
 System.out.println(retResult);
}
@Test
public void testUpdate(){
    SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
    /**
     * 映射sql的标识字符串，
     * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
     * updateUser是update标签的id属性值，通过update标签的id属性值就可以找到要执行的SQL
     */
    String statement = "MybatisDemo.mapper.UsersMapper.updateUser";//映射sql的标识字符串
    Users users = new Users();
    users.setId(3);
    users.setName("孤傲苍狼");
    users.setAge(25);
    //执行修改操作
    int retResult = sqlSession.update(statement,users);
    //使用SqlSession执行完SQL之后需要关闭SqlSession
    sqlSession.close();
    System.out.println(retResult);
}

}
