package p000;

import android.util.Log;

/* renamed from: ajz */
/* compiled from: PG */
final /* synthetic */ class ajz implements Runnable {

    /* renamed from: a */
    private final akw f498a;

    public ajz(akw akw) {
        this.f498a = akw;
    }

    public final void run() {
        try {
            ake.m704b(this.f498a);
        } catch (ajh e) {
            Log.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }
}
