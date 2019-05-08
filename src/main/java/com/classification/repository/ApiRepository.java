package com.classification.repository;

import com.classification.dataobject.Api;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApiRepository extends JpaRepository<Api,Integer> {

}
