package p000;

import android.os.Process;
import android.text.TextUtils;

/* renamed from: clh */
/* compiled from: PG */
public final class clh implements Runnable {

    /* renamed from: a */
    private final String f5907a;

    /* renamed from: b */
    private final clr f5908b;

    public clh(clr clr, String str) {
        this.f5908b = clr;
        this.f5907a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof clh) {
            return TextUtils.equals(this.f5907a, ((clh) obj).f5907a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5907a.hashCode();
    }

    public final void run() {
        Process.setThreadPriority(10);
        this.f5908b.mo3103a(this.f5907a);
    }
}
