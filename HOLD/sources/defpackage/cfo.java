package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* renamed from: cfo  reason: default package */
/* compiled from: PG */
public final class cfo {
    private final ContentResolver a;
    private final ddx b;

    public cfo(Context context) {
        if (dbi.a == null) {
            dbi.a = new dbi();
        }
        this.a = context.getApplicationContext().getContentResolver();
        this.b = new ddx();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x008b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.cfs r8) {
        /*
            r7 = this;
            ddx r0 = r7.b
            android.content.ContentResolver r1 = r7.a
            java.lang.Long r2 = r0.a
            r3 = -1
            if (r2 != 0) goto L_0x0026
            java.lang.String r2 = "device_registration_time"
            long r1 = defpackage.byi.b(r1, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.a = r1
            java.lang.Long r1 = r0.a
            long r1 = r1.longValue()
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            r1 = 0
            r0.a = r1
            goto L_0x003c
        L_0x0026:
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = r0.a
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
            dja r0 = r8.f
            if (r0 == 0) goto L_0x0043
            goto L_0x004b
        L_0x0043:
            dmm r0 = defpackage.dmm.c
            dja r0 = r0.l()
            r8.f = r0
        L_0x004b:
            dja r8 = r8.f
            dmn r0 = defpackage.dmn.c
            dja r0 = r0.l()
            boolean r1 = r0.b
            r2 = 0
            if (r1 != 0) goto L_0x0059
            goto L_0x005e
        L_0x0059:
            r0.b()
            r0.b = r2
        L_0x005e:
            dje r1 = r0.a
            dmn r1 = (defpackage.dmn) r1
            int r4 = r1.a
            r4 = r4 | 1
            r1.a = r4
            r1.b = r3
            dje r0 = r0.g()
            dmn r0 = (defpackage.dmn) r0
            boolean r1 = r8.b
            if (r1 == 0) goto L_0x0079
            r8.b()
            r8.b = r2
        L_0x0079:
            dje r8 = r8.a
            dmm r8 = (defpackage.dmm) r8
            dmm r1 = defpackage.dmm.c
            r0.getClass()
            r8.b = r0
            int r0 = r8.a
            r0 = r0 | 1
            r8.a = r0
            return
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfo.a(cfs):void");
    }
}
