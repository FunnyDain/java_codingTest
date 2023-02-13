package string;

import java.util.ArrayList;
import java.util.Scanner;

public class String4_1 {

    public ArrayList<String> solution(int count, String[] words) {
        ArrayList<String> answer = new ArrayList<>();
        for(String str : words){
            String tmp = new StringBuilder(str).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {

        String4_1 T = new String4_1();
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String[] words = new String[count];
        for (int i = 0; i < words.length; i++) {
            words[i] = sc.next();
        }
        for (String word : T.solution(count,words)){
            System.out.println(word);
        }


    }

}


