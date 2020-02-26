package p000;

/* renamed from: cko */
/* compiled from: PG */
final class cko extends cju implements cxu {
    public cko(cjp cjp, int i) {
        super(cjp, i);
    }

    /* renamed from: l */
    public final String mo3012l() {
        return mo2933c(11);
    }

    /* renamed from: Q */
    public final byte[] mo3000Q() {
        cjp cjp = this.f5759a;
        int i = this.f5760b;
        cjp.mo2921c();
        cjp.f5730a.moveToPosition(i);
        return cjp.f5730a.getBlob(39);
    }

    /* renamed from: P */
    public final String mo2999P() {
        return mo2933c(40);
    }

    /* renamed from: m */
    public final String mo3013m() {
        return mo2933c(12);
    }

    /* renamed from: q */
    public final int mo3017q() {
        return mo2932b(16);
    }

    /* renamed from: w */
    public final String mo3024w() {
        return mo2933c(22);
    }

    /* renamed from: b */
    public final long mo3002b() {
        return mo2931a(1);
    }

    /* renamed from: E */
    public final String mo2988E() {
        return mo2933c(31);
    }

    /* renamed from: t */
    public final String mo3020t() {
        return mo2933c(19);
    }

    /* renamed from: x */
    public final long mo3025x() {
        return mo2931a(24);
    }

    /* renamed from: B */
    public final String mo2985B() {
        return mo2933c(28);
    }

    /* renamed from: C */
    public final String mo2986C() {
        return mo2933c(29);
    }

    /* renamed from: M */
    public final String mo2996M() {
        return mo2933c(23);
    }

    /* renamed from: a */
    public final long mo3001a() {
        return mo2931a(0);
    }

    /* renamed from: p */
    public final long mo3016p() {
        return mo2931a(15);
    }

    /* renamed from: o */
    public final int mo3015o() {
        return mo2932b(14);
    }

    /* renamed from: y */
    public final int mo3026y() {
        return mo2932b(25);
    }

    /* renamed from: J */
    public final long mo2993J() {
        return mo2931a(36);
    }

    /* renamed from: I */
    public final long mo2992I() {
        return mo2931a(35);
    }

    /* renamed from: v */
    public final String mo3023v() {
        return mo2933c(21);
    }

    /* renamed from: u */
    public final String mo3022u() {
        return mo2933c(20);
    }

    /* renamed from: s */
    public final String mo3019s() {
        return mo2933c(18);
    }

    /* renamed from: O */
    public final String mo2998O() {
        return mo2933c(43);
    }

    /* renamed from: D */
    public final long mo2987D() {
        return mo2931a(30);
    }

    /* renamed from: k */
    public final String mo3011k() {
        return mo2933c(10);
    }

    /* renamed from: g */
    public final int mo3007g() {
        return mo2932b(6);
    }

    /* renamed from: f */
    public final String mo3006f() {
        return mo2933c(5);
    }

    /* renamed from: j */
    public final String mo3010j() {
        return mo2933c(9);
    }

    /* renamed from: n */
    public final String mo3014n() {
        return mo2933c(13);
    }

    /* renamed from: G */
    public final String mo2990G() {
        return mo2933c(33);
    }

    /* renamed from: F */
    public final int mo2989F() {
        return mo2932b(32);
    }

    /* renamed from: z */
    public final String mo3027z() {
        return mo2933c(26);
    }

    /* renamed from: e */
    public final String mo3005e() {
        return mo2933c(4);
    }

    /* renamed from: r */
    public final String mo3018r() {
        return mo2933c(17);
    }

    /* renamed from: i */
    public final int mo3009i() {
        return mo2932b(8);
    }

    /* renamed from: h */
    public final String mo3008h() {
        return mo2933c(7);
    }

    /* renamed from: d */
    public final String mo3004d() {
        return mo2933c(3);
    }

    /* renamed from: A */
    public final int mo2984A() {
        return mo2932b(27);
    }

    /* renamed from: c */
    public final int mo3003c() {
        return mo2932b(2);
    }

    /* renamed from: L */
    public final int mo2995L() {
        return mo2932b(38);
    }

    /* renamed from: K */
    public final int mo2994K() {
        return mo2932b(37);
    }

    /* renamed from: N */
    public final int mo2997N() {
        return mo2932b(41);
    }

    /* renamed from: H */
    public final boolean mo2991H() {
        return mo2932b(34) == 1;
    }

    public final String toString() {
        long a = mo3001a();
        long b = mo3002b();
        String d = mo3004d();
        String f = mo3006f();
        String j = mo3010j();
        int length = String.valueOf(d).length();
        StringBuilder sb = new StringBuilder(length + 114 + String.valueOf(f).length() + String.valueOf(j).length());
        sb.append("Program{id=");
        sb.append(a);
        sb.append(", channelId=");
        sb.append(b);
        sb.append(", title='");
        sb.append(d);
        sb.append("', previewImageUri='");
        sb.append(f);
        sb.append("', previewVideoUri='");
        sb.append(j);
        sb.append("'}");
        return sb.toString();
    }
}
