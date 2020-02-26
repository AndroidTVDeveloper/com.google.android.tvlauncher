package defpackage;

import android.view.View;
import androidx.preference.Preference;

/* renamed from: qi  reason: default package */
/* compiled from: PG */
public final class qi implements View.OnClickListener {
    private final /* synthetic */ Preference a;

    public qi(Preference preference) {
        this.a = preference;
    }

    public final void onClick(View view) {
        this.a.a(view);
    }
}
