package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: bqb */
/* compiled from: PG */
public final class bqb {

    /* renamed from: a */
    public final Map f4572a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    public final Map f4573b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: a */
    public final void mo2303a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f4572a) {
            hashMap = new HashMap(this.f4572a);
        }
        synchronized (this.f4573b) {
            hashMap2 = new HashMap(this.f4573b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo3199c(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((bxe) entry2.getKey()).mo2515a(new bol(status));
            }
        }
    }
}
