package QA_InterviewCode_Capital_One_Bank_Old_2021_Monirul_2024.practise;

public class code {
    public static void main(String[]arg) {
 /*   String str ="monirul islam";
    char[]ar = str.toCharArray();
    LinkedHashSet <Character> set = new LinkedHashSet<>();
    for (Character ch : ar){
        set.add(ch);}
    StringBuilder sb = new StringBuilder();
    for (Character c : set){
        sb.append(c);
        System.out.print(c);
    }}}*/
//=================================================
/*      int[] num ={1,2,3,4,1,2,3};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (Integer ch : num){
            set.add(ch);}
        StringBuilder sb = new StringBuilder();
        for(Integer c : set){
            sb.append(c);
            System.out.print(c +", ");
        }}}*/
//==================================================
/*   char[] str = {'a','b','c','a','c'};
   LinkedHashSet<Character>set = new LinkedHashSet<>();
   for (Character ch : str){
       set.add(ch);}
   StringBuilder sb = new StringBuilder();
   for (Character c : set ){
       sb.append(c);
       System.out.println(c);
   }}}*/
//==========================================
/*    String []str = {"aman","jaman","kaman","aman"};
    LinkedHashSet<String>set = new LinkedHashSet<>();
    for (String ch : str ){
        set.add(ch);}
    StringBuilder sb = new StringBuilder();
    for (String c: set){
        sb.append(c);
        System.out.println(c);
    }}} */
//=============================================
/*  String str = "monirul islam";
    char[] ar= str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for (Character ch : ar ){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch, 1);}}
        Set<Character> set = map.keySet();
        for (Character c: set){
            if(map.get(c)>1);
        System.out.println(c+" : "+ map.get(c)+" times");}}}*/
//=================================================
/*int[]num ={1,2,3,4,1,2,3};
HashMap<Integer,Integer> map = new HashMap<>();
for (Integer ch : num){
    if(map.containsKey(ch)){
        map.put(ch,map.get(ch)+1);
    }else {
        map.put(ch,1);
    }}
Set<Integer>set = map.keySet();
for (Integer c: set){
    if(map.get(c)>1);
    System.out.println(c +" : "+map.get(c)+" times");}}}*/
//===================================================
/* String[] str = {"aman", "jamal", "kaman", "aman"};
HashMap<String,Integer> map = new HashMap<>();
for(String ch : str){
    if(map.containsKey(ch)){
        map.put(ch,map.get(ch)+1);
    }else{
        map.put(ch,1);
    }}
Set<String>set = map.keySet();
for (String c: set){
    if (map.get(c)>1);
    System.out.println(c + " : "+map.get(c)+" times" );}}} */
//==================================================
/*char[] ar ={'a','c','d','a','c'};
HashMap<Character,Integer> map = new HashMap<>();
for (Character ch : ar){
    if(map.containsKey(ch)){
        map.put(ch,map.get(ch)+1);
    }else{
        map.put(ch,1);}}
Set<Character> set =map.keySet();
for (Character c : set){
    if(map.get(c)>1);
    System.out.println(c +" : "+map.get(c) +" times ");}}}*/
//===================================================
/*  String str ="monirul islam";
    char [] ar = str.toCharArray();
    HashMap<Character,Integer> map = new HashMap<>();
    for(Character ch : ar ){
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }else {
            map.put(ch,1);}}
    Set<Map.Entry<Character,Integer>> set= map.entrySet();
    for(Map.Entry<Character,Integer> c : set){
        System.out.println("All Character count : "+c.getKey()+ " : "+c.getValue());}}}*/
//==================================================
/*int [] num ={1,2,3,4,1,2,3,5};
HashMap<Integer,Integer> map = new HashMap<>();
for (Integer ch : num){
    if(map.containsKey(ch)){
        map.put(ch,map.get(ch)+1);
    }else{
        map.put(ch,1);
    }}
Set<Map.Entry<Integer,Integer>>set =map.entrySet();
for (Map.Entry<Integer,Integer> c: set){
        System.out.println(c.getKey()+ " : "+c.getValue());
}}}*/
//==========================================
/*String [] str ={"aman","jaman","tomal","aman"};
    HashMap<String,Integer> map = new HashMap<>();
    for (String ch : str){
        if(map.containsKey(ch)){
        map.put(ch,map.get(ch)+1);
        }else{
        map.put(ch,1);
        }}
        Set<Map.Entry<String ,Integer>>set =map.entrySet();
        for(Map.Entry<String ,Integer> c: set){
        System.out.println(c.getKey()+ " : "+c.getValue());
        }}}*/
//==============================================
/*     char [] str ={'a','d','c','a'};
    HashMap<Character,Integer> map = new HashMap<>();
    for (Character ch : str){
            if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
            }else{
            map.put(ch,1);
            }}
    Set<Map.Entry<Character ,Integer>>set =map.entrySet();
    for (Map.Entry<Character,Integer> c: set){
    System.out.println(c.getKey()+ " : "+c.getValue());
        }}} */
//=================================================
/*  String line,word =" ";
    int maxCount=0;int count=0;
    ArrayList<String> words = new ArrayList<>();
        FileReader file = new FileReader("C:/Users/mukul/Desktop/java.txt");
        BufferedReader br = new BufferedReader(file);
    while((line=br.readLine())!= null) {
        String[] string = line.toLowerCase().split("[,.\\s]");
        for (String st : string) {
            words.add(st);
        }}
    for(int i=0;i<words.size();i++) {
        count = 1;
        for (int j = i + 1; j < words.size(); j++) {
            if (words.get(i).equals(words.get(j))) {
                count++;
            }}
    if(count>maxCount){
        maxCount=count;
        word=words.get(i);
    }}
    System.out.println("most repeated word  : "+word);
    }} */
//================================================
/*    String str ="abcdefabab";
    char[]arr = str.toCharArray();
    String subString= null;
    int subStringLength=0;
    HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (!map.containsKey(c)) {
                map.put(c, i);
            } else {
                i = map.get(c);
                map.clear();
            }
    if (map.size()> subStringLength){
        subStringLength=map.size();
        subString=map.keySet().toString();
    }}
        System.out.println("input : "+ str);
        System.out.println("subString : "+ subString);
        System.out.println("subStringLength  : "+ subStringLength);
}} */
//====================================
/*String str = "monirul islam";
String rev = "";
for(int i =str.length()-1;i>=0;i--){
    rev = rev+ str.charAt(i);
}
        System.out.println(rev);
    }}*/
//====================================
/*   String str = "MOM";
   String rev="";
   for (int i =str.length()-1;i>=0;i--){
       rev = rev + str.charAt(i);}
       if(str.equals(rev)){
           System.out.println("it is palindrome");
       }else{
           System.out.println("not a palindrome");
       }}}*/
//======================================
/*String str = "monirul islam";
int count =0;
for (int i = 0;i<str.length()-1;i++){
    if(str.charAt(i)!=' '){
        count++;
    }}
        System.out.println(count);
    }} */
//======================================
/*String str = "monirul islam";
String [] words = str.split("[ ]");
  System.out.println(words[words.length-1]);
    }}*/
//=======================================
  /*public static void main (String []arg){
   String str1 ="cat";
   String str2 ="act";
   checkString(str1,str2); }
public static void checkString(String a,String b){
    boolean status;
    if(a.length()!=b.length()){
        status= false;
    }else{
        char[]arr1 = a.toLowerCase().toCharArray();
        char[]arr2 = b.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
       status= Arrays.equals(arr1,arr2);}
    System.out.println(a+" is Annagrame of "+ b +" = "+ status);
        }}*/
//=======================================
/*    HashMap<Integer,Character> map = new HashMap<>();
    map.put(20,'a');
    map.put(30,'b');
    map.put(40,'c');
    map.put(50,'d');
    System.out.println(map);
    Iterator<Integer>it = map.keySet().iterator();
    System.out.println("Befor : ");
    while (it.hasNext()){
    int key =it.next();
       System.out.println(key +" : "+map.get(key));}
   TreeMap<Integer,Character> tm = new TreeMap<>(map);
   System.out.println("After : ");
   Iterator<Integer>itr = tm.keySet().iterator();
   while(itr.hasNext()){
       int key = itr.next();
       System.out.println(key +" : "+map.get(key));
   }}} */
//=====================================
/*  HashMap<Integer,String> map =  new HashMap<>();
  map.put(10,"Aman");
  map.put(20,"babul");
  map.put(30,"chomok");
  map.put(40,"Dolon");
  System.out.println(map);
  Iterator<Integer> it= map.keySet().iterator();
  System.out.println("Before : ");
  while(it.hasNext()){
      int key = it.next();
      System.out.println(key +" : "+map.get(key));}
  TreeMap<Integer,String >tm = new TreeMap<>(map);
  System.out.println("After : ");
  Iterator<Integer> itr= tm.keySet().iterator();
  while(itr.hasNext()){
      int key = itr.next();
      System.out.println(key +" : "+map.get(key));
    }}} */
//========================================
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
//===========================================
/* int [] num ={1,2,3,4,5,7,8};
   int miNum = num.length+1;
   int totalNum = miNum*(miNum+1)/2;
        System.out.println("Total : "+totalNum);
        int sum =0;
        for (int i=0;i<num.length;i++){
            sum=sum+num[i];
            System.out.println(sum);
        }
        System.out.print("missing Number : "+ (totalNum-sum));
    }} *///print : 6
//=============================================
/*    int [] num ={1,2,3,4,5,6,1,2,3,};
    HashSet < Integer> ha = new HashSet<>();
    for (Integer ch : num){
        ha.add(ch);}
    for(Integer c: ha){
        System.out.println(c);
    }}} */ // print :1 2 3 4 5 6
//============================================
/*int[]num ={1,2,3,4,5,2,3};
HashSet<Integer>hs = new HashSet<>();
for(Integer ch : num){
   if(hs.add(ch)==false){
        System.out.println(ch);
    }}}} *///print :2 3
//==========================================
/*    int[]nm1 ={1,3,5,2} ;
    int[]nm2 ={2,4,6,1,3} ;
   HashSet<Integer>set = new HashSet<>();
    for(int i=0;i<nm1.length;i++){
        for (int j=0; j< nm2.length;j++){
            if(nm1[i]==nm2[j]){
                set.add(nm1[i]);
        System.out.println(nm1[i]+" ");
    }}}}}*/
//=========================================
/*        int[] a1 = {1,3,5,7,9};
        int[] a2 = {2,4,6,8,10};
        int a1length = a1.length;
        int a2length = a2.length;
        int a3length = a1length + a2length;
        int[] a3 = new int[a3length];

        for (int i = 0; i < a1length; i++) {
            a3[i] = a1[i];
        }
        for (int i = 0; i < a2length; i++) {
            a3[a1length + i] = a2[i];
        }
        for (int i = 0; i < a3length; i++) {
            System.out.print(a3[i]+ " ");
        }}} */
//===========================================
/*    int[]n1 ={1,2,3,4,5,6,7};
    int temp;
    for (int i=0;i<n1.length/2;i++) {
        temp = n1[i];
        n1[i] = n1[n1.length - 1 - i];
        n1[n1.length - 1 - i] = temp;
        }
    for (int i=0;i<n1.length;i++)
        System.out.print(n1[i]+" ");
 }} */
//==========================================
/*int []num ={1,2,3,4,5,6};
int sum=0;
for(int i=0; i<num.length;i++){
    sum = sum+num[i];
 }
    System.out.println("Total Sum : "+sum);
 }}*/
//=========================================
/*int[] num ={1,2,3,4,5,6};
String n1 = Arrays.toString(num);
        System.out.println(n1);
    }}*/
//=========================================
 /*  int[]num ={1,2,3,4,5,6};
     int dNum=4;
     for (int i=0;i<num.length;i++){
        if(num[i]==dNum){
            for (int j=i;j<num.length-1;j++){
                num[j] = num[j+1];
            }}}
     for (int i=0;i<num.length-1;i++){
        System.out.print(num[i]+" ");
    }}}   */
//=========================================
/*   int[] num = {1, 2, 3, 4, 5, 6};
    System.out.println("Before Remove : "+Arrays.toString(num));
   int dNum= 3;
   for (int i=dNum;i<num.length-1;i++){
       num[i]=num[i+1];
   }
   System.out.println("After Remove : "+Arrays.toString(num));
    }}   */
//=========================================
/*int [] num ={1,2,3,4,5,6,78,9,80};
int odd = 0;
int even = 0;
for (int i =0; i<num.length; i++){
    if(num[i] % 2==0){
        even++;
    }else{
        odd++;
    }}
        System.out.println(odd);
        System.out.println(even);
    }}*/
//====================================
/*   int [] num ={1,2,3,4,5,6,78,9,80};
        System.out.print("Even Number : ");
     for (int i =0;i<num.length-1;i++){
       if(num[i]%2==0) {
       System.out.print(num[i] + " ");
       }}
       System.out.println();
       System.out.print("Odd Number :");
     for (int j =0;j<num.length-1;j++){
       if(num[j]%2!=0){
       System.out.print(num[j]+" ");
  }}}}*/
//====================================
/*    int[] num = {1,2,3,4,56,7,8};
    int max =num[0];
    int min =num[0];
    for (int i=1;i<num.length;i++){
         if (min>num[i]){
             min=num[i];
        }}
        System.out.println("Maximum : "+min);
    for (int i=1;i<num.length;i++){
        if (max<num[i]){
            max=num[i];
            }}
        System.out.println("Minimum : "+max);
    }}  */
//======================================
/*   int[][] num = {{1, 2, 3, 4},{ 5, 6, 7, 8},{9,8,7,6}};
     for (int i=0;i<num.length;i++){
         for (int j=0;j<num[i].length;j++){
        System.out.print(num[i][j]+" ");
    }}}}*/
//========================================
/*int []num ={1,2,8,5,9,7,3};
int temp;
for (int i=0;i< num.length;i++){
    for (int j=0;j< num.length-1-i;j++){
        if (num[j]>num[j+1]){
            temp=num[j];
            num[j]=num[j+1];
            num[j+1]=temp;
        }}}
for (int i=0;i< num.length;i++){
    System.out.print(num[i]+" ");
}}}*/
//===========================================
/*    String[] str = {"aman", "kamal", "tomal", "Roman"};
    String temp;
    for (int i=0;i<str.length;i++){
        for (int j=0;j<str.length-1-i;j++){
            if (str[i].compareTo(str[j+1])>0){
                temp=str[i];
                str[i]=str[j+1];
                str[j+1]=temp;
            }}}
    for (int i=0;i<str.length;i++){
        System.out.println(str[i]);
    }}}  */
//=============================================
       int[]num ={1,2,3,4,5,6,7};
        int temp;
        for (int i = 0;i<num.length;i++){
            for (int j =i+1;j<num.length;j++) {

                if(num[i]<num[j]){
                    temp =num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }}}
        System.out.println("1st small number :"+num [num.length-1]);
        System.out.println("1st small number :"+num [num.length-3]);
        System.out.println("2nd large number :"+num [1]);
        System.out.println("1st large number :"+num [0]);
        System.out.println("Array size :"+num.length);
    }}
