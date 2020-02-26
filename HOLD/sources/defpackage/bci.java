package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: bci  reason: default package */
/* compiled from: PG */
public class bci {
    public final String n;
    public final List o;
    public final boolean p;

    protected bci(String str, List list, boolean z) {
        this.n = str;
        this.o = Collections.unmodifiableList(list);
        this.p = z;
    }
}
