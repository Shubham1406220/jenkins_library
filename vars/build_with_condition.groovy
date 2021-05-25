#!/usr/bin/env groovy

def call(){
 if ( fileExists('${params.Directory}/pom.xml'))
  {
    cd "**/${params.Directory}"
    sh 'mvn clean package'
  }
}
