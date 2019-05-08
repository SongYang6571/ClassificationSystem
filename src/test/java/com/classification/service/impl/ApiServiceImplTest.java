package com.classification.service.impl;

import com.classification.dataobject.Api;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {
    @Autowired
    private ApiServiceImpl apiService;
    @Test
    public void findAll() throws Exception{
        List<Api> apiList = apiService.findAll();
        Assert.assertNotEquals(0,apiList.size());
    }
}