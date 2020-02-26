package defpackage;

import android.content.res.Resources;

/* renamed from: acc  reason: default package */
/* compiled from: PG */
public final class acc implements tz {
    private final tz a;
    private final Resources b;

    public acc(Resources resources, tz tzVar) {
        this.b = (Resources) aic.a(resources);
        this.a = (tz) aic.a(tzVar);
    }

    public final ww a(Object obj, int i, int i2, tx txVar) {
        return ade.a(this.b, this.a.a(obj, i, i2, txVar));
    }

    public final boolean a(Object obj, tx txVar) {
        return this.a.a(obj, txVar);
    }
}
