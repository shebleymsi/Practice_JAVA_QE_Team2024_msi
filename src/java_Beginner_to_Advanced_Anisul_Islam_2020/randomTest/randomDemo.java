package java_Beginner_to_Advanced_Anisul_Islam_2020.randomTest;

public class randomDemo {

    public static void main(String[] args) {

 
 // 0 1 2 3 4 5 6 7 8 9 = [0 to 10]
 // 0 1 2 = [0 to 3]
 // 0+1=1 1+1=2 2+1=3 3+1=4 4+1=5 5+1=6 6+1=7 7+1=8 8+1=9 9+1=10 [1 to 10]
 
 // Random rand = new Random();
 
 /* int randomNumber = rand.nextInt(10);   //0 to 10 ... 0 lowest  9 highest 
    System.out.println("Random Number : "+randomNumber); */

 /* int randomNumber = rand.nextInt(3);   //0 to 2 ... 0 lowest  2 highest 
    System.out.println("Random Number : "+randomNumber); */
 
 /* int randomNumber = rand.nextInt(10) + 1;   //1 to 10... 0+1=1 lowest 9+1=10 highest 
    System.out.println("Random Number : " + randomNumber);*/    
        
 /* int randomNumber = rand.nextInt(6)+5;   //5 to 10 ... 5 lowest  10 highest
   System.out.println("Random Number : "+randomNumber);*/   
        
 /* int randomNumber = rand.nextInt(91)+10;   //10 to 100 ... 10 lowest 100 highest
    System.out.println("Random Number : "+randomNumber);*/      
        
 /* int randomNumber = (int) (Math.random()*10);   //0 to 9....0 lowest 9 highest
    System.out.println("Random Number : "+randomNumber); */    
         
    int randomNumber = (int) (Math.random() * 10) + 1;   //0 to 9...0+1=1 lowest  9+1=10 highest
    System.out.println("Random Number : " + randomNumber);   
        
    }

}
