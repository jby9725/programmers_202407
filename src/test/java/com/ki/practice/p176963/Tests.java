package com.ki.practice.p176963;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// 입출력 예
// name	                            yearning	    photo	                                                                                            result
// ["may", "kein", "kain", "radi"]	[5, 10, 1, 3]	[["may", "kein", "kain", "radi"],["may", "kein", "brin", "deny"], ["kon", "kain", "may", "coni"]]	[19, 15, 6]
// ["kali", "mari", "don"]	        [11, 1, 55]	    [["kali", "mari", "don"], ["pony", "tom", "teddy"], ["con", "mona", "don"]]	                        [67, 0, 55]
// ["may", "kein", "kain", "radi"]	[5, 10, 1, 3]	[["may"],["kein", "deny", "may"], ["kon", "coni"]]	                                                [5, 15, 0]

public class Tests {
    @Test
    @DisplayName("[\"may\", \"kein\", \"kain\", \"radi\"]\t[5, 10, 1, 3]\t[[\"may\", \"kein\", \"kain\", \"radi\"],[\"may\", \"kein\", \"brin\", \"deny\"], [\"kon\", \"kain\", \"may\", \"coni\"]] => [19, 15, 6]")
    void t1() {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        int[] result = {19, 15, 6};

        assertThat(new Solution().solution(name, yearning, photo)).isEqualTo(result);
    }


    @Test
    @DisplayName("[\"may\", \"kein\", \"kain\", \"radi\"]\t[5, 10, 1, 3]\t[[\"may\"],[\"kein\", \"deny\", \"may\"], [\"kon\", \"coni\"]] => [5, 15, 0]")
    void t2() {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may"},{"kein", "deny", "may"}, {"kon", "coni"}};
        int[] result = {5, 15, 0};

        assertThat(new Solution().solution(name, yearning, photo)).isEqualTo(result);
    }



    @Test
    @DisplayName("[\"kali\", \"mari\", \"don\"]\t[11, 1, 55]\t[[\"kali\", \"mari\", \"don\"], [\"pony\", \"tom\", \"teddy\"], [\"con\", \"mona\", \"don\"]] => [67, 0, 55]")
    void t3() {
        String[] name = {"kali", "mari", "don"};
        int[] yearning = {11, 1, 55};
        String[][] photo = {{"kali", "mari", "don"},{"pony", "tom", "teddy"}, {"con", "mona", "don"}};
        int[] result = {67, 0, 55};

        assertThat(new Solution().solution(name, yearning, photo)).isEqualTo(result);
    }



}
