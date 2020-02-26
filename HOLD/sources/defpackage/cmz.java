package defpackage;

import java.util.List;
import org.w3c.dom.Element;

/* renamed from: cmz  reason: default package */
/* compiled from: PG */
final class cmz extends dej {
    private final /* synthetic */ cne a;
    private final /* synthetic */ cnf b;

    public cmz(cnf cnf, cne cne) {
        this.b = cnf;
        this.a = cne;
    }

    public final void a() {
        List list = this.b.a;
        this.a.a(list.remove(list.size() - 1));
    }

    public final void a(Element element) {
        this.b.a.add(this.a.a());
    }
}
