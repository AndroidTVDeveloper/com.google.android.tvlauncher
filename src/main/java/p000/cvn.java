package p000;

import com.google.android.tvlauncher.inputs.InputsPanelActivity;

/* renamed from: cvn */
/* compiled from: PG */
public final /* synthetic */ class cvn implements Runnable {

    /* renamed from: a */
    private final InputsPanelActivity f7691a;

    /* renamed from: b */
    private final int f7692b;

    public cvn(InputsPanelActivity inputsPanelActivity, int i) {
        this.f7691a = inputsPanelActivity;
        this.f7692b = i;
    }

    public final void run() {
        this.f7691a.mo3423b(this.f7692b);
    }
}
