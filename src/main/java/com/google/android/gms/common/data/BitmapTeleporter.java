package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.io.File;

/* compiled from: PG */
public class BitmapTeleporter extends buf implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bsf();

    /* renamed from: a */
    public File f6285a;

    /* renamed from: b */
    private final int f6286b;

    /* renamed from: c */
    private ParcelFileDescriptor f6287c;

    /* renamed from: d */
    private final int f6288d;

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.f6286b = i;
        this.f6287c = parcelFileDescriptor;
        this.f6288d = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f6287c != null) {
            int a = buj.m4230a(parcel);
            buj.m4251b(parcel, 1, this.f6286b);
            buj.m4238a(parcel, 2, this.f6287c, i | 1);
            buj.m4251b(parcel, 3, this.f6288d);
            buj.m4250b(parcel, a);
            this.f6287c = null;
            return;
        }
        throw null;
    }
}
