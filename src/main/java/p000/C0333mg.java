package p000;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import androidx.preference.DialogPreference;

@Deprecated
/* renamed from: mg */
/* compiled from: PG */
public class C0333mg extends Fragment {

    /* renamed from: a */
    private DialogPreference f9962a;

    public C0333mg() {
        int i = Build.VERSION.SDK_INT;
        atc.m2046a(this);
    }

    /* renamed from: a */
    public final DialogPreference mo5580a() {
        if (this.f9962a == null) {
            this.f9962a = (DialogPreference) ((C0426ps) getTargetFragment()).mo5758a(getArguments().getString("key"));
        }
        return this.f9962a;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Fragment targetFragment = getTargetFragment();
        if (!(targetFragment instanceof C0426ps)) {
            throw new IllegalStateException("Target fragment " + targetFragment + " must implement TargetFragment interface");
        }
    }
}
