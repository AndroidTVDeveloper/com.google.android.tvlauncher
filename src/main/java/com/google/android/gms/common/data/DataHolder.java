package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.io.Closeable;

/* compiled from: PG */
public final class DataHolder extends buf implements Closeable {
    public static final Parcelable.Creator CREATOR = new bsg();

    /* renamed from: a */
    public final String[] f6289a;

    /* renamed from: b */
    public Bundle f6290b;

    /* renamed from: c */
    public final CursorWindow[] f6291c;

    /* renamed from: d */
    public int[] f6292d;

    /* renamed from: e */
    private final int f6293e;

    /* renamed from: f */
    private final int f6294f;

    /* renamed from: g */
    private final Bundle f6295g;

    /* renamed from: h */
    private boolean f6296h = false;

    /* renamed from: i */
    private boolean f6297i = true;

    static {
        new bsh(new String[0]);
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f6293e = i;
        this.f6289a = strArr;
        this.f6291c = cursorWindowArr;
        this.f6294f = i2;
        this.f6295g = bundle;
    }

    public final void close() {
        synchronized (this) {
            if (!this.f6296h) {
                this.f6296h = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f6291c;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        boolean z;
        try {
            if (this.f6297i && this.f6291c.length > 0) {
                synchronized (this) {
                    z = this.f6296h;
                }
                if (!z) {
                    close();
                    String obj = toString();
                    StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                    sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                    sb.append(obj);
                    sb.append(")");
                    Log.e("DataBuffer", sb.toString());
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = buj.m4230a(parcel);
        buj.m4245a(parcel, 1, this.f6289a);
        buj.m4244a(parcel, 2, this.f6291c, i);
        buj.m4251b(parcel, 3, this.f6294f);
        buj.m4236a(parcel, 4, this.f6295g);
        buj.m4251b(parcel, 1000, this.f6293e);
        buj.m4250b(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }
}
