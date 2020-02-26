package defpackage;

import android.util.Log;

/* renamed from: ajz  reason: default package */
/* compiled from: PG */
final /* synthetic */ class ajz implements Runnable {
    private final akw a;

    public ajz(akw akw) {
        this.a = akw;
    }

    public final void run() {
        try {
            ake.b(this.a);
        } catch (ajh e) {
            Log.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }
}
