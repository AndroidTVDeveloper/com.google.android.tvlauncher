package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: bwk */
/* compiled from: PG */
public final class bwk extends buf implements box {
    public static final Parcelable.Creator CREATOR = new bwl();

    /* renamed from: a */
    private final int f4950a;

    /* renamed from: b */
    private int f4951b;

    /* renamed from: c */
    private Intent f4952c;

    /* renamed from: a */
    public final Status mo2253a() {
        return this.f4951b == 0 ? Status.f6260a : Status.f6264e;
    }

    public bwk() {
        this(2, 0, null);
    }

    public bwk(int i, int i2, Intent intent) {
        this.f4950a = i;
        this.f4951b = i2;
        this.f4952c = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = buj.m4230a(parcel);
        buj.m4251b(parcel, 1, this.f4950a);
        buj.m4251b(parcel, 2, this.f4951b);
        buj.m4238a(parcel, 3, this.f4952c, i);
        buj.m4250b(parcel, a);
    }
}
