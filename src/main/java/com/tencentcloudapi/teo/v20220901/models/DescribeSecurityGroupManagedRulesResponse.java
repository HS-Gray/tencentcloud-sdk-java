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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityGroupManagedRulesResponse extends AbstractModel{

    /**
    * 本次返回的规则数。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 总规则数。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 托管规则信息。
    */
    @SerializedName("WafGroupInfo")
    @Expose
    private WafGroupInfo WafGroupInfo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 本次返回的规则数。 
     * @return Count 本次返回的规则数。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 本次返回的规则数。
     * @param Count 本次返回的规则数。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 总规则数。 
     * @return Total 总规则数。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总规则数。
     * @param Total 总规则数。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 托管规则信息。 
     * @return WafGroupInfo 托管规则信息。
     */
    public WafGroupInfo getWafGroupInfo() {
        return this.WafGroupInfo;
    }

    /**
     * Set 托管规则信息。
     * @param WafGroupInfo 托管规则信息。
     */
    public void setWafGroupInfo(WafGroupInfo WafGroupInfo) {
        this.WafGroupInfo = WafGroupInfo;
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

    public DescribeSecurityGroupManagedRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityGroupManagedRulesResponse(DescribeSecurityGroupManagedRulesResponse source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.WafGroupInfo != null) {
            this.WafGroupInfo = new WafGroupInfo(source.WafGroupInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamObj(map, prefix + "WafGroupInfo.", this.WafGroupInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
