package defpackage;

import android.media.AudioManager;
import android.os.Handler;

/* renamed from: ait  reason: default package */
/* compiled from: PG */
final class ait implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ aiv a;
    private final Handler b;

    public ait(aiv aiv, Handler handler) {
        this.a = aiv;
        this.b = handler;
    }

    public final void onAudioFocusChange(int i) {
        this.b.post(new ais(this, i));
    }
}
