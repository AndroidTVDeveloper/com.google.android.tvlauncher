package defpackage;

import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: cja  reason: default package */
/* compiled from: PG */
public final class cja implements chu {
    public final Context a;
    public final cjc b;
    public boolean c;
    public boolean d;
    public AsyncTask e;
    public final chv f;
    public final BroadcastReceiver g;
    public final List h = new LinkedList();
    public final List i = new LinkedList();
    public final List j = new LinkedList();
    public final cip k;
    public chn l;
    public chn m;
    public final ciq n;
    public int o;
    public LocaleList p;
    private boolean q;
    private final List r = new LinkedList();

    public cja(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.p = applicationContext.getResources().getConfiguration().getLocales();
        this.f = new chv(this);
        this.g = new cin();
        cip cip = new cip(this.a);
        this.k = cip;
        a(cip);
        Context context2 = this.a;
        if (cjc.a == null) {
            cjc.a = new cjc(context2);
        }
        this.b = cjc.a;
        this.a.registerComponentCallbacks(new cis(this));
        Context context3 = this.a;
        if (ciq.b == null) {
            synchronized (ciq.class) {
                if (ciq.b == null) {
                    ciq.b = new ciq(context3.getApplicationContext());
                }
            }
        }
        this.n = ciq.b;
    }

    public final void e(chn chn) {
        if (!this.j.contains(chn)) {
            this.i.add(chn);
            if (f(chn.c)) {
                this.l = chn;
            } else if (g(chn.c)) {
                this.m = chn;
            }
        }
    }

