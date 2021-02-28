/*
 * Test Apartments
 * Author: S.G.
 * Date: 2/21/21
 */
package apartments;

import java.util.Scanner;
public class TestApartment {
    public static void main(String[] args){
        
        int UserRent, UserBed, UserBath;
        
        //Create scanner object
         Scanner inputDevice = new Scanner(System.in);
         
        //Creates apartment objects and set values
        Apartments apartment1 = new Apartments(1,2,1,350);
        Apartments apartment2 = new Apartments(2,1,1,300);
        Apartments apartment3 = new Apartments(3,3,1,550);
        Apartments apartment4 = new Apartments(4,2,2,450);
        Apartments apartment5 = new Apartments(5,4,2,600);
        
        //Ask the user to enter their desired amount and assignsa them to variables
        System.out.println("Enter The Maximum amount for rent: ");
        UserRent = inputDevice.nextInt();
        System.out.println("Enter The Minimum amount for Bedrooms: ");
        UserBed = inputDevice.nextInt(); 
        System.out.println("Enter The Minimum amount for Bathrooms: ");
        UserBath = inputDevice.nextInt();
       
        if (apartment1.getRent() <= UserRent && apartment1.getBathnum() >= UserBath && apartment1.getBednum() >= UserBed ){
            //If the given conditions are met it will print out the information for the apartment
            System.out.println("Apartment 1 meets your criteria ");
            System.out.println("Apartment 1:");
            System.out.println("Rent: " + apartment1.getRent() );
            System.out.println("Number of Bedrooms: " + apartment1.getBednum());
            System.out.println("Number of Bathrooms: " + apartment1.getBathnum());
        }
        else{
            //if the given conditions are not met it will say that criteria does not match
            System.out.println("Apartment 1 does not fit your criteria");
        }
        
        if (apartment2.getRent() <= UserRent && apartment2.getBathnum() >= UserBath && apartment2.getBednum() >= UserBed){
            //If the given conditions are met it will print out the information for the apartment
            System.out.println("Apartment 2 meets your criteria ");
            System.out.println("Apartment 2:");
            System.out.println("Rent: " + apartment2.getRent() );
            System.out.println("Number of Bedrooms: " + apartment2.getBednum());
            System.out.println("Number of Bathrooms: " + apartment2.getBathnum());
        }
        
        else{
            //if the given conditions are not met it will say that criteria does not match
            System.out.println("Apartment 2 does not fit your criteria");
        }
        
        if (apartment3.getRent() <= UserRent && apartment3.getBathnum() >= UserBath && apartment3.getBednum() >= UserBed){
            //If the given conditions are met it will print out the information for the apartment
            System.out.println("Apartment 3 meets your criteria ");
            System.out.println("Apartment 3 : ");
            System.out.println("Rent: " + apartment3.getRent() );
            System.out.println("Number of Bedrooms: " + apartment3.getBednum());
            System.out.println("Number of Bathrooms: " + apartment3.getBathnum());
        }
        
        else{
            //if the given conditions are not met it will say that criteria does not match
            System.out.println("Apartment 3 does not fit your criteria");
        }
        
        if (apartment4.getRent() <= UserRent && apartment4.getBathnum() >= UserBath && apartment4.getBednum() >= UserBed){
            //If the given conditions are met it will print out the information for the apartment
            System.out.println("Apartment 4 meets your criteria ");
            System.out.println("Apartment 4:");
            System.out.println("Rent: " + apartment4.getRent() );
            System.out.println("Number of Bedrooms: " + apartment4.getBednum());
            System.out.println("Number of Bathrooms: " + apartment4.getBathnum());
        }
        else{
            //if the given conditions are not met it will say that criteria does not match
            System.out.println("Apartment 4 does not fit your criteria");
        }
        
        if (apartment5.getRent() <= UserRent && apartment5.getBathnum() >= UserBath && apartment5.getBednum() >= UserBed){
            //If the given conditions are met it will print out the information for the apartment
            System.out.println("Apartment 5 meets your criteria ");
            System.out.println("Apartment 5:");
            System.out.println("Rent: " + apartment5.getRent() );
            System.out.println("Number of Bedrooms: " + apartment5.getBednum());
            System.out.println("Number of Bathrooms: " + apartment5.getBathnum());
        }
        
        else{
            //if the given conditions are not met it will say that criteria does not match
            System.out.println("Apartment 5 does not fit your criteria");
        }
    }
    
}
