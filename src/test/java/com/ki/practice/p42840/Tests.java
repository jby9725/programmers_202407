package com.ki.practice.p42840;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//입출력 예
//answers	return
//[1,2,3,4,5]	[1]
//[1,3,2,4,2]	[1,2,3]

public class Tests {
    @Test
    @DisplayName("[1,2,3,4,5] => [1]")
    void t1() {
        assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5})).isEqualTo(new int[]{1});
    }

    @Test
    @DisplayName("[1,3,2,4,2] => [1,2,3]")
    void t2() {
        assertThat(new Solution().solution(new int[]{1,3,2,4,2})).isEqualTo(new int[]{1,2,3});
    }

}
