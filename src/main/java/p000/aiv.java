package p000;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: aiv */
/* compiled from: PG */
public final class aiv {

    /* renamed from: a */
    public final aiu f412a;

    /* renamed from: b */
    public int f413b;

    /* renamed from: c */
    public float f414c = 1.0f;

    /* renamed from: d */
    private final AudioManager f415d;

    /* renamed from: e */
    private final ait f416e;

    public aiv(Context context, Handler handler, aiu aiu) {
        this.f415d = (AudioManager) context.getApplicationContext().getSystemService("audio");
        this.f412a = aiu;
        this.f416e = new ait(this, handler);
        this.f413b = 0;
    }

    /* renamed from: b */
    public final void mo335b() {
        if (this.f413b != 0) {
            if (blm.f4293a < 26) {
                this.f415d.abandonAudioFocus(this.f416e);
            }
            this.f413b = 0;
        }
    }

    /* renamed from: a */
    public final int mo334a() {
        if (this.f413b == 0) {
            return 1;
        }
        mo335b();
        return 1;
    }
}
