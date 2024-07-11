package com.ki.practice.p12951;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// s	                    return
// "3people unFollowed me"	"3people Unfollowed Me"
// "for the last week"	    "For The Last Week"

public class Tests {
    @Test
    @DisplayName("\"3people unFollowed me\" => \"3people Unfollowed Me\"")
    void t1() {
        assertThat(new Solution().solution("3people unFollowed me")).isEqualTo("3people Unfollowed Me");
    }

    @Test
    @DisplayName("\"for the last week\" => \"For The Last Week\"")
    void t2() {
        assertThat(new Solution().solution("for the last week")).isEqualTo("For The Last Week");
    }

}
