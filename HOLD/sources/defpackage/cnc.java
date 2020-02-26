package defpackage;

import java.util.List;
import org.w3c.dom.Element;

/* renamed from: cnc  reason: default package */
/* compiled from: PG */
final class cnc extends dej {
    private final /* synthetic */ String a;
    private final /* synthetic */ cnf b;

    public cnc(cnf cnf, String str) {
        this.b = cnf;
        this.a = str;
    }

    public final void a(Element element) {
        List list = this.b.a;
        cnf.a(list.get(list.size() - 2), this.a, this.b.a());
    }
}
