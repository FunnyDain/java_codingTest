package string;

import java.util.Scanner;

public class String10 {

    public int[] solution(String str, char c){
        int[] answer = new int[str.length()];
        int p = 1000;

        //1. 왼쪽 c기준
        for (int i = 0; i < answer.length; i++) {
            if(str.charAt(i)==c){
                p = 0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }

        //2. 오른쪽 c기준, 값이 왼쪽 e거리 보다 작으면 교체
        p = 1000;       //다시 비교해줘야하므로 초기화
        for (int i = str.length()-1; i >= 0; i--) {
            if(str.charAt(i) == c){
                p = 0;
            }else{
                p++;
                answer[i] = Math.min(answer[i], p);     //기존값(answer[i])와 p중에서 작은 값을 넣으라는 뜻
            }
        }

        return answer;
    }
    
    public static void main(String[] args) {
        String10 T = new String10();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0);       //문자열에서 문자한개를 읽는 방법
        for (int i : T.solution(str,c)) {
            System.out.print(i + " ");
        }

    }
}
