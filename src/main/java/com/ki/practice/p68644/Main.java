package com.ki.practice.p68644;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
}

// p68644 두 개 뽑아서 더하기 문제 풀이
// 문제 설명
// 정수 배열 numbers가 주어집니다.
// numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서
// 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
//
// 제한사항
// numbers의 길이는 2 이상 100 이하입니다.
// numbers의 모든 수는 0 이상 100 이하입니다.


class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        int[] answer = {};
        int sum = 0;

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                if (!list.contains(sum)) {
                    list.add(sum);
                }


            }
        }

        Collections.sort(list);

        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}