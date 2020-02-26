package defpackage;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bgg  reason: default package */
/* compiled from: PG */
public final class bgg extends bgq {
    public static final int[] a = new int[0];
    public final bgk b;
    public final AtomicReference c;

    public static int a(int i, int i2) {
        if (i == -1) {
            return i2 != -1 ? -1 : 0;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    public static boolean a(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public static int b(int i, int i2) {
        if (i <= i2) {
            return i2 <= i ? 0 : -1;
        }
        return 1;
    }

    @Deprecated
    public bgg() {
        this(new bfv());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Deprecated
    public bgg(bgk bgk) {
        super((byte) 0);
        bgc bgc = bgc.a;
        this.b = bgk;
        this.c = new AtomicReference(bgc);
    }

    protected static int a(akh akh, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(akh.A)) {
            return 4;
        }
        String a2 = a(str);
        String a3 = a(akh.A);
        if (a3 == null || a2 == null) {
            if (!z || a3 != null) {
                return 0;
            }
            return 1;
        } else if (a3.startsWith(a2) || a2.startsWith(a3)) {
            return 3;
        } else {
            if (blm.b(a3, "-")[0].equals(blm.b(a2, "-")[0])) {
                return 2;
            }
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List a(defpackage.ayc r12, int r13, int r14, boolean r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.a
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L_0x0009:
            int r3 = r12.a
            if (r2 >= r3) goto L_0x0017
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0017:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r2) goto L_0x00ac
            if (r14 == r2) goto L_0x00ac
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x0022:
            int r5 = r12.a
            if (r3 >= r5) goto L_0x0085
            akh r5 = r12.a(r3)
            int r6 = r5.n
            if (r6 > 0) goto L_0x002f
        L_0x002e:
            goto L_0x0082
        L_0x002f:
            int r7 = r5.o
            if (r7 <= 0) goto L_0x002e
            if (r15 != 0) goto L_0x0036
        L_0x0035:
            goto L_0x0047
        L_0x0036:
            r8 = 1
            if (r6 > r7) goto L_0x003b
            r9 = 0
            goto L_0x003c
        L_0x003b:
            r9 = 1
        L_0x003c:
            if (r13 > r14) goto L_0x0040
            r8 = 0
            goto L_0x0042
        L_0x0040:
        L_0x0042:
            if (r9 == r8) goto L_0x0035
            r8 = r13
            r9 = r14
            goto L_0x0049
        L_0x0047:
            r9 = r13
            r8 = r14
        L_0x0049:
            int r10 = r6 * r8
            int r11 = r7 * r9
            if (r10 >= r11) goto L_0x0059
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = defpackage.blm.a(r10, r7)
            r6.<init>(r7, r8)
            goto L_0x0064
        L_0x0059:
            android.graphics.Point r7 = new android.graphics.Point
            int r6 = defpackage.blm.a(r11, r6)
            r7.<init>(r9, r6)
            r6 = r7
        L_0x0064:
            int r7 = r5.n
            int r8 = r5.o
            int r8 = r8 * r7
            int r9 = r6.x
            float r9 = (float) r9
            r10 = 1065017672(0x3f7ae148, float:0.98)
            float r9 = r9 * r10
            int r9 = (int) r9
            if (r7 < r9) goto L_0x0082
            int r5 = r5.o
            int r6 = r6.y
            float r6 = (float) r6
            float r6 = r6 * r10
            int r6 = (int) r6
            if (r5 < r6) goto L_0x0082
            if (r8 >= r4) goto L_0x0082
            r4 = r8
        L_0x0082:
            int r3 = r3 + 1
            goto L_0x0022
        L_0x0085:
            if (r4 == r2) goto L_0x00ac
            int r13 = r0.size()
            r14 = -1
            int r13 = r13 + r14
        L_0x008d:
            if (r13 < 0) goto L_0x00ac
            java.lang.Object r15 = r0.get(r13)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            akh r15 = r12.a(r15)
            int r15 = r15.a()
            if (r15 != r14) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            if (r15 <= r4) goto L_0x00a9
        L_0x00a6:
            r0.remove(r13)
        L_0x00a9:
            int r13 = r13 + -1
            goto L_0x008d
        L_0x00ac:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgg.a(ayc, int, int, boolean):java.util.List");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgg.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      bgg.a(int, int):int
      bgg.a(int, boolean):boolean */
    public static boolean a(akh akh, int i, bfz bfz, int i2, boolean z, boolean z2, boolean z3) {
        String str;
        int i3;
        if (!a(i, false)) {
            return false;
        }
        int i4 = akh.e;
        if (i4 != -1 && i4 > i2) {
            return false;
        }
        if (!z3 && ((i3 = akh.v) == -1 || i3 != bfz.a)) {
            return false;
        }
        if (!z && ((str = akh.i) == null || !TextUtils.equals(str, bfz.c))) {
            return false;
        }
        if (z2) {
            return true;
        }
        int i5 = akh.w;
        return i5 != -1 && i5 == bfz.b;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgg.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      bgg.a(int, int):int
      bgg.a(int, boolean):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(java.lang.Object, java.lang.Object):boolean
     arg types: [java.lang.String, java.lang.String]
     candidates:
      blm.a(int, int):int
      blm.a(byte[], int):int
      blm.a(long, float):long
      blm.a(long, long):long
      blm.a(android.os.Looper, android.os.Handler$Callback):android.os.Handler
      blm.a(java.lang.String, int):java.lang.String
      blm.a(java.lang.String, java.lang.Object[]):java.lang.String
      blm.a(android.os.Parcel, boolean):void
      blm.a(long[], long):void
      blm.a(java.lang.Object[], java.lang.Object):boolean
      blm.a(java.util.List, long):long[]
      blm.a(java.lang.Object[], int):java.lang.Object[]
      blm.a(java.lang.String, java.lang.String):java.lang.String[]
      blm.a(java.lang.Object, java.lang.Object):boolean */
    public static boolean a(akh akh, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        if (!a(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !blm.a((Object) akh.i, (Object) str)) {
            return false;
        }
        int i7 = akh.n;
        if (i7 != -1 && i7 > i3) {
            return false;
        }
        int i8 = akh.o;
        if (i8 != -1 && i8 > i4) {
            return false;
        }
        float f = akh.p;
        if (f != -1.0f && f > ((float) i5)) {
            return false;
        }
        int i9 = akh.e;
        return i9 == -1 || i9 <= i6;
    }

    protected static String a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }
}
