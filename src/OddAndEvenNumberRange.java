import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.Stream;

public class OddAndEvenNumberRange {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	       Scanner scan = new Scanner(System.in);
	        int a = scan.nextInt();
	        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(br.readLine());
        int c = scan.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
	
	}

}
