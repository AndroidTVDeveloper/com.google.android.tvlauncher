package defpackage;

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

/* renamed from: sx  reason: default package */
/* compiled from: PG */
public final class sx implements ComponentCallbacks2, afk {
    private static final agj k;
    public final si a;
    public final afj b;
    public final CopyOnWriteArrayList c;
    private final Context d;
    private final afs e;
    private final afr f;
    private final aft g = new aft();
    private final Runnable h = new sv(this);
    private final Handler i = new Handler(Looper.getMainLooper());
    private final afd j;
    private agj l;

    static {
        agj a2 = agj.a(Bitmap.class);
        a2.i();
        k = a2;
        agj.a(aeh.class).i();
        agj.b(vy.b).a(sm.LOW).g();
    }

    /* access modifiers changed from: package-private */
    public final synchronized agj f() {
        return this.l;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i2) {
    }

    public sx(si siVar, afj afj, afr afr, Context context) {
        afd afd;
        afs afs = new afs();
        this.a = siVar;
        this.b = afj;
        this.f = afr;
        this.e = afs;
        this.d = context;
        Context applicationContext = context.getApplicationContext();
        sw swVar = new sw(this, afs);
        if (applicationContext.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) != 0) {
            afd = new afl();
        } else {
            afd = new afg(applicationContext, swVar);
        }
        this.j = afd;
        if (aie.c()) {
            this.i.post(this.h);
        } else {
            afj.a(this);
        }
        afj.a(this.j);
        this.c = new CopyOnWriteArrayList(siVar.b.d);
        b(siVar.b.a());
        synchronized (siVar.f) {
            if (!siVar.f.contains(this)) {
                siVar.f.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public final su a(Class cls) {
        return new su(this.a, this, cls, this.d);
    }

    public final su d() {
        return a(Bitmap.class).b(k);
    }

    public final su e() {
        return a(Drawable.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r1 != null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        r5.a((defpackage.agm) null);
        r1.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.ahg r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x003a
            boolean r0 = r4.b(r5)
            agm r1 = r5.d()
            if (r0 != 0) goto L_0x003a
            si r0 = r4.a
            java.util.List r2 = r0.f
            monitor-enter(r2)
            java.util.List r0 = r0.f     // Catch:{ all -> 0x0037 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0037 }
        L_0x0017:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0037 }
            if (r3 == 0) goto L_0x002b
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0037 }
            sx r3 = (defpackage.sx) r3     // Catch:{ all -> 0x0037 }
            boolean r3 = r3.b(r5)     // Catch:{ all -> 0x0037 }
            if (r3 == 0) goto L_0x0017
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            return
        L_0x002b:
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            if (r1 != 0) goto L_0x002f
            goto L_0x003a
        L_0x002f:
            r0 = 0
            r5.a(r0)
            r1.b()
            return
        L_0x0037:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0037 }
            throw r5
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sx.a(ahg):void");
    }

    public final su a(Uri uri) {
        su e2 = e();
        e2.a(uri);
        return e2;
    }

    public final su a(Object obj) {
        su e2 = e();
        e2.a(obj);
        return e2;
    }

    public final su a(String str) {
        su e2 = e();
        e2.a(str);
        return e2;
    }

    public final synchronized void c() {
        this.g.c();
        for (ahg a2 : aie.a(this.g.a)) {
            a(a2);
        }
        this.g.a.clear();
        afs afs = this.e;
        for (agm a3 : aie.a(afs.a)) {
            afs.a(a3);
        }
        afs.b.clear();
        this.b.b(this);
        this.b.b(this.j);
        this.i.removeCallbacks(this.h);
        si siVar = this.a;
        synchronized (siVar.f) {
            if (siVar.f.contains(this)) {
                siVar.f.remove(this);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    public final synchronized void a() {
        h();
        this.g.a();
    }

    public final synchronized void b() {
        g();
        this.g.b();
    }

    private final synchronized void g() {
        afs afs = this.e;
        afs.c = true;
        for (agm agm : aie.a(afs.a)) {
            if (agm.d()) {
                agm.c();
                afs.b.add(agm);
            }
        }
    }

    private final synchronized void h() {
        afs afs = this.e;
        afs.c = false;
        for (agm agm : aie.a(afs.a)) {
            if (!agm.e() && !agm.d()) {
                agm.a();
            }
        }
        afs.b.clear();
    }

    public final synchronized void a(agj agj) {
        b(agj);
    }

    private final synchronized void b(agj agj) {
        agj a2 = agj.clone();
        if (a2.s) {
            if (!a2.t) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
        }
        a2.t = true;
        a2.i();
        this.l = a2;
    }

    public final synchronized String toString() {
        StringBuilder sb;
        String obj = super.toString();
        String valueOf = String.valueOf(this.e);
        String valueOf2 = String.valueOf(this.f);
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
    public final synchronized void a(ahg ahg, agm agm) {
        this.g.a.add(ahg);
        afs afs = this.e;
        afs.a.add(agm);
        if (!afs.c) {
            agm.a();
            return;
        }
        agm.b();
        afs.b.add(agm);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean b(defpackage.ahg r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            agm r0 = r4.d()     // Catch:{ all -> 0x0020 }
            r1 = 1
            if (r0 == 0) goto L_0x001b
            afs r2 = r3.e     // Catch:{ all -> 0x0020 }
            boolean r0 = r2.a(r0)     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x001d
            aft r0 = r3.g     // Catch:{ all -> 0x0020 }
            java.util.Set r0 = r0.a     // Catch:{ all -> 0x0020 }
            r0.remove(r4)     // Catch:{ all -> 0x0020 }
            r0 = 0
            r4.a(r0)     // Catch:{ all -> 0x0020 }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sx.b(ahg):boolean");
    }
}
