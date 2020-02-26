package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: cox */
/* compiled from: PG */
public final class cox {

    /* renamed from: a */
    public final Map f6855a = new HashMap();

    /* renamed from: b */
    public final cla f6856b;

    /* renamed from: c */
    public final cow f6857c = new cow(this);

    public cox(cla cla) {
        this.f6856b = cla;
    }

    /* renamed from: a */
    public final void mo3534a() {
        Iterator it = this.f6855a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!this.f6856b.f5885m.contains(Long.valueOf(((Long) entry.getKey()).longValue()))) {
                this.f6857c.removeMessages(99, this.f6855a.get(entry.getValue()));
                it.remove();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3536a(long j, boolean z) {
        if (z) {
            mo3537b(j);
        } else {
            mo3535a(j);
        }
    }

    /* renamed from: a */
    public final void mo3535a(long j) {
        Map map = this.f6855a;
        Long valueOf = Long.valueOf(j);
        if (!map.containsKey(valueOf)) {
            this.f6855a.put(valueOf, valueOf);
            cow cow = this.f6857c;
            cow.sendMessageDelayed(cow.obtainMessage(99, valueOf), 30000);
        }
    }

    /* renamed from: b */
    public final void mo3537b(long j) {
        Map map = this.f6855a;
        Long valueOf = Long.valueOf(j);
        if (map.containsKey(valueOf)) {
            this.f6857c.removeMessages(99, this.f6855a.get(valueOf));
            this.f6855a.remove(valueOf);
        }
    }
}
