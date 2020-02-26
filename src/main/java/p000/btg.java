package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: btg */
/* compiled from: PG */
public final class btg implements Handler.Callback {

    /* renamed from: a */
    public final btf f4797a;

    /* renamed from: b */
    public final ArrayList f4798b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f4799c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f4800d = new ArrayList();

    /* renamed from: e */
    public volatile boolean f4801e = false;

    /* renamed from: f */
    public final AtomicInteger f4802f = new AtomicInteger(0);

    /* renamed from: g */
    public boolean f4803g = false;

    /* renamed from: h */
    public final Handler f4804h;

    /* renamed from: i */
    public final Object f4805i = new Object();

    public btg(Looper looper, btf btf) {
        this.f4797a = btf;
        this.f4804h = new bvm(looper, this);
    }

    /* renamed from: a */
    public final void mo2419a() {
        this.f4801e = false;
        this.f4802f.incrementAndGet();
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            boq boq = (boq) message.obj;
            synchronized (this.f4805i) {
                if (this.f4801e && this.f4797a.mo2325e() && this.f4798b.contains(boq)) {
                    boq.mo2289a((Bundle) null);
                }
            }
            return true;
        }
        int i = message.what;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }
}
