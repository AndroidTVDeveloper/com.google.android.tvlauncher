package p000;

import java.util.regex.Pattern;

/* renamed from: auj */
/* compiled from: PG */
public final class auj implements atx {

    /* renamed from: a */
    private static final Pattern f2447a = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.atw mo1353a(p000.aua r10) {
        /*
            r9 = this;
            java.nio.ByteBuffer r10 = r10.f1425c
            java.lang.Object r10 = p000.bks.m3507a(r10)
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            byte[] r0 = r10.array()
            int r10 = r10.limit()
            r1 = 0
            java.lang.String r10 = p000.blm.m3641a(r0, r1, r10)
            java.util.regex.Pattern r0 = p000.auj.f2447a
            java.util.regex.Matcher r0 = r0.matcher(r10)
            r2 = 0
            r3 = r2
            r4 = r3
            r2 = 0
        L_0x001f:
            boolean r2 = r0.find(r2)
            r5 = 1
            if (r2 == 0) goto L_0x0066
            java.lang.String r2 = r0.group(r5)
            java.lang.String r2 = p000.blm.m3675d(r2)
            r6 = 2
            java.lang.String r6 = r0.group(r6)
            int r7 = r2.hashCode()
            r8 = -315603473(0xffffffffed3045ef, float:-3.409619E27)
            if (r7 == r8) goto L_0x004d
            r8 = 1646559960(0x622482d8, float:7.586736E20)
            if (r7 == r8) goto L_0x0042
        L_0x0041:
            goto L_0x0057
        L_0x0042:
            java.lang.String r7 = "streamtitle"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x0041
            r2 = 0
            goto L_0x0058
        L_0x004d:
            java.lang.String r7 = "streamurl"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x0041
            r2 = 1
            goto L_0x0058
        L_0x0057:
            r2 = -1
        L_0x0058:
            if (r2 == 0) goto L_0x005f
            if (r2 == r5) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            r4 = r6
            goto L_0x0060
        L_0x005f:
            r3 = r6
        L_0x0060:
            int r2 = r0.end()
            goto L_0x001f
        L_0x0066:
            atw r0 = new atw
            atv[] r2 = new p000.atv[r5]
            aun r5 = new aun
            r5.<init>(r10, r3, r4)
            r2[r1] = r5
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.auj.mo1353a(aua):atw");
    }
}
