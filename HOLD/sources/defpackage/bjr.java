package defpackage;

import java.io.File;

/* renamed from: bjr  reason: default package */
/* compiled from: PG */
public class bjr implements Comparable {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final File e;
    public final long f;

    public bjr(String str, long j, long j2, long j3, File file) {
        boolean z;
        this.a = str;
        this.b = j;
        this.c = j2;
        if (file != null) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
        this.e = file;
        this.f = j3;
    }

    public final boolean a() {
        return !this.d;
    }

    /* renamed from: a */
    public final int compareTo(bjr bjr) {
        if (!this.a.equals(bjr.a)) {
            return this.a.compareTo(bjr.a);
        }
        long j = this.b - bjr.b;
        if (j != 0) {
            return j >= 0 ? 1 : -1;
        }
        return 0;
    }
}
