package p000;

import java.util.concurrent.ThreadFactory;

/* renamed from: yt */
/* compiled from: PG */
public final class C0670yt implements ThreadFactory {

    /* renamed from: a */
    public final boolean f10834a;

    /* renamed from: b */
    private final String f10835b;

    /* renamed from: c */
    private int f10836c;

    public C0670yt(String str, boolean z) {
        this.f10835b = str;
        this.f10834a = z;
    }

    public final synchronized Thread newThread(Runnable runnable) {
        C0669ys ysVar;
        String str = this.f10835b;
        int i = this.f10836c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25);
        sb.append("glide-");
        sb.append(str);
        sb.append("-thread-");
        sb.append(i);
        ysVar = new C0669ys(this, runnable, sb.toString());
        this.f10836c++;
        return ysVar;
    }
}
