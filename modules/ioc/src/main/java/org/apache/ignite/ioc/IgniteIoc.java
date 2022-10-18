/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.ioc;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCheckedException;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.internal.IgnitionEx;
import org.apache.ignite.ioc.internal.processors.resource.GridInjectResourceContextImpl;
import org.jetbrains.annotations.Nullable;;

/**
 * Helper for launching ignite with specific bean registry.
 */
public class IgniteIoc {

    public static Ignite start(@Nullable Registry registry) throws IgniteCheckedException {
        return IgnitionEx.start(new GridInjectResourceContextImpl(registry));
    }

    public static Ignite start(IgniteConfiguration cfg, @Nullable Registry registry) throws IgniteCheckedException {
        return IgnitionEx.start(cfg, new GridInjectResourceContextImpl(registry));
    }

}
