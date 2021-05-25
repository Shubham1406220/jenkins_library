#!/usr/bin/env groovy

def call() {
 def file = findFiles excludes: '', glob: 'pom.xml'
 if ( fileExists '${params.Directory}/pom.xml' )
  {
    build("package")
  }
  else {
    echo "POM.XML not present"
  }
}
