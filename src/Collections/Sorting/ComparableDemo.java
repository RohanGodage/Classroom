package Collections.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        Student student1 = new Student(19,"Foxtrot",89);
        Student student2 = new Student(14,"Echo",98);
        Student student3 = new Student(12,"James",77);
        Student student4 = new Student(10,"Danny",58);
        Student student5 = new Student(20,"Alexa",86);
        List < Student > list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        Collections.sort(list);
        for (Student student :
                list) {

        }


    }


}
