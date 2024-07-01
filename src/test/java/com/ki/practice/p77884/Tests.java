package com.ki.practice.p77884;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// left	right	result
// 13	17	    43
// 24	27	    52

public class Tests {
    @Test
    @DisplayName("[1,2,3,4] , [-3,-1,0,2] => 3")
    void t1() {
        assertThat(new Solution().solution(13, 17)).isEqualTo(43);
    }

    @Test
    @DisplayName("[-1,0,1] , [1,0,-1] => -2")
    void t2() {
        assertThat(new Solution().solution(24, 27)).isEqualTo(52);
    }

}
