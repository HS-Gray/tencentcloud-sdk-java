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
package com.tencentcloudapi.ccc.v20200210;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ccc.v20200210.models.*;

public class CccClient extends AbstractClient{
    private static String endpoint = "ccc.tencentcloudapi.com";
    private static String service = "ccc";
    private static String version = "2020-02-10";
    
    public CccClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CccClient(Credential credential, String region, ClientProfile profile) {
        super(CccClient.endpoint, CccClient.version, credential, region, profile);
    }

    /**
     *绑定号码外呼技能组
     * @param req BindNumberCallOutSkillGroupRequest
     * @return BindNumberCallOutSkillGroupResponse
     * @throws TencentCloudSDKException
     */
    public BindNumberCallOutSkillGroupResponse BindNumberCallOutSkillGroup(BindNumberCallOutSkillGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindNumberCallOutSkillGroup", BindNumberCallOutSkillGroupResponse.class);
    }

    /**
     *绑定座席所属技能组
     * @param req BindStaffSkillGroupListRequest
     * @return BindStaffSkillGroupListResponse
     * @throws TencentCloudSDKException
     */
    public BindStaffSkillGroupListResponse BindStaffSkillGroupList(BindStaffSkillGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindStaffSkillGroupList", BindStaffSkillGroupListResponse.class);
    }

    /**
     *创建管理端访问链接
     * @param req CreateAdminURLRequest
     * @return CreateAdminURLResponse
     * @throws TencentCloudSDKException
     */
    public CreateAdminURLResponse CreateAdminURL(CreateAdminURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAdminURL", CreateAdminURLResponse.class);
    }

    /**
     *创建自动外呼任务
     * @param req CreateAutoCalloutTaskRequest
     * @return CreateAutoCalloutTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAutoCalloutTaskResponse CreateAutoCalloutTask(CreateAutoCalloutTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAutoCalloutTask", CreateAutoCalloutTaskResponse.class);
    }

    /**
     *新建技能组
     * @param req CreateCCCSkillGroupRequest
     * @return CreateCCCSkillGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateCCCSkillGroupResponse CreateCCCSkillGroup(CreateCCCSkillGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCCCSkillGroup", CreateCCCSkillGroupResponse.class);
    }

    /**
     *创建外呼会话，当前仅支持双呼，即先使用平台号码呼出到坐席手机上，坐席接听后，然后再外呼用户，而且由于运营商频率限制，坐席手机号必须先加白名单，避免频控导致外呼失败。
     * @param req CreateCallOutSessionRequest
     * @return CreateCallOutSessionResponse
     * @throws TencentCloudSDKException
     */
    public CreateCallOutSessionResponse CreateCallOutSession(CreateCallOutSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCallOutSession", CreateCallOutSessionResponse.class);
    }

    /**
     *用于无限频率地呼叫坐席手机
     * @param req CreateCarrierPrivilegeNumberApplicantRequest
     * @return CreateCarrierPrivilegeNumberApplicantResponse
     * @throws TencentCloudSDKException
     */
    public CreateCarrierPrivilegeNumberApplicantResponse CreateCarrierPrivilegeNumberApplicant(CreateCarrierPrivilegeNumberApplicantRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCarrierPrivilegeNumberApplicant", CreateCarrierPrivilegeNumberApplicantResponse.class);
    }

    /**
     *创建话机账号
     * @param req CreateExtensionRequest
     * @return CreateExtensionResponse
     * @throws TencentCloudSDKException
     */
    public CreateExtensionResponse CreateExtension(CreateExtensionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateExtension", CreateExtensionResponse.class);
    }

    /**
     *创建 SDK 登录 Token。
     * @param req CreateSDKLoginTokenRequest
     * @return CreateSDKLoginTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateSDKLoginTokenResponse CreateSDKLoginToken(CreateSDKLoginTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSDKLoginToken", CreateSDKLoginTokenResponse.class);
    }

    /**
     *创建客服账号。
     * @param req CreateStaffRequest
     * @return CreateStaffResponse
     * @throws TencentCloudSDKException
     */
    public CreateStaffResponse CreateStaff(CreateStaffRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStaff", CreateStaffResponse.class);
    }

