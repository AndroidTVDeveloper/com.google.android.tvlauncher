package defpackage;

import android.content.Intent;
import androidx.preference.Preference;

/* renamed from: czt  reason: default package */
/* compiled from: PG */
final class czt implements qn {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ czu b;

    public czt(czu czu, Intent intent) {
        this.b = czu;
        this.a = intent;
    }

    public final boolean a(Preference preference) {
        this.b.startActivity(this.a);
        return true;
    }
}
