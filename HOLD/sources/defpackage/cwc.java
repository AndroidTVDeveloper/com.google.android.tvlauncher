package defpackage;

import android.media.tv.TvInputInfo;
import android.media.tv.TvInputManager;

/* renamed from: cwc  reason: default package */
/* compiled from: PG */
final class cwc extends TvInputManager.TvInputCallback {
    private final /* synthetic */ cwe a;

    public /* synthetic */ cwc(cwe cwe) {
        this.a = cwe;
    }

    public final void onInputAdded(String str) {
        cwe cwe = this.a;
        int i = cwe.n;
        cwd cwd = cwe.m;
        cwd.sendMessage(cwd.obtainMessage(2, str));
    }

    public final void onInputRemoved(String str) {
        cwe cwe = this.a;
        int i = cwe.n;
        cwd cwd = cwe.m;
        cwd.sendMessage(cwd.obtainMessage(3, str));
    }

    public final void onInputStateChanged(String str, int i) {
        cwe cwe = this.a;
        int i2 = cwe.n;
        cwd cwd = cwe.m;
        cwd.sendMessage(cwd.obtainMessage(1, i, 0, str));
    }

    public final void onTvInputInfoUpdated(TvInputInfo tvInputInfo) {
        cwe cwe = this.a;
        int i = cwe.n;
        cwd cwd = cwe.m;
        cwd.sendMessage(cwd.obtainMessage(4, tvInputInfo));
    }
}
