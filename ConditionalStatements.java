import java.util.*;
public class ConditionalStatements {
    public static void main(String[]args){
        /*int age =16;
        if(age>=18){
            System.out.println("Adult");

        }
        if(age>13 && age<118){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not adult");
        }*/

        /*int A=20;
        int B=56;
        if(A>B){
            System.out.println("A is Greater");
        }else{
            System.out.println("B is grreater");
        }*/

        /*int n=23;
        if(n%2==0){
            System.out.println("Even");

        }else{
            System.out.println("ODD");
        }*/

        //Calculator
        /*Scanner sc =new Scanner(System.in);
        System.out.println("Enter a 1st number");
        int a =sc.nextInt();
        System.out.println("Enter a 2nd number");
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+': System.out.println(a+b);
                        System.out.println("ADDITION");
                
                break;
            case '-': System.out.println(a-b);
                        System.out.println("SUBTRACTION");
                        break;
            case '*': System.out.println(a*b);
                        System.out.println("MULTIPLICATOIN");
                        break;
            case '/': System.out.println(a/b);
                        System.out.println("DIVISION");
                        break;
            case '%': System.out.println(a%b);
                        System.out.println("MODULO");
                        break;
            default:System.out.println("Default operator");
                break;
        }*/
        //NO IS POSITIVE OR NEGATIVE.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int no =sc.nextInt();
        if(no>0){
            System.out.println("No is positive");
        }else{
            System.out.println("No is negative");
        }*/

       /* double temp= 103.5;
        if(temp> 100){
            System.out.println("You have a fever");
        }else{
            System.out.println("You dont have Fever");
        }*/

        //WEEK DAYS USING SWITCH CASE.
        
       /*  Scanner sc =new Scanner(System.in);
        System.out.println("Enter A Days");
        int days = sc.nextInt();
        switch (days) {
            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Saturday");
                break;
            case 7: System.out.println("Sunday");
                break;
            default:
                break;
        }*/


        /*int year=2005;
        if(year%4==0){
            System.out.println("year is leap year");

        }else{
            System.out.println("Year is not leap year");
        }*/

       
        /*for(int i=1;i>=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/


        /*int n=4;
        for(int line=1;line<=n;line++){
            for(int j=1;j<=line;j++){
                System.out.print(j);
            }
            System.out.println();
        }*/
        int n=4;
        char ch= 'A';
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;

            }
            System.out.println();
        }
    }
    
}
