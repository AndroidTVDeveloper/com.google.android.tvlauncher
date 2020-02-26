package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.android.tvlauncher.instantvideo.widget.InstantVideoView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: clz  reason: default package */
/* compiled from: PG */
public final class clz implements Handler.Callback {
    public boolean a = false;
    public long b;
    public long c;
    public final Handler d;
    public final List e = new ArrayList(2);
    private final InstantVideoView f;

    public clz(InstantVideoView instantVideoView) {
        this.f = instantVideoView;
        this.d = new Handler(this);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                a(this.b);
            } else if (i != 3) {
                return false;
            }
            this.d.removeMessages(1);
            return false;
        }
        long e2 = (long) this.f.e.e();
        a(e2);
        if (e2 >= this.b) {
            return false;
        }
        this.d.sendEmptyMessageDelayed(1, this.c);
        return false;
    }

    private final void a(long j) {
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((cly) list.get(i)).a(j);
        }
    }

    public final void a() {
        if (this.a) {
            this.a = false;
            Handler handler = this.d;
            handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 3));
        }
    }
}
