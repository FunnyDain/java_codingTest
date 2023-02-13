//3. 문자 속 단어

package string;

import java.util.Scanner;

public class String3_1 {

    public String Solution(String str){
        String answer = " ";
        String[] strArr = str.split(" ");

        int leng = Integer.MIN_VALUE;

        for(String word : strArr){
            if(leng<word.length()) {
                answer = word;
                leng = word.length();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String3_1 T = new String3_1();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();     //문장이므로 next()x
        System.out.println(T.Solution(str));

    }

}
