package com.giulianabezerra.demo_springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giulianabezerra.demo_springboot.dtos.DemoDTO;
import com.giulianabezerra.demo_springboot.entities.Demo;
import com.giulianabezerra.demo_springboot.repositories.DemoRepository;

@Service
public class DemoService {
    @Autowired
    private DemoRepository demoRepository;

    public List<DemoDTO> getAllDemo(){
        List<Demo> list = demoRepository.findAll();
        return (List<DemoDTO>) list.stream().map(demo -> new DemoDTO(demo)).toList();    
    }

    public DemoDTO getDemo(Long id){
        Optional<Demo> demo = demoRepository.findById(id);
        DemoDTO demoDTO = null;
        if (demo != null && !demo.isEmpty()) demoDTO = new DemoDTO(demo.get());
        return demoDTO;
    }
}
