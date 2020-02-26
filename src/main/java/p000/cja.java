package p000;

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

/* renamed from: cja */
/* compiled from: PG */
public final class cja implements chu {

    /* renamed from: a */
    public final Context f5679a;

    /* renamed from: b */
    public final cjc f5680b;

    /* renamed from: c */
    public boolean f5681c;

    /* renamed from: d */
    public boolean f5682d;

    /* renamed from: e */
    public AsyncTask f5683e;

    /* renamed from: f */
    public final chv f5684f;

    /* renamed from: g */
    public final BroadcastReceiver f5685g;

    /* renamed from: h */
    public final List f5686h = new LinkedList();

    /* renamed from: i */
    public final List f5687i = new LinkedList();

    /* renamed from: j */
    public final List f5688j = new LinkedList();

    /* renamed from: k */
    public final cip f5689k;

    /* renamed from: l */
    public chn f5690l;

    /* renamed from: m */
    public chn f5691m;

    /* renamed from: n */
    public final ciq f5692n;

    /* renamed from: o */
    public int f5693o;

    /* renamed from: p */
    public LocaleList f5694p;

    /* renamed from: q */
    private boolean f5695q;

    /* renamed from: r */
    private final List f5696r = new LinkedList();

    public cja(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f5679a = applicationContext;
        this.f5694p = applicationContext.getResources().getConfiguration().getLocales();
        this.f5684f = new chv(this);
        this.f5685g = new cin();
        cip cip = new cip(this.f5679a);
        this.f5689k = cip;
        mo2886a(cip);
        Context context2 = this.f5679a;
        if (cjc.f5698a == null) {
            cjc.f5698a = new cjc(context2);
        }
        this.f5680b = cjc.f5698a;
        this.f5679a.registerComponentCallbacks(new cis(this));
        Context context3 = this.f5679a;
        if (ciq.f5663b == null) {
            synchronized (ciq.class) {
                if (ciq.f5663b == null) {
                    ciq.f5663b = new ciq(context3.getApplicationContext());
                }
            }
        }
        this.f5692n = ciq.f5663b;
    }

    /* renamed from: e */
    public final void mo2898e(chn chn) {
        if (!this.f5688j.contains(chn)) {
            this.f5687i.add(chn);
            if (m4854f(chn.f5563c)) {
                this.f5690l = chn;
            } else if (m4855g(chn.f5563c)) {
                this.f5691m = chn;
            }
        }
    }

