package com.data

import groovy.yaml.YamlSlurper

class YAMLParser{

  String parseYmlData(filename){
reader = new YamlSlurper()
 //file = new File("/home/dell/car.yaml")

 file = new File(filename)
 
 Object data = reader.parse(file)
 println data.records.car.name
 
 println data.records.car.record.model.dealer.name
  data //default return value
 }
 }

 
