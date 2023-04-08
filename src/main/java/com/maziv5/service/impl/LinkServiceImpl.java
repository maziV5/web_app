package com.maziv5.service.impl;
/*
 * @author maziV5
 * @version 1.0
 */

import com.maziv5.dao.LinkDao;
import com.maziv5.domain.Link;
import com.maziv5.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkServiceImpl implements LinkService {
    @Autowired
    private LinkDao linkDao;

    @Override
    public boolean add(Link link) {
        return linkDao.add(link) > 0;
    }

    @Override
    public boolean update(Link link) {
        return linkDao.update(link) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return linkDao.delete(id) > 0;
    }

    @Override
    public Link getById(Integer id) {
        return linkDao.getById(id);
    }

    @Override
    public List<Link> getAll() {
        return linkDao.getAll();
    }
}
