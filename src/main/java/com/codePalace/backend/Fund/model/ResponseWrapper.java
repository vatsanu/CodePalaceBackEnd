package com.codePalace.backend.Fund.model;

import java.io.Serializable;
import java.util.List;

public class ResponseWrapper implements Serializable {

    List<Project> projects;

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }


}
