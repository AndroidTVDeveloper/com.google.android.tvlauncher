package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: aiv  reason: default package */
/* compiled from: PG */
public final class aiv {
    public final aiu a;
    public int b;
    public float c = 1.0f;
    private final AudioManager d;
    private final ait e;

    public aiv(Context context, Handler handler, aiu aiu) {
        this.d = (AudioManager) context.getApplicationContext().getSystemService("audio");
        this.a = aiu;
        this.e = new ait(this, handler);
        this.b = 0;
    }

    public final void b() {
        if (this.b != 0) {
            if (blm.a < 26) {
                this.d.abandonAudioFocus(this.e);
            }
            this.b = 0;
        }
    }

    public final int a() {
        if (this.b == 0) {
            return 1;
        }
        b();
        return 1;
    }
}
