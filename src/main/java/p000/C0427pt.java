package p000;

import android.view.View;
import android.widget.AdapterView;
import androidx.preference.DropDownPreference;

/* renamed from: pt */
/* compiled from: PG */
public final class C0427pt implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    private final /* synthetic */ DropDownPreference f10189a;

    public C0427pt(DropDownPreference dropDownPreference) {
        this.f10189a = dropDownPreference;
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i >= 0) {
            String charSequence = this.f10189a.f1329h[i].toString();
            if (!charSequence.equals(this.f10189a.f1330i) && this.f10189a.mo1095b((Object) charSequence)) {
                this.f10189a.mo1075a(charSequence);
            }
        }
    }
}
