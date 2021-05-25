#!/usr/bin/env groovy

def call(){
 def file = fileExists ("${params.Directory}/pom.xml")
 echo "$file"
}
