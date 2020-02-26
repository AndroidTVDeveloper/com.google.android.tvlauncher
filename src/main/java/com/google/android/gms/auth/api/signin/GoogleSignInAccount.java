package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PG */
public class GoogleSignInAccount extends buf implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bms();

    /* renamed from: a */
    private final int f6244a;

    /* renamed from: b */
    private String f6245b;

    /* renamed from: c */
    private String f6246c;

    /* renamed from: d */
    private String f6247d;

    /* renamed from: e */
    private String f6248e;

    /* renamed from: f */
    private Uri f6249f;

    /* renamed from: g */
    private String f6250g;

    /* renamed from: h */
    private long f6251h;

    /* renamed from: i */
    private String f6252i;

    /* renamed from: j */
    private List f6253j;

    /* renamed from: k */
    private String f6254k;

    /* renamed from: l */
    private String f6255l;

    /* renamed from: m */
    private Set f6256m = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.f6244a = i;
        this.f6245b = str;
        this.f6246c = str2;
        this.f6247d = str3;
        this.f6248e = str4;
        this.f6249f = uri;
        this.f6250g = str5;
        this.f6251h = j;
        this.f6252i = str6;
        this.f6253j = list;
        this.f6254k = str7;
        this.f6255l = str8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GoogleSignInAccount) {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
            return googleSignInAccount.f6252i.equals(this.f6252i) && googleSignInAccount.m5222a().equals(m5222a());
        }
    }

    /* renamed from: a */
    public static GoogleSignInAccount m5221a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount googleSignInAccount = r3;
        GoogleSignInAccount googleSignInAccount2 = new GoogleSignInAccount(3, jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), parse, null, Long.valueOf(parseLong).longValue(), buh.m4201a(jSONObject.getString("obfuscatedIdentifier")), new ArrayList((Collection) buh.m4199a(hashSet)), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null));
        GoogleSignInAccount googleSignInAccount3 = googleSignInAccount;
        googleSignInAccount3.f6250g = jSONObject.optString("serverAuthCode", null);
        return googleSignInAccount3;
    }

    /* renamed from: a */
    private final Set m5222a() {
        HashSet hashSet = new HashSet(this.f6253j);
        hashSet.addAll(this.f6256m);
        return hashSet;
    }

    public final int hashCode() {
        return ((this.f6252i.hashCode() + 527) * 31) + m5222a().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = buj.m4230a(parcel);
        buj.m4251b(parcel, 1, this.f6244a);
        buj.m4239a(parcel, 2, this.f6245b);
        buj.m4239a(parcel, 3, this.f6246c);
        buj.m4239a(parcel, 4, this.f6247d);
        buj.m4239a(parcel, 5, this.f6248e);
        buj.m4238a(parcel, 6, this.f6249f, i);
        buj.m4239a(parcel, 7, this.f6250g);
        buj.m4235a(parcel, 8, this.f6251h);
        buj.m4239a(parcel, 9, this.f6252i);
        buj.m4252b(parcel, 10, this.f6253j);
        buj.m4239a(parcel, 11, this.f6254k);
        buj.m4239a(parcel, 12, this.f6255l);
        buj.m4250b(parcel, a);
    }
}
