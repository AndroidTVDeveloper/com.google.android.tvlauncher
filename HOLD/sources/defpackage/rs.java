package defpackage;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreferenceCompat;

/* renamed from: rs  reason: default package */
/* compiled from: PG */
public final class rs implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ SwitchPreferenceCompat a;

    public rs(SwitchPreferenceCompat switchPreferenceCompat) {
        this.a = switchPreferenceCompat;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!this.a.b(Boolean.valueOf(z))) {
            compoundButton.setChecked(!z);
        } else {
            this.a.d(z);
        }
    }
}
