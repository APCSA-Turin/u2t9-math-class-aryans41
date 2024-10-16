import java.util.Scanner;  
public class Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.print("Please enter the degree in radians: ");
        double radainValue = scan.nextDouble();
        double degrees = Math.toDegrees(radainValue); 
        double sine = Math.sin(radainValue);
        double cosine = Math.cos(radainValue);

        System.out.println(radainValue + " radians is approximately " + degrees + " degress");
        System.out.println("The sine of " + degrees + " degrees is " + sine); 
        System.out.println("The cosine of " + degrees + " degrees is " + cosine); 

        scan.close();
    } 
}