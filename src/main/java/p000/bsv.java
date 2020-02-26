package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: bsv */
/* compiled from: PG */
public final class bsv {

    /* renamed from: a */
    public final Set f4769a;

    /* renamed from: b */
    public final Set f4770b;

    /* renamed from: c */
    public final Map f4771c;

    /* renamed from: d */
    public final String f4772d;

    /* renamed from: e */
    public final String f4773e;

    /* renamed from: f */
    public final bwj f4774f;

    /* renamed from: g */
    public Integer f4775g;

    public bsv(Set set, Map map, String str, String str2, bwj bwj) {
        this.f4769a = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f4771c = map == null ? Collections.emptyMap() : map;
        this.f4772d = str;
        this.f4773e = str2;
        this.f4774f = bwj;
        HashSet hashSet = new HashSet(this.f4769a);
        for (bty bty : this.f4771c.values()) {
            hashSet.addAll(null);
        }
        this.f4770b = Collections.unmodifiableSet(hashSet);
    }
}
