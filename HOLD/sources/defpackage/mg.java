package defpackage;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import androidx.preference.DialogPreference;

@Deprecated
/* renamed from: mg  reason: default package */
/* compiled from: PG */
public class mg extends Fragment {
    private DialogPreference a;

    public mg() {
        int i = Build.VERSION.SDK_INT;
        atc.a(this);
    }

    public final DialogPreference a() {
        if (this.a == null) {
            this.a = (DialogPreference) ((ps) getTargetFragment()).a(getArguments().getString("key"));
        }
        return this.a;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Fragment targetFragment = getTargetFragment();
        if (!(targetFragment instanceof ps)) {
            throw new IllegalStateException("Target fragment " + targetFragment + " must implement TargetFragment interface");
        }
    }
}
