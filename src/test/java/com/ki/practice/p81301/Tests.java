package com.ki.practice.p81301;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// s	                result
// "one4seveneight"	    1478
// "23four5six7"	    234567
// "2three45sixseven"	234567
// "123"	            123

public class Tests {
    @Test
    @DisplayName("\"one4seveneight\" => 1478")
    void t1() {

        assertThat(new Solution().solution("23four5six7")).isEqualTo(1478);
    }

}
