package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: yc  reason: default package */
/* compiled from: PG */
final class yc {
    public final Map a = new HashMap();
    public final yb b = new yb();

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        ya yaVar;
        synchronized (this) {
            yaVar = (ya) aic.a((ya) this.a.get(str));
            int i = yaVar.b;
            if (i > 0) {
                int i2 = i - 1;
                yaVar.b = i2;
                if (i2 == 0) {
                    ya yaVar2 = (ya) this.a.remove(str);
                    if (yaVar2.equals(yaVar)) {
                        yb ybVar = this.b;
                        synchronized (ybVar.a) {
                            if (ybVar.a.size() < 10) {
                                ybVar.a.offer(yaVar2);
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
        yaVar.a.unlock();
    }
}
