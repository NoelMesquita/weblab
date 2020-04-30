package com.emanuelcmesquita.dev.web.repository;

import com.emanuelcmesquita.dev.web.domain.ProjectHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectHistoryRepository extends JpaRepository<ProjectHistory, Long> {
}
