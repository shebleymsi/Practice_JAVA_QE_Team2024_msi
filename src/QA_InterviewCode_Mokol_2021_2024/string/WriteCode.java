package QA_InterviewCode_Mokol_2021_2024.string;

import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
public class WriteCode {
    public static void main(String[] args) throws IOException {
String str = "monirul islam";
char[] ar = str.toCharArray();
HashMap<Character,Integer> map = new HashMap<>();
for(Character c: ar){
    if(map.containsKey(c)){
        map.put(c,map.get(c)+1);
    }else{
        map.put(c,1);
    }}
 Set<Character> set =map.keySet();
    for(Character ch : set ){
        if(map.get(ch)>1){
            System.out.println(ch+" : "+map.get(ch)+" times");
        }
    }}}
    /*
        String str = "monirul islam";
        char[] arr = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for (Character ch : arr){
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }else{
            map.put(ch,1);
        }}
    Set<Map.Entry<Character,Integer>> cm = map.entrySet();
    for (Map.Entry<Character,Integer> c : cm){
        System.out.println(c.getKey()+" : "+c.getValue());
    }}}*/
    //+==============================
//String str = "monirul islam";
//char[]ar = str.toCharArray();
//LinkedHashSet <Character> set = new LinkedHashSet<>();
//for(Character c : ar){
//    set.add(c);}
// StringBuilder sb = new StringBuilder();
// for (Character cr : set){
//     sb.append(cr);
//     System.out.print(cr);
// }
//+++++++++++++++++++++++++++++++++
//        String [] str ={"kamal","Aman","tomal","rumon"};
//        String num= "man";
//        int count =0;
//        for (int i=0;i< str.length;i++){
//            if(str[i]== num){
//                count++;
//                System.out.println("number index : "+ i);
//            }}
//        if (count == 0) {
//            System.out.println("not found : ");
//        }}}
//******************************************
/*      int[]num ={1,2,3,45,6,7,8,9};
        int fNum = 45;
        int count=0;
        for (int i=0;i<num.length;i++){
         if(num[i]==fNum){
             count++;
         System.out.println("Number By index : "+i);
     }} if(count==0){
            System.out.println("not found :");
        }}}*/
//****************************************
/*   int[][] num ={{1,2,3},{4,5,6},{7,8,9}};
   for (int i=0;i< num.length;i++){
       for(int j =0;j<num[i].length;j++){
           System.out.println(num[i][j]);
       }}}}*/
//*****************************************
/*    int[]num ={1,2,3,45,6,7,8,9};
    int even=0;
    int odd=0;
    for (int i=0;i<num.length;i++){
        if(num[i]%2==0){
            even++;
        }else{
            odd++;
        }}
        System.out.println(even);
        System.out.println(odd);
    }}*/
//*****************************************
 /*       int[]num ={1,2,3,45,6,7,8,9};
        System.out.print("even : ");
        for (int i=0;i<num.length;i++) {
            if (num[i] % 2 == 0) {
                System.out.print(num[i]+" ");
            }}
        System.out.println();
        System.out.print("odd : ");
        for (int i=0;i<num.length;i++) {
            if (num[i] % 2 != 0) {
                System.out.print(num[i]+" ");
            }}}}*/
//*********************************************
  /*  int [] num ={1,3,4,5,6,2,3,4,6};
    int max =num[0];
    int min =num[0];
    for (int i=0;i< num.length-1;i++){
        if (max<num[i]){
            max=num[i];
        }
    }
        System.out.println("Max : "+max);

    for (int i=0;i<num.length-1;i++){
        if(min>num[i]){
            min=num[i];
        }}
        System.out.print("Min : "+min);
    }}*/
//**********************************************
   /* String [] str ={"kamal","Aman","tomal","rumon"};
    String temp;
    for (int i=0;i<str.length;i++){
        for(int j=0;j< str.length-1-i;j++){
            if(str[i].compareTo(str[j+1])>0){
                temp=str[i];
                str[i]=str[j+1];
                str[j+1]=temp;
            }}}
        for (int i=0;i<str.length;i++){
            System.out.println(str[i]+" ");
        }}}*/
 /*   int[]num ={1,2,3,4,5,6,7,3,4};
    int temp =0;
    for (int i = 0; i<num.length;i++){
        for(int j=0;j< num.length-1-i;j++){
            if(num[j]>num[j+1]){
            temp = num[j];
            num[j]=num[j+1];
            num[j+1]=temp;
        }}}
    for (int i = 0; i<num.length;i++){
        System.out.print(num[i]+" ");
    }}}*/
 /*     int[] a1= {1,2,3,4,5};
        int[] a2 ={6,2,3,9,1};
        int a1length= a1.length;
        int a2length= a1.length;
        int a3length= a1length+ a2length;

        int[]a3 =new int[a3length];

        for (int i=0;i<a1length;i++){
            a3[i]=a1[i];
        }
        for (int i=0;i<a2length;i++){
            a3[a1length+i]=a2[i];
        }
        for (int i=0;i<a3length;i++){
            System.out.print(a3[i]+ " ");
        }}}*/
