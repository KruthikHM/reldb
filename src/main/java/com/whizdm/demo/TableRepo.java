package com.whizdm.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TableRepo extends JpaRepository<ReleaseTableEntity,Long>{
}
