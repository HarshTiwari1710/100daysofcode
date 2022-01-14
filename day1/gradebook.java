public class gradebook {
    static void grade(int marks){
        if(marks<=100 || marks>=91){
            System.out.println("The Grade is AA");
        } else if(marks<=90 || marks>=81){
            System.out.println("The Grade is AB");
        } else if(marks<=80 || marks>=71){
            System.out.println("The Grade is BB");
        } else if(marks<=70 || marks>=61){
            System.out.println("The Grade is BC");
        } else if (marks<=60 || marks>=51) {
            System.out.println("The grade is CD");
        } else if (marks<=50 || marks>=41) {
            System.out.println("The grade is DD");
        } else if (marks<=40) {
            System.out.println("The student is fail");
        }
    }
    public static void main(String[] args) {
        grade(89);
    }
}
// Marks        Grade
// 91-100         AA
// 81-90          AB
// 71-80          BB
// 61-70          BC
// 51-60          CD
// 41-50          DD
// <=40          Fail
