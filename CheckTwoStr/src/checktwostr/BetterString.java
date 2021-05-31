  
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checktwostr;




    
    
  import java.util.function.BiPredicate;

/**
 *
 * @author 20115
 */
public class BetterString {
    
    public static String betterString(String st1, String st2 ,BiPredicate<String, String>p) {
        if (p.test(st1, st2))
            return st1;
        else 
            return st2;
                    
    }

    
    public static void main(String[] args) {
        
        String first_string ="Mohammmmmed"; 
        String second_string ="Ameen"; 
        String longer = BetterString.betterString(first_string, second_string, (st1, st2) -> st1.length() > st2.length()); 
        String first = BetterString.betterString(first_string, second_string, (st1, st2) -> true);
        System.out.println(longer);        // TODO code application logic here
    }
    
}