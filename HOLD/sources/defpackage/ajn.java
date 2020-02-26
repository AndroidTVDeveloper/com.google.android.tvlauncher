package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ajn  reason: default package */
/* compiled from: PG */
final /* synthetic */ class ajn implements Runnable {
    private final CopyOnWriteArrayList a;
    private final aix b;

    public ajn(CopyOnWriteArrayList copyOnWriteArrayList, aix aix) {
        this.a = copyOnWriteArrayList;
        this.b = aix;
    }

    public final void run() {
        ajy.a(this.a, this.b);
    }
}
