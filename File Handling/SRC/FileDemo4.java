import java.io.*;
 class FileDemo4 {
   
   public static void main(String[] args) {
     
            try {
         
              File f = new File("file.txt");
              FileReader fin = new FileReader(f);
	      BufferedReader bin= new BufferedReader(fin);
 	      String sr;
	      System.out.println("The contents of the file are: ");	
		 while((sr=bin.readLine())!=null){
                         System.out.println(sr);
			} 
		}
		catch (Exception e) {
         // if any I/O error occurs
         e.printStackTrace();
   }
 } }