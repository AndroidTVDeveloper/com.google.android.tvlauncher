package defpackage;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreference;

/* renamed from: rr  reason: default package */
/* compiled from: PG */
public final class rr implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ SwitchPreference a;

    public rr(SwitchPreference switchPreference) {
        this.a = switchPreference;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!this.a.b(Boolean.valueOf(z))) {
            compoundButton.setChecked(!z);
        } else {
            this.a.d(z);
        }
    }
}
