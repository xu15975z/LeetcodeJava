package LeetcodeJava;

import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Solution s1=new Solution();
        switch (s1.game()){
            case 0:System.out.println("一个没猜对");break;
            case 1:System.out.println("猜对一个");break;
            case 2:System.out.println("猜对两个");break;
            case 3:System.out.println("全部猜对了");break;
            default: System.out.println("错误信息");break;
        }

    }
}

class Solution {
    public int game() {
        int[] guess = new int[3];
        int[] answer = new int[3];
        Random ran1=new Random();
        Random ran2=new Random();
        int r=0,i;// 结果r
        for (i=0;i<3;i++){            
            guess[i]=ran1.nextInt(3)+1;
            answer[i]=ran2.nextInt(3)+1;
        }
        for (i=0;i<3;i++){
            System.out.println("guess = ["+guess[i]+"], answer = ["+answer[i]+"]");
            if (guess[i]==answer[i])r++;
        }

        return r;
    }
}