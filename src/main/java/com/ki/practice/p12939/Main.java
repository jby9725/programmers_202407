package com.ki.practice.p12939;

public class Main {
    public static void main(String[] args) {

    }
}

// p12939 최댓값과 최솟값 문제 풀이
// 제출 내역
// 문제 설명
// 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
// str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
// 예를 들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.

// 제한 조건
// s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.

// 입출력 예
// s	            return
// "1 2 3 4"	    "1 4"
// "-1 -2 -3 -4"	"-4 -1"
// "-1 -1"	        "-1 -1"


class Solution {
    public String solution(String s) {
        String answer = "";
        String[] numbers = s.split(" ");
        int min = Integer.parseInt(numbers[0]);
        int max = Integer.parseInt(numbers[0]);

        for(int i = 1; i < numbers.length; i++){
            if(Integer.parseInt(numbers[i]) > max){
                max = Integer.parseInt(numbers[i]);
            }
            if(Integer.parseInt(numbers[i]) < min){
                min = Integer.parseInt(numbers[i]);
            }
        }

        answer = min + " " + max;

        return answer;
    }
}