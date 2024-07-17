package com.ki.practice.p181849;

public class Main {
    public static void main(String[] args) {

    }
}

// p181849 문자열 정수의 합 문제 풀이
// 한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.

// 제한사항
// 3 ≤ num_str ≤ 100

// 입출력 예
// num_str	    result
// "123456789"	45
// "1000000"	1

class Solution {
    public int solution(String num_str) {
        int answer = 0;

        for(int i = 0; i < num_str.length(); i++) {
            char ch = num_str.charAt(i);
            int num = ch - '0';
            answer += num;
        }

        return answer;
    }
}