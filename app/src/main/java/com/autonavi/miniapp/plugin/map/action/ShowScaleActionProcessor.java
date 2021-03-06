package com.autonavi.miniapp.plugin.map.action;

import android.content.Context;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.h5container.api.H5BridgeContext;
import com.alipay.mobile.h5container.api.H5Page;
import com.autonavi.miniapp.plugin.map.AdapterTextureMapView;
import java.lang.ref.WeakReference;

public class ShowScaleActionProcessor extends BaseActionProcessor {
    public ShowScaleActionProcessor(WeakReference<Context> weakReference, WeakReference<H5Page> weakReference2, AdapterTextureMapView adapterTextureMapView) {
        super("showsScale", weakReference, weakReference2, adapterTextureMapView);
    }

    /* access modifiers changed from: protected */
    public void doProcess(JSONObject jSONObject, H5BridgeContext h5BridgeContext) {
        try {
            int parseInt = Integer.parseInt(jSONObject.getString("isShowsScale"));
            AdapterTextureMapView adapterTextureMapView = this.mRealView;
            boolean z = true;
            if (parseInt != 1) {
                z = false;
            }
            adapterTextureMapView.setShowScaleView(z);
            h5BridgeContext.sendSuccess();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
