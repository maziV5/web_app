package com.maziv5.dao;
/*
 * @author maziV5
 * @version 1.0
 */

import com.fasterxml.jackson.annotation.JsonFormat;
import com.maziv5.domain.Article;
import com.maziv5.domain.Link;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Date;
import java.util.List;

public interface ArticleDao {
    @Insert("insert into article values(null,#{art_sid},#{art_title},#{art_type},#{art_content},#{art_author},#{art_addtime},#{art_source})")
    public int add(Article article);

    @Update("update article set art_sid=#{art_sid},art_title=#{art_title},art_type=#{art_type},art_content=#{art_content},art_author=#{art_author},art_addtime=#{art_addtime},art_source=#{art_source} where art_id=#{art_id}")
    public int update(Article article);

    @Delete("delete from article where art_id=#{art_id}")
    public int delete(Integer id);

    @Select("select * from article where art_id=#{art_id}")
    public Article getById(Integer id);

    @Select("select * from article")
    public List<Article> getAll();
}
