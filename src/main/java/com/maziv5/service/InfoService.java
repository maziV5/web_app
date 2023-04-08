package com.maziv5.service;
/*
 * @author maziV5
 * @version 1.0
 */

import com.maziv5.domain.Info;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface InfoService {

    public boolean add(Info info);

    public boolean update(Info info);

    public boolean delete(Integer id);

    public Info getById(Integer id);

    public List<Info> getAll();
}
