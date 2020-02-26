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
    public final String[] a;
    public Bundle b;
    public final CursorWindow[] c;
    public int[] d;
    private final int e;
    private final int f;
    private final Bundle g;
    private boolean h = false;
    private boolean i = true;

    static {
        new bsh(new String[0]);
    }

    public DataHolder(int i2, String[] strArr, CursorWindow[] cursorWindowArr, int i3, Bundle bundle) {
        this.e = i2;
        this.a = strArr;
        this.c = cursorWindowArr;
        this.f = i3;
        this.g = bundle;
    }

    public final void close() {
        synchronized (this) {
            if (!this.h) {
                this.h = true;
                int i2 = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.c;
                    if (i2 >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i2].close();
                    i2++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        boolean z;
        try {
            if (this.i && this.c.length > 0) {
                synchronized (this) {
                    z = this.h;
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

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = buj.a(parcel);
        buj.a(parcel, 1, this.a);
        buj.a(parcel, 2, this.c, i2);
        buj.b(parcel, 3, this.f);
        buj.a(parcel, 4, this.g);
        buj.b(parcel, 1000, this.e);
        buj.b(parcel, a2);
        if ((i2 & 1) != 0) {
            close();
        }
    }
}
