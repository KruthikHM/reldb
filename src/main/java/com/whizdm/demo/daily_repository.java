package com.whizdm.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface daily_repository extends JpaRepository<daily_table,Long> {
    @Query(value = "SELECT * FROM daily_table " , nativeQuery = true)
    List<daily_table> findfulldata();

    @Query(value = "SELECT release_status FROM daily_table",nativeQuery = true)
    List<Object> finddata();
}
