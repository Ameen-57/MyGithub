/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringconverter;

/**
 *
 * @author Mo.ameen
 */
public class StringConverter {

    /**
     * @param st
     * @return 
     */
    public static boolean test(String st){
            if(st.isEmpty() || st == null){return false;}
            else{
                return st.chars().allMatch(Character::isLetter);
            }
        }
    
    public static void main(String[] args) {
        System.out.println(test("Ameeeeeen"));
        System.out.println(test("Ameee??156n"));
        
    }
    
    
}
