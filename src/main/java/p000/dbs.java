package p000;

import android.media.MediaPlayer;

/* renamed from: dbs */
/* compiled from: PG */
public final class dbs implements MediaPlayer.OnPreparedListener {

    /* renamed from: a */
    private final /* synthetic */ dbv f8167a;

    public dbs(dbv dbv) {
        this.f8167a = dbv;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        dbu dbu = this.f8167a.f8171c;
        if (dbu != null) {
            crz crz = ((crs) dbu).f7077a.f7078a;
            if (crz.f7138g) {
                dbv dbv = crz.f7137f;
                dbv.f8169a.start();
                dbu dbu2 = dbv.f8171c;
                if (dbu2 != null) {
                    crs crs = (crs) dbu2;
                    crs.f7077a.f7078a.f7109a.setVisibility(4);
                    crs.f7077a.f7078a.f7135d.setVisibility(0);
                }
            }
        }
    }
}
