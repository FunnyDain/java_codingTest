package string;

import java.util.Scanner;

public class String11 {

    public String solution(String str) {
        String answer = "";
        str += " ";
        int cnt = 1;
        for(int i=0; i< str.length()-1; i++){       //str.length()-1 : 빈문자 전까지 가야하므로
            if(str.charAt(i) == str.charAt(i+1)){
                cnt++;
            }else{
                answer += str.charAt(i);
                if(cnt>1){
                    answer+=String.valueOf(cnt);        //or Integer.toString();
                    cnt = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String11 T = new String11();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));

    }
}
