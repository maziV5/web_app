package com.maziv5.dao;
/*
 * @author maziV5
 * @version 1.0
 */

import com.maziv5.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserDao {

    @Insert("insert into user values(null,#{user_name},#{password},#{name},#{regtime},#{user_gender},#{user_phone},#{user_qq},#{user_email},#{user_address},#{lasttime})")
    public int reg(User user);

    @Update("update user set user_name=#{user_name},password=#{password},name=#{name},regtime=#{regtime},user_gender=#{user_gender},user_phone=#{user_phone},user_qq=#{user_qq},user_email=#{user_email},user_address=#{user_address},lasttime=#{lasttime} where user_id=#{user_id}")
    public int update(User user);

    @Delete("delete from user where user_id=#{user_id}")
    public int delete(Integer id);

    @Select("select * from user where user_id=#{user_id}")
    public User getById(Integer id);

    @Select("select * from user")
    public List<User> getAll();

    @Select("select * from user where user_name=#{user_name} and password=#{password}")
    public User login(@Param("user_name") String user_name,@Param("password") String password);

    @Select("select * from user where user_name=#{user_name}")
    public User register(String user_name);

    @Select("select * from user where user_name=#{user_name}")
    public User getByUsername(String user_name);
}
