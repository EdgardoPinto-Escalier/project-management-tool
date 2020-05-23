package com.edgardopintoescalier.projectmanagementtool.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
public class ProjectTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(updatable = false)
    private String projectSequence;
    @NotBlank(message = "Please include a project summary")
    private String projectTaskSummary;
    private String projectTaskAcceptanceCriteria;
    private String projectTaskStatus;
    private Integer projectTaskPriority;
    private Date projectTaskDueDate;

    // ManyToOne with Backlog
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "backlog_id", updatable = false, nullable = false)
    @JsonIgnore
    private Backlog backlog;

    @Column(updatable = false)
    private String projectIdentifier;

    private Date projectTaskCreatedAt;
    private Date projectTaskUpdatedAt;

    public ProjectTask() {
    }

    // Setters and Getters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectSequence() {
        return projectSequence;
    }

    public void setProjectSequence(String projectSequence) {
        this.projectSequence = projectSequence;
    }

    public String getProjectTaskSummary() {
        return projectTaskSummary;
    }

    public void setProjectTaskSummary(String projectTaskSummary) {
        this.projectTaskSummary = projectTaskSummary;
    }

    public String getProjectTaskAcceptanceCriteria() {
        return projectTaskAcceptanceCriteria;
    }

    public void setProjectTaskAcceptanceCriteria(String projectTaskAcceptanceCriteria) {
        this.projectTaskAcceptanceCriteria = projectTaskAcceptanceCriteria;
    }

    public String getProjectTaskStatus() {
        return projectTaskStatus;
    }

    public void setProjectTaskStatus(String projectTaskStatus) {
        this.projectTaskStatus = projectTaskStatus;
    }

    public Integer getProjectTaskPriority() {
        return projectTaskPriority;
    }

    public void setProjectTaskPriority(Integer projectTaskPriority) {
        this.projectTaskPriority = projectTaskPriority;
    }

    public Date getProjectTaskDueDate() {
        return projectTaskDueDate;
    }

    public void setProjectTaskDueDate(Date projectTaskDueDate) {
        this.projectTaskDueDate = projectTaskDueDate;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
    }

    public Date getProjectTaskCreatedAt() {
        return projectTaskCreatedAt;
    }

    public void setProjectTaskCreatedAt(Date projectTaskCreatedAt) {
        this.projectTaskCreatedAt = projectTaskCreatedAt;
    }

    public Date getProjectTaskUpdatedAt() {
        return projectTaskUpdatedAt;
    }

    public void setProjectTaskUpdatedAt(Date projectTaskUpdatedAt) {
        this.projectTaskUpdatedAt = projectTaskUpdatedAt;
    }

    public Backlog getBacklog() {
        return backlog;
    }

    public void setBacklog(Backlog backlog) {
        this.backlog = backlog;
    }

    @PrePersist
    protected void onCreate() {
        this.projectTaskCreatedAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.projectTaskUpdatedAt = new Date();
    }

    @Override
    public String toString() {
        return "ProjectTask{" +
                "id=" + id +
                ", projectSequence='" + projectSequence + '\'' +
                ", projectTaskSummary='" + projectTaskSummary + '\'' +
                ", projectTaskAcceptanceCriteria='" + projectTaskAcceptanceCriteria + '\'' +
                ", projectTaskStatus='" + projectTaskStatus + '\'' +
                ", projectTaskPriority=" + projectTaskPriority +
                ", projectTaskDueDate=" + projectTaskDueDate +
                ", projectIdentifier='" + projectIdentifier + '\'' +
                ", projectTaskCreatedAt=" + projectTaskCreatedAt +
                ", projectTaskUpdatedAt=" + projectTaskUpdatedAt +
                '}';
    }
}
