package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: agc  reason: default package */
/* compiled from: PG */
public final class agc {
    private final List a = new ArrayList();

    public final synchronized List a() {
        return this.a;
    }

    public final synchronized void a(tr trVar) {
        this.a.add(trVar);
    }
}
