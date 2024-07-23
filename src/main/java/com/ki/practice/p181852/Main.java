package com.ki.practice.p181852;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
}

// p181852 뒤에서 5등 위로 문제 풀이
// 정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
// 제한사항
// 6 ≤ num_list의 길이 ≤ 30
// 1 ≤ num_list의 원소 ≤ 100

//입출력 예
// num_list	                                result
// [12, 4, 15, 46, 38, 1, 14, 56, 32, 10]	[15, 32, 38, 46, 56]

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < num_list.length; i++) {
            list.add(num_list[i]);
        }

        Collections.sort(list);

        int index = 0;

        for(int i = 5; i < list.size(); i++) {
            answer[index] = list.get(i);
            index++;
        }

        return answer;
    }
}