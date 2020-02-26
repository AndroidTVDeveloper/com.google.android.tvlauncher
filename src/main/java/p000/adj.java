package p000;

import java.io.InputStream;

/* renamed from: adj */
/* compiled from: PG */
public final class adj implements C0541tz {

    /* renamed from: a */
    private final acx f150a;

    /* renamed from: b */
    private final C0628xe f151b;

    public adj(acx acx, C0628xe xeVar) {
        this.f150a = acx;
        this.f151b = xeVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0619ww mo38a(Object obj, int i, int i2, C0539tx txVar) {
        adg adg;
        boolean z;
        ahu ahu;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof adg) {
            adg = (adg) inputStream;
            z = false;
        } else {
            adg = new adg(inputStream, this.f151b);
            z = true;
        }
        synchronized (ahu.f383a) {
            ahu = (ahu) ahu.f383a.poll();
        }
        if (ahu == null) {
            ahu = new ahu();
        }
        ahu.f384b = adg;
        try {
            C0619ww a = this.f150a.mo59a(new aia(ahu), i, i2, txVar, new adi(adg, ahu));
            ahu.mo280a();
            if (z) {
                adg.mo69b();
            }
            return a;
        } catch (Throwable th) {
            ahu.mo280a();
            if (z) {
                adg.mo69b();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo39a(Object obj, C0539tx txVar) {
        InputStream inputStream = (InputStream) obj;
        return true;
    }
}
