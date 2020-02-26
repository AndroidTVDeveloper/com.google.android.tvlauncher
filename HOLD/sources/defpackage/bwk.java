package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: bwk  reason: default package */
/* compiled from: PG */
public final class bwk extends buf implements box {
    public static final Parcelable.Creator CREATOR = new bwl();
    private final int a;
    private int b;
    private Intent c;

    public final Status a() {
        return this.b == 0 ? Status.a : Status.e;
    }

    public bwk() {
        this(2, 0, null);
    }

    public bwk(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = buj.a(parcel);
        buj.b(parcel, 1, this.a);
        buj.b(parcel, 2, this.b);
        buj.a(parcel, 3, this.c, i);
        buj.b(parcel, a2);
    }
}
