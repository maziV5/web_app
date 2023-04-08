package com.maziv5.controller;
/*
 * @author maziV5
 * @version 1.0
 */

import com.maziv5.domain.Link;
import com.maziv5.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/links")
public class LinkController {
    @Autowired
    private LinkService linkService;

    @PostMapping
    public Result reg(@RequestBody Link link){
        boolean flag = linkService.add(link);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result update(@RequestBody Link link) {
        boolean flag =  linkService.update(link);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR,flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag =  linkService.delete(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Link link = linkService.getById(id);
        Integer code = link != null ? Code.GET_OK : Code.GET_ERR;
        String msg = link != null ? null : "查询失败!";
        return new Result(code,link,msg);
    }

    @GetMapping
    public Result getAll() {
        List<Link> linkList = linkService.getAll();
        Integer code = linkList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = linkList != null ? null : "查询失败!";
        return new Result(code,linkList,msg);
    }
}
