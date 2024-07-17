package com.ki.practice.p181849;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// num_str	    result
// "123456789"	45
// "1000000"	1


public class Tests {
    @Test
    @DisplayName("\"123456789\" => 45")
    void t1() {
        assertThat(new Solution().solution("123456789")).isEqualTo(45);
    }

    @Test
    @DisplayName("\"1000000\" => 1")
    void t2() {
        assertThat(new Solution().solution("1000000")).isEqualTo(1);
    }

}
