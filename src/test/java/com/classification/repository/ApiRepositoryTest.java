package com.classification.repository;

import com.classification.dataobject.Api;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiRepositoryTest {
    @Autowired
    private  ApiRepository repository;

    @Test
    public void findByIdTest(){
        Optional<Api> api = repository.findById(1);
        System.out.println(api.toString());
    }

    @Test
    public void saveTest(){
        Api api = new Api("new",11111,"test test test");
        repository.save(api);
    }
}