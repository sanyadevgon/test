package com.example.sanya;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Dummy,Long> {
}
