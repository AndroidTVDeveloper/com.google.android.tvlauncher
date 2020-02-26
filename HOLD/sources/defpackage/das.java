package defpackage;

import android.graphics.PorterDuff;
import android.view.View;

/* renamed from: das  reason: default package */
/* compiled from: PG */
final class das implements View.OnFocusChangeListener {
    private final /* synthetic */ day a;
    private final /* synthetic */ View b;
    private final /* synthetic */ daw c;

    public das(daw daw, day day, View view) {
        this.c = daw;
        this.a = day;
        this.b = view;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            if (this.a.e) {
                daw daw = this.c;
                daw.i.setColorFilter(daw.c, PorterDuff.Mode.SRC_ATOP);
            }
            this.b.setBackgroundColor(this.c.c);
            return;
        }
        if (this.a.e) {
            daw daw2 = this.c;
            daw2.i.setColorFilter(daw2.d, PorterDuff.Mode.SRC_ATOP);
        }
        this.b.setBackgroundColor(this.c.d);
    }
}
