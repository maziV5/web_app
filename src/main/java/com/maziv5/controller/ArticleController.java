package com.maziv5.controller;
/*
 * @author maziV5
 * @version 1.0
 */

import com.maziv5.domain.Article;
import com.maziv5.domain.Link;
import com.maziv5.service.ArticleService;
import com.maziv5.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/articles")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @PostMapping
    public Result reg(@RequestBody Article article){
        boolean flag = articleService.add(article);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result update(@RequestBody Article article) {
        boolean flag =  articleService.update(article);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR,flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag =  articleService.delete(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Article article = articleService.getById(id);
        Integer code = article != null ? Code.GET_OK : Code.GET_ERR;
        String msg = article != null ? null : "查询失败!";
        return new Result(code,article,msg);
    }

    @GetMapping
    public Result getAll() {
        List<Article> articleListList = articleService.getAll();
        Integer code = articleListList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = articleListList != null ? null : "查询失败!";
        return new Result(code,articleListList,msg);
    }
}
