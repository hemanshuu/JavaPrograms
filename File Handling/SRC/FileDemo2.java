import java.io.*;
import java.util.*;
class FileDemo2 {
   public static void main(String[] args) {
      File f = null;
      
            f = new File("file.txt");
            FileWriter fout = new FileWriter(f);
            BufferedWriter bout= new BufferedWriter(fout);
	     Scanner sc = new Scanner(System.in);
             System.out.print("\nEnter a String:");
 	     while(sc.hasNext()){
               bout.write(sc.nextLine());
               bout.newLine();
        }
            bout.close();
 } }
