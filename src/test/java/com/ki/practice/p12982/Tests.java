package com.ki.practice.p12982;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// d	        budget	result
// [1,3,2,5,4]	9	    3
// [2,2,3,3]	10	    4

public class Tests {
    @Test
    @DisplayName("[1,3,2,5,4], 9 => 3")
    void t1() {
        assertThat(new Solution().solution(new int[]{1, 3, 2, 5, 4}, 9)).isEqualTo(3);
    }

    @Test
    @DisplayName("[2,2,3,3], 10 => 4")
    void t2() {
        assertThat(new Solution().solution(new int[]{2, 2, 3, 3}, 10)).isEqualTo(4);
    }

}
