package com.maziv5.service.impl;
/*
 * @author maziV5
 * @version 1.0
 */

import com.maziv5.dao.ArticleDao;
import com.maziv5.dao.LinkDao;
import com.maziv5.domain.Article;
import com.maziv5.domain.Link;
import com.maziv5.service.ArticleService;
import com.maziv5.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleDao articleDao;


    @Override
    public boolean add(Article article) {
        return articleDao.add(article) > 0;
    }

    @Override
    public boolean update(Article article) {
        return articleDao.update(article) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return articleDao.delete(id) > 0;
    }

    @Override
    public Article getById(Integer id) {
        return articleDao.getById(id);
    }

    @Override
    public List<Article> getAll() {
        return articleDao.getAll();
    }
}
