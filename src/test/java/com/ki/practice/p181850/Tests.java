package com.ki.practice.p181850;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// flo	    result
// 1.42	    1
// 69.32	69

public class Tests {
    @Test
    @DisplayName("1.42 => 1")
    void t1() {
        assertThat(new Solution().solution(1.42)).isEqualTo(1);
    }

    @Test
    @DisplayName("69.32 => 69")
    void t2() {
        assertThat(new Solution().solution(69.32)).isEqualTo(69);
    }

}