//=============================================
/*String str ="test string issue";
int[]arr = new int [256];
for (int i=0;i<str.length();i++)
    arr[str.charAt(i)]++;
        int max = 1;
        char result =' ';
        for (int i=0;i<str.length();i++){
            if(max<arr[str.charAt(i)]){
                arr[str.charAt(i)]=max;
                result=str.charAt(i);
            }
        }
        System.out.println(result);
    }}*/
//==============================================
/*    int remainder;
    int reverse =0;
    int num =1212;
    int temp=num;
    while (temp!=0){
        remainder = temp%10;
        reverse=reverse*10+remainder;
        temp= temp/10;
    }
        System.out.println(reverse);
    if(num==reverse){
        System.out.println("palindrome");
    }else{
        System.out.println("Not palindrome");
    }}}*/
//==============================================
/*        String str = "monirul islam";
        System.out.println(removeCharacter(str));
    }
public static String removeCharacter(String str){
    StringBuilder sb = new StringBuilder(str);
    sb.deleteCharAt(str.length()-1);
    sb.deleteCharAt(4);
    sb.deleteCharAt(5);
        return sb.toString() ;
        }}  */
//=========================================
/*    int num =9;
        int count = 0;
        for (int i =2; i < num ; i++){
        if (num % i == 0) {
        count++;
        }
        }
        if (count==0) {
        System.out.println(num + "-- prime number.");
        } else {
        System.out.println(num + "-- not a prime number.");
        }
        }*/
        //========================================

