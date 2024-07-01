package com.ki.practice.p70128;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// a	        b	            result
// [1,2,3,4]	[-3,-1,0,2]	    3
// [-1,0,1]	    [1,0,-1]	    -2

public class Tests {
    @Test
    @DisplayName("[1,2,3,4] , [-3,-1,0,2] => 3")
    void t1() {
        assertThat(new Solution().solution(new int[]{1,2,3,4}, new int[]{-3,-1,0,2})).isEqualTo(3);
    }

    @Test
    @DisplayName("[-1,0,1] , [1,0,-1] => -2")
    void t2() {
        assertThat(new Solution().solution(new int[]{-1,0,1}, new int[]{1,0,-1})).isEqualTo(-2);
    }

}
