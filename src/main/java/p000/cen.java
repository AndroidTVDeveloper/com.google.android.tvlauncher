package p000;

import android.content.Context;
import android.os.Bundle;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cen */
/* compiled from: PG */
abstract class cen implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final Context f5377a;

    /* renamed from: b */
    public final AtomicReference f5378b;

    /* renamed from: c */
    private final Thread.UncaughtExceptionHandler f5379c;

    /* renamed from: d */
    private final ceq f5380d;

    /* renamed from: e */
    private final ces f5381e;

    public cen(Context context, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, AtomicReference atomicReference, ceq ceq, ces ces) {
        this.f5377a = context;
        this.f5379c = uncaughtExceptionHandler;
        this.f5378b = atomicReference;
        this.f5380d = ceq;
        this.f5381e = ces;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2699a(Throwable th, String str, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo2700a();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: byi.a(android.content.ContentResolver, java.lang.String, boolean):boolean
     arg types: [android.content.ContentResolver, java.lang.String, int]
     candidates:
      byi.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object
      byi.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String
      byi.a(java.lang.Object, java.lang.String, java.lang.String):void
      byi.a(android.content.ContentResolver, java.lang.String, boolean):boolean */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d A[SYNTHETIC, Splitter:B:17:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void uncaughtException(java.lang.Thread r9, java.lang.Throwable r10) {
        /*
            r8 = this;
            java.lang.String r0 = "com.google.android.tvrecommendations"
            boolean r1 = r8.mo2700a()
            r2 = 0
            r3 = 0
            ceq r4 = r8.f5380d     // Catch:{ all -> 0x0083 }
            java.lang.String r5 = r10.getMessage()     // Catch:{ all -> 0x0083 }
            if (r5 != 0) goto L_0x0012
            java.lang.String r5 = ""
        L_0x0012:
            boolean r6 = p000.dcx.m6183a()     // Catch:{ all -> 0x0083 }
            if (r6 == 0) goto L_0x0023
            java.lang.String r6 = "Unable to start receiver com.google.android.tvlauncher.util.TestCrashReceiver"
            boolean r5 = r5.startsWith(r6)     // Catch:{ all -> 0x0083 }
            if (r5 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r4 = 0
            goto L_0x0031
        L_0x0023:
            cgf r4 = (p000.cgf) r4     // Catch:{ all -> 0x0083 }
            android.content.Context r4 = r4.f5458a     // Catch:{ all -> 0x0083 }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ all -> 0x0083 }
            java.lang.String r5 = "tvlauncher:silent_full_feedback_enabled"
            boolean r4 = p000.byi.m4371a(r4, r5, r2)     // Catch:{ all -> 0x0083 }
        L_0x0031:
            ces r5 = r8.f5381e     // Catch:{ all -> 0x007e }
            boolean r5 = r5.f5386a     // Catch:{ all -> 0x007e }
            if (r5 == 0) goto L_0x0039
            r2 = r4
            goto L_0x003b
        L_0x0039:
        L_0x003b:
            if (r2 == 0) goto L_0x0069
            ceq r4 = r8.f5380d     // Catch:{ all -> 0x0065 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x0065 }
            r6 = 2
            r5.<init>(r6)     // Catch:{ all -> 0x0065 }
            java.lang.String r6 = "com.google.android.tvrecommendations:version-code"
            r7 = r4
            cgf r7 = (p000.cgf) r7     // Catch:{ all -> 0x0065 }
            android.content.Context r7 = r7.f5458a     // Catch:{ all -> 0x0065 }
            int r7 = p000.dcr.m6171b(r7, r0)     // Catch:{ all -> 0x0065 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0065 }
            r5.putString(r6, r7)     // Catch:{ all -> 0x0065 }
            java.lang.String r6 = "com.google.android.tvrecommendations:version-name"
            cgf r4 = (p000.cgf) r4     // Catch:{ all -> 0x0065 }
            android.content.Context r4 = r4.f5458a     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = p000.dcr.m6166a(r4, r0)     // Catch:{ all -> 0x0065 }
            r5.putString(r6, r0)     // Catch:{ all -> 0x0065 }
            goto L_0x006b
        L_0x0065:
            r0 = move-exception
            r5 = r3
            goto L_0x0085
        L_0x0069:
            r5 = r3
        L_0x006b:
            if (r2 != 0) goto L_0x0072
            if (r1 != 0) goto L_0x0070
            goto L_0x0071
        L_0x0070:
        L_0x0071:
            goto L_0x007a
        L_0x0072:
            if (r1 == 0) goto L_0x0077
            java.lang.String r0 = "com.google.android.tvlauncher.SILENT_REPORT_FULL_MAIN_THREAD"
            goto L_0x0079
        L_0x0077:
            java.lang.String r0 = "com.google.android.tvlauncher.SILENT_REPORT_FULL_BACKGROUND_THREAD"
        L_0x0079:
            r3 = r0
        L_0x007a:
            goto L_0x008f
        L_0x007b:
            r0 = move-exception
            goto L_0x0085
        L_0x007e:
            r0 = move-exception
            r5 = r3
            r2 = r4
            goto L_0x0085
        L_0x0083:
            r0 = move-exception
            r5 = r3
        L_0x0085:
            java.lang.String r1 = "SilentFeedbackHandler"
            java.lang.String r4 = "An error occured reading options for exception reporting, skipping silent feedback."
            android.util.Log.e(r1, r4, r0)
        L_0x008f:
            if (r2 != 0) goto L_0x0092
            goto L_0x0095
        L_0x0092:
            r8.mo2699a(r10, r3, r5)
        L_0x0095:
            java.lang.Thread$UncaughtExceptionHandler r0 = r8.f5379c
            r0.uncaughtException(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cen.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
