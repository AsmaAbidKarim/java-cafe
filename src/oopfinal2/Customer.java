/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopfinal2;

/**
 *
 * INTERFACE AND CONSTRUCTORS USED
 */
public class Customer implements inter{
    public String Name;
    public String Address;
    public String phone;
    public Customer(String Name,String Address,String phone){
        this.Name=Name;
        this.Address=Address;
        this.phone=phone;
        
    }
    public String toString(){
       return  "Name:"+Name + " Address:"+Address+" phone:"+ phone ;
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

