package com.classification.service.impl;

import com.classification.dataobject.Api;
import com.classification.repository.ApiRepository;
import com.classification.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    @Autowired
    private ApiRepository repository;

    @Override
    public List<Api> findAll() {
        return repository.findAll();
    }
}