    public final void d(chn chn) {
        if (chn != null) {
            String str = chn.c;
            ArrayList arrayList = new ArrayList();
            a(this.j, arrayList, str);
            a(this.i, arrayList, str);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                chn chn2 = (chn) arrayList.get(i2);
                chn2.k = chn.k;
                chn2.m = chn.m;
                chn2.e = chn.e;
                chn2.d = chn.d;
            }
            if (arrayList.isEmpty()) {
                arrayList.add(chn);
            }
            this.j.addAll(arrayList);
            for (cit a2 : this.h) {
                a2.a(arrayList);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x002c A[EDGE_INSN: B:54:0x002c->B:51:0x002c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(java.lang.String r10) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.a(r10, r0)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.MAIN"
            r1.<init>(r2)
            r1.setPackage(r10)
            java.lang.String r2 = "android.intent.category.LEANBACK_LAUNCHER"
            r1.addCategory(r2)
            android.content.Context r2 = r9.a
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            r3 = 129(0x81, float:1.81E-43)
            java.util.List r1 = r2.queryIntentActivities(r1, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r1.iterator()
        L_0x002c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x006d
            java.lang.Object r4 = r3.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ActivityInfo r5 = r4.activityInfo
            if (r5 == 0) goto L_0x002c
            java.util.Iterator r5 = r0.iterator()
        L_0x0040:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x002c
            java.lang.Object r6 = r5.next()
            chn r6 = (defpackage.chn) r6
            boolean r7 = r6.i
            if (r7 == 0) goto L_0x0051
            goto L_0x005d
        L_0x0051:
            java.lang.String r7 = r6.c
            android.content.pm.ActivityInfo r8 = r4.activityInfo
            java.lang.String r8 = r8.packageName
            boolean r7 = android.text.TextUtils.equals(r7, r8)
            if (r7 == 0) goto L_0x0040
        L_0x005d:
            android.content.Context r7 = r9.a
            chn r4 = r9.a(r6, r7, r4)
            r2.add(r4)
            r5.remove()
            r3.remove()
            goto L_0x002c
        L_0x006d:
            android.content.Context r3 = r9.a
            cim r3 = defpackage.cim.a(r3)
            dby r10 = r3.a(r10)
            r3 = 0
            if (r10 == 0) goto L_0x00a3
            java.util.Iterator r4 = r0.iterator()
        L_0x007e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00a3
            java.lang.Object r5 = r4.next()
            chn r5 = (defpackage.chn) r5
            boolean r6 = r5.i
            if (r6 != 0) goto L_0x0098
            java.lang.String r6 = r10.k
            java.lang.String r7 = r5.c
            boolean r6 = android.text.TextUtils.equals(r7, r6)
            if (r6 == 0) goto L_0x007e
        L_0x0098:
            chn r10 = a(r5, r10)
            r2.add(r10)
            r4.remove()
            r10 = r3
        L_0x00a3:
            java.util.Iterator r1 = r1.iterator()
            java.util.Iterator r4 = r0.iterator()
        L_0x00ab:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00d0
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00d0
            java.lang.Object r5 = r4.next()
            chn r5 = (defpackage.chn) r5
            android.content.Context r6 = r9.a
            java.lang.Object r7 = r1.next()
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            chn r5 = r9.a(r5, r6, r7)
            r2.add(r5)
            r4.remove()
            goto L_0x00ab
        L_0x00d0:
            java.util.Iterator r4 = r0.iterator()
            if (r10 == 0) goto L_0x00ed
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00ed
            java.lang.Object r5 = r4.next()
            chn r5 = (defpackage.chn) r5
            chn r10 = a(r5, r10)
            r2.add(r10)
            r4.remove()
            goto L_0x00ee
        L_0x00ed:
            r3 = r10
        L_0x00ee:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x0104
            android.content.Context r10 = r9.a
            java.lang.Object r4 = r1.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            chn r10 = r9.a(r10, r4)
            r2.add(r10)
            goto L_0x00ee
        L_0x0104:
            if (r3 == 0) goto L_0x010d
            chn r10 = a(r3)
            r2.add(r10)
        L_0x010d:
            boolean r10 = r2.isEmpty()
            if (r10 != 0) goto L_0x013c
            int r10 = r2.size()
            r1 = 0
        L_0x0118:
            if (r1 >= r10) goto L_0x0126
            java.lang.Object r3 = r2.get(r1)
            chn r3 = (defpackage.chn) r3
            r9.e(r3)
            int r1 = r1 + 1
            goto L_0x0118
        L_0x0126:
            java.util.List r10 = r9.h
            java.util.Iterator r10 = r10.iterator()
        L_0x012c:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x013c
            java.lang.Object r1 = r10.next()
            cit r1 = (defpackage.cit) r1
            r1.a(r2)
            goto L_0x012c
        L_0x013c:
            r9.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cja.i(java.lang.String):void");
    }

    public final void a(ciw ciw) {
        if (ciw != null) {
            this.r.add(ciw);
        }
    }

    private final chn a(chn chn, Context context, ResolveInfo resolveInfo) {
        chn.b();
        chn.b = resolveInfo.loadLabel(context.getPackageManager());
        chn.c = resolveInfo.activityInfo.packageName;
        try {
            chn.l = context.getPackageManager().getPackageInfo(chn.c, 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf = String.valueOf(chn.c);
            Log.e("LaunchItemsManager", valueOf.length() == 0 ? new String("Package not found when converting to native launch item : ") : "Package not found when converting to native launch item : ".concat(valueOf));
            chn.l = 0;
        }
        int i2 = resolveInfo.activityInfo.applicationInfo.flags;
        int i3 = Build.VERSION.SDK_INT;
        int i4 = resolveInfo.activityInfo.applicationInfo.category;
        boolean z = this.n.a.getBoolean(chn.c, false);
        boolean z2 = true;
        if ((i2 & 33554432) == 0 && i4 != 0 && !z) {
            z2 = false;
        }
        chn.g = z2;
        Intent leanbackLaunchIntentForPackage = this.a.getPackageManager().getLeanbackLaunchIntentForPackage(resolveInfo.activityInfo.packageName);
        if (leanbackLaunchIntentForPackage == null) {
            String valueOf2 = String.valueOf(resolveInfo.toString());
            Log.e("FlavorSpecificLaunchItemsManager", valueOf2.length() == 0 ? new String("Could not find a Leanback intent for resolved info: ") : "Could not find a Leanback intent for resolved info: ".concat(valueOf2));
            leanbackLaunchIntentForPackage = null;
        } else {
            leanbackLaunchIntentForPackage.addFlags(268435456);
        }
        chn.a = leanbackLaunchIntentForPackage;
        chn.j = resolveInfo;
        chn.h = false;
        chn.e = null;
        return chn;
    }

    private static chn a(chn chn, dby dby) {
        chn.b();
        chn.l = 0;
        chn.b = dby.a;
        chn.c = dby.k;
        chn.g = dby.e;
        chn.a = dbk.a(dby.b, dby.d);
        chn.e = dby.c;
        chn.f = dby.d;
        chn.h = true;
        return chn;
    }

    private final void k(String str) {
        if (this.r.size() > 0 && str != null) {
            dck a2 = dck.a(this.a);
            if (str.equalsIgnoreCase("com.google.android.katniss") || (a2 != null && str.equalsIgnoreCase(a2.c))) {
                for (ciw a3 : this.r) {
                    a3.a();
                }
            }
        }
    }

    public static boolean f(String str) {
        return "com.android.vending".equalsIgnoreCase(str);
    }

    public static boolean g(String str) {
        return "com.google.android.play.games".equalsIgnoreCase(str);
    }

    static chn a(dby dby) {
        chn chn = new chn();
        a(chn, dby);
        chn.c();
        return chn;
    }

    /* access modifiers changed from: package-private */
    public final chn a(Context context, ResolveInfo resolveInfo) {
        chn chn = new chn();
        a(chn, context, resolveInfo);
        chn.c();
        return chn;
    }

    private final void a(String str, ArrayList arrayList) {
        a(this.j, arrayList, str);
        a(this.i, arrayList, str);
    }

    public final Set g() {
        HashSet hashSet = new HashSet();
        for (chn chn : this.j) {
            hashSet.add(chn.c);
        }
        for (chn chn2 : this.i) {
            hashSet.add(chn2.c);
        }
        return hashSet;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.j);
        arrayList.addAll(this.i);
        this.b.a(arrayList);
        return arrayList;
    }

    public final ArrayList c() {
        return a(false);
    }

    public final Locale h() {
        return this.p.get(0);
    }

    public final ArrayList b() {
        return a(true);
    }

    public final List f() {
        return this.k.a();
    }

    public final chn h(String str) {
        for (chn chn : this.j) {
            if (chn.c.equalsIgnoreCase(str)) {
                return chn;
            }
        }
        for (chn chn2 : this.i) {
            if (chn2.c.equalsIgnoreCase(str)) {
                return chn2;
            }
        }
        return null;
    }

    private static final void a(List list, ArrayList arrayList, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            chn chn = (chn) it.next();
            if (TextUtils.equals(str, chn.c)) {
                arrayList.add(chn);
                it.remove();
            }
        }
    }

    private static final void a(List list, List list2, boolean z) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            chn chn = (chn) it.next();
            if (z == chn.g) {
                list2.add(chn);
            }
        }
    }

