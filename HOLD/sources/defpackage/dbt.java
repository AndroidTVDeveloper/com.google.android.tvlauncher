package defpackage;

import android.media.MediaPlayer;
import android.util.Log;

/* renamed from: dbt  reason: default package */
/* compiled from: PG */
public final class dbt implements MediaPlayer.OnErrorListener {
    private final /* synthetic */ dbv a;

    public dbt(dbv dbv) {
        this.a = dbv;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = this.a.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("Uri ");
        sb.append(str);
        sb.append(" cannot be played with what=");
        sb.append(i);
        sb.append(" and extra=");
        sb.append(i2);
        Log.e("LauncherAudioPlayer", sb.toString());
        this.a.a();
        dbu dbu = this.a.c;
        if (dbu == null) {
            return true;
        }
        dbu.a();
        return true;
    }
}
