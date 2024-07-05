package com.ki.practice.p131705;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// number	                result
// [-2, 3, 0, 2, -5]        2
// [-3, -2, -1, 0, 1, 2, 3]	5
// [-1, 1, -1, 1]	        0

public class Tests {
    @Test
    @DisplayName("[-2, 3, 0, 2, -5] => 2")
    void t1() {
        assertThat(new Solution().solution(new int[]{-2, 3, 0, 2, -5})).isEqualTo(2);
    }

    @Test
    @DisplayName("[-3, -2, -1, 0, 1, 2, 3] => 5")
    void t2() {
        assertThat(new Solution().solution(new int[]{-2, 3, 0, 2, -5})).isEqualTo(2);
    }

    @Test
    @DisplayName("[-1, 1, -1, 1] => 0")
    void t3() {
        assertThat(new Solution().solution(new int[]{-2, 3, 0, 2, -5})).isEqualTo(2);
    }

}
