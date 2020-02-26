package p000;

import android.graphics.PorterDuff;
import android.view.View;

/* renamed from: das */
/* compiled from: PG */
final class das implements View.OnFocusChangeListener {

    /* renamed from: a */
    private final /* synthetic */ day f8065a;

    /* renamed from: b */
    private final /* synthetic */ View f8066b;

    /* renamed from: c */
    private final /* synthetic */ daw f8067c;

    public das(daw daw, day day, View view) {
        this.f8067c = daw;
        this.f8065a = day;
        this.f8066b = view;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            if (this.f8065a.f8121e) {
                daw daw = this.f8067c;
                daw.f8099i.setColorFilter(daw.f8093c, PorterDuff.Mode.SRC_ATOP);
            }
            this.f8066b.setBackgroundColor(this.f8067c.f8093c);
            return;
        }
        if (this.f8065a.f8121e) {
            daw daw2 = this.f8067c;
            daw2.f8099i.setColorFilter(daw2.f8094d, PorterDuff.Mode.SRC_ATOP);
        }
        this.f8066b.setBackgroundColor(this.f8067c.f8094d);
    }
}
