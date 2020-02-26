package p000;

import android.content.Context;
import android.content.Intent;
import androidx.preference.Preference;
import com.google.android.tvlauncher.settings.OpenSourceActivity;

/* renamed from: czs */
/* compiled from: PG */
final class czs implements C0448qn {

    /* renamed from: a */
    private final /* synthetic */ Context f8002a;

    /* renamed from: b */
    private final /* synthetic */ czu f8003b;

    public czs(czu czu, Context context) {
        this.f8003b = czu;
        this.f8002a = context;
    }

    /* renamed from: a */
    public final boolean mo3837a(Preference preference) {
        this.f8003b.startActivity(new Intent(this.f8002a, OpenSourceActivity.class));
        return true;
    }
}
