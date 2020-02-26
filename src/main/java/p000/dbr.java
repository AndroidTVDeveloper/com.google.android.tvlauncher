package p000;

import android.media.MediaPlayer;

/* renamed from: dbr */
/* compiled from: PG */
public final class dbr implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    private final /* synthetic */ dbv f8166a;

    public dbr(dbv dbv) {
        this.f8166a = dbv;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.f8166a.f8169a.setOnCompletionListener(null);
        this.f8166a.mo4078a();
        dbu dbu = this.f8166a.f8171c;
        if (dbu != null) {
            ((crs) dbu).f7077a.f7078a.mo3680b();
        }
    }
}
