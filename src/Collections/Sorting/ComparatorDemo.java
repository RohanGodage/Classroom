package Collections.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    static class studentDemo {
        {
//       @Override
//               public int compare(Student s1,Student s2){
//                    return
//        }
        }

        public static void main(String[] args) {
            Student student1 = new Student(19, "Foxtrot", 89);
            Student student2 = new Student(14, "Echo", 98);
            Student student3 = new Student(12, "James", 77);
            Student student4 = new Student(10, "Danny", 58);
            Student student5 = new Student(20, "Alexa", 86);

            List<Student> list = new ArrayList<>();
            list.add(student1);
            list.add(student2);
            list.add(student3);
            list.add(student4);
            list.add(student5);
            System.out.println("BEFORE SORTING : ");
            //Printing before sorting
            for (Student student : list) {
                System.out.println(student);

            }
            //default method
            Collections.sort(list, Comparator.comparingInt(s -> s.studentMarks));
            System.out.println("AFTER SORTING BY DEFAULT METHOD [Collections.sort(list, Comparator.comparingInt(s->s.studentMarks));] : ");
            for (Student student : list) {
                System.out.println(student);

            }
            System.out.println("----------Default Method OVER ------------- ");


            System.out.println("AFTER SORTING BY LAMBDA METHOD [Collections.sort(list,(s1,s2)-> s1.studentMarks- s2.studentMarks);] : ");
            Collections.sort(list, (s1, s2) -> s1.studentMarks - s2.studentMarks);
            for (Student student : list) {
                System.out.println(student);

            }
            System.out.println("----------LAMBDA Method OVER ------------- ");


            System.out.println("AFTER SORTING BY ANONYMOUS METHOD [Collections.sort(list, Comparator.comparingInt(s->s.studentMarks));] : ");
            Collections.sort(list, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o1.studentMarks - o2.studentMarks;
                }
            });
            for (Student student : list) {
                System.out.println(student);

            }
            System.out.println("----------ANONYMOUS Method OVER ------------- ");


        }
    }
}
