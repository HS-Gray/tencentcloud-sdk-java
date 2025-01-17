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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEmbedTokenRequest extends AbstractModel {

    /**
    * 分享项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 分享页面id，嵌出看板时此为空值0
    */
    @SerializedName("PageId")
    @Expose
    private Long PageId;

    /**
    * page表示嵌出页面，panel表嵌出整个看板
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * 过期时间。 单位：分钟 最大值：240。即，4小时 默认值：240
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 备用字段
    */
    @SerializedName("ExtraParam")
    @Expose
    private String ExtraParam;

    /**
    * 使用者企业Id(仅用于多用户)
    */
    @SerializedName("UserCorpId")
    @Expose
    private String UserCorpId;

    /**
    * 使用者Id(仅用于多用户)
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 访问次数限制，限制范围1-99999，为空则不设置访问次数限制
    */
    @SerializedName("TicketNum")
    @Expose
    private Long TicketNum;

    /**
     * Get 分享项目id 
     * @return ProjectId 分享项目id
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 分享项目id
     * @param ProjectId 分享项目id
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 分享页面id，嵌出看板时此为空值0 
     * @return PageId 分享页面id，嵌出看板时此为空值0
     */
    public Long getPageId() {
        return this.PageId;
    }

    /**
     * Set 分享页面id，嵌出看板时此为空值0
     * @param PageId 分享页面id，嵌出看板时此为空值0
     */
    public void setPageId(Long PageId) {
        this.PageId = PageId;
    }

    /**
     * Get page表示嵌出页面，panel表嵌出整个看板 
     * @return Scope page表示嵌出页面，panel表嵌出整个看板
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set page表示嵌出页面，panel表嵌出整个看板
     * @param Scope page表示嵌出页面，panel表嵌出整个看板
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 过期时间。 单位：分钟 最大值：240。即，4小时 默认值：240 
     * @return ExpireTime 过期时间。 单位：分钟 最大值：240。即，4小时 默认值：240
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间。 单位：分钟 最大值：240。即，4小时 默认值：240
     * @param ExpireTime 过期时间。 单位：分钟 最大值：240。即，4小时 默认值：240
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 备用字段 
     * @return ExtraParam 备用字段
     */
    public String getExtraParam() {
        return this.ExtraParam;
    }

    /**
     * Set 备用字段
     * @param ExtraParam 备用字段
     */
    public void setExtraParam(String ExtraParam) {
        this.ExtraParam = ExtraParam;
    }

    /**
     * Get 使用者企业Id(仅用于多用户) 
     * @return UserCorpId 使用者企业Id(仅用于多用户)
     */
    public String getUserCorpId() {
        return this.UserCorpId;
    }

    /**
     * Set 使用者企业Id(仅用于多用户)
     * @param UserCorpId 使用者企业Id(仅用于多用户)
     */
    public void setUserCorpId(String UserCorpId) {
        this.UserCorpId = UserCorpId;
    }

    /**
     * Get 使用者Id(仅用于多用户) 
     * @return UserId 使用者Id(仅用于多用户)
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 使用者Id(仅用于多用户)
     * @param UserId 使用者Id(仅用于多用户)
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 访问次数限制，限制范围1-99999，为空则不设置访问次数限制 
     * @return TicketNum 访问次数限制，限制范围1-99999，为空则不设置访问次数限制
     */
    public Long getTicketNum() {
        return this.TicketNum;
    }

    /**
     * Set 访问次数限制，限制范围1-99999，为空则不设置访问次数限制
     * @param TicketNum 访问次数限制，限制范围1-99999，为空则不设置访问次数限制
     */
    public void setTicketNum(Long TicketNum) {
        this.TicketNum = TicketNum;
    }

    public CreateEmbedTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEmbedTokenRequest(CreateEmbedTokenRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.PageId != null) {
            this.PageId = new Long(source.PageId);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.ExtraParam != null) {
            this.ExtraParam = new String(source.ExtraParam);
        }
        if (source.UserCorpId != null) {
            this.UserCorpId = new String(source.UserCorpId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.TicketNum != null) {
            this.TicketNum = new Long(source.TicketNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ExtraParam", this.ExtraParam);
        this.setParamSimple(map, prefix + "UserCorpId", this.UserCorpId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "TicketNum", this.TicketNum);

    }
}

