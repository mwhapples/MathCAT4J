/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * Copyright 2025 Michael Whapples
 */
package onl.mdw.mathcat4j.api;

import lombok.Value;

/**
 * Wrapper for position ranges where there is a start and end position.
 */
@Value
public class PositionRange {
    /**
     * The start position.
     */
    int start;
    /**
     * The end position.
     */
    int end;

    /**
     * Use getStart() instead.
     * @return The start position.
     */
    @Deprecated
    public int start() {
        return getStart();
    }

    /**
     * Use getEnd() instead.
     * @return The end position.
     */
    @Deprecated
    public int end() {
        return getEnd();
    }
}
