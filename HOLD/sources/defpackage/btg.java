package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: btg  reason: default package */
/* compiled from: PG */
public final class btg implements Handler.Callback {
    public final btf a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean e = false;
    public final AtomicInteger f = new AtomicInteger(0);
    public boolean g = false;
    public final Handler h;
    public final Object i = new Object();

    public btg(Looper looper, btf btf) {
        this.a = btf;
        this.h = new bvm(looper, this);
    }

    public final void a() {
        this.e = false;
        this.f.incrementAndGet();
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            boq boq = (boq) message.obj;
            synchronized (this.i) {
                if (this.e && this.a.e() && this.b.contains(boq)) {
                    boq.a((Bundle) null);
                }
            }
            return true;
        }
        int i2 = message.what;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i2);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }
}
