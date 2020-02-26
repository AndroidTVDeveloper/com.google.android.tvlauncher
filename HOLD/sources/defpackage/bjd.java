package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: bjd  reason: default package */
/* compiled from: PG */
public final class bjd implements bhv {
    public long a;
    public Uri b = Uri.EMPTY;
    public Map c = Collections.emptyMap();
    private final bhv d;

    public bjd(bhv bhv) {
        this.d = (bhv) bks.a(bhv);
    }

    public final void a(bjf bjf) {
        this.d.a(bjf);
    }

    public final void c() {
        this.d.c();
    }

    public final Map b() {
        return this.d.b();
    }

    public final Uri a() {
        return this.d.a();
    }

    public final long a(bhy bhy) {
        this.b = bhy.a;
        this.c = Collections.emptyMap();
        long a2 = this.d.a(bhy);
        this.b = (Uri) bks.a(a());
        this.c = b();
        return a2;
    }

    public final int a(byte[] bArr, int i, int i2) {
        int a2 = this.d.a(bArr, i, i2);
        if (a2 != -1) {
            this.a += (long) a2;
        }
        return a2;
    }
}
