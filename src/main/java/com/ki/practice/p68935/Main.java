package com.ki.practice.p68935;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
}

// p68935 3진법 뒤집기 문제 풀이
// 자연수 n이 매개변수로 주어집니다.
// n을 3진법 상에서 앞뒤로 뒤집은 후,
// 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

// 제한사항
// n은 1 이상 100,000,000 이하인 자연수입니다.

class Solution {
    public int solution(int n) {
        int answer = 0;
        String base_3;
        List<Character> temp = new ArrayList();
        String reversed_base_3 = "";
        int reversed_base_3_num;

        base_3 = Integer.toString(n, 3);

        for (int i = base_3.length() - 1; i >= 0; i--)
            temp.add(base_3.charAt(i));

        for (int i = 0; i < temp.size(); i++)
            reversed_base_3 += temp.get(i).toString();

        reversed_base_3_num = Integer.parseInt(reversed_base_3, 3);
        answer = reversed_base_3_num;

        return answer;
    }
}