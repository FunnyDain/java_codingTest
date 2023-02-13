//3. 문자 속 단어

package string;

import java.util.Scanner;

public class String3_2 {

    public String Solution(String str){

        String answer = "";
        int m = Integer.MIN_VALUE, pos;     //pos라는 정수 변수도 선언
        while((pos=str.indexOf(' '))!= -1){
            String tmp = str.substring(0, pos);      //pos전까지
            int len = tmp.length();

            if(len>m){      //조건이 길이가 같다면 제일 앞에 있는 단어가 답이므로 >= 하면 안됌
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1);     //str문장이 갱신되어야 다음 단어로 넘어감
        }
        if(str.length()>m) answer = str;        //indexOf와 substring을 사용했을 때, 이렇게 꼭 마지막 처리해줘야함
        return answer;
    }

    public static void main(String[] args) {
        String3_2 T = new String3_2();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();     //문장이므로 next()x
        System.out.println(T.Solution(str));

    }

}
