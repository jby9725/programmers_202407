package com.ki.practice.p12940;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }
}

// p12940 최대공약수와 최소공배수
// 문제 설명
// 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
// 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
// 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

// 제한 사항
// 두 수는 1이상 1000000이하의 자연수입니다.

class Solution {
    public long[] solution(int n, int m) {
        long[] answer = new long[2];
        int largest = m;
        int smallest = n;
        int divisor = 1; // 최대 공약수
        int multiple = 1; // 최소 공배수

        if (n > m) {
            largest = n;
            smallest = m;
        }

        for (int i = 1; i <= smallest; i++) {
            if(largest % i == 0 && smallest % i == 0) {
                divisor = i;
            }
        }

        // 최대공약수와 최대공배수 사이의 관계 이용
        // 출처 : https://sasca37.tistory.com/100
        int temp = n * m;
        temp = temp / divisor;
        multiple = temp;

        answer[0] = divisor;
        answer[1] = multiple;
        return answer;
    }
}