package com.ki.practice.p68935;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// n	result
// 45	7
// 125	229

public class Tests {
    @Test
    @DisplayName("45 => 7")
    void t1() {
        assertThat(new Solution().solution(45)).isEqualTo(7);
    }

    @Test
    @DisplayName("125 => 229")
    void t2() {
        assertThat(new Solution().solution(125)).isEqualTo(229);
    }

}
