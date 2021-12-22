/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopfinal2;

/**
 *
 * @author 123
 */
public class Hot extends Drinks  {
    
    //Abstraction
    public String type(){
        return"HOT";
    }
    
    public String GetAmericanoDesc(){
        return "Dark roast espresso with hot water: European style coffee.";
    }
    public String GetCafeLatteDesc(){
        return "Dark roast espresso topped with steamed milk.";
    }
    public String GetCafeMochaDesc(){
        return "Steamed rich chocolate and espresso. Also available :sugar free, Skinny and nondairy.";
    }
    public String GetCappuccinoDesc(){
        return "Espresso, steamed milk and a silky layer of foam.";
    }
    public String GetBrewedCoffeeDesc(){
        return "Award winning coffee ground daily and brewed fresh.";
    }
    public String GetHotChocoDesc(){
        return "Rich and famous hot chocolate topped with whipped cream.";
    }
   
    
    
    
}
