package com.ki.practice.p12951;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
}

// p12951 JadenCase 문자열 만들기 문제 풀이
// 문제 설명
// JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
// 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.

// 제한 조건
// s는 길이 1 이상 200 이하인 문자열입니다.
// s는 알파벳과 숫자, 공백문자(" ")로 이루어져 있습니다.
// 숫자는 단어의 첫 문자로만 나옵니다.
// 숫자로만 이루어진 단어는 없습니다.
// 공백문자가 연속해서 나올 수 있습니다.

class Solution {
    public String solution(String s) {
        char[] answer = new char[s.length()];
        boolean preIsSpace = true;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                preIsSpace = true;
                answer[i] = ' ';
                continue;
            }
            if(preIsSpace) {
                if(s.charAt(i) == ' ') {
                    preIsSpace = true;
                    answer[i] = ' ';
                    continue;
                } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    char temp = (char)( (int) s.charAt(i) - 32 );
                    System.out.println("temp: " + temp);
                    answer[i] = temp;
                    preIsSpace = false;
                }
                else if (s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                    answer[i] = s.charAt(i);
                    preIsSpace = false;
                }
                else {
                    answer[i] = s.charAt(i);
                    preIsSpace = false;
                }
            }
            else {
                if(s.charAt(i) == ' ') {
                    preIsSpace = true;
                    answer[i] = ' ';
                    continue;
                } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    char temp = (char)( (int) s.charAt(i) + 32 );
                    System.out.println("temp: " + temp);
                    answer[i] = temp;
                }
                else if (s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                    answer[i] = s.charAt(i);
                    preIsSpace = false;
                }
                else {
                    answer[i] = s.charAt(i);
                    preIsSpace = false;
                }
            }
        }

        System.out.println(String.valueOf(answer));

        return String.valueOf(answer);
    }
}