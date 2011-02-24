/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Reset Instance Attribute Request Marshaller
 */
public class ResetInstanceAttributeRequestMarshaller implements Marshaller<Request<ResetInstanceAttributeRequest>, ResetInstanceAttributeRequest> {

    public Request<ResetInstanceAttributeRequest> marshall(ResetInstanceAttributeRequest resetInstanceAttributeRequest) {
        Request<ResetInstanceAttributeRequest> request = new DefaultRequest<ResetInstanceAttributeRequest>(resetInstanceAttributeRequest, "AmazonEC2");
        request.addParameter("Action", "ResetInstanceAttribute");
        request.addParameter("Version", "2010-08-31");
        if (resetInstanceAttributeRequest != null) {
            if (resetInstanceAttributeRequest.getInstanceId() != null) {
                request.addParameter("InstanceId", StringUtils.fromString(resetInstanceAttributeRequest.getInstanceId()));
            }
        }
        if (resetInstanceAttributeRequest != null) {
            if (resetInstanceAttributeRequest.getAttribute() != null) {
                request.addParameter("Attribute", StringUtils.fromString(resetInstanceAttributeRequest.getAttribute()));
            }
        }


        return request;
    }
}