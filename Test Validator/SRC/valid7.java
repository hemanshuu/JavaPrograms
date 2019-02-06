import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.File;
class NameValidator{
	boolean nameValidator(String fileName, String fileType){
		System.out.println("File name is: "+fileName+" and its type is:"+fileType);
		boolean b;
		b=emptyfileName(fileName);
		if (b==true)
			return false;
		b=missingDot(fileName);
		if (b==true)
			return false;
		b=fileFormat(fileName);
		if (b==true)
			return false;
		b=fileLength(fileName);
		if (b==true)
			return false;
		b=specialCharacter(fileName);
		if (b==true)
			return false;
		
		if(fileType.equals("csv")){
			b=csvOnly(fileName);
			if (b==false)
				return false;
		}
		if(fileType.equals("json")){
			b=jsonOnly(fileName);
			if (b==false)
				return false;
		}
	
	   if(fileType.equals("csv")){
			b=fileNotAvailable(fileName);
			if (b==true)
				return false;
		}
		if(fileType.equals("json")){
			b=fileExist(fileName);
			if (b==true)
				return false;
		}
		return true;
	}
	boolean emptyfileName(String fileName){
		if (fileName==""){
			return true;
		}
		else{
			return false;
		}
	}
	boolean missingDot(String fileName){
		boolean value=Pattern.matches(".*[.].*",fileName);
		if (value==true){
			return false;
		}
		else{
			return true;
		}
	}
	boolean fileFormat(String fileName) {
		String [] extn = fileName.split("\\.");
		if (extn.length<=1) {
			return true;
		}
		else{ 
			return false;
		}
	}
	boolean fileLength(String fileName){
		int fileLength=25;
		String namelength = fileName.split("\\.")[0];
		if(namelength.length()>fileLength)
			return true;
		else 
			return false;
	}
	boolean specialCharacter(String fileName){
		fileName = fileName.split("\\.")[0];
		boolean finalValue=Pattern.matches(".*[@#$%^&(,)_].*",fileName);
		if (finalValue == true)
			return true;
		else
			return false;
	}
	boolean csvOnly(String fileName) {
		String[] name = fileName.split("\\.");		
		//now name[0] contains the fileName and name[1] contains the extension
		if(name[1].equals("csv")==true)
			return true;
		else
			return false;
	}
	boolean jsonOnly(String fileName) {
		String[] name = fileName.split("\\.");		
		if(name[1].equals("json")==true)
			return true;
		else
			return false;
	}
	boolean fileNotAvailable(String fileName){
		File f = new File(fileName);
		if(f.exists()==true)
			return false;
		else
			return true;
	}
	boolean fileExist(String fileName){
		File f = new File(fileName);
		if(f.exists()==true)
			return true;
		else
			return false;
	}
}
	



class testnamevalidator{
	public static void main(String[] args){
		NameValidator csvObject = new NameValidator();
		boolean checkValidator = csvObject.nameValidator("","csv");
		System.out.println(checkValidator + " Empty file ");
		checkValidator = csvObject.nameValidator("examplecsv","csv");
		System.out.println(checkValidator + " Dot missing");
		checkValidator = csvObject.nameValidator("example.csv.txt","csv");
		System.out.println(checkValidator + " File Format");
		checkValidator = csvObject.nameValidator("exampleeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee.csv","csv");
		System.out.println(checkValidator + " More than 25 characters");
		checkValidator = csvObject.nameValidator("example@.csv","csv");
		System.out.println(checkValidator+ " Issue in special charaters");
		checkValidator = csvObject.nameValidator("example.csv","csv");
		System.out.println(checkValidator+ " All validations done");

		checkValidator = csvObject.nameValidator("example.csv","csv");
		System.out.println(checkValidator + " CSV Expected CSV input");
		checkValidator = csvObject.nameValidator("example.json","json");
		System.out.println(checkValidator + " JSON expected JSON input ");
		checkValidator = csvObject.nameValidator("example.jpg","json");
		System.out.println(checkValidator + " JSON expected jpg input");		

      
		
	}
}
