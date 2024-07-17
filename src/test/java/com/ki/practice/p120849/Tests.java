package com.ki.practice.p120849;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// my_string	        result
// "bus"	            "bs"
// "nice to meet you"	"nc t mt y"

public class Tests {
    @Test
    @DisplayName("\"bus\" => \"bs\"")
    void t1() {
        assertThat(new Solution().solution("bus")).isEqualTo("bs");
    }

    @Test
    @DisplayName("\"nice to meet you\" => \"nc t mt y\"")
    void t2() {
        assertThat(new Solution().solution("nice to meet you")).isEqualTo("nc t mt y");
    }

}
