package p000;

import android.content.pm.ResolveInfo;

/* renamed from: czf */
/* compiled from: PG */
final class czf implements Comparable {

    /* renamed from: a */
    public final String f7964a;

    /* renamed from: b */
    public CharSequence f7965b;

    /* renamed from: c */
    public cxs f7966c;

    /* renamed from: d */
    public ResolveInfo f7967d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public czf(java.lang.String r4, p000.cxs r5, android.content.pm.ApplicationInfo r6, android.content.pm.PackageManager r7) {
        /*
            r3 = this;
            java.lang.CharSequence r6 = r7.getApplicationLabel(r6)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.MAIN"
            r0.<init>(r1)
            android.content.Intent r1 = r0.setPackage(r4)
            java.lang.String r2 = "android.intent.category.LEANBACK_LAUNCHER"
            r1.addCategory(r2)
            r1 = 1
            java.util.List r7 = r7.queryIntentActivities(r0, r1)
            r0 = 0
            if (r7 == 0) goto L_0x002c
            int r1 = r7.size()
            if (r1 <= 0) goto L_0x002b
            r0 = 0
            java.lang.Object r7 = r7.get(r0)
            r0 = r7
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            goto L_0x002d
        L_0x002b:
        L_0x002c:
        L_0x002d:
            r3.<init>(r4, r5, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.czf.<init>(java.lang.String, cxs, android.content.pm.ApplicationInfo, android.content.pm.PackageManager):void");
    }

    public czf(String str, cxs cxs, CharSequence charSequence, ResolveInfo resolveInfo) {
        this.f7964a = str;
        this.f7966c = cxs;
        this.f7965b = charSequence;
        this.f7967d = resolveInfo;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        czf czf = (czf) obj;
        CharSequence charSequence = this.f7965b;
        if (charSequence == null) {
            return czf.f7965b == null ? 0 : 1;
        }
        return charSequence.toString().compareToIgnoreCase(czf.f7965b.toString());
    }
}
