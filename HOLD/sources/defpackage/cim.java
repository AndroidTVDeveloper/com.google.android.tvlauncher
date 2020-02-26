package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cim  reason: default package */
/* compiled from: PG */
public final class cim {
    private static volatile cim d;
    public final cja a;
    public final SharedPreferences b;
    public final Map c = new HashMap();

    private cim(Context context) {
        this.a = dbq.a(context);
        this.b = context.getSharedPreferences("com.google.android.tvlauncher.appsview.AppLinksDataManager", 0);
        this.c.clear();
        for (Map.Entry next : this.b.getAll().entrySet()) {
            String str = (String) next.getKey();
            try {
                JSONObject jSONObject = new JSONObject((String) next.getValue());
                dbx dbx = new dbx((byte) 0);
                dbx.a = jSONObject.getString("EXTRA_APP_NAME");
                dbx.b = jSONObject.getString("EXTRA_PACKAGE_NAME");
                dbx.c = jSONObject.getString("EXTRA_BANNER_URI");
                dbx.d = jSONObject.getString("EXTRA_DATA_URI");
                dbx.e = jSONObject.getString("EXTRA_DEVELOPER");
                dbx.f = jSONObject.getString("EXTRA_CATEGORY");
                dbx.g = jSONObject.getString("EXTRA_DESCRIPTION");
                dbx.h = jSONObject.getBoolean("EXTRA_IS_GAME");
                dbx.i = true;
                dby a2 = dbx.a();
                JSONArray jSONArray = jSONObject.getJSONArray("EXTRA_SCREENSHOTS");
                for (int i = 0; i < jSONArray.length(); i++) {
                    a2.a(jSONArray.getString(i));
                }
                if (TextUtils.equals(str, a2.k)) {
                    this.c.put(a2.k, a2);
                } else {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
                    sb.append("Promotion id '");
                    sb.append(str);
                    sb.append("' does not match with Json String");
                    Log.e("AppLinksDataManager", sb.toString());
                }
            } catch (JSONException e) {
                Log.e("AppLinksDataManager", "Fail to convert encoded string into JSON", e);
            }
        }
    }

    public final dby a(String str) {
        return (dby) this.c.get(str);
    }

    public static cim a(Context context) {
        if (d == null) {
            synchronized (cim.class) {
                if (d == null) {
                    d = new cim(context);
                }
            }
        }
        return d;
    }
}
