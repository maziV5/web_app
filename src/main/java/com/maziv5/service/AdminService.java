package com.maziv5.service;
/*
 * @author maziV5
 * @version 1.0
 */

import com.maziv5.domain.Admin;
import com.maziv5.domain.Link;

import java.util.List;

public interface AdminService {
    public boolean add(Admin admin);
    public boolean update(Admin admin);
    public boolean delete(Integer id);
    public Admin getById(Integer id);
    public List<Admin> getAll();
    public Admin login(String admin_name,String password);
}
