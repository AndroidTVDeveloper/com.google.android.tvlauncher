package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: yt  reason: default package */
/* compiled from: PG */
public final class yt implements ThreadFactory {
    public final boolean a;
    private final String b;
    private int c;

    public yt(String str, boolean z) {
        this.b = str;
        this.a = z;
    }

    public final synchronized Thread newThread(Runnable runnable) {
        ys ysVar;
        String str = this.b;
        int i = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25);
        sb.append("glide-");
        sb.append(str);
        sb.append("-thread-");
        sb.append(i);
        ysVar = new ys(this, runnable, sb.toString());
        this.c++;
        return ysVar;
    }
}
