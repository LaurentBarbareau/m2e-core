/*******************************************************************************
 * Copyright (c) 2010 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *      Sonatype, Inc. - initial API and implementation
 *******************************************************************************/

package org.eclipse.m2e.core.internal.lifecyclemapping;

import java.util.List;

import org.eclipse.m2e.core.internal.lifecyclemapping.model.LifecycleMappingMetadata;
import org.eclipse.m2e.core.internal.lifecyclemapping.model.PluginExecutionMetadata;
import org.eclipse.m2e.core.project.configurator.MojoExecutionKey;


/**
 * MappingMetadataSource
 * 
 * @author igor
 */
public interface MappingMetadataSource {
  public LifecycleMappingMetadata getLifecycleMappingMetadata(String packagingType) throws DuplicateMappingException;

  public List<PluginExecutionMetadata> getPluginExecutionMetadata(MojoExecutionKey execution);

}
