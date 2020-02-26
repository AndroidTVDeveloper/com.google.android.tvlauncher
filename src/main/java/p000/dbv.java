package p000;

import android.media.MediaPlayer;

/* renamed from: dbv */
/* compiled from: PG */
public final class dbv {

    /* renamed from: a */
    public MediaPlayer f8169a;

    /* renamed from: b */
    public String f8170b;

    /* renamed from: c */
    public dbu f8171c;

    /* renamed from: a */
    public final void mo4078a() {
        MediaPlayer mediaPlayer = this.f8169a;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.f8169a.stop();
            }
            this.f8169a.release();
            this.f8169a = null;
        }
    }
}
