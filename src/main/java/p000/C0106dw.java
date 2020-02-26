package p000;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.tvlauncher.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: dw */
/* compiled from: PG */
final class C0106dw {

    /* renamed from: a */
    public static final ArrayList f9105a = new ArrayList();

    /* renamed from: b */
    public WeakHashMap f9106b = null;

    /* renamed from: c */
    public WeakReference f9107c = null;

    /* renamed from: d */
    private SparseArray f9108d = null;

    /* renamed from: a */
    static C0106dw m7190a(View view) {
        C0106dw dwVar = (C0106dw) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (dwVar != null) {
            return dwVar;
        }
        C0106dw dwVar2 = new C0106dw();
        view.setTag(R.id.tag_unhandled_key_event_manager, dwVar2);
        return dwVar2;
    }

    /* renamed from: a */
    public final View mo4690a(View view, KeyEvent keyEvent) {
        WeakHashMap weakHashMap = this.f9106b;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View a = mo4690a(viewGroup.getChildAt(childCount), keyEvent);
                if (a != null) {
                    return a;
                }
            }
        }
        if (mo4691b(view)) {
            return view;
        }
        return null;
    }

    /* renamed from: a */
    public final SparseArray mo4689a() {
        if (this.f9108d == null) {
            this.f9108d = new SparseArray();
        }
        return this.f9108d;
    }

    /* renamed from: b */
    public final boolean mo4691b(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C0105dv) arrayList.get(size)).mo4688a()) {
                return true;
            }
        }
        return false;
    }
}
