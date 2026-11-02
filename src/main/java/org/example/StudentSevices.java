package org.example;

import java.util.ArrayList;
import java.util.List;

public class StudentSevices {
 public ArrayList<Students> stu = new ArrayList<>();
 public List<Students> getAllStudents(){
     return  this.stu;
 }
    public  void addStudents(Students stu){
      this.stu.add(stu);
    }


}
