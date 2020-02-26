package defpackage;

import android.media.MediaPlayer;

/* renamed from: dbs  reason: default package */
/* compiled from: PG */
public final class dbs implements MediaPlayer.OnPreparedListener {
    private final /* synthetic */ dbv a;

    public dbs(dbv dbv) {
        this.a = dbv;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        dbu dbu = this.a.c;
        if (dbu != null) {
            crz crz = ((crs) dbu).a.a;
            if (crz.g) {
                dbv dbv = crz.f;
                dbv.a.start();
                dbu dbu2 = dbv.c;
                if (dbu2 != null) {
                    crs crs = (crs) dbu2;
                    crs.a.a.a.setVisibility(4);
                    crs.a.a.d.setVisibility(0);
                }
            }
        }
    }
}
