package com.ki.practice.p120833;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// numbers	        num1	num2	result
// [1, 2, 3, 4, 5]	1	    3	    [2, 3, 4]
// [1, 3, 5]	    1	    2	    [3, 5]

public class Tests {
    @Test
    @DisplayName("[1, 2, 3, 4, 5], 1, 3 => [2, 3, 4]")
    void t1() {
        AssertionsForClassTypes.assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5}, 1, 3)).isEqualTo(new int[]{2, 3, 4});
    }

    @Test
    @DisplayName("[1, 3, 5], 1, 2 => [3, 5]")
    void t2() {
        assertThat(new Solution().solution(new int[]{1, 3, 5}, 1, 2)).isEqualTo(new int[]{3, 5});
    }

}
