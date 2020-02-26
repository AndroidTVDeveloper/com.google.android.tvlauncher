package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: bsv  reason: default package */
/* compiled from: PG */
public final class bsv {
    public final Set a;
    public final Set b;
    public final Map c;
    public final String d;
    public final String e;
    public final bwj f;
    public Integer g;

    public bsv(Set set, Map map, String str, String str2, bwj bwj) {
        this.a = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.c = map == null ? Collections.emptyMap() : map;
        this.d = str;
        this.e = str2;
        this.f = bwj;
        HashSet hashSet = new HashSet(this.a);
        for (bty bty : this.c.values()) {
            hashSet.addAll(null);
        }
        this.b = Collections.unmodifiableSet(hashSet);
    }
}
