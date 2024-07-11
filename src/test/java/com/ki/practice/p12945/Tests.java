package com.ki.practice.p12945;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// n	return
// 3	2
// 5	5
// 입출력 예 설명
// 피보나치수는 0번째부터 0, 1, 1, 2, 3, 5, ... 와 같이 이어집니다.


public class Tests {
    @Test
    @DisplayName("[1,1,3,3,0,1,1] => [1,3,0,1]")
    void t1() {
        assertThat(new Solution().solution(3)).isEqualTo(2);
    }

    @Test
    @DisplayName("[4,4,4,3,3] => [4,3]")
    void t2() {
        assertThat(new Solution().solution(5)).isEqualTo(5);
    }

}
