package com.emanuelcmesquita.dev.web.service;

import com.emanuelcmesquita.dev.web.domain.Project;
import com.emanuelcmesquita.dev.web.repository.ProjectRepository;
import com.emanuelcmesquita.dev.web.service.dto.ProjectDTO;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public ProjectDTO getProjectById(Long id) throws NotFoundException {
        Optional<Project> project = projectRepository.findById(id);

        if (!((Optional) project).isPresent()) {
            throw new NotFoundException("Projeto não existe!");
        }

        return new ProjectDTO(project.get());
    }

    public List<ProjectDTO> getProjects(){
        return new ArrayList<ProjectDTO>(ProjectDTO.converter(projectRepository.findAll()));
    }

}
