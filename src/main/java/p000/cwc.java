package p000;

import android.media.tv.TvInputInfo;
import android.media.tv.TvInputManager;

/* renamed from: cwc */
/* compiled from: PG */
final class cwc extends TvInputManager.TvInputCallback {

    /* renamed from: a */
    private final /* synthetic */ cwe f7725a;

    public /* synthetic */ cwc(cwe cwe) {
        this.f7725a = cwe;
    }

    public final void onInputAdded(String str) {
        cwe cwe = this.f7725a;
        int i = cwe.f7727n;
        cwd cwd = cwe.f7742m;
        cwd.sendMessage(cwd.obtainMessage(2, str));
    }

    public final void onInputRemoved(String str) {
        cwe cwe = this.f7725a;
        int i = cwe.f7727n;
        cwd cwd = cwe.f7742m;
        cwd.sendMessage(cwd.obtainMessage(3, str));
    }

    public final void onInputStateChanged(String str, int i) {
        cwe cwe = this.f7725a;
        int i2 = cwe.f7727n;
        cwd cwd = cwe.f7742m;
        cwd.sendMessage(cwd.obtainMessage(1, i, 0, str));
    }

    public final void onTvInputInfoUpdated(TvInputInfo tvInputInfo) {
        cwe cwe = this.f7725a;
        int i = cwe.f7727n;
        cwd cwd = cwe.f7742m;
        cwd.sendMessage(cwd.obtainMessage(4, tvInputInfo));
    }
}
