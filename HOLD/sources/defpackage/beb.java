package defpackage;

/* renamed from: beb  reason: default package */
/* compiled from: PG */
final class beb extends bdq implements Comparable {
    public long g;

    private beb() {
    }

    public /* synthetic */ beb(byte b) {
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        beb beb = (beb) obj;
        if (c() != beb.c()) {
            return c() ? 1 : -1;
        }
        long j = this.d - beb.d;
        if (j == 0) {
            j = this.g - beb.g;
            if (j == 0) {
                return 0;
            }
        }
        return j <= 0 ? -1 : 1;
    }
}
