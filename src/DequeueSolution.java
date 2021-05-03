import java.util.*;
import java.util.stream.IntStream;

public class DequeueSolution {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        
      //Solution - 1
       /* int m = in.nextInt();

        Set<Long> set = new HashSet<Long>();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addLast(num);
            if(deque.size()==3) {
                set.add(deque.stream().distinct().count());
                deque.removeFirst();
            }
        }
        
        Long uniqueCount = set.stream().mapToLong(i->i).max().getAsLong();
        System.out.println("uniqueCoun:"+uniqueCount);*/
        
        for (int i = 1; i <= 10; i++) {
        	 System.out.println(n+" x " +i+" = "+n*i);
        }

        //Solution - 2
        /*int uniqueCount = IntStream.range(0, deque.size()).filter(i-> m+i<=n).mapToObj(i-> Arrays.copyOfRange(deque.toArray(), i+0,m+i)).
           mapToInt(i-> new HashSet(Arrays.asList(i)).size()).max().getAsInt();
        
        System.out.println("uniqueCount 1:"+uniqueCount);*/
        
        //Solution - 3
       /* Deque<Object[]> list = new ArrayDeque<>();
        for(int i=0;i<deque.size();i++) {
        	if(m<=n) {
        		Object[] subArr = Arrays.copyOfRange(deque.toArray(), i+0,m);
        		m++;
        		list.add(subArr);
        	}
        }*/
        
        /*int uniqueCount1 = list.parallelStream().mapToInt(i-> new HashSet(Arrays.asList(i)).size()).max().getAsInt();
        System.out.println(uniqueCount1);*/
       
	}

}
