package com.giulianabezerra.demo_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giulianabezerra.demo_springboot.entities.Demo;

public interface DemoRepository extends JpaRepository <Demo, Long> {

}
