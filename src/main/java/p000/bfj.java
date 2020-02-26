package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: bfj */
/* compiled from: PG */
final class bfj implements bdl {

    /* renamed from: a */
    private final List f3676a;

    public bfj(List list) {
        this.f3676a = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public final int mo1780a(long j) {
        return j >= 0 ? -1 : 0;
    }

    /* renamed from: b */
    public final int mo1782b() {
        return 1;
    }

    /* renamed from: b */
    public final List mo1783b(long j) {
        return j >= 0 ? this.f3676a : Collections.emptyList();
    }

    /* renamed from: a */
    public final long mo1781a(int i) {
        bks.m3510a(i == 0);
        return 0;
    }
}
