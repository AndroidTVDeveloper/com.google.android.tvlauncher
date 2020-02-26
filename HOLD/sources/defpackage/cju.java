package defpackage;

/* renamed from: cju  reason: default package */
/* compiled from: PG */
class cju {
    public final cjp a;
    public final int b;

    public cju(cjp cjp, int i) {
        if (i < cjp.b()) {
            this.a = cjp;
            this.b = i;
            return;
        }
        int b2 = cjp.b();
        StringBuilder sb = new StringBuilder(56);
        sb.append("Position [");
        sb.append(i);
        sb.append("] is out of bounds [0, ");
        sb.append(b2 - 1);
        sb.append("]");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final int b(int i) {
        return this.a.b(this.b, i);
    }

    /* access modifiers changed from: protected */
    public final long a(int i) {
        return this.a.a(this.b, i);
    }

    /* access modifiers changed from: protected */
    public final String c(int i) {
        return this.a.c(this.b, i);
    }
}
