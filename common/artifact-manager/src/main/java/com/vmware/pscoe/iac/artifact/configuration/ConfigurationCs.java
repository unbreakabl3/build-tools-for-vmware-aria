/*
 * #%L
 * artifact-manager
 * %%
 * Copyright (C) 2023 VMware
 * %%
 * Build Tools for VMware Aria
 * Copyright 2023 VMware, Inc.
 * 
 * This product is licensed to you under the BSD-2 license (the "License"). You may not use this product except in compliance with the BSD-2 License.  
 * 
 * This product may include a number of subcomponents with separate copyright notices and license terms. Your use of these subcomponents is subject to the terms and conditions of the subcomponent's license, as noted in the LICENSE file.
 * #L%
 */
package com.vmware.pscoe.iac.artifact.configuration;

import java.util.Properties;

import com.vmware.pscoe.iac.artifact.aria.automation.configuration.ConfigurationVraNg;
import com.vmware.pscoe.iac.artifact.model.PackageType;

public final class ConfigurationCs extends ConfigurationVraNg {
	private ConfigurationCs(Properties props) {
		super(PackageType.CS, props);
	}

	public static ConfigurationCs fromProperties(Properties props) throws ConfigurationException {
		ConfigurationCs config = new ConfigurationCs(props);
		config.validate(false);
		return config;
	}
}
