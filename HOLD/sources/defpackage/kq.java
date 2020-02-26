package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: kq  reason: default package */
/* compiled from: PG */
public final class kq {
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static kq b;
    private static final cs h = new cs();
    private WeakHashMap c;
    private final WeakHashMap d = new WeakHashMap(0);
    private TypedValue e;
    private boolean f;
    private kp g;

    private final synchronized void a(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            cr crVar = (cr) this.d.get(context);
            if (crVar == null) {
                crVar = new cr();
                this.d.put(context, crVar);
            }
            crVar.a(j, new WeakReference(constantState));
        }
    }

    public static synchronized kq a() {
        kq kqVar;
        synchronized (kq.class) {
            if (b == null) {
                b = new kq();
                int i = Build.VERSION.SDK_INT;
            }
            kqVar = b;
        }
        return kqVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized android.graphics.drawable.Drawable a(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap r0 = r3.d     // Catch:{ all -> 0x0046 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0046 }
            cr r0 = (defpackage.cr) r0     // Catch:{ all -> 0x0046 }
            r1 = 0
            if (r0 == 0) goto L_0x0044
            java.lang.Object r2 = r0.a(r5)     // Catch:{ all -> 0x0046 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0046 }
            if (r2 == 0) goto L_0x0042
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0046 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0046 }
            if (r2 != 0) goto L_0x0038
            long[] r4 = r0.c     // Catch:{ all -> 0x0046 }
            int r2 = r0.e     // Catch:{ all -> 0x0046 }
            int r4 = defpackage.cq.a(r4, r2, r5)     // Catch:{ all -> 0x0046 }
            if (r4 < 0) goto L_0x0042
            java.lang.Object[] r5 = r0.d     // Catch:{ all -> 0x0046 }
            r5 = r5[r4]     // Catch:{ all -> 0x0046 }
            java.lang.Object r6 = defpackage.cr.a     // Catch:{ all -> 0x0046 }
            if (r5 == r6) goto L_0x0042
            java.lang.Object[] r5 = r0.d     // Catch:{ all -> 0x0046 }
            java.lang.Object r6 = defpackage.cr.a     // Catch:{ all -> 0x0046 }
            r5[r4] = r6     // Catch:{ all -> 0x0046 }
            r4 = 1
            r0.b = r4     // Catch:{ all -> 0x0046 }
            goto L_0x0042
        L_0x0038:
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0046 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0046 }
            monitor-exit(r3)
            return r4
        L_0x0042:
            monitor-exit(r3)
            return r1
        L_0x0044:
            monitor-exit(r3)
            return r1
        L_0x0046:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq.a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable a(Context context, int i) {
        return c(context, i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
     arg types: [int, android.util.TypedValue, int]
     candidates:
      ClspMth{android.content.res.Resources.getValue(java.lang.String, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
      ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException} */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized android.graphics.drawable.Drawable c(android.content.Context r11, int r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r0 = r10.f     // Catch:{ all -> 0x01bb }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0032
            r10.f = r2     // Catch:{ all -> 0x01bb }
            r0 = 2131230805(0x7f080055, float:1.8077673E38)
            android.graphics.drawable.Drawable r0 = r10.a(r11, r0)     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x0027
            boolean r3 = r0 instanceof defpackage.sg     // Catch:{ all -> 0x01bb }
            if (r3 != 0) goto L_0x0032
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x01bb }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x01bb }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x0027
            goto L_0x0032
        L_0x0027:
            r10.f = r1     // Catch:{ all -> 0x01bb }
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01bb }
            java.lang.String r12 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r11.<init>(r12)     // Catch:{ all -> 0x01bb }
            throw r11     // Catch:{ all -> 0x01bb }
        L_0x0032:
            android.util.TypedValue r0 = r10.e     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x0037
            goto L_0x003e
        L_0x0037:
            android.util.TypedValue r0 = new android.util.TypedValue     // Catch:{ all -> 0x01bb }
            r0.<init>()     // Catch:{ all -> 0x01bb }
            r10.e = r0     // Catch:{ all -> 0x01bb }
        L_0x003e:
            android.util.TypedValue r0 = r10.e     // Catch:{ all -> 0x01bb }
            android.content.res.Resources r3 = r11.getResources()     // Catch:{ all -> 0x01bb }
            r3.getValue(r12, r0, r2)     // Catch:{ all -> 0x01bb }
            int r3 = r0.assetCookie     // Catch:{ all -> 0x01bb }
            long r3 = (long) r3     // Catch:{ all -> 0x01bb }
            r5 = 32
            long r3 = r3 << r5
            int r5 = r0.data     // Catch:{ all -> 0x01bb }
            long r5 = (long) r5     // Catch:{ all -> 0x01bb }
            long r3 = r3 | r5
            android.graphics.drawable.Drawable r5 = r10.a(r11, r3)     // Catch:{ all -> 0x01bb }
            r6 = 0
            if (r5 != 0) goto L_0x0088
            kp r5 = r10.g     // Catch:{ all -> 0x01bb }
            if (r5 == 0) goto L_0x007d
            r5 = 2131230736(0x7f080010, float:1.8077533E38)
            if (r12 != r5) goto L_0x007c
            android.graphics.drawable.LayerDrawable r5 = new android.graphics.drawable.LayerDrawable     // Catch:{ all -> 0x01bb }
            r7 = 2
            android.graphics.drawable.Drawable[] r7 = new android.graphics.drawable.Drawable[r7]     // Catch:{ all -> 0x01bb }
            r8 = 2131230735(0x7f08000f, float:1.8077531E38)
            android.graphics.drawable.Drawable r8 = r10.a(r11, r8)     // Catch:{ all -> 0x01bb }
            r7[r1] = r8     // Catch:{ all -> 0x01bb }
            r8 = 2131230737(0x7f080011, float:1.8077535E38)
            android.graphics.drawable.Drawable r8 = r10.a(r11, r8)     // Catch:{ all -> 0x01bb }
            r7[r2] = r8     // Catch:{ all -> 0x01bb }
            r5.<init>(r7)     // Catch:{ all -> 0x01bb }
            goto L_0x007e
        L_0x007c:
        L_0x007d:
            r5 = r6
        L_0x007e:
            if (r5 == 0) goto L_0x0088
            int r0 = r0.changingConfigurations     // Catch:{ all -> 0x01bb }
            r5.setChangingConfigurations(r0)     // Catch:{ all -> 0x01bb }
            r10.a(r11, r3, r5)     // Catch:{ all -> 0x01bb }
        L_0x0088:
            if (r5 != 0) goto L_0x008e
            android.graphics.drawable.Drawable r5 = defpackage.bg.a(r11, r12)     // Catch:{ all -> 0x01bb }
        L_0x008e:
            if (r5 == 0) goto L_0x01ae
            android.content.res.ColorStateList r0 = r10.b(r11, r12)     // Catch:{ all -> 0x01bb }
            if (r0 != 0) goto L_0x018e
            kp r0 = r10.g     // Catch:{ all -> 0x01bb }
            r3 = 2130968689(0x7f040071, float:1.7546039E38)
            r4 = 2130968691(0x7f040073, float:1.7546043E38)
            if (r0 == 0) goto L_0x0116
            r6 = 2131230786(0x7f080042, float:1.8077635E38)
            r7 = 16908301(0x102000d, float:2.3877265E-38)
            r8 = 16908303(0x102000f, float:2.387727E-38)
            r9 = 16908288(0x1020000, float:2.387723E-38)
            if (r12 != r6) goto L_0x00d9
            r12 = r5
            android.graphics.drawable.LayerDrawable r12 = (android.graphics.drawable.LayerDrawable) r12     // Catch:{ all -> 0x01bb }
            android.graphics.drawable.Drawable r0 = r12.findDrawableByLayerId(r9)     // Catch:{ all -> 0x01bb }
            int r1 = defpackage.kv.a(r11, r4)     // Catch:{ all -> 0x01bb }
            android.graphics.PorterDuff$Mode r2 = defpackage.ha.a     // Catch:{ all -> 0x01bb }
            defpackage.gz.a(r0, r1, r2)     // Catch:{ all -> 0x01bb }
            android.graphics.drawable.Drawable r0 = r12.findDrawableByLayerId(r8)     // Catch:{ all -> 0x01bb }
            int r1 = defpackage.kv.a(r11, r4)     // Catch:{ all -> 0x01bb }
            android.graphics.PorterDuff$Mode r2 = defpackage.ha.a     // Catch:{ all -> 0x01bb }
            defpackage.gz.a(r0, r1, r2)     // Catch:{ all -> 0x01bb }
            android.graphics.drawable.Drawable r12 = r12.findDrawableByLayerId(r7)     // Catch:{ all -> 0x01bb }
            int r11 = defpackage.kv.a(r11, r3)     // Catch:{ all -> 0x01bb }
            android.graphics.PorterDuff$Mode r0 = defpackage.ha.a     // Catch:{ all -> 0x01bb }
            defpackage.gz.a(r12, r11, r0)     // Catch:{ all -> 0x01bb }
            goto L_0x01ae
        L_0x00d9:
            r6 = 2131230777(0x7f080039, float:1.8077616E38)
            if (r12 == r6) goto L_0x00e9
            r6 = 2131230776(0x7f080038, float:1.8077614E38)
            if (r12 == r6) goto L_0x00e9
            r6 = 2131230778(0x7f08003a, float:1.8077618E38)
            if (r12 == r6) goto L_0x00e9
            goto L_0x0116
        L_0x00e9:
            r12 = r5
            android.graphics.drawable.LayerDrawable r12 = (android.graphics.drawable.LayerDrawable) r12     // Catch:{ all -> 0x01bb }
            android.graphics.drawable.Drawable r0 = r12.findDrawableByLayerId(r9)     // Catch:{ all -> 0x01bb }
            int r1 = defpackage.kv.c(r11, r4)     // Catch:{ all -> 0x01bb }
            android.graphics.PorterDuff$Mode r2 = defpackage.ha.a     // Catch:{ all -> 0x01bb }
            defpackage.gz.a(r0, r1, r2)     // Catch:{ all -> 0x01bb }
            android.graphics.drawable.Drawable r0 = r12.findDrawableByLayerId(r8)     // Catch:{ all -> 0x01bb }
            int r1 = defpackage.kv.a(r11, r3)     // Catch:{ all -> 0x01bb }
            android.graphics.PorterDuff$Mode r2 = defpackage.ha.a     // Catch:{ all -> 0x01bb }
            defpackage.gz.a(r0, r1, r2)     // Catch:{ all -> 0x01bb }
            android.graphics.drawable.Drawable r12 = r12.findDrawableByLayerId(r7)     // Catch:{ all -> 0x01bb }
            int r11 = defpackage.kv.a(r11, r3)     // Catch:{ all -> 0x01bb }
            android.graphics.PorterDuff$Mode r0 = defpackage.ha.a     // Catch:{ all -> 0x01bb }
            defpackage.gz.a(r12, r11, r0)     // Catch:{ all -> 0x01bb }
            goto L_0x01b4
        L_0x0116:
            if (r0 == 0) goto L_0x01ae
            android.graphics.PorterDuff$Mode r6 = defpackage.ha.a     // Catch:{ all -> 0x01bb }
            r7 = r0
            gz r7 = (defpackage.gz) r7     // Catch:{ all -> 0x01bb }
            int[] r7 = r7.a     // Catch:{ all -> 0x01bb }
            boolean r7 = defpackage.gz.a(r7, r12)     // Catch:{ all -> 0x01bb }
            r8 = 16842801(0x1010031, float:2.3693695E-38)
            r9 = -1
            if (r7 == 0) goto L_0x012e
            r12 = -1
            r1 = 2130968691(0x7f040073, float:1.7546043E38)
            goto L_0x016d
        L_0x012e:
            r4 = r0
            gz r4 = (defpackage.gz) r4     // Catch:{ all -> 0x01bb }
            int[] r4 = r4.c     // Catch:{ all -> 0x01bb }
            boolean r4 = defpackage.gz.a(r4, r12)     // Catch:{ all -> 0x01bb }
            if (r4 != 0) goto L_0x0169
            gz r0 = (defpackage.gz) r0     // Catch:{ all -> 0x01bb }
            int[] r0 = r0.d     // Catch:{ all -> 0x01bb }
            boolean r0 = defpackage.gz.a(r0, r12)     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x014b
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch:{ all -> 0x01bb }
            r12 = -1
            r1 = 16842801(0x1010031, float:2.3693695E-38)
            goto L_0x016d
        L_0x014b:
            r0 = 2131230763(0x7f08002b, float:1.8077588E38)
            if (r12 != r0) goto L_0x015c
            r12 = 1109603123(0x42233333, float:40.8)
            int r12 = java.lang.Math.round(r12)     // Catch:{ all -> 0x01bb }
            r1 = 16842800(0x1010030, float:2.3693693E-38)
            goto L_0x016d
        L_0x015c:
            r0 = 2131230739(0x7f080013, float:1.807754E38)
            if (r12 != r0) goto L_0x0166
            r12 = -1
            r1 = 16842801(0x1010031, float:2.3693695E-38)
            goto L_0x016d
        L_0x0166:
            r12 = -1
            r2 = 0
            goto L_0x016d
        L_0x0169:
            r12 = -1
            r1 = 2130968689(0x7f040071, float:1.7546039E38)
        L_0x016d:
            if (r2 != 0) goto L_0x0170
            goto L_0x01ae
        L_0x0170:
            boolean r0 = defpackage.ib.b(r5)     // Catch:{ all -> 0x01bb }
            if (r0 == 0) goto L_0x017b
            android.graphics.drawable.Drawable r0 = r5.mutate()     // Catch:{ all -> 0x01bb }
            goto L_0x017c
        L_0x017b:
            r0 = r5
        L_0x017c:
            int r11 = defpackage.kv.a(r11, r1)     // Catch:{ all -> 0x01bb }
            android.graphics.PorterDuffColorFilter r11 = defpackage.ha.a(r11, r6)     // Catch:{ all -> 0x01bb }
            r0.setColorFilter(r11)     // Catch:{ all -> 0x01bb }
            if (r12 == r9) goto L_0x01ae
            r0.setAlpha(r12)     // Catch:{ all -> 0x01bb }
            goto L_0x01b4
        L_0x018e:
            boolean r11 = defpackage.ib.b(r5)     // Catch:{ all -> 0x01bb }
            if (r11 == 0) goto L_0x0199
            android.graphics.drawable.Drawable r5 = r5.mutate()     // Catch:{ all -> 0x01bb }
            goto L_0x019a
        L_0x0199:
        L_0x019a:
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01bb }
            defpackage.bq.a(r5, r0)     // Catch:{ all -> 0x01bb }
            kp r11 = r10.g     // Catch:{ all -> 0x01bb }
            if (r11 == 0) goto L_0x01ac
            r11 = 2131230789(0x7f080045, float:1.807764E38)
            if (r12 != r11) goto L_0x01ab
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch:{ all -> 0x01bb }
            goto L_0x01ac
        L_0x01ab:
        L_0x01ac:
            if (r6 != 0) goto L_0x01af
        L_0x01ae:
            goto L_0x01b4
        L_0x01af:
            defpackage.bq.a(r5, r6)     // Catch:{ all -> 0x01bb }
        L_0x01b4:
            if (r5 == 0) goto L_0x01b9
            defpackage.ib.a()     // Catch:{ all -> 0x01bb }
        L_0x01b9:
            monitor-exit(r10)
            return r5
        L_0x01bb:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq.c(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public static synchronized PorterDuffColorFilter a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (kq.class) {
            porterDuffColorFilter = (PorterDuffColorFilter) h.a(Integer.valueOf(cs.a(i, mode)));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) h.a(Integer.valueOf(cs.a(i, mode)), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0206, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0208, code lost:
        return r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.res.ColorStateList b(android.content.Context r10, int r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.WeakHashMap r0 = r9.c     // Catch:{ all -> 0x0209 }
            r1 = 0
            if (r0 != 0) goto L_0x0008
        L_0x0006:
            r0 = r1
            goto L_0x002d
        L_0x0008:
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x0209 }
            de r0 = (defpackage.de) r0     // Catch:{ all -> 0x0209 }
            if (r0 == 0) goto L_0x002c
            int[] r2 = r0.c     // Catch:{ all -> 0x0209 }
            int r3 = r0.e     // Catch:{ all -> 0x0209 }
            int r2 = defpackage.cq.a(r2, r3, r11)     // Catch:{ all -> 0x0209 }
            if (r2 < 0) goto L_0x0028
            java.lang.Object[] r3 = r0.d     // Catch:{ all -> 0x0209 }
            r3 = r3[r2]     // Catch:{ all -> 0x0209 }
            java.lang.Object r4 = defpackage.de.a     // Catch:{ all -> 0x0209 }
            if (r3 == r4) goto L_0x0027
            java.lang.Object[] r0 = r0.d     // Catch:{ all -> 0x0209 }
            r0 = r0[r2]     // Catch:{ all -> 0x0209 }
            goto L_0x0029
        L_0x0027:
        L_0x0028:
            r0 = r1
        L_0x0029:
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch:{ all -> 0x0209 }
            goto L_0x002d
        L_0x002c:
            goto L_0x0006
        L_0x002d:
            if (r0 != 0) goto L_0x0207
            kp r0 = r9.g     // Catch:{ all -> 0x0209 }
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0145
            r4 = 2131230740(0x7f080014, float:1.8077541E38)
            if (r11 != r4) goto L_0x0043
            r0 = 2131099668(0x7f060014, float:1.7811696E38)
            android.content.res.ColorStateList r1 = defpackage.es.a(r10, r0)     // Catch:{ all -> 0x0209 }
            goto L_0x0146
        L_0x0043:
            r4 = 2131230790(0x7f080046, float:1.8077643E38)
            if (r11 != r4) goto L_0x0052
            r0 = 2131099671(0x7f060017, float:1.7811702E38)
            android.content.res.ColorStateList r1 = defpackage.es.a(r10, r0)     // Catch:{ all -> 0x0209 }
            r0 = r1
            goto L_0x0147
        L_0x0052:
            r4 = 2131230789(0x7f080045, float:1.807764E38)
            if (r11 != r4) goto L_0x00b5
            r0 = 3
            int[][] r1 = new int[r0][]     // Catch:{ all -> 0x0209 }
            int[] r0 = new int[r0]     // Catch:{ all -> 0x0209 }
            r4 = 2130968696(0x7f040078, float:1.7546053E38)
            android.content.res.ColorStateList r5 = defpackage.kv.b(r10, r4)     // Catch:{ all -> 0x0209 }
            r6 = 2130968689(0x7f040071, float:1.7546039E38)
            r7 = 2
            if (r5 == 0) goto L_0x008e
            boolean r8 = r5.isStateful()     // Catch:{ all -> 0x0209 }
            if (r8 == 0) goto L_0x008e
            int[] r4 = defpackage.kv.a     // Catch:{ all -> 0x0209 }
            r1[r3] = r4     // Catch:{ all -> 0x0209 }
            int r4 = r5.getColorForState(r4, r3)     // Catch:{ all -> 0x0209 }
            r0[r3] = r4     // Catch:{ all -> 0x0209 }
            int[] r4 = defpackage.kv.d     // Catch:{ all -> 0x0209 }
            r1[r2] = r4     // Catch:{ all -> 0x0209 }
            int r4 = defpackage.kv.a(r10, r6)     // Catch:{ all -> 0x0209 }
            r0[r2] = r4     // Catch:{ all -> 0x0209 }
            int[] r4 = defpackage.kv.e     // Catch:{ all -> 0x0209 }
            r1[r7] = r4     // Catch:{ all -> 0x0209 }
            int r4 = r5.getDefaultColor()     // Catch:{ all -> 0x0209 }
            r0[r7] = r4     // Catch:{ all -> 0x0209 }
            goto L_0x00ac
        L_0x008e:
            int[] r5 = defpackage.kv.a     // Catch:{ all -> 0x0209 }
            r1[r3] = r5     // Catch:{ all -> 0x0209 }
            int r5 = defpackage.kv.c(r10, r4)     // Catch:{ all -> 0x0209 }
            r0[r3] = r5     // Catch:{ all -> 0x0209 }
            int[] r5 = defpackage.kv.d     // Catch:{ all -> 0x0209 }
            r1[r2] = r5     // Catch:{ all -> 0x0209 }
            int r5 = defpackage.kv.a(r10, r6)     // Catch:{ all -> 0x0209 }
            r0[r2] = r5     // Catch:{ all -> 0x0209 }
            int[] r5 = defpackage.kv.e     // Catch:{ all -> 0x0209 }
            r1[r7] = r5     // Catch:{ all -> 0x0209 }
            int r4 = defpackage.kv.a(r10, r4)     // Catch:{ all -> 0x0209 }
            r0[r7] = r4     // Catch:{ all -> 0x0209 }
        L_0x00ac:
            android.content.res.ColorStateList r4 = new android.content.res.ColorStateList     // Catch:{ all -> 0x0209 }
            r4.<init>(r1, r0)     // Catch:{ all -> 0x0209 }
            r0 = r4
            goto L_0x0147
        L_0x00b5:
            r4 = 2131230728(0x7f080008, float:1.8077517E38)
            if (r11 != r4) goto L_0x00c8
            r0 = 2130968688(0x7f040070, float:1.7546037E38)
            int r0 = defpackage.kv.a(r10, r0)     // Catch:{ all -> 0x0209 }
            android.content.res.ColorStateList r1 = defpackage.gz.a(r10, r0)     // Catch:{ all -> 0x0209 }
            r0 = r1
            goto L_0x0147
        L_0x00c8:
            r4 = 2131230722(0x7f080002, float:1.8077505E38)
            if (r11 != r4) goto L_0x00d4
            android.content.res.ColorStateList r1 = defpackage.gz.a(r10, r3)     // Catch:{ all -> 0x0209 }
            r0 = r1
            goto L_0x0147
        L_0x00d4:
            r4 = 2131230727(0x7f080007, float:1.8077515E38)
            if (r11 != r4) goto L_0x00e7
            r0 = 2130968686(0x7f04006e, float:1.7546033E38)
            int r0 = defpackage.kv.a(r10, r0)     // Catch:{ all -> 0x0209 }
            android.content.res.ColorStateList r1 = defpackage.gz.a(r10, r0)     // Catch:{ all -> 0x0209 }
            r0 = r1
            goto L_0x0147
        L_0x00e7:
            r4 = 2131230787(0x7f080043, float:1.8077637E38)
            if (r11 != r4) goto L_0x00ed
            goto L_0x013c
        L_0x00ed:
            r4 = 2131230788(0x7f080044, float:1.8077639E38)
            if (r11 == r4) goto L_0x013c
            r4 = r0
            gz r4 = (defpackage.gz) r4     // Catch:{ all -> 0x0209 }
            int[] r4 = r4.b     // Catch:{ all -> 0x0209 }
            boolean r4 = defpackage.gz.a(r4, r11)     // Catch:{ all -> 0x0209 }
            if (r4 == 0) goto L_0x0106
            r0 = 2130968691(0x7f040073, float:1.7546043E38)
            android.content.res.ColorStateList r1 = defpackage.kv.b(r10, r0)     // Catch:{ all -> 0x0209 }
            r0 = r1
            goto L_0x0147
        L_0x0106:
            r4 = r0
            gz r4 = (defpackage.gz) r4     // Catch:{ all -> 0x0209 }
            int[] r4 = r4.e     // Catch:{ all -> 0x0209 }
            boolean r4 = defpackage.gz.a(r4, r11)     // Catch:{ all -> 0x0209 }
            if (r4 == 0) goto L_0x011a
            r0 = 2131099667(0x7f060013, float:1.7811694E38)
            android.content.res.ColorStateList r1 = defpackage.es.a(r10, r0)     // Catch:{ all -> 0x0209 }
            r0 = r1
            goto L_0x0147
        L_0x011a:
            gz r0 = (defpackage.gz) r0     // Catch:{ all -> 0x0209 }
            int[] r0 = r0.f     // Catch:{ all -> 0x0209 }
            boolean r0 = defpackage.gz.a(r0, r11)     // Catch:{ all -> 0x0209 }
            if (r0 == 0) goto L_0x012d
            r0 = 2131099666(0x7f060012, float:1.7811692E38)
            android.content.res.ColorStateList r1 = defpackage.es.a(r10, r0)     // Catch:{ all -> 0x0209 }
            r0 = r1
            goto L_0x0147
        L_0x012d:
            r0 = 2131230784(0x7f080040, float:1.807763E38)
            if (r11 == r0) goto L_0x0133
            goto L_0x0146
        L_0x0133:
            r0 = 2131099669(0x7f060015, float:1.7811698E38)
            android.content.res.ColorStateList r1 = defpackage.es.a(r10, r0)     // Catch:{ all -> 0x0209 }
            r0 = r1
            goto L_0x0147
        L_0x013c:
            r0 = 2131099670(0x7f060016, float:1.78117E38)
            android.content.res.ColorStateList r1 = defpackage.es.a(r10, r0)     // Catch:{ all -> 0x0209 }
            r0 = r1
            goto L_0x0147
        L_0x0145:
        L_0x0146:
            r0 = r1
        L_0x0147:
            if (r0 == 0) goto L_0x0207
            java.util.WeakHashMap r1 = r9.c     // Catch:{ all -> 0x0209 }
            if (r1 == 0) goto L_0x014e
            goto L_0x0155
        L_0x014e:
            java.util.WeakHashMap r1 = new java.util.WeakHashMap     // Catch:{ all -> 0x0209 }
            r1.<init>()     // Catch:{ all -> 0x0209 }
            r9.c = r1     // Catch:{ all -> 0x0209 }
        L_0x0155:
            java.util.WeakHashMap r1 = r9.c     // Catch:{ all -> 0x0209 }
            java.lang.Object r1 = r1.get(r10)     // Catch:{ all -> 0x0209 }
            de r1 = (defpackage.de) r1     // Catch:{ all -> 0x0209 }
            if (r1 != 0) goto L_0x0169
            de r1 = new de     // Catch:{ all -> 0x0209 }
            r1.<init>()     // Catch:{ all -> 0x0209 }
            java.util.WeakHashMap r4 = r9.c     // Catch:{ all -> 0x0209 }
            r4.put(r10, r1)     // Catch:{ all -> 0x0209 }
        L_0x0169:
            int r10 = r1.e     // Catch:{ all -> 0x0209 }
            if (r10 == 0) goto L_0x01db
            int[] r4 = r1.c     // Catch:{ all -> 0x0209 }
            int r5 = r10 + -1
            r5 = r4[r5]     // Catch:{ all -> 0x0209 }
            if (r11 <= r5) goto L_0x0176
            goto L_0x01db
        L_0x0176:
            int r10 = defpackage.cq.a(r4, r10, r11)     // Catch:{ all -> 0x0209 }
            if (r10 >= 0) goto L_0x01d6
            r10 = r10 ^ -1
            int r4 = r1.e     // Catch:{ all -> 0x0209 }
            if (r10 < r4) goto L_0x0183
            goto L_0x0194
        L_0x0183:
            java.lang.Object[] r4 = r1.d     // Catch:{ all -> 0x0209 }
            r4 = r4[r10]     // Catch:{ all -> 0x0209 }
            java.lang.Object r5 = defpackage.de.a     // Catch:{ all -> 0x0209 }
            if (r4 != r5) goto L_0x0194
            int[] r2 = r1.c     // Catch:{ all -> 0x0209 }
            r2[r10] = r11     // Catch:{ all -> 0x0209 }
            java.lang.Object[] r11 = r1.d     // Catch:{ all -> 0x0209 }
            r11[r10] = r0     // Catch:{ all -> 0x0209 }
            goto L_0x0205
        L_0x0194:
            int r4 = r1.e     // Catch:{ all -> 0x0209 }
            int[] r5 = r1.c     // Catch:{ all -> 0x0209 }
            int r5 = r5.length     // Catch:{ all -> 0x0209 }
            if (r4 < r5) goto L_0x01b4
            int r4 = r4 + r2
            int r4 = defpackage.cq.a(r4)     // Catch:{ all -> 0x0209 }
            int[] r5 = new int[r4]     // Catch:{ all -> 0x0209 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0209 }
            int[] r6 = r1.c     // Catch:{ all -> 0x0209 }
            int r7 = r6.length     // Catch:{ all -> 0x0209 }
            java.lang.System.arraycopy(r6, r3, r5, r3, r7)     // Catch:{ all -> 0x0209 }
            java.lang.Object[] r6 = r1.d     // Catch:{ all -> 0x0209 }
            int r7 = r6.length     // Catch:{ all -> 0x0209 }
            java.lang.System.arraycopy(r6, r3, r4, r3, r7)     // Catch:{ all -> 0x0209 }
            r1.c = r5     // Catch:{ all -> 0x0209 }
            r1.d = r4     // Catch:{ all -> 0x0209 }
        L_0x01b4:
            int r3 = r1.e     // Catch:{ all -> 0x0209 }
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x01c8
            int[] r4 = r1.c     // Catch:{ all -> 0x0209 }
            int r5 = r10 + 1
            java.lang.System.arraycopy(r4, r10, r4, r5, r3)     // Catch:{ all -> 0x0209 }
            java.lang.Object[] r3 = r1.d     // Catch:{ all -> 0x0209 }
            int r4 = r1.e     // Catch:{ all -> 0x0209 }
            int r4 = r4 - r10
            java.lang.System.arraycopy(r3, r10, r3, r5, r4)     // Catch:{ all -> 0x0209 }
        L_0x01c8:
            int[] r3 = r1.c     // Catch:{ all -> 0x0209 }
            r3[r10] = r11     // Catch:{ all -> 0x0209 }
            java.lang.Object[] r11 = r1.d     // Catch:{ all -> 0x0209 }
            r11[r10] = r0     // Catch:{ all -> 0x0209 }
            int r10 = r1.e     // Catch:{ all -> 0x0209 }
            int r10 = r10 + r2
            r1.e = r10     // Catch:{ all -> 0x0209 }
            goto L_0x0205
        L_0x01d6:
            java.lang.Object[] r11 = r1.d     // Catch:{ all -> 0x0209 }
            r11[r10] = r0     // Catch:{ all -> 0x0209 }
            goto L_0x0205
        L_0x01db:
            int[] r4 = r1.c     // Catch:{ all -> 0x0209 }
            int r4 = r4.length     // Catch:{ all -> 0x0209 }
            if (r10 < r4) goto L_0x01fa
            int r4 = r10 + 1
            int r4 = defpackage.cq.a(r4)     // Catch:{ all -> 0x0209 }
            int[] r5 = new int[r4]     // Catch:{ all -> 0x0209 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0209 }
            int[] r6 = r1.c     // Catch:{ all -> 0x0209 }
            int r7 = r6.length     // Catch:{ all -> 0x0209 }
            java.lang.System.arraycopy(r6, r3, r5, r3, r7)     // Catch:{ all -> 0x0209 }
            java.lang.Object[] r6 = r1.d     // Catch:{ all -> 0x0209 }
            int r7 = r6.length     // Catch:{ all -> 0x0209 }
            java.lang.System.arraycopy(r6, r3, r4, r3, r7)     // Catch:{ all -> 0x0209 }
            r1.c = r5     // Catch:{ all -> 0x0209 }
            r1.d = r4     // Catch:{ all -> 0x0209 }
        L_0x01fa:
            int[] r3 = r1.c     // Catch:{ all -> 0x0209 }
            r3[r10] = r11     // Catch:{ all -> 0x0209 }
            java.lang.Object[] r11 = r1.d     // Catch:{ all -> 0x0209 }
            r11[r10] = r0     // Catch:{ all -> 0x0209 }
            int r10 = r10 + r2
            r1.e = r10     // Catch:{ all -> 0x0209 }
        L_0x0205:
            monitor-exit(r9)
            return r0
        L_0x0207:
            monitor-exit(r9)
            return r0
        L_0x0209:
            r10 = move-exception
            monitor-exit(r9)
            goto L_0x020d
        L_0x020c:
            throw r10
        L_0x020d:
            goto L_0x020c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq.b(android.content.Context, int):android.content.res.ColorStateList");
    }

    public final synchronized void a(kp kpVar) {
        this.g = kpVar;
    }

    static void a(Drawable drawable, kx kxVar, int[] iArr) {
        ColorStateList colorStateList;
        if (!ib.b(drawable) || drawable.mutate() == drawable) {
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (kxVar.d) {
                colorStateList = kxVar.a;
            } else if (!kxVar.c) {
                drawable.clearColorFilter();
                int i = Build.VERSION.SDK_INT;
            } else {
                colorStateList = null;
            }
            PorterDuff.Mode mode = kxVar.c ? kxVar.b : a;
            if (!(colorStateList == null || mode == null)) {
                porterDuffColorFilter = a(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
            int i2 = Build.VERSION.SDK_INT;
        }
    }
}
