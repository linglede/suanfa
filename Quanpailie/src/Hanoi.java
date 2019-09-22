public class Hanoi {
    public static void main(String []args){
    Hanoi hanoi=new Hanoi();
    System.out.println("step:");
    hanoi.hanoi('A','B','C',4);
    }
    public  void hanoi(char A,char B,char C,int n) {
        if (n == 1) {
            move(A, C);
        } else {
            hanoi(A, B, C, n - 1);
            move(A, B);
            hanoi(C, B, A, n - 1);
        }
    }
    public static void move(char a,char b){
        System.out.println("move  "+a+"->"+b);

    }
}
