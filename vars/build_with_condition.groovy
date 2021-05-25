#!/usr/bin/env groovy

def call(){
 def file = fileExists('0.first-non-maven-project/pom.xml')
 echo "$file"
}
