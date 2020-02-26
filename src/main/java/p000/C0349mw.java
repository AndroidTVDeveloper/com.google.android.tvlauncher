package p000;

import android.view.View;

/* renamed from: mw */
/* compiled from: PG */
public final class C0349mw extends C0352mz {
    /* renamed from: a */
    public final float mo5592a(View view) {
        if (view.getLayoutDirection() == 1) {
            return view.getTranslationX() + ((float) view.getWidth());
        }
        return view.getTranslationX() - ((float) view.getWidth());
    }
}
