import java.util.Scanner;

public class gradeCal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the total number of subjects");
        int totalSubjects = sc.nextInt();
        int totalMarks = 0;

        for(int i = 1; i<=totalSubjects; i++){

            System.out.println("Enter the name of the subject");
            String sub = sc.next();
            System.out.println("Enter the marks of" +" "+ sub + " ");
            int marks = sc.nextInt();
            if (marks<0 || marks>100) {

                System.out.println("Invalid Marks, please try again!");
                i--;
                continue;
            }

            else {

                totalMarks = totalMarks+marks;
            }

        }
        
        double avg = totalMarks/totalSubjects;
        System.out.println("Total marks:"+ " " +totalMarks);
        System.out.println("Average marks:"+ " " +avg);

        String grade;

        if (avg>=90){

            grade = "A";

        }
        else if (avg>=80){

            grade = "B";
            
        }
        else if (avg>=70){

            grade = "C";
            
        }
        else if (avg>=60){

            grade = "D";
            
        }
        else {

            grade = "F";
            
        }

        System.out.println("Grade obtained:" + " " +grade);
    }
}