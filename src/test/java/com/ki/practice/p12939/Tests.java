package com.ki.practice.p12939;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// s	            return
// "1 2 3 4"	    "1 4"
// "-1 -2 -3 -4"	"-4 -1"
// "-1 -1"	        "-1 -1"

public class Tests {
    @Test
    @DisplayName("\"1 2 3 4\" => \"1 4\"")
    void t1() {
        assertThat(new Solution().solution("1 2 3 4")).isEqualTo("1 4");
    }

    @Test
    @DisplayName("\"-1 -2 -3 -4\" => \"-4 -1\"")
    void t2() {
        assertThat(new Solution().solution("-1 -2 -3 -4")).isEqualTo("-4 -1");
    }

    @Test
    @DisplayName("\"-1 -1\" => \"-1 -1\"")
    void t3() {
        assertThat(new Solution().solution("-1 -1")).isEqualTo("-1 -1");
    }

}
