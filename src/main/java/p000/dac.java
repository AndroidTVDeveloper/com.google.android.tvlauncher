package p000;

import android.view.View;

/* renamed from: dac */
/* compiled from: PG */
final class dac implements View.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ day f8015a;

    /* renamed from: b */
    private final /* synthetic */ dad f8016b;

    public dac(dad dad, day day) {
        this.f8016b = dad;
        this.f8015a = day;
    }

    public final void onClick(View view) {
        dav dav;
        day day = this.f8015a;
        if (day.f8120d && (dav = this.f8016b.f8022f) != null) {
            dav.mo2802a(day);
        }
    }
}
