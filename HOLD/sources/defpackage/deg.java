package defpackage;

import android.util.FloatProperty;
import android.view.View;

/* renamed from: deg  reason: default package */
/* compiled from: PG */
final class deg extends FloatProperty {
    private deg() {
        super("scale");
    }

    public /* synthetic */ deg(byte b) {
        super("scale");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((View) obj).getScaleX());
    }

    public final /* bridge */ /* synthetic */ void setValue(Object obj, float f) {
        View view = (View) obj;
        view.setScaleX(f);
        view.setScaleY(f);
    }
}
