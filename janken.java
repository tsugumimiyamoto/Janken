import java.util.Scanner;
public class Janken {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("1はグー、2はチョキ、3はパーとする。");
	   System.out.println("先手入力してください。");
	   int a = sc.nextInt();
	   System.out.println("後手入力してください。");
	   int b = sc.nextInt();
	   if(a==b) {
		   System.out.println("あいこ");
	   }else if(a==3 && b==1 || a+1==b) {
		   System.out.println("先手の勝ち");
	   }else {
		   System.out.println("後手の勝ち");
	   }
   }
}




