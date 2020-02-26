package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import java.util.List;

/* renamed from: ccx */
/* compiled from: PG */
public final class ccx {

    /* renamed from: a */
    private static volatile ActivityManager f5291a = null;

    /* renamed from: b */
    private static volatile boolean f5292b;

    private ccx() {
    }

    /* renamed from: a */
    public static ActivityManager m4548a(Context context) {
        if (f5291a == null) {
            synchronized (ccx.class) {
                if (f5291a == null) {
                    f5291a = (ActivityManager) context.getSystemService("activity");
                }
            }
        }
        return f5291a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044 A[SYNTHETIC, Splitter:B:14:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e A[SYNTHETIC, Splitter:B:21:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m4551d(android.content.Context r6) {
        /*
            java.lang.String r6 = r6.getPackageName()
            int r0 = android.os.Process.myPid()
            r1 = 0
            if (r0 <= 0) goto L_0x0056
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x004a, all -> 0x0041 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ IOException -> 0x004a, all -> 0x0041 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004a, all -> 0x0041 }
            r5 = 25
            r4.<init>(r5)     // Catch:{ IOException -> 0x004a, all -> 0x0041 }
            java.lang.String r5 = "/proc/"
            r4.append(r5)     // Catch:{ IOException -> 0x004a, all -> 0x0041 }
            r4.append(r0)     // Catch:{ IOException -> 0x004a, all -> 0x0041 }
            java.lang.String r0 = "/cmdline"
            r4.append(r0)     // Catch:{ IOException -> 0x004a, all -> 0x0041 }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x004a, all -> 0x0041 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x004a, all -> 0x0041 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x004a, all -> 0x0041 }
            java.lang.String r0 = r2.readLine()     // Catch:{ IOException -> 0x003f, all -> 0x003b }
            java.lang.String r0 = r0.trim()     // Catch:{ IOException -> 0x003f, all -> 0x003b }
            r2.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x0058
        L_0x0039:
            r2 = move-exception
            goto L_0x0058
        L_0x003b:
            r6 = move-exception
            r1 = r2
            goto L_0x0042
        L_0x003f:
            r0 = move-exception
            goto L_0x004c
        L_0x0041:
            r6 = move-exception
        L_0x0042:
            if (r1 == 0) goto L_0x0049
            r1.close()     // Catch:{ IOException -> 0x0048 }
            goto L_0x0049
        L_0x0048:
            r0 = move-exception
        L_0x0049:
            throw r6
        L_0x004a:
            r0 = move-exception
            r2 = r1
        L_0x004c:
            if (r2 == 0) goto L_0x0055
            r2.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0057
        L_0x0052:
            r0 = move-exception
            r0 = r1
            goto L_0x0058
        L_0x0055:
            goto L_0x0057
        L_0x0056:
        L_0x0057:
            r0 = r1
        L_0x0058:
            if (r0 != 0) goto L_0x005b
        L_0x005a:
            goto L_0x0077
        L_0x005b:
            if (r6 == 0) goto L_0x005a
            boolean r2 = r0.startsWith(r6)
            if (r2 == 0) goto L_0x0077
            int r6 = r6.length()
            int r2 = r0.length()
            if (r2 != r6) goto L_0x006f
            r0 = r1
            goto L_0x0077
        L_0x006f:
            int r6 = r6 + 1
            java.lang.String r6 = r0.substring(r6)
            return r6
        L_0x0077:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ccx.m4551d(android.content.Context):java.lang.String");
    }

    /* renamed from: b */
    public static boolean m4549b(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.importance == 100 && next.processName.contains(context.getPackageName())) {
                int i = Build.VERSION.SDK_INT;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m4550c(Context context) {
        int i = Build.VERSION.SDK_INT;
        return ((PowerManager) context.getSystemService("power")).isInteractive();
    }
}
