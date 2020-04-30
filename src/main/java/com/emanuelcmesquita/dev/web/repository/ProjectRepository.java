package com.emanuelcmesquita.dev.web.repository;

import com.emanuelcmesquita.dev.web.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
