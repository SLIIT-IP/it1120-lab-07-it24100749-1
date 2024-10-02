import java.util.Scanner;
public class it24100749Lab7Q3{
public static void main(String[] args){

int num = 1;
Scanner input = new Scanner(System.in);
while(num<=5){
System.out.println("Customer"+" "+num);

System.out.print("Enter total bill amount:");
int value=input.nextInt();
double discount=value*0.05;
double amount=value-discount;


char type;
System.out.print("Enter mode of payment(C for cash, O for other):");
type = input.next().charAt(0);

switch (type){
case'C':System.out.println("Discount is:"+discount);
        System.out.println("Amount to be paid:"+amount);
        break;
case'O':System.out.println("No discount applicable");
        System.out.println("Discount is:"+discount);
        System.out.println("Amount to be paid:"+amount);
        break;
default:System.out.println("Payment method not available");
        break;

}
num=num+1;

System.out.println();

}

}

}




