package com.maziv5.service;
/*
 * @author maziV5
 * @version 1.0
 */

import com.maziv5.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserService {
    public boolean reg(User user);
    public boolean update(User user);
    public boolean delete(Integer id);
    public User getById(Integer id);
    public List<User> getAll();
    public User login(String user_name,String password);
    public User register(String user_name);
    public User getByUsername(String user_name);

}
