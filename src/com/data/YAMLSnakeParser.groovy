package com.data

 @Grab('org.yaml:snakeyaml:1.17')

import org.yaml.snakeyaml.Yaml

class YAMLSnakeParser{

 String parseStructure(filename){ 
  
 Yaml parser = new Yaml()
 
 def data = parser.load((filename as File).text)  
 
  
   data
  }
 }
