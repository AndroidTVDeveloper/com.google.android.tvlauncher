package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: bfg  reason: default package */
/* compiled from: PG */
final class bfg implements bdl {
    public static final bfg a = new bfg();
    private final List b;

    public final int a(long j) {
        return j >= 0 ? -1 : 0;
    }

    public final int b() {
        return 1;
    }

    private bfg() {
        this.b = Collections.emptyList();
    }

    public bfg(bdj bdj) {
        this.b = Collections.singletonList(bdj);
    }

    public final List b(long j) {
        return j >= 0 ? this.b : Collections.emptyList();
    }

    public final long a(int i) {
        bks.a(i == 0);
        return 0;
    }
}
