package QA_InterviewCode_Capital_One_Bank_2021_2024.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
public class HashmapShort {
    public static void main(String[] args) {
        HashMap<Integer,Character> hm=new HashMap<Integer,Character>();
        hm.put(23,'D');
        hm.put(17,'C');
        hm.put(15,'B');
        hm.put( 9,'A');
        System.out.println(hm);
        Iterator<Integer> it = hm.keySet().iterator();
        System.out.println("Before Sorting");
        while(it.hasNext()) {
            int key=it.next();
            System.out.println(" no:  "+key+"     name:   "+hm.get(key));
        }
        System.out.println("\n");
        TreeMap<Integer,Character> tm=new TreeMap<Integer,Character>(hm);
        System.out.println("After Sorting");
        Iterator<Integer> itr=tm.keySet().iterator();
        while(itr.hasNext()) {
            int key=itr.next();
            System.out.println(" no:  "+key+"     name:   "+hm.get(key));
        }}}
//**********************************************************8
 /*       HashMap<Integer, String> hm=new HashMap<Integer, String>();
        hm.put(23, "Yash");
        hm.put(17, "Arun");
        hm.put(15, "Swarit");
        hm.put( 9, "Neelesh");
        Iterator<Integer> it = hm.keySet().iterator();
        System.out.println("Before Sorting");
        while(it.hasNext()) {
            int key=it.next();
            System.out.println(" no:  "+key+"     name:   "+hm.get(key));
        }
        System.out.println("\n");
        Map<Integer, String> map=new HashMap<Integer, String>();
        System.out.println("After Sorting");
        TreeMap<Integer,String> tm=new TreeMap<Integer,String>(hm);
        Iterator<Integer> itr=tm.keySet().iterator();
        while(itr.hasNext()) {
            int key=itr.next();
            System.out.println(" no:  "+key+"     name:   "+hm.get(key));
        }}}  */
//********************************************************
/*    HashMap<Integer,Integer>map = new HashMap<>();
    map.put(20,1);
    map.put(40,2);
    map.put(60,3);
    map.put(80,4);
        System.out.println(map);
        Iterator<Integer>it = map.keySet().iterator();
        System.out.println("Before : ");
        while(it.hasNext()){
            int key = it.next();
            System.out.println(key +" : "+ map.get(key));}
        TreeMap<Integer,Integer> tm = new TreeMap<>(map);
        Iterator<Integer> itr = tm.keySet().iterator();
        System.out.println("After : ");
        while (itr.hasNext()){
            int key = itr.next();
            System.out.println(key +" : "+ map.get(key));
        }}}  */