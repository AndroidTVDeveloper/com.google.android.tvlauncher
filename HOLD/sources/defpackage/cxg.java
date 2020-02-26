package defpackage;

import android.content.Context;

/* renamed from: cxg  reason: default package */
/* compiled from: PG */
public final class cxg {
    private static cxg b;
    public final cxj a = new cxj();

    private cxg(Context context) {
        new cxf();
        context.getApplicationContext();
    }

    public static synchronized cxg a(Context context) {
        cxg cxg;
        synchronized (cxg.class) {
            if (b == null) {
                b = new cxg(context);
            }
            cxg = b;
        }
        return cxg;
    }

    public final void a(cxi cxi) {
        this.a.a.add(cxi);
    }

    public final void b(cxi cxi) {
        this.a.a.remove(cxi);
    }
}
