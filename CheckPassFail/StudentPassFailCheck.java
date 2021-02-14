package CheckPassFail;

public class StudentPassFailCheck {
    public static void main(String[] args) {
         int passMarks = 36;
         int notAttempted = 0;

         int A =45;
         int B=54;
         int C=35;
         int D = 0;

        System.out.println("The default pass marks is"+passMarks);


        if(A>=passMarks){
            System.out.println("A is passed in exams");
        } else if(A<=passMarks){
            System.out.println("A is failed in Exams");
        }else{
            System.out.println("A is not attempted the exams");
        }
        if(B>=passMarks){
            System.out.println("B is passed in exams");
        } else if(B<=passMarks){
            System.out.println("B is failed in Exams");
        }else{
            System.out.println("B is not attempted the exams");
        }
        if(C>=passMarks){
            System.out.println("C is passed in exams");
        } else if(C<=passMarks){
            System.out.println("C is failed in Exams");
        }else{
            System.out.println("C is not attempted the exams");
        }
        if(D>=passMarks){
            System.out.println("D is passed in exams");
        } else if(D<=passMarks){
            System.out.println("D is failed in Exams");
        }else if(D==notAttempted){
            System.out.println("D is not attempted the exams");
        }
    }
}
