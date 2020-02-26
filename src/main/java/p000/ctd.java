package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ctd */
/* compiled from: PG */
public final class ctd {

    /* renamed from: c */
    private static ctd f7335c;

    /* renamed from: a */
    public final Context f7336a;

    /* renamed from: b */
    public final List f7337b = new ArrayList();

    /* renamed from: d */
    private boolean f7338d;

    private ctd(Context context) {
        this.f7336a = context;
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0668 A[Catch:{ all -> 0x08fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x08ff A[SYNTHETIC, Splitter:B:407:0x08ff] */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0938 A[Catch:{ NameNotFoundException -> 0x0046, all -> 0x094f }] */
    /* JADX WARNING: Removed duplicated region for block: B:423:0x0942 A[Catch:{ NameNotFoundException -> 0x0046, all -> 0x094f }] */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x0908 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3730a() {
        /*
            r24 = this;
            r1 = r24
            boolean r2 = r1.f7338d
            if (r2 != 0) goto L_0x0953
            monitor-enter(r24)
            boolean r2 = r1.f7338d     // Catch:{ all -> 0x094f }
            if (r2 != 0) goto L_0x094d
            java.util.List r2 = r1.f7337b     // Catch:{ all -> 0x094f }
            r2.clear()     // Catch:{ all -> 0x094f }
            android.content.Context r2 = r1.f7336a     // Catch:{ all -> 0x094f }
            java.lang.String r3 = "tv_input"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch:{ all -> 0x094f }
            android.media.tv.TvInputManager r2 = (android.media.tv.TvInputManager) r2     // Catch:{ all -> 0x094f }
            cte r3 = new cte     // Catch:{ all -> 0x094f }
            android.content.Context r4 = r1.f7336a     // Catch:{ all -> 0x094f }
            r3.<init>(r4)     // Catch:{ all -> 0x094f }
            java.util.List r2 = r2.getTvContentRatingSystemList()     // Catch:{ all -> 0x094f }
            boolean r4 = r2.isEmpty()     // Catch:{ all -> 0x094f }
            r5 = 0
            if (r4 == 0) goto L_0x006c
            android.content.Context r4 = r1.f7336a     // Catch:{ NameNotFoundException -> 0x0046 }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0046 }
            android.content.Context r6 = r1.f7336a     // Catch:{ NameNotFoundException -> 0x0046 }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ NameNotFoundException -> 0x0046 }
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r6, r5)     // Catch:{ NameNotFoundException -> 0x0046 }
            r6 = 2132148224(0x7f160000, float:1.993842E38)
            android.media.tv.TvContentRatingSystemInfo r4 = android.media.tv.TvContentRatingSystemInfo.createTvContentRatingSystemInfo(r6, r4)     // Catch:{ NameNotFoundException -> 0x0046 }
            r2.add(r4)     // Catch:{ NameNotFoundException -> 0x0046 }
            goto L_0x006c
        L_0x0046:
            r0 = move-exception
            r4 = r0
            java.lang.String r6 = "ContentRatingsManager"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x094f }
            java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x094f }
            int r7 = r7.length()     // Catch:{ all -> 0x094f }
            int r7 = r7 + 65
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x094f }
            r8.<init>(r7)     // Catch:{ all -> 0x094f }
            java.lang.String r7 = "Can't retrieve content ratings, failed to load application info: "
            r8.append(r7)     // Catch:{ all -> 0x094f }
            r8.append(r4)     // Catch:{ all -> 0x094f }
            java.lang.String r4 = r8.toString()     // Catch:{ all -> 0x094f }
            android.util.Log.e(r6, r4)     // Catch:{ all -> 0x094f }
        L_0x006c:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x094f }
        L_0x0070:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x094f }
            r6 = 1
            if (r4 == 0) goto L_0x0947
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x094f }
            android.media.tv.TvContentRatingSystemInfo r4 = (android.media.tv.TvContentRatingSystemInfo) r4     // Catch:{ all -> 0x094f }
            android.net.Uri r7 = r4.getXmlUri()     // Catch:{ all -> 0x094f }
            r8 = 0
            java.lang.String r9 = r7.getAuthority()     // Catch:{ Exception -> 0x090b }
            long r10 = android.content.ContentUris.parseId(r7)     // Catch:{ Exception -> 0x090b }
            int r11 = (int) r10     // Catch:{ Exception -> 0x090b }
            android.content.Context r10 = r3.f7339a     // Catch:{ Exception -> 0x090b }
            android.content.pm.PackageManager r10 = r10.getPackageManager()     // Catch:{ Exception -> 0x090b }
            android.content.res.XmlResourceParser r10 = r10.getXml(r9, r11, r8)     // Catch:{ Exception -> 0x090b }
            if (r10 == 0) goto L_0x08d4
            r4.isSystemDefined()     // Catch:{ all -> 0x08cf }
            android.content.Context r4 = r3.f7339a     // Catch:{ NameNotFoundException -> 0x00a7 }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00a7 }
            android.content.res.Resources r4 = r4.getResourcesForApplication(r9)     // Catch:{ NameNotFoundException -> 0x00a7 }
            r3.f7340b = r4     // Catch:{ NameNotFoundException -> 0x00a7 }
            goto L_0x00cc
        L_0x00a7:
            r0 = move-exception
            r4 = r0
            java.lang.String r11 = "ContentRatingsParser"
            java.lang.String r12 = "Failed to get resources for "
            java.lang.String r13 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x08cf }
            int r14 = r13.length()     // Catch:{ all -> 0x08cf }
            if (r14 != 0) goto L_0x00bd
            java.lang.String r13 = new java.lang.String     // Catch:{ all -> 0x08cf }
            r13.<init>(r12)     // Catch:{ all -> 0x08cf }
            goto L_0x00c1
        L_0x00bd:
            java.lang.String r13 = r12.concat(r13)     // Catch:{ all -> 0x08cf }
        L_0x00c1:
            android.util.Log.w(r11, r13, r4)     // Catch:{ all -> 0x08cf }
            android.content.Context r4 = r3.f7339a     // Catch:{ all -> 0x08cf }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x08cf }
            r3.f7340b = r4     // Catch:{ all -> 0x08cf }
        L_0x00cc:
            android.content.Context r4 = r3.f7339a     // Catch:{ all -> 0x08cf }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x08cf }
            boolean r4 = r9.equals(r4)     // Catch:{ all -> 0x08cf }
            if (r4 != 0) goto L_0x00e0
            java.lang.String r4 = "com.google.android.tv"
            boolean r4 = r9.equals(r4)     // Catch:{ all -> 0x08cf }
            if (r4 == 0) goto L_0x00e2
        L_0x00e0:
            java.lang.String r9 = "com.android.tv"
        L_0x00e2:
            int r4 = r10.next()     // Catch:{ all -> 0x08cf }
            if (r4 == 0) goto L_0x08c6
            int r4 = r10.getEventType()     // Catch:{ all -> 0x08cf }
            java.lang.String r11 = "Malformed XML: Not a valid XML file"
            r12 = 2
            p000.cte.m5670a(r4, r12, r11)     // Catch:{ all -> 0x08cf }
            java.lang.String r4 = r10.getName()     // Catch:{ all -> 0x08cf }
            java.lang.String r11 = "rating-system-definitions"
            java.lang.String r13 = "Malformed XML: Should start with tag rating-system-definitions"
            p000.cte.m5671a(r4, r11, r13)     // Catch:{ all -> 0x08cf }
            r4 = 0
            r11 = 0
        L_0x00ff:
            int r13 = r10.getAttributeCount()     // Catch:{ all -> 0x08cf }
            if (r4 >= r13) goto L_0x011d
            java.lang.String r13 = "versionCode"
            java.lang.String r14 = r10.getAttributeName(r4)     // Catch:{ all -> 0x08cf }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x08cf }
            if (r13 != 0) goto L_0x0112
            goto L_0x011a
        L_0x0112:
            java.lang.String r11 = r10.getAttributeValue(r4)     // Catch:{ all -> 0x08cf }
            r3.f7341c = r11     // Catch:{ all -> 0x08cf }
            r11 = 1
        L_0x011a:
            int r4 = r4 + 1
            goto L_0x00ff
        L_0x011d:
            if (r11 == 0) goto L_0x08bc
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x08cf }
            r4.<init>()     // Catch:{ all -> 0x08cf }
        L_0x0124:
            int r11 = r10.next()     // Catch:{ all -> 0x08cf }
            if (r11 == r6) goto L_0x08b2
            int r11 = r10.getEventType()     // Catch:{ all -> 0x08cf }
            r13 = 3
            if (r11 == r12) goto L_0x015d
            if (r11 == r13) goto L_0x0134
            goto L_0x0124
        L_0x0134:
            java.lang.String r11 = "rating-system-definitions"
            java.lang.String r13 = r10.getName()     // Catch:{ all -> 0x08cf }
            boolean r11 = r11.equals(r13)     // Catch:{ all -> 0x08cf }
            if (r11 != 0) goto L_0x0146
            java.lang.String r11 = "Malformed XML: Should end with tag rating-system-definitions"
            r3.mo3732a(r11)     // Catch:{ all -> 0x08cf }
            goto L_0x0124
        L_0x0146:
            int r9 = r10.next()     // Catch:{ all -> 0x08cf }
            java.lang.String r11 = "Malformed XML: Should end with tag rating-system-definitions"
            p000.cte.m5670a(r9, r6, r11)     // Catch:{ all -> 0x08cf }
            r10.close()     // Catch:{ Exception -> 0x0156 }
            r17 = r2
            goto L_0x0936
        L_0x0156:
            r0 = move-exception
            r17 = r2
            r2 = r0
            goto L_0x0910
        L_0x015d:
            java.lang.String r11 = "rating-system-definition"
            java.lang.String r14 = r10.getName()     // Catch:{ all -> 0x08cf }
            boolean r11 = r11.equals(r14)     // Catch:{ all -> 0x08cf }
            if (r11 == 0) goto L_0x089f
            java.lang.String r11 = " in rating-system-definition"
            csv r14 = new csv     // Catch:{ all -> 0x08cf }
            android.content.Context r15 = r3.f7339a     // Catch:{ all -> 0x08cf }
            r14.<init>(r15)     // Catch:{ all -> 0x08cf }
            r14.f7308c = r9     // Catch:{ all -> 0x08cf }
            r15 = 0
        L_0x0175:
            int r8 = r10.getAttributeCount()     // Catch:{ all -> 0x08cf }
            r16 = -1
            if (r15 < r8) goto L_0x07dd
        L_0x017d:
            int r8 = r10.next()     // Catch:{ all -> 0x08cf }
            if (r8 == r6) goto L_0x07d2
            int r8 = r10.getEventType()     // Catch:{ all -> 0x08cf }
            if (r8 == r12) goto L_0x0478
            if (r8 == r13) goto L_0x018c
            goto L_0x017d
        L_0x018c:
            java.lang.String r8 = "rating-system-definition"
            java.lang.String r15 = r10.getName()     // Catch:{ all -> 0x08cf }
            boolean r8 = r8.equals(r15)     // Catch:{ all -> 0x08cf }
            if (r8 == 0) goto L_0x0466
            java.lang.String r8 = r14.f7307b     // Catch:{ all -> 0x08cf }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x08cf }
            if (r8 != 0) goto L_0x045c
            java.lang.String r8 = r14.f7308c     // Catch:{ all -> 0x08cf }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x08cf }
            if (r8 != 0) goto L_0x0452
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x08cf }
            r8.<init>()     // Catch:{ all -> 0x08cf }
            java.util.List r11 = r14.f7310e     // Catch:{ all -> 0x08cf }
            if (r11 != 0) goto L_0x01b2
            goto L_0x01fb
        L_0x01b2:
            int r11 = r11.size()     // Catch:{ all -> 0x08cf }
            if (r11 != r6) goto L_0x01cf
            java.util.Locale r11 = new java.util.Locale     // Catch:{ all -> 0x08cf }
            java.lang.String r13 = ""
            java.util.List r15 = r14.f7310e     // Catch:{ all -> 0x08cf }
            java.lang.Object r15 = r15.get(r5)     // Catch:{ all -> 0x08cf }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x08cf }
            r11.<init>(r13, r15)     // Catch:{ all -> 0x08cf }
            java.lang.String r11 = r11.getDisplayCountry()     // Catch:{ all -> 0x08cf }
            r8.append(r11)     // Catch:{ all -> 0x08cf }
            goto L_0x01fb
        L_0x01cf:
            java.util.List r11 = r14.f7310e     // Catch:{ all -> 0x08cf }
            int r11 = r11.size()     // Catch:{ all -> 0x08cf }
            if (r11 <= r6) goto L_0x01fb
            java.util.Locale r11 = java.util.Locale.getDefault()     // Catch:{ all -> 0x08cf }
            java.util.List r13 = r14.f7310e     // Catch:{ all -> 0x08cf }
            java.lang.String r15 = r11.getCountry()     // Catch:{ all -> 0x08cf }
            boolean r13 = r13.contains(r15)     // Catch:{ all -> 0x08cf }
            if (r13 != 0) goto L_0x01f4
            android.content.Context r11 = r14.f7306a     // Catch:{ all -> 0x08cf }
            r13 = 2131886420(0x7f120154, float:1.9407418E38)
            java.lang.String r11 = r11.getString(r13)     // Catch:{ all -> 0x08cf }
            r8.append(r11)     // Catch:{ all -> 0x08cf }
            goto L_0x01fb
        L_0x01f4:
            java.lang.String r11 = r11.getDisplayCountry()     // Catch:{ all -> 0x08cf }
            r8.append(r11)     // Catch:{ all -> 0x08cf }
        L_0x01fb:
            java.lang.String r11 = r14.f7309d     // Catch:{ all -> 0x08cf }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x08cf }
            if (r11 != 0) goto L_0x0212
            java.lang.String r11 = " ("
            r8.append(r11)     // Catch:{ all -> 0x08cf }
            java.lang.String r11 = r14.f7309d     // Catch:{ all -> 0x08cf }
            r8.append(r11)     // Catch:{ all -> 0x08cf }
            java.lang.String r11 = ")"
            r8.append(r11)     // Catch:{ all -> 0x08cf }
        L_0x0212:
            r8.toString()     // Catch:{ all -> 0x08cf }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x08cf }
            r8.<init>()     // Catch:{ all -> 0x08cf }
            java.util.List r11 = r14.f7312g     // Catch:{ all -> 0x08cf }
            int r13 = r11.size()     // Catch:{ all -> 0x08cf }
            r15 = 0
        L_0x0221:
            if (r15 >= r13) goto L_0x024d
            java.lang.Object r16 = r11.get(r15)     // Catch:{ all -> 0x08cf }
            r5 = r16
            csz r5 = (p000.csz) r5     // Catch:{ all -> 0x08cf }
            java.lang.String r12 = r5.f7322a     // Catch:{ all -> 0x08cf }
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x08cf }
            if (r12 != 0) goto L_0x0245
            cta r12 = new cta     // Catch:{ all -> 0x08cf }
            java.lang.String r6 = r5.f7322a     // Catch:{ all -> 0x08cf }
            java.lang.String r5 = r5.f7323b     // Catch:{ all -> 0x08cf }
            r12.<init>(r6, r5)     // Catch:{ all -> 0x08cf }
            r8.add(r12)     // Catch:{ all -> 0x08cf }
            int r15 = r15 + 1
            r5 = 0
            r6 = 1
            r12 = 2
            goto L_0x0221
        L_0x0245:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x08cf }
            java.lang.String r5 = "A subrating should have non-empty name"
            r4.<init>(r5)     // Catch:{ all -> 0x08cf }
            throw r4     // Catch:{ all -> 0x08cf }
        L_0x024d:
            java.util.List r5 = r14.f7311f     // Catch:{ all -> 0x08cf }
            int r5 = r5.size()     // Catch:{ all -> 0x08cf }
            if (r5 <= 0) goto L_0x0448
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x08cf }
            r5.<init>()     // Catch:{ all -> 0x08cf }
            java.util.List r6 = r14.f7311f     // Catch:{ all -> 0x08cf }
            int r11 = r6.size()     // Catch:{ all -> 0x08cf }
            r12 = 0
        L_0x0261:
            if (r12 >= r11) goto L_0x0342
            java.lang.Object r13 = r6.get(r12)     // Catch:{ all -> 0x08cf }
            csx r13 = (p000.csx) r13     // Catch:{ all -> 0x08cf }
            java.lang.String r15 = r13.f7315a     // Catch:{ all -> 0x08cf }
            boolean r15 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x08cf }
            if (r15 != 0) goto L_0x0338
            int r15 = r13.f7317c     // Catch:{ all -> 0x08cf }
            if (r15 < 0) goto L_0x030e
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x08cf }
            r15.<init>()     // Catch:{ all -> 0x08cf }
            r17 = r2
            java.util.List r2 = r13.f7318d     // Catch:{ all -> 0x08fb }
            r16 = r6
            int r6 = r2.size()     // Catch:{ all -> 0x08fb }
            r18 = r9
            r9 = 0
        L_0x0287:
            if (r9 < r6) goto L_0x029e
            csy r2 = new csy     // Catch:{ all -> 0x08fb }
            java.lang.String r6 = r13.f7315a     // Catch:{ all -> 0x08fb }
            java.lang.String r9 = r13.f7316b     // Catch:{ all -> 0x08fb }
            r2.<init>(r6, r9, r15)     // Catch:{ all -> 0x08fb }
            r5.add(r2)     // Catch:{ all -> 0x08fb }
            int r12 = r12 + 1
            r6 = r16
            r2 = r17
            r9 = r18
            goto L_0x0261
        L_0x029e:
            java.lang.Object r19 = r2.get(r9)     // Catch:{ all -> 0x08fb }
            r20 = r2
            r2 = r19
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x08fb }
            r19 = r6
            int r6 = r8.size()     // Catch:{ all -> 0x08fb }
            r21 = r11
            r11 = 0
        L_0x02b1:
            if (r11 >= r6) goto L_0x02da
            java.lang.Object r22 = r8.get(r11)     // Catch:{ all -> 0x08fb }
            r23 = r6
            r6 = r22
            cta r6 = (p000.cta) r6     // Catch:{ all -> 0x08fb }
            int r11 = r11 + 1
            r22 = r11
            java.lang.String r11 = r6.f7329a     // Catch:{ all -> 0x08fb }
            boolean r11 = r2.equals(r11)     // Catch:{ all -> 0x08fb }
            if (r11 == 0) goto L_0x02d5
            r15.add(r6)     // Catch:{ all -> 0x08fb }
            int r9 = r9 + 1
            r6 = r19
            r2 = r20
            r11 = r21
            goto L_0x0287
        L_0x02d5:
            r11 = r22
            r6 = r23
            goto L_0x02b1
        L_0x02da:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x08fb }
            java.lang.String r5 = r13.f7315a     // Catch:{ all -> 0x08fb }
            java.lang.String r6 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x08fb }
            int r6 = r6.length()     // Catch:{ all -> 0x08fb }
            java.lang.String r8 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x08fb }
            int r8 = r8.length()     // Catch:{ all -> 0x08fb }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x08fb }
            int r6 = r6 + 34
            int r6 = r6 + r8
            r9.<init>(r6)     // Catch:{ all -> 0x08fb }
            java.lang.String r6 = "Unknown subrating name "
            r9.append(r6)     // Catch:{ all -> 0x08fb }
            r9.append(r2)     // Catch:{ all -> 0x08fb }
            java.lang.String r2 = " in rating "
            r9.append(r2)     // Catch:{ all -> 0x08fb }
            r9.append(r5)     // Catch:{ all -> 0x08fb }
            java.lang.String r2 = r9.toString()     // Catch:{ all -> 0x08fb }
            r4.<init>(r2)     // Catch:{ all -> 0x08fb }
            throw r4     // Catch:{ all -> 0x08fb }
        L_0x030e:
            r17 = r2
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x08fb }
            java.lang.String r4 = r13.f7315a     // Catch:{ all -> 0x08fb }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x08fb }
            int r5 = r5.length()     // Catch:{ all -> 0x08fb }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x08fb }
            int r5 = r5 + 49
            r6.<init>(r5)     // Catch:{ all -> 0x08fb }
            java.lang.String r5 = "Rating "
            r6.append(r5)     // Catch:{ all -> 0x08fb }
            r6.append(r4)     // Catch:{ all -> 0x08fb }
            java.lang.String r4 = " should define non-negative contentAgeHint"
            r6.append(r4)     // Catch:{ all -> 0x08fb }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x08fb }
            r2.<init>(r4)     // Catch:{ all -> 0x08fb }
            throw r2     // Catch:{ all -> 0x08fb }
        L_0x0338:
            r17 = r2
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x08fb }
            java.lang.String r4 = "A rating should have non-empty name"
            r2.<init>(r4)     // Catch:{ all -> 0x08fb }
            throw r2     // Catch:{ all -> 0x08fb }
        L_0x0342:
            r17 = r2
            r18 = r9
            int r2 = r8.size()     // Catch:{ all -> 0x08fb }
            r6 = 0
        L_0x034b:
            if (r6 < r2) goto L_0x03fb
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x08fb }
            r2.<init>()     // Catch:{ all -> 0x08fb }
            java.util.List r6 = r14.f7313h     // Catch:{ all -> 0x08fb }
            int r8 = r6.size()     // Catch:{ all -> 0x08fb }
            r9 = 0
        L_0x0359:
            if (r9 >= r8) goto L_0x03e5
            java.lang.Object r11 = r6.get(r9)     // Catch:{ all -> 0x08fb }
            csw r11 = (p000.csw) r11     // Catch:{ all -> 0x08fb }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x08fb }
            r12.<init>()     // Catch:{ all -> 0x08fb }
            java.util.List r11 = r11.f7314a     // Catch:{ all -> 0x08fb }
            int r13 = r11.size()     // Catch:{ all -> 0x08fb }
            r15 = 0
        L_0x036d:
            if (r15 >= r13) goto L_0x03d1
            java.lang.Object r16 = r11.get(r15)     // Catch:{ all -> 0x08fb }
            r19 = r6
            r6 = r16
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x08fb }
            r16 = r8
            int r8 = r5.size()     // Catch:{ all -> 0x08fb }
            r20 = r11
            r11 = 0
        L_0x0382:
            if (r11 >= r8) goto L_0x03ab
            java.lang.Object r21 = r5.get(r11)     // Catch:{ all -> 0x08fb }
            r22 = r8
            r8 = r21
            csy r8 = (p000.csy) r8     // Catch:{ all -> 0x08fb }
            int r11 = r11 + 1
            r21 = r11
            java.lang.String r11 = r8.f7319a     // Catch:{ all -> 0x08fb }
            boolean r11 = r6.equals(r11)     // Catch:{ all -> 0x08fb }
            if (r11 == 0) goto L_0x03a6
            r12.add(r8)     // Catch:{ all -> 0x08fb }
            int r15 = r15 + 1
            r8 = r16
            r6 = r19
            r11 = r20
            goto L_0x036d
        L_0x03a6:
            r11 = r21
            r8 = r22
            goto L_0x0382
        L_0x03ab:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x08fb }
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x08fb }
            int r4 = r4.length()     // Catch:{ all -> 0x08fb }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x08fb }
            int r4 = r4 + 35
            r5.<init>(r4)     // Catch:{ all -> 0x08fb }
            java.lang.String r4 = "Unknown rating "
            r5.append(r4)     // Catch:{ all -> 0x08fb }
            r5.append(r6)     // Catch:{ all -> 0x08fb }
            java.lang.String r4 = " in rating-order tag"
            r5.append(r4)     // Catch:{ all -> 0x08fb }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x08fb }
            r2.<init>(r4)     // Catch:{ all -> 0x08fb }
            throw r2     // Catch:{ all -> 0x08fb }
        L_0x03d1:
            r19 = r6
            r16 = r8
            dhz r6 = new dhz     // Catch:{ all -> 0x08fb }
            r6.<init>()     // Catch:{ all -> 0x08fb }
            r2.add(r6)     // Catch:{ all -> 0x08fb }
            int r9 = r9 + 1
            r8 = r16
            r6 = r19
            goto L_0x0359
        L_0x03e5:
            ctb r2 = new ctb     // Catch:{ all -> 0x08fb }
            java.lang.String r6 = r14.f7307b     // Catch:{ all -> 0x08fb }
            java.lang.String r8 = r14.f7308c     // Catch:{ all -> 0x08fb }
            r2.<init>(r6, r8, r5)     // Catch:{ all -> 0x08fb }
            r4.add(r2)     // Catch:{ all -> 0x08fb }
            r2 = r17
            r9 = r18
            r5 = 0
            r6 = 1
            r8 = 0
            r12 = 2
            goto L_0x0124
        L_0x03fb:
            java.lang.Object r9 = r8.get(r6)     // Catch:{ all -> 0x08fb }
            cta r9 = (p000.cta) r9     // Catch:{ all -> 0x08fb }
            int r11 = r5.size()     // Catch:{ all -> 0x08fb }
            r12 = 0
        L_0x0406:
            if (r12 >= r11) goto L_0x0420
            int r13 = r6 + 1
            int r15 = r12 + 1
            java.lang.Object r12 = r5.get(r12)     // Catch:{ all -> 0x08fb }
            csy r12 = (p000.csy) r12     // Catch:{ all -> 0x08fb }
            java.util.List r12 = r12.f7321c     // Catch:{ all -> 0x08fb }
            boolean r12 = r12.contains(r9)     // Catch:{ all -> 0x08fb }
            if (r12 != 0) goto L_0x041d
            r12 = r15
            goto L_0x0406
        L_0x041d:
            r6 = r13
            goto L_0x034b
        L_0x0420:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x08fb }
            java.lang.String r4 = r9.f7329a     // Catch:{ all -> 0x08fb }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x08fb }
            int r5 = r5.length()     // Catch:{ all -> 0x08fb }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x08fb }
            int r5 = r5 + 35
            r6.<init>(r5)     // Catch:{ all -> 0x08fb }
            java.lang.String r5 = "Subrating "
            r6.append(r5)     // Catch:{ all -> 0x08fb }
            r6.append(r4)     // Catch:{ all -> 0x08fb }
            java.lang.String r4 = " isn't used by any rating"
            r6.append(r4)     // Catch:{ all -> 0x08fb }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x08fb }
            r2.<init>(r4)     // Catch:{ all -> 0x08fb }
            throw r2     // Catch:{ all -> 0x08fb }
        L_0x0448:
            r17 = r2
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x08fb }
            java.lang.String r4 = "Rating isn't available."
            r2.<init>(r4)     // Catch:{ all -> 0x08fb }
            throw r2     // Catch:{ all -> 0x08fb }
        L_0x0452:
            r17 = r2
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x08fb }
            java.lang.String r4 = "Domain cannot be empty"
            r2.<init>(r4)     // Catch:{ all -> 0x08fb }
            throw r2     // Catch:{ all -> 0x08fb }
        L_0x045c:
            r17 = r2
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x08fb }
            java.lang.String r4 = "Name cannot be empty"
            r2.<init>(r4)     // Catch:{ all -> 0x08fb }
            throw r2     // Catch:{ all -> 0x08fb }
        L_0x0466:
            r17 = r2
            r18 = r9
            java.lang.String r2 = "Malformed XML: Tag mismatch for rating-system-definition"
            r3.mo3732a(r2)     // Catch:{ all -> 0x08fb }
            r2 = r17
            r9 = r18
            r5 = 0
            r6 = 1
            r12 = 2
            goto L_0x017d
        L_0x0478:
            r17 = r2
            r18 = r9
            java.lang.String r2 = r10.getName()     // Catch:{ all -> 0x08fb }
            int r5 = r2.hashCode()
            r6 = -1751456994(0xffffffff979ae31e, float:-1.0009349E-24)
            if (r5 == r6) goto L_0x04a9
            r6 = 308029750(0x125c2936, float:6.9470556E-28)
            if (r5 == r6) goto L_0x049f
            r6 = 1137752963(0x43d0bb83, float:417.46494)
            if (r5 == r6) goto L_0x0494
        L_0x0493:
            goto L_0x04b3
        L_0x0494:
            java.lang.String r5 = "rating-definition"
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x0493
            r5 = 0
            goto L_0x04b4
        L_0x049f:
            java.lang.String r5 = "sub-rating-definition"
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x0493
            r5 = 1
            goto L_0x04b4
        L_0x04a9:
            java.lang.String r5 = "rating-order"
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x0493
            r5 = 2
            goto L_0x04b4
        L_0x04b3:
            r5 = -1
        L_0x04b4:
            r6 = 3373707(0x337a8b, float:4.72757E-39)
            if (r5 == 0) goto L_0x0668
            r8 = 1
            if (r5 == r8) goto L_0x0595
            r8 = 2
            if (r5 == r8) goto L_0x04e9
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x08fb }
            int r5 = r5.length()     // Catch:{ all -> 0x08fb }
            int r5 = r5 + 55
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x08fb }
            r6.<init>(r5)     // Catch:{ all -> 0x08fb }
            java.lang.String r5 = "Malformed XML: Unknown tag "
            r6.append(r5)     // Catch:{ all -> 0x08fb }
            r6.append(r2)     // Catch:{ all -> 0x08fb }
            r6.append(r11)     // Catch:{ all -> 0x08fb }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x08fb }
            r3.mo3732a(r2)     // Catch:{ all -> 0x08fb }
            r2 = r17
            r9 = r18
            r5 = 0
            r6 = 1
            r12 = 2
            goto L_0x017d
        L_0x04e9:
            csw r2 = new csw     // Catch:{ all -> 0x08fb }
            r2.<init>()     // Catch:{ all -> 0x08fb }
            int r5 = r10.getAttributeCount()     // Catch:{ all -> 0x08fb }
            java.lang.String r8 = "Malformed XML: Attribute isn't allowed in rating-order"
            r9 = 0
            p000.cte.m5670a(r5, r9, r8)     // Catch:{ all -> 0x08fb }
        L_0x04f8:
            int r5 = r10.next()     // Catch:{ all -> 0x08fb }
            r8 = 1
            if (r5 == r8) goto L_0x058d
            int r5 = r10.getEventType()     // Catch:{ all -> 0x08fb }
            r8 = 2
            if (r5 == r8) goto L_0x0522
            if (r5 == r13) goto L_0x0509
            goto L_0x04f8
        L_0x0509:
            java.lang.String r5 = r10.getName()     // Catch:{ all -> 0x08fb }
            java.lang.String r6 = "rating-order"
            java.lang.String r8 = "Malformed XML: Tag mismatch for rating-order"
            p000.cte.m5671a(r5, r6, r8)     // Catch:{ all -> 0x08fb }
            java.util.List r5 = r14.f7313h     // Catch:{ all -> 0x08fb }
            r5.add(r2)     // Catch:{ all -> 0x08fb }
            r2 = r17
            r9 = r18
            r5 = 0
            r6 = 1
            r12 = 2
            goto L_0x017d
        L_0x0522:
            java.lang.String r5 = "rating"
            java.lang.String r8 = r10.getName()     // Catch:{ all -> 0x08fb }
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x08fb }
            if (r5 != 0) goto L_0x0534
            java.lang.String r5 = "Malformed XML: Only rating is allowed in rating-order"
            r3.mo3732a(r5)     // Catch:{ all -> 0x08fb }
            goto L_0x04f8
        L_0x0534:
            r5 = 0
        L_0x0535:
            int r8 = r10.getAttributeCount()     // Catch:{ all -> 0x08fb }
            if (r5 < r8) goto L_0x0562
        L_0x053b:
            int r5 = r10.next()     // Catch:{ all -> 0x08fb }
            r8 = 1
            if (r5 == r8) goto L_0x055a
            int r5 = r10.getEventType()     // Catch:{ all -> 0x08fb }
            if (r5 != r13) goto L_0x053b
            java.lang.String r5 = "rating"
            java.lang.String r8 = r10.getName()     // Catch:{ all -> 0x08fb }
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x08fb }
            if (r5 != 0) goto L_0x04f8
            java.lang.String r5 = "Malformed XML: rating has child"
            r3.mo3732a(r5)     // Catch:{ all -> 0x08fb }
            goto L_0x053b
        L_0x055a:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ all -> 0x08fb }
            java.lang.String r4 = "rating section is incomplete or section ending tag is missing"
            r2.<init>(r4)     // Catch:{ all -> 0x08fb }
            throw r2     // Catch:{ all -> 0x08fb }
        L_0x0562:
            java.lang.String r8 = r10.getAttributeName(r5)     // Catch:{ all -> 0x08fb }
            int r9 = r8.hashCode()
            if (r9 == r6) goto L_0x056d
        L_0x056c:
            goto L_0x0577
        L_0x056d:
            java.lang.String r9 = "name"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x056c
            r8 = 0
            goto L_0x0579
        L_0x0577:
            r8 = -1
        L_0x0579:
            if (r8 == 0) goto L_0x0581
            java.lang.String r8 = "Malformed XML: rating-order should only contain name"
            r3.mo3732a(r8)     // Catch:{ all -> 0x08fb }
            goto L_0x058a
        L_0x0581:
            java.lang.String r8 = r10.getAttributeValue(r5)     // Catch:{ all -> 0x08fb }
            java.util.List r9 = r2.f7314a     // Catch:{ all -> 0x08fb }
            r9.add(r8)     // Catch:{ all -> 0x08fb }
        L_0x058a:
            int r5 = r5 + 1
            goto L_0x0535
        L_0x058d:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ all -> 0x08fb }
            java.lang.String r4 = "rating-order section is incomplete or section ending tag is missing"
            r2.<init>(r4)     // Catch:{ all -> 0x08fb }
            throw r2     // Catch:{ all -> 0x08fb }
        L_0x0595:
            java.lang.String r2 = " in sub-rating-definition"
            csz r5 = new csz     // Catch:{ all -> 0x08fb }
            r5.<init>()     // Catch:{ all -> 0x08fb }
            r6 = 0
        L_0x059d:
            int r8 = r10.getAttributeCount()     // Catch:{ all -> 0x08fb }
            if (r6 < r8) goto L_0x05de
        L_0x05a3:
            int r2 = r10.next()     // Catch:{ all -> 0x08fb }
            r6 = 1
            if (r2 == r6) goto L_0x05d6
            int r2 = r10.getEventType()     // Catch:{ all -> 0x08fb }
            if (r2 == r13) goto L_0x05b6
            java.lang.String r2 = "Malformed XML: sub-rating-definition has child"
            r3.mo3732a(r2)     // Catch:{ all -> 0x08fb }
            goto L_0x05a3
        L_0x05b6:
            java.lang.String r2 = "sub-rating-definition"
            java.lang.String r6 = r10.getName()     // Catch:{ all -> 0x08fb }
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x08fb }
            if (r2 == 0) goto L_0x05d0
            java.util.List r2 = r14.f7312g     // Catch:{ all -> 0x08fb }
            r2.add(r5)     // Catch:{ all -> 0x08fb }
            r2 = r17
            r9 = r18
            r5 = 0
            r6 = 1
            r12 = 2
            goto L_0x017d
        L_0x05d0:
            java.lang.String r2 = "Malformed XML: sub-rating-definition isn't closed"
            r3.mo3732a(r2)     // Catch:{ all -> 0x08fb }
            goto L_0x05a3
        L_0x05d6:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ all -> 0x08fb }
            java.lang.String r4 = "sub-rating-definition section is incomplete or section ending tag is missing"
            r2.<init>(r4)     // Catch:{ all -> 0x08fb }
            throw r2     // Catch:{ all -> 0x08fb }
        L_0x05de:
            java.lang.String r8 = r10.getAttributeName(r6)     // Catch:{ all -> 0x08fb }
            int r9 = r8.hashCode()
            switch(r9) {
                case -1724546052: goto L_0x0609;
                case 3226745: goto L_0x05ff;
                case 3373707: goto L_0x05f5;
                case 110371416: goto L_0x05ea;
                default: goto L_0x05e9;
            }
        L_0x05e9:
            goto L_0x0613
        L_0x05ea:
            java.lang.String r9 = "title"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x05e9
            r9 = 1
            goto L_0x0614
        L_0x05f5:
            java.lang.String r9 = "name"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x05e9
            r9 = 0
            goto L_0x0614
        L_0x05ff:
            java.lang.String r9 = "icon"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x05e9
            r9 = 3
            goto L_0x0614
        L_0x0609:
            java.lang.String r9 = "description"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x05e9
            r9 = 2
            goto L_0x0614
        L_0x0613:
            r9 = -1
        L_0x0614:
            if (r9 == 0) goto L_0x065e
            r12 = 1
            if (r9 == r12) goto L_0x0657
            r12 = 2
            if (r9 == r12) goto L_0x064c
            if (r9 == r13) goto L_0x0640
            java.lang.String r9 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x08fb }
            int r9 = r9.length()     // Catch:{ all -> 0x08fb }
            int r9 = r9 + 58
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x08fb }
            r12.<init>(r9)     // Catch:{ all -> 0x08fb }
            java.lang.String r9 = "Malformed XML: Unknown attribute "
            r12.append(r9)     // Catch:{ all -> 0x08fb }
            r12.append(r8)     // Catch:{ all -> 0x08fb }
            r12.append(r2)     // Catch:{ all -> 0x08fb }
            java.lang.String r8 = r12.toString()     // Catch:{ all -> 0x08fb }
            r3.mo3732a(r8)     // Catch:{ all -> 0x08fb }
            goto L_0x0664
        L_0x0640:
            android.content.res.Resources r8 = r3.f7340b     // Catch:{ all -> 0x08fb }
            r9 = 0
            int r12 = r10.getAttributeResourceValue(r6, r9)     // Catch:{ all -> 0x08fb }
            r9 = 0
            r8.getDrawable(r12, r9)     // Catch:{ all -> 0x08fb }
            goto L_0x0664
        L_0x064c:
            android.content.res.Resources r8 = r3.f7340b     // Catch:{ all -> 0x08fb }
            r9 = 0
            int r12 = r10.getAttributeResourceValue(r6, r9)     // Catch:{ all -> 0x08fb }
            r8.getString(r12)     // Catch:{ all -> 0x08fb }
            goto L_0x0664
        L_0x0657:
            java.lang.String r8 = r3.mo3731a(r10, r6)     // Catch:{ all -> 0x08fb }
            r5.f7323b = r8     // Catch:{ all -> 0x08fb }
            goto L_0x0664
        L_0x065e:
            java.lang.String r8 = r10.getAttributeValue(r6)     // Catch:{ all -> 0x08fb }
            r5.f7322a = r8     // Catch:{ all -> 0x08fb }
        L_0x0664:
            int r6 = r6 + 1
            goto L_0x059d
        L_0x0668:
            java.lang.String r2 = " in rating-definition"
            csx r5 = new csx     // Catch:{ all -> 0x08fb }
            r5.<init>()     // Catch:{ all -> 0x08fb }
            r8 = 0
        L_0x0670:
            int r9 = r10.getAttributeCount()     // Catch:{ all -> 0x08fb }
            if (r8 < r9) goto L_0x071a
        L_0x0676:
            int r2 = r10.next()     // Catch:{ all -> 0x08fb }
            r8 = 1
            if (r2 == r8) goto L_0x0712
            int r2 = r10.getEventType()     // Catch:{ all -> 0x08fb }
            r8 = 2
            if (r2 == r8) goto L_0x06a7
            if (r2 == r13) goto L_0x0687
            goto L_0x0676
        L_0x0687:
            java.lang.String r2 = "rating-definition"
            java.lang.String r8 = r10.getName()     // Catch:{ all -> 0x08fb }
            boolean r2 = r2.equals(r8)     // Catch:{ all -> 0x08fb }
            if (r2 == 0) goto L_0x06a1
            java.util.List r2 = r14.f7311f     // Catch:{ all -> 0x08fb }
            r2.add(r5)     // Catch:{ all -> 0x08fb }
            r2 = r17
            r9 = r18
            r5 = 0
            r6 = 1
            r12 = 2
            goto L_0x017d
        L_0x06a1:
            java.lang.String r2 = "Malformed XML: Tag mismatch for rating-definition"
            r3.mo3732a(r2)     // Catch:{ all -> 0x08fb }
            goto L_0x0676
        L_0x06a7:
            java.lang.String r2 = "sub-rating"
            java.lang.String r8 = r10.getName()     // Catch:{ all -> 0x08fb }
            boolean r2 = r2.equals(r8)     // Catch:{ all -> 0x08fb }
            if (r2 != 0) goto L_0x06b9
            java.lang.String r2 = "Malformed XML: Only sub-rating is allowed in rating-definition"
            r3.mo3732a(r2)     // Catch:{ all -> 0x08fb }
            goto L_0x0676
        L_0x06b9:
            r2 = 0
        L_0x06ba:
            int r8 = r10.getAttributeCount()     // Catch:{ all -> 0x08fb }
            if (r2 < r8) goto L_0x06e7
        L_0x06c0:
            int r2 = r10.next()     // Catch:{ all -> 0x08fb }
            r8 = 1
            if (r2 == r8) goto L_0x06df
            int r2 = r10.getEventType()     // Catch:{ all -> 0x08fb }
            if (r2 != r13) goto L_0x06c0
            java.lang.String r2 = "sub-rating"
            java.lang.String r8 = r10.getName()     // Catch:{ all -> 0x08fb }
            boolean r2 = r2.equals(r8)     // Catch:{ all -> 0x08fb }
            if (r2 != 0) goto L_0x0676
            java.lang.String r2 = "Malformed XML: sub-rating has child"
            r3.mo3732a(r2)     // Catch:{ all -> 0x08fb }
            goto L_0x06c0
        L_0x06df:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ all -> 0x08fb }
            java.lang.String r4 = "sub-rating section is incomplete or section ending tag is missing"
            r2.<init>(r4)     // Catch:{ all -> 0x08fb }
            throw r2     // Catch:{ all -> 0x08fb }
        L_0x06e7:
            java.lang.String r8 = r10.getAttributeName(r2)     // Catch:{ all -> 0x08fb }
            int r9 = r8.hashCode()
            if (r9 == r6) goto L_0x06f2
        L_0x06f1:
            goto L_0x06fc
        L_0x06f2:
            java.lang.String r9 = "name"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x06f1
            r8 = 0
            goto L_0x06fe
        L_0x06fc:
            r8 = -1
        L_0x06fe:
            if (r8 == 0) goto L_0x0706
            java.lang.String r8 = "Malformed XML: sub-rating should only contain name"
            r3.mo3732a(r8)     // Catch:{ all -> 0x08fb }
            goto L_0x070f
        L_0x0706:
            java.lang.String r8 = r10.getAttributeValue(r2)     // Catch:{ all -> 0x08fb }
            java.util.List r9 = r5.f7318d     // Catch:{ all -> 0x08fb }
            r9.add(r8)     // Catch:{ all -> 0x08fb }
        L_0x070f:
            int r2 = r2 + 1
            goto L_0x06ba
        L_0x0712:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ all -> 0x08fb }
            java.lang.String r4 = "rating-definition section is incomplete or section ending tag is missing"
            r2.<init>(r4)     // Catch:{ all -> 0x08fb }
            throw r2     // Catch:{ all -> 0x08fb }
        L_0x071a:
            java.lang.String r9 = r10.getAttributeName(r8)     // Catch:{ all -> 0x08fb }
            int r12 = r9.hashCode()
            r15 = 4
            switch(r12) {
                case -1724546052: goto L_0x0750;
                case -706851475: goto L_0x0746;
                case 3226745: goto L_0x073c;
                case 3373707: goto L_0x0732;
                case 110371416: goto L_0x0727;
                default: goto L_0x0726;
            }
        L_0x0726:
            goto L_0x075a
        L_0x0727:
            java.lang.String r12 = "title"
            boolean r12 = r9.equals(r12)
            if (r12 == 0) goto L_0x0726
            r12 = 1
            goto L_0x075b
        L_0x0732:
            java.lang.String r12 = "name"
            boolean r12 = r9.equals(r12)
            if (r12 == 0) goto L_0x0726
            r12 = 0
            goto L_0x075b
        L_0x073c:
            java.lang.String r12 = "icon"
            boolean r12 = r9.equals(r12)
            if (r12 == 0) goto L_0x0726
            r12 = 3
            goto L_0x075b
        L_0x0746:
            java.lang.String r12 = "contentAgeHint"
            boolean r12 = r9.equals(r12)
            if (r12 == 0) goto L_0x0726
            r12 = 4
            goto L_0x075b
        L_0x0750:
            java.lang.String r12 = "description"
            boolean r12 = r9.equals(r12)
            if (r12 == 0) goto L_0x0726
            r12 = 2
            goto L_0x075b
        L_0x075a:
            r12 = -1
        L_0x075b:
            if (r12 == 0) goto L_0x07c4
            r6 = 1
            if (r12 == r6) goto L_0x07bc
            r6 = 2
            if (r12 == r6) goto L_0x07b0
            if (r12 == r13) goto L_0x07a4
            if (r12 == r15) goto L_0x078a
            java.lang.String r6 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x08fb }
            int r6 = r6.length()     // Catch:{ all -> 0x08fb }
            int r6 = r6 + 54
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x08fb }
            r12.<init>(r6)     // Catch:{ all -> 0x08fb }
            java.lang.String r6 = "Malformed XML: Unknown attribute "
            r12.append(r6)     // Catch:{ all -> 0x08fb }
            r12.append(r9)     // Catch:{ all -> 0x08fb }
            r12.append(r2)     // Catch:{ all -> 0x08fb }
            java.lang.String r6 = r12.toString()     // Catch:{ all -> 0x08fb }
            r3.mo3732a(r6)     // Catch:{ all -> 0x08fb }
            r9 = 0
            goto L_0x07cb
        L_0x078a:
            java.lang.String r6 = r10.getAttributeValue(r8)     // Catch:{ NumberFormatException -> 0x0793 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x0793 }
            goto L_0x0796
        L_0x0793:
            r0 = move-exception
            r6 = -1
        L_0x0796:
            if (r6 < 0) goto L_0x079c
            r5.f7317c = r6     // Catch:{ all -> 0x08fb }
            r9 = 0
            goto L_0x07cb
        L_0x079c:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ all -> 0x08fb }
            java.lang.String r4 = "Malformed XML: contentAgeHint should be a non-negative number"
            r2.<init>(r4)     // Catch:{ all -> 0x08fb }
            throw r2     // Catch:{ all -> 0x08fb }
        L_0x07a4:
            android.content.res.Resources r6 = r3.f7340b     // Catch:{ all -> 0x08fb }
            r9 = 0
            int r12 = r10.getAttributeResourceValue(r8, r9)     // Catch:{ all -> 0x08fb }
            r9 = 0
            r6.getDrawable(r12, r9)     // Catch:{ all -> 0x08fb }
            goto L_0x07cb
        L_0x07b0:
            r9 = 0
            android.content.res.Resources r6 = r3.f7340b     // Catch:{ all -> 0x08fb }
            r12 = 0
            int r15 = r10.getAttributeResourceValue(r8, r12)     // Catch:{ all -> 0x08fb }
            r6.getString(r15)     // Catch:{ all -> 0x08fb }
            goto L_0x07cb
        L_0x07bc:
            r9 = 0
            java.lang.String r6 = r3.mo3731a(r10, r8)     // Catch:{ all -> 0x08fb }
            r5.f7316b = r6     // Catch:{ all -> 0x08fb }
            goto L_0x07cb
        L_0x07c4:
            r9 = 0
            java.lang.String r6 = r10.getAttributeValue(r8)     // Catch:{ all -> 0x08fb }
            r5.f7315a = r6     // Catch:{ all -> 0x08fb }
        L_0x07cb:
            int r8 = r8 + 1
            r6 = 3373707(0x337a8b, float:4.72757E-39)
            goto L_0x0670
        L_0x07d2:
            r17 = r2
            r9 = 0
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ all -> 0x08fb }
            java.lang.String r4 = "rating-system-definition section is incomplete or section ending tag is missing"
            r2.<init>(r4)     // Catch:{ all -> 0x08fb }
            throw r2     // Catch:{ all -> 0x08fb }
        L_0x07dd:
            r17 = r2
            r18 = r9
            r9 = 0
            java.lang.String r2 = r10.getAttributeName(r15)     // Catch:{ all -> 0x08fb }
            int r5 = r2.hashCode()
            switch(r5) {
                case -1724546052: goto L_0x080d;
                case 3373707: goto L_0x0803;
                case 110371416: goto L_0x07f9;
                case 957831062: goto L_0x07ee;
                default: goto L_0x07ed;
            }
        L_0x07ed:
            goto L_0x0817
        L_0x07ee:
            java.lang.String r5 = "country"
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x07ed
            r5 = 1
            goto L_0x0818
        L_0x07f9:
            java.lang.String r5 = "title"
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x07ed
            r5 = 2
            goto L_0x0818
        L_0x0803:
            java.lang.String r5 = "name"
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x07ed
            r5 = 0
            goto L_0x0818
        L_0x080d:
            java.lang.String r5 = "description"
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x07ed
            r5 = 3
            goto L_0x0818
        L_0x0817:
            r5 = -1
        L_0x0818:
            if (r5 == 0) goto L_0x088c
            r6 = 1
            if (r5 == r6) goto L_0x0857
            r6 = 2
            if (r5 == r6) goto L_0x084f
            if (r5 == r13) goto L_0x0844
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x08fb }
            int r5 = r5.length()     // Catch:{ all -> 0x08fb }
            int r5 = r5 + 61
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x08fb }
            r8.<init>(r5)     // Catch:{ all -> 0x08fb }
            java.lang.String r5 = "Malformed XML: Unknown attribute "
            r8.append(r5)     // Catch:{ all -> 0x08fb }
            r8.append(r2)     // Catch:{ all -> 0x08fb }
            r8.append(r11)     // Catch:{ all -> 0x08fb }
            java.lang.String r2 = r8.toString()     // Catch:{ all -> 0x08fb }
            r3.mo3732a(r2)     // Catch:{ all -> 0x08fb }
            goto L_0x0892
        L_0x0844:
            android.content.res.Resources r2 = r3.f7340b     // Catch:{ all -> 0x08fb }
            r5 = 0
            int r8 = r10.getAttributeResourceValue(r15, r5)     // Catch:{ all -> 0x08fb }
            r2.getString(r8)     // Catch:{ all -> 0x08fb }
            goto L_0x0892
        L_0x084f:
            r5 = 0
            java.lang.String r2 = r3.mo3731a(r10, r15)     // Catch:{ all -> 0x08fb }
            r14.f7309d = r2     // Catch:{ all -> 0x08fb }
            goto L_0x0892
        L_0x0857:
            r5 = 0
            r6 = 2
            java.lang.String r2 = r10.getAttributeValue(r15)     // Catch:{ all -> 0x08fb }
            java.lang.String r8 = "\\s*,\\s*"
            java.lang.String[] r2 = r2.split(r8)     // Catch:{ all -> 0x08fb }
            int r8 = r2.length     // Catch:{ all -> 0x08fb }
            r12 = 0
        L_0x0865:
            if (r12 >= r8) goto L_0x0892
            r5 = r2[r12]     // Catch:{ all -> 0x08fb }
            java.util.List r6 = r14.f7310e     // Catch:{ all -> 0x08fb }
            if (r6 == 0) goto L_0x086e
            goto L_0x0875
        L_0x086e:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x08fb }
            r6.<init>()     // Catch:{ all -> 0x08fb }
            r14.f7310e = r6     // Catch:{ all -> 0x08fb }
        L_0x0875:
            java.util.List r6 = r14.f7310e     // Catch:{ all -> 0x08fb }
            java.util.Locale r9 = new java.util.Locale     // Catch:{ all -> 0x08fb }
            java.lang.String r13 = ""
            r9.<init>(r13, r5)     // Catch:{ all -> 0x08fb }
            java.lang.String r5 = r9.getCountry()     // Catch:{ all -> 0x08fb }
            r6.add(r5)     // Catch:{ all -> 0x08fb }
            int r12 = r12 + 1
            r5 = 0
            r6 = 2
            r9 = 0
            r13 = 3
            goto L_0x0865
        L_0x088c:
            java.lang.String r2 = r10.getAttributeValue(r15)     // Catch:{ all -> 0x08fb }
            r14.f7307b = r2     // Catch:{ all -> 0x08fb }
        L_0x0892:
            int r15 = r15 + 1
            r2 = r17
            r9 = r18
            r5 = 0
            r6 = 1
            r8 = 0
            r12 = 2
            r13 = 3
            goto L_0x0175
        L_0x089f:
            r17 = r2
            r18 = r9
            java.lang.String r2 = "Malformed XML: Should contains rating-system-definition"
            r3.mo3732a(r2)     // Catch:{ all -> 0x08fb }
            r2 = r17
            r9 = r18
            r5 = 0
            r6 = 1
            r8 = 0
            r12 = 2
            goto L_0x0124
        L_0x08b2:
            r17 = r2
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ all -> 0x08fb }
            java.lang.String r4 = "rating-system-definitions section is incomplete or section ending tag is missing"
            r2.<init>(r4)     // Catch:{ all -> 0x08fb }
            throw r2     // Catch:{ all -> 0x08fb }
        L_0x08bc:
            r17 = r2
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ all -> 0x08fb }
            java.lang.String r4 = "Malformed XML: Should contains a version attribute in rating-system-definitions"
            r2.<init>(r4)     // Catch:{ all -> 0x08fb }
            throw r2     // Catch:{ all -> 0x08fb }
        L_0x08c6:
            r17 = r2
            r18 = r9
            r5 = 0
            r6 = 1
            r8 = 0
            goto L_0x00e2
        L_0x08cf:
            r0 = move-exception
            r17 = r2
        L_0x08d2:
            r2 = r0
            goto L_0x08fd
        L_0x08d4:
            r17 = r2
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x08fb }
            java.lang.String r4 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x08fb }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x08fb }
            int r5 = r5.length()     // Catch:{ all -> 0x08fb }
            int r5 = r5 + 24
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x08fb }
            r6.<init>(r5)     // Catch:{ all -> 0x08fb }
            java.lang.String r5 = "Cannot get XML with URI "
            r6.append(r5)     // Catch:{ all -> 0x08fb }
            r6.append(r4)     // Catch:{ all -> 0x08fb }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x08fb }
            r2.<init>(r4)     // Catch:{ all -> 0x08fb }
            throw r2     // Catch:{ all -> 0x08fb }
        L_0x08fb:
            r0 = move-exception
            goto L_0x08d2
        L_0x08fd:
            if (r10 == 0) goto L_0x0908
            r10.close()     // Catch:{ all -> 0x0903 }
            goto L_0x0908
        L_0x0903:
            r0 = move-exception
            r4 = r0
            p000.dhr.m6455a(r2, r4)     // Catch:{ Exception -> 0x0909 }
        L_0x0908:
            throw r2     // Catch:{ Exception -> 0x0909 }
        L_0x0909:
            r0 = move-exception
            goto L_0x090e
        L_0x090b:
            r0 = move-exception
            r17 = r2
        L_0x090e:
            r2 = r0
            r4 = 0
        L_0x0910:
            java.lang.String r5 = "ContentRatingsParser"
            java.lang.String r6 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x094f }
            java.lang.String r7 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x094f }
            int r7 = r7.length()     // Catch:{ all -> 0x094f }
            int r7 = r7 + 18
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x094f }
            r8.<init>(r7)     // Catch:{ all -> 0x094f }
            java.lang.String r7 = "Error parsing XML "
            r8.append(r7)     // Catch:{ all -> 0x094f }
            r8.append(r6)     // Catch:{ all -> 0x094f }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x094f }
            android.util.Log.w(r5, r6, r2)     // Catch:{ all -> 0x094f }
        L_0x0936:
            if (r4 == 0) goto L_0x0942
            java.util.List r2 = r1.f7337b     // Catch:{ all -> 0x094f }
            r2.addAll(r4)     // Catch:{ all -> 0x094f }
            r2 = r17
            r5 = 0
            goto L_0x0070
        L_0x0942:
            r2 = r17
            r5 = 0
            goto L_0x0070
        L_0x0947:
            r2 = 1
            r1.f7338d = r2     // Catch:{ all -> 0x094f }
            monitor-exit(r24)     // Catch:{ all -> 0x094f }
            return
        L_0x094d:
            monitor-exit(r24)     // Catch:{ all -> 0x094f }
            return
        L_0x094f:
            r0 = move-exception
            r2 = r0
            monitor-exit(r24)     // Catch:{ all -> 0x094f }
            throw r2
        L_0x0953:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ctd.mo3730a():void");
    }

    /* renamed from: a */
    public static ctd m5668a(Context context) {
        if (f7335c == null) {
            f7335c = new ctd(context.getApplicationContext());
        }
        return f7335c;
    }
}
