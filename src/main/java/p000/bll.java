package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: bll */
/* compiled from: PG */
final /* synthetic */ class bll implements ThreadFactory {

    /* renamed from: a */
    private final String f4292a;

    public bll(String str) {
        this.f4292a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f4292a);
    }
}
