package string;

import java.util.Scanner;

public class String8 {

    public String solution(String str){
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        //replaceAll : 알파벳만 빼고 나머지는 다 제거하기 위해서, 정규식을 사용해주기 위해서는 replace말고 All
        //"[^A-Z]" : 대문자 A부터 Z가 아니면(^ : 부정) 아닌것들을
        //"" : 빈문자화시켜라
        System.out.println(str);
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) return "YES";

        return answer;
    }

    public static void main(String[] args) {
        String8 T = new String8();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();     //띄어쓰기가 있으므로 한줄씩 nextLine()으로 읽기
        System.out.println(T.solution(str));
    }
}
