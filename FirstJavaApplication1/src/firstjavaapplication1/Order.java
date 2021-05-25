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
public class Order {
    public Customer customer;
    
    public void setOrder(Customer c ){
    
    customer=c;
    
    }
    
    public Customer getOrder(){
    return customer;
    }
    
}
