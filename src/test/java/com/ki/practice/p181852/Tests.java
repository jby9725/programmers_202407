package com.ki.practice.p181852;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//입출력 예
// num_list	                                result
// [12, 4, 15, 46, 38, 1, 14, 56, 32, 10]	[15, 32, 38, 46, 56]

public class Tests {
    @Test
    @DisplayName("[12, 4, 15, 46, 38, 1, 14, 56, 32, 10] => [15, 32, 38, 46, 56]")
    void t1() {
        assertThat(new Solution().solution(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10})).isEqualTo(new int[]{15, 32, 38, 46, 56});
    }

}
