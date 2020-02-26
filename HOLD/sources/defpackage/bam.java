package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: bam  reason: default package */
/* compiled from: PG */
public abstract class bam {
    public final akh a;
    public final String b;
    public final long c;
    public final List d;
    public final baj e;

    public /* synthetic */ bam(akh akh, String str, bas bas, List list) {
        this.a = akh;
        this.b = str;
        this.d = Collections.unmodifiableList(list);
        this.e = bas.a(this);
        this.c = blm.b(bas.h, 1000000, bas.g);
    }

    public abstract baj c();

    public abstract azr d();

    public abstract String e();
}
