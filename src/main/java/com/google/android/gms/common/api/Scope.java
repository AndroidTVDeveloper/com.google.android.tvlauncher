package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: PG */
public final class Scope extends buf implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new boz();

    /* renamed from: a */
    private final int f6258a;

    /* renamed from: b */
    private final String f6259b;

    public final String toString() {
        return this.f6259b;
    }

    public Scope(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f6258a = i;
            this.f6259b = str;
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
            return this.f6259b.equals(((Scope) obj).f6259b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6259b.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = buj.m4230a(parcel);
        buj.m4251b(parcel, 1, this.f6258a);
        buj.m4239a(parcel, 2, this.f6259b);
        buj.m4250b(parcel, a);
    }
}
