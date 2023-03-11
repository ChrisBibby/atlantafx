/*
 * SPDX-License-Identifier: MIT
 *
 * Copyright (c) 2013, 2016, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package atlantafx.base.controls;

import atlantafx.base.util.PasswordTextFormatter;
import javafx.beans.NamedArg;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ReadOnlyStringProperty;

/**
 * This is a convenience wrapper for instantiating a {@link CustomTextField}
 * with {@code PasswordTextFormatter}. For additional info refer to the {@link PasswordTextFormatter}
 * docs.
 */
public class PasswordTextField extends CustomTextField {

    protected final PasswordTextFormatter formatter;

    public PasswordTextField(@NamedArg("text") String text) {
        this(text, PasswordTextFormatter.BULLET);
    }

    public PasswordTextField(@NamedArg("text") String text, @NamedArg("bullet") char bullet) {
        super(text);
        this.formatter = PasswordTextFormatter.create(this, bullet);
    }

    /**
     * See {@link PasswordTextFormatter#passwordProperty()}.
     */
    public ReadOnlyStringProperty passwordProperty() {
        return formatter.passwordProperty();
    }

    /**
     * See {@link PasswordTextFormatter#getPassword()}.
     */
    public String getPassword() {
        return formatter.getPassword();
    }

    /**
     * See {@link PasswordTextFormatter#revealPasswordProperty()}.
     */
    public BooleanProperty revealPasswordProperty() {
        return formatter.revealPasswordProperty();
    }

    /**
     * See {@link PasswordTextFormatter#isRevealPassword()}.
     */
    public boolean isRevealPassword() {
        return formatter.isRevealPassword();
    }

    /**
     * See {@link PasswordTextFormatter#setRevealPassword(boolean)}.
     */
    public void setRevealPassword(boolean reveal) {
        formatter.setRevealPassword(reveal);
    }
}
