package defpackage;

import android.os.Handler;
import android.os.Message;

/* renamed from: qr  reason: default package */
/* compiled from: PG */
final class qr extends Handler {
    private final /* synthetic */ qx a;

    public qr(qx qxVar) {
        this.a = qxVar;
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            this.a.c();
        }
    }
}
