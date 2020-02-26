package defpackage;

import android.view.View;

/* renamed from: mw  reason: default package */
/* compiled from: PG */
public final class mw extends mz {
    public final float a(View view) {
        if (view.getLayoutDirection() == 1) {
            return view.getTranslationX() + ((float) view.getWidth());
        }
        return view.getTranslationX() - ((float) view.getWidth());
    }
}
