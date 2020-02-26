package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: vb  reason: default package */
/* compiled from: PG */
final class vb implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new Thread(new va(runnable), "glide-active-resources");
    }
}
