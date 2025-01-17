/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tics.v20181115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFileInfoResponse extends AbstractModel {

    /**
    * 是否有数据，0代表有数据，1代表没有数据
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
    * 判定结果，如：black、white、grey
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 置信度，取值0-100
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * 文件类型，文件hash
（md5,sha1,sha256）,文件大小等等文件
基础信息
    */
    @SerializedName("FileInfo")
    @Expose
    private FileInfoType [] FileInfo;

    /**
    * 恶意标签，对应的团伙，家族等信息。
    */
    @SerializedName("Tags")
    @Expose
    private TagType [] Tags;

    /**
    * 对应的历史上的威胁情报事件
    */
    @SerializedName("Intelligences")
    @Expose
    private IntelligenceType [] Intelligences;

    /**
    * 情报相关的上下文
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否有数据，0代表有数据，1代表没有数据 
     * @return ReturnCode 是否有数据，0代表有数据，1代表没有数据
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set 是否有数据，0代表有数据，1代表没有数据
     * @param ReturnCode 是否有数据，0代表有数据，1代表没有数据
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get 判定结果，如：black、white、grey 
     * @return Result 判定结果，如：black、white、grey
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 判定结果，如：black、white、grey
     * @param Result 判定结果，如：black、white、grey
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 置信度，取值0-100 
     * @return Confidence 置信度，取值0-100
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度，取值0-100
     * @param Confidence 置信度，取值0-100
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 文件类型，文件hash
（md5,sha1,sha256）,文件大小等等文件
基础信息 
     * @return FileInfo 文件类型，文件hash
（md5,sha1,sha256）,文件大小等等文件
基础信息
     */
    public FileInfoType [] getFileInfo() {
        return this.FileInfo;
    }

    /**
     * Set 文件类型，文件hash
（md5,sha1,sha256）,文件大小等等文件
基础信息
     * @param FileInfo 文件类型，文件hash
（md5,sha1,sha256）,文件大小等等文件
基础信息
     */
    public void setFileInfo(FileInfoType [] FileInfo) {
        this.FileInfo = FileInfo;
    }

    /**
     * Get 恶意标签，对应的团伙，家族等信息。 
     * @return Tags 恶意标签，对应的团伙，家族等信息。
     */
    public TagType [] getTags() {
        return this.Tags;
    }

    /**
     * Set 恶意标签，对应的团伙，家族等信息。
     * @param Tags 恶意标签，对应的团伙，家族等信息。
     */
    public void setTags(TagType [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 对应的历史上的威胁情报事件 
     * @return Intelligences 对应的历史上的威胁情报事件
     */
    public IntelligenceType [] getIntelligences() {
        return this.Intelligences;
    }

    /**
     * Set 对应的历史上的威胁情报事件
     * @param Intelligences 对应的历史上的威胁情报事件
     */
    public void setIntelligences(IntelligenceType [] Intelligences) {
        this.Intelligences = Intelligences;
    }

    /**
     * Get 情报相关的上下文 
     * @return Context 情报相关的上下文
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 情报相关的上下文
     * @param Context 情报相关的上下文
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeFileInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFileInfoResponse(DescribeFileInfoResponse source) {
        if (source.ReturnCode != null) {
            this.ReturnCode = new Long(source.ReturnCode);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
        if (source.FileInfo != null) {
            this.FileInfo = new FileInfoType[source.FileInfo.length];
            for (int i = 0; i < source.FileInfo.length; i++) {
                this.FileInfo[i] = new FileInfoType(source.FileInfo[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new TagType[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagType(source.Tags[i]);
            }
        }
        if (source.Intelligences != null) {
            this.Intelligences = new IntelligenceType[source.Intelligences.length];
            for (int i = 0; i < source.Intelligences.length; i++) {
                this.Intelligences[i] = new IntelligenceType(source.Intelligences[i]);
            }
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamArrayObj(map, prefix + "FileInfo.", this.FileInfo);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "Intelligences.", this.Intelligences);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

