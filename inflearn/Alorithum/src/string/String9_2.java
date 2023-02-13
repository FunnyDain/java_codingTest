package string;

import java.util.Scanner;

public class String9_2 {

    public int solution(String str){
        int answer = 0;
        for (char c : str.toCharArray()) {
            if (c >= 48 && c <= 57) {
                answer = answer * 10 + (c - 48);
                //만약 c가 '0'이면 (c - 48) = 48 - 48 = 0
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String9_2 T = new String9_2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

}
