package p000;

import android.media.AudioManager;
import android.os.Handler;

/* renamed from: ait */
/* compiled from: PG */
final class ait implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ aiv f410a;

    /* renamed from: b */
    private final Handler f411b;

    public ait(aiv aiv, Handler handler) {
        this.f410a = aiv;
        this.f411b = handler;
    }

    public final void onAudioFocusChange(int i) {
        this.f411b.post(new ais(this, i));
    }
}
