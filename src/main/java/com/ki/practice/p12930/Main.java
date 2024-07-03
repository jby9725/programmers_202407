package com.ki.practice.p12930;

public class Main {
    public static void main(String[] args) {

    }
}

// p12930 이상한 문자 만들기 문제 풀이
// 문제 설명
// 문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
// 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
// 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

// 제한 사항
// 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
// 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.

// 입출력 예
// s	                return
// "try hello world"	"TrY HeLlO WoRlD"


class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] s_chars = s.toCharArray();
        int index_cnt = -1;

        for (int i = 0; i < s_chars.length; i++) {
            if (s_chars[i] == ' ') {
                index_cnt = -1;
                continue;
            } else {
                index_cnt++;
                if (index_cnt % 2 == 0) { // 짝수번째
                    if (s_chars[i] >= 'a' && s_chars[i] <= 'z') {
                        s_chars[i] = Character.toUpperCase(s_chars[i]);
                    }
                } else { // 홀수번째
                    if (s_chars[i] >= 'A' && s_chars[i] <= 'Z') {
                        s_chars[i] = Character.toLowerCase(s_chars[i]);
                    }
                }
            }
        }

        for(int i = 0; i < s_chars.length; i++) {
            System.out.print(s_chars[i]);
            answer.append(s_chars[i]);
        }

        return answer.toString();
    }
}