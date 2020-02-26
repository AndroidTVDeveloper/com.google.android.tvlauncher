package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: dz  reason: default package */
/* compiled from: PG */
public final class dz extends ClickableSpan {
    private final int a;
    private final ed b;
    private final int c;

    public dz(int i, ed edVar, int i2) {
        this.a = i;
        this.b = edVar;
        this.c = i2;
    }

    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        ed edVar = this.b;
        int i = this.c;
        int i2 = Build.VERSION.SDK_INT;
        edVar.a.performAction(i, bundle);
    }
}
