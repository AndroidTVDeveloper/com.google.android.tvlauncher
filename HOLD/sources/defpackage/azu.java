package defpackage;

/* renamed from: azu  reason: default package */
/* compiled from: PG */
public final class azu {
    public final ayo a;
    public final bam b;
    public final azr c;
    public final long d;
    public final long e;

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
    public azu(long r12, int r14, defpackage.bam r15, boolean r16, java.util.List r17, defpackage.aov r18) {
        /*
            r11 = this;
            r3 = r15
            akh r0 = r3.a
            java.lang.String r0 = r0.h
            boolean r1 = defpackage.bkt.c(r0)
            r2 = 0
            if (r1 != 0) goto L_0x0065
            java.lang.String r1 = "application/ttml+xml"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0064
            java.lang.String r1 = "application/x-rawcc"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0024
            arj r0 = new arj
            akh r1 = r3.a
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
            akh r2 = r3.a
            r4 = r14
            r1.<init>(r0, r14, r2)
            r4 = r1
            goto L_0x0066
        L_0x0064:
        L_0x0065:
            r4 = r2
        L_0x0066:
            r5 = 0
            azr r7 = r15.d()
            r0 = r11
            r1 = r12
            r3 = r15
            r0.<init>(r1, r3, r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azu.<init>(long, int, bam, boolean, java.util.List, aov):void");
    }

    public azu(long j, bam bam, ayo ayo, long j2, azr azr) {
        this.d = j;
        this.b = bam;
        this.e = j2;
        this.a = ayo;
        this.c = azr;
    }

    public final long a(bac bac, int i, long j) {
        if (b() != -1 || bac.e == -9223372036854775807L) {
            return a();
        }
        return Math.max(a(), c(((j - aja.b(bac.a)) - aja.b(bac.a(i).b)) - aja.b(bac.e)));
    }

    public final long a() {
        return this.c.a() + this.e;
    }

    public final long b(bac bac, int i, long j) {
        int b2 = b();
        if (b2 == -1) {
            return c((j - aja.b(bac.a)) - aja.b(bac.a(i).b)) - 1;
        }
        return (a() + ((long) b2)) - 1;
    }

    public final int b() {
        return this.c.c(this.d);
    }

    public final long b(long j) {
        return a(j) + this.c.b(j - this.e, this.d);
    }

    public final long c(long j) {
        return this.c.a(j, this.d) + this.e;
    }

    public final long a(long j) {
        return this.c.a(j - this.e);
    }

    public final baj d(long j) {
        return this.c.b(j - this.e);
    }
}
