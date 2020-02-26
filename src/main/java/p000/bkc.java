package p000;

import java.io.File;
import java.util.regex.Pattern;

/* renamed from: bkc */
/* compiled from: PG */
final class bkc extends bjr {

    /* renamed from: g */
    private static final Pattern f4199g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: h */
    private static final Pattern f4200h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: i */
    private static final Pattern f4201i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public bkc(String str, long j, long j2, long j3, File file) {
        super(str, j, j2, j3, file);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0064, code lost:
        if (r16.renameTo(r1) != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        if (r1 != null) goto L_0x0040;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.bkc m3473a(java.io.File r16, long r17, p000.bjv r19) {
        /*
            r0 = r19
            java.lang.String r1 = r16.getName()
            java.lang.String r2 = ".v3.exo"
            boolean r2 = r1.endsWith(r2)
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0015
            r15 = r16
            goto L_0x0072
        L_0x0015:
            java.lang.String r1 = r16.getName()
            java.util.regex.Pattern r2 = p000.bkc.f4200h
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r7 = r2.matches()
            if (r7 == 0) goto L_0x0030
            java.lang.String r1 = r2.group(r5)
            java.lang.String r1 = p000.blm.m3682i(r1)
            if (r1 == 0) goto L_0x0069
            goto L_0x0040
        L_0x0030:
            java.util.regex.Pattern r2 = p000.bkc.f4199g
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r1 = r2.matches()
            if (r1 == 0) goto L_0x0068
            java.lang.String r1 = r2.group(r5)
        L_0x0040:
            java.io.File r7 = r16.getParentFile()
            bjs r1 = r0.mo2012a(r1)
            int r8 = r1.f4166a
            java.lang.String r1 = r2.group(r4)
            long r9 = java.lang.Long.parseLong(r1)
            java.lang.String r1 = r2.group(r3)
            long r11 = java.lang.Long.parseLong(r1)
            java.io.File r1 = m3475a(r7, r8, r9, r11)
            r2 = r16
            boolean r2 = r2.renameTo(r1)
            if (r2 == 0) goto L_0x0067
            goto L_0x006a
        L_0x0067:
            goto L_0x0069
        L_0x0068:
        L_0x0069:
            r1 = r6
        L_0x006a:
            if (r1 == 0) goto L_0x00bf
            java.lang.String r2 = r1.getName()
            r15 = r1
            r1 = r2
        L_0x0072:
            java.util.regex.Pattern r2 = p000.bkc.f4201i
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.matches()
            if (r2 == 0) goto L_0x00be
            java.lang.String r2 = r1.group(r5)
            int r2 = java.lang.Integer.parseInt(r2)
            android.util.SparseArray r0 = r0.f4175b
            java.lang.Object r0 = r0.get(r2)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x00bd
            r9 = -1
            int r0 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x009d
            long r9 = r15.length()
            r11 = r9
            goto L_0x009f
        L_0x009d:
            r11 = r17
        L_0x009f:
            r9 = 0
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x00bc
            java.lang.String r0 = r1.group(r4)
            long r9 = java.lang.Long.parseLong(r0)
            java.lang.String r0 = r1.group(r3)
            long r13 = java.lang.Long.parseLong(r0)
            bkc r0 = new bkc
            r7 = r0
            r7.<init>(r8, r9, r11, r13, r15)
            return r0
        L_0x00bc:
            return r6
        L_0x00bd:
        L_0x00be:
            return r6
        L_0x00bf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bkc.m3473a(java.io.File, long, bjv):bkc");
    }

    /* renamed from: a */
    public static bkc m3474a(String str, long j) {
        return new bkc(str, j, -1, -9223372036854775807L, null);
    }

    /* renamed from: a */
    public static File m3475a(File file, int i, long j, long j2) {
        StringBuilder sb = new StringBuilder(60);
        sb.append(i);
        sb.append(".");
        sb.append(j);
        sb.append(".");
        sb.append(j2);
        sb.append(".v3.exo");
        return new File(file, sb.toString());
    }
}
