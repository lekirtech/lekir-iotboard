/**
 * Copyright © 2016-2020 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.service.edge.rpc.init;

import org.thingsboard.server.common.data.edge.Edge;
import org.thingsboard.server.gen.edge.AttributesRequestMsg;
import org.thingsboard.server.gen.edge.DeviceCredentialsRequestMsg;
import org.thingsboard.server.gen.edge.RelationRequestMsg;
import org.thingsboard.server.gen.edge.RuleChainMetadataRequestMsg;
import org.thingsboard.server.gen.edge.UserCredentialsRequestMsg;

public interface SyncEdgeService {

    void sync(Edge edge);

    void processRuleChainMetadataRequestMsg(Edge edge, RuleChainMetadataRequestMsg ruleChainMetadataRequestMsg);

    void processAttributesRequestMsg(Edge edge, AttributesRequestMsg attributesRequestMsg);

    void processRelationRequestMsg(Edge edge, RelationRequestMsg relationRequestMsg);

    void processDeviceCredentialsRequestMsg(Edge edge, DeviceCredentialsRequestMsg deviceCredentialsRequestMsg);

    void processUserCredentialsRequestMsg(Edge edge, UserCredentialsRequestMsg userCredentialsRequestMsg);
}
