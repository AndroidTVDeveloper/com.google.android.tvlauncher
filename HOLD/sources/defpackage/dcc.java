package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: dcc  reason: default package */
/* compiled from: PG */
public final class dcc implements cit {
    public static final Object a = new Object();
    public static dcc b = null;
    public final List c;
    public final Set d;
    public final List e;
    public final String f;
    public final Context g;
    public final Uri h;
    public String i;
    public final List j;
    public final ContentObserver k;
    private final czw l;
    private long m;

    public final void a(boolean z, Pair pair) {
    }

    private dcc(Context context, String str, Uri uri) {
        Context context2 = null;
        czw a2 = context != null ? czw.a(context) : null;
        this.c = new ArrayList();
        this.d = new HashSet();
        this.e = new ArrayList();
        this.m = -1;
        this.k = new dbz(this, new Handler());
        this.f = str;
        this.g = context != null ? context.getApplicationContext() : context2;
        this.l = a2;
        this.h = uri;
        this.j = new ArrayList(2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.dcc a(android.content.Context r9) {
        /*
            java.lang.Object r0 = defpackage.dcc.a
            monitor-enter(r0)
            dcc r1 = defpackage.dcc.b     // Catch:{ all -> 0x007c }
            if (r1 != 0) goto L_0x0078
            dck r1 = defpackage.dck.a(r9)     // Catch:{ all -> 0x007c }
            java.lang.String r2 = r1.k()     // Catch:{ all -> 0x007c }
            java.lang.String r3 = defpackage.dem.b(r2)     // Catch:{ all -> 0x007c }
            android.content.pm.PackageManager r4 = r9.getPackageManager()     // Catch:{ all -> 0x007c }
            r5 = 0
            android.content.pm.ProviderInfo r4 = r4.resolveContentProvider(r3, r5)     // Catch:{ all -> 0x007c }
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x007c }
            r7 = 1
            if (r6 != 0) goto L_0x0034
            if (r4 != 0) goto L_0x0034
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ all -> 0x007c }
            r6[r5] = r3     // Catch:{ all -> 0x007c }
            java.lang.String r3 = "OemAppPromotions"
            java.lang.String r8 = "Content provider with authority %s not found"
            java.lang.String r6 = java.lang.String.format(r8, r6)     // Catch:{ all -> 0x007c }
            android.util.Log.w(r3, r6)     // Catch:{ all -> 0x007c }
        L_0x0034:
            r3 = 0
            if (r4 == 0) goto L_0x005e
            java.lang.String r4 = r4.packageName     // Catch:{ all -> 0x007c }
            if (r2 == 0) goto L_0x0054
            boolean r6 = android.text.TextUtils.equals(r4, r2)     // Catch:{ all -> 0x007c }
            if (r6 != 0) goto L_0x0054
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x007c }
            r6[r5] = r2     // Catch:{ all -> 0x007c }
            r6[r7] = r4     // Catch:{ all -> 0x007c }
            java.lang.String r2 = "OemAppPromotions"
            java.lang.String r4 = "Content provider configured with package name (%s) but different content provider was found (%s)"
            java.lang.String r4 = java.lang.String.format(r4, r6)     // Catch:{ all -> 0x007c }
            android.util.Log.e(r2, r4)     // Catch:{ all -> 0x007c }
            goto L_0x005e
        L_0x0054:
            if (r2 != 0) goto L_0x005d
            boolean r2 = defpackage.dej.a(r9, r4)     // Catch:{ all -> 0x007c }
            if (r2 != 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            goto L_0x005f
        L_0x005e:
            r4 = r3
        L_0x005f:
            if (r4 != 0) goto L_0x0069
            dcc r9 = new dcc     // Catch:{ all -> 0x007c }
            r9.<init>(r3, r3, r3)     // Catch:{ all -> 0x007c }
            defpackage.dcc.b = r9     // Catch:{ all -> 0x007c }
            goto L_0x0078
        L_0x0069:
            java.lang.String r1 = r1.k()     // Catch:{ all -> 0x007c }
            android.net.Uri r1 = defpackage.dem.a(r1)     // Catch:{ all -> 0x007c }
            dcc r2 = new dcc     // Catch:{ all -> 0x007c }
            r2.<init>(r9, r4, r1)     // Catch:{ all -> 0x007c }
            defpackage.dcc.b = r2     // Catch:{ all -> 0x007c }
        L_0x0078:
            monitor-exit(r0)     // Catch:{ all -> 0x007c }
            dcc r9 = defpackage.dcc.b
            return r9
        L_0x007c:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007c }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcc.a(android.content.Context):dcc");
    }

    public final void a(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            hashSet.add(((chn) arrayList.get(i2)).c);
        }
        b(a(this.e, hashSet));
    }

    public final void d() {
        b(a(this.e, dbq.a(this.g).g()));
    }

    public final void b(ArrayList arrayList) {
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            i2++;
            if (this.d.contains(((chn) arrayList.get(i2)).c)) {
                this.e.clear();
                this.e.addAll(this.c);
                a(this.e, dbq.a(this.g).g());
                b(true);
                return;
            }
        }
    }

    public final void a(boolean z) {
        if (this.g != null) {
            czw czw = this.l;
            if ((czw == null || !czw.a()) && this.j.size() > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = this.m;
                if (elapsedRealtime - j2 > 900000 || j2 < 0 || z) {
                    this.m = SystemClock.elapsedRealtime();
                    new dca(this, this.g).execute(new Void[0]);
                }
            }
        }
    }

    public static final boolean a(List list, Set set) {
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (set.contains(((dby) it.next()).k)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    private final void b(boolean z) {
        if (z) {
            List list = this.j;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((dcb) list.get(i2)).a(this.e);
            }
        }
    }
}
