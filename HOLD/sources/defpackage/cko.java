package defpackage;

/* renamed from: cko  reason: default package */
/* compiled from: PG */
final class cko extends cju implements cxu {
    public cko(cjp cjp, int i) {
        super(cjp, i);
    }

    public final String l() {
        return c(11);
    }

    public final byte[] Q() {
        cjp cjp = this.a;
        int i = this.b;
        cjp.c();
        cjp.a.moveToPosition(i);
        return cjp.a.getBlob(39);
    }

    public final String P() {
        return c(40);
    }

    public final String m() {
        return c(12);
    }

    public final int q() {
        return b(16);
    }

    public final String w() {
        return c(22);
    }

    public final long b() {
        return a(1);
    }

    public final String E() {
        return c(31);
    }

    public final String t() {
        return c(19);
    }

    public final long x() {
        return a(24);
    }

    public final String B() {
        return c(28);
    }

    public final String C() {
        return c(29);
    }

    public final String M() {
        return c(23);
    }

    public final long a() {
        return a(0);
    }

    public final long p() {
        return a(15);
    }

    public final int o() {
        return b(14);
    }

    public final int y() {
        return b(25);
    }

    public final long J() {
        return a(36);
    }

    public final long I() {
        return a(35);
    }

    public final String v() {
        return c(21);
    }

    public final String u() {
        return c(20);
    }

    public final String s() {
        return c(18);
    }

    public final String O() {
        return c(43);
    }

    public final long D() {
        return a(30);
    }

    public final String k() {
        return c(10);
    }

    public final int g() {
        return b(6);
    }

    public final String f() {
        return c(5);
    }

    public final String j() {
        return c(9);
    }

    public final String n() {
        return c(13);
    }

    public final String G() {
        return c(33);
    }

    public final int F() {
        return b(32);
    }

    public final String z() {
        return c(26);
    }

    public final String e() {
        return c(4);
    }

    public final String r() {
        return c(17);
    }

    public final int i() {
        return b(8);
    }

    public final String h() {
        return c(7);
    }

    public final String d() {
        return c(3);
    }

    public final int A() {
        return b(27);
    }

    public final int c() {
        return b(2);
    }

    public final int L() {
        return b(38);
    }

    public final int K() {
        return b(37);
    }

    public final int N() {
        return b(41);
    }

    public final boolean H() {
        return b(34) == 1;
    }

    public final String toString() {
        long a = a();
        long b = b();
        String d = d();
        String f = f();
        String j = j();
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
