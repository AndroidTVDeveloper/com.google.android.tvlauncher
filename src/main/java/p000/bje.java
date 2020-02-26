package p000;

import android.net.Uri;
import java.util.Map;

/* renamed from: bje */
/* compiled from: PG */
public final class bje implements bhv {

    /* renamed from: a */
    private final bhv f4119a;

    /* renamed from: b */
    private final bht f4120b;

    /* renamed from: c */
    private boolean f4121c;

    /* renamed from: d */
    private long f4122d;

    public bje(bhv bhv, bht bht) {
        this.f4119a = (bhv) bks.m3507a(bhv);
        this.f4120b = (bht) bks.m3507a(bht);
    }

    /* renamed from: a */
    public final void mo1501a(bjf bjf) {
        this.f4119a.mo1501a(bjf);
    }

    /* renamed from: c */
    public final void mo1503c() {
        try {
            this.f4119a.mo1503c();
            if (this.f4121c) {
                this.f4121c = false;
                this.f4120b.mo1946a();
            }
        } catch (Throwable th) {
            if (this.f4121c) {
                this.f4121c = false;
                this.f4120b.mo1946a();
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final Map mo1502b() {
        return this.f4119a.mo1502b();
    }

    /* renamed from: a */
    public final Uri mo1500a() {
        return this.f4119a.mo1500a();
    }

    /* renamed from: a */
    public final long mo1499a(bhy bhy) {
        long a = this.f4119a.mo1499a(bhy);
        this.f4122d = a;
        if (a == 0) {
            return 0;
        }
        if (bhy.f4003f == -1 && a != -1) {
            bhy = bhy.mo1956a(0, a);
        }
        this.f4121c = true;
        this.f4120b.mo1947a(bhy);
        return this.f4122d;
    }

    /* renamed from: a */
    public final int mo1498a(byte[] bArr, int i, int i2) {
        if (this.f4122d == 0) {
            return -1;
        }
        int a = this.f4119a.mo1498a(bArr, i, i2);
        if (a > 0) {
            this.f4120b.mo1948a(bArr, i, a);
            long j = this.f4122d;
            if (j != -1) {
                this.f4122d = j - ((long) a);
            }
        }
        return a;
    }
}
