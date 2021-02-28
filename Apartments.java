/*
 * Author:S.G.
 * Date: 2/21/21
 * Apartments
 */
package apartments;


public class Apartments {
    //Creates the varibles used in the class
    private int Anum;
    private int Bednum;
    private int Bathnum;
    private int Rent;
    //Creates the constuctor which takes in agruments that are assigned to varibles
    public Apartments(int y,int x,int s,int f){
        Anum = y;
        Bednum = x;
        Bathnum = s;
        Rent = f;

}
    //Returns The apartment number
    public int getAnum(){
        return Anum;
    }
    //return number of Bedrooms
    public int getBednum(){
         return Bednum;
    }
    //retrun number of Bathrooms
    public int getBathnum(){
        return Bathnum;
    }
    //Retruns rent amount
    public int getRent(){
        return Rent;
    }


    
        
         
    }
    

