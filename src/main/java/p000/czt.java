package p000;

import android.content.Intent;
import androidx.preference.Preference;

/* renamed from: czt */
/* compiled from: PG */
final class czt implements C0448qn {

    /* renamed from: a */
    private final /* synthetic */ Intent f8004a;

    /* renamed from: b */
    private final /* synthetic */ czu f8005b;

    public czt(czu czu, Intent intent) {
        this.f8005b = czu;
        this.f8004a = intent;
    }

    /* renamed from: a */
    public final boolean mo3837a(Preference preference) {
        this.f8005b.startActivity(this.f8004a);
        return true;
    }
}
