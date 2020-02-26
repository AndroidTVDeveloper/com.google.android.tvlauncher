package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cxj  reason: default package */
/* compiled from: PG */
public final class cxj extends cxi {
    public final List a = new ArrayList();

    public final int b(Uri uri) {
        List list = this.a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int b = ((cxi) list.get(i2)).b(uri);
            if (i < b) {
                i = b;
            }
        }
        return i;
    }

    private final cxi c(Uri uri) {
        List list = this.a;
        int size = list.size();
        cxi cxi = null;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            cxi cxi2 = (cxi) list.get(i2);
            int b = cxi2.b(uri);
            if (i < b) {
                cxi = cxi2;
            }
            if (i < b) {
                i = b;
            }
        }
        return cxi;
    }

    public final cwi a(Uri uri) {
        cxi c = c(uri);
        if (c != null) {
            return c.a(uri);
        }
        return null;
    }

    public final void a(cwi cwi) {
        cxi c = c(cwi.b());
        if (c != null) {
            c.a(cwi);
        }
    }
}
