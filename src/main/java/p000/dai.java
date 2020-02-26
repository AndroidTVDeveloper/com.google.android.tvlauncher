package p000;

import android.text.TextUtils;
import android.util.Log;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dai */
/* compiled from: PG */
public final class dai {

    /* renamed from: a */
    public final String f8050a;

    /* renamed from: b */
    public final String f8051b;

    /* renamed from: c */
    public int f8052c;

    /* renamed from: d */
    public boolean f8053d;

    /* renamed from: e */
    public boolean f8054e;

    /* renamed from: f */
    public boolean f8055f = true;

    /* renamed from: g */
    public boolean f8056g = true;

    public /* synthetic */ dai(dah dah) {
        this.f8050a = dah.f8043a;
        if (TextUtils.isEmpty(dah.f8044b)) {
            this.f8051b = null;
        } else {
            this.f8051b = dah.f8044b;
        }
        this.f8052c = dah.f8045c;
        this.f8053d = dah.f8046d;
        this.f8054e = dah.f8047e;
        this.f8055f = dah.f8048f;
        this.f8056g = dah.f8049g;
    }

    public dai(String str, String str2) {
        this.f8050a = str;
        if (TextUtils.isEmpty(str2)) {
            this.f8051b = null;
        } else {
            this.f8051b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dai) {
            dai dai = (dai) obj;
            if (!TextUtils.equals(this.f8050a, dai.f8050a) || !TextUtils.equals(this.f8051b, dai.f8051b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m6054a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public final int hashCode() {
        return Objects.hash(this.f8050a, this.f8051b);
    }

    /* renamed from: a */
    static JSONArray m6055a(List list) {
        JSONArray jSONArray = new JSONArray();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dai dai = (dai) list.get(i);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("pkgName", dai.f8050a);
                jSONObject.put("sysChannelKey", dai.f8051b);
                jSONObject.put("chanPos", dai.f8052c);
                jSONObject.put("isSponsored", dai.f8053d);
                jSONObject.put("isGoogleConfig", dai.f8054e);
                jSONObject.put("canMoveChannel", dai.f8055f);
                jSONObject.put("canHideChannel", dai.f8056g);
            } catch (JSONException e) {
                String valueOf = String.valueOf(dai);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                sb.append("Could not serialize ChannelInfo: ");
                sb.append(valueOf);
                Log.e("ChannelInfo", sb.toString());
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public final String toString() {
        String str = this.f8050a;
        String str2 = this.f8051b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        return sb.toString();
    }
}
