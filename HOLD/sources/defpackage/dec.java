package defpackage;

import android.util.FloatProperty;
import android.widget.ImageView;

/* renamed from: dec  reason: default package */
/* compiled from: PG */
final class dec extends FloatProperty {
    private float a;
    private final int b = -16777216;

    public dec() {
        super("Color Filter");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        ImageView imageView = (ImageView) obj;
        return Float.valueOf(this.a);
    }

    public final /* bridge */ /* synthetic */ void setValue(Object obj, float f) {
        this.a = f;
        ((ImageView) obj).setColorFilter(dej.b(this.b, f));
    }
}
