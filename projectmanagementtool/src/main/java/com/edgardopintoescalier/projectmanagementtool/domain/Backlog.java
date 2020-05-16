package com.edgardopintoescalier.projectmanagementtool.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Backlog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer ProjectTaskSequence = 0;
    private String projectIdentifier;

    public Backlog(Integer projectTaskSequence) {
        ProjectTaskSequence = projectTaskSequence;
    }

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
}
