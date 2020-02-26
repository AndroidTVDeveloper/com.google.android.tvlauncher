package defpackage;

import java.util.Comparator;

/* renamed from: czi  reason: default package */
/* compiled from: PG */
final /* synthetic */ class czi implements Comparator {
    public static final Comparator a = new czi();

    private czi() {
    }

    public final int compare(Object obj, Object obj2) {
        cxr cxr = (cxr) obj;
        cxr cxr2 = (cxr) obj2;
        int i = czj.h;
        if (cxr != null) {
            if (cxr2 == null) {
                return -1;
            }
            int i2 = cxr.e;
            int i3 = cxr2.e;
            if (i2 == i3) {
                String str = cxr.b;
                if (str == null) {
                    return cxr2.b == null ? 0 : 1;
                }
                String str2 = cxr2.b;
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
