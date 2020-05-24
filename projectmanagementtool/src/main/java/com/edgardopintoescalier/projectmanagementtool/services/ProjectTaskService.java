package com.edgardopintoescalier.projectmanagementtool.services;

import com.edgardopintoescalier.projectmanagementtool.domain.ProjectTask;
import com.edgardopintoescalier.projectmanagementtool.repositories.BacklogRepository;
import com.edgardopintoescalier.projectmanagementtool.repositories.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectTaskService {

    @Autowired
    private BacklogRepository backlogRepository;

    @Autowired
    private ProjectTaskRepository projectTaskRepository;

    public ProjectTask addProjectTask() {
        
    }
}
