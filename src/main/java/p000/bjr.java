package p000;

import java.io.File;

/* renamed from: bjr */
/* compiled from: PG */
public class bjr implements Comparable {

    /* renamed from: a */
    public final String f4160a;

    /* renamed from: b */
    public final long f4161b;

    /* renamed from: c */
    public final long f4162c;

    /* renamed from: d */
    public final boolean f4163d;

    /* renamed from: e */
    public final File f4164e;

    /* renamed from: f */
    public final long f4165f;

    public bjr(String str, long j, long j2, long j3, File file) {
        boolean z;
        this.f4160a = str;
        this.f4161b = j;
        this.f4162c = j2;
        if (file != null) {
            z = true;
        } else {
            z = false;
        }
        this.f4163d = z;
        this.f4164e = file;
        this.f4165f = j3;
    }

    /* renamed from: a */
    public final boolean mo2007a() {
        return !this.f4163d;
    }

    /* renamed from: a */
    public final int compareTo(bjr bjr) {
        if (!this.f4160a.equals(bjr.f4160a)) {
            return this.f4160a.compareTo(bjr.f4160a);
        }
        long j = this.f4161b - bjr.f4161b;
        if (j != 0) {
            return j >= 0 ? 1 : -1;
        }
        return 0;
    }
}
