package com.autonavi.minimap.order.param;

import com.amap.bundle.aosservice.request.AosPostRequest;
import com.amap.bundle.blutils.app.ConfigerHelper;

public class ScenicDeleteRequest extends AosPostRequest {
    public static final String a;
    public String b = null;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(dkp.a(ConfigerHelper.AOS_SNS_URL_KEY));
        sb.append("ws/boss/order/scenic/delete/");
        a = sb.toString();
    }
}
