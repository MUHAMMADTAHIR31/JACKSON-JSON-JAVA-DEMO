/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;


/**
 *
 * @author Dell
 */
public class Driver {
    
    public static void main(String[] args) {
        try{
            
            //create object mapper
            ObjectMapper mapper = new ObjectMapper();
            
            //read JSON file and map/convert to Java POJO
            //data/sample-lite.json
            
            Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
            
            //print first name & last name
            System.out.println("First Name= :"+theStudent.getFirstName());
            System.out.println("Last Name= :"+theStudent.getLastName());
            
            //print out address
            Address tempAddress = theStudent.getAddress();
            
            System.out.println("Street: ="+tempAddress.getStreet());
            System.out.println("City: ="+tempAddress.getCity());
            
            
            //print language
            for(String tempLang: theStudent.getLanguages()){
                System.out.println("Language: "+tempLang);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    
}
