package com.maziv5.dao;
/*
 * @author maziV5
 * @version 1.0
 */

import com.maziv5.domain.Admin;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface AdminDao {
    @Insert("insert into administrator values(null,#{admin_name},#{password},#{name})")
    public int add(Admin admin);

    @Update("update administrator set admin_name=#{admin_name},password=#{password},name=#{name} where admin_id=#{admin_id}")
    public int update(Admin admin);

    @Delete("delete from administrator where admin_id=#{admin_id}")
    public int delete(Integer id);

    @Select("select * from administrator where admin_id=#{admin_id}")
    public Admin getById(Integer id);

    @Select("select * from administrator")
    public List<Admin> getAll();

    @Select("select * from administrator where admin_name=#{admin_name} and password=#{password}")
    public Admin login(@Param("admin_name") String admin_name,@Param("password") String password);
}
