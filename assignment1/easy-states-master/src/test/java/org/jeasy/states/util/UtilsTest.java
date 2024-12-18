/*
 * The MIT License
 *
 *  Copyright (c) 2020, Mahmoud Ben Hassine (mahmoud.benhassine@icloud.com)
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */
package org.jeasy.states.util;

import org.jeasy.states.api.State;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class UtilsTest {

    @Test
    public void dumpFSMStates() throws Exception {
        // given
        final State s1 = new State("s1");
        final State s2 = new State("s2");
        Set<State> states = new HashSet<>(asList(s1, s2));

        // when
        String fsmStates = Utils.dumpFSMStates(states);

        // then
        List<String> statesDump = Arrays.asList("s1;s2;", "s2;s1;");
        assertThat(statesDump).contains(fsmStates);
    }

    @Test
    public void whenFSMStatesAreEmpty_thenDumpFSMStatesShouldReturnEmptyString() {
        // Given
        Set<State> emptyStates = new HashSet<>();

        // When
        String fsmStates = Utils.dumpFSMStates(emptyStates);

        // Then
        assertThat(fsmStates).isEmpty();
    }
}
