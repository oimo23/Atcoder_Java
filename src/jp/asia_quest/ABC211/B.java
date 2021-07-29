package jp.asia_quest.ABC211;

import java.util.Scanner;

/*
    https://atcoder.jp/contests/abc211/tasks/abc211_b
 */
public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] S = new String[4];

        for(int i=0; i<4; i++) {
            S[i] = sc.next();
        }

        Boolean result = true;

        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                if(i != j && S[i].equals(S[j])) {
                    result = false;
                    break;
                }
            }
        }

        System.out.println(result ? "Yes": "No");
    }
}
