#!/usr/bin/env groovy

import org.apache.commons.lang.StringUtils

def tomcat(){
  pom = readMavenPom file: 'pom.xml'
  deploy adapters: 
    [tomcat8(credentialsId: '87de1842-3bb6-46d6-b0ba-003da5333f5b', 
    path: '', url: 'http://13.233.62.12:8080')], 
    contextPath: '.', 
    onFailure: false, 
    war: '${pom.artifcatID}.${pom.packaging}'
}


