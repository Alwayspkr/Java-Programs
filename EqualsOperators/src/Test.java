public class Test {
    public static void main(String[] args) {
        String s1 =  new String("ABCD");
        String s2 = new String("WXYZ");
        String s3 =  new String("ABCD");
        String s4 = "ABCD";
        String s5 = "OPQR";
        String s6 = "ABCD";
        System.out.println(s1==s2);  // false
        System.out.println(s1==s3);  //false
        System.out.println(s3==s4);  //false
        System.out.println(s4==s6);   //true
        System.out.println(s1.equals(s2));  //false
        System.out.println(s2.equals(s3));  //false
        System.out.println(s1.equals(s3));   //true
        System.out.println(s4.equals(s5));    //false
        System.out.println(s5.equals(s6));     //false
        System.out.println(s4.equals(s6));      //true
        System.out.println(s1.equals(s4));      //true

    }
}
