 
package com.data

import groovy.json.JsonSlurperClassic
import java.io.File
import java.io.Reader
import java.io.FileReader
import java.io.BufferedReader

 class JSONFileReader{

  String readJSONTreeData(filename){

 def slurper = new JsonSlurperClassic() 
  

 BufferedReader inReader = new BufferedReader(new FileReader(filename));

 Reader readJson = inReader ;
  
 def result = slurper.parse(readJson)



 //println "The json result is  "+result
 
 
 //println "User name is $result.users.user3.name"
 //println "User age is $result.users.user3.age"
 //println "User balance is $result.users.user3.balance"
  result
   }
  }
  

