package MybatisDemo.mapper;

import org.apache.ibatis.annotations.Insert;

import MybatisDemo.po.Users;

public interface UsersMapperI {
	@Insert("insert into users(name,age) values(#{name},#{age})")
	public int add(Users users);
}
