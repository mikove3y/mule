/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.test.multi.implicit.config.extension.extension;

import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.test.implicit.exclusive.config.extension.extension.BleOperations;
import org.mule.test.implicit.exclusive.config.extension.extension.ConfigWithNumber;

@Operations({BleOperations.class})
@Configuration(name = "yetanotherimplicitconfig")
public class AnotherConfigThatCanBeUsedImplicitly extends ConfigWithNumber {

  @Override
  protected int getNumber() {
    return 20;
  }

}
