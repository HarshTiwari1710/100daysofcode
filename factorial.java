public class factorial {
   public static int fact(int num){
       if (num==0||num==1) {
          return 1; 
       } else {
           return fact(num-1)*num;
       }
   }
   public static void main(String[] args) {
       System.out.println(fact(123));
   }
}

