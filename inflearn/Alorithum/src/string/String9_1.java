package string;

import java.util.Scanner;

public class String9_1 {

    public int solution(String str){
        int answer = Integer.valueOf(str.replaceAll("[^0-9]", ""));
//        스트링을 숫자 값으로 변형할 때 Integer.parseInt() vs Integer.valueOf()
//        parseInt(): 원시데이터인 int 타입을 반환
//        valueOf(): Integer 래퍼(wrapper)객체를 반환

        return answer;
    }

    public static void main(String[] args) {
        String9_1 T = new String9_1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

}
