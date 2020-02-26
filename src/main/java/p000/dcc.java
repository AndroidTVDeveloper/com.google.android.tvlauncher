package p000;

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

/* renamed from: dcc */
/* compiled from: PG */
public final class dcc implements cit {

    /* renamed from: a */
    public static final Object f8198a = new Object();

    /* renamed from: b */
    public static dcc f8199b = null;

    /* renamed from: c */
    public final List f8200c;

    /* renamed from: d */
    public final Set f8201d;

    /* renamed from: e */
    public final List f8202e;

    /* renamed from: f */
    public final String f8203f;

    /* renamed from: g */
    public final Context f8204g;

    /* renamed from: h */
    public final Uri f8205h;

    /* renamed from: i */
    public String f8206i;

    /* renamed from: j */
    public final List f8207j;

    /* renamed from: k */
    public final ContentObserver f8208k;

    /* renamed from: l */
    private final czw f8209l;

    /* renamed from: m */
    private long f8210m;

    /* renamed from: a */
    public final void mo2798a(boolean z, Pair pair) {
    }

    private dcc(Context context, String str, Uri uri) {
        Context context2 = null;
        czw a = context != null ? czw.m6037a(context) : null;
        this.f8200c = new ArrayList();
        this.f8201d = new HashSet();
        this.f8202e = new ArrayList();
        this.f8210m = -1;
        this.f8208k = new dbz(this, new Handler());
        this.f8203f = str;
        this.f8204g = context != null ? context.getApplicationContext() : context2;
        this.f8209l = a;
        this.f8205h = uri;
        this.f8207j = new ArrayList(2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.dcc m6108a(android.content.Context r9) {
        /*
            java.lang.Object r0 = p000.dcc.f8198a
            monitor-enter(r0)
            dcc r1 = p000.dcc.f8199b     // Catch:{ all -> 0x007c }
            if (r1 != 0) goto L_0x0078
            dck r1 = p000.dck.m6123a(r9)     // Catch:{ all -> 0x007c }
            java.lang.String r2 = r1.mo4104k()     // Catch:{ all -> 0x007c }
            java.lang.String r3 = p000.dem.m6257b(r2)     // Catch:{ all -> 0x007c }
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
            boolean r2 = p000.dej.m6249a(r9, r4)     // Catch:{ all -> 0x007c }
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
            p000.dcc.f8199b = r9     // Catch:{ all -> 0x007c }
            goto L_0x0078
        L_0x0069:
            java.lang.String r1 = r1.mo4104k()     // Catch:{ all -> 0x007c }
            android.net.Uri r1 = p000.dem.m6256a(r1)     // Catch:{ all -> 0x007c }
            dcc r2 = new dcc     // Catch:{ all -> 0x007c }
            r2.<init>(r9, r4, r1)     // Catch:{ all -> 0x007c }
            p000.dcc.f8199b = r2     // Catch:{ all -> 0x007c }
        L_0x0078:
            monitor-exit(r0)     // Catch:{ all -> 0x007c }
            dcc r9 = p000.dcc.f8199b
            return r9
        L_0x007c:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007c }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dcc.m6108a(android.content.Context):dcc");
    }

    /* renamed from: a */
    public final void mo2796a(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(((chn) arrayList.get(i)).f5563c);
        }
        m6110b(m6109a(this.f8202e, hashSet));
    }

    /* renamed from: d */
    public final void mo2801d() {
        m6110b(m6109a(this.f8202e, dbq.m6093a(this.f8204g).mo2900g()));
    }

    /* renamed from: b */
    public final void mo2799b(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            i++;
            if (this.f8201d.contains(((chn) arrayList.get(i)).f5563c)) {
                this.f8202e.clear();
                this.f8202e.addAll(this.f8200c);
                m6109a(this.f8202e, dbq.m6093a(this.f8204g).mo2900g());
                m6110b(true);
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo4088a(boolean z) {
        if (this.f8204g != null) {
            czw czw = this.f8209l;
            if ((czw == null || !czw.mo4020a()) && this.f8207j.size() > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = this.f8210m;
                if (elapsedRealtime - j > 900000 || j < 0 || z) {
                    this.f8210m = SystemClock.elapsedRealtime();
                    new dca(this, this.f8204g).execute(new Void[0]);
                }
            }
        }
    }

    /* renamed from: a */
    public static final boolean m6109a(List list, Set set) {
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (set.contains(((dby) it.next()).f8193k)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    private final void m6110b(boolean z) {
        if (z) {
            List list = this.f8207j;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((dcb) list.get(i)).mo2852a(this.f8202e);
            }
        }
    }
}
