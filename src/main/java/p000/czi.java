package p000;

import java.util.Comparator;

/* renamed from: czi */
/* compiled from: PG */
final /* synthetic */ class czi implements Comparator {

    /* renamed from: a */
    public static final Comparator f7972a = new czi();

    private czi() {
    }

    public final int compare(Object obj, Object obj2) {
        cxr cxr = (cxr) obj;
        cxr cxr2 = (cxr) obj2;
        int i = czj.f7973h;
        if (cxr != null) {
            if (cxr2 == null) {
                return -1;
            }
            int i2 = cxr.f7860e;
            int i3 = cxr2.f7860e;
            if (i2 == i3) {
                String str = cxr.f7857b;
                if (str == null) {
                    return cxr2.f7857b == null ? 0 : 1;
                }
                String str2 = cxr2.f7857b;
                if (str2 == null) {
                    return -1;
                }
                return str.compareToIgnoreCase(str2);
            } else if (i2 == 0) {
                return 1;
            } else {
                if (i3 == 0) {
                    return -1;
                }
                return Integer.compare(i2, i3);
            }
        } else if (cxr2 == null) {
            return 0;
        } else {
            return 1;
        }
    }
}
