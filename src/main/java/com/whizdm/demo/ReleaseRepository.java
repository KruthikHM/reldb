package com.whizdm.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ReleaseRepository extends JpaRepository<ReleaseTableEntity,Long>{

    @Query(value = "select * from ReleaseTableEntity where empID = ?", nativeQuery = true)
    public ReleaseTableEntity findallData();
}
