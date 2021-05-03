import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinAndMaxSolution {

    //Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
      // min=max=sum=arr[0];
/*       for(int i=1;i<arr.length;i++){
    	   temp = arr[i];
           sum=sum+arr[i];
           if(max>temp) {
        	   if(min>temp) {
            	   temp=min;
               } 
           }else {
        	   max=temp;  
           }           
       }*/
    	List<Long> arrList = new ArrayList<>();
    	for(int a:arr) {
    		arrList.add(new Long(a));
    	}
       Long min = arrList.stream().mapToLong(f->f).min().getAsLong();
       Long max = arrList.stream().mapToLong(f->f).max().getAsLong();
       Long sum = arrList.stream().mapToLong(f->f).sum();
       
       System.out.println( (sum - max) + " " + (sum - min));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
