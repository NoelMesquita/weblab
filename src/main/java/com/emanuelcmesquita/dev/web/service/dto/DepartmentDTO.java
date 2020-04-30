package com.emanuelcmesquita.dev.web.service.dto;

import com.emanuelcmesquita.dev.web.domain.Department;
import com.emanuelcmesquita.dev.web.domain.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DepartmentDTO {

    private Long id;
    private String nomeDepartamento;
    private List<Person> pessoas = new ArrayList<Person>();

    public DepartmentDTO(Department department) {
        this.id = department.getId();
        this.nomeDepartamento = department.getDepartmentName();
        this.pessoas = department.getPessoas();
    }

    public Long getId() {
        return id;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public List<Person> getPessoas() {
        return pessoas;
    }

    public static List<DepartmentDTO> converter(List<Department> departments) {
        return departments.stream().map(DepartmentDTO::new).collect(Collectors.toList());
    }


}
