package defpackage;

import android.os.Process;
import android.text.TextUtils;

/* renamed from: clk  reason: default package */
/* compiled from: PG */
public final class clk implements Runnable {
    private final String a;
    private final String b;
    private final clr c;

    public clk(clr clr, String str, String str2) {
        this.c = clr;
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof clk) {
            return TextUtils.equals(this.b, ((clk) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void run() {
        Process.setThreadPriority(10);
        this.c.a(this.a, this.b);
    }
}
