//2. 대소문자 변환

package string;

import java.util.Scanner;

public class String2_2 {

    public String solution(String str){
        String answer = "";
        for (char x : str.toCharArray()) {
            if (64<=x&& x<=90) {
                answer += Character.toLowerCase(x);
            } else {
                answer += Character.toUpperCase(x);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String2_2 T = new String2_2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
