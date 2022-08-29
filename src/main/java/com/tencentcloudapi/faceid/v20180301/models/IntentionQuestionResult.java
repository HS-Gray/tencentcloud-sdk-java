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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntentionQuestionResult extends AbstractModel{

    /**
    * 意愿核身最终结果：
0：认证通过，-1：认证未通过，-2：浏览器内核不兼容，无法进行意愿校验
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinalResultCode")
    @Expose
    private String FinalResultCode;

    /**
    * 视频base64（其中包含全程问题和回答音频，mp4格式）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Video")
    @Expose
    private String Video;

    /**
    * 屏幕截图base64列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScreenShot")
    @Expose
    private String [] ScreenShot;

    /**
    * 和答案匹配结果列表
0：成功，-1：不匹配
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultCode")
    @Expose
    private String [] ResultCode;

    /**
    * 回答问题语音识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsrResult")
    @Expose
    private String [] AsrResult;

    /**
    * 答案录音音频
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Audios")
    @Expose
    private String [] Audios;

    /**
     * Get 意愿核身最终结果：
0：认证通过，-1：认证未通过，-2：浏览器内核不兼容，无法进行意愿校验
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinalResultCode 意愿核身最终结果：
0：认证通过，-1：认证未通过，-2：浏览器内核不兼容，无法进行意愿校验
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFinalResultCode() {
        return this.FinalResultCode;
    }

    /**
     * Set 意愿核身最终结果：
0：认证通过，-1：认证未通过，-2：浏览器内核不兼容，无法进行意愿校验
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinalResultCode 意愿核身最终结果：
0：认证通过，-1：认证未通过，-2：浏览器内核不兼容，无法进行意愿校验
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinalResultCode(String FinalResultCode) {
        this.FinalResultCode = FinalResultCode;
    }

    /**
     * Get 视频base64（其中包含全程问题和回答音频，mp4格式）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Video 视频base64（其中包含全程问题和回答音频，mp4格式）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVideo() {
        return this.Video;
    }

    /**
     * Set 视频base64（其中包含全程问题和回答音频，mp4格式）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Video 视频base64（其中包含全程问题和回答音频，mp4格式）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideo(String Video) {
        this.Video = Video;
    }

    /**
     * Get 屏幕截图base64列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScreenShot 屏幕截图base64列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getScreenShot() {
        return this.ScreenShot;
    }

    /**
     * Set 屏幕截图base64列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScreenShot 屏幕截图base64列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScreenShot(String [] ScreenShot) {
        this.ScreenShot = ScreenShot;
    }

    /**
     * Get 和答案匹配结果列表
0：成功，-1：不匹配
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultCode 和答案匹配结果列表
0：成功，-1：不匹配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getResultCode() {
        return this.ResultCode;
    }

    /**
     * Set 和答案匹配结果列表
0：成功，-1：不匹配
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultCode 和答案匹配结果列表
0：成功，-1：不匹配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultCode(String [] ResultCode) {
        this.ResultCode = ResultCode;
    }

    /**
     * Get 回答问题语音识别结果列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsrResult 回答问题语音识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAsrResult() {
        return this.AsrResult;
    }

    /**
     * Set 回答问题语音识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsrResult 回答问题语音识别结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsrResult(String [] AsrResult) {
        this.AsrResult = AsrResult;
    }

    /**
     * Get 答案录音音频
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Audios 答案录音音频
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAudios() {
        return this.Audios;
    }

    /**
     * Set 答案录音音频
注意：此字段可能返回 null，表示取不到有效值。
     * @param Audios 答案录音音频
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudios(String [] Audios) {
        this.Audios = Audios;
    }

    public IntentionQuestionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntentionQuestionResult(IntentionQuestionResult source) {
        if (source.FinalResultCode != null) {
            this.FinalResultCode = new String(source.FinalResultCode);
        }
        if (source.Video != null) {
            this.Video = new String(source.Video);
        }
        if (source.ScreenShot != null) {
            this.ScreenShot = new String[source.ScreenShot.length];
            for (int i = 0; i < source.ScreenShot.length; i++) {
                this.ScreenShot[i] = new String(source.ScreenShot[i]);
            }
        }
        if (source.ResultCode != null) {
            this.ResultCode = new String[source.ResultCode.length];
            for (int i = 0; i < source.ResultCode.length; i++) {
                this.ResultCode[i] = new String(source.ResultCode[i]);
            }
        }
        if (source.AsrResult != null) {
            this.AsrResult = new String[source.AsrResult.length];
            for (int i = 0; i < source.AsrResult.length; i++) {
                this.AsrResult[i] = new String(source.AsrResult[i]);
            }
        }
        if (source.Audios != null) {
            this.Audios = new String[source.Audios.length];
            for (int i = 0; i < source.Audios.length; i++) {
                this.Audios[i] = new String(source.Audios[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FinalResultCode", this.FinalResultCode);
        this.setParamSimple(map, prefix + "Video", this.Video);
        this.setParamArraySimple(map, prefix + "ScreenShot.", this.ScreenShot);
        this.setParamArraySimple(map, prefix + "ResultCode.", this.ResultCode);
        this.setParamArraySimple(map, prefix + "AsrResult.", this.AsrResult);
        this.setParamArraySimple(map, prefix + "Audios.", this.Audios);

    }
}
