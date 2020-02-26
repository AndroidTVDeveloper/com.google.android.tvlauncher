package p000;

import android.os.Handler;
import android.os.Message;

/* renamed from: blh */
/* compiled from: PG */
public final class blh implements bkp {

    /* renamed from: a */
    public final Handler f4284a;

    public blh(Handler handler) {
        this.f4284a = handler;
    }

    /* renamed from: a */
    public final Message mo2041a(int i, int i2) {
        return this.f4284a.obtainMessage(i, i2, 0);
    }

    /* renamed from: a */
    public final Message mo2042a(int i, int i2, int i3, Object obj) {
        return this.f4284a.obtainMessage(i, i2, i3, obj);
    }

    /* renamed from: a */
    public final Message mo2043a(int i, Object obj) {
        return this.f4284a.obtainMessage(i, obj);
    }

    /* renamed from: a */
    public final void mo2044a() {
        this.f4284a.removeMessages(2);
    }

    /* renamed from: a */
    public final void mo2045a(int i) {
        this.f4284a.sendEmptyMessage(i);
    }
}
