package com.ki.practice.p70129;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// s	            result
// "110010101001"	[3,8]
// "01110"          [3,3]
// "1111111"	    [4,1]

public class Tests {
    @Test
    @DisplayName("\"110010101001\" => [3,8]")
    void t1() {
        assertThat(new Solution().solution("110010101001")).isEqualTo(new int[]{3,8});
    }

    @Test
    @DisplayName("\"01110\" => [3,3]")
    void t2() {
        assertThat(new Solution().solution("01110")).isEqualTo(new int[]{3,3});
    }

    @Test
    @DisplayName("\"1111111\" => [4,1]")
    void t3() {
        assertThat(new Solution().solution("1111111")).isEqualTo(new int[]{4,1});
    }



}
