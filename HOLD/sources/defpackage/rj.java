package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.preference.Preference;

/* renamed from: rj  reason: default package */
/* compiled from: PG */
final class rj extends dj {
    private final /* synthetic */ rk b;

    public rj(rk rkVar) {
        this.b = rkVar;
    }

    public final void a(View view, ed edVar) {
        Preference f;
        this.b.e.a(view, edVar);
        int d = this.b.d.d(view);
        jp jpVar = this.b.d.g;
        if ((jpVar instanceof re) && (f = ((re) jpVar).f(d)) != null) {
            f.a(edVar);
        }
    }

    public final boolean a(View view, int i, Bundle bundle) {
        return this.b.e.a(view, i, bundle);
    }
}
