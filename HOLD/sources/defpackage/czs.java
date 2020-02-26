package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.preference.Preference;
import com.google.android.tvlauncher.settings.OpenSourceActivity;

/* renamed from: czs  reason: default package */
/* compiled from: PG */
final class czs implements qn {
    private final /* synthetic */ Context a;
    private final /* synthetic */ czu b;

    public czs(czu czu, Context context) {
        this.b = czu;
        this.a = context;
    }

    public final boolean a(Preference preference) {
        this.b.startActivity(new Intent(this.a, OpenSourceActivity.class));
        return true;
    }
}
