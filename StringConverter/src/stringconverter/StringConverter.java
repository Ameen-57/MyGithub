/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringconverter;

/**
 *
 * @author Emad Osama
 */
public class StringConverter {

    /**
     * @param x
     * @return 
     */
    public static boolean test(String x){
            if(x.isEmpty() || x == null){return false;}
            else{
                return x.chars().allMatch(Character::isLetter);
            }
        }
    
    public static void main(String[] args) {
        System.out.println(test("Ameeeeeen"));
        System.out.println(test("Ameee??156n"));
        System.out.println(test(""));
    }
    
    
}
