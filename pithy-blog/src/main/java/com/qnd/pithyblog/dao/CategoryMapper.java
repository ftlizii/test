package com.qnd.pithyblog.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CategoryMapper {
    int selectCategoryNum();
    List selectCategory(int index);
    void insertCategory(String name);
    void updateCategory(String name);
    void deleteCategory(String name);
}
