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
    private final int a;
    private String b;
    private String c;
    private String d;
    private String e;
    private Uri f;
    private String g;
    private long h;
    private String i;
    private List j;
    private String k;
    private String l;
    private Set m = new HashSet();

    public GoogleSignInAccount(int i2, String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, List list, String str7, String str8) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = uri;
        this.g = str5;
        this.h = j2;
        this.i = str6;
        this.j = list;
        this.k = str7;
        this.l = str8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GoogleSignInAccount) {
            GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
            return googleSignInAccount.i.equals(this.i) && googleSignInAccount.a().equals(a());
        }
    }

    public static GoogleSignInAccount a(String str) {
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
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        GoogleSignInAccount googleSignInAccount = r3;
        GoogleSignInAccount googleSignInAccount2 = new GoogleSignInAccount(3, jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), parse, null, Long.valueOf(parseLong).longValue(), buh.a(jSONObject.getString("obfuscatedIdentifier")), new ArrayList((Collection) buh.a(hashSet)), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null));
        GoogleSignInAccount googleSignInAccount3 = googleSignInAccount;
        googleSignInAccount3.g = jSONObject.optString("serverAuthCode", null);
        return googleSignInAccount3;
    }

    private final Set a() {
        HashSet hashSet = new HashSet(this.j);
        hashSet.addAll(this.m);
        return hashSet;
    }

    public final int hashCode() {
        return ((this.i.hashCode() + 527) * 31) + a().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = buj.a(parcel);
        buj.b(parcel, 1, this.a);
        buj.a(parcel, 2, this.b);
        buj.a(parcel, 3, this.c);
        buj.a(parcel, 4, this.d);
        buj.a(parcel, 5, this.e);
        buj.a(parcel, 6, this.f, i2);
        buj.a(parcel, 7, this.g);
        buj.a(parcel, 8, this.h);
        buj.a(parcel, 9, this.i);
        buj.b(parcel, 10, this.j);
        buj.a(parcel, 11, this.k);
        buj.a(parcel, 12, this.l);
        buj.b(parcel, a2);
    }
}
