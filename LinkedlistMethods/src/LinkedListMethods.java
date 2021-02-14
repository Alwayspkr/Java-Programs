import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<Integer> empid = new LinkedList<>();

        empid.add(1);
        empid.add(2);
        empid.add(3);
        empid.add(4);
        empid.add(5);

        System.out.println(empid);                     // [1, 2, 3, 4, 5]
        System.out.println(empid.getFirst());          // 1
        System.out.println(empid.getLast());          // 5
        empid.addFirst(10);
        empid.addLast(20);
        System.out.println(empid.getFirst());        // 10
        System.out.println(empid.getLast());         // 20
        System.out.println( empid.lastIndexOf(5));  // 4


    }
}