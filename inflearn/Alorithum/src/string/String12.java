package string;

import java.util.Scanner;

public class String12 {

    public String solution(int num, String str){
        String answer = "";

        //7개씩 뽑아내야함
        for(int i=0; i<num; i++){
            String tmp = str.substring(0, 7).replace('#','1').replace('*','0');

            //10진수화 시키는 메서드 :Integer.parseInt()
            int tenNum = Integer.parseInt(tmp,2);       //2진수가 => 10진수로
            System.out.println(tmp + " " + tenNum);

            //숫자를 문자로
            answer += (char)tenNum;
            str = str.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        String12 T = new String12();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(num,str));
    }
}
