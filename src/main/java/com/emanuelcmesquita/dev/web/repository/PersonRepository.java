package com.emanuelcmesquita.dev.web.repository;

import com.emanuelcmesquita.dev.web.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
