package com.qnd.pithyblog.service;

import com.qnd.pithyblog.dao.LabelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelService {
    @Autowired
    LabelMapper mapper;
    public List getAllLabel(){
        return mapper.selectAllLabel();
    }
    public void getinsertLabel(String name){ mapper.insertLabel(name);}
    public void getupdateLabel(String name){ mapper.updateLabel(name);}
    public void getdeleteLabel(String name){ mapper.deleteLabel(name);}
}
