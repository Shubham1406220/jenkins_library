#!/usr/bin/env groovy

import org.apache.commons.lang.StringUtils

def call(){
  pom = readMavenPom file: 'pom.xml'
  echo "FILE: ${pom.artifactId} , PACKAGE: ${pom.packaging}, VERSION : ${pom.version}"
  echo "Warfile: ${pom.artifactId}-${pom.version}.${pom.packaging}"
  deploy adapters: 
    [tomcat8(credentialsId: '87de1842-3bb6-46d6-b0ba-003da5333f5b', 
    path: '', url: 'http://13.233.62.12:8080')], 
    contextPath: '.', 
    onFailure: false, 
    war: "/targt/${pom.artifactId}-${pom.version}.${pom.packaging}"
}


