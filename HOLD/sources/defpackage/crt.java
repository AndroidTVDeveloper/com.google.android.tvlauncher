package defpackage;

import android.media.MediaPlayer;
import android.util.Log;
import java.io.IOException;

/* renamed from: crt  reason: default package */
/* compiled from: PG */
public final class crt implements Runnable {
    public final /* synthetic */ crz a;

    public crt(crz crz) {
        this.a = crz;
    }

    public final void run() {
        crz crz = this.a;
        if (!crz.j && crz.l != null && crz.g) {
            crz.f.c = new crs(this);
            dbv dbv = this.a.f;
            dbv.a = new MediaPlayer();
            dbv.a.setOnCompletionListener(new dbr(dbv));
            dbv.a.setOnPreparedListener(new dbs(dbv));
            dbv.a.setOnErrorListener(new dbt(dbv));
            try {
                dbv.a.setDataSource(dbv.b);
                dbv.a.prepareAsync();
            } catch (IOException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("LauncherAudioPlayer", valueOf.length() == 0 ? new String("[ERROR] ") : "[ERROR] ".concat(valueOf));
                dbv.a();
                dbu dbu = dbv.c;
                if (dbu != null) {
                    dbu.a();
                }
            }
        }
    }
}
