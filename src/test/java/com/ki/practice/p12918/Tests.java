package com.ki.practice.p12918;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// s	    return
// "a234"	false
// "1234"	true

public class Tests {
    @Test
    @DisplayName("\"a234\" => false")
    void t1() {

        assertThat(new Solution().solution("a234")).isEqualTo(false);
    }

    @Test
    @DisplayName("\"1234\" => true")
    void t2() {

        assertThat(new Solution().solution("1234")).isEqualTo(true);
    }

}
