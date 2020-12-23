package com.qnd.pithyblog.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LabelMapper {
    List selectAllLabel();
    void insertLabel(String name);
    void updateLabel(String name);
    void deleteLabel(String name);
}
