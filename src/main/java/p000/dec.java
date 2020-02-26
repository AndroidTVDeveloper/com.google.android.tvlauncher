package p000;

import android.util.FloatProperty;
import android.widget.ImageView;

/* renamed from: dec */
/* compiled from: PG */
final class dec extends FloatProperty {

    /* renamed from: a */
    private float f8362a;

    /* renamed from: b */
    private final int f8363b = -16777216;

    public dec() {
        super("Color Filter");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        ImageView imageView = (ImageView) obj;
        return Float.valueOf(this.f8362a);
    }

    public final /* bridge */ /* synthetic */ void setValue(Object obj, float f) {
        this.f8362a = f;
        ((ImageView) obj).setColorFilter(dej.m6252b(this.f8363b, f));
    }
}
