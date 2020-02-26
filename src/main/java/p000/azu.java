package p000;

/* renamed from: azu */
/* compiled from: PG */
public final class azu {

    /* renamed from: a */
    public final ayo f2920a;

    /* renamed from: b */
    public final bam f2921b;

    /* renamed from: c */
    public final azr f2922c;

    /* renamed from: d */
    public final long f2923d;

    /* renamed from: e */
    public final long f2924e;

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: aqg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: apk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: arj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: aqg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: aqg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: aqg} */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public azu(long r12, int r14, p000.bam r15, boolean r16, java.util.List r17, p000.aov r18) {
        /*
            r11 = this;
            r3 = r15
            akh r0 = r3.f3013a
            java.lang.String r0 = r0.f555h
            boolean r1 = p000.bkt.m3517c(r0)
            r2 = 0
            if (r1 != 0) goto L_0x0065
            java.lang.String r1 = "application/ttml+xml"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0064
            java.lang.String r1 = "application/x-rawcc"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0024
            arj r0 = new arj
            akh r1 = r3.f3013a
            r0.<init>(r1)
            goto L_0x005a
        L_0x0024:
            java.lang.String r1 = "video/webm"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L_0x0054
            java.lang.String r1 = "audio/webm"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L_0x0054
            java.lang.String r1 = "application/webm"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x003e
            goto L_0x0054
        L_0x003e:
            if (r16 != 0) goto L_0x0043
            r0 = 0
            r5 = 0
            goto L_0x0045
        L_0x0043:
            r0 = 4
            r5 = 4
        L_0x0045:
            aqg r0 = new aqg
            r6 = 0
            r7 = 0
            r8 = 0
            r4 = r0
            r9 = r17
            r10 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x005a
        L_0x0054:
            apk r0 = new apk
            r1 = 1
            r0.<init>(r1)
        L_0x005a:
            ayo r1 = new ayo
            akh r2 = r3.f3013a
            r4 = r14
            r1.<init>(r0, r14, r2)
            r4 = r1
            goto L_0x0066
        L_0x0064:
        L_0x0065:
            r4 = r2
        L_0x0066:
            r5 = 0
            azr r7 = r15.mo1692d()
            r0 = r11
            r1 = r12
            r3 = r15
            r0.<init>(r1, r3, r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.azu.<init>(long, int, bam, boolean, java.util.List, aov):void");
    }

    public azu(long j, bam bam, ayo ayo, long j2, azr azr) {
        this.f2923d = j;
        this.f2921b = bam;
        this.f2924e = j2;
        this.f2920a = ayo;
        this.f2922c = azr;
    }

    /* renamed from: a */
    public final long mo1666a(bac bac, int i, long j) {
        if (mo1667b() != -1 || bac.f2974e == -9223372036854775807L) {
            return mo1664a();
        }
        return Math.max(mo1664a(), mo1670c(((j - aja.m633b(bac.f2970a)) - aja.m633b(bac.mo1679a(i).f2998b)) - aja.m633b(bac.f2974e)));
    }

    /* renamed from: a */
    public final long mo1664a() {
        return this.f2922c.mo1657a() + this.f2924e;
    }

    /* renamed from: b */
    public final long mo1669b(bac bac, int i, long j) {
        int b = mo1667b();
        if (b == -1) {
            return mo1670c((j - aja.m633b(bac.f2970a)) - aja.m633b(bac.mo1679a(i).f2998b)) - 1;
        }
        return (mo1664a() + ((long) b)) - 1;
    }

    /* renamed from: b */
    public final int mo1667b() {
        return this.f2922c.mo1663c(this.f2923d);
    }

    /* renamed from: b */
    public final long mo1668b(long j) {
        return mo1665a(j) + this.f2922c.mo1660b(j - this.f2924e, this.f2923d);
    }

    /* renamed from: c */
    public final long mo1670c(long j) {
        return this.f2922c.mo1659a(j, this.f2923d) + this.f2924e;
    }

    /* renamed from: a */
    public final long mo1665a(long j) {
        return this.f2922c.mo1658a(j - this.f2924e);
    }

    /* renamed from: d */
    public final baj mo1671d(long j) {
        return this.f2922c.mo1661b(j - this.f2924e);
    }
}
