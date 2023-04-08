package com.maziv5.dao;
/*
 * @author maziV5
 * @version 1.0
 */

import com.maziv5.domain.Link;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface LinkDao {
    @Insert("insert into links values(null,#{link_name},#{link_url},#{link_desc})")
    public int add(Link link);

    @Update("update links set link_name=#{link_name},link_url=#{link_url},link_desc=#{link_desc} where link_id=#{link_id}")
    public int update(Link link);

    @Delete("delete from links where link_id=#{link_id}")
    public int delete(Integer id);

    @Select("select * from links where link_id=#{link_id}")
    public Link getById(Integer id);

    @Select("select * from links")
    public List<Link> getAll();
}
