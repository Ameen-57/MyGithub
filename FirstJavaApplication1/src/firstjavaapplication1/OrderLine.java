/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package firstjavaapplication1;

/**
 *
 * @author carnival
 */
public class OrderLine {
    
    private Product item;
    private int units;
    
    public void setitem(Product p){
    item = p;
    }
    public Product getProduct(){
    return item;
    }
    
    public void setUnits(int u){
    units=u;
    }
    public int getUnits(){
    return units;
    }
    
    
    
}
