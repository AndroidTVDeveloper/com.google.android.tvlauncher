package defpackage;

import android.view.View;

/* renamed from: jg  reason: default package */
/* compiled from: PG */
final class jg extends ji {
    public jg(jx jxVar) {
        super(jxVar);
    }

    public final int a(View view) {
        return this.a.c(view) + ((jy) view.getLayoutParams()).rightMargin;
    }

    public final int b(View view) {
        return this.a.a(view) - ((jy) view.getLayoutParams()).leftMargin;
    }
}
