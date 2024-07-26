package com.ki.practice.p120898;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//입출력 예
// message	            result
// "happy birthday!"	30
// "I love you~"	    22

public class Tests {
    @Test
    @DisplayName("\"happy birthday!\" => 30")
    void t1() {
        assertThat(new Solution().solution("happy birthday!")).isEqualTo(30);
    }

    @Test
    @DisplayName("\"I love you~\" => 22")
    void t2() {
        assertThat(new Solution().solution("I love you~")).isEqualTo(22);
    }


}
