package defpackage;

import android.os.Process;
import android.text.TextUtils;

/* renamed from: cli  reason: default package */
/* compiled from: PG */
public final class cli implements Runnable {
    private final String a;
    private final clr b;

    public cli(clr clr, String str) {
        this.b = clr;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cli) {
            return TextUtils.equals(this.a, ((cli) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void run() {
        Process.setThreadPriority(10);
        this.b.a(this.a);
    }
}
