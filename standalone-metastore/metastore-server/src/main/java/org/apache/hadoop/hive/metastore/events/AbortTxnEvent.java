/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hive.metastore.events;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.hive.metastore.IHMSHandler;

/**
 * AbortTxnEvent
 * Event generated for roll backing a transaction
 */
@InterfaceAudience.Public
@InterfaceStability.Stable
public class AbortTxnEvent extends ListenerEvent {

  private final Long txnId;

  /**
   *
   * @param transactionId Unique identification for the transaction that got rolledback.
   * @param handler handler that is firing the event
   */
  public AbortTxnEvent(Long transactionId, IHMSHandler handler) {
    super(true, handler);
    txnId = transactionId;
  }

  /**
   * @return Long txnId
   */
  public Long getTxnId() {
    return txnId;
  }
}
