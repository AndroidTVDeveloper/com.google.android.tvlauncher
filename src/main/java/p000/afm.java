package p000;

/* renamed from: afm */
/* compiled from: PG */
final class afm implements afr {

    /* renamed from: a */
    private final /* synthetic */ afn f235a;

    public afm(afn afn) {
        this.f235a = afn;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f235a);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 11 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append("{fragment=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
