package com.qnd.pithyblog.service;

import com.qnd.pithyblog.dao.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryMapper mapper;
    public int getCategoryNum(){
        return mapper.selectCategoryNum();
    }
    public List getCategory(int index){
        return mapper.selectCategory(index);
    }
    public void getinsertCategory(String name){ mapper.insertCategory(name);}
    public void getupdateCategory(String name){ mapper.updateCategory(name);}
    public void getdeleteCategory(String name){ mapper.deleteCategory(name);}
}
