package LeetcodeJava;
import java.util.Scanner;


public class GuessNumber2 {
    public static void main(String[] args) {
        Solution2 s2=new Solution2();
        Scanner scan1=new Scanner(System.in);
        int []g=new int[3];
        int []an=new int[3];
        int i=0;
        for (i=0;i<3;i++){
            if(scan1.nextInt()<4)g[i]=scan1.nextInt();
            else System.out.println("请输入3以内的数");
        }

        for (i=0;i<3;i++) {
            if(scan1.nextInt()<4)an[i]=scan1.nextInt();
            else System.out.println("请输入3以内的数");
        }

       /* System.out.println("an输入完成");

        for (i=0;i<3;i++) {
            System.out.println("g["+i+"]="+g[i] +"      an["+i+"]="+an[i]         );
        }*/
    /*    System.out.println("guess = [");
        for (i=0;i<3;i++){
            g[i]=scan1.nextInt();
            System.out.println(",");
            }
        System.out.println("guess = [");
        for (i=0;i<3;i++){
            an[i]=scan1.nextInt();
            System.out.println(",");
        }*/

        switch (s2.game(g,an)){
            case 0:System.out.println("一个没猜对");break;
            case 1:System.out.println("猜对一个");break;
            case 2:System.out.println("猜对两个");break;
            case 3:System.out.println("全部猜对了");break;
            default: System.out.println("错误信息");break;
        }
        }

    }
class Solution2 {
    public int game(int[] guess , int[] answer) {
     int r=0;
        for (int i=0;i<3;i++){
            System.out.println("guess = ["+guess[i]+"]  ,   answer = ["+answer[i]+"]");
            if (guess[i]==answer[i])r++;
        }
        return r;
    }
}