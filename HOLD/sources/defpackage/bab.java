package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: bab  reason: default package */
/* compiled from: PG */
public final class bab {
    public final int a;
    public final int b;
    public final List c;
    public final List d;
    public final List e;

    public bab(int i, int i2, List list, List list2, List list3) {
        this.a = i;
        this.b = i2;
        this.c = Collections.unmodifiableList(list);
        this.d = Collections.unmodifiableList(list2);
        this.e = Collections.unmodifiableList(list3);
    }
}
