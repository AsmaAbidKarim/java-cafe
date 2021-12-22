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
public class Cold extends Drinks{
    
    //Abstraction
     public String type(){
        return"COLD";
    }
     public String GetFruitSmoothieDesc(){
        return "Blended real fruits with no preservatives or artificial flavor.";
    }
    public String GetFlavoredTeaDesc(){
        return "Exceptional black or green iced tea steeped fresh with bold and balanced flavor.";
    }
    public String GetGarnitaDesc(){
        return "Our signature espresso blended to perfection.";
    }
    public String GetCreamosaDesc(){
        return "Soda water and sweet flavored syrups.";
    }
    public String GetTeaSmoothieDesc(){
        return "A smooth blend of sweet green tea and cream.";
    }
    public String GetJavaChipDesc(){
        return "Blended smoothie or granite with dark chocolate chips.";
    }
    
}
