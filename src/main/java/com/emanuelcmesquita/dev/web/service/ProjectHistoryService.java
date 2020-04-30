package com.emanuelcmesquita.dev.web.service;

import com.emanuelcmesquita.dev.web.domain.ProjectHistory;
import com.emanuelcmesquita.dev.web.repository.ProjectHistoryRepository;
import com.emanuelcmesquita.dev.web.service.dto.ProjectHistoryDTO;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectHistoryService {

    @Autowired
    private ProjectHistoryRepository projectHistoryRepository;

    public ProjectHistoryDTO getProjectHistoryById(Long id) throws NotFoundException {
        Optional<ProjectHistory> projectHistory = projectHistoryRepository.findById(id);

        if (!projectHistory.isPresent()) {
            throw new NotFoundException("Histórico do Projeto não existe!");
        }

        return new ProjectHistoryDTO(projectHistory.get());
    }

    public List<ProjectHistoryDTO> getProjectsHistory(){
        return new ArrayList<ProjectHistoryDTO>(ProjectHistoryDTO.converter(projectHistoryRepository.findAll()));
    }

}
