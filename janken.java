import java.util.Scanner;
public class Janken {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int a = sc.nextInt();
	   int b = sc.nextInt();
	   if(a<b) {
		   System.out.println("グーの勝ちでチョキの負け");
	   }else {
	   System.out.println("あいこ");
	   }
   }
}