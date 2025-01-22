package com.giulianabezerra.demo_springboot.dtos;

import com.giulianabezerra.demo_springboot.entities.Demo;

public class DemoDTO {
    private Long id;
    private String descricao;

    public DemoDTO() {
    }

    public DemoDTO(Demo demo) {
        this.id = demo.getId();
        this.descricao = demo.getDescricao();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
