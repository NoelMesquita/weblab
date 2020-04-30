package com.emanuelcmesquita.dev.web.service;

import com.emanuelcmesquita.dev.web.domain.Department;
import com.emanuelcmesquita.dev.web.repository.DepartmentRepository;
import com.emanuelcmesquita.dev.web.service.dto.DepartmentDTO;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public DepartmentDTO getDepartmentById(Long id) throws NotFoundException {
        Optional<Department> department = departmentRepository.findById(id);

        if (!department.isPresent()) {
            throw new NotFoundException("Departamento não existe!");
        }

        return new DepartmentDTO(department.get());
    }

    public List<DepartmentDTO> getDepartments(){
        return new ArrayList<DepartmentDTO>(DepartmentDTO.converter(departmentRepository.findAll()));
    }

}
