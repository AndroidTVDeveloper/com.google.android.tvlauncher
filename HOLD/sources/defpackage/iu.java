package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: iu  reason: default package */
/* compiled from: PG */
final class iu implements AdapterView.OnItemSelectedListener {
    private final /* synthetic */ ja a;

    public iu(ja jaVar) {
        this.a = jaVar;
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ie ieVar;
        if (i != -1 && (ieVar = this.a.a) != null) {
            ieVar.a = false;
        }
    }
}
