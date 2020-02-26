package p000;

import com.google.android.exoplayer2.p003ui.AspectRatioFrameLayout;

/* renamed from: bgs */
/* compiled from: PG */
public final class bgs implements Runnable {

    /* renamed from: a */
    private boolean f3836a;

    /* renamed from: b */
    private final /* synthetic */ AspectRatioFrameLayout f3837b;

    public /* synthetic */ bgs(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.f3837b = aspectRatioFrameLayout;
    }

    public final void run() {
        this.f3836a = false;
    }

    /* renamed from: a */
    public final void mo1869a() {
        if (!this.f3836a) {
            this.f3836a = true;
            this.f3837b.post(this);
        }
    }
}
