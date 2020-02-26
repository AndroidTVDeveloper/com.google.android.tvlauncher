package p000;

/* renamed from: bfl */
/* compiled from: PG */
public final class bfl {

    /* renamed from: a */
    public long f3689a;

    /* renamed from: b */
    public long f3690b;

    /* renamed from: c */
    public CharSequence f3691c;

    /* renamed from: d */
    public int f3692d;

    /* renamed from: e */
    public float f3693e;

    /* renamed from: f */
    public int f3694f;

    /* renamed from: g */
    public int f3695g;

    /* renamed from: h */
    public float f3696h;

    /* renamed from: i */
    public int f3697i;

    /* renamed from: j */
    public float f3698j;

    public bfl() {
        mo1820a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r1 > 1.0f) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a4  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.bfm mo1821b() {
        /*
            r24 = this;
            r0 = r24
            float r1 = r0.f3693e
            int r2 = r0.f3694f
            r3 = 0
            r4 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r5 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0011
            goto L_0x001f
        L_0x0011:
            if (r2 != 0) goto L_0x001f
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 < 0) goto L_0x001c
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x001f
            goto L_0x002a
        L_0x001c:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x002c
        L_0x001f:
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0024
            goto L_0x002c
        L_0x0024:
            if (r2 == 0) goto L_0x002a
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            goto L_0x002c
        L_0x002a:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x002c:
            r0.f3693e = r1
            float r1 = r0.f3696h
            r2 = 1056964608(0x3f000000, float:0.5)
            r6 = 5
            r7 = 4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0039
            goto L_0x004c
        L_0x0039:
            int r1 = r0.f3692d
            if (r1 == r7) goto L_0x0047
            if (r1 == r6) goto L_0x0042
            r1 = 1056964608(0x3f000000, float:0.5)
            goto L_0x004a
        L_0x0042:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x004a
        L_0x0047:
            r1 = 0
        L_0x004a:
            r0.f3696h = r1
        L_0x004c:
            int r3 = r0.f3697i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 3
            r9 = 2
            r10 = 1
            if (r3 == r4) goto L_0x0056
            goto L_0x006b
        L_0x0056:
            int r3 = r0.f3692d
            if (r3 == r10) goto L_0x0066
            if (r3 == r8) goto L_0x0062
            if (r3 == r7) goto L_0x0066
            if (r3 == r6) goto L_0x0062
            r3 = 1
            goto L_0x0069
        L_0x0062:
            r3 = 2
            goto L_0x0069
        L_0x0066:
            r3 = 0
        L_0x0069:
            r0.f3697i = r3
        L_0x006b:
            float r4 = r0.f3698j
            if (r3 == 0) goto L_0x0088
            if (r3 == r10) goto L_0x007e
            if (r3 != r9) goto L_0x0074
            goto L_0x008a
        L_0x0074:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = java.lang.String.valueOf(r3)
            r1.<init>(r2)
            throw r1
        L_0x007e:
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0086
            float r5 = r5 - r1
            float r1 = r5 + r5
            goto L_0x008a
        L_0x0086:
            float r1 = r1 + r1
            goto L_0x008a
        L_0x0088:
            float r1 = r5 - r1
        L_0x008a:
            float r1 = java.lang.Math.min(r4, r1)
            r0.f3698j = r1
            bfm r1 = new bfm
            long r12 = r0.f3689a
            long r14 = r0.f3690b
            java.lang.CharSequence r2 = r0.f3691c
            java.lang.Object r2 = p000.bks.m3507a(r2)
            r16 = r2
            java.lang.CharSequence r16 = (java.lang.CharSequence) r16
            int r2 = r0.f3692d
            if (r2 == r10) goto L_0x00d2
            if (r2 == r9) goto L_0x00cd
            if (r2 == r8) goto L_0x00c8
            if (r2 == r7) goto L_0x00d2
            if (r2 == r6) goto L_0x00c8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 34
            r3.<init>(r4)
            java.lang.String r4 = "Unknown textAlignment: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "WebvttCueBuilder"
            android.util.Log.w(r3, r2)
            r2 = 0
            r17 = r2
            goto L_0x00d6
        L_0x00c8:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            r17 = r2
            goto L_0x00d6
        L_0x00cd:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_CENTER
            r17 = r2
            goto L_0x00d6
        L_0x00d2:
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_NORMAL
            r17 = r2
        L_0x00d6:
            float r2 = r0.f3693e
            int r3 = r0.f3694f
            int r4 = r0.f3695g
            float r5 = r0.f3696h
            int r6 = r0.f3697i
            float r7 = r0.f3698j
            r11 = r1
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r11.<init>(r12, r14, r16, r17, r18, r19, r20, r21, r22, r23)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bfl.mo1821b():bfm");
    }

    /* renamed from: a */
    public final void mo1820a() {
        this.f3689a = 0;
        this.f3690b = 0;
        this.f3691c = null;
        this.f3692d = 2;
        this.f3693e = -3.4028235E38f;
        this.f3694f = 1;
        this.f3695g = 0;
        this.f3696h = -3.4028235E38f;
        this.f3697i = Integer.MIN_VALUE;
        this.f3698j = 1.0f;
    }
}
