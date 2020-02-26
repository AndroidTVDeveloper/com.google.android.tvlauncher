package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: yc */
/* compiled from: PG */
final class C0653yc {

    /* renamed from: a */
    public final Map f10808a = new HashMap();

    /* renamed from: b */
    public final C0652yb f10809b = new C0652yb();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo6130a(String str) {
        C0651ya yaVar;
        synchronized (this) {
            yaVar = (C0651ya) aic.m542a((C0651ya) this.f10808a.get(str));
            int i = yaVar.f10806b;
            if (i > 0) {
                int i2 = i - 1;
                yaVar.f10806b = i2;
                if (i2 == 0) {
                    C0651ya yaVar2 = (C0651ya) this.f10808a.remove(str);
                    if (yaVar2.equals(yaVar)) {
                        C0652yb ybVar = this.f10809b;
                        synchronized (ybVar.f10807a) {
                            if (ybVar.f10807a.size() < 10) {
                                ybVar.f10807a.offer(yaVar2);
                            }
                        }
                    } else {
                        String valueOf = String.valueOf(yaVar);
                        String valueOf2 = String.valueOf(yaVar2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 79 + String.valueOf(valueOf2).length() + String.valueOf(str).length());
                        sb.append("Removed the wrong lock, expected to remove: ");
                        sb.append(valueOf);
                        sb.append(", but actually removed: ");
                        sb.append(valueOf2);
                        sb.append(", safeKey: ");
                        sb.append(str);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 81);
                sb2.append("Cannot release a lock that is not held, safeKey: ");
                sb2.append(str);
                sb2.append(", interestedThreads: ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
        }
        yaVar.f10805a.unlock();
    }
}
