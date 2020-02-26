package p000;

import android.util.FloatProperty;
import android.view.View;

/* renamed from: def */
/* compiled from: PG */
final class def extends FloatProperty {
    private def() {
        super("pivotX");
    }

    public /* synthetic */ def(byte b) {
        super("pivotX");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((View) obj).getPivotX());
    }

    public final /* bridge */ /* synthetic */ void setValue(Object obj, float f) {
        ((View) obj).setPivotX(f);
    }
}
