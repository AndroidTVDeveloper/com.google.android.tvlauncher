package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;

/* renamed from: cel */
/* compiled from: PG */
public class cel {
    @Deprecated
    /* renamed from: a */
    public boj mo2161a(Context context, Looper looper, bsv bsv, Object obj, boq boq, bor bor) {
        throw null;
    }

    /* renamed from: a */
    public static Object m4618a(cdv cdv) {
        long clearCallingIdentity;
        try {
            return cdv.mo2683a();
        } catch (SecurityException e) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            Object a = cdv.mo2683a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m4619a(android.content.Context r10, java.lang.Throwable r11, java.lang.String r12, android.os.Bundle r13) {
        /*
            java.lang.String r0 = "SilentFeedback"
            java.lang.StackTraceElement[] r1 = r11.getStackTrace()
            java.lang.StackTraceElement[] r2 = r11.getStackTrace()
            int r2 = r2.length
            r3 = 0
            if (r2 == 0) goto L_0x00db
            r2 = 0
            android.content.pm.PackageManager r4 = r10.getPackageManager()     // Catch:{ NameNotFoundException -> 0x004d }
            android.content.Context r5 = r10.getApplicationContext()     // Catch:{ NameNotFoundException -> 0x004d }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x004d }
            r6 = 2
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r6)     // Catch:{ NameNotFoundException -> 0x004d }
            if (r4 == 0) goto L_0x0049
            android.content.pm.ActivityInfo[] r5 = r4.receivers
            if (r5 != 0) goto L_0x0027
            goto L_0x004a
        L_0x0027:
            android.content.pm.ActivityInfo[] r4 = r4.receivers
            int r5 = r4.length
            r6 = 0
        L_0x002b:
            if (r6 >= r5) goto L_0x003f
            r7 = r4[r6]
            java.lang.String r8 = r7.name
            java.lang.String r9 = "com\\.google\\.android\\.libraries\\.social\\.silentfeedback\\.\\w*\\.SilentFeedbackReceiver"
            boolean r8 = r8.matches(r9)
            if (r8 != 0) goto L_0x003c
            int r6 = r6 + 1
            goto L_0x002b
        L_0x003c:
            java.lang.String r4 = r7.name
            goto L_0x0041
        L_0x003f:
            r4 = r3
        L_0x0041:
            if (r4 != 0) goto L_0x0055
            java.lang.String r4 = "Could not find SilentFeedbackReceiver, not sending crash info."
            android.util.Log.e(r0, r4)
            goto L_0x004b
        L_0x0049:
        L_0x004a:
        L_0x004b:
            r4 = r3
            goto L_0x0055
        L_0x004d:
            r4 = move-exception
            java.lang.String r5 = "Could not find our own package. This should never happen. Not sending crash info."
            android.util.Log.e(r0, r5, r4)
            r4 = r3
        L_0x0055:
            if (r4 == 0) goto L_0x00da
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.content.ComponentName r0 = new android.content.ComponentName
            android.content.Context r5 = r10.getApplicationContext()
            r0.<init>(r5, r4)
            r3.setComponent(r0)
            android.content.Context r0 = r10.getApplicationContext()
            java.lang.String r0 = r0.getPackageName()
            r3.setPackage(r0)
            android.app.ApplicationErrorReport$CrashInfo r0 = new android.app.ApplicationErrorReport$CrashInfo
            r0.<init>(r11)
            java.lang.String r4 = r0.exceptionMessage
            java.lang.String r0 = r0.stackTrace
            r1 = r1[r2]
            java.lang.String r5 = r1.getFileName()
            if (r5 == 0) goto L_0x0089
            java.lang.String r5 = r1.getFileName()
            goto L_0x008c
        L_0x0089:
            java.lang.String r5 = "Unknown Source"
        L_0x008c:
            java.lang.String r6 = "com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.excludePii"
            r3.putExtra(r6, r2)
            if (r4 == 0) goto L_0x0098
            java.lang.String r2 = "com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.exceptionMessage"
            r3.putExtra(r2, r4)
        L_0x0098:
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getName()
            java.lang.String r2 = "com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.exceptionClass"
            r3.putExtra(r2, r11)
            java.lang.String r11 = "com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.stackTrace"
            r3.putExtra(r11, r0)
            java.lang.String r11 = r1.getClassName()
            java.lang.String r0 = "com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.throwingClass"
            r3.putExtra(r0, r11)
            java.lang.String r11 = "com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.throwingFile"
            r3.putExtra(r11, r5)
            int r11 = r1.getLineNumber()
            java.lang.String r0 = "com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.throwingLine"
            r3.putExtra(r0, r11)
            java.lang.String r11 = r1.getMethodName()
            java.lang.String r0 = "com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.throwingMethod"
            r3.putExtra(r0, r11)
            if (r12 == 0) goto L_0x00d2
            java.lang.String r11 = "com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.categoryTag"
            r3.putExtra(r11, r12)
        L_0x00d2:
            if (r13 == 0) goto L_0x00dc
            java.lang.String r11 = "com.google.android.libraries.social.silentfeedback.SilentFeedbackReceiver.psdBundle"
            r3.putExtra(r11, r13)
            goto L_0x00dd
        L_0x00da:
            goto L_0x00dc
        L_0x00db:
        L_0x00dc:
        L_0x00dd:
            if (r3 == 0) goto L_0x00e2
            r10.sendBroadcast(r3)
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cel.m4619a(android.content.Context, java.lang.Throwable, java.lang.String, android.os.Bundle):void");
    }
}
