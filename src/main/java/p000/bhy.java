package p000;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bhy */
/* compiled from: PG */
public final class bhy {

    /* renamed from: a */
    public final Uri f3998a;

    /* renamed from: b */
    public final int f3999b;

    /* renamed from: c */
    public final Map f4000c;

    /* renamed from: d */
    public final long f4001d;

    /* renamed from: e */
    public final long f4002e;

    /* renamed from: f */
    public final long f4003f;

    /* renamed from: g */
    public final String f4004g;

    /* renamed from: h */
    public final int f4005h;

    public bhy(Uri uri) {
        this(uri, (byte) 0);
    }

    /* renamed from: a */
    public final boolean mo1957a(int i) {
        return (this.f4005h & i) == i;
    }

    public bhy(Uri uri, int i, long j, long j2, long j3, String str, int i2) {
        this(uri, i, j, j2, j3, str, i2, Collections.emptyMap());
    }

    private bhy(Uri uri, int i, long j, long j2, long j3, String str, int i2, Map map) {
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        boolean z = true;
        bks.m3510a(j4 >= 0);
        bks.m3510a(j5 >= 0);
        if (j6 <= 0 && j6 != -1) {
            z = false;
        }
        bks.m3510a(z);
        this.f3998a = uri;
        this.f3999b = i;
        this.f4001d = j4;
        this.f4002e = j5;
        this.f4003f = j6;
        this.f4004g = str;
        this.f4005h = i2;
        this.f4000c = Collections.unmodifiableMap(new HashMap(map));
    }

    public bhy(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, 1, j, j2, j3, str, i);
    }

    public bhy(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public bhy(Uri uri, byte b) {
        this(uri, 0, 0, -1, null, 1);
    }

    public bhy(Uri uri, long j, Map map) {
        this(uri, 1, j, j, -1, null, 6, map);
    }

    /* renamed from: b */
    public static String m3291b(int i) {
        if (i == 1) {
            return "GET";
        }
        throw new AssertionError(i);
    }

    /* renamed from: a */
    public final bhy mo1955a(long j) {
        long j2 = this.f4003f;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        return mo1956a(j, j3);
    }

    /* renamed from: a */
    public final bhy mo1956a(long j, long j2) {
        if (j == 0 && this.f4003f == j2) {
            return this;
        }
        return new bhy(this.f3998a, this.f3999b, this.f4001d + j, this.f4002e + j, j2, this.f4004g, this.f4005h, this.f4000c);
    }

    public final String toString() {
        String b = m3291b(this.f3999b);
        String valueOf = String.valueOf(this.f3998a);
        String arrays = Arrays.toString((byte[]) null);
        long j = this.f4001d;
        long j2 = this.f4002e;
        long j3 = this.f4003f;
        String str = this.f4004g;
        int i = this.f4005h;
        int length = String.valueOf(b).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 94 + length2 + String.valueOf(arrays).length() + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(b);
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
