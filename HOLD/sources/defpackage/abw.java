package defpackage;

import android.content.Context;
import android.net.Uri;

/* renamed from: abw  reason: default package */
/* compiled from: PG */
final class abw implements ug {
    private static final String[] a = {"_data"};
    private final Context b;
    private final aaj c;
    private final aaj d;
    private final Uri e;
    private final int f;
    private final int g;
    private final tx h;
    private final Class i;
    private volatile boolean j;
    private volatile ug k;

    public final Class a() {
        return this.i;
    }

    public final int d() {
        return 1;
    }

    public abw(Context context, aaj aaj, aaj aaj2, Uri uri, int i2, int i3, tx txVar, Class cls) {
        this.b = context.getApplicationContext();
        this.c = aaj;
        this.d = aaj2;
        this.e = uri;
        this.f = i2;
        this.g = i3;
        this.h = txVar;
        this.i = cls;
    }

    public final void c() {
        this.j = true;
        ug ugVar = this.k;
        if (ugVar != null) {
            ugVar.c();
        }
    }

    public final void b() {
        ug ugVar = this.k;
        if (ugVar != null) {
            ugVar.b();
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [ug] */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /*  JADX ERROR: JadxRuntimeException in pass: MethodInvokeVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not class type: ?
        	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:60)
        	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
        	at jadx.core.dex.nodes.DexNode.resolveClass(DexNode.java:143)
        	at jadx.core.dex.nodes.RootNode.resolveClass(RootNode.java:183)
        	at jadx.core.dex.nodes.utils.MethodUtils.processMethodArgsOverloaded(MethodUtils.java:75)
        	at jadx.core.dex.nodes.utils.MethodUtils.collectOverloadedMethods(MethodUtils.java:54)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:106)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:99)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:70)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:63)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0099 A[SYNTHETIC, Splitter:B:24:0x0099] */
    public final void a(defpackage.sm r10, defpackage.uf r11) {
        /*
            r9 = this;
            boolean r0 = android.os.Environment.isExternalStorageLegacy()     // Catch:{ FileNotFoundException -> 0x00fc }
            r1 = 0
            if (r0 == 0) goto L_0x009d
            aaj r0 = r9.c     // Catch:{ FileNotFoundException -> 0x00fc }
            android.net.Uri r8 = r9.e     // Catch:{ FileNotFoundException -> 0x00fc }
            android.content.Context r2 = r9.b     // Catch:{ all -> 0x0095 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x0095 }
            java.lang.String[] r4 = defpackage.abw.a     // Catch:{ all -> 0x0095 }
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r8
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0095 }
            if (r2 == 0) goto L_0x006c
            boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x0091 }
            if (r3 == 0) goto L_0x006c
            java.lang.String r3 = "_data"
            int r3 = r2.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0091 }
            java.lang.String r3 = r2.getString(r3)     // Catch:{ all -> 0x0091 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0091 }
            if (r4 != 0) goto L_0x0047
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0091 }
            r4.<init>(r3)     // Catch:{ all -> 0x0091 }
            r2.close()     // Catch:{ FileNotFoundException -> 0x00fc }
            int r2 = r9.f     // Catch:{ FileNotFoundException -> 0x00fc }
            int r3 = r9.g     // Catch:{ FileNotFoundException -> 0x00fc }
            tx r5 = r9.h     // Catch:{ FileNotFoundException -> 0x00fc }
            aai r0 = r0.a(r4, r2, r3, r5)     // Catch:{ FileNotFoundException -> 0x00fc }
            goto L_0x00bc
        L_0x0047:
            java.io.FileNotFoundException r10 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0091 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0091 }
            int r1 = r1.length()     // Catch:{ all -> 0x0091 }
            int r1 = r1 + 40
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            r3.<init>(r1)     // Catch:{ all -> 0x0091 }
            java.lang.String r1 = "File path was empty in media store for: "
            r3.append(r1)     // Catch:{ all -> 0x0091 }
            r3.append(r0)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0091 }
            r10.<init>(r0)     // Catch:{ all -> 0x0091 }
            throw r10     // Catch:{ all -> 0x0091 }
        L_0x006c:
            java.io.FileNotFoundException r10 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0091 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0091 }
            int r1 = r1.length()     // Catch:{ all -> 0x0091 }
            int r1 = r1 + 33
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            r3.<init>(r1)     // Catch:{ all -> 0x0091 }
            java.lang.String r1 = "Failed to media store entry for: "
            r3.append(r1)     // Catch:{ all -> 0x0091 }
            r3.append(r0)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0091 }
            r10.<init>(r0)     // Catch:{ all -> 0x0091 }
            throw r10     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r10 = move-exception
            r1 = r2
            goto L_0x0096
        L_0x0095:
            r10 = move-exception
        L_0x0096:
            if (r1 != 0) goto L_0x0099
            goto L_0x009c
        L_0x0099:
            r1.close()     // Catch:{ FileNotFoundException -> 0x00fc }
        L_0x009c:
            throw r10     // Catch:{ FileNotFoundException -> 0x00fc }
        L_0x009d:
            android.content.Context r0 = r9.b     // Catch:{ FileNotFoundException -> 0x00fc }
            java.lang.String r2 = "android.permission.ACCESS_MEDIA_LOCATION"
            int r0 = r0.checkSelfPermission(r2)     // Catch:{ FileNotFoundException -> 0x00fc }
            if (r0 == 0) goto L_0x00aa
            android.net.Uri r0 = r9.e     // Catch:{ FileNotFoundException -> 0x00fc }
            goto L_0x00b0
        L_0x00aa:
            android.net.Uri r0 = r9.e     // Catch:{ FileNotFoundException -> 0x00fc }
            android.net.Uri r0 = android.provider.MediaStore.setRequireOriginal(r0)     // Catch:{ FileNotFoundException -> 0x00fc }
        L_0x00b0:
            aaj r2 = r9.d     // Catch:{ FileNotFoundException -> 0x00fc }
            int r3 = r9.f     // Catch:{ FileNotFoundException -> 0x00fc }
            int r4 = r9.g     // Catch:{ FileNotFoundException -> 0x00fc }
            tx r5 = r9.h     // Catch:{ FileNotFoundException -> 0x00fc }
            aai r0 = r2.a(r0, r3, r4, r5)     // Catch:{ FileNotFoundException -> 0x00fc }
        L_0x00bc:
            if (r0 == 0) goto L_0x00c1
            ug r1 = r0.c     // Catch:{ FileNotFoundException -> 0x00fc }
            goto L_0x00c2
        L_0x00c1:
        L_0x00c2:
            if (r1 != 0) goto L_0x00ee
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ FileNotFoundException -> 0x00fc }
            android.net.Uri r0 = r9.e     // Catch:{ FileNotFoundException -> 0x00fc }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ FileNotFoundException -> 0x00fc }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ FileNotFoundException -> 0x00fc }
            int r1 = r1.length()     // Catch:{ FileNotFoundException -> 0x00fc }
            int r1 = r1 + 29
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00fc }
            r2.<init>(r1)     // Catch:{ FileNotFoundException -> 0x00fc }
            java.lang.String r1 = "Failed to build fetcher for: "
            r2.append(r1)     // Catch:{ FileNotFoundException -> 0x00fc }
            r2.append(r0)     // Catch:{ FileNotFoundException -> 0x00fc }
            java.lang.String r0 = r2.toString()     // Catch:{ FileNotFoundException -> 0x00fc }
            r10.<init>(r0)     // Catch:{ FileNotFoundException -> 0x00fc }
            r11.a(r10)     // Catch:{ FileNotFoundException -> 0x00fc }
            return
        L_0x00ee:
            r9.k = r1     // Catch:{ FileNotFoundException -> 0x00fc }
            boolean r0 = r9.j     // Catch:{ FileNotFoundException -> 0x00fc }
            if (r0 != 0) goto L_0x00f8
            r1.a(r10, r11)     // Catch:{ FileNotFoundException -> 0x00fc }
            return
        L_0x00f8:
            r9.c()     // Catch:{ FileNotFoundException -> 0x00fc }
            return
        L_0x00fc:
            r10 = move-exception
            r11.a(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abw.a(sm, uf):void");
    }
}
