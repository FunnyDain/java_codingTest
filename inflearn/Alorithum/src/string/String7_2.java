package string;

import java.util.Scanner;

public class String7_2 {

    public String solution(String str){
        String answer = "NO";
        str = str.toUpperCase();
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        String7_2 T = new String7_2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