    /**
     *创建用户数据签名
     * @param req CreateUserSigRequest
     * @return CreateUserSigResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserSigResponse CreateUserSig(CreateUserSigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUserSig", CreateUserSigResponse.class);
    }

    /**
     *删除话机账号
     * @param req DeleteExtensionRequest
     * @return DeleteExtensionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteExtensionResponse DeleteExtension(DeleteExtensionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteExtension", DeleteExtensionResponse.class);
    }

    /**
     *删除坐席信息
     * @param req DeleteStaffRequest
     * @return DeleteStaffResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStaffResponse DeleteStaff(DeleteStaffRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteStaff", DeleteStaffResponse.class);
    }

    /**
     *查询生效运营商白名单规则
     * @param req DescribeActiveCarrierPrivilegeNumberRequest
     * @return DescribeActiveCarrierPrivilegeNumberResponse
     * @throws TencentCloudSDKException
     */
    public DescribeActiveCarrierPrivilegeNumberResponse DescribeActiveCarrierPrivilegeNumber(DescribeActiveCarrierPrivilegeNumberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeActiveCarrierPrivilegeNumber", DescribeActiveCarrierPrivilegeNumberResponse.class);
    }

    /**
     *查询自动外呼任务详情
     * @param req DescribeAutoCalloutTaskRequest
     * @return DescribeAutoCalloutTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoCalloutTaskResponse DescribeAutoCalloutTask(DescribeAutoCalloutTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoCalloutTask", DescribeAutoCalloutTaskResponse.class);
    }

    /**
     *批量查询自动任务外呼
     * @param req DescribeAutoCalloutTasksRequest
     * @return DescribeAutoCalloutTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoCalloutTasksResponse DescribeAutoCalloutTasks(DescribeAutoCalloutTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAutoCalloutTasks", DescribeAutoCalloutTasksResponse.class);
    }

    /**
     *获取用户购买信息列表
     * @param req DescribeCCCBuyInfoListRequest
     * @return DescribeCCCBuyInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCCBuyInfoListResponse DescribeCCCBuyInfoList(DescribeCCCBuyInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCCCBuyInfoList", DescribeCCCBuyInfoListResponse.class);
    }

    /**
     *获取呼入实时数据统计指标
     * @param req DescribeCallInMetricsRequest
     * @return DescribeCallInMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCallInMetricsResponse DescribeCallInMetrics(DescribeCallInMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCallInMetrics", DescribeCallInMetricsResponse.class);
    }

    /**
     *查询单状态
     * @param req DescribeCarrierPrivilegeNumberApplicantsRequest
     * @return DescribeCarrierPrivilegeNumberApplicantsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCarrierPrivilegeNumberApplicantsResponse DescribeCarrierPrivilegeNumberApplicants(DescribeCarrierPrivilegeNumberApplicantsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCarrierPrivilegeNumberApplicants", DescribeCarrierPrivilegeNumberApplicantsResponse.class);
    }

    /**
     *获取指定服务记录文本聊天内容，需要先使用查询在线客服记录（DescribeIMCdrs） API 获取服务记录 SessionId。

文本聊天记录只保存了 1 年内的，1 年之前会自动清理。
     * @param req DescribeChatMessagesRequest
     * @return DescribeChatMessagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChatMessagesResponse DescribeChatMessages(DescribeChatMessagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeChatMessages", DescribeChatMessagesResponse.class);
    }

    /**
     *获取话机信息
     * @param req DescribeExtensionRequest
     * @return DescribeExtensionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExtensionResponse DescribeExtension(DescribeExtensionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExtension", DescribeExtensionResponse.class);
    }

    /**
     *查询话机列表信息
     * @param req DescribeExtensionsRequest
     * @return DescribeExtensionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExtensionsResponse DescribeExtensions(DescribeExtensionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExtensions", DescribeExtensionsResponse.class);
    }

    /**
     *获取包括全媒体和文本会话两种类型的服务记录。
     * @param req DescribeIMCdrListRequest
     * @return DescribeIMCdrListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIMCdrListResponse DescribeIMCdrList(DescribeIMCdrListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIMCdrList", DescribeIMCdrListResponse.class);
    }

    /**
     *获取包括全媒体和文本会话两种类型的服务记录。
     * @param req DescribeIMCdrsRequest
     * @return DescribeIMCdrsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIMCdrsResponse DescribeIMCdrs(DescribeIMCdrsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIMCdrs", DescribeIMCdrsResponse.class);
    }

    /**
     *查询号码列表
     * @param req DescribeNumbersRequest
     * @return DescribeNumbersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNumbersResponse DescribeNumbers(DescribeNumbersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNumbers", DescribeNumbersResponse.class);
    }

    /**
     *获取当前正在通话的会话列表
     * @param req DescribePSTNActiveSessionListRequest
     * @return DescribePSTNActiveSessionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePSTNActiveSessionListResponse DescribePSTNActiveSessionList(DescribePSTNActiveSessionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePSTNActiveSessionList", DescribePSTNActiveSessionListResponse.class);
    }

    /**
     *获取主被叫受保护的电话服务记录与录音
     * @param req DescribeProtectedTelCdrRequest
     * @return DescribeProtectedTelCdrResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProtectedTelCdrResponse DescribeProtectedTelCdr(DescribeProtectedTelCdrRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProtectedTelCdr", DescribeProtectedTelCdrResponse.class);
    }

    /**
     *获取技能组信息列表
     * @param req DescribeSkillGroupInfoListRequest
     * @return DescribeSkillGroupInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSkillGroupInfoListResponse DescribeSkillGroupInfoList(DescribeSkillGroupInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSkillGroupInfoList", DescribeSkillGroupInfoListResponse.class);
    }

    /**
     *获取坐席信息列表
     * @param req DescribeStaffInfoListRequest
     * @return DescribeStaffInfoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStaffInfoListResponse DescribeStaffInfoList(DescribeStaffInfoListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStaffInfoList", DescribeStaffInfoListResponse.class);
    }

    /**
     *获取坐席实时状态统计指标
     * @param req DescribeStaffStatusMetricsRequest
     * @return DescribeStaffStatusMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStaffStatusMetricsResponse DescribeStaffStatusMetrics(DescribeStaffStatusMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStaffStatusMetrics", DescribeStaffStatusMetricsResponse.class);
    }

    /**
     *按实例获取电话消耗统计
     * @param req DescribeTelCallInfoRequest
     * @return DescribeTelCallInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTelCallInfoResponse DescribeTelCallInfo(DescribeTelCallInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTelCallInfo", DescribeTelCallInfoResponse.class);
    }

    /**
     *获取电话服务记录与录音
     * @param req DescribeTelCdrRequest
     * @return DescribeTelCdrResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTelCdrResponse DescribeTelCdr(DescribeTelCdrRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTelCdr", DescribeTelCdrResponse.class);
    }

    /**
     *获取 PSTN 会话信息
     * @param req DescribeTelSessionRequest
     * @return DescribeTelSessionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTelSessionResponse DescribeTelSession(DescribeTelSessionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTelSession", DescribeTelSessionResponse.class);
    }

    /**
     *停用号码
     * @param req DisableCCCPhoneNumberRequest
     * @return DisableCCCPhoneNumberResponse
     * @throws TencentCloudSDKException
     */
    public DisableCCCPhoneNumberResponse DisableCCCPhoneNumber(DisableCCCPhoneNumberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableCCCPhoneNumber", DisableCCCPhoneNumberResponse.class);
    }

