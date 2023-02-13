//2. 대소문자 변환

package string;

import java.util.Scanner;

public class String2_1 {

    public String solution(String str){
        String answer = "";
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else {
                answer += Character.toUpperCase(c);
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
