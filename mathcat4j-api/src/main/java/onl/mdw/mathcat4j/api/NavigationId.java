/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * Copyright 2025 Michael Whapples
 */
package onl.mdw.mathcat4j.api;

import lombok.Value;
import org.jspecify.annotations.NonNull;

/**
 * Node ID based navigation position.
 */
@Value
public class NavigationId {
    /**
     * The ID of the node.
     */
    @NonNull String id;
    /**
     * The offset within the node.
     */
    int offset;

    /**
     * Use getId() instead.
     * @return The node ID.
     */
    @Deprecated
    public @NonNull String id() {
        return getId();
    }

    /**
     * Use getOffset() instead.
     * @return The offset in the node.
     */
    @Deprecated
    public int offset() {
        return getOffset();
    }
}
