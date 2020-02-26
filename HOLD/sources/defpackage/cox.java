package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: cox  reason: default package */
/* compiled from: PG */
public final class cox {
    public final Map a = new HashMap();
    public final cla b;
    public final cow c = new cow(this);

    public cox(cla cla) {
        this.b = cla;
    }

    public final void a() {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!this.b.m.contains(Long.valueOf(((Long) entry.getKey()).longValue()))) {
                this.c.removeMessages(99, this.a.get(entry.getValue()));
                it.remove();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(long j, boolean z) {
        if (z) {
            b(j);
        } else {
            a(j);
        }
    }

    public final void a(long j) {
        Map map = this.a;
        Long valueOf = Long.valueOf(j);
        if (!map.containsKey(valueOf)) {
            this.a.put(valueOf, valueOf);
            cow cow = this.c;
            cow.sendMessageDelayed(cow.obtainMessage(99, valueOf), 30000);
        }
    }

    public final void b(long j) {
        Map map = this.a;
        Long valueOf = Long.valueOf(j);
        if (map.containsKey(valueOf)) {
            this.c.removeMessages(99, this.a.get(valueOf));
            this.a.remove(valueOf);
        }
    }
}
