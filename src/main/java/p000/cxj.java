package p000;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cxj */
/* compiled from: PG */
public final class cxj extends cxi {

    /* renamed from: a */
    public final List f7835a = new ArrayList();

    /* renamed from: b */
    public final int mo3934b(Uri uri) {
        List list = this.f7835a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int b = ((cxi) list.get(i2)).mo3934b(uri);
            if (i < b) {
                i = b;
            }
        }
        return i;
    }

    /* renamed from: c */
    private final cxi m5895c(Uri uri) {
        List list = this.f7835a;
        int size = list.size();
        cxi cxi = null;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            cxi cxi2 = (cxi) list.get(i2);
            int b = cxi2.mo3934b(uri);
            if (i < b) {
                cxi = cxi2;
            }
            if (i < b) {
                i = b;
            }
        }
        return cxi;
    }

    /* renamed from: a */
    public final cwi mo3932a(Uri uri) {
        cxi c = m5895c(uri);
        if (c != null) {
            return c.mo3932a(uri);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo3933a(cwi cwi) {
        cxi c = m5895c(cwi.mo3886b());
        if (c != null) {
            c.mo3933a(cwi);
        }
    }
}
