/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * Copyright 2025 Michael Whapples
 */
package onl.mdw.mathcat4j.api;

import org.jspecify.annotations.NonNull;

/**
 * The MathCAT API.
 */
public interface MathCat {
    /**
     * Get the version of the MathCAT library.
     *
     * @return The MathCAT library version
     */
    @NonNull String getVersion();
    /**
     * Set the rules directory.
     *
     * Like with the MathCAT library, this should be the first function call you make when using the MathCAT library.
     * @param dir The directory containing the rules files.
     */
    void setRulesDir(@NonNull String dir);
    /**
     * Get a preference.
     *
     * @param name The name of the preference.
     * @return The value of the preference.
     */
    @NonNull String getPreference(@NonNull String name);
    /**
     * Set a preference.
     *
     * @param name The name of the preference.
     * @param value The value to be set.
     */
    void setPreference(@NonNull String name, @NonNull String value);
    /**
     * Set the MathML content.
     *
     * @param mathmlStr The MathML string.
     * @return The canonical MathML representation with IDs set on elements.
     */
    @NonNull String setMathml(@NonNull String mathmlStr);
    /**
     * Get the Braille representing an element.
     *
     * @return The Braille of the requested element.
     */
    default @NonNull String getBraille() {
        return getBraille("");
    }
    /**
     * Get the Braille representing an element.
     *
     * @param navigationId The ID of the element. Setting this to the empty string will get the Braille for the whole MathML.
     * @return The Braille of the requested element.
     */
    @NonNull String getBraille(@NonNull String navigationId);

    /**
     * Get the Braille for the current navigation node.
     * @return The Braille at the current navigation position.
     */
    @NonNull String getNavigationBraille();

    /**
     * Get the spoken text for the MathML which was set.
     *
     * @return The spoken text for the MathML.
     */
    @NonNull String getSpokenText();

    /**
     * Get the spoken overview text for the MathML which was set.
     *
     * @return The spoken overview text of the MathML.
     */
    @NonNull String getOverviewText();

    /**
     * Perform navigation by keypress.
     *
     * @param key The keycode.
     * @param shiftKey Whether shift is pressed.
     * @param controlKey Whether control key is pressed.
     * @param altKey Whether the alt key is pressed.
     * @param metaKey Whether the meta key is pressed.
     * @return The spoken text resulting from the navigation.
     */
    @NonNull String doNavigateKeypress(int key, boolean shiftKey, boolean controlKey, boolean altKey, boolean metaKey);

    /**
     * Perform navigation based on a command.
     *
     * @param command The navigation command.
     * @return The spoken text resulting from the navigation.
     */
    @NonNull String doNavigateCommand(@NonNull String command);

    /**
     * Get the MathML of the current navigation.
     *
     * @return The navigation position containing the XML of the node.
     */
    @NonNull NavigationNode getNavigationMathml();

    /**
     * Get the ID of the current navigation.
     *
     * @return The navigation position containing the node ID.
     */
    @NonNull NavigationId getNavigationMathmlId();

    /**
     * Set the navigation node by id and offset.
     * @param id     The id of the node.
     * @param offset The offset within the node.
     */
    void setNavigationNode(@NonNull String id, int offset);

    /**
     * Get the range of Braille positions for the current node.
     * @return The range of the Braille positions.
     */
    @NonNull PositionRange getBraillePosition();

    /**
     * Get the navigation node from the Braille position.
     * @param position The Braille position to find the node.
     * @return The navigation node relating to the position.
     */
    @NonNull NavigationNode getNavigationNodeFromBraillePosition(int position);

    /**
     * Get the supported Braille codes.
     * @return An array of the Braille codes supported.
     */
    @NonNull String[] getSupportedBrailleCodes();

    /**
     * Get the supported languages.
     * @return An array of the supported languages.
     */
    @NonNull String[] getSupportedLanguages();

    /**
     * Get the supported speech styles for a given language.
     * @param lang The language of the speech styles.
     * @return An array of the supported speech styles.
     */
    @NonNull String[] getSupportedSpeechStyles(@NonNull String lang);
}