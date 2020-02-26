package p000;

import android.net.Uri;
import java.util.List;

/* renamed from: bac */
/* compiled from: PG */
public final class bac {

    /* renamed from: a */
    public final long f2970a;

    /* renamed from: b */
    public final long f2971b;

    /* renamed from: c */
    public final boolean f2972c;

    /* renamed from: d */
    public final long f2973d;

    /* renamed from: e */
    public final long f2974e;

    /* renamed from: f */
    public final long f2975f;

    /* renamed from: g */
    public final long f2976g;

    /* renamed from: h */
    public final bav f2977h;

    /* renamed from: i */
    public final Uri f2978i;

    /* renamed from: j */
    private final List f2979j;

    public bac(long j, long j2, boolean z, long j3, long j4, long j5, long j6, bav bav, Uri uri, List list) {
        this.f2970a = j;
        this.f2971b = j2;
        this.f2972c = z;
        this.f2973d = j3;
        this.f2974e = j4;
        this.f2975f = j5;
        this.f2976g = j6;
        this.f2977h = bav;
        this.f2978i = uri;
        this.f2979j = list;
    }

    /* renamed from: a */
    public final bah mo1679a(int i) {
        return (bah) this.f2979j.get(i);
    }

    /* renamed from: a */
    public final int mo1678a() {
        return this.f2979j.size();
    }

    /* renamed from: b */
    public final long mo1680b(int i) {
        long j;
        if (i != this.f2979j.size() - 1) {
            j = ((bah) this.f2979j.get(i + 1)).f2998b - ((bah) this.f2979j.get(i)).f2998b;
        } else {
            long j2 = this.f2971b;
            j = j2 != -9223372036854775807L ? j2 - ((bah) this.f2979j.get(i)).f2998b : -9223372036854775807L;
        }
        return aja.m633b(j);
    }
}
