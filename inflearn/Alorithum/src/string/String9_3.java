package string;

import java.util.Scanner;

public class String9_3 {

    public int solution(String str){
        String answer = "";
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {      //isDigit숫자냐?!
                answer += c;
            }
        }

        return Integer.parseInt(answer);        //정수형으로 변환
    }

    public static void main(String[] args) {
        String9_3 T = new String9_3();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

}
