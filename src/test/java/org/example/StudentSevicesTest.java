package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentSevicesTest {

    @Test
    void getAllStudents() {
        StudentSevices service = new StudentSevices();
        Students student = new Students(1, "Thabang");
        service.addStudents(student);
        assertEquals(1, service.getAllStudents());
        assertEquals(student, service.getAllStudents());

}
    @Test
    void addStudents() {
        StudentSevices service = new StudentSevices();
            service.addStudents(new Students(1, "Thabang"));
            service.addStudents(new Students(2, "Mpho"));
            List<Students> students = service.getAllStudents();
            assertEquals(2, students.size());
            assertEquals("Thabang", students.get(0).getName());
            assertEquals("Mpho",students.get(1).getName());



    }
    @Test
    void EmptyStudentTest(){
        StudentSevices service = new StudentSevices();
        List<Students> studentsList = service.getAllStudents();
        boolean checkStudent = studentsList.isEmpty();
        assertTrue(checkStudent);

    }

}