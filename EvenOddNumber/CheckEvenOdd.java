package EvenOddNumber;

public class CheckEvenOdd {
    public static void main(String[] args) {
        int number = 0;

        System.out.println("the number is"+number);

        if( number%2 == 0 && number != 0){
            System.out.println("the number is even");
        }else if(number%2 != 0 && number != 0){
            System.out.println("the number is odd");
        }else {
            System.out.println("the number is zero");
        } }}
