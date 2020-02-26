package defpackage;

import com.google.android.tvlauncher.inputs.InputsPanelActivity;

/* renamed from: cvn  reason: default package */
/* compiled from: PG */
public final /* synthetic */ class cvn implements Runnable {
    private final InputsPanelActivity a;
    private final int b;

    public cvn(InputsPanelActivity inputsPanelActivity, int i) {
        this.a = inputsPanelActivity;
        this.b = i;
    }

    public final void run() {
        this.a.b(this.b);
    }
}
