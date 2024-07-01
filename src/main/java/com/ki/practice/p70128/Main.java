package com.ki.practice.p70128;

public class Main {
    public static void main(String[] args) {

    }
}

// 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
// 예를 들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

// 제한 조건
// n은 길이 10,000이하인 자연수입니다.

class Solution {
    public String solution(int n) {
        String answer = "";
        String subak = "수박";
        String su = "수";

        if(n % 2 == 0) {
            for(int i = 0; i < n / 2; i++) {
                answer += subak;
            }
        }else {
            for(int i = 0; i < n / 2; i++) {
                answer += subak;
            }
            answer += su;
        }

        return answer;
    }
}