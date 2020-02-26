package p000;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: ev */
/* compiled from: PG */
public final class C0132ev implements TransformationMethod {

    /* renamed from: a */
    private final Locale f9186a;

    public C0132ev(Context context) {
        this.f9186a = context.getResources().getConfiguration().locale;
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f9186a);
        }
        return null;
    }
}
