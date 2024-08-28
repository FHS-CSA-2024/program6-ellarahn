//import stuff here!

//Your code here

//Paste console output below:
/*

*/
import java.util.Scanner;
 class program6{
    public static void main (String[]args) {
        Scanner myScanner = new Scanner(System.in);
        //assign variables and final pi
        
        final double pi = 3.14159;
        double radius = 0;
        //user imput
        System.out.println("Enter a radius");
        radius = myScanner.nextDouble();
        
        //math
    
        double diameter = radius * 2;
        double circm = pi * diameter;
        double area = pi * (radius * radius);
        
        //output
        System.out.println(" Diameter: ");
        System.out.format("%.3f", diameter);
        System.out.println(" Circumference:" );
        System.out.format("%.3f", circm);
        System.out.println(" Area: ");
        System.out.format("%.3f", area);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
}

