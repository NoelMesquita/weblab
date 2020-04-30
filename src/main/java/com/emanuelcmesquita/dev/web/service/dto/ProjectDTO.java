package com.emanuelcmesquita.dev.web.service.dto;

import com.emanuelcmesquita.dev.web.domain.Project;
import com.emanuelcmesquita.dev.web.domain.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProjectDTO {

    private Long id;
    private String projectTitle;
    private Long minSalary;
    private Long maxSalary;

    private List<Task> tasks = new ArrayList<Task>();

    public ProjectDTO(Project project) {
        this.id = project.getId();
        this.projectTitle = project.getProjectTitle();
        this.maxSalary = project.getMaxSalary();
        this.minSalary = project.getMinSalary();
        this.tasks = project.getTasks();
    }

    public Long getId() {
        return id;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public Long getSalarioMinimo() {
        return minSalary;
    }

    public Long getSalarioMaximo() {
        return maxSalary;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public static List<ProjectDTO> converter(List<Project> projects) {
        return projects.stream().map(ProjectDTO::new).collect(Collectors.toList());
    }


}
