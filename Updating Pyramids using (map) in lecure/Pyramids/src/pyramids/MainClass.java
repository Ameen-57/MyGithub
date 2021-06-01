/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mo.ameen
 */
package pyramids;

import java.io.IOException;
import java.util.Collections;
import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author 
 */
public class MainClass {
  public static void main (String[] args) throws IOException{
    PyramidCSVDAO DAO=new PyramidCSVDAO();
    List<Pyramid> pyramids= DAO.readPyramidsfromCSv("C:\\Users\\Mo.ameen\\Documents\\NetBeansProjects\\pyramids\\pyramids.csv");
 int count1 = 0 ; 
 int count2 = 0;
 
 
for(Pyramid p:pyramids){

System.out.println(""+ (count1++) +p);
}  
      Collections.sort(pyramids, (Pyramid p1, Pyramid p2) -> ((Double)p1.getHeight()).compareTo(p2.getHeight())); // notice the cast to (Integer) to invoke compareTo
    
  System.out.println("Ordered list by height : ");
  for(Pyramid p:pyramids){

System.out.println(" " + (count2++) + p+ "\n");
}  
  
  
       Map<String,Long> map = pyramids.stream()
       .collect(Collectors.groupingBy(Pyramid::getSite, Collectors.counting()));
        System.out.println(map);
        
    
  
  
  
  
  
  }
}