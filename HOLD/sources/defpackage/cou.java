package defpackage;

import android.view.View;

/* renamed from: cou  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cou implements View.OnFocusChangeListener {
    private final cov a;

    public cou(cov cov) {
        this.a = cov;
    }

    public final void onFocusChange(View view, boolean z) {
        cov cov = this.a;
        if (z) {
            cov.c.u();
        }
    }
}
