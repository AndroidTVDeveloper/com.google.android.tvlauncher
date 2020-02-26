package defpackage;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.tvlauncher.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: dw  reason: default package */
/* compiled from: PG */
final class dw {
    public static final ArrayList a = new ArrayList();
    public WeakHashMap b = null;
    public WeakReference c = null;
    private SparseArray d = null;

    static dw a(View view) {
        dw dwVar = (dw) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (dwVar != null) {
            return dwVar;
        }
        dw dwVar2 = new dw();
        view.setTag(R.id.tag_unhandled_key_event_manager, dwVar2);
        return dwVar2;
    }

    public final View a(View view, KeyEvent keyEvent) {
        WeakHashMap weakHashMap = this.b;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View a2 = a(viewGroup.getChildAt(childCount), keyEvent);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        if (b(view)) {
            return view;
        }
        return null;
    }

    public final SparseArray a() {
        if (this.d == null) {
            this.d = new SparseArray();
        }
        return this.d;
    }

    public final boolean b(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((dv) arrayList.get(size)).a()) {
                return true;
            }
        }
        return false;
    }
}
