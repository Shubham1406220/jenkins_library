#!/usr/bin/env groovy

def call(){
 def file = fileExists ("${params.Directory}/pom.xml")
 if ("${file}" == "true") {
   cd "${params.Directory}"
   sh 'mvn clean package'
 }
}
