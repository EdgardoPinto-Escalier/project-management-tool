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

    // Find project by Identifier
    public Project findProjectByIdentifier(String projectId) {
        Project project = projectRepository.findByProjectIdentifier(projectId.toUpperCase());
        if(project == null) {
            throw new ProjectIdException("Project ID '" + projectId + "' does not exists");
        }
        return project;
    }

    // Find All projects
    public Iterable<Project> findAllProjects() {
        return projectRepository.findAll();
    }

    // Delete existing project
    public void deleteProjectById(String projectId) {
        Project project = projectRepository.findByProjectIdentifier(projectId.toUpperCase());

        if(project == null) {
            throw new ProjectIdException("Unable to delete nonexistent project ID '" + projectId + "'. This project currently does not exist!");
        }
        projectRepository.delete(project);
    }
}