    private final ArrayList a(boolean z) {
        ArrayList arrayList = new ArrayList();
        a(this.j, arrayList, z);
        a(this.i, arrayList, z);
        this.b.a(arrayList);
        return arrayList;
    }

    public final void a() {
        List list;
        if (!this.q) {
            dck a2 = dck.a(this.a);
            cip cip = this.k;
            if (a2.a()) {
                if (!cip.f && (list = a2.e.t) != null && !list.isEmpty()) {
                    int i2 = 0;
                    while (i2 < list.size() && i2 < 10) {
                        cip.b.put((String) list.get(i2), Integer.valueOf(i2));
                        i2++;
                    }
                    if (cip.c.getAll().isEmpty()) {
                        SharedPreferences.Editor edit = cip.c.edit();
                        edit.clear();
                        for (String str : cip.b.keySet()) {
                            edit.putInt(str, ((Integer) cip.b.get(str)).intValue());
                        }
                        edit.apply();
                    }
                }
                if (dhz.a(cip.d)) {
                    cip.g = new HashMap();
                    List list2 = a2.e.x;
                    for (int i3 = 0; i3 < list2.size(); i3++) {
                        cip.g.put((String) list2.get(i3), Integer.valueOf(i3));
                    }
                    cip.h = new chn[cip.g.size()];
                }
            }
            cjc cjc = this.b;
            if (a2.a()) {
                cjc.c.clear();
                SharedPreferences.Editor edit2 = cjc.d.edit();
                if (cjc.e) {
                    cjc.a();
                }
                cjc.a(edit2, a2.e.u, 20);
                cjc.a(edit2, a2.e.v, 10);
                edit2.apply();
            }
            this.q = true;
        }
    }

