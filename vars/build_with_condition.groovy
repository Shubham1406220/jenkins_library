#!/usr/bin/env groovy

def call(){
 def file = fileExists ("${params.Directory}/pom.xml")
 if ("${file}" == "true") {
   sh """cd ${params.Directory} 
   mvn clean package """
 }
}
