package com.codePalace.backend.Fund.controller;

import com.codePalace.backend.Fund.model.Project;
import com.codePalace.backend.Fund.model.ResponseWrapper;
import com.codePalace.backend.Fund.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
//import javax.ws.rs.core.GenericEntity;

import javax.xml.ws.Response;
//import javax.xml.ws.ResponseWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1")
public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;
    @RequestMapping(value="projects",method = RequestMethod.GET)
    public ResponseWrapper getProjects(){
        List<Project> projects = new ArrayList<Project>();
        projectRepository.findAll().forEach(projects::add);
        //GenericEntity<List<Project>> genericEntity = new GenericEntity<List<Project>>(projects){};
        //return Response.ok(genericEntity, MediaType.APPLICATION_JSON).build();
        ResponseWrapper res  = new ResponseWrapper();
        res.setProjects(projects);
        return res;
        //return projects;

    }

    @RequestMapping(value="projects",method= RequestMethod.POST)
    public void createProject(@RequestBody Project project)
    {
        projectRepository.save(project);
    }

    @RequestMapping(value="projects/categories/{categoryId}", method = RequestMethod.GET)
    public ResponseWrapper getProjectsByCategory(@PathVariable("categoryId") String categoryId){

        List<Project> projects = new ArrayList<Project>();
        projectRepository.findAll().forEach(projects::add);
        ResponseWrapper rs=new ResponseWrapper();
        rs.setProjects(projects.stream().filter(project -> categoryId.equals(project.getCategory_id())).collect(Collectors.toList()));
        return rs;
    }

}
