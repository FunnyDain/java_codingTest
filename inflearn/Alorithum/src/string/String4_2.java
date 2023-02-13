package string;

import java.util.ArrayList;
import java.util.Scanner;

public class String4_2 {

    public ArrayList<String> solution(int count, String[] words){

        ArrayList<String> answer = new ArrayList<>();
        for (String word : words) {
            char[] charArr = word.toCharArray();
            int lt = 0, rt = word.length() -1;      //-1 : index는 0부터, 길이는 1부터 시작하므로
            
            //뒤집기
            while(lt<rt){
                char tmp = charArr[lt];
                charArr[lt] = charArr[rt];
                charArr[rt] = tmp;
                lt++;
                rt--;
            }

            String tmp = String.valueOf(charArr);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        String4_2 T = new String4_2();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[] words = new String[count];
        for (int i=0; i<words.length; i++) {
            words[i] = sc.next();
        }
        for(String word : T.solution(count,words)){
            System.out.println(word);
        }

    }
}