    public final boolean b(chn chn) {
        cip cip = this.k;
        return cip.a.containsKey(chn) || cip.c(chn);
    }

    public final boolean c(chn chn) {
        return this.k.c(chn);
    }

    private final void a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            for (cit b2 : this.h) {
                b2.b(arrayList);
            }
            cjc cjc = this.b;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                chn chn = (chn) arrayList.get(i2);
                cjc.b.remove(chn.c);
                SharedPreferences.Editor edit = cjc.d.edit();
                edit.remove(chn.c);
                edit.apply();
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cja.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      cja.a(chn, android.content.Context, android.content.pm.ResolveInfo):chn
      cja.a(java.util.List, java.util.ArrayList, java.lang.String):void
      cja.a(java.util.List, java.util.List, boolean):void
      cja.a(android.content.Context, java.lang.String, boolean):void */
    public final void a(String str) {
        i(str);
        a(this.a, str, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cja.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      cja.a(chn, android.content.Context, android.content.pm.ResolveInfo):chn
      cja.a(java.util.List, java.util.ArrayList, java.lang.String):void
      cja.a(java.util.List, java.util.List, boolean):void
      cja.a(android.content.Context, java.lang.String, boolean):void */
    public final void b(String str) {
        i(str);
        a(this.a, str, false);
        k(str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cja.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      cja.a(chn, android.content.Context, android.content.pm.ResolveInfo):chn
      cja.a(java.util.List, java.util.ArrayList, java.lang.String):void
      cja.a(java.util.List, java.util.List, boolean):void
      cja.a(android.content.Context, java.lang.String, boolean):void */
    public final void c(String str) {
        j(str);
        a(this.a, str, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cja.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      cja.a(chn, android.content.Context, android.content.pm.ResolveInfo):chn
      cja.a(java.util.List, java.util.ArrayList, java.lang.String):void
      cja.a(java.util.List, java.util.List, boolean):void
      cja.a(android.content.Context, java.lang.String, boolean):void */
    public final void d(String str) {
        j(str);
        a(this.a, str, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cja.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      cja.a(chn, android.content.Context, android.content.pm.ResolveInfo):chn
      cja.a(java.util.List, java.util.ArrayList, java.lang.String):void
      cja.a(java.util.List, java.util.List, boolean):void
      cja.a(android.content.Context, java.lang.String, boolean):void */
    public final void e(String str) {
        i(str);
        a(this.a, str, false);
        k(str);
    }

    public final void e() {
        this.d = false;
        AsyncTask asyncTask = this.e;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
        this.e = new ciu(this).execute(new Void[0]);
    }

    public final void a(cit cit) {
        if (!this.h.contains(cit)) {
            this.h.add(cit);
        }
    }

    public final void a(chn chn) {
        cip cip = this.k;
        cip.c();
        cip.b(chn);
        cip.a(cip.b());
    }

    public final void a(chn chn, boolean z) {
        if (chn != null && !z) {
            i(chn.c);
        }
    }

    public final void j(String str) {
        ArrayList arrayList = new ArrayList();
        a(str, arrayList);
        a(arrayList);
        k(str);
        this.n.a.edit().remove(str).apply();
    }

    public final void b(ciw ciw) {
        this.r.remove(ciw);
    }

    private static final void a(Context context, String str, boolean z) {
        synchronized (dck.b) {
            if (dck.a != null && !TextUtils.isEmpty(str) && str.equals(dck.a.c) && z) {
                dck dck = dck.a;
                dck.c = null;
                dck.d = null;
                for (dci c2 : dck.f) {
                    c2.c();
                }
            }
        }
        synchronized (dcc.a) {
            if (dcc.b != null && !TextUtils.isEmpty(str) && str.equals(dcc.b.f)) {
                dcc.a(context).a(true);
            }
        }
    }

    public final void a(List list) {
        this.b.b(list);
    }

    public final void i() {
        this.k.c();
        this.b.c(d());
        ((JobScheduler) this.a.getSystemService(JobScheduler.class)).cancel(1);
    }

    public final void b(cit cit) {
        this.h.remove(cit);
    }
}
