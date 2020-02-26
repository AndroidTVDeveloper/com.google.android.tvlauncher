package defpackage;

import android.view.View;

/* renamed from: cpk  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cpk implements View.OnFocusChangeListener {
    private final cpn a;

    public cpk(cpn cpn) {
        this.a = cpn;
    }

    public final void onFocusChange(View view, boolean z) {
        this.a.b(z);
    }
}
