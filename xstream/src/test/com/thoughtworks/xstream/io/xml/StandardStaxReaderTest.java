/*
 * Copyright (C) 2015, 2017, 2018 XStream Committers.
 * All rights reserved.
 *
 * The software in this package is published under the terms of the BSD
 * style license a copy of which has been included with this distribution in
 * the LICENSE.txt file.
 *
 * Created on 29. September 2015 by Joerg Schaible
 */
package com.thoughtworks.xstream.io.xml;

import java.io.StringReader;

import com.thoughtworks.xstream.io.HierarchicalStreamDriver;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;


public class StandardStaxReaderTest extends AbstractXMLReaderTest {

    private final HierarchicalStreamDriver driver = new StandardStaxDriver();

    // factory method
    @Override
    protected HierarchicalStreamReader createReader(final String xml) throws Exception {
        return driver.createReader(new StringReader(xml));
    }

    // inherits tests from superclass
}
