package com.ki.practice.p70129;

public class Main {
    public static void main(String[] args) {

    }
}

// p70129 이진 변환 반복하기 문제 풀이
//문제 설명
//0과 1로 이루어진 어떤 문자열 x에 대한 이진 변환을 다음과 같이 정의합니다.
//
//x의 모든 0을 제거합니다.
//x의 길이를 c라고 하면, x를 "c를 2진법으로 표현한 문자열"로 바꿉니다.
//예를 들어, x = "0111010"이라면, x에 이진 변환을 가하면 x = "0111010" -> "1111" -> "100" 이 됩니다.
//
//0과 1로 이루어진 문자열 s가 매개변수로 주어집니다. s가 "1"이 될 때까지 계속해서 s에 이진 변환을 가했을 때, 이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 각각 배열에 담아 return 하도록 solution 함수를 완성해주세요.
//
//제한사항
//s의 길이는 1 이상 150,000 이하입니다.
//s에는 '1'이 최소 하나 이상 포함되어 있습니다.

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int answer1 = 0;
        int answer2 = 0;
        int binary_count = 0;
        int zero_count = 0;

        while (!s.equals("1")) {

            String newStr = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0')
                    zero_count++;
                else
                    continue;
            }

            binary_count = s.length() - zero_count;

            for (int i = 0; i < s.length() - zero_count; i++) {
                newStr += "1";
            }

            // System.out.println("Binary count: " + binary_count);
            // System.out.println("newStr: " + newStr);
            s = newStr;

            String temp = Integer.toBinaryString(binary_count);
            s = temp;
            // System.out.println(s);

            answer2 += zero_count;
            zero_count = 0;

            answer1++;
        }

        answer[0] = answer1;
        answer[1] = answer2;

        return answer;
    }
}