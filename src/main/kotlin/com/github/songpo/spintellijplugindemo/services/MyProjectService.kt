package com.github.songpo.spintellijplugindemo.services

import com.github.songpo.spintellijplugindemo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
