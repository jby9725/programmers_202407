package com.ki.practice.p181861;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


// 입출력 예
// arr	        result
// [5, 1, 4]	[5, 5, 5, 5, 5, 1, 4, 4, 4, 4]
// [6, 6]	    [6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]
// [1]	        [1]


public class Tests {
    @Test
    @DisplayName("[5, 1, 4] => [5, 5, 5, 5, 5, 1, 4, 4, 4, 4]")
    void t1() {
        assertThat(new Solution().solution(new int[]{5, 1, 4})).isEqualTo(new int[]{5, 5, 5, 5, 5, 1, 4, 4, 4, 4});
    }

    @Test
    @DisplayName("[6, 6] => [6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]")
    void t2() {
        assertThat(new Solution().solution(new int[]{6, 6})).isEqualTo(new int[]{6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6});
    }

    @Test
    @DisplayName("[1] => [1]")
    void t3() {
        assertThat(new Solution().solution(new int[]{1})).isEqualTo(new int[]{1});
    }

}
