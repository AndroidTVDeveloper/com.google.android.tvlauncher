package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* renamed from: air  reason: default package */
/* compiled from: PG */
final class air extends BroadcastReceiver implements Runnable {
    private final Handler a;

    public air(Handler handler) {
        this.a = handler;
    }

    public final void run() {
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.a.post(this);
        }
    }
}
