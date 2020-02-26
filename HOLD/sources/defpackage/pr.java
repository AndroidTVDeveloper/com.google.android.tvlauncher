package defpackage;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;

/* renamed from: pr  reason: default package */
/* compiled from: PG */
public final class pr implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ CheckBoxPreference a;

    public pr(CheckBoxPreference checkBoxPreference) {
        this.a = checkBoxPreference;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!this.a.b(Boolean.valueOf(z))) {
            compoundButton.setChecked(!z);
        } else {
            this.a.d(z);
        }
    }
}
