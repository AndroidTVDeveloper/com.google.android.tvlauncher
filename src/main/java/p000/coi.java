package p000;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import java.util.List;

/* renamed from: coi */
/* compiled from: PG */
public final class coi implements MediaSessionManager.OnActiveSessionsChangedListener {

    /* renamed from: b */
    private static coi f6160b;

    /* renamed from: a */
    public final Context f6161a;

    /* renamed from: c */
    private MediaController f6162c;

    private coi(Context context) {
        this.f6161a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static coi m5206a(Context context) {
        if (f6160b == null) {
            f6160b = new coi(context);
        }
        return f6160b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo3161a() {
        PlaybackState playbackState;
        MediaController mediaController = this.f6162c;
        if (mediaController == null || (playbackState = mediaController.getPlaybackState()) == null || playbackState.getState() != 3) {
            return false;
        }
        return true;
    }

    public final void onActiveSessionsChanged(List list) {
        this.f6162c = list.size() != 0 ? (MediaController) list.get(0) : null;
    }
}
