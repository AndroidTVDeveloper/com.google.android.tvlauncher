package p000;

import android.widget.CompoundButton;
import androidx.preference.SwitchPreference;

/* renamed from: rr */
/* compiled from: PG */
public final class C0479rr implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private final /* synthetic */ SwitchPreference f10280a;

    public C0479rr(SwitchPreference switchPreference) {
        this.f10280a = switchPreference;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!this.f10280a.mo1095b(Boolean.valueOf(z))) {
            compoundButton.setChecked(!z);
        } else {
            this.f10280a.mo1131d(z);
        }
    }
}
