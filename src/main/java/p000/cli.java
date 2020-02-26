package p000;

import android.os.Process;
import android.text.TextUtils;

/* renamed from: cli */
/* compiled from: PG */
public final class cli implements Runnable {

    /* renamed from: a */
    private final String f5909a;

    /* renamed from: b */
    private final clr f5910b;

    public cli(clr clr, String str) {
        this.f5910b = clr;
        this.f5909a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cli) {
            return TextUtils.equals(this.f5909a, ((cli) obj).f5909a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5909a.hashCode();
    }

    public final void run() {
        Process.setThreadPriority(10);
        this.f5910b.mo3103a(this.f5909a);
    }
}
