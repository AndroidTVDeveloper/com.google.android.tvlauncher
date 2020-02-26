package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dai  reason: default package */
/* compiled from: PG */
public final class dai {
    public final String a;
    public final String b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f = true;
    public boolean g = true;

    public /* synthetic */ dai(dah dah) {
        this.a = dah.a;
        if (TextUtils.isEmpty(dah.b)) {
            this.b = null;
        } else {
            this.b = dah.b;
        }
        this.c = dah.c;
        this.d = dah.d;
        this.e = dah.e;
        this.f = dah.f;
        this.g = dah.g;
    }

    public dai(String str, String str2) {
        this.a = str;
        if (TextUtils.isEmpty(str2)) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dai) {
            dai dai = (dai) obj;
            if (!TextUtils.equals(this.a, dai.a) || !TextUtils.equals(this.b, dai.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static String a(String str, String str2) {
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
        return Objects.hash(this.a, this.b);
    }

    static JSONArray a(List list) {
        JSONArray jSONArray = new JSONArray();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dai dai = (dai) list.get(i);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("pkgName", dai.a);
                jSONObject.put("sysChannelKey", dai.b);
                jSONObject.put("chanPos", dai.c);
                jSONObject.put("isSponsored", dai.d);
                jSONObject.put("isGoogleConfig", dai.e);
                jSONObject.put("canMoveChannel", dai.f);
                jSONObject.put("canHideChannel", dai.g);
            } catch (JSONException e2) {
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
        String str = this.a;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        return sb.toString();
    }
}
