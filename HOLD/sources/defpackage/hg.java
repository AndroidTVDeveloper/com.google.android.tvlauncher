package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.PopupWindow;

/* renamed from: hg  reason: default package */
/* compiled from: PG */
final class hg extends PopupWindow {
    static {
        int i = Build.VERSION.SDK_INT;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: kz.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      kz.a(int, int):int
      kz.a(int, boolean):boolean */
    public hg(Context context, int i) {
        super(context, (AttributeSet) null, i, 0);
        kz a = kz.a(context, null, er.o, i);
        if (a.e(2)) {
            hc.a(this, a.a(2, false));
        }
        setBackgroundDrawable(a.a(0));
        a.a();
    }
}
