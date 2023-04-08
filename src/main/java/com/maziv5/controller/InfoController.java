package com.maziv5.controller;
/*
 * @author maziV5
 * @version 1.0
 */

import com.maziv5.domain.Info;
import com.maziv5.domain.Link;
import com.maziv5.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/infos")
public class InfoController {
    @Autowired
    private InfoService infoService;

    @PostMapping
    public Result add(Info info){
        boolean flag = infoService.add(info);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result update(@RequestBody Info info) {
        boolean flag =  infoService.update(info);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR,flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag =  infoService.delete(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Info info = infoService.getById(id);
        Integer code = info != null ? Code.GET_OK : Code.GET_ERR;
        String msg = info != null ? null : "info!";
        return new Result(code,info,msg);
    }

    @GetMapping
    public Result getAll() {
        List<Info> infoListList = infoService.getAll();
        Integer code = infoListList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = infoListList != null ? null : "查询失败!";
        return new Result(code,infoListList,msg);
    }
}
