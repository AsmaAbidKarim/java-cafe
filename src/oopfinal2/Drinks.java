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
abstract class Drinks {
    
    //Abstraction
     abstract String type();
    //getdiscount method discount whne med and large bought+ discount 5% of large price
     
     //Inheritance
    public double GetDiscount(int costLar){
        double discount=(0.05*costLar);
        return discount;
    }
    
}
