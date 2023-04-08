package com.maziv5.dao;
/*
 * @author maziV5
 * @version 1.0
 */

import com.maziv5.domain.Info;
import com.maziv5.domain.Link;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface InfoDao {
    @Insert("insert into info values(null,#{info_name},#{info_content})")
    public int add(Info info);

    @Update("update info set info_name=#{info_name},info_content=#{info_content} where info_id=#{info_id}")
    public int update(Info info);

    @Delete("delete from info where info_id=#{info_id}")
    public int delete(Integer id);

    @Select("select * from info where info_id=#{info_id}")
    public Info getById(Integer id);

    @Select("select * from info")
    public List<Info> getAll();
}
