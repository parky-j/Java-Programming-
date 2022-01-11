import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeMap;
 
public class Exam_0922 {
 
    public static void main(String[] args) {
        Random rand = new Random();
        HashMap<Integer, Integer> hm  = new HashMap<Integer, Integer>();
 
        for (int i = 0; i < 10; i++){
            int r = rand.nextInt(100);
            hm.put(r, r + 100);
            System.out.println(r);
        }
 
        System.out.println("\nSorted");
        TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
        
        tm.putAll(hm);
        
        Iterator<Integer> it = tm.keySet().iterator(); 
 
        while (it.hasNext()){
            int key = it.next();
            System.out.println(key + "\t" + tm.get(key));
        }
        
    }
}