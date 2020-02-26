package p000;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ajn */
/* compiled from: PG */
final /* synthetic */ class ajn implements Runnable {

    /* renamed from: a */
    private final CopyOnWriteArrayList f456a;

    /* renamed from: b */
    private final aix f457b;

    public ajn(CopyOnWriteArrayList copyOnWriteArrayList, aix aix) {
        this.f456a = copyOnWriteArrayList;
        this.f457b = aix;
    }

    public final void run() {
        ajy.m658a(this.f456a, this.f457b);
    }
}
