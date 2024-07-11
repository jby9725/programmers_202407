package com.ki.practice.p12911;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//입출력 예
//n	result
//78	83
//15	23

public class Tests {
    @Test
    @DisplayName("78 => 83")
    void t1() {
        assertThat(new Solution().solution(78)).isEqualTo(83);
    }

    @Test
    @DisplayName("15 => 23")
    void t2() {
        assertThat(new Solution().solution(15)).isEqualTo(23);
    }


}
