package com.ki.practice.p68644;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// numbers	    result
// [2,1,3,4,1]	[2,3,4,5,6,7]
// [5,0,2,7]	[2,5,7,9,12]

public class Tests {
    @Test
    @DisplayName("[2,1,3,4,1] => [2,3,4,5,6,7]")
    void t1() {
        assertThat(new Solution().solution(new int[]{2,1,3,4,1})).isEqualTo(new int[]{2,3,4,5,6,7});
    }

    @Test
    @DisplayName("[5,0,2,7] => [2,5,7,9,12]")
    void t2() {
        assertThat(new Solution().solution(new int[]{5,0,2,7})).isEqualTo(new int[]{2,5,7,9,12});
    }

}
