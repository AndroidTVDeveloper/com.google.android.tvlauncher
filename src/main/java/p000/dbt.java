package p000;

import android.media.MediaPlayer;
import android.util.Log;

/* renamed from: dbt */
/* compiled from: PG */
public final class dbt implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    private final /* synthetic */ dbv f8168a;

    public dbt(dbv dbv) {
        this.f8168a = dbv;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = this.f8168a.f8170b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("Uri ");
        sb.append(str);
        sb.append(" cannot be played with what=");
        sb.append(i);
        sb.append(" and extra=");
        sb.append(i2);
        Log.e("LauncherAudioPlayer", sb.toString());
        this.f8168a.mo4078a();
        dbu dbu = this.f8168a.f8171c;
        if (dbu == null) {
            return true;
        }
        dbu.mo3668a();
        return true;
    }
}
