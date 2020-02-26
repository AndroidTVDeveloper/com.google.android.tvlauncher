package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: bah  reason: default package */
/* compiled from: PG */
public final class bah {
    public final String a;
    public final long b;
    public final List c;
    public final List d;

    public bah(String str, long j, List list, List list2) {
        this.a = str;
        this.b = j;
        this.c = Collections.unmodifiableList(list);
        this.d = Collections.unmodifiableList(list2);
    }
}
