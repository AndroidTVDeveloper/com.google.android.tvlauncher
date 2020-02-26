package p000;

import android.util.Property;

/* renamed from: ow */
/* compiled from: PG */
final class C0403ow extends Property {
    public C0403ow(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((C0404ox) obj).f10098b);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        C0404ox oxVar = (C0404ox) obj;
        oxVar.f10098b = ((Integer) obj2).intValue();
        oxVar.invalidate();
    }
}
