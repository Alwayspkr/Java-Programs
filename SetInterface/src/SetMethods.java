import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethods {
    public static void main(String[] args) {
    Set<Integer> empId = new HashSet<>();

    empId.add(1);
    empId.add(2);
    empId.add(3);
    empId.add(4);

        System.out.println(empId);       //[1, 2, 3, 4]
        empId.remove(2);
        System.out.println(empId);      //[1, 3, 4]
        System.out.println( empId.isEmpty());  //false
        System.out.println( empId.contains(3));   //true

        Iterator iterator =  empId.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());     // 1, 3 , 4

            }
}}
