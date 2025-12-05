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
 * Node based navigation position.
 */
@Value
public class NavigationNode {
    /**
     * The node XML.
     */
    String node;
    /**
     * The offset in the node.
     */
    int offset;

    /**
     * Use getNode() instead.
     * @return The node XML.
     */
    @Deprecated
    public String node() {
        return getNode();
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
