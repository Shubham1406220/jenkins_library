#!/usr/bin/env groovy

def call(){
 def file = fileExists('WORKSPACE/${params.Directory}/pom.xml')
 echo "$file"
}
