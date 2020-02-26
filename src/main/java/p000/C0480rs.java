package p000;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreferenceCompat;

/* renamed from: rs */
/* compiled from: PG */
public final class C0480rs implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private final /* synthetic */ SwitchPreferenceCompat f10281a;

    public C0480rs(SwitchPreferenceCompat switchPreferenceCompat) {
        this.f10281a = switchPreferenceCompat;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!this.f10281a.mo1095b(Boolean.valueOf(z))) {
            compoundButton.setChecked(!z);
        } else {
            this.f10281a.mo1131d(z);
        }
    }
}
