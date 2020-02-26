package defpackage;

import android.util.Property;

/* renamed from: ow  reason: default package */
/* compiled from: PG */
final class ow extends Property {
    public ow(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((ox) obj).b);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ox oxVar = (ox) obj;
        oxVar.b = ((Integer) obj2).intValue();
        oxVar.invalidate();
    }
}
