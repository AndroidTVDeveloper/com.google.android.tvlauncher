package p000;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: bym */
/* compiled from: PG */
public final class bym {

    /* renamed from: a */
    private static UserManager f5020a;

    /* renamed from: b */
    private static volatile boolean f5021b = false;

    static {
        int i = Build.VERSION.SDK_INT;
    }

    private bym() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0055, code lost:
        return r5;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m4382b(android.content.Context r7) {
        /*
            boolean r0 = p000.bym.f5021b
            r1 = 1
            if (r0 != 0) goto L_0x0059
            java.lang.Class<bym> r0 = p000.bym.class
            monitor-enter(r0)
            boolean r2 = p000.bym.f5021b     // Catch:{ all -> 0x0056 }
            if (r2 == 0) goto L_0x000e
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            return r1
        L_0x000e:
            r2 = 1
        L_0x000f:
            r3 = 2
            r4 = 0
            r5 = 0
            if (r2 > r3) goto L_0x004a
            android.os.UserManager r3 = p000.bym.f5020a     // Catch:{ all -> 0x0056 }
            if (r3 != 0) goto L_0x0022
            java.lang.Class<android.os.UserManager> r3 = android.os.UserManager.class
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch:{ all -> 0x0056 }
            android.os.UserManager r3 = (android.os.UserManager) r3     // Catch:{ all -> 0x0056 }
            p000.bym.f5020a = r3     // Catch:{ all -> 0x0056 }
        L_0x0022:
            android.os.UserManager r3 = p000.bym.f5020a     // Catch:{ all -> 0x0056 }
            if (r3 == 0) goto L_0x0047
            boolean r6 = r3.isUserUnlocked()     // Catch:{ NullPointerException -> 0x003a }
            if (r6 != 0) goto L_0x0038
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch:{ NullPointerException -> 0x003a }
            boolean r7 = r3.isUserRunning(r6)     // Catch:{ NullPointerException -> 0x003a }
            if (r7 == 0) goto L_0x0037
            goto L_0x004b
        L_0x0037:
        L_0x0038:
            r5 = 1
            goto L_0x004c
        L_0x003a:
            r3 = move-exception
            java.lang.String r5 = "DirectBootUtils"
            java.lang.String r6 = "Failed to check if user is unlocked."
            android.util.Log.w(r5, r6, r3)     // Catch:{ all -> 0x0056 }
            p000.bym.f5020a = r4     // Catch:{ all -> 0x0056 }
            int r2 = r2 + 1
            goto L_0x000f
        L_0x0047:
            r5 = 1
            goto L_0x0050
        L_0x004a:
        L_0x004b:
        L_0x004c:
            if (r5 == 0) goto L_0x0050
            p000.bym.f5020a = r4     // Catch:{ all -> 0x0056 }
        L_0x0050:
            if (r5 == 0) goto L_0x0054
            p000.bym.f5021b = r1     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            return r5
        L_0x0056:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            throw r7
        L_0x0059:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bym.m4382b(android.content.Context):boolean");
    }

    /* renamed from: a */
    public static boolean m4381a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return !m4382b(context);
    }

    /* renamed from: a */
    public static void m4380a() {
        int i = Build.VERSION.SDK_INT;
    }
}
