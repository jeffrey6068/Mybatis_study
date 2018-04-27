package MybatisDemo.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import MybatisDemo.domain.Classes;
import MybatisDemo.utils.MyBatisUtil;

public class Test2 {
@Test
public void testGetClass() {
	SqlSession sqlSession = MyBatisUtil.getSqlSession();
    /**
     * 映射sql的标识字符串，
     * me.gacl.mapping.classMapper是classMapper.xml文件中mapper标签的namespace属性的值，
     * getClass是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
     */
    String statement = "MybatisDemo.mapper.classMapper.getClass";//映射sql的标识字符串
    Classes classes = sqlSession.selectOne(statement,1);
    sqlSession.close();
    System.out.println(classes);
    
}
@Test
public void testGetClass2() {
	SqlSession sqlSession = MyBatisUtil.getSqlSession();
    /**
     * 映射sql的标识字符串，
     * me.gacl.mapping.classMapper是classMapper.xml文件中mapper标签的namespace属性的值，
     * getClass是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
     */
    String statement = "MybatisDemo.mapper.classMapper.getClass2";//映射sql的标识字符串
    Classes classes = sqlSession.selectOne(statement,2);
    sqlSession.close();
    System.out.println(classes);
     
}
}
