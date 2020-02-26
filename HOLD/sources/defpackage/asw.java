package defpackage;

/* renamed from: asw  reason: default package */
/* compiled from: PG */
public final class asw {
    private final String a;
    private final int b;
    private final int c;
    private int d;
    private String e;

    public asw(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    public asw(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            StringBuilder sb = new StringBuilder(12);
            sb.append(i);
            sb.append("/");
            str = sb.toString();
        } else {
            str = "";
        }
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = Integer.MIN_VALUE;
    }

    public final void a() {
        int i = this.d;
        int i2 = i != Integer.MIN_VALUE ? i + this.c : this.b;
        this.d = i2;
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append(str);
        sb.append(i2);
        this.e = sb.toString();
    }

    public final String c() {
        d();
        return this.e;
    }

    public final int b() {
        d();
        return this.d;
    }

    private final void d() {
        if (this.d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
