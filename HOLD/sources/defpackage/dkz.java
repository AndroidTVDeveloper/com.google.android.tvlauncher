package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: dkz  reason: default package */
/* compiled from: PG */
final class dkz extends dlg {
    public dkz(int i) {
        super(i);
    }

    public final void a() {
        if (!this.c) {
            for (int i = 0; i < b(); i++) {
                Map.Entry b = b(i);
                if (((diu) b.getKey()).d()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Map.Entry entry : c()) {
                if (((diu) entry.getKey()).d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
