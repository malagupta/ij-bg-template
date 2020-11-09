package com.github.malagupta.ijbgtemplate.services

import com.intellij.openapi.project.Project
import com.github.malagupta.ijbgtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