//***********************************************
 /* int[] a1= {1,2,3,4,5};
    int[] a2 ={6,2,3,9,1};
    HashSet<Integer> set = new HashSet<>();
    for (int i=0;i< a1.length;i++) {
        for (int j = 0; j < a2.length; j++) {
            if (a1[i] == a2[j]) {
                set.add(a1[i]);
                System.out.print(a1[i] + " ");
            }}}}}*/
//***********************************************
       /* int[] num = {1, 2, 3, 4, 5, 6, 7, 2, 3, 4, 5,};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            if (set.add(num[i]) == false) {
                System.out.print(num[i] + " ");
            }}}}*/
//*********************************************
  /* int[]num ={1,2,3,4,5,2,3,4,8};
   HashSet<Integer> set = new HashSet<>();
    System.out.print("Before : ");
    for (Integer ch : num){
    set.add(ch);
    System.out.print(ch+ " ");
}
    System.out.print("After : ");
    for (Integer c : set){
    System.out.print(c+ " ");
}}}*/
//*********************************************
   /* int [] num ={1,2,3,4,5,6,7,9};
    int delNum = 4;
    for (int i=0;i<num.length;i++){
        if(num[i]==delNum){
            for(int j =i;j<num.length-1;j++) {
                num[j] = num[j + 1];
            }}}
        for (int i=0;i<num.length-1;i++){
        System.out.println(num[i]+" ");
    }}}*/
//*******************************************
      /* int[] num ={1,2,3,4,5,7,8,9};
        int misNum=num.length+1;
        int totalNum =misNum*(misNum+1)/2;
        int sum=0;
        for (int i=0;i<num.length;i++){
            sum=sum+num[i];
        }
        System.out.println( totalNum-sum);
    }}*/
/*  int [] num ={1,2,3,4,5,6,7};
  int temp;
  for (int i =0; i<num.length/2;i++){
      temp= num[i];
      num[i]=num[num.length-1-i];
      num[num.length-1-i]= temp;
  }
  for (int i=0;i<num.length;i++){
      System.out.print(num[i]+" ");
  }}}*/
//********************************************
 /*     String line, word = " ";
        int count = 0;
        int maxCount = 0;
        ArrayList<String> words = new ArrayList<>();
        FileReader file = new FileReader("C:/Users/mukul/Desktop/name.txt");
        BufferedReader br = new BufferedReader(file);
        while ((line = br.readLine()) != null) {
            String[] string = line.toLowerCase().split("[,.\\s]");
            for (String st : string) {
                words.add(st);
            }}
        for (int i = 0; i < words.size(); i++) {
            count = 1;
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(i).equals(words.get(j))) {
                    count++;
                }}
            if (count > maxCount) {
                maxCount = count;
                word = words.get(i);
            }}
        System.out.println(word);
    }}*/
//******************************************
     /*
    public static void main(String[] args) throws IOException {
    System.out.println(WriteCode("nice",'c'));
    }
    public static String WriteCode(String a, char b){
        if(a == null)
          return null;
        return a.replaceAll(Character.toString(b)," ");
    }}*/
//******************************************
  /*  String str = "monirul islam mukul";
    String[] arr = str.split("[ ]");
        System.out.println(arr[arr.length-2]);
    }}*/
//******************************************
    /*ArrayList<String> list = new ArrayList<>();
    list.add("kamal");
    list.add("jamal");
    list.add("tomal");

        System.out.println(list.get(0));
        System.out.println(list);
        System.out.println(list.get(list.size()-1));
    }}*/
//*********************************************8
 /*       String []str = {"kamal","jamal","tomal"};
         int []str1 = {1,3,5,7,9,8};
        String st =Arrays.toString(str);
        String st1 =Arrays.toString(str1);
        System.out.println(st);
        System.out.println(st1);
        String []str = {"kamal","jamal","tomal"};
        for (int i = 0;i< str.length;i++){
            System.out.println(str[i]);
        }}}*/
//*********************************************
  /*  String st1 ="cat";
    String st2 ="act";
    checkString(st1,st2);
    }
    public  static void  checkString(String a, String b) {
        boolean status = false;
        if (a.length() != b.length()) {
            status = false;
        } else {
            char[] arr1 = a.toLowerCase().toCharArray();
            char[] arr2 = a.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            status = Arrays.equals(arr1, arr2);
        }
            System.out.println(a + "  Annagrame of : " + b + "=" + status);
        }}*/
//*********************************************
/*        String [] fruits={"Banana","Apple","Orange","Banana","Apple"};
        HashMap<String,Integer> map = new HashMap<>();
        for (String ch : fruits){
            if (map.containsKey(ch)) {
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }}
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        for(Map.Entry<String,Integer> cm : set){
            System.out.println(cm.getKey()+ " : "+ cm.getValue());
        }}}*/
