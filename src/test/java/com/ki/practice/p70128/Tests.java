package com.ki.practice.p70128;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// n	return
// 3	"수박수"
// 4	"수박수박"

public class Tests {
    @Test
    @DisplayName("3 => \"수박수\"")
    void t1() {
        assertThat(new Solution().solution(3)).isEqualTo("수박수");
    }

    @Test
    @DisplayName("4 => \"수박수박\"")
    void t2() {
        assertThat(new Solution().solution(4)).isEqualTo("수박수박");
    }

}
