package p000;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: dz */
/* compiled from: PG */
public final class C0109dz extends ClickableSpan {

    /* renamed from: a */
    private final int f9111a;

    /* renamed from: b */
    private final C0114ed f9112b;

    /* renamed from: c */
    private final int f9113c;

    public C0109dz(int i, C0114ed edVar, int i2) {
        this.f9111a = i;
        this.f9112b = edVar;
        this.f9113c = i2;
    }

    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f9111a);
        C0114ed edVar = this.f9112b;
        int i = this.f9113c;
        int i2 = Build.VERSION.SDK_INT;
        edVar.f9123a.performAction(i, bundle);
    }
}
