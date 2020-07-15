/**
 * Copyright 2019 Huawei Technologies Co.,Ltd.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License.  You may obtain a copy of the
 * License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.obs.services.model;

/**
 * 设置桶多版本状态的请求
 * 
 * @since 3.20.3
 *
 */
public class SetBucketVersioningRequest extends BaseBucketRequest {

    private VersioningStatusEnum status;

    public SetBucketVersioningRequest() {

    }

    public SetBucketVersioningRequest(String bucketName, VersioningStatusEnum status) {
        super(bucketName);
        this.status = status;
    }

    public VersioningStatusEnum getStatus() {
        return status;
    }

    public void setStatus(VersioningStatusEnum status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SetBucketVersioningRequest [status=" + status + ", getBucketName()=" + getBucketName()
                + ", isRequesterPays()=" + isRequesterPays() + "]";
    }
}