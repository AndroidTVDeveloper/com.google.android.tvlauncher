package p000;

import android.view.View;

/* renamed from: dar */
/* compiled from: PG */
final class dar implements View.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ day f8063a;

    /* renamed from: b */
    private final /* synthetic */ daw f8064b;

    public dar(daw daw, day day) {
        this.f8064b = daw;
        this.f8063a = day;
    }

    public final void onClick(View view) {
        day day = this.f8063a;
        if (day.f8120d) {
            if (day.f8122f) {
                this.f8064b.mo4051a();
            }
            dav dav = this.f8064b.f8096f;
            if (dav != null) {
                dav.mo2802a(this.f8063a);
            }
        }
    }
}
