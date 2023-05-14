package com.example.springhw1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController// adding Annotation
@RequestMapping("/GET") //Defining URL

public class welcomeController {

@GetMapping(path = "name")//Defining (Path) for getNAme Endpoint
    public String getName(){
        return "My Name is, Raghad! ";
    }

   //----------------------------End of getname Endpoint
   @GetMapping(path = "age")//Defining (Path) for getAge Endpoint
   public String getAge(){
       return "I'm, 23 years old! ";
   }

   //----------------------------------End of getAge Endpoint
   @GetMapping(path = "/check/status")//Defining (Path) for checkstatus Endpoint
   public String checkStatus(){
       return "Everything is OK ! ";
   }

   //------------------------------------- end of checkstatus endpoint
   @GetMapping(path = "health")//Defining (Path) for getHealth Endpoint
   public String getHealth(){
       return "Server Health is UP and Running! ";
   }

   //end of get health end point









}
