package p000;

import android.os.Process;
import android.text.TextUtils;

/* renamed from: clk */
/* compiled from: PG */
public final class clk implements Runnable {

    /* renamed from: a */
    private final String f5913a;

    /* renamed from: b */
    private final String f5914b;

    /* renamed from: c */
    private final clr f5915c;

    public clk(clr clr, String str, String str2) {
        this.f5915c = clr;
        this.f5913a = str;
        this.f5914b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof clk) {
            return TextUtils.equals(this.f5914b, ((clk) obj).f5914b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5914b.hashCode();
    }

    public final void run() {
        Process.setThreadPriority(10);
        this.f5915c.mo3104a(this.f5913a, this.f5914b);
    }
}
