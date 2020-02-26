package p000;

/* renamed from: beb */
/* compiled from: PG */
final class beb extends bdq implements Comparable {

    /* renamed from: g */
    public long f3517g;

    private beb() {
    }

    public /* synthetic */ beb(byte b) {
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        beb beb = (beb) obj;
        if (mo1141c() != beb.mo1141c()) {
            return mo1141c() ? 1 : -1;
        }
        long j = this.f1426d - beb.f1426d;
        if (j == 0) {
            j = this.f3517g - beb.f3517g;
            if (j == 0) {
                return 0;
            }
        }
        return j <= 0 ? -1 : 1;
    }
}
