package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Comparator;

/* renamed from: cwf  reason: default package */
/* compiled from: PG */
final class cwf implements Comparator {
    private final Context a;

    public cwf(Context context) {
        this.a = context;
    }

    /* renamed from: a */
    public final int compare(cwg cwg, cwg cwg2) {
        boolean a2;
        boolean z = false;
        if (cwg2 == null) {
            return cwg != null ? -1 : 0;
        }
        if (cwg == null) {
            return 1;
        }
        if (cwe.a(this.a).e) {
            int i = cwg.g;
            boolean z2 = i == 2;
            if (cwg2.g == 2) {
                z = true;
            }
            if (z2 != z) {
                return i != 2 ? -1 : 1;
            }
        }
        int i2 = cwg.f;
        int i3 = cwg2.f;
        if (i2 != i3) {
            return i2 - i3;
        }
        if (cwg.d == 0 && cwg2.d == 0 && cwe.a(this.a.getPackageManager(), cwg2.c) != (a2 = cwe.a(this.a.getPackageManager(), cwg.c))) {
            return a2 ? -1 : 1;
        }
        int i4 = cwg.i;
        int i5 = cwg2.i;
        if (i4 != i5) {
            return i5 - i4;
        }
        if (!TextUtils.equals(cwg.l, cwg2.l)) {
            return cwg.l.compareToIgnoreCase(cwg2.l);
        }
        return cwg.h.compareToIgnoreCase(cwg2.h);
    }
}
