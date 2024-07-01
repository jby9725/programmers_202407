package com.ki.practice.p77884;

public class Main {
    public static void main(String[] args) {

    }
}

// p77884
// 약수의 개수와 덧셈
// 두 정수 left와 right가 매개변수로 주어집니다.
// left부터 right까지의 모든 수들 중에서,
// 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

// 제한사항
// 1 ≤ left ≤ right ≤ 1,000

class Solution {
    public int solution(int left, int right) {
        int divisor_cnt = 0;
        int sum = 0;

        for(int i = left; i <= right; i++) {
            divisor_cnt = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    divisor_cnt += 1;
                }
            }
            if(divisor_cnt % 2 == 0) {
                sum += i;
            }else {
                sum -= i;
            }
        }

        return sum;
    }
}