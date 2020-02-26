package defpackage;

import java.io.InputStream;

/* renamed from: adj  reason: default package */
/* compiled from: PG */
public final class adj implements tz {
    private final acx a;
    private final xe b;

    public adj(acx acx, xe xeVar) {
        this.a = acx;
        this.b = xeVar;
    }

    public final /* bridge */ /* synthetic */ ww a(Object obj, int i, int i2, tx txVar) {
        adg adg;
        boolean z;
        ahu ahu;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof adg) {
            adg = (adg) inputStream;
            z = false;
        } else {
            adg = new adg(inputStream, this.b);
            z = true;
        }
        synchronized (ahu.a) {
            ahu = (ahu) ahu.a.poll();
        }
        if (ahu == null) {
            ahu = new ahu();
        }
        ahu.b = adg;
        try {
            ww a2 = this.a.a(new aia(ahu), i, i2, txVar, new adi(adg, ahu));
            ahu.a();
            if (z) {
                adg.b();
            }
            return a2;
        } catch (Throwable th) {
            ahu.a();
            if (z) {
                adg.b();
            }
            throw th;
        }
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, tx txVar) {
        InputStream inputStream = (InputStream) obj;
        return true;
    }
}
