package defpackage;

import android.app.Fragment;
import com.google.android.tvlauncher.inputs.InputsPanelActivity;

/* renamed from: cvp  reason: default package */
/* compiled from: PG */
public final /* synthetic */ class cvp implements Runnable {
    private final InputsPanelActivity a;
    private final Fragment b;

    public cvp(InputsPanelActivity inputsPanelActivity, Fragment fragment) {
        this.a = inputsPanelActivity;
        this.b = fragment;
    }

    public final void run() {
        InputsPanelActivity inputsPanelActivity = this.a;
        inputsPanelActivity.getFragmentManager().beginTransaction().remove(this.b).commitNow();
    }
}
