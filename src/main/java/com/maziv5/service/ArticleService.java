package com.maziv5.service;
/*
 * @author maziV5
 * @version 1.0
 */

import com.maziv5.domain.Article;
import com.maziv5.domain.Link;

import java.util.List;

public interface ArticleService {
    public boolean add(Article article);
    public boolean update(Article article);
    public boolean delete(Integer id);
    public Article getById(Integer id);
    public List<Article> getAll();
}
