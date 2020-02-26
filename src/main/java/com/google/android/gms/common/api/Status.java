package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* compiled from: PG */
public final class Status extends buf implements ReflectedParcelable, box {
    public static final Parcelable.Creator CREATOR = new bpa();

    /* renamed from: a */
    public static final Status f6260a = new Status(0);

    /* renamed from: b */
    public static final Status f6261b = new Status(14);

    /* renamed from: c */
    public static final Status f6262c = new Status(8);

    /* renamed from: d */
    public static final Status f6263d = new Status(15);

    /* renamed from: e */
    public static final Status f6264e = new Status(16);

    /* renamed from: f */
    public final int f6265f;

    /* renamed from: g */
    public final String f6266g;

    /* renamed from: h */
    public final PendingIntent f6267h;

    /* renamed from: i */
    private final int f6268i;

    static {
        new Status(17);
        new Status(18);
    }

    /* renamed from: a */
    public final Status mo2253a() {
        return this;
    }

    /* renamed from: b */
    public final boolean mo3189b() {
        return this.f6265f <= 0;
    }

    public Status(int i) {
        this(i, null);
    }

    public Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f6268i = i;
        this.f6265f = i2;
        this.f6266g = str;
        this.f6267h = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, byte b) {
        this(1, i, str, null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            if (this.f6268i != status.f6268i || this.f6265f != status.f6265f || !bty.m4184a(this.f6266g, status.f6266g) || !bty.m4184a(this.f6267h, status.f6267h)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6268i), Integer.valueOf(this.f6265f), this.f6266g, this.f6267h});
    }

    public final String toString() {
        btx a = bty.m4182a(this);
        String str = this.f6266g;
        if (str == null) {
            str = ccy.m4554a(this.f6265f);
        }
        a.mo2440a("statusCode", str);
        a.mo2440a("resolution", this.f6267h);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = buj.m4230a(parcel);
        buj.m4251b(parcel, 1, this.f6265f);
        buj.m4239a(parcel, 2, this.f6266g);
        buj.m4238a(parcel, 3, this.f6267h, i);
        buj.m4251b(parcel, 1000, this.f6268i);
        buj.m4250b(parcel, a);
    }
}
