/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.action.admin.indices.template.get;

import org.elasticsearch.common.io.stream.Writeable;
import org.elasticsearch.test.AbstractWireSerializingTestCase;

import java.io.IOException;

public class GetIndexTemplateV2RequestTests extends AbstractWireSerializingTestCase<GetIndexTemplateV2Action.Request> {
    @Override
    protected Writeable.Reader<GetIndexTemplateV2Action.Request> instanceReader() {
        return GetIndexTemplateV2Action.Request::new;
    }

    @Override
    protected GetIndexTemplateV2Action.Request createTestInstance() {
        return new GetIndexTemplateV2Action.Request(generateRandomStringArray(5, 5, false, false));
    }

    @Override
    protected GetIndexTemplateV2Action.Request mutateInstance(GetIndexTemplateV2Action.Request instance) throws IOException {
        return randomValueOtherThan(instance, this::createTestInstance);
    }
}
