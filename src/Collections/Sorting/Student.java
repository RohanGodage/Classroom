package Collections.Sorting;

import java.util.*;

public class Student implements Comparable<Student>{
    int studentID;
    String studentName;
    int studentMarks;

    public Student(int studentID, String studentName, int studentMarks) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentMarks = studentMarks;
    }

    @Override
    public String toString() {
        return "{Student ID : "+ studentID +" Student Name : "+ studentName+" Student Marks : "+studentMarks+'}';
    }


//        Collections.sort(list,(s1,s2)->s1.studentID- s2.studentID);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));


    @Override
    public int compareTo(Student o) {
        return this.studentMarks - o.studentMarks;
    }
    
}
