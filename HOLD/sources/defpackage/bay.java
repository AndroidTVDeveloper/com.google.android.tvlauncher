package defpackage;

import android.text.TextUtils;
import java.io.EOFException;
import java.util.Collections;
import java.util.List;

/* renamed from: bay  reason: default package */
/* compiled from: PG */
public final class bay implements bbh {
    public final boolean a = true;

    public static bbg a(aoi aoi) {
        boolean z = true;
        if (!(aoi instanceof aro) && !(aoi instanceof ark) && !(aoi instanceof arm) && !(aoi instanceof apo)) {
            z = false;
        }
        return new bbg(aoi, z, b(aoi));
    }

    public static aqg a(blj blj, akh akh, anq anq, List list) {
        boolean z;
        List list2;
        atw atw = akh.g;
        if (atw != null) {
            int i = 0;
            while (true) {
                if (i >= atw.a()) {
                    break;
                }
                atv a2 = atw.a(i);
                if (a2 instanceof bbw) {
                    z = !((bbw) a2).a.isEmpty();
                    break;
                }
                i++;
            }
        }
        z = false;
        int i2 = !z ? 0 : 4;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = list;
        }
        return new aqg(i2, blj, null, anq, list2);
    }

    public static ass a(akh akh, List list, blj blj) {
        int i;
        if (list == null) {
            list = Collections.singletonList(akh.a("application/cea-608"));
            i = 16;
        } else {
            i = 48;
        }
        String str = akh.f;
        if (!TextUtils.isEmpty(str)) {
            if (!"audio/mp4a-latm".equals(bkt.e(str))) {
                i |= 2;
            }
            if (!"video/avc".equals(bkt.d(str))) {
                i |= 4;
            }
        }
        return new ass(2, blj, new arq(i, list));
    }

    public static boolean b(aoi aoi) {
        return (aoi instanceof ass) || (aoi instanceof aqg);
    }

    /* JADX INFO: finally extract failed */
    public static boolean a(aoi aoi, aoj aoj) {
        try {
            boolean a2 = aoi.a(aoj);
            aoj.a();
            return a2;
        } catch (EOFException e) {
            aoj.a();
            return false;
        } catch (Throwable th) {
            aoj.a();
            throw th;
        }
    }
}
