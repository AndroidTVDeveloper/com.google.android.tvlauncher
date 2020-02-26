package p000;

import android.os.Handler;
import android.os.Message;
import com.google.android.tvlauncher.instantvideo.widget.InstantVideoView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: clz */
/* compiled from: PG */
public final class clz implements Handler.Callback {

    /* renamed from: a */
    public boolean f5955a = false;

    /* renamed from: b */
    public long f5956b;

    /* renamed from: c */
    public long f5957c;

    /* renamed from: d */
    public final Handler f5958d;

    /* renamed from: e */
    public final List f5959e = new ArrayList(2);

    /* renamed from: f */
    private final InstantVideoView f5960f;

    public clz(InstantVideoView instantVideoView) {
        this.f5960f = instantVideoView;
        this.f5958d = new Handler(this);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                m5094a(this.f5956b);
            } else if (i != 3) {
                return false;
            }
            this.f5958d.removeMessages(1);
            return false;
        }
        long e = (long) this.f5960f.f6603e.mo3889e();
        m5094a(e);
        if (e >= this.f5956b) {
            return false;
        }
        this.f5958d.sendEmptyMessageDelayed(1, this.f5957c);
        return false;
    }

    /* renamed from: a */
    private final void m5094a(long j) {
        List list = this.f5959e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((cly) list.get(i)).mo3084a(j);
        }
    }

    /* renamed from: a */
    public final void mo3112a() {
        if (this.f5955a) {
            this.f5955a = false;
            Handler handler = this.f5958d;
            handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 3));
        }
    }
}
