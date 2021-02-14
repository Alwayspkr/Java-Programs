import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListMethods {
    public static void main(String[] args) {
        List<Integer> empId = new ArrayList<>();
        empId.add(1);
        empId.add(2);
        empId.add(3);
        empId.add(4);
        empId.add(5);
        empId.add(6);

        System.out.println(empId.isEmpty());  //false
        System.out.println(empId.contains(1)); //true
        System.out.println(empId.contains(8));  //false
        System.out.println(empId.get(1));    //2
        System.out.println(empId.get(5));  //6
        System.out.println(empId.size());  // 6
        System.out.println(empId.remove(3));  //4
        System.out.println(empId.size());  //5

        System.out.println("ForwardDirection::");
        Iterator iterator = empId.iterator();
               while(iterator.hasNext()){
                   System.out.println(iterator.next());
}



        ListIterator listIterator = empId.listIterator();

        System.out.println("ForwardDirection::");
               while(listIterator.hasNext()){
                   System.out.println(listIterator.next());
               }


        System.out.println("BackwardDiection::");
               while (listIterator.hasPrevious()){
                   System.out.println(listIterator.previous());
               }


        }

    }

