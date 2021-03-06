/*******************************************************************************
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2014,2015 by Peter Pilgrim, Milton Keynes, P.E.A.T UK LTD
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU GPL v3.0
 * which accompanies this distribution, and is available at:
 * http://www.gnu.org/licenses/gpl-3.0.txt
 *
 * Developers:
 * Peter Pilgrim -- design, development and implementation
 *               -- Blog: http://www.xenonique.co.uk/blog/
 *               -- Twitter: @peter_pilgrim
 *
 * Contributors:
 *
 *******************************************************************************/

package com.wcg.xenonique.training.lambdas;

/**
 * Created by ppilgrim on 18-Sep-2015.
 */
public abstract class AbstractCodingKata {
    public void doSomething(String anyString) {
        System.out.printf("KATA: doSomething() -> %s\n", anyString);
    }

    public void incomplete() {
        throw new RuntimeException("INCOMPLETE: You must complete this part of the Kata");
    }
}
