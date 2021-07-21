package com.ust.examples;

  public class ExampleConfig {
	

  final static String NAME= "Config";
  final long intTime;
  ExampleConfig(){
	  
	  this.intTime= System.currentTimeMillis();
  }

  public static void main(String[] args) {
		ExampleConfig c=new ExampleConfig();
        System.out.println(c.intTime);
        ExampleConfig c1=new ExampleConfig();
        System.out.println(c1.intTime);  
   }
   }
