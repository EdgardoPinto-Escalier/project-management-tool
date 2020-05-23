package com.edgardopintoescalier.projectmanagementtool.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Backlog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer ProjectTaskSequence = 0;
    private String projectIdentifier;

    // OneToOne relationship with project
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "project_id", nullable = false)
    @JsonIgnore
    private Project project;

    // OneToMany projectTasks
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "backlog")
    private List<ProjectTask> projectTasks = new ArrayList<>();


    public Backlog() {
    }

    // Setters and Getters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getProjectTaskSequence() {
        return ProjectTaskSequence;
    }

    public void setProjectTaskSequence(Integer projectTaskSequence) {
        ProjectTaskSequence = projectTaskSequence;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public List<ProjectTask> getProjectTasks() {
        return projectTasks;
    }

    public void setProjectTasks(List<ProjectTask> projectTasks) {
        this.projectTasks = projectTasks;
    }
}
