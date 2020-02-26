package p000;

import android.content.Context;
import java.util.HashMap;

/* renamed from: bmo */
/* compiled from: PG */
public final class bmo {

    /* renamed from: a */
    public bnn f4418a;

    /* renamed from: b */
    public bmr f4419b;

    /* renamed from: c */
    public boolean f4420c;

    /* renamed from: d */
    public final Object f4421d = new Object();

    /* renamed from: e */
    public final Context f4422e;

    public bmo(Context context) {
        buh.m4199a(context);
        Context applicationContext = context.getApplicationContext();
        this.f4422e = applicationContext != null ? applicationContext : context;
        this.f4420c = false;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        mo2152a();
        super.finalize();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2152a() {
        /*
            r2 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            p000.buh.m4211b(r0)
            monitor-enter(r2)
            android.content.Context r0 = r2.f4422e     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0028
            bnn r0 = r2.f4418a     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0028
            boolean r0 = r2.f4420c     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001e
            p000.bui.m4228a()     // Catch:{ all -> 0x001d }
            android.content.Context r0 = r2.f4422e     // Catch:{ all -> 0x001d }
            bnn r1 = r2.f4418a     // Catch:{ all -> 0x001d }
            r0.unbindService(r1)     // Catch:{ all -> 0x001d }
            goto L_0x001e
        L_0x001d:
            r0 = move-exception
        L_0x001e:
            r0 = 0
            r2.f4420c = r0     // Catch:{ all -> 0x002a }
            r0 = 0
            r2.f4419b = r0     // Catch:{ all -> 0x002a }
            r2.f4418a = r0     // Catch:{ all -> 0x002a }
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bmo.mo2152a():void");
    }

    /* renamed from: a */
    public static final void m3759a(bmn bmn, long j, String str, Throwable th) {
        String str2;
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str3 = "1";
            hashMap.put("app_context", str3);
            if (bmn != null) {
                if (!bmn.f4417b) {
                    str3 = "0";
                }
                hashMap.put("limit_ad_tracking", str3);
            }
            if (!(bmn == null || (str2 = bmn.f4416a) == null)) {
                hashMap.put("ad_id_size", Integer.toString(str2.length()));
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            if (!str.isEmpty()) {
                hashMap.put("experiment_id", str);
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new bmm(hashMap).start();
        }
    }
}
