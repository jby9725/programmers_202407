package com.ki.practice.p42748;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
}

// p42748 K번째 수 문제 풀이
// 문제 설명
// 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
// 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
// array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
// 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
// 2에서 나온 배열의 3번째 숫자는 5입니다.
// 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때,
// commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.

// 제한사항
// array의 길이는 1 이상 100 이하입니다.
// array의 각 원소는 1 이상 100 이하입니다.
// commands의 길이는 1 이상 50 이하입니다.
// commands의 각 원소는 길이가 3입니다.

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int start = 0;
        int end = 0;
        int[] sort_arr;
        int sarr_index = 0;

        for (int i = 0; i < commands.length; i++) {
            start = commands[i][0] - 1;
            end = commands[i][1] - 1;
            sort_arr = new int[end - start + 1];
            for (int j = start; j <= end; j++) {
                sort_arr[sarr_index] = array[j];
                sarr_index++;
            }
            sarr_index = 0;

            // sort...
            for (int k = 0; k < sort_arr.length; k++) {
                for (int l = 0; l < sort_arr.length; l++) {
                    if (sort_arr[k] < sort_arr[l]) {
                        int temp = sort_arr[k];
                        sort_arr[k] = sort_arr[l];
                        sort_arr[l] = temp;
                    }
                }
            }

            answer[i] = sort_arr[(commands[i][2]) - 1];

        }


        return answer;
    }
}