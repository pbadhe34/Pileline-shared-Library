package com.data

 @Grab('org.yaml:snakeyaml:1.17')

import org.yaml.snakeyaml.Yaml

class YAMLSnakeParser{

 String parseStructure(filename){ 
  println "starting with $filename"
 Yaml parser = new Yaml()
 
 def data = parser.load((filename as File).text)

  println "parse done"

  //data.each{println it}
  println data.records.car.name
 
 println data.records.car.record.model.dealer.name
   data
  }
 }
