package DecisionMaking;

public class elseifWithANDandOR {
    public static void main(String[]args){
        int age=20;
        boolean hasLicense=true;
        if(age>=18 && hasLicense){
            System.out.println("Eligible to drive");
        }
        else if(age>=18 || hasLicense){
            System.out.println("Eligible to drive with restrictions");
        }
        else{
            System.out.println("Not eligible to drive");
        }
    }
}
