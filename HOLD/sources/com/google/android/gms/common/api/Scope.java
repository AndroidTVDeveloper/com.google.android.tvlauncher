package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: PG */
public final class Scope extends buf implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new boz();
    private final int a;
    private final String b;

    public final String toString() {
        return this.b;
    }

    public Scope(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.a = i;
            this.b = str;
            return;
        }
        throw new IllegalArgumentException("scopeUri must not be null or empty");
    }

    public Scope(String str) {
        this(1, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.b.equals(((Scope) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = buj.a(parcel);
        buj.b(parcel, 1, this.a);
        buj.a(parcel, 2, this.b);
        buj.b(parcel, a2);
    }
}