    /* renamed from: d */
    public final void mo2896d(chn chn) {
        if (chn != null) {
            String str = chn.f5563c;
            ArrayList arrayList = new ArrayList();
            m4852a(this.f5688j, arrayList, str);
            m4852a(this.f5687i, arrayList, str);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                chn chn2 = (chn) arrayList.get(i);
                chn2.f5571k = chn.f5571k;
                chn2.f5573m = chn.f5573m;
                chn2.f5565e = chn.f5565e;
                chn2.f5564d = chn.f5564d;
            }
            if (arrayList.isEmpty()) {
                arrayList.add(chn);
            }
            this.f5688j.addAll(arrayList);
            for (cit a : this.f5686h) {
                a.mo2796a(arrayList);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x002c A[EDGE_INSN: B:54:0x002c->B:51:0x002c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0046  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2904i(java.lang.String r10) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.m4850a(r10, r0)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.MAIN"
            r1.<init>(r2)
            r1.setPackage(r10)
            java.lang.String r2 = "android.intent.category.LEANBACK_LAUNCHER"
            r1.addCategory(r2)
            android.content.Context r2 = r9.f5679a
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
            chn r6 = (p000.chn) r6
            boolean r7 = r6.f5569i
            if (r7 == 0) goto L_0x0051
            goto L_0x005d
        L_0x0051:
            java.lang.String r7 = r6.f5563c
            android.content.pm.ActivityInfo r8 = r4.activityInfo
            java.lang.String r8 = r8.packageName
            boolean r7 = android.text.TextUtils.equals(r7, r8)
            if (r7 == 0) goto L_0x0040
        L_0x005d:
            android.content.Context r7 = r9.f5679a
            chn r4 = r9.m4845a(r6, r7, r4)
            r2.add(r4)
            r5.remove()
            r3.remove()
            goto L_0x002c
        L_0x006d:
            android.content.Context r3 = r9.f5679a
            cim r3 = p000.cim.m4816a(r3)
            dby r10 = r3.mo2862a(r10)
            r3 = 0
            if (r10 == 0) goto L_0x00a3
            java.util.Iterator r4 = r0.iterator()
        L_0x007e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00a3
            java.lang.Object r5 = r4.next()
            chn r5 = (p000.chn) r5
            boolean r6 = r5.f5569i
            if (r6 != 0) goto L_0x0098
            java.lang.String r6 = r10.f8193k
            java.lang.String r7 = r5.f5563c
            boolean r6 = android.text.TextUtils.equals(r7, r6)
            if (r6 == 0) goto L_0x007e
        L_0x0098:
            chn r10 = m4846a(r5, r10)
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
            chn r5 = (p000.chn) r5
            android.content.Context r6 = r9.f5679a
            java.lang.Object r7 = r1.next()
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            chn r5 = r9.m4845a(r5, r6, r7)
            r2.add(r5)
            r4.remove()
            goto L_0x00ab
        L_0x00d0:
            java.util.Iterator r4 = r0.iterator()
            if (r10 == 0) goto L_0x00ed
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00ed
            java.lang.Object r5 = r4.next()
            chn r5 = (p000.chn) r5
            chn r10 = m4846a(r5, r10)
            r2.add(r10)
            r4.remove()
            goto L_0x00ee
        L_0x00ed:
            r3 = r10
        L_0x00ee:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x0104
            android.content.Context r10 = r9.f5679a
            java.lang.Object r4 = r1.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            chn r10 = r9.mo2882a(r10, r4)
            r2.add(r10)
            goto L_0x00ee
        L_0x0104:
            if (r3 == 0) goto L_0x010d
            chn r10 = m4847a(r3)
            r2.add(r10)
        L_0x010d:
            boolean r10 = r2.isEmpty()
            if (r10 != 0) goto L_0x013c
            int r10 = r2.size()
            r1 = 0
        L_0x0118:
            if (r1 >= r10) goto L_0x0126
            java.lang.Object r3 = r2.get(r1)
            chn r3 = (p000.chn) r3
            r9.mo2898e(r3)
            int r1 = r1 + 1
            goto L_0x0118
        L_0x0126:
            java.util.List r10 = r9.f5686h
            java.util.Iterator r10 = r10.iterator()
        L_0x012c:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x013c
            java.lang.Object r1 = r10.next()
            cit r1 = (p000.cit) r1
            r1.mo2796a(r2)
            goto L_0x012c
        L_0x013c:
            r9.m4851a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cja.mo2904i(java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo2887a(ciw ciw) {
        if (ciw != null) {
            this.f5696r.add(ciw);
        }
    }

    /* renamed from: a */
    private final chn m4845a(chn chn, Context context, ResolveInfo resolveInfo) {
        chn.mo2813b();
        chn.f5562b = resolveInfo.loadLabel(context.getPackageManager());
        chn.f5563c = resolveInfo.activityInfo.packageName;
        try {
            chn.f5572l = context.getPackageManager().getPackageInfo(chn.f5563c, 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(chn.f5563c);
            Log.e("LaunchItemsManager", valueOf.length() == 0 ? new String("Package not found when converting to native launch item : ") : "Package not found when converting to native launch item : ".concat(valueOf));
            chn.f5572l = 0;
        }
        int i = resolveInfo.activityInfo.applicationInfo.flags;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = resolveInfo.activityInfo.applicationInfo.category;
        boolean z = this.f5692n.f5664a.getBoolean(chn.f5563c, false);
        boolean z2 = true;
        if ((i & 33554432) == 0 && i3 != 0 && !z) {
            z2 = false;
        }
        chn.f5567g = z2;
        Intent leanbackLaunchIntentForPackage = this.f5679a.getPackageManager().getLeanbackLaunchIntentForPackage(resolveInfo.activityInfo.packageName);
        if (leanbackLaunchIntentForPackage == null) {
            String valueOf2 = String.valueOf(resolveInfo.toString());
            Log.e("FlavorSpecificLaunchItemsManager", valueOf2.length() == 0 ? new String("Could not find a Leanback intent for resolved info: ") : "Could not find a Leanback intent for resolved info: ".concat(valueOf2));
            leanbackLaunchIntentForPackage = null;
        } else {
            leanbackLaunchIntentForPackage.addFlags(268435456);
        }
        chn.f5561a = leanbackLaunchIntentForPackage;
        chn.f5570j = resolveInfo;
        chn.f5568h = false;
        chn.f5565e = null;
        return chn;
    }

    /* renamed from: a */
    private static chn m4846a(chn chn, dby dby) {
        chn.mo2813b();
        chn.f5572l = 0;
        chn.f5562b = dby.f8183a;
        chn.f5563c = dby.f8193k;
        chn.f5567g = dby.f8187e;
        chn.f5561a = dbk.m6088a(dby.f8184b, dby.f8186d);
        chn.f5565e = dby.f8185c;
        chn.f5566f = dby.f8186d;
        chn.f5568h = true;
        return chn;
    }

    /* renamed from: k */
    private final void m4856k(String str) {
        if (this.f5696r.size() > 0 && str != null) {
            dck a = dck.m6123a(this.f5679a);
            if (str.equalsIgnoreCase("com.google.android.katniss") || (a != null && str.equalsIgnoreCase(a.f8226c))) {
                for (ciw a2 : this.f5696r) {
                    a2.mo2879a();
                }
            }
        }
    }

    /* renamed from: f */
    public static boolean m4854f(String str) {
        return "com.android.vending".equalsIgnoreCase(str);
    }

    /* renamed from: g */
    public static boolean m4855g(String str) {
        return "com.google.android.play.games".equalsIgnoreCase(str);
    }

    /* renamed from: a */
    static chn m4847a(dby dby) {
        chn chn = new chn();
        m4846a(chn, dby);
        chn.mo2814c();
        return chn;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final chn mo2882a(Context context, ResolveInfo resolveInfo) {
        chn chn = new chn();
        m4845a(chn, context, resolveInfo);
        chn.mo2814c();
        return chn;
    }

    /* renamed from: a */
    private final void m4850a(String str, ArrayList arrayList) {
        m4852a(this.f5688j, arrayList, str);
        m4852a(this.f5687i, arrayList, str);
    }

    /* renamed from: g */
    public final Set mo2900g() {
        HashSet hashSet = new HashSet();
        for (chn chn : this.f5688j) {
            hashSet.add(chn.f5563c);
        }
        for (chn chn2 : this.f5687i) {
            hashSet.add(chn2.f5563c);
        }
        return hashSet;
    }

    /* renamed from: d */
    public final ArrayList mo2895d() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f5688j);
        arrayList.addAll(this.f5687i);
        this.f5680b.mo2909a(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public final ArrayList mo2893c() {
        return m4848a(false);
    }

    /* renamed from: h */
    public final Locale mo2902h() {
        return this.f5694p.get(0);
    }

    /* renamed from: b */
    public final ArrayList mo2889b() {
        return m4848a(true);
    }

    /* renamed from: f */
    public final List mo2899f() {
        return this.f5689k.mo2865a();
    }

    /* renamed from: h */
    public final chn mo2901h(String str) {
        for (chn chn : this.f5688j) {
            if (chn.f5563c.equalsIgnoreCase(str)) {
                return chn;
            }
        }
        for (chn chn2 : this.f5687i) {
            if (chn2.f5563c.equalsIgnoreCase(str)) {
                return chn2;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static final void m4852a(List list, ArrayList arrayList, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            chn chn = (chn) it.next();
            if (TextUtils.equals(str, chn.f5563c)) {
                arrayList.add(chn);
                it.remove();
            }
        }
    }

    /* renamed from: a */
    private static final void m4853a(List list, List list2, boolean z) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            chn chn = (chn) it.next();
            if (z == chn.f5567g) {
                list2.add(chn);
            }
        }
    }

    /* renamed from: a */
    private final ArrayList m4848a(boolean z) {
        ArrayList arrayList = new ArrayList();
        m4853a(this.f5688j, arrayList, z);
        m4853a(this.f5687i, arrayList, z);
        this.f5680b.mo2909a(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public final void mo2883a() {
        List list;
        if (!this.f5695q) {
            dck a = dck.m6123a(this.f5679a);
            cip cip = this.f5689k;
            if (a.mo4092a()) {
                if (!cip.f5657f && (list = a.f8228e.f8285t) != null && !list.isEmpty()) {
                    int i = 0;
                    while (i < list.size() && i < 10) {
                        cip.f5653b.put((String) list.get(i), Integer.valueOf(i));
                        i++;
                    }
                    if (cip.f5654c.getAll().isEmpty()) {
                        SharedPreferences.Editor edit = cip.f5654c.edit();
                        edit.clear();
                        for (String str : cip.f5653b.keySet()) {
                            edit.putInt(str, ((Integer) cip.f5653b.get(str)).intValue());
                        }
                        edit.apply();
                    }
                }
                if (dhz.m6481a(cip.f5655d)) {
                    cip.f5658g = new HashMap();
                    List list2 = a.f8228e.f8289x;
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        cip.f5658g.put((String) list2.get(i2), Integer.valueOf(i2));
                    }
                    cip.f5659h = new chn[cip.f5658g.size()];
                }
            }
            cjc cjc = this.f5680b;
            if (a.mo4092a()) {
                cjc.f5700c.clear();
                SharedPreferences.Editor edit2 = cjc.f5701d.edit();
                if (cjc.f5702e) {
                    cjc.mo2907a();
                }
                cjc.mo2908a(edit2, a.f8228e.f8286u, 20);
                cjc.mo2908a(edit2, a.f8228e.f8287v, 10);
                edit2.apply();
            }
            this.f5695q = true;
        }
    }

    /* renamed from: b */
    public final boolean mo2892b(chn chn) {
        cip cip = this.f5689k;
        return cip.f5652a.containsKey(chn) || cip.mo2871c(chn);
    }

    /* renamed from: c */
    public final boolean mo2894c(chn chn) {
        return this.f5689k.mo2871c(chn);
    }

    /* renamed from: a */
    private final void m4851a(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            for (cit b : this.f5686h) {
                b.mo2799b(arrayList);
            }
            cjc cjc = this.f5680b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                chn chn = (chn) arrayList.get(i);
                cjc.f5699b.remove(chn.f5563c);
                SharedPreferences.Editor edit = cjc.f5701d.edit();
                edit.remove(chn.f5563c);
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
    /* renamed from: a */
    public final void mo2827a(String str) {
        mo2904i(str);
        m4849a(this.f5679a, str, false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cja.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      cja.a(chn, android.content.Context, android.content.pm.ResolveInfo):chn
      cja.a(java.util.List, java.util.ArrayList, java.lang.String):void
      cja.a(java.util.List, java.util.List, boolean):void
      cja.a(android.content.Context, java.lang.String, boolean):void */
    /* renamed from: b */
    public final void mo2828b(String str) {
        mo2904i(str);
        m4849a(this.f5679a, str, false);
        m4856k(str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cja.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      cja.a(chn, android.content.Context, android.content.pm.ResolveInfo):chn
      cja.a(java.util.List, java.util.ArrayList, java.lang.String):void
      cja.a(java.util.List, java.util.List, boolean):void
      cja.a(android.content.Context, java.lang.String, boolean):void */
    /* renamed from: c */
    public final void mo2829c(String str) {
        mo2905j(str);
        m4849a(this.f5679a, str, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cja.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      cja.a(chn, android.content.Context, android.content.pm.ResolveInfo):chn
      cja.a(java.util.List, java.util.ArrayList, java.lang.String):void
      cja.a(java.util.List, java.util.List, boolean):void
      cja.a(android.content.Context, java.lang.String, boolean):void */
    /* renamed from: d */
    public final void mo2830d(String str) {
        mo2905j(str);
        m4849a(this.f5679a, str, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cja.a(android.content.Context, java.lang.String, boolean):void
     arg types: [android.content.Context, java.lang.String, int]
     candidates:
      cja.a(chn, android.content.Context, android.content.pm.ResolveInfo):chn
      cja.a(java.util.List, java.util.ArrayList, java.lang.String):void
      cja.a(java.util.List, java.util.List, boolean):void
      cja.a(android.content.Context, java.lang.String, boolean):void */
    /* renamed from: e */
    public final void mo2831e(String str) {
        mo2904i(str);
        m4849a(this.f5679a, str, false);
        m4856k(str);
    }

    /* renamed from: e */
    public final void mo2897e() {
        this.f5682d = false;
        AsyncTask asyncTask = this.f5683e;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
        this.f5683e = new ciu(this).execute(new Void[0]);
    }

    /* renamed from: a */
    public final void mo2886a(cit cit) {
        if (!this.f5686h.contains(cit)) {
            this.f5686h.add(cit);
        }
    }

    /* renamed from: a */
    public final void mo2884a(chn chn) {
        cip cip = this.f5689k;
        cip.mo2870c();
        cip.mo2868b(chn);
        cip.mo2867a(cip.mo2869b());
    }

    /* renamed from: a */
    public final void mo2885a(chn chn, boolean z) {
        if (chn != null && !z) {
            mo2904i(chn.f5563c);
        }
    }

    /* renamed from: j */
    public final void mo2905j(String str) {
        ArrayList arrayList = new ArrayList();
        m4850a(str, arrayList);
        m4851a(arrayList);
        m4856k(str);
        this.f5692n.f5664a.edit().remove(str).apply();
    }

    /* renamed from: b */
    public final void mo2891b(ciw ciw) {
        this.f5696r.remove(ciw);
    }

    /* renamed from: a */
    private static final void m4849a(Context context, String str, boolean z) {
        synchronized (dck.f8225b) {
            if (dck.f8224a != null && !TextUtils.isEmpty(str) && str.equals(dck.f8224a.f8226c) && z) {
                dck dck = dck.f8224a;
                dck.f8226c = null;
                dck.f8227d = null;
                for (dci c : dck.f8229f) {
                    c.mo3628c();
                }
            }
        }
        synchronized (dcc.f8198a) {
            if (dcc.f8199b != null && !TextUtils.isEmpty(str) && str.equals(dcc.f8199b.f8203f)) {
                dcc.m6108a(context).mo4088a(true);
            }
        }
    }

    /* renamed from: a */
    public final void mo2888a(List list) {
        this.f5680b.mo2911b(list);
    }

    /* renamed from: i */
    public final void mo2903i() {
        this.f5689k.mo2870c();
        this.f5680b.mo2912c(mo2895d());
        ((JobScheduler) this.f5679a.getSystemService(JobScheduler.class)).cancel(1);
    }

    /* renamed from: b */
    public final void mo2890b(cit cit) {
        this.f5686h.remove(cit);
    }
}
