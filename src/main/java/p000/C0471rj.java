package p000;

import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;

/* renamed from: rj */
/* compiled from: PG */
final class C0471rj extends C0093dj {

    /* renamed from: b */
    private final /* synthetic */ C0472rk f10255b;

    public C0471rj(C0472rk rkVar) {
        this.f10255b = rkVar;
    }

    /* renamed from: a */
    public final void mo4496a(View view, C0114ed edVar) {
        Preference f;
        this.f10255b.f10257e.mo4496a(view, edVar);
        int d = this.f10255b.f10256d.mo858d(view);
        C0261jp jpVar = this.f10255b.f10256d.f1067g;
        if ((jpVar instanceof C0466re) && (f = ((C0466re) jpVar).mo5806f(d)) != null) {
            f.mo1087a(edVar);
        }
    }

    /* renamed from: a */
    public final boolean mo4497a(View view, int i, Bundle bundle) {
        return this.f10255b.f10257e.mo4497a(view, i, bundle);
    }
}
