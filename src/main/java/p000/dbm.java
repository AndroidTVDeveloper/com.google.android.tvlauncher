package p000;

import android.os.AsyncTask;

/* renamed from: dbm */
/* compiled from: PG */
public final class dbm extends AsyncTask {

    /* renamed from: a */
    private final dbo f8154a;

    /* renamed from: b */
    private final dbn f8155b;

    public dbm(dbo dbo, dbn dbn) {
        this.f8154a = dbo;
        this.f8155b = dbn;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047 A[SYNTHETIC, Splitter:B:22:0x0047] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r11) {
        /*
            r10 = this;
            android.content.Context[] r11 = (android.content.Context[]) r11
            r0 = 0
            r11 = r11[r0]
            dck r1 = p000.dck.m6123a(r11)
            java.lang.String r2 = r1.mo4103j()
            boolean r1 = r1.mo4102i()
            r3 = 0
            android.content.ContentResolver r4 = r11.getContentResolver()     // Catch:{ Exception -> 0x004f }
            android.net.Uri r5 = p000.dbe.f8138a     // Catch:{ Exception -> 0x004f }
            java.lang.String[] r6 = p000.dbp.f8156a     // Catch:{ Exception -> 0x004f }
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x004f }
            if (r4 == 0) goto L_0x0043
            boolean r5 = r4.moveToFirst()     // Catch:{ all -> 0x0035 }
            if (r5 == 0) goto L_0x0034
            java.lang.String r5 = r4.getString(r0)     // Catch:{ all -> 0x0035 }
            boolean r0 = android.text.TextUtils.equals(r2, r5)     // Catch:{ all -> 0x0032 }
            goto L_0x0044
        L_0x0032:
            r6 = move-exception
            goto L_0x0038
        L_0x0034:
            goto L_0x0043
        L_0x0035:
            r5 = move-exception
            r6 = r5
            r5 = r3
        L_0x0038:
            r4.close()     // Catch:{ all -> 0x003c }
            goto L_0x0040
        L_0x003c:
            r4 = move-exception
            p000.dhr.m6455a(r6, r4)     // Catch:{ Exception -> 0x0041 }
        L_0x0040:
            throw r6     // Catch:{ Exception -> 0x0041 }
        L_0x0041:
            r4 = move-exception
            goto L_0x004d
        L_0x0043:
            r5 = r3
        L_0x0044:
            if (r4 != 0) goto L_0x0047
            goto L_0x0077
        L_0x0047:
            r4.close()     // Catch:{ Exception -> 0x004c }
            goto L_0x0077
        L_0x004c:
            r4 = move-exception
        L_0x004d:
            goto L_0x0051
        L_0x004f:
            r4 = move-exception
            r5 = r3
        L_0x0051:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r6 = java.lang.String.valueOf(r4)
            int r6 = r6.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r6 = r6 + 55
            r7.<init>(r6)
            java.lang.String r6 = "Error in retrieving foreground activity package name : "
            r7.append(r6)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.String r6 = "LaunchOnBootCompletedHelper"
            android.util.Log.e(r6, r4)
        L_0x0077:
            boolean r11 = p000.dhz.m6481a(r11)
            dbo r4 = r10.f8154a
            dbl r4 = (p000.dbl) r4
            dbp r4 = r4.f8153a
            r4.f8161f = r1
            r4.f8163h = r11
            r4.f8162g = r0
            r4.f8159d = r2
            r4.f8160e = r5
            r11 = 1
            r4.f8164i = r11
            dbn r11 = r10.f8155b
            cff r11 = (p000.cff) r11
            android.os.ConditionVariable r11 = r11.f5398a
            r11.open()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dbm.doInBackground(java.lang.Object[]):java.lang.Object");
    }
}
