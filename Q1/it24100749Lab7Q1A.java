import java.util.Scanner;
public class it24100749Lab7Q1A{
public static void main(String[] args){

System.out.println("Enter marks for four subjects:");

Scanner input = new Scanner(System.in);
System.out.print("Enter Subject Mark 1:");
double mark1=input.nextDouble();

System.out.print("Enter Subject Mark 2:");
double mark2=input.nextDouble();

System.out.print("Enter Subject Mark 3:");
double mark3=input.nextDouble();

System.out.print("Enter Subject Mark 4:");
double mark4=input.nextDouble();

double average = (mark1+mark2+mark3+mark4)/4;
System.out.println("Average is:"+average);

 String grade;
        if (average >= 75) {
            grade = "Distinction";
        } else if (average >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

               System.out.println("Overall grade is: " + grade);

            }
}            



