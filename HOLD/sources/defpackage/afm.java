package defpackage;

/* renamed from: afm  reason: default package */
/* compiled from: PG */
final class afm implements afr {
    private final /* synthetic */ afn a;

    public afm(afn afn) {
        this.a = afn;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 11 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append("{fragment=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
