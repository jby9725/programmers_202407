package com.ki.practice.p142086;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// s	    result
// "banana"	[-1, -1, -1, 2, 2, 2]
// "foobar"	[-1, -1, 1, -1, -1, -1]

public class Tests {
    @Test
    @DisplayName("\"banana\" => [-1, -1, -1, 2, 2, 2]")
    void t1() {
        assertThat(new Solution().solution("banana")).isEqualTo(new int[]{-1, -1, -1, 2, 2, 2});
    }

    @Test
    @DisplayName("\"foobar\" => [-1, -1, 1, -1, -1, -1]")
    void t2() {
        assertThat(new Solution().solution("foobar")).isEqualTo(new int[]{-1, -1, 1, -1, -1, -1});
    }

}
