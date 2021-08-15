package main.domain;

import org.springframework.stereotype.Component;

@Component
public class Person {

      private String id;
      private String name;
      private Integer age;

      public Person(String id, String n, Integer a){
          this.id=id;
          this.name=n;
          this.age=a;
      }

      public Person(){}

      public String getId(){
          return this.id;
      }

      public void setId(String s){
          this.id=s;
      }

      public String getName(){
          return this.name;
      }

      public void setName(String s) {
          this.name=s;
      }

      public Integer getAge(){
          return this.age;
      }

      public void setAge(Integer n){
          this.age=n;
      }

      public String toString(){
          return "The person :"+this.getId()+" "+this.getName()+"  "+this.getAge();
      }

}
