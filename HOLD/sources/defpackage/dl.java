package defpackage;

import android.view.KeyEvent;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: dl  reason: default package */
/* compiled from: PG */
public final class dl {
    private static boolean a = false;
    private static Method b = null;

    public static boolean a(View view, KeyEvent keyEvent) {
        return dx.a(view, keyEvent);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.KeyEvent$Callback, java.lang.Object, android.view.Window$Callback] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(defpackage.dk r6, android.view.Window.Callback r7, android.view.KeyEvent r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x007f
            r6 = r7
            android.app.Activity r6 = (android.app.Activity) r6
            r6.onUserInteraction()
            android.view.Window r0 = r6.getWindow()
            r1 = 8
            boolean r1 = r0.hasFeature(r1)
            r2 = 1
            if (r1 == 0) goto L_0x005d
            android.app.ActionBar r6 = r6.getActionBar()
            int r1 = r8.getKeyCode()
            r3 = 82
            if (r1 != r3) goto L_0x005d
            if (r6 == 0) goto L_0x005d
            boolean r1 = defpackage.dl.a
            r3 = 0
            if (r1 != 0) goto L_0x0045
            java.lang.Class r1 = r6.getClass()     // Catch:{ NoSuchMethodException -> 0x0041 }
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0041 }
            java.lang.Class<android.view.KeyEvent> r5 = android.view.KeyEvent.class
            r4[r3] = r5     // Catch:{ NoSuchMethodException -> 0x0041 }
            java.lang.String r5 = "onMenuKeyEvent"
            java.lang.reflect.Method r1 = r1.getMethod(r5, r4)     // Catch:{ NoSuchMethodException -> 0x0041 }
            defpackage.dl.b = r1     // Catch:{ NoSuchMethodException -> 0x0041 }
            goto L_0x0042
        L_0x0041:
            r1 = move-exception
        L_0x0042:
            defpackage.dl.a = r2
        L_0x0045:
            java.lang.reflect.Method r1 = defpackage.dl.b
            if (r1 == 0) goto L_0x005d
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x005c, InvocationTargetException -> 0x005a }
            r4[r3] = r8     // Catch:{ IllegalAccessException -> 0x005c, InvocationTargetException -> 0x005a }
            java.lang.Object r6 = r1.invoke(r6, r4)     // Catch:{ IllegalAccessException -> 0x005c, InvocationTargetException -> 0x005a }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ IllegalAccessException -> 0x005c, InvocationTargetException -> 0x005a }
            boolean r6 = r6.booleanValue()     // Catch:{ IllegalAccessException -> 0x005c, InvocationTargetException -> 0x005a }
            if (r6 != 0) goto L_0x007d
            goto L_0x005d
        L_0x005a:
            r6 = move-exception
            goto L_0x005d
        L_0x005c:
            r6 = move-exception
        L_0x005d:
            boolean r6 = r0.superDispatchKeyEvent(r8)
            if (r6 != 0) goto L_0x007c
            android.view.View r6 = r0.getDecorView()
            boolean r0 = defpackage.dx.b(r6, r8)
            if (r0 == 0) goto L_0x006e
            goto L_0x007d
        L_0x006e:
            if (r6 == 0) goto L_0x0075
            android.view.KeyEvent$DispatcherState r6 = r6.getKeyDispatcherState()
            goto L_0x0077
        L_0x0075:
            r6 = 0
        L_0x0077:
            boolean r2 = r8.dispatch(r7, r6, r7)
            goto L_0x007e
        L_0x007c:
        L_0x007d:
        L_0x007e:
            return r2
        L_0x007f:
            boolean r6 = r6.a(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.a(dk, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }
}
