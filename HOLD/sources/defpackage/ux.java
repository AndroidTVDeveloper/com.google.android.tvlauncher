package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ux  reason: default package */
/* compiled from: PG */
public final class ux implements ug {
    private final Uri a;
    private final uz b;
    private InputStream c;

    private ux(Uri uri, uz uzVar) {
        this.a = uri;
        this.b = uzVar;
    }

    public final Class a() {
        return InputStream.class;
    }

    public final void c() {
    }

    public final int d() {
        return 1;
    }

    public static ux a(Context context, Uri uri, uy uyVar) {
        return new ux(uri, new uz(si.a(context).c.a(), uyVar, si.a(context).d, context.getContentResolver()));
    }

    public final void b() {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002c A[Catch:{ NullPointerException -> 0x005d, FileNotFoundException -> 0x00ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0034 A[Catch:{ NullPointerException -> 0x005d, FileNotFoundException -> 0x00ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x003d A[Catch:{ NullPointerException -> 0x005d, FileNotFoundException -> 0x00ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a3 A[Catch:{ NullPointerException -> 0x005d, FileNotFoundException -> 0x00ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c8 A[SYNTHETIC, Splitter:B:57:0x00c8] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d4 A[SYNTHETIC, Splitter:B:64:0x00d4] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00e0 A[SYNTHETIC, Splitter:B:71:0x00e0] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.sm r9, defpackage.uf r10) {
        /*
            r8 = this;
            uz r9 = r8.b     // Catch:{ FileNotFoundException -> 0x00ec }
            android.net.Uri r0 = r8.a     // Catch:{ FileNotFoundException -> 0x00ec }
            r1 = 0
            uy r2 = r9.a     // Catch:{ SecurityException -> 0x0030, all -> 0x0029 }
            android.database.Cursor r2 = r2.a(r0)     // Catch:{ SecurityException -> 0x0030, all -> 0x0029 }
            if (r2 != 0) goto L_0x000e
            goto L_0x001d
        L_0x000e:
            boolean r3 = r2.moveToFirst()     // Catch:{ SecurityException -> 0x0027, all -> 0x0024 }
            if (r3 == 0) goto L_0x001d
            r3 = 0
            java.lang.String r3 = r2.getString(r3)     // Catch:{ SecurityException -> 0x0027, all -> 0x0024 }
            r2.close()     // Catch:{ FileNotFoundException -> 0x00ec }
            goto L_0x0037
        L_0x001d:
            if (r2 == 0) goto L_0x0023
        L_0x001f:
            r2.close()     // Catch:{ FileNotFoundException -> 0x00ec }
            goto L_0x0036
        L_0x0023:
            goto L_0x0036
        L_0x0024:
            r9 = move-exception
            r1 = r2
            goto L_0x002a
        L_0x0027:
            r3 = move-exception
            goto L_0x0032
        L_0x0029:
            r9 = move-exception
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r1.close()     // Catch:{ FileNotFoundException -> 0x00ec }
        L_0x002f:
            throw r9     // Catch:{ FileNotFoundException -> 0x00ec }
        L_0x0030:
            r2 = move-exception
            r2 = r1
        L_0x0032:
            if (r2 == 0) goto L_0x0035
            goto L_0x001f
        L_0x0035:
        L_0x0036:
            r3 = r1
        L_0x0037:
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch:{ FileNotFoundException -> 0x00ec }
            if (r2 != 0) goto L_0x009f
            java.io.File r2 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00ec }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00ec }
            boolean r3 = r2.exists()     // Catch:{ FileNotFoundException -> 0x00ec }
            if (r3 == 0) goto L_0x009f
            long r3 = r2.length()     // Catch:{ FileNotFoundException -> 0x00ec }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x009e
            android.net.Uri r2 = android.net.Uri.fromFile(r2)     // Catch:{ FileNotFoundException -> 0x00ec }
            android.content.ContentResolver r9 = r9.c     // Catch:{ NullPointerException -> 0x005d }
            java.io.InputStream r9 = r9.openInputStream(r2)     // Catch:{ NullPointerException -> 0x005d }
            goto L_0x00a0
        L_0x005d:
            r9 = move-exception
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x00ec }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ FileNotFoundException -> 0x00ec }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ FileNotFoundException -> 0x00ec }
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ FileNotFoundException -> 0x00ec }
            int r3 = r3.length()     // Catch:{ FileNotFoundException -> 0x00ec }
            int r3 = r3 + 21
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ FileNotFoundException -> 0x00ec }
            int r4 = r4.length()     // Catch:{ FileNotFoundException -> 0x00ec }
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00ec }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00ec }
            java.lang.String r3 = "NPE opening uri: "
            r4.append(r3)     // Catch:{ FileNotFoundException -> 0x00ec }
            r4.append(r0)     // Catch:{ FileNotFoundException -> 0x00ec }
            java.lang.String r0 = " -> "
            r4.append(r0)     // Catch:{ FileNotFoundException -> 0x00ec }
            r4.append(r2)     // Catch:{ FileNotFoundException -> 0x00ec }
            java.lang.String r0 = r4.toString()     // Catch:{ FileNotFoundException -> 0x00ec }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x00ec }
            java.lang.Throwable r9 = r1.initCause(r9)     // Catch:{ FileNotFoundException -> 0x00ec }
            java.io.FileNotFoundException r9 = (java.io.FileNotFoundException) r9     // Catch:{ FileNotFoundException -> 0x00ec }
            throw r9     // Catch:{ FileNotFoundException -> 0x00ec }
        L_0x009e:
        L_0x009f:
            r9 = r1
        L_0x00a0:
            r0 = -1
            if (r9 == 0) goto L_0x00dd
            uz r2 = r8.b     // Catch:{ FileNotFoundException -> 0x00ec }
            android.net.Uri r3 = r8.a     // Catch:{ FileNotFoundException -> 0x00ec }
            android.content.ContentResolver r4 = r2.c     // Catch:{ IOException -> 0x00d0, NullPointerException -> 0x00ce, all -> 0x00c5 }
            java.io.InputStream r1 = r4.openInputStream(r3)     // Catch:{ IOException -> 0x00d0, NullPointerException -> 0x00ce, all -> 0x00c5 }
            java.util.List r3 = r2.d     // Catch:{ IOException -> 0x00c3, NullPointerException -> 0x00c1, all -> 0x00be }
            xe r2 = r2.b     // Catch:{ IOException -> 0x00c3, NullPointerException -> 0x00c1, all -> 0x00be }
            int r2 = defpackage.bro.b(r3, r1, r2)     // Catch:{ IOException -> 0x00c3, NullPointerException -> 0x00c1, all -> 0x00be }
            if (r1 != 0) goto L_0x00b8
        L_0x00b7:
            goto L_0x00de
        L_0x00b8:
            r1.close()     // Catch:{ IOException -> 0x00bc }
            goto L_0x00b7
        L_0x00bc:
            r1 = move-exception
            goto L_0x00de
        L_0x00be:
            r9 = move-exception
            goto L_0x00c6
        L_0x00c1:
            r2 = move-exception
            goto L_0x00c4
        L_0x00c3:
            r2 = move-exception
        L_0x00c4:
            goto L_0x00d1
        L_0x00c5:
            r9 = move-exception
        L_0x00c6:
            if (r1 == 0) goto L_0x00cd
            r1.close()     // Catch:{ IOException -> 0x00cc }
            goto L_0x00cd
        L_0x00cc:
            r0 = move-exception
        L_0x00cd:
            throw r9     // Catch:{ FileNotFoundException -> 0x00ec }
        L_0x00ce:
            r2 = move-exception
            goto L_0x00d1
        L_0x00d0:
            r2 = move-exception
        L_0x00d1:
            if (r1 != 0) goto L_0x00d4
            goto L_0x00dd
        L_0x00d4:
            r1.close()     // Catch:{ IOException -> 0x00da }
            r2 = -1
            goto L_0x00de
        L_0x00da:
            r1 = move-exception
            r2 = -1
            goto L_0x00de
        L_0x00dd:
            r2 = -1
        L_0x00de:
            if (r2 == r0) goto L_0x00e6
            um r0 = new um     // Catch:{ FileNotFoundException -> 0x00ec }
            r0.<init>(r9, r2)     // Catch:{ FileNotFoundException -> 0x00ec }
            r9 = r0
        L_0x00e6:
            r8.c = r9     // Catch:{ FileNotFoundException -> 0x00ec }
            r10.a(r9)
            return
        L_0x00ec:
            r9 = move-exception
            r10.a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux.a(sm, uf):void");
    }
}
