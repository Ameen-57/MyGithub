import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class InputSrting {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your string ");  
        String str = "anyString";  
        
        String Str1 ="";
        
        while(!str.equals("stop")){
            str= sc.nextLine();
            Str1 += str ;
            Str1 += ",";
        }
        
        
        FileWriter writer = new FileWriter("Myfile.txt");
        try (BufferedWriter buffer = new BufferedWriter(writer)) {
            for (String string : Str1.split(",")) {
                buffer.write(string+" ");
            }
        }


        
}
}