package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: bll  reason: default package */
/* compiled from: PG */
final /* synthetic */ class bll implements ThreadFactory {
    private final String a;

    public bll(String str) {
        this.a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.a);
    }
}
