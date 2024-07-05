package com.ki.practice.p12926;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// s	    n	result
// "AB"	    1	"BC"
// "z"	    1	"a"
// "a B z"	4	"e F d"


public class Tests {
    @Test
    @DisplayName("\"AB\", 1 => \"BC\"")
    void t1() {
        assertThat(new Solution().solution("AB", 1)).isEqualTo("BC");
    }

    @Test
    @DisplayName("\"z\", 1 => \"a\"")
    void t2() {
        assertThat(new Solution().solution("z", 1)).isEqualTo("a");
    }

    @Test
    @DisplayName("\"a B z\", 4 => \"e F d\"")
    void t3() {
        assertThat(new Solution().solution("a B z", 4)).isEqualTo("e F d");
    }
}
