package com.whizdm.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotfixRepository extends JpaRepository<hotfix_entity,Long> {
}
