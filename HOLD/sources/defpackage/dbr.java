package defpackage;

import android.media.MediaPlayer;

/* renamed from: dbr  reason: default package */
/* compiled from: PG */
public final class dbr implements MediaPlayer.OnCompletionListener {
    private final /* synthetic */ dbv a;

    public dbr(dbv dbv) {
        this.a = dbv;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.a.a.setOnCompletionListener(null);
        this.a.a();
        dbu dbu = this.a.c;
        if (dbu != null) {
            ((crs) dbu).a.a.b();
        }
    }
}
