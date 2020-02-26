package p000;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: iu */
/* compiled from: PG */
final class C0239iu implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    private final /* synthetic */ C0246ja f9646a;

    public C0239iu(C0246ja jaVar) {
        this.f9646a = jaVar;
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C0223ie ieVar;
        if (i != -1 && (ieVar = this.f9646a.f9661a) != null) {
            ieVar.f9553a = false;
        }
    }
}
