package com.maziv5.service.impl;
/*
 * @author maziV5
 * @version 1.0
 */

import com.maziv5.dao.AdminDao;
import com.maziv5.domain.Admin;
import com.maziv5.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;

    @Override
    public boolean add(Admin admin) {
        return adminDao.add(admin) > 0;
    }

    @Override
    public boolean update(Admin admin) {
        return adminDao.update(admin) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return adminDao.delete(id) > 0;
    }

    @Override
    public Admin getById(Integer id) {
        return adminDao.getById(id);
    }

    @Override
    public List<Admin> getAll() {
        return adminDao.getAll();
    }

    @Override
    public Admin login(String admin_name, String password) {
        return adminDao.login(admin_name,password);
    }
}
