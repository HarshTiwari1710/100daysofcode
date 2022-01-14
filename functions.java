public class functions {

    static void max(int a, int b, int c){
        if(a>b && b>c){
            System.out.println("a is the largest");
        } else if(b>a && b>c) {
            System.out.println("b is the largest");
        } else {
            System.out.println("c is the largest");
        }
        

    }
     public static void main(String[] args) {
        max(8, 9, 10);
        
    }
}
