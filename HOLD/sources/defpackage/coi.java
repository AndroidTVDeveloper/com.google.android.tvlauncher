package defpackage;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import java.util.List;

/* renamed from: coi  reason: default package */
/* compiled from: PG */
public final class coi implements MediaSessionManager.OnActiveSessionsChangedListener {
    private static coi b;
    public final Context a;
    private MediaController c;

    private coi(Context context) {
        this.a = context.getApplicationContext();
    }

    public static coi a(Context context) {
        if (b == null) {
            b = new coi(context);
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        PlaybackState playbackState;
        MediaController mediaController = this.c;
        if (mediaController == null || (playbackState = mediaController.getPlaybackState()) == null || playbackState.getState() != 3) {
            return false;
        }
        return true;
    }

    public final void onActiveSessionsChanged(List list) {
        this.c = list.size() != 0 ? (MediaController) list.get(0) : null;
    }
}
