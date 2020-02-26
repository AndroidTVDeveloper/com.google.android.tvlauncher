package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cim */
/* compiled from: PG */
public final class cim {

    /* renamed from: d */
    private static volatile cim f5647d;

    /* renamed from: a */
    public final cja f5648a;

    /* renamed from: b */
    public final SharedPreferences f5649b;

    /* renamed from: c */
    public final Map f5650c = new HashMap();

    private cim(Context context) {
        this.f5648a = dbq.m6093a(context);
        this.f5649b = context.getSharedPreferences("com.google.android.tvlauncher.appsview.AppLinksDataManager", 0);
        this.f5650c.clear();
        for (Map.Entry next : this.f5649b.getAll().entrySet()) {
            String str = (String) next.getKey();
            try {
                JSONObject jSONObject = new JSONObject((String) next.getValue());
                dbx dbx = new dbx((byte) 0);
                dbx.f8173a = jSONObject.getString("EXTRA_APP_NAME");
                dbx.f8174b = jSONObject.getString("EXTRA_PACKAGE_NAME");
                dbx.f8175c = jSONObject.getString("EXTRA_BANNER_URI");
                dbx.f8176d = jSONObject.getString("EXTRA_DATA_URI");
                dbx.f8177e = jSONObject.getString("EXTRA_DEVELOPER");
                dbx.f8178f = jSONObject.getString("EXTRA_CATEGORY");
                dbx.f8179g = jSONObject.getString("EXTRA_DESCRIPTION");
                dbx.f8180h = jSONObject.getBoolean("EXTRA_IS_GAME");
                dbx.f8181i = true;
                dby a = dbx.mo4080a();
                JSONArray jSONArray = jSONObject.getJSONArray("EXTRA_SCREENSHOTS");
                for (int i = 0; i < jSONArray.length(); i++) {
                    a.mo4082a(jSONArray.getString(i));
                }
                if (TextUtils.equals(str, a.f8193k)) {
                    this.f5650c.put(a.f8193k, a);
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

    /* renamed from: a */
    public final dby mo2862a(String str) {
        return (dby) this.f5650c.get(str);
    }

    /* renamed from: a */
    public static cim m4816a(Context context) {
        if (f5647d == null) {
            synchronized (cim.class) {
                if (f5647d == null) {
                    f5647d = new cim(context);
                }
            }
        }
        return f5647d;
    }
}
