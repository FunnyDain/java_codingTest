package string;

import java.util.Scanner;

public class String6 {

    public String solution(String str){
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            //indexOf() 는 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환하며
            //만약 찾지 못했을 경우 "-1"을 반환
            //System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));

            if(str.indexOf(str.charAt(i)) == i){        //특정 문자가 처음 나오는 위치와 현재 위치(i)와 같다면
                answer += str.charAt(i);
            }

        }

        return answer;

    }

    public static void main(String[] args) {
        String6 T = new String6();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));

    }
}
