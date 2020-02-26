package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.Comparator;

/* renamed from: cwf */
/* compiled from: PG */
final class cwf implements Comparator {

    /* renamed from: a */
    private final Context f7748a;

    public cwf(Context context) {
        this.f7748a = context;
    }

    /* renamed from: a */
    public final int compare(cwg cwg, cwg cwg2) {
        boolean a;
        boolean z = false;
        if (cwg2 == null) {
            return cwg != null ? -1 : 0;
        }
        if (cwg == null) {
            return 1;
        }
        if (cwe.m5770a(this.f7748a).f7734e) {
            int i = cwg.f7755g;
            boolean z2 = i == 2;
            if (cwg2.f7755g == 2) {
                z = true;
            }
            if (z2 != z) {
                return i != 2 ? -1 : 1;
            }
        }
        int i2 = cwg.f7754f;
        int i3 = cwg2.f7754f;
        if (i2 != i3) {
            return i2 - i3;
        }
        if (cwg.f7752d == 0 && cwg2.f7752d == 0 && cwe.m5772a(this.f7748a.getPackageManager(), cwg2.f7751c) != (a = cwe.m5772a(this.f7748a.getPackageManager(), cwg.f7751c))) {
            return a ? -1 : 1;
        }
        int i4 = cwg.f7757i;
        int i5 = cwg2.f7757i;
        if (i4 != i5) {
            return i5 - i4;
        }
        if (!TextUtils.equals(cwg.f7760l, cwg2.f7760l)) {
            return cwg.f7760l.compareToIgnoreCase(cwg2.f7760l);
        }
        return cwg.f7756h.compareToIgnoreCase(cwg2.f7756h);
    }
}
