package com.ki.practice.p181850;

public class Main {
    public static void main(String[] args) {

    }
}

// p181852 정수 부분 문제 풀이
// 문제 설명
// 실수 flo가 매개 변수로 주어질 때, flo의 정수 부분을 return하도록 solution 함수를 완성해주세요.

// 제한사항
// 0 ≤ flo ≤ 100
// 입출력 예
// flo	    result
// 1.42	    1
// 69.32	69

class Solution {
    public int solution(double flo) {
        int answer = 0;
        answer = (int)flo;
        return answer;
    }
}