#!/usr/bin/env groovy

def call(String mvnaction){
  if ( "${mvnaction}" == "install")
  {
    sh 'mvn clean install'
  }
  else if ( "${mvnaction}" == "package")
    {
     sh 'mvn clean package'
}
}
