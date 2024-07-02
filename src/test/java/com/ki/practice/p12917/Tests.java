package com.ki.practice.p12917;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// s	        return
// "Zbcdefg"	"gfedcbZ"

public class Tests {
    @Test
    @DisplayName("\"Zbcdefg\" => \"gfedcbZ\"")
    void t1() {
        assertThat(new Solution().solution("Zbcdefg")).isEqualTo("gfedcbZ");
    }

}
