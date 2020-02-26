package defpackage;

import java.util.Comparator;

/* renamed from: blc  reason: default package */
/* compiled from: PG */
final /* synthetic */ class blc implements Comparator {
    public static final Comparator a = new blc();

    private blc() {
    }

    public final int compare(Object obj, Object obj2) {
        return Float.compare(((bld) obj).c, ((bld) obj2).c);
    }
}
