package defpackage;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: deb  reason: default package */
/* compiled from: PG */
final class deb extends Property {
    private deb() {
        super(Rect.class, "bounds");
    }

    public /* synthetic */ deb(byte b) {
        super(Rect.class, "bounds");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return dei.a((View) obj);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        dei.a((View) obj, (Rect) obj2);
    }
}
