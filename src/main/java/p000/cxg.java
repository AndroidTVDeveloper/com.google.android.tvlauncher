package p000;

import android.content.Context;

/* renamed from: cxg */
/* compiled from: PG */
public final class cxg {

    /* renamed from: b */
    private static cxg f7833b;

    /* renamed from: a */
    public final cxj f7834a = new cxj();

    private cxg(Context context) {
        new cxf();
        context.getApplicationContext();
    }

    /* renamed from: a */
    public static synchronized cxg m5888a(Context context) {
        cxg cxg;
        synchronized (cxg.class) {
            if (f7833b == null) {
                f7833b = new cxg(context);
            }
            cxg = f7833b;
        }
        return cxg;
    }

    /* renamed from: a */
    public final void mo3929a(cxi cxi) {
        this.f7834a.f7835a.add(cxi);
    }

    /* renamed from: b */
    public final void mo3930b(cxi cxi) {
        this.f7834a.f7835a.remove(cxi);
    }
}
