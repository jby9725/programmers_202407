package com.ki.practice.p181853;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
}

// p181853 뒤에서 5등까지 문제 풀이
// 정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
// 제한사항
// 6 ≤ num_list의 길이 ≤ 30
// 1 ≤ num_list의 원소 ≤ 100

// 입출력 예
// num_list	                    result
// [12, 4, 15, 46, 38, 1, 14]	[1, 4, 12, 14, 15]


class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < num_list.length; i++) {
            list.add(num_list[i]);
        }

        Collections.sort(list);

        for(int i = 0; i < 5; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}