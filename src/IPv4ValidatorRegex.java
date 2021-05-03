import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{
	   private static final String IPV4_PATTERN =
	            "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$";
	   private static final Pattern pattern = Pattern.compile(IPV4_PATTERN);
	   
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(isValid(IP));
        }	

    }
    
    public static boolean isValid( String IP) {
        Matcher matcher = pattern.matcher(IP);
        return matcher.matches();
    }
}
