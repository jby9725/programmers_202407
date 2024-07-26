package com.ki.practice.p120898;

public class Main {
    public static void main(String[] args) {

    }
}

// p120841 점의 위치 구하기
// 사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 사분면은 1부터 4까지 번호를 매깁니다.
// x 좌표 (x, y)를 차례대로 담은 정수 배열 dot이 매개변수로 주어집니다.
// 좌표 dot이 사분면 중 어디에 속하는지 1, 2, 3, 4 중 하나를 return 하도록 solution 함수를 완성해주세요.

// 입출력 예
// dot	    result
// [2, 4]	1
// [-7, 9]	2

class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        if (dot[0] > 0) {
            if (dot[1] > 0) {
                answer = 1;
            } else {
                answer = 4;
            }
        } else {
            if (dot[1] > 0) {
                answer = 2;
            } else {
                answer = 3;
            }
        }
        return answer;
    }
}