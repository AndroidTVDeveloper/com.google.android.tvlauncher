package p000;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* renamed from: hg */
/* compiled from: PG */
final class C0198hg extends PopupWindow {
    static {
        int i = Build.VERSION.SDK_INT;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: kz.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      kz.a(int, int):int
      kz.a(int, boolean):boolean */
    public C0198hg(Context context, int i) {
        super(context, (AttributeSet) null, i, 0);
        C0298kz a = C0298kz.m7865a(context, null, C0128er.f9177o, i);
        if (a.mo5522e(2)) {
            C0194hc.m7486a(this, a.mo5514a(2, false));
        }
        setBackgroundDrawable(a.mo5512a(0));
        a.mo5513a();
    }
}
