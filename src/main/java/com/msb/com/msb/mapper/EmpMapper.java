package com.msb.com.msb.mapper;


import com.msb.com.msb.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface EmpMapper {

    List<Emp> findAll();

    int removeEmp(Integer empno, String ename);
}
