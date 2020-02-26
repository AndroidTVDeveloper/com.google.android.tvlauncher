package p000;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;

/* renamed from: pr */
/* compiled from: PG */
public final class C0425pr implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private final /* synthetic */ CheckBoxPreference f10188a;

    public C0425pr(CheckBoxPreference checkBoxPreference) {
        this.f10188a = checkBoxPreference;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!this.f10188a.mo1095b(Boolean.valueOf(z))) {
            compoundButton.setChecked(!z);
        } else {
            this.f10188a.mo1131d(z);
        }
    }
}
