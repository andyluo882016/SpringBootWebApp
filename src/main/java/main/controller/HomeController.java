package main.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.*;
import java.util.List;

import main.domain.Person;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class HomeController {

      @GetMapping(path="/show/{name}")
       public String show(@PathVariable("name") final String name) {

           return "<h2>Welcome to show my web page: </h2>"+"<h1>"+ name +"</h1>";
       }

       @GetMapping(path="/getdata")
       public List<Person> getMore(){
          Person p1=new Person("MN876","Jeff Baberson", 39);
          Person p2=new Person("VN876", "Julie Dancern", 42);
          List<Person> list=new ArrayList<Person>();
          list.add(p1);
          list.add(p2);
          //list.add("DataSource");

          return list;
       }
      // @GetMapping(value="/show" )
       @GetMapping(path = "/show", produces = {MediaType.APPLICATION_JSON_VALUE})
       public String showdata() {
          return "{Hello My Spring Test data}";
       }
}
