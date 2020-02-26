package defpackage;

import android.support.v7.widget.SwitchCompat;
import android.util.Property;

/* renamed from: ku  reason: default package */
/* compiled from: PG */
public final class ku extends Property {
    public ku(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((SwitchCompat) obj).c);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((SwitchCompat) obj).a(((Float) obj2).floatValue());
    }
}
