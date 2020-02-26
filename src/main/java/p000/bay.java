package p000;

import android.text.TextUtils;
import java.io.EOFException;
import java.util.Collections;
import java.util.List;

/* renamed from: bay */
/* compiled from: PG */
public final class bay implements bbh {

    /* renamed from: a */
    public final boolean f3044a = true;

    /* renamed from: a */
    public static bbg m2683a(aoi aoi) {
        boolean z = true;
        if (!(aoi instanceof aro) && !(aoi instanceof ark) && !(aoi instanceof arm) && !(aoi instanceof apo)) {
            z = false;
        }
        return new bbg(aoi, z, m2685b(aoi));
    }

    /* renamed from: a */
    public static aqg m2681a(blj blj, akh akh, anq anq, List list) {
        boolean z;
        List list2;
        atw atw = akh.f554g;
        if (atw != null) {
            int i = 0;
            while (true) {
                if (i >= atw.mo1344a()) {
                    break;
                }
                atv a = atw.mo1345a(i);
                if (a instanceof bbw) {
                    z = !((bbw) a).f3193a.isEmpty();
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

    /* renamed from: a */
    public static ass m2682a(akh akh, List list, blj blj) {
        int i;
        if (list == null) {
            list = Collections.singletonList(akh.m727a("application/cea-608"));
            i = 16;
        } else {
            i = 48;
        }
        String str = akh.f553f;
        if (!TextUtils.isEmpty(str)) {
            if (!"audio/mp4a-latm".equals(bkt.m3519e(str))) {
                i |= 2;
            }
            if (!"video/avc".equals(bkt.m3518d(str))) {
                i |= 4;
            }
        }
        return new ass(2, blj, new arq(i, list));
    }

    /* renamed from: b */
    public static boolean m2685b(aoi aoi) {
        return (aoi instanceof ass) || (aoi instanceof aqg);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static boolean m2684a(aoi aoi, aoj aoj) {
        try {
            boolean a = aoi.mo1209a(aoj);
            aoj.mo1191a();
            return a;
        } catch (EOFException e) {
            aoj.mo1191a();
            return false;
        } catch (Throwable th) {
            aoj.mo1191a();
            throw th;
        }
    }
}
