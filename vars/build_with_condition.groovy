#!/usr/bin/env groovy

def call(){
 sh 'cd ${params.Directory}'
 def file = findFiles excludes: '', glob: "${params.Directory}/pom.xml"
 if ( fileExists '*/${params.Directory}/pom.xml' )
  {
    build("package")
  }
  else {
    echo "POM.XML not present"
  }
}
