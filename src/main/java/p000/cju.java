package p000;

/* renamed from: cju */
/* compiled from: PG */
class cju {

    /* renamed from: a */
    public final cjp f5759a;

    /* renamed from: b */
    public final int f5760b;

    public cju(cjp cjp, int i) {
        if (i < cjp.mo2918b()) {
            this.f5759a = cjp;
            this.f5760b = i;
            return;
        }
        int b = cjp.mo2918b();
        StringBuilder sb = new StringBuilder(56);
        sb.append("Position [");
        sb.append(i);
        sb.append("] is out of bounds [0, ");
        sb.append(b - 1);
        sb.append("]");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo2932b(int i) {
        return this.f5759a.mo2919b(this.f5760b, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo2931a(int i) {
        return this.f5759a.mo2916a(this.f5760b, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo2933c(int i) {
        return this.f5759a.mo2920c(this.f5760b, i);
    }
}
