package string;

import java.util.Scanner;

public class String5 {

    public String solution(String str) {

        char[] arr = str.toCharArray();
        int lt = 0;
        int rt = arr.length - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(arr[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(arr[rt])) {
                rt--;
            } else {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }

        String answer = String.valueOf(arr);

        return answer;
    }

    public static void main(String[] args) {
        String5 T = new String5();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));

    }
}
