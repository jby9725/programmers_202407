package com.ki.practice.p42840;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
}

// p42840 모의고사 문제 풀이
//문제 설명
//수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
//
//1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
//
//1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
//
//제한 조건
//시험은 최대 10,000 문제로 구성되어있습니다.
//문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
//가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
//입출력 예
//answers	return
//[1,2,3,4,5]	[1]
//[1,3,2,4,2]	[1,2,3]

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> list = new ArrayList<>();
        int[] answer = {};
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] p_answer_count = {0, 0, 0};


        int person_index = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person1[i % person1.length]) {
                p_answer_count[0]++;
            }
            person_index++;
            if (person_index == 5)
                person_index = 0;
        }

        System.out.println("p1_answer_count : " + p_answer_count[0]);

        person_index = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person2[i % person2.length]) {
                p_answer_count[1]++;
            }
            person_index++;
            if (person_index == 8)
                person_index = 0;
        }
        System.out.println("p2_answer_count : " + p_answer_count[1]);

        person_index = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person3[i % person3.length]) {
                p_answer_count[2]++;
            }
            person_index++;
            if (person_index == 10)
                person_index = 0;
        }
        System.out.println("p3_answer_count : " + p_answer_count[2]);

        int max = p_answer_count[0];
        for (int i = 1; i < 3; i++) {
            if (max <= p_answer_count[i]) {
                max = p_answer_count[i];
            }
        }

        System.out.println("max : " + max);

        int idx = 0;
        for (int i = 0; i <= 2; i++) {
            System.out.println("i : " + i);
            if (p_answer_count[i] == max) {
                list.add(i + 1);
            }
        }

        System.out.println("list : " + list);

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}