package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: bfg */
/* compiled from: PG */
final class bfg implements bdl {

    /* renamed from: a */
    public static final bfg f3669a = new bfg();

    /* renamed from: b */
    private final List f3670b;

    /* renamed from: a */
    public final int mo1780a(long j) {
        return j >= 0 ? -1 : 0;
    }

    /* renamed from: b */
    public final int mo1782b() {
        return 1;
    }

    private bfg() {
        this.f3670b = Collections.emptyList();
    }

    public bfg(bdj bdj) {
        this.f3670b = Collections.singletonList(bdj);
    }

    /* renamed from: b */
    public final List mo1783b(long j) {
        return j >= 0 ? this.f3670b : Collections.emptyList();
    }

    /* renamed from: a */
    public final long mo1781a(int i) {
        bks.m3510a(i == 0);
        return 0;
    }
}
