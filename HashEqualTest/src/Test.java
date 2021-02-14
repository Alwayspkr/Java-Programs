public class Test
{
    public static void main(String[] args) {

        String a =  new String("ABC");
        String b =  new String ("ABC");
        String c = new String("MNO");
        String d = "ABC";
        String e =  "ABC";


        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());

//        if(a.equals(b)){
//            System.out.println("a hashcode::"+a.hashCode()+ ":::b hashcode::"+b.hashCode());
//        }

    }
}
