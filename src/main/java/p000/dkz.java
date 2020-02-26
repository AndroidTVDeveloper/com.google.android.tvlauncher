package p000;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: dkz */
/* compiled from: PG */
final class dkz extends dlg {
    public dkz(int i) {
        super(i);
    }

    /* renamed from: a */
    public final void mo4590a() {
        if (!this.f8761c) {
            for (int i = 0; i < mo4612b(); i++) {
                Map.Entry b = mo4613b(i);
                if (((diu) b.getKey()).mo4472d()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Map.Entry entry : mo4614c()) {
                if (((diu) entry.getKey()).mo4472d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo4590a();
    }
}
