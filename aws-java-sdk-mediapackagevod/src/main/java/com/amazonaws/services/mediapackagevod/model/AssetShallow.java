/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackagevod.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A MediaPackage VOD Asset resource.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/AssetShallow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetShallow implements Serializable, Cloneable, StructuredPojo {

    /** The ARN of the Asset. */
    private String arn;
    /** The time the Asset was initially submitted for Ingest. */
    private String createdAt;
    /** The unique identifier for the Asset. */
    private String id;
    /** The ID of the PackagingGroup for the Asset. */
    private String packagingGroupId;
    /** The resource ID to include in SPEKE key requests. */
    private String resourceId;
    /** ARN of the source object in S3. */
    private String sourceArn;
    /** The IAM role ARN used to access the source S3 bucket. */
    private String sourceRoleArn;

    /**
     * The ARN of the Asset.
     * 
     * @param arn
     *        The ARN of the Asset.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * The ARN of the Asset.
     * 
     * @return The ARN of the Asset.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * The ARN of the Asset.
     * 
     * @param arn
     *        The ARN of the Asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetShallow withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * The time the Asset was initially submitted for Ingest.
     * 
     * @param createdAt
     *        The time the Asset was initially submitted for Ingest.
     */

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The time the Asset was initially submitted for Ingest.
     * 
     * @return The time the Asset was initially submitted for Ingest.
     */

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * The time the Asset was initially submitted for Ingest.
     * 
     * @param createdAt
     *        The time the Asset was initially submitted for Ingest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetShallow withCreatedAt(String createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * The unique identifier for the Asset.
     * 
     * @param id
     *        The unique identifier for the Asset.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unique identifier for the Asset.
     * 
     * @return The unique identifier for the Asset.
     */

    public String getId() {
        return this.id;
    }

    /**
     * The unique identifier for the Asset.
     * 
     * @param id
     *        The unique identifier for the Asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetShallow withId(String id) {
        setId(id);
        return this;
    }

    /**
     * The ID of the PackagingGroup for the Asset.
     * 
     * @param packagingGroupId
     *        The ID of the PackagingGroup for the Asset.
     */

    public void setPackagingGroupId(String packagingGroupId) {
        this.packagingGroupId = packagingGroupId;
    }

    /**
     * The ID of the PackagingGroup for the Asset.
     * 
     * @return The ID of the PackagingGroup for the Asset.
     */

    public String getPackagingGroupId() {
        return this.packagingGroupId;
    }

    /**
     * The ID of the PackagingGroup for the Asset.
     * 
     * @param packagingGroupId
     *        The ID of the PackagingGroup for the Asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetShallow withPackagingGroupId(String packagingGroupId) {
        setPackagingGroupId(packagingGroupId);
        return this;
    }

    /**
     * The resource ID to include in SPEKE key requests.
     * 
     * @param resourceId
     *        The resource ID to include in SPEKE key requests.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * The resource ID to include in SPEKE key requests.
     * 
     * @return The resource ID to include in SPEKE key requests.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * The resource ID to include in SPEKE key requests.
     * 
     * @param resourceId
     *        The resource ID to include in SPEKE key requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetShallow withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * ARN of the source object in S3.
     * 
     * @param sourceArn
     *        ARN of the source object in S3.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * ARN of the source object in S3.
     * 
     * @return ARN of the source object in S3.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * ARN of the source object in S3.
     * 
     * @param sourceArn
     *        ARN of the source object in S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetShallow withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * The IAM role ARN used to access the source S3 bucket.
     * 
     * @param sourceRoleArn
     *        The IAM role ARN used to access the source S3 bucket.
     */

    public void setSourceRoleArn(String sourceRoleArn) {
        this.sourceRoleArn = sourceRoleArn;
    }

    /**
     * The IAM role ARN used to access the source S3 bucket.
     * 
     * @return The IAM role ARN used to access the source S3 bucket.
     */

    public String getSourceRoleArn() {
        return this.sourceRoleArn;
    }

    /**
     * The IAM role ARN used to access the source S3 bucket.
     * 
     * @param sourceRoleArn
     *        The IAM role ARN used to access the source S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetShallow withSourceRoleArn(String sourceRoleArn) {
        setSourceRoleArn(sourceRoleArn);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getPackagingGroupId() != null)
            sb.append("PackagingGroupId: ").append(getPackagingGroupId()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getSourceRoleArn() != null)
            sb.append("SourceRoleArn: ").append(getSourceRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetShallow == false)
            return false;
        AssetShallow other = (AssetShallow) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getPackagingGroupId() == null ^ this.getPackagingGroupId() == null)
            return false;
        if (other.getPackagingGroupId() != null && other.getPackagingGroupId().equals(this.getPackagingGroupId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getSourceRoleArn() == null ^ this.getSourceRoleArn() == null)
            return false;
        if (other.getSourceRoleArn() != null && other.getSourceRoleArn().equals(this.getSourceRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getPackagingGroupId() == null) ? 0 : getPackagingGroupId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getSourceRoleArn() == null) ? 0 : getSourceRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public AssetShallow clone() {
        try {
            return (AssetShallow) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackagevod.model.transform.AssetShallowMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
