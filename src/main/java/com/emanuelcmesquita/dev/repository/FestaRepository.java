package com.emanuelcmesquita.dev.repository;

import com.emanuelcmesquita.dev.domain.Festa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FestaRepository extends JpaRepository<Festa, Integer> {
}
