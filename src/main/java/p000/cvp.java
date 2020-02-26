package p000;

import android.app.Fragment;
import com.google.android.tvlauncher.inputs.InputsPanelActivity;

/* renamed from: cvp */
/* compiled from: PG */
public final /* synthetic */ class cvp implements Runnable {

    /* renamed from: a */
    private final InputsPanelActivity f7694a;

    /* renamed from: b */
    private final Fragment f7695b;

    public cvp(InputsPanelActivity inputsPanelActivity, Fragment fragment) {
        this.f7694a = inputsPanelActivity;
        this.f7695b = fragment;
    }

    public final void run() {
        InputsPanelActivity inputsPanelActivity = this.f7694a;
        inputsPanelActivity.getFragmentManager().beginTransaction().remove(this.f7695b).commitNow();
    }
}
