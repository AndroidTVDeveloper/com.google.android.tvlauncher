package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: ss  reason: default package */
/* compiled from: PG */
public final class ss {
    public final aan a = new aan(this.i);
    public final agb b = new agb();
    public final agg c = new agg();
    public final agi d = new agi();
    public final ul e = new ul();
    public final aey f = new aey();
    public final age g = new age();
    public final agd h = new agd();
    public final cz i = aim.a();
    private final agc j = new agc();

    public ss() {
        List asList = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.addAll(asList);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.c.a(arrayList);
    }

    public final void a(Class cls, tp tpVar) {
        this.b.a(cls, tpVar);
    }

    public final void a(Class cls, ua uaVar) {
        this.d.a(cls, uaVar);
    }

    public final void a(Class cls, Class cls2, tz tzVar) {
        a("legacy_append", cls, cls2, tzVar);
    }

    public final void a(Class cls, Class cls2, aak aak) {
        this.a.a(cls, cls2, aak);
    }

    public final void a(String str, Class cls, Class cls2, tz tzVar) {
        this.c.a(str, tzVar, cls, cls2);
    }

    public final List a() {
        List a2 = this.j.a();
        if (!a2.isEmpty()) {
            return a2;
        }
        throw new so();
    }

    public final List a(Object obj) {
        List b2 = this.a.b(obj.getClass());
        if (!b2.isEmpty()) {
            int size = b2.size();
            List emptyList = Collections.emptyList();
            boolean z = true;
            for (int i2 = 0; i2 < size; i2++) {
                aaj aaj = (aaj) b2.get(i2);
                if (aaj.a(obj)) {
                    if (z) {
                        emptyList = new ArrayList(size - i2);
                    }
                    emptyList.add(aaj);
                    z = false;
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new sp(obj, b2);
        }
        throw new sp(obj);
    }

    public final void a(tr trVar) {
        this.j.a(trVar);
    }

    public final void a(uh uhVar) {
        this.e.a(uhVar);
    }

    public final void a(Class cls, Class cls2, aew aew) {
        this.f.a(cls, cls2, aew);
    }
}
