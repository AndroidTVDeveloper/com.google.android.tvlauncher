package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: ev  reason: default package */
/* compiled from: PG */
public final class ev implements TransformationMethod {
    private final Locale a;

    public ev(Context context) {
        this.a = context.getResources().getConfiguration().locale;
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.a);
        }
        return null;
    }
}
