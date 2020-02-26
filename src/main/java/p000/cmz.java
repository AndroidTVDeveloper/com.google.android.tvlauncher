package p000;

import java.util.List;
import org.w3c.dom.Element;

/* renamed from: cmz */
/* compiled from: PG */
final class cmz extends dej {

    /* renamed from: a */
    private final /* synthetic */ cne f6090a;

    /* renamed from: b */
    private final /* synthetic */ cnf f6091b;

    public cmz(cnf cnf, cne cne) {
        this.f6091b = cnf;
        this.f6090a = cne;
    }

    /* renamed from: a */
    public final void mo3125a() {
        List list = this.f6091b.f6111a;
        this.f6090a.mo3146a(list.remove(list.size() - 1));
    }

    /* renamed from: a */
    public final void mo3126a(Element element) {
        this.f6091b.f6111a.add(this.f6090a.mo3145a());
    }
}
