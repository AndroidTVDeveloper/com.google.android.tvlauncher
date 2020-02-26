package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: blh  reason: default package */
/* compiled from: PG */
public final class blh implements bkp {
    public final Handler a;

    public blh(Handler handler) {
        this.a = handler;
    }

    public final Message a(int i, int i2) {
        return this.a.obtainMessage(i, i2, 0);
    }

    public final Message a(int i, int i2, int i3, Object obj) {
        return this.a.obtainMessage(i, i2, i3, obj);
    }

    public final Message a(int i, Object obj) {
        return this.a.obtainMessage(i, obj);
    }

    public final void a() {
        this.a.removeMessages(2);
    }

    public final void a(int i) {
        this.a.sendEmptyMessage(i);
    }
}