    /**
     *挂断电话
     * @param req HangUpCallRequest
     * @return HangUpCallResponse
     * @throws TencentCloudSDKException
     */
    public HangUpCallResponse HangUpCall(HangUpCallRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "HangUpCall", HangUpCallResponse.class);
    }

    /**
     *修改话机账号(绑定技能组、绑定坐席账号)
     * @param req ModifyExtensionRequest
     * @return ModifyExtensionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyExtensionResponse ModifyExtension(ModifyExtensionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyExtension", ModifyExtensionResponse.class);
    }

    /**
     *修改客服账号
     * @param req ModifyStaffRequest
     * @return ModifyStaffResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStaffResponse ModifyStaff(ModifyStaffRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStaff", ModifyStaffResponse.class);
    }

    /**
     *重置话机注册密码
     * @param req ResetExtensionPasswordRequest
     * @return ResetExtensionPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetExtensionPasswordResponse ResetExtensionPassword(ResetExtensionPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetExtensionPassword", ResetExtensionPasswordResponse.class);
    }

    /**
     *停止自动外呼任务
     * @param req StopAutoCalloutTaskRequest
     * @return StopAutoCalloutTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopAutoCalloutTaskResponse StopAutoCalloutTask(StopAutoCalloutTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopAutoCalloutTask", StopAutoCalloutTaskResponse.class);
    }

    /**
     *解绑号码外呼技能组
     * @param req UnbindNumberCallOutSkillGroupRequest
     * @return UnbindNumberCallOutSkillGroupResponse
     * @throws TencentCloudSDKException
     */
    public UnbindNumberCallOutSkillGroupResponse UnbindNumberCallOutSkillGroup(UnbindNumberCallOutSkillGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindNumberCallOutSkillGroup", UnbindNumberCallOutSkillGroupResponse.class);
    }

    /**
     *解绑坐席所属技能组
     * @param req UnbindStaffSkillGroupListRequest
     * @return UnbindStaffSkillGroupListResponse
     * @throws TencentCloudSDKException
     */
    public UnbindStaffSkillGroupListResponse UnbindStaffSkillGroupList(UnbindStaffSkillGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindStaffSkillGroupList", UnbindStaffSkillGroupListResponse.class);
    }

}
