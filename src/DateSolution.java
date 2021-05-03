import java.io.*;
import java.math.*;
import java.sql.Time;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DateSolution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
    	DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
    	DateFormat newDtfr = new SimpleDateFormat("HH:mm:ss");
    	
    	Date date = null;
    	String output = null;
    	try {
            //Converting the input String to Date
    		date= df.parse(s);
            //Changing the format of date and storing it in String
       	    output = newDtfr.format(date);
       	   
    	}catch (ParseException e) {
    		e.printStackTrace();
		}
    	return output;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	BufferedWriter bw = null;
    	try {
         bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);
        System.out.println(result);
        bw.write(result);
        bw.newLine();
    	}catch(Exception ex){
    		ex.printStackTrace();
    	}finally {
          bw.close();
    	}
    }
}
