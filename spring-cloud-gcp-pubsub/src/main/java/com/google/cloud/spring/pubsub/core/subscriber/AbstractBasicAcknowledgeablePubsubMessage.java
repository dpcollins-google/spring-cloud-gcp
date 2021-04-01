/*
 * Copyright 2017-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.spring.pubsub.core.subscriber;

import com.google.cloud.spring.pubsub.support.BasicAcknowledgeablePubsubMessage;
import com.google.pubsub.v1.ProjectSubscriptionName;
import com.google.pubsub.v1.PubsubMessage;

abstract class AbstractBasicAcknowledgeablePubsubMessage
	implements BasicAcknowledgeablePubsubMessage {

	private final ProjectSubscriptionName projectSubscriptionName;

	private final PubsubMessage message;

	AbstractBasicAcknowledgeablePubsubMessage(
			ProjectSubscriptionName projectSubscriptionName, PubsubMessage message) {
		this.projectSubscriptionName = projectSubscriptionName;
		this.message = message;
	}

	@Override
	public ProjectSubscriptionName getProjectSubscriptionName() {
		return this.projectSubscriptionName;
	}

	@Override
	public PubsubMessage getPubsubMessage() {
		return this.message;
	}
}