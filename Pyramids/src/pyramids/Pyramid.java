/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;

/**
 *
 * @author Mo.Ameen
 */
public class Pyramid {
    
    String pharach;
    String modern_name;
    String site;
    double height;
    
    public Pyramid(String pharach, String modern_name, String site, double height){
    
    this.height = height;
    this.modern_name = modern_name;
    this.site = site;
    this.pharach = pharach;
    
    }
    
    @Override
    public String toString(){
        
        return " pharach " + pharach + ", modern name " + modern_name + ", height " + height + ", site " + site;
    
    }
    
    public String getPharach(){
    return pharach ;
    }
    
    public void setPharach(String pharach){
    
    this.pharach = pharach;
    }
    
    public String getModern_name(){
    
        return modern_name;
    }
    
   public void setModern_name(String modern_name){
   
   this.modern_name = modern_name;   
   }
   
   public double getHeight (){
   
   return height ;
   }
   
   public void setHeight(double height){
   
   this.height = height;
   }
   
   public String getSite(){
       
   return site;
   
   }
   public void setSite(String site){
   
   this.site = site;
   }
   

    /**
     * @param args the command line arguments
     */

}
