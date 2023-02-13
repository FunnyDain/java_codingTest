//1. 문자 찾기

package string;

import java.util.Scanner;

public class String1_1 {

    public int solution(String str, char c){
        //static으로 하면 instance(구현화된 객체)를 굳이 생성안해도 됌
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);   //얘는 String이 아닌 문자이므로 Character클래스에 있는 메서드를 사용해야함
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == c){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String1_2 T = new String1_2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(T.solution(str,c));
    }
}
