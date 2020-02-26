package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* renamed from: air */
/* compiled from: PG */
final class air extends BroadcastReceiver implements Runnable {

    /* renamed from: a */
    private final Handler f407a;

    public air(Handler handler) {
        this.f407a = handler;
    }

    public final void run() {
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f407a.post(this);
        }
    }
}
