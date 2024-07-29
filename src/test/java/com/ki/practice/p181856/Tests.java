package com.ki.practice.p181856;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// arr1	            arr2                result
// [49, 13]	        [70, 11, 2]	        -1
// [100, 17, 84, 1]	[55, 12, 65, 36]	1
// [1, 2, 3, 4, 5]	[3, 3, 3, 3, 3]	    0


public class Tests {
    @Test
    @DisplayName("[49, 13], [70, 11, 2] => -1")
    void t1() {
        assertThat(new Solution().solution(new int[]{49, 13}, new int[]{70, 11, 2})).isEqualTo(-1);
    }

    @Test
    @DisplayName("[100, 17, 84, 1], [55, 12, 65, 36] => 1")
    void t2() {
        assertThat(new Solution().solution(new int[]{100, 17, 84, 1}, new int[]{55, 12, 65, 36})).isEqualTo(1);
    }

    @Test
    @DisplayName("[1, 2, 3, 4, 5], [3, 3, 3, 3, 3] => 0")
    void t3() {
        assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5}, new int[]{3, 3, 3, 3, 3})).isEqualTo(0);
    }
}
