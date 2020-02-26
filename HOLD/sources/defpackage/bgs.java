package defpackage;

import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;

/* renamed from: bgs  reason: default package */
/* compiled from: PG */
public final class bgs implements Runnable {
    private boolean a;
    private final /* synthetic */ AspectRatioFrameLayout b;

    public /* synthetic */ bgs(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.b = aspectRatioFrameLayout;
    }

    public final void run() {
        this.a = false;
    }

    public final void a() {
        if (!this.a) {
            this.a = true;
            this.b.post(this);
        }
    }
}
