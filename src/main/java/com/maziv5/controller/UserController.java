package com.maziv5.controller;
/*
 * @author maziV5
 * @version 1.0
 */

import com.maziv5.domain.User;
import com.maziv5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public Result reg(@RequestBody User user){
        boolean flag = userService.reg(user);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result update(@RequestBody User user) {
        boolean flag =  userService.update(user);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR,flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag =  userService.delete(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        User user = userService.getById(id);
        Integer code = user != null ? Code.GET_OK : Code.GET_ERR;
        String msg = user != null ? null : "查询失败!";
        return new Result(code,user,msg);
    }

    @GetMapping
    public Result getAll() {
        List<User> userList = userService.getAll();
        Integer code = userList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = userList != null ? null : "查询失败!";
        return new Result(code,userList,msg);
    }
    
    @PostMapping("/login")
    public Result login(@RequestBody User user,HttpServletRequest request){
        String checkCode = (String) request.getSession().getAttribute("CHECKCODE_SERVER");
        if (!(user.getCheckCode().equals(checkCode))){
            return new Result(Code.LOGIN_ERR,null,"验证码错误");
        }else {
            User loginUser = userService.login(user.getUser_name(), user.getPassword());
            Integer code = loginUser != null ? Code.LOGIN_OK : Code.LOGIN_ERR;
            String msg = loginUser != null ? null : "用户名或密码错误";
            return new Result(code,loginUser,msg);
        }
    }

    @PostMapping("/register")
    public Result register(@RequestBody User user, HttpServletRequest request){
        String checkCode = (String) request.getSession().getAttribute("CHECKCODE_SERVER");
        if (!(user.getCheckCode().equals(checkCode))){
            return new Result(Code.REGISTER_ERR,null,"验证码错误");
        }else {
            User registerUser = userService.register(user.getUser_name());
            if (registerUser != null){
                return new Result(Code.REGISTER_ERR,null,"该用户名已存在");
            }else {
                return this.reg(user);
            }
        }

    }

    @GetMapping("/userEdit/{user_name}")
    public Result getByUsername(@PathVariable String user_name){
        User editUser = userService.getByUsername(user_name);
        return new Result(Code.GET_OK,editUser);
    }
}
