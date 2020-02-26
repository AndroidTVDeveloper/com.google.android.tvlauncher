package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.io.File;

/* compiled from: PG */
public class BitmapTeleporter extends buf implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bsf();
    public File a;
    private final int b;
    private ParcelFileDescriptor c;
    private final int d;

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.b = i;
        this.c = parcelFileDescriptor;
        this.d = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.c != null) {
            int a2 = buj.a(parcel);
            buj.b(parcel, 1, this.b);
            buj.a(parcel, 2, this.c, i | 1);
            buj.b(parcel, 3, this.d);
            buj.b(parcel, a2);
            this.c = null;
            return;
        }
        throw null;
    }
}
