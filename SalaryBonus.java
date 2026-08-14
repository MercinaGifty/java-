import java.util.Scanner;
public class SalaryBonus {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Salary: ");
        double salary=sc.nextDouble();
        if(salary>50000){
            double bonus=salary*10/100;
            System.out.println("Your Bonus is:"+bonus);
            System.out.println("Your Gift = " + (salary + bonus));
        }
        else if(salary<50000){
            System.out.println("Your Salary is less than 50000, you are not eligible for bonus");
            System.out.println("Your Salary is:"+salary);
        }
        
    }
    
}
