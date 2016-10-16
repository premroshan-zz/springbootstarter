package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.Journal;

public interface JournalRepository extends JpaRepository<Journal,Long> {
	
}
