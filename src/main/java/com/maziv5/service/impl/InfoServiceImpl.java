package com.maziv5.service.impl;
/*
 * @author maziV5
 * @version 1.0
 */

import com.maziv5.dao.InfoDao;
import com.maziv5.domain.Info;
import com.maziv5.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoServiceImpl implements InfoService {
    @Autowired
    private InfoDao infoDao;

    @Override
    public boolean add(Info info) {
        return infoDao.add(info) > 0;
    }

    @Override
    public boolean update(Info info) {
        return infoDao.update(info) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return infoDao.delete(id) > 0;
    }

    @Override
    public Info getById(Integer id) {
        return infoDao.getById(id);
    }

    @Override
    public List<Info> getAll() {
        return infoDao.getAll();
    }
}
