package com.tencentcloudapi.mna.v20210119;
public enum MnaErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 交易流程异常
     FAILEDOPERATION_TRANSACTIONEXCEPTION("FailedOperation.TransactionException"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 请求控制器发生错误。
     INTERNALERROR_CONTROLREQUESTERROR("InternalError.ControlRequestError"),
     
    // 设备密钥已存在。
     INTERNALERROR_DUPLICATEDATAKEY("InternalError.DuplicateDataKey"),
     
    // 设备名已存在。
     INTERNALERROR_DUPLICATEDEVICENAME("InternalError.DuplicateDeviceName"),
     
    // 文件读写异常。
     INTERNALERROR_FILEIOERROR("InternalError.FileIOError"),
     
    // 监控数据请求错误。
     INTERNALERROR_MONITORDATAREQUESTERROR("InternalError.MonitorDataRequestError"),
     
    // 智研流量数据请求错误。
     INTERNALERROR_NETWORKINFOREQUESTERROR("InternalError.NetworkInfoRequestError"),
     
    // 预置密钥尚未创建。
     INTERNALERROR_UNDEFINEDENCRYPTEDKEY("InternalError.UndefinedEncryptedKey"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 无法获取到可加速的运营商信息
     INVALIDPARAMETERVALUE_VENDORNOTFOUND("InvalidParameterValue.VendorNotFound"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 操作被拒绝。
     OPERATIONDENIED("OperationDenied"),
     
    // 不建议加速。
     OPERATIONDENIED_ACCELERATIONNOTSUGGEST("OperationDenied.AccelerationNotSuggest"),
     
    // 中国电信加速token过期。
     OPERATIONDENIED_CTCCTOKENEXPIRED("OperationDenied.CTCCTokenExpired"),
     
    // 相同加速间隔时间过短。
     OPERATIONDENIED_CREATEQOSEXCEEDLIMIT("OperationDenied.CreateQosExceedLimit"),
     
    // SN已存在
     OPERATIONDENIED_DUPLICATESN("OperationDenied.DuplicateSN"),
     
    // 输入SN对应的硬件已经激活
     OPERATIONDENIED_HARDWAREHASACTIVATED("OperationDenied.HardwareHasActivated"),
     
    // 输入SN对应的硬件不存在。
     OPERATIONDENIED_HARDWARENOTEXIST("OperationDenied.HardwareNotExist"),
     
    // 余额不足
     OPERATIONDENIED_INSUFFICIENTBALANCE("OperationDenied.InsufficientBalance"),
     
    // 无支付权限
     OPERATIONDENIED_NOTALLOWEDTOPAY("OperationDenied.NotAllowedToPay"),
     
    // 请求运营商加速超时。
     OPERATIONDENIED_REQUESTQOSTIMEOUT("OperationDenied.RequestQosTimeout"),
     
    // 未实名认证
     OPERATIONDENIED_UNAUTHORIZEDUSER("OperationDenied.UnauthorizedUser"),
     
    // 该用户加速已取消，不处于加速状态。
     OPERATIONDENIED_USERNONACCELERATED("OperationDenied.UserNonAccelerated"),
     
    // 该用户不在运营商网络可加速范围内
     OPERATIONDENIED_USEROUTOFCOVERAGE("OperationDenied.UserOutOfCoverage"),
     
    // 当前账号尚未注册为厂商。
     OPERATIONDENIED_VENDORNOTREGISTER("OperationDenied.VendorNotRegister"),
     
    // 运营商返回结果错误。
     OPERATIONDENIED_VENDORRETURNERROR("OperationDenied.VendorReturnError"),
     
    // 运营商服务器临时错误。
     OPERATIONDENIED_VENDORSERVERERROR("OperationDenied.VendorServerError"),
     
    // 请求的次数超过了频率限制。
     REQUESTLIMITEXCEEDED("RequestLimitExceeded"),
     
    // 资源被占用。
     RESOURCEINUSE("ResourceInUse"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // 未验证服务权限
     UNAUTHORIZEDOPERATION_NOPERMISSION("UnauthorizedOperation.NoPermission"),
     
    // 直播服务未开通
     UNAUTHORIZEDOPERATION_UNOPENEDLIVESERVICE("UnauthorizedOperation.UnopenedLiveService");
     
    private String value;
    private MnaErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

