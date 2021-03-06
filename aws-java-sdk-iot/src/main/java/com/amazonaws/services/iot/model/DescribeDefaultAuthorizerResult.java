/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDefaultAuthorizerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The default authorizer's description.
     * </p>
     */
    private AuthorizerDescription authorizerDescription;

    /**
     * <p>
     * The default authorizer's description.
     * </p>
     * 
     * @param authorizerDescription
     *        The default authorizer's description.
     */

    public void setAuthorizerDescription(AuthorizerDescription authorizerDescription) {
        this.authorizerDescription = authorizerDescription;
    }

    /**
     * <p>
     * The default authorizer's description.
     * </p>
     * 
     * @return The default authorizer's description.
     */

    public AuthorizerDescription getAuthorizerDescription() {
        return this.authorizerDescription;
    }

    /**
     * <p>
     * The default authorizer's description.
     * </p>
     * 
     * @param authorizerDescription
     *        The default authorizer's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDefaultAuthorizerResult withAuthorizerDescription(AuthorizerDescription authorizerDescription) {
        setAuthorizerDescription(authorizerDescription);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAuthorizerDescription() != null)
            sb.append("AuthorizerDescription: ").append(getAuthorizerDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDefaultAuthorizerResult == false)
            return false;
        DescribeDefaultAuthorizerResult other = (DescribeDefaultAuthorizerResult) obj;
        if (other.getAuthorizerDescription() == null ^ this.getAuthorizerDescription() == null)
            return false;
        if (other.getAuthorizerDescription() != null && other.getAuthorizerDescription().equals(this.getAuthorizerDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizerDescription() == null) ? 0 : getAuthorizerDescription().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDefaultAuthorizerResult clone() {
        try {
            return (DescribeDefaultAuthorizerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
