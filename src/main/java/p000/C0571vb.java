package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: vb */
/* compiled from: PG */
final class C0571vb implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new Thread(new C0570va(runnable), "glide-active-resources");
    }
}
