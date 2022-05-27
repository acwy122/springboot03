package com.msb.com.msb.service.impl;


import com.msb.com.msb.mapper.EmpMapper;
import com.msb.com.msb.pojo.Emp;
import com.msb.com.msb.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Override
    public List<Emp> findAll() {
        return empMapper.findAll();
    }

    @Override
    public boolean removeEmp(Integer empno, String ename) {
        return empMapper.removeEmp(empno,ename)>0;
    }

}
