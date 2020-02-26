package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: clr  reason: default package */
/* compiled from: PG */
public final class clr {
    public final clx a;
    public final clm b;
    public final Object c;
    public final Set d;

    public clr(Context context) {
        Set set = clo.a;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append('/');
        sb.append(dcr.a(context, context.getPackageName()));
        sb.append("(Linux; U; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(Locale.getDefault().toString());
        String str = Build.MODEL;
        if (str.length() > 0) {
            sb.append("; ");
            sb.append(str);
        }
        String str2 = Build.ID;
        if (str2.length() > 0) {
            sb.append(" Build/");
            sb.append(str2);
        }
        sb.append(')');
        clq clq = new clq(sb.toString());
        clp clp = new clp((byte) 0);
        this.c = new Object();
        this.d = new HashSet();
        this.a = clq;
        this.b = clp;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (android.text.TextUtils.equals(r5, r6) != false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        r0 = r4.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r4.d.remove(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (android.text.TextUtils.isEmpty(r5) == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.c
            monitor-enter(r0)
            java.util.Set r1 = r4.d     // Catch:{ all -> 0x0080 }
            boolean r1 = r1.contains(r6)     // Catch:{ all -> 0x0080 }
            r2 = 0
            if (r1 != 0) goto L_0x007e
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r5 = 0
            goto L_0x002c
        L_0x0016:
            boolean r0 = android.text.TextUtils.equals(r5, r6)
            if (r0 != 0) goto L_0x002b
            java.lang.Object r0 = r4.c
            monitor-enter(r0)
            java.util.Set r3 = r4.d     // Catch:{ all -> 0x0028 }
            r3.remove(r5)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            r5 = 0
            goto L_0x002c
        L_0x0028:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r5
        L_0x002b:
            goto L_0x0014
        L_0x002c:
            r0 = 2
            if (r5 >= r0) goto L_0x007d
            clx r0 = r4.a     // Catch:{ IOException -> 0x0053, clt -> 0x0051, all -> 0x004f }
            java.net.HttpURLConnection r1 = r0.a(r6)     // Catch:{ IOException -> 0x0053, clt -> 0x0051, all -> 0x004f }
            java.lang.Object r0 = r4.c     // Catch:{ IOException -> 0x004d, clt -> 0x004b, all -> 0x0048 }
            monitor-enter(r0)     // Catch:{ IOException -> 0x004d, clt -> 0x004b, all -> 0x0048 }
            java.util.Set r3 = r4.d     // Catch:{ all -> 0x0045 }
            r3.add(r6)     // Catch:{ all -> 0x0045 }
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0043
            r1.disconnect()
        L_0x0043:
            r5 = 1
            return r5
        L_0x0045:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0045 }
            throw r3     // Catch:{ IOException -> 0x004d, clt -> 0x004b, all -> 0x0048 }
        L_0x0048:
            r5 = move-exception
            goto L_0x006e
        L_0x004b:
            r0 = move-exception
            goto L_0x004e
        L_0x004d:
            r0 = move-exception
        L_0x004e:
            goto L_0x0054
        L_0x004f:
            r5 = move-exception
            goto L_0x006e
        L_0x0051:
            r0 = move-exception
            goto L_0x0054
        L_0x0053:
            r0 = move-exception
        L_0x0054:
            if (r5 > 0) goto L_0x0074
            clm r0 = r4.b     // Catch:{ InterruptedException -> 0x005e }
            r0.a()     // Catch:{ InterruptedException -> 0x005e }
            goto L_0x0074
        L_0x005c:
            r5 = move-exception
            goto L_0x006c
        L_0x005e:
            r5 = move-exception
            java.lang.String r6 = "DoubleClickAdServer"
            java.lang.String r0 = "pingImpressionTrackingUrl interrupted: abort remaining connection retries."
            android.util.Log.e(r6, r0, r5)     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x006b
            r1.disconnect()
        L_0x006b:
            return r2
        L_0x006c:
        L_0x006e:
            if (r1 == 0) goto L_0x0073
            r1.disconnect()
        L_0x0073:
            throw r5
        L_0x0074:
            if (r1 != 0) goto L_0x0077
            goto L_0x007a
        L_0x0077:
            r1.disconnect()
        L_0x007a:
            int r5 = r5 + 1
            goto L_0x002c
        L_0x007d:
            return r2
        L_0x007e:
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            return r2
        L_0x0080:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0080 }
            goto L_0x0084
        L_0x0083:
            throw r5
        L_0x0084:
            goto L_0x0083
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clr.a(java.lang.String, java.lang.String):boolean");
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                HttpURLConnection a2 = this.a.a(str);
                if (a2 != null) {
                    a2.disconnect();
                    return;
                }
                return;
            } catch (clt | IOException e) {
                if (i <= 0) {
                    try {
                        this.b.a();
                    } catch (InterruptedException e2) {
                        Log.e("DoubleClickAdServer", "pingTrackingUrl interrupted: abort remaining connection retries.", e2);
                        return;
                    }
                }
                i++;
            }
        }
    }
}
