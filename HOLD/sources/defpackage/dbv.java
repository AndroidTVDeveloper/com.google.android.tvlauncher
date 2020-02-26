package defpackage;

import android.media.MediaPlayer;

/* renamed from: dbv  reason: default package */
/* compiled from: PG */
public final class dbv {
    public MediaPlayer a;
    public String b;
    public dbu c;

    public final void a() {
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.a.stop();
            }
            this.a.release();
            this.a = null;
        }
    }
}
