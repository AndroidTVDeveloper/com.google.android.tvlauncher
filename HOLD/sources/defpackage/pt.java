package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.preference.DropDownPreference;

/* renamed from: pt  reason: default package */
/* compiled from: PG */
public final class pt implements AdapterView.OnItemSelectedListener {
    private final /* synthetic */ DropDownPreference a;

    public pt(DropDownPreference dropDownPreference) {
        this.a = dropDownPreference;
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i >= 0) {
            String charSequence = this.a.h[i].toString();
            if (!charSequence.equals(this.a.i) && this.a.b((Object) charSequence)) {
                this.a.a(charSequence);
            }
        }
    }
}
