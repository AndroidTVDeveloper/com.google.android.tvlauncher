package p000;

import android.media.MediaPlayer;
import android.util.Log;
import java.io.IOException;

/* renamed from: crt */
/* compiled from: PG */
public final class crt implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ crz f7078a;

    public crt(crz crz) {
        this.f7078a = crz;
    }

    public final void run() {
        crz crz = this.f7078a;
        if (!crz.f7141j && crz.f7143l != null && crz.f7138g) {
            crz.f7137f.f8171c = new crs(this);
            dbv dbv = this.f7078a.f7137f;
            dbv.f8169a = new MediaPlayer();
            dbv.f8169a.setOnCompletionListener(new dbr(dbv));
            dbv.f8169a.setOnPreparedListener(new dbs(dbv));
            dbv.f8169a.setOnErrorListener(new dbt(dbv));
            try {
                dbv.f8169a.setDataSource(dbv.f8170b);
                dbv.f8169a.prepareAsync();
            } catch (IOException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("LauncherAudioPlayer", valueOf.length() == 0 ? new String("[ERROR] ") : "[ERROR] ".concat(valueOf));
                dbv.mo4078a();
                dbu dbu = dbv.f8171c;
                if (dbu != null) {
                    dbu.mo3668a();
                }
            }
        }
    }
}
