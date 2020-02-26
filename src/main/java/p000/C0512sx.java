package p000;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: sx */
/* compiled from: PG */
public final class C0512sx implements ComponentCallbacks2, afk {

    /* renamed from: k */
    private static final agj f10422k;

    /* renamed from: a */
    public final C0497si f10423a;

    /* renamed from: b */
    public final afj f10424b;

    /* renamed from: c */
    public final CopyOnWriteArrayList f10425c;

    /* renamed from: d */
    private final Context f10426d;

    /* renamed from: e */
    private final afs f10427e;

    /* renamed from: f */
    private final afr f10428f;

    /* renamed from: g */
    private final aft f10429g = new aft();

    /* renamed from: h */
    private final Runnable f10430h = new C0510sv(this);

    /* renamed from: i */
    private final Handler f10431i = new Handler(Looper.getMainLooper());

    /* renamed from: j */
    private final afd f10432j;

    /* renamed from: l */
    private agj f10433l;

    static {
        agj a = agj.m338a(Bitmap.class);
        a.mo214i();
        f10422k = a;
        agj.m338a(aeh.class).mo214i();
        agj.m344b(C0594vy.f10650b).mo196a(C0501sm.LOW).mo211g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized agj mo5951f() {
        return this.f10433l;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
    }

    public C0512sx(C0497si siVar, afj afj, afr afr, Context context) {
        afd afd;
        afs afs = new afs();
        this.f10423a = siVar;
        this.f10424b = afj;
        this.f10428f = afr;
        this.f10427e = afs;
        this.f10426d = context;
        Context applicationContext = context.getApplicationContext();
        C0511sw swVar = new C0511sw(this, afs);
        if (applicationContext.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) != 0) {
            afd = new afl();
        } else {
            afd = new afg(applicationContext, swVar);
        }
        this.f10432j = afd;
        if (aie.m566c()) {
            this.f10431i.post(this.f10430h);
        } else {
            afj.mo155a(this);
        }
        afj.mo155a(this.f10432j);
        this.f10425c = new CopyOnWriteArrayList(siVar.f10363b.f10385d);
        m8322b(siVar.f10363b.mo5924a());
        synchronized (siVar.f10367f) {
            if (!siVar.f10367f.contains(this)) {
                siVar.f10367f.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    /* renamed from: a */
    public final C0509su mo5943a(Class cls) {
        return new C0509su(this.f10423a, this, cls, this.f10426d);
    }

    /* renamed from: d */
    public final C0509su mo5949d() {
        return mo5943a(Bitmap.class).mo202b(f10422k);
    }

    /* renamed from: e */
    public final C0509su mo5950e() {
        return mo5943a(Drawable.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r1 != null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        r5.mo229a((p000.agm) null);
        r1.mo217b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5947a(p000.ahg r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x003a
            boolean r0 = r4.m8323b(r5)
            agm r1 = r5.mo237d()
            if (r0 != 0) goto L_0x003a
            si r0 = r4.f10423a
            java.util.List r2 = r0.f10367f
            monitor-enter(r2)
            java.util.List r0 = r0.f10367f     // Catch:{ all -> 0x0037 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0037 }
        L_0x0017:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0037 }
            if (r3 == 0) goto L_0x002b
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0037 }
            sx r3 = (p000.C0512sx) r3     // Catch:{ all -> 0x0037 }
            boolean r3 = r3.m8323b(r5)     // Catch:{ all -> 0x0037 }
            if (r3 == 0) goto L_0x0017
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            return
        L_0x002b:
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            if (r1 != 0) goto L_0x002f
            goto L_0x003a
        L_0x002f:
            r0 = 0
            r5.mo229a(r0)
            r1.mo217b()
            return
        L_0x0037:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            throw r5
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0512sx.mo5947a(ahg):void");
    }

    /* renamed from: a */
    public final C0509su mo5942a(Uri uri) {
        C0509su e = mo5950e();
        e.mo5939a(uri);
        return e;
    }

    /* renamed from: a */
    public final C0509su mo5944a(Object obj) {
        C0509su e = mo5950e();
        e.mo5939a(obj);
        return e;
    }

    /* renamed from: a */
    public final C0509su mo5945a(String str) {
        C0509su e = mo5950e();
        e.mo5939a(str);
        return e;
    }

    /* renamed from: c */
    public final synchronized void mo160c() {
        this.f10429g.mo160c();
        for (ahg a : aie.m557a(this.f10429g.f251a)) {
            mo5947a(a);
        }
        this.f10429g.f251a.clear();
        afs afs = this.f10427e;
        for (agm a2 : aie.m557a(afs.f248a)) {
            afs.mo175a(a2);
        }
        afs.f249b.clear();
        this.f10424b.mo156b(this);
        this.f10424b.mo156b(this.f10432j);
        this.f10431i.removeCallbacks(this.f10430h);
        C0497si siVar = this.f10423a;
        synchronized (siVar.f10367f) {
            if (siVar.f10367f.contains(this)) {
                siVar.f10367f.remove(this);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo158a() {
        m8325h();
        this.f10429g.mo158a();
    }

    /* renamed from: b */
    public final synchronized void mo159b() {
        m8324g();
        this.f10429g.mo159b();
    }

    /* renamed from: g */
    private final synchronized void m8324g() {
        afs afs = this.f10427e;
        afs.f250c = true;
        for (agm agm : aie.m557a(afs.f248a)) {
            if (agm.mo221d()) {
                agm.mo219c();
                afs.f249b.add(agm);
            }
        }
    }

    /* renamed from: h */
    private final synchronized void m8325h() {
        afs afs = this.f10427e;
        afs.f250c = false;
        for (agm agm : aie.m557a(afs.f248a)) {
            if (!agm.mo224e() && !agm.mo221d()) {
                agm.mo215a();
            }
        }
        afs.f249b.clear();
    }

    /* renamed from: a */
    public final synchronized void mo5946a(agj agj) {
        m8322b(agj);
    }

    /* renamed from: b */
    private final synchronized void m8322b(agj agj) {
        agj a = agj.clone();
        if (a.f288s) {
            if (!a.f289t) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
        }
        a.f289t = true;
        a.mo214i();
        this.f10433l = a;
    }

    public final synchronized String toString() {
        StringBuilder sb;
        String obj = super.toString();
        String valueOf = String.valueOf(this.f10427e);
        String valueOf2 = String.valueOf(this.f10428f);
        int length = String.valueOf(obj).length();
        sb = new StringBuilder(length + 21 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append(obj);
        sb.append("{tracker=");
        sb.append(valueOf);
        sb.append(", treeNode=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo5948a(ahg ahg, agm agm) {
        this.f10429g.f251a.add(ahg);
        afs afs = this.f10427e;
        afs.f248a.add(agm);
        if (!afs.f250c) {
            agm.mo215a();
            return;
        }
        agm.mo217b();
        afs.f249b.add(agm);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        return true;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean m8323b(p000.ahg r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            agm r0 = r4.mo237d()     // Catch:{ all -> 0x0020 }
            r1 = 1
            if (r0 == 0) goto L_0x001b
            afs r2 = r3.f10427e     // Catch:{ all -> 0x0020 }
            boolean r0 = r2.mo175a(r0)     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x001d
            aft r0 = r3.f10429g     // Catch:{ all -> 0x0020 }
            java.util.Set r0 = r0.f251a     // Catch:{ all -> 0x0020 }
            r0.remove(r4)     // Catch:{ all -> 0x0020 }
            r0 = 0
            r4.mo229a(r0)     // Catch:{ all -> 0x0020 }
        L_0x001b:
            monitor-exit(r3)
            return r1
        L_0x001d:
            r4 = 0
            monitor-exit(r3)
            return r4
        L_0x0020:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0512sx.m8323b(ahg):boolean");
    }
}
