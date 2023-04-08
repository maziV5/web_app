package com.maziv5.service;
/*
 * @author maziV5
 * @version 1.0
 */

import com.maziv5.domain.Link;

import java.util.List;

public interface LinkService {
    public boolean add(Link link);
    public boolean update(Link link);
    public boolean delete(Integer id);
    public Link getById(Integer id);
    public List<Link> getAll();
}
