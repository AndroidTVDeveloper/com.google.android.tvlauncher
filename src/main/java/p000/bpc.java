package p000;

/* renamed from: bpc */
/* compiled from: PG */
public final class bpc extends UnsupportedOperationException {

    /* renamed from: a */
    private final bnr f4536a;

    public bpc(bnr bnr) {
        this.f4536a = bnr;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.f4536a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
