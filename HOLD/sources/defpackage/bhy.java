package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bhy  reason: default package */
/* compiled from: PG */
public final class bhy {
    public final Uri a;
    public final int b;
    public final Map c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final int h;

    public bhy(Uri uri) {
        this(uri, (byte) 0);
    }

    public final boolean a(int i) {
        return (this.h & i) == i;
    }

    public bhy(Uri uri, int i, long j, long j2, long j3, String str, int i2) {
        this(uri, i, j, j2, j3, str, i2, Collections.emptyMap());
    }

    private bhy(Uri uri, int i, long j, long j2, long j3, String str, int i2, Map map) {
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        boolean z = true;
        bks.a(j4 >= 0);
        bks.a(j5 >= 0);
        if (j6 <= 0 && j6 != -1) {
            z = false;
        }
        bks.a(z);
        this.a = uri;
        this.b = i;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = str;
        this.h = i2;
        this.c = Collections.unmodifiableMap(new HashMap(map));
    }

    public bhy(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, 1, j, j2, j3, str, i);
    }

    public bhy(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public bhy(Uri uri, byte b2) {
        this(uri, 0, 0, -1, null, 1);
    }

    public bhy(Uri uri, long j, Map map) {
        this(uri, 1, j, j, -1, null, 6, map);
    }

    public static String b(int i) {
        if (i == 1) {
            return "GET";
        }
        throw new AssertionError(i);
    }

    public final bhy a(long j) {
        long j2 = this.f;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        return a(j, j3);
    }

    public final bhy a(long j, long j2) {
        if (j == 0 && this.f == j2) {
            return this;
        }
        return new bhy(this.a, this.b, this.d + j, this.e + j, j2, this.g, this.h, this.c);
    }

    public final String toString() {
        String b2 = b(this.b);
        String valueOf = String.valueOf(this.a);
        String arrays = Arrays.toString((byte[]) null);
        long j = this.d;
        long j2 = this.e;
        long j3 = this.f;
        String str = this.g;
        int i = this.h;
        int length = String.valueOf(b2).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 94 + length2 + String.valueOf(arrays).length() + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(b2);
        sb.append(" ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(arrays);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }
}
