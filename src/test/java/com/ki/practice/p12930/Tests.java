package com.ki.practice.p12930;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// t	            p	    result
// "3141592"	    "271"	2
// "500220839878"	"7"	    8
// "10203"	        "15"	3

public class Tests {
    @Test
    @DisplayName("\"try hello world\" => \"TrY HeLlO WoRlD\"")
    void t1() {
        assertThat(new Solution().solution("try hello world")).isEqualTo("TrY HeLlO WoRlD");
    }


}
