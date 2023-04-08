package com.maziv5.controller;
/*
 * @author maziV5
 * @version 1.0
 */

import com.maziv5.domain.Admin;
import com.maziv5.domain.Link;
import com.maziv5.service.AdminService;
import com.maziv5.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
@RequestMapping("/admins")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping
    public Result reg(@RequestBody Admin admin){
        boolean flag = adminService.add(admin);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result update(@RequestBody Admin admin) {
        boolean flag =  adminService.update(admin);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR,flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag =  adminService.delete(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Admin admin = adminService.getById(id);
        Integer code = admin != null ? Code.GET_OK : Code.GET_ERR;
        String msg = admin != null ? null : "查询失败!";
        return new Result(code,admin,msg);
    }

    @GetMapping
    public Result getAll() {
        List<Admin> adminList = adminService.getAll();
        Integer code = adminList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = adminList != null ? null : "查询失败!";
        return new Result(code,adminList,msg);
    }

    @PostMapping("/login")
    public Result login(@RequestBody Admin admin, HttpServletRequest request){
        String checkCode = (String) request.getSession().getAttribute("CHECKCODE_SERVER");
        System.out.println(checkCode);
        System.out.println(admin);
        System.out.println(admin.getCheckCode());

        if (!(admin.getCheckCode().equals(checkCode))){
            return new Result(Code.LOGIN_ERR,null,"验证码错误");
        }else {
            Admin loginAdmin = adminService.login(admin.getAdmin_name(), admin.getPassword());
            Integer code = loginAdmin != null ? Code.LOGIN_OK : Code.LOGIN_ERR;
            String msg = loginAdmin != null ? null : "账号或密码错误";
            return new Result(code,loginAdmin,msg);
        }
    }
}
