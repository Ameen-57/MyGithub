import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class InputSrting {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your string ");  
        String str = "anyString";
        String fullString ="";
        while(!str.equals("stop")){
            str= sc.nextLine();
            fullString += str ;
            fullString += ",";
        }
        FileWriter writer = new FileWriter("Myfile.txt");
        try (BufferedWriter buffer = new BufferedWriter(writer)) {
            for (String string : fullString.split(",")) {
                buffer.write(string+" ");
            }
        }


        
}
}