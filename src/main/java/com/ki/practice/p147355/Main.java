package com.ki.practice.p147355;

public class Main {
    public static void main(String[] args) {

    }
}

// p147335 크기가 작은 부분문자열
// 숫자로 이루어진 문자열 t와 p가 주어질 때,
// t에서 p와 길이가 같은 부분문자열 중에서,
// 이 부분문자열이 나타내는 수가 p가 나타내는 수보다
// 작거나 같은 것이 나오는 횟수를 return하는 함수 solution을 완성하세요.
// 예를 들어, t="3141592"이고 p="271" 인 경우,
// t의 길이가 3인 부분 문자열은 314, 141, 415, 159, 592입니다.
// 이 문자열이 나타내는 수 중 271보다 작거나 같은 수는 141, 159 2개 입니다.

// 제한사항
// 1 ≤ p의 길이 ≤ 18
// p의 길이 ≤ t의 길이 ≤ 10,000
// t와 p는 숫자로만 이루어진 문자열이며, 0으로 시작하지 않습니다.

// p의 길이가 18 이하라는 의미는, p는 최대 10의 18승까지의 범위를 가진다는 의미로, int 형으로는 전부 담아낼 수 없습니다.
// 따라서 parseInt 가 제대로 되지 않아 런타임 에러가 발생할 수 있으며, 이 에러를 해결하기 위해서는 long 으로 parsing 해야 합니다.

class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i < (t.length() - p.length() + 1); i++) {
            String temp = t.substring(i, i + p.length());
            if(Long.parseLong(temp) <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }
}