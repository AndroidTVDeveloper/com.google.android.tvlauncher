package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: ss */
/* compiled from: PG */
public final class C0507ss {

    /* renamed from: a */
    public final aan f10395a = new aan(this.f10403i);

    /* renamed from: b */
    public final agb f10396b = new agb();

    /* renamed from: c */
    public final agg f10397c = new agg();

    /* renamed from: d */
    public final agi f10398d = new agi();

    /* renamed from: e */
    public final C0554ul f10399e = new C0554ul();

    /* renamed from: f */
    public final aey f10400f = new aey();

    /* renamed from: g */
    public final age f10401g = new age();

    /* renamed from: h */
    public final agd f10402h = new agd();

    /* renamed from: i */
    public final C0082cz f10403i = aim.m575a();

    /* renamed from: j */
    private final agc f10404j = new agc();

    public C0507ss() {
        List asList = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.addAll(asList);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f10397c.mo187a(arrayList);
    }

    /* renamed from: a */
    public final void mo5930a(Class cls, C0531tp tpVar) {
        this.f10396b.mo181a(cls, tpVar);
    }

    /* renamed from: a */
    public final void mo5931a(Class cls, C0543ua uaVar) {
        this.f10398d.mo190a(cls, uaVar);
    }

    /* renamed from: a */
    public final void mo5929a(Class cls, Class cls2, C0541tz tzVar) {
        mo5932a("legacy_append", cls, cls2, tzVar);
    }

    /* renamed from: a */
    public final void mo5927a(Class cls, Class cls2, aak aak) {
        this.f10395a.mo19a(cls, cls2, aak);
    }

    /* renamed from: a */
    public final void mo5932a(String str, Class cls, Class cls2, C0541tz tzVar) {
        this.f10397c.mo186a(str, tzVar, cls, cls2);
    }

    /* renamed from: a */
    public final List mo5925a() {
        List a = this.f10404j.mo182a();
        if (!a.isEmpty()) {
            return a;
        }
        throw new C0503so();
    }

    /* renamed from: a */
    public final List mo5926a(Object obj) {
        List b = this.f10395a.mo20b(obj.getClass());
        if (!b.isEmpty()) {
            int size = b.size();
            List emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                aaj aaj = (aaj) b.get(i);
                if (aaj.mo12a(obj)) {
                    if (z) {
                        emptyList = new ArrayList(size - i);
                    }
                    emptyList.add(aaj);
                    z = false;
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new C0504sp(obj, b);
        }
        throw new C0504sp(obj);
    }

    /* renamed from: a */
    public final void mo5933a(C0533tr trVar) {
        this.f10404j.mo183a(trVar);
    }

    /* renamed from: a */
    public final void mo5934a(C0550uh uhVar) {
        this.f10399e.mo6007a(uhVar);
    }

    /* renamed from: a */
    public final void mo5928a(Class cls, Class cls2, aew aew) {
        this.f10400f.mo125a(cls, cls2, aew);
    }
}
