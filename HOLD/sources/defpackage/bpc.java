package defpackage;

/* renamed from: bpc  reason: default package */
/* compiled from: PG */
public final class bpc extends UnsupportedOperationException {
    private final bnr a;

    public bpc(bnr bnr) {
        this.a = bnr;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
