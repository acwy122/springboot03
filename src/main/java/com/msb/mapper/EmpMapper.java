package com.msb.mapper;


import com.msb.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface EmpMapper {

    List<Emp> findAll();

    int removeEmp(Integer empno, String ename);
}
