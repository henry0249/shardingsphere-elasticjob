/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.elasticjob.error.handler.dingtalk.config;

import lombok.Getter;

import java.util.Properties;

/**
 * Job error handler configuration for send error message via dingtalk.
 */
@Getter
public final class DingtalkConfiguration {
    
    private final String webhook;
    
    private final String keyword;
    
    private final String secret;
    
    private final int connectTimeoutMillisecond;
    
    private final int readTimeoutMillisecond;
    
    public DingtalkConfiguration(final Properties props) {
        webhook = props.getProperty(DingtalkPropertiesConstants.WEBHOOK);
        keyword = props.getProperty(DingtalkPropertiesConstants.KEYWORD);
        secret = props.getProperty(DingtalkPropertiesConstants.SECRET);
        connectTimeoutMillisecond = Integer.parseInt(props.getProperty(DingtalkPropertiesConstants.CONNECT_TIMEOUT_MILLISECOND, DingtalkPropertiesConstants.DEFAULT_CONNECT_TIMEOUT_MILLISECOND));
        readTimeoutMillisecond = Integer.parseInt(props.getProperty(DingtalkPropertiesConstants.READ_TIMEOUT_MILLISECOND, DingtalkPropertiesConstants.DEFAULT_READ_TIMEOUT_MILLISECOND));
    }
}
