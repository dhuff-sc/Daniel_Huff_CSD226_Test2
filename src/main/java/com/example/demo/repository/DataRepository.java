package com.example.demo.repository;

import com.example.demo.model.DataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DataRepository extends JpaRepository<DataEntity, Integer> {

    Optional<DataEntity> findByIntValue(int intValue);
}
