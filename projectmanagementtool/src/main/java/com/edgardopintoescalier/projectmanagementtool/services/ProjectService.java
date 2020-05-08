package com.edgardopintoescalier.projectmanagementtool.services;

import com.edgardopintoescalier.projectmanagementtool.domain.Project;
import com.edgardopintoescalier.projectmanagementtool.exceptions.ProjectIdException;
import com.edgardopintoescalier.projectmanagementtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project) {
        try {
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return projectRepository.save(project);
        } catch(Exception e) {
            throw new ProjectIdException("Project ID '" + project.getProjectIdentifier().toUpperCase() + "' already exists");
        }
    }

    public Project findProjectByIdentifier(String projectId) {
        return projectRepository.findByProjectIdentifier(projectId.toUpperCase()clear
        );
    }
}
