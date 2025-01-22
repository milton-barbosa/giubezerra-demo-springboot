package com.giulianabezerra.demo_springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giulianabezerra.demo_springboot.dtos.DemoDTO;
import com.giulianabezerra.demo_springboot.services.DemoService;

@RestController
@RequestMapping("/demo")
public class DemoController {
    
    @Autowired
    private DemoService demoService;

    @GetMapping("/{id}")
    public DemoDTO getDemo(@PathVariable("id") Long id) {
        return demoService.getDemo(id);
    }

    @GetMapping
    public List<DemoDTO> getAllDemo(){
        return demoService.getAllDemo();
    }
}
