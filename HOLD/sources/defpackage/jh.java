package defpackage;

import android.view.View;

/* renamed from: jh  reason: default package */
/* compiled from: PG */
public final class jh extends ji {
    public jh(jx jxVar) {
        super(jxVar);
    }

    public final int a(View view) {
        return this.a.d(view) + ((jy) view.getLayoutParams()).bottomMargin;
    }

    public final int b(View view) {
        return this.a.b(view) - ((jy) view.getLayoutParams()).topMargin;
    }
}
