package com.classification.mapper;

import com.classification.dataobject.Api;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ApiMapper {

    @Select("select * from api")
    List<Api> findAll();

    @Select("select * from api where label = #{label}")
    List<Api> findByLabel(String label);
}
