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
package com.tencentcloudapi.yinsuda.v20220527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKTVPlaylistDetailRequest extends AbstractModel{

    /**
    * 应用名称。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 用户标识。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 歌单 Id。
    */
    @SerializedName("PlaylistId")
    @Expose
    private String PlaylistId;

    /**
    * 滚动标记。
    */
    @SerializedName("ScrollToken")
    @Expose
    private String ScrollToken;

    /**
    * 返回条数，默认：20，最大：50。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 权益过滤，取值有：
<li>Play：可播；</li>
<li>Sing：可唱。</li>
    */
    @SerializedName("RightFilters")
    @Expose
    private String [] RightFilters;

    /**
     * Get 应用名称。 
     * @return AppName 应用名称。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称。
     * @param AppName 应用名称。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 用户标识。 
     * @return UserId 用户标识。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户标识。
     * @param UserId 用户标识。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 歌单 Id。 
     * @return PlaylistId 歌单 Id。
     */
    public String getPlaylistId() {
        return this.PlaylistId;
    }

    /**
     * Set 歌单 Id。
     * @param PlaylistId 歌单 Id。
     */
    public void setPlaylistId(String PlaylistId) {
        this.PlaylistId = PlaylistId;
    }

    /**
     * Get 滚动标记。 
     * @return ScrollToken 滚动标记。
     */
    public String getScrollToken() {
        return this.ScrollToken;
    }

    /**
     * Set 滚动标记。
     * @param ScrollToken 滚动标记。
     */
    public void setScrollToken(String ScrollToken) {
        this.ScrollToken = ScrollToken;
    }

    /**
     * Get 返回条数，默认：20，最大：50。 
     * @return Limit 返回条数，默认：20，最大：50。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回条数，默认：20，最大：50。
     * @param Limit 返回条数，默认：20，最大：50。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 权益过滤，取值有：
<li>Play：可播；</li>
<li>Sing：可唱。</li> 
     * @return RightFilters 权益过滤，取值有：
<li>Play：可播；</li>
<li>Sing：可唱。</li>
     */
    public String [] getRightFilters() {
        return this.RightFilters;
    }

    /**
     * Set 权益过滤，取值有：
<li>Play：可播；</li>
<li>Sing：可唱。</li>
     * @param RightFilters 权益过滤，取值有：
<li>Play：可播；</li>
<li>Sing：可唱。</li>
     */
    public void setRightFilters(String [] RightFilters) {
        this.RightFilters = RightFilters;
    }

    public DescribeKTVPlaylistDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKTVPlaylistDetailRequest(DescribeKTVPlaylistDetailRequest source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.PlaylistId != null) {
            this.PlaylistId = new String(source.PlaylistId);
        }
        if (source.ScrollToken != null) {
            this.ScrollToken = new String(source.ScrollToken);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.RightFilters != null) {
            this.RightFilters = new String[source.RightFilters.length];
            for (int i = 0; i < source.RightFilters.length; i++) {
                this.RightFilters[i] = new String(source.RightFilters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "PlaylistId", this.PlaylistId);
        this.setParamSimple(map, prefix + "ScrollToken", this.ScrollToken);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "RightFilters.", this.RightFilters);

    }
}
