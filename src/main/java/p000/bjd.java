package p000;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: bjd */
/* compiled from: PG */
public final class bjd implements bhv {

    /* renamed from: a */
    public long f4115a;

    /* renamed from: b */
    public Uri f4116b = Uri.EMPTY;

    /* renamed from: c */
    public Map f4117c = Collections.emptyMap();

    /* renamed from: d */
    private final bhv f4118d;

    public bjd(bhv bhv) {
        this.f4118d = (bhv) bks.m3507a(bhv);
    }

    /* renamed from: a */
    public final void mo1501a(bjf bjf) {
        this.f4118d.mo1501a(bjf);
    }

    /* renamed from: c */
    public final void mo1503c() {
        this.f4118d.mo1503c();
    }

    /* renamed from: b */
    public final Map mo1502b() {
        return this.f4118d.mo1502b();
    }

    /* renamed from: a */
    public final Uri mo1500a() {
        return this.f4118d.mo1500a();
    }

    /* renamed from: a */
    public final long mo1499a(bhy bhy) {
        this.f4116b = bhy.f3998a;
        this.f4117c = Collections.emptyMap();
        long a = this.f4118d.mo1499a(bhy);
        this.f4116b = (Uri) bks.m3507a(mo1500a());
        this.f4117c = mo1502b();
        return a;
    }

    /* renamed from: a */
    public final int mo1498a(byte[] bArr, int i, int i2) {
        int a = this.f4118d.mo1498a(bArr, i, i2);
        if (a != -1) {
            this.f4115a += (long) a;
        }
        return a;
    }
}
