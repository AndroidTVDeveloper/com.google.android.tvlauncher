package p000;

import android.content.ContentResolver;
import android.content.Context;

/* renamed from: cfo */
/* compiled from: PG */
public final class cfo {

    /* renamed from: a */
    private final ContentResolver f5415a;

    /* renamed from: b */
    private final ddx f5416b;

    public cfo(Context context) {
        if (dbi.f8149a == null) {
            dbi.f8149a = new dbi();
        }
        this.f5415a = context.getApplicationContext().getContentResolver();
        this.f5416b = new ddx();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x008b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2722a(p000.cfs r8) {
        /*
            r7 = this;
            ddx r0 = r7.f5416b
            android.content.ContentResolver r1 = r7.f5415a
            java.lang.Long r2 = r0.f8354a
            r3 = -1
            if (r2 != 0) goto L_0x0026
            java.lang.String r2 = "device_registration_time"
            long r1 = p000.byi.m4372b(r1, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.f8354a = r1
            java.lang.Long r1 = r0.f8354a
            long r1 = r1.longValue()
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            r1 = 0
            r0.f8354a = r1
            goto L_0x003c
        L_0x0026:
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = r0.f8354a
            long r4 = r0.longValue()
            long r1 = r1 - r4
            r4 = 3600000(0x36ee80, double:1.7786363E-317)
            long r1 = r1 / r4
            int r0 = (int) r1
            if (r0 < 0) goto L_0x003a
            r3 = r0
            goto L_0x003c
        L_0x003a:
        L_0x003c:
            if (r3 < 0) goto L_0x008b
            dja r0 = r8.f5423f
            if (r0 == 0) goto L_0x0043
            goto L_0x004b
        L_0x0043:
            dmm r0 = p000.dmm.f8847c
            dja r0 = r0.mo4516l()
            r8.f5423f = r0
        L_0x004b:
            dja r8 = r8.f5423f
            dmn r0 = p000.dmn.f8850c
            dja r0 = r0.mo4516l()
            boolean r1 = r0.f8673b
            r2 = 0
            if (r1 != 0) goto L_0x0059
            goto L_0x005e
        L_0x0059:
            r0.mo4505b()
            r0.f8673b = r2
        L_0x005e:
            dje r1 = r0.f8672a
            dmn r1 = (p000.dmn) r1
            int r4 = r1.f8851a
            r4 = r4 | 1
            r1.f8851a = r4
            r1.f8852b = r3
            dje r0 = r0.mo4509g()
            dmn r0 = (p000.dmn) r0
            boolean r1 = r8.f8673b
            if (r1 == 0) goto L_0x0079
            r8.mo4505b()
            r8.f8673b = r2
        L_0x0079:
            dje r8 = r8.f8672a
            dmm r8 = (p000.dmm) r8
            dmm r1 = p000.dmm.f8847c
            r0.getClass()
            r8.f8849b = r0
            int r0 = r8.f8848a
            r0 = r0 | 1
            r8.f8848a = r0
            return
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cfo.mo2722a(cfs):void");
    }
}