//************************************************
/*    int [] num ={1,2,3,4,5,2,1,4,7};
    HashMap<Integer,Integer> map = new HashMap<>();
    for(Integer ch : num){
    if (map.containsKey(ch)){
        map.put(ch,map.get(ch)+1);
    }else{
        map.put(ch,1);
    }}
    Set<Map.Entry<Integer,Integer>>im=map.entrySet();
    for(Map.Entry<Integer,Integer>mp : im){
        System.out.println(mp.getKey() +" : "+mp.getValue());
        }}}*/
//*************************************************
/*        String str = "monirul islam";
        char[] arr = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for (Character ch : arr){
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }else{
            map.put(ch,1);
        }}
    Set<Map.Entry<Character,Integer>> cm = map.entrySet();
    for (Map.Entry<Character,Integer> c : cm){
        System.out.println(c.getKey()+" : "+c.getValue());
    }}}*/
//**************************************
/*String str ="monirul islam";
char[] arr= str.toCharArray();
HashMap<Character,Integer> map = new HashMap<>();
for(Character ch : arr){
    if(map.containsKey(ch)){
        map.put(ch,map.get(ch)+1);
    }else{
        map.put(ch,1);
    } }
Set<Character> set=map.keySet();
 for (Character cm:set){
     if(map.get(cm)>1){
        System.out.println(cm +" : " +map.get(cm) );
    }}}*/
// *********************************
/*    String []str ={"orange","Apple","Banana","Apple","orange"};
    HashMap<String,Integer> map = new HashMap<>();
    for (String ch : str){
        if (map.containsKey(ch)){
            map.put(ch, map.get(ch)+1);
        }else{
            map.put(ch,1);
        } }
    Set<String> cm = map.keySet();
    for (String st : cm){
        if(map.get(st)>1);
        System.out.println(st +" : "+map.get(st));
    }}}*/
//******************************************
 /* int [] num ={1,2,3,4,5,2,3,4};
    HashMap<Integer,Integer> map = new HashMap<>();
    for(Integer in: num){
        if (map.containsKey(in)){
            map.put(in,map.get(in)+1);
        }else{
            map.put(in,1);
        }}
    Set<Integer> cm = map.keySet();
    for(Integer st : cm){
        if(map.get(st)>1);
        System.out.println(st +" : "+map.get(st));
    }}}*/
//***********************************
/*    String str ="monirul islam";
      char[]arr = str.toCharArray();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(Character ch :  arr){
            set.add(ch);
        }
       StringBuffer sb = new StringBuffer();
        for (Character c : set){
            sb.append(c);
        System.out.print(c );
    }}}
  String []str = {"banana","Apple","banana","orange"};
  LinkedHashSet <String> set = new LinkedHashSet<>();
  for (String ch : str){
      set.add(ch);
  }
  StringBuffer sb = new StringBuffer();
  for (String sr : set){
      sb.append(sr);
        System.out.println(sr);
    }}}*/
//*************************************888
/*  int []str ={1,2,3,4,2,3} ;
  LinkedHashSet <Integer> set = new LinkedHashSet<>();
  for (Integer ch : str){
      set.add(ch);
  }
  StringBuffer sb = new StringBuffer();
  for (Integer sr : set){
      sb.append(sr);
        System.out.println(sr);
    }}}*/
//*******************************************
 /*     String str = "Monirul islam";
        char[]arr = str.toCharArray();
        String subString = null;
        int subStringLength = 0;
        HashMap<Character,Integer>map= new HashMap<>();
        for (Character ch : arr){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else {
                map.clear();
            }}
        if(map.size()>subStringLength){
            subStringLength= map.size();
            subString=map.keySet().toString();
        }
        System.out.println(subString);
        System.out.println(subStringLength);
    }}*/
//***********************************************
/*String str ="monirul islma";
int[] num = new int[256];
for (int i = 0;i<str.length();i++)
    num[str.charAt(i)]++;
    int max =1;
    char result=' ';
    for (int i = 0;i<str.length();i++){
        if (max< num[str.charAt(i)]){
            max= num[str.charAt(i)];
             result=str.charAt(i);
            }}
        System.out.println(result);
    }}*/
//***************************************
 /*   String str="monirul islam";
    int count=0;
    for (int i = 0;i<str.length();i++){
        if(str.charAt(i)!=' ')
            count++;}
        System.out.println(count);
    }}*/
//*******************************
 /*   String str = "mom";
    String rev ="";
    for (int i=str.length()-1;i>=0;i--){
        rev = rev+ str.charAt(i);
    }
    if(str.equals(rev)){
        System.out.println("it is palindrome");
    }else{
        System.out.println("not a palindrome");
    }}}*/
//***********************************




