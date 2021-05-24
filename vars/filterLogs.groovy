#!/usr/bin/env groovy

import org.apache.commons.lang.StringUtils

def call(String value, int no){
 def log = currentBuild.rawBuild.getLog(10000).join('\n');
 int count = StringUtils.countMatches(log, value);
 if (count > no - 1)
 {
 currentBuild.result = "UNSTABLE"
 }
}
