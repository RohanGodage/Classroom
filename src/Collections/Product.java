package Collections;

import java.util.*;

public class Product implements Comparable{
    int id;
     String name ;
     int salary;

    public Product(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args)
    {
        Product product1 = new Product(100,"jkl",90000);
        Product product2 = new Product(10,"def",18000);
        Product product3 = new Product(15,"mno",20000);
        Product product4 = new Product(11,"abc",60000);
        Product product5 = new Product(30,"pqr",50000);


        ArrayList arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(90);
        arrayList.add(110);
        arrayList.add(101);
        Collections.sort(arrayList);
        System.out.println("Array List : "+arrayList);

        // linked List implementation
         List list2 = new LinkedList();
             list2.add(70);
             list2.add(40);
             list2.add(10);
             list2.add(30);
             list2.add(40);
        System.out.println("Linked List : "+list2);

        Set Set1 = new HashSet<>();
        Set1.add(product1);
        Set1.add(product2);
        Set1.add(product3);
        Set1.add(product4);
        Set1.add(product5);
        System.out.println(Set1);
        //Collections.sort(list2, Comparator.comparingInt(p -> p.name));

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}'+"\n";

    }
}
