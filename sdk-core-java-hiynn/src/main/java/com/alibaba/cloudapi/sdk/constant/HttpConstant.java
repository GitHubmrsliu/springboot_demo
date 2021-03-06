/*
 * Copyright 2017 Alibaba Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.cloudapi.sdk.constant;

/**
 * http协议相关常量
 *
 * @author fred
 * @date 2016/12/19
 */
public class HttpConstant {

    //请求Header Accept
    public static final String CLOUDAPI_HTTP_HEADER_ACCEPT = "accept";
    //请求Body内容MD5 Header
    public static final String CLOUDAPI_HTTP_HEADER_CONTENT_MD5 = "content-md5";
    //请求Body内容MD5 Header
    public static final String CLOUDAPI_HTTP_HEADER_CA_CONTENT_MD5 = "x-ca-content-md5";
    //请求Header Content-Type
    public static final String CLOUDAPI_HTTP_HEADER_CONTENT_TYPE = "content-type";
    //请求Header UserAgent
    public static final String CLOUDAPI_HTTP_HEADER_USER_AGENT = "user-agent";
    //请求Header Date
    public static final String CLOUDAPI_HTTP_HEADER_DATE = "date";
    //请求Header Host
    public static final String CLOUDAPI_HTTP_HEADER_HOST = "host";

    //表单类型Content-Type
    public static final String CLOUDAPI_CONTENT_TYPE_FORM = "application/x-www-form-urlencoded; charset=utf-8";
    // 流类型Content-Type
    public static final String CLOUDAPI_CONTENT_TYPE_STREAM = "application/octet-stream; charset=utf-8";
    //JSON类型Content-Type
    public static final String CLOUDAPI_CONTENT_TYPE_JSON = "application/json; charset=utf-8";
    //XML类型Content-Type
    public static final String CLOUDAPI_CONTENT_TYPE_XML = "application/xml; charset=utf-8";
    //文本类型Content-Type
    public static final String CLOUDAPI_CONTENT_TYPE_TEXT = "application/text; charset=utf-8";
}
