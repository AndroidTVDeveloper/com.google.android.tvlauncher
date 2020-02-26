package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* compiled from: PG */
public final class Status extends buf implements ReflectedParcelable, box {
    public static final Parcelable.Creator CREATOR = new bpa();
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Status e = new Status(16);
    public final int f;
    public final String g;
    public final PendingIntent h;
    private final int i;

    static {
        new Status(17);
        new Status(18);
    }

    public final Status a() {
        return this;
    }

    public final boolean b() {
        return this.f <= 0;
    }

    public Status(int i2) {
        this(i2, null);
    }

    public Status(int i2, int i3, String str, PendingIntent pendingIntent) {
        this.i = i2;
        this.f = i3;
        this.g = str;
        this.h = pendingIntent;
    }

    public Status(int i2, String str) {
        this(1, i2, str, null);
    }

    public Status(int i2, String str, byte b2) {
        this(1, i2, str, null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            if (this.i != status.i || this.f != status.f || !bty.a(this.g, status.g) || !bty.a(this.h, status.h)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.i), Integer.valueOf(this.f), this.g, this.h});
    }

    public final String toString() {
        btx a2 = bty.a(this);
        String str = this.g;
        if (str == null) {
            str = ccy.a(this.f);
        }
        a2.a("statusCode", str);
        a2.a("resolution", this.h);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = buj.a(parcel);
        buj.b(parcel, 1, this.f);
        buj.a(parcel, 2, this.g);
        buj.a(parcel, 3, this.h, i2);
        buj.b(parcel, 1000, this.i);
        buj.b(parcel, a2);
    }
}
