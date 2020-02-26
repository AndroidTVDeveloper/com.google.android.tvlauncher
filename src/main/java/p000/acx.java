package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;

/* renamed from: acx */
/* compiled from: PG */
public final class acx {

    /* renamed from: a */
    public static final C0538tw f107a = C0538tw.m8390a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false);

    /* renamed from: b */
    public static final acw f108b = new acv();

    /* renamed from: c */
    private static final C0538tw f109c = C0538tw.m8390a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", C0530to.f10519c);

    /* renamed from: d */
    private static final C0538tw f110d = C0538tw.m8390a("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", C0540ty.SRGB);

    /* renamed from: e */
    private static final C0538tw f111e = C0538tw.m8390a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false);

    /* renamed from: f */
    private static final Queue f112f = aie.m558a(0);

    /* renamed from: g */
    private final C0630xg f113g;

    /* renamed from: h */
    private final DisplayMetrics f114h;

    /* renamed from: i */
    private final C0628xe f115i;

    /* renamed from: j */
    private final List f116j;

    /* renamed from: k */
    private final add f117k;

    static {
        acu acu = acu.f99a;
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
    }

    /* renamed from: a */
    private static boolean m159a(int i) {
        return i == 90 || i == 270;
    }

    /* renamed from: b */
    private static int m162b(double d) {
        return (int) (d + 0.5d);
    }

    public acx(List list, DisplayMetrics displayMetrics, C0630xg xgVar, C0628xe xeVar) {
        if (add.f131a == null) {
            synchronized (add.class) {
                if (add.f131a == null) {
                    add.f131a = new add();
                }
            }
        }
        this.f117k = add.f131a;
        this.f116j = list;
        this.f114h = (DisplayMetrics) aic.m542a(displayMetrics);
        this.f113g = (C0630xg) aic.m542a(xgVar);
        this.f115i = (C0628xe) aic.m542a(xeVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02a8, code lost:
        if (r19 != false) goto L_0x02aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x029a A[Catch:{ IOException -> 0x028f, all -> 0x03e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02a5 A[Catch:{ IOException -> 0x028f, all -> 0x03e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02a6 A[Catch:{ IOException -> 0x028f, all -> 0x03e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02b1 A[Catch:{ IOException -> 0x028f, all -> 0x03e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02ba A[Catch:{ IOException -> 0x028f, all -> 0x03e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02ed A[Catch:{ IOException -> 0x028f, all -> 0x03e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0300 A[Catch:{ IOException -> 0x028f, all -> 0x03e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x030b A[Catch:{ IOException -> 0x028f, all -> 0x03e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0336 A[Catch:{ IOException -> 0x028f, all -> 0x03e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x03d6 A[Catch:{ IOException -> 0x028f, all -> 0x03e8 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.C0619ww mo59a(java.io.InputStream r26, int r27, int r28, p000.C0539tx r29, p000.acw r30) {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
            r0 = r29
            r3 = r30
            java.lang.String r4 = "x"
            boolean r5 = r26.markSupported()
            java.lang.String r6 = "You must provide an InputStream that supports mark()"
            p000.aic.m546a(r5, r6)
            xe r5 = r1.f115i
            java.lang.Class<byte[]> r6 = byte[].class
            r7 = 65536(0x10000, float:9.18355E-41)
            java.lang.Object r5 = r5.mo6098a(r7, r6)
            byte[] r5 = (byte[]) r5
            android.graphics.BitmapFactory$Options r6 = m158a()
            r6.inTempStorage = r5
            tw r7 = p000.acx.f109c
            java.lang.Object r7 = r0.mo5987a(r7)
            to r7 = (p000.C0530to) r7
            tw r8 = p000.acx.f110d
            java.lang.Object r8 = r0.mo5987a(r8)
            ty r8 = (p000.C0540ty) r8
            tw r9 = p000.acu.f105g
            java.lang.Object r9 = r0.mo5987a(r9)
            acu r9 = (p000.acu) r9
            tw r10 = p000.acx.f111e
            java.lang.Object r10 = r0.mo5987a(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            tw r11 = p000.acx.f107a
            java.lang.Object r11 = r0.mo5987a(r11)
            r12 = 1
            r13 = 0
            if (r11 == 0) goto L_0x0064
            tw r11 = p000.acx.f107a
            java.lang.Object r0 = r0.mo5987a(r11)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0063
            r0 = 1
            goto L_0x0065
        L_0x0063:
        L_0x0064:
            r0 = 0
        L_0x0065:
            p000.ahy.m529a()     // Catch:{ all -> 0x03eb }
            xg r11 = r1.f113g     // Catch:{ all -> 0x03eb }
            int[] r11 = m161a(r2, r6, r3, r11)     // Catch:{ all -> 0x03eb }
            r14 = r11[r13]     // Catch:{ all -> 0x03eb }
            r11 = r11[r12]     // Catch:{ all -> 0x03eb }
            java.lang.String r15 = r6.outMimeType     // Catch:{ all -> 0x03eb }
            r15 = -1
            if (r14 != r15) goto L_0x0079
            r0 = 0
            goto L_0x007e
        L_0x0079:
            if (r11 != r15) goto L_0x007e
            r0 = 0
        L_0x007e:
            java.util.List r15 = r1.f116j     // Catch:{ all -> 0x03eb }
            xe r13 = r1.f115i     // Catch:{ all -> 0x03eb }
            int r13 = p000.bro.m4077b(r15, r2, r13)     // Catch:{ all -> 0x03eb }
            int r15 = p000.adl.m194a(r13)     // Catch:{ all -> 0x03eb }
            boolean r16 = p000.adl.m200b(r13)     // Catch:{ all -> 0x03eb }
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            r17 = r5
            r5 = r27
            if (r5 != r12) goto L_0x00a6
            boolean r5 = m159a(r15)     // Catch:{ all -> 0x00a0 }
            if (r5 == 0) goto L_0x009e
            r5 = r11
            goto L_0x00a6
        L_0x009e:
            r5 = r14
            goto L_0x00a6
        L_0x00a0:
            r0 = move-exception
            r4 = r1
        L_0x00a2:
            r5 = r17
            goto L_0x03ed
        L_0x00a6:
            r29 = r13
            r13 = r28
            if (r13 == r12) goto L_0x00ad
            goto L_0x00b6
        L_0x00ad:
            boolean r12 = m159a(r15)     // Catch:{ all -> 0x00a0 }
            if (r12 == 0) goto L_0x00b5
            r13 = r14
            goto L_0x00b6
        L_0x00b5:
            r13 = r11
        L_0x00b6:
            java.util.List r12 = r1.f116j     // Catch:{ all -> 0x00a0 }
            r18 = r8
            xe r8 = r1.f115i     // Catch:{ all -> 0x00a0 }
            com.bumptech.glide.load.ImageHeaderParser$ImageType r8 = p000.bro.m4075a(r12, r2, r8)     // Catch:{ all -> 0x00a0 }
            xg r12 = r1.f113g     // Catch:{ all -> 0x00a0 }
            r19 = r10
            if (r14 > 0) goto L_0x00cd
            r21 = r0
            r20 = r7
            r1 = r14
            goto L_0x024e
        L_0x00cd:
            if (r11 <= 0) goto L_0x0249
            boolean r15 = m159a(r15)     // Catch:{ all -> 0x0244 }
            if (r15 != 0) goto L_0x00d7
            r10 = r11
            goto L_0x00d8
        L_0x00d7:
            r10 = r14
        L_0x00d8:
            if (r15 != 0) goto L_0x00dc
            r15 = r14
            goto L_0x00dd
        L_0x00dc:
            r15 = r11
        L_0x00dd:
            r20 = r7
            float r7 = r9.mo55a(r15, r10, r5, r13)     // Catch:{ all -> 0x0244 }
            r21 = 0
            int r22 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r22 <= 0) goto L_0x01f2
            int r4 = r9.mo56b(r15, r10, r5, r13)     // Catch:{ all -> 0x0244 }
            if (r4 == 0) goto L_0x01ea
            r21 = r0
            float r0 = (float) r15     // Catch:{ all -> 0x0244 }
            float r1 = r7 * r0
            r23 = r13
            r22 = r14
            double r13 = (double) r1     // Catch:{ all -> 0x0244 }
            int r1 = m162b(r13)     // Catch:{ all -> 0x0244 }
            float r13 = (float) r10     // Catch:{ all -> 0x0244 }
            float r14 = r7 * r13
            r24 = r13
            double r13 = (double) r14     // Catch:{ all -> 0x0244 }
            int r1 = r15 / r1
            int r13 = m162b(r13)     // Catch:{ all -> 0x0244 }
            int r13 = r10 / r13
            r14 = 1
            if (r4 == r14) goto L_0x0113
            int r1 = java.lang.Math.min(r1, r13)     // Catch:{ all -> 0x0244 }
            goto L_0x0117
        L_0x0113:
            int r1 = java.lang.Math.max(r1, r13)     // Catch:{ all -> 0x0244 }
        L_0x0117:
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0244 }
            int r1 = java.lang.Integer.highestOneBit(r1)     // Catch:{ all -> 0x0244 }
            r13 = 1
            int r1 = java.lang.Math.max(r13, r1)     // Catch:{ all -> 0x0244 }
            if (r4 != r13) goto L_0x012e
            float r4 = (float) r1     // Catch:{ all -> 0x0244 }
            r13 = 1065353216(0x3f800000, float:1.0)
            float r7 = r13 / r7
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x012e
            int r1 = r1 + r1
        L_0x012e:
            r6.inSampleSize = r1     // Catch:{ all -> 0x0244 }
            com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = com.bumptech.glide.load.ImageHeaderParser$ImageType.JPEG     // Catch:{ all -> 0x0244 }
            if (r8 == r4) goto L_0x017e
            com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG     // Catch:{ all -> 0x0244 }
            if (r8 == r4) goto L_0x016c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = com.bumptech.glide.load.ImageHeaderParser$ImageType.PNG_A     // Catch:{ all -> 0x0244 }
            if (r8 == r4) goto L_0x016c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP     // Catch:{ all -> 0x0244 }
            if (r8 == r4) goto L_0x015d
            com.bumptech.glide.load.ImageHeaderParser$ImageType r4 = com.bumptech.glide.load.ImageHeaderParser$ImageType.WEBP_A     // Catch:{ all -> 0x0244 }
            if (r8 != r4) goto L_0x0145
            goto L_0x015d
        L_0x0145:
            int r0 = r15 % r1
            if (r0 != 0) goto L_0x0152
            int r0 = r10 % r1
            if (r0 == 0) goto L_0x014e
            goto L_0x0152
        L_0x014e:
            int r15 = r15 / r1
            int r10 = r10 / r1
            goto L_0x019c
        L_0x0152:
            int[] r0 = m161a(r2, r6, r3, r12)     // Catch:{ all -> 0x0244 }
            r1 = 0
            r15 = r0[r1]     // Catch:{ all -> 0x0244 }
            r1 = 1
            r10 = r0[r1]     // Catch:{ all -> 0x0244 }
            goto L_0x019b
        L_0x015d:
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0244 }
            float r1 = (float) r1     // Catch:{ all -> 0x0244 }
            float r0 = r0 / r1
            int r15 = java.lang.Math.round(r0)     // Catch:{ all -> 0x0244 }
            float r13 = r24 / r1
            int r10 = java.lang.Math.round(r13)     // Catch:{ all -> 0x0244 }
            goto L_0x019b
        L_0x016c:
            float r1 = (float) r1     // Catch:{ all -> 0x0244 }
            float r0 = r0 / r1
            double r7 = (double) r0     // Catch:{ all -> 0x0244 }
            double r7 = java.lang.Math.floor(r7)     // Catch:{ all -> 0x0244 }
            int r15 = (int) r7     // Catch:{ all -> 0x0244 }
            float r13 = r24 / r1
            double r0 = (double) r13     // Catch:{ all -> 0x0244 }
            double r0 = java.lang.Math.floor(r0)     // Catch:{ all -> 0x0244 }
            int r10 = (int) r0     // Catch:{ all -> 0x0244 }
            goto L_0x019c
        L_0x017e:
            r4 = 8
            int r7 = java.lang.Math.min(r1, r4)     // Catch:{ all -> 0x0244 }
            float r7 = (float) r7     // Catch:{ all -> 0x0244 }
            float r0 = r0 / r7
            double r12 = (double) r0     // Catch:{ all -> 0x0244 }
            double r12 = java.lang.Math.ceil(r12)     // Catch:{ all -> 0x0244 }
            int r15 = (int) r12     // Catch:{ all -> 0x0244 }
            float r13 = r24 / r7
            double r7 = (double) r13     // Catch:{ all -> 0x0244 }
            double r7 = java.lang.Math.ceil(r7)     // Catch:{ all -> 0x0244 }
            int r10 = (int) r7     // Catch:{ all -> 0x0244 }
            int r1 = r1 / r4
            if (r1 <= 0) goto L_0x019b
            int r15 = r15 / r1
            int r10 = r10 / r1
            goto L_0x019c
        L_0x019b:
        L_0x019c:
            r13 = r23
            float r0 = r9.mo55a(r15, r10, r5, r13)     // Catch:{ all -> 0x0244 }
            double r0 = (double) r0     // Catch:{ all -> 0x0244 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0244 }
            int r4 = m157a(r0)     // Catch:{ all -> 0x0244 }
            double r7 = (double) r4
            java.lang.Double.isNaN(r7)
            java.lang.Double.isNaN(r0)
            double r7 = r7 * r0
            int r7 = m162b(r7)     // Catch:{ all -> 0x0244 }
            float r8 = (float) r7
            float r4 = (float) r4
            float r8 = r8 / r4
            double r8 = (double) r8
            java.lang.Double.isNaN(r0)
            java.lang.Double.isNaN(r8)
            double r8 = r0 / r8
            double r14 = (double) r7
            java.lang.Double.isNaN(r14)
            double r8 = r8 * r14
            int r4 = m162b(r8)     // Catch:{ all -> 0x0244 }
            r6.inTargetDensity = r4     // Catch:{ all -> 0x0244 }
            int r0 = m157a(r0)     // Catch:{ all -> 0x0244 }
            r6.inDensity = r0     // Catch:{ all -> 0x0244 }
            boolean r0 = m160a(r6)     // Catch:{ all -> 0x0244 }
            if (r0 != 0) goto L_0x01e3
            r0 = 0
            r6.inTargetDensity = r0     // Catch:{ all -> 0x0244 }
            r6.inDensity = r0     // Catch:{ all -> 0x0244 }
            r1 = r22
            goto L_0x024e
        L_0x01e3:
            r1 = 1
            r6.inScaled = r1     // Catch:{ all -> 0x0244 }
            r1 = r22
            goto L_0x024e
        L_0x01ea:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0244 }
            java.lang.String r1 = "Cannot round with null rounding"
            r0.<init>(r1)     // Catch:{ all -> 0x0244 }
            throw r0     // Catch:{ all -> 0x0244 }
        L_0x01f2:
            r22 = r14
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0244 }
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0244 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0244 }
            int r2 = r2.length()     // Catch:{ all -> 0x0244 }
            int r2 = r2 + 118
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0244 }
            r3.<init>(r2)     // Catch:{ all -> 0x0244 }
            java.lang.String r2 = "Cannot scale with factor: "
            r3.append(r2)     // Catch:{ all -> 0x0244 }
            r3.append(r7)     // Catch:{ all -> 0x0244 }
            java.lang.String r2 = " from: "
            r3.append(r2)     // Catch:{ all -> 0x0244 }
            r3.append(r1)     // Catch:{ all -> 0x0244 }
            java.lang.String r1 = ", source: ["
            r3.append(r1)     // Catch:{ all -> 0x0244 }
            r1 = r22
            r3.append(r1)     // Catch:{ all -> 0x0244 }
            r3.append(r4)     // Catch:{ all -> 0x0244 }
            r3.append(r11)     // Catch:{ all -> 0x0244 }
            java.lang.String r1 = "], target: ["
            r3.append(r1)     // Catch:{ all -> 0x0244 }
            r3.append(r5)     // Catch:{ all -> 0x0244 }
            r3.append(r4)     // Catch:{ all -> 0x0244 }
            r3.append(r13)     // Catch:{ all -> 0x0244 }
            java.lang.String r1 = "]"
            r3.append(r1)     // Catch:{ all -> 0x0244 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0244 }
            r0.<init>(r1)     // Catch:{ all -> 0x0244 }
            throw r0     // Catch:{ all -> 0x0244 }
        L_0x0244:
            r0 = move-exception
            r4 = r25
            goto L_0x00a2
        L_0x0249:
            r21 = r0
            r20 = r7
            r1 = r14
        L_0x024e:
            r4 = r25
            add r0 = r4.f117k     // Catch:{ all -> 0x03e8 }
            if (r21 == 0) goto L_0x0271
            boolean r7 = r0.f133b     // Catch:{ all -> 0x03e8 }
            if (r7 == 0) goto L_0x0271
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x03e8 }
            if (r16 != 0) goto L_0x0271
            int r7 = r0.f134c     // Catch:{ all -> 0x03e8 }
            if (r5 >= r7) goto L_0x0261
            goto L_0x0271
        L_0x0261:
            if (r13 < r7) goto L_0x0271
            boolean r0 = r0.mo66a()     // Catch:{ all -> 0x03e8 }
            if (r0 == 0) goto L_0x0271
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.HARDWARE     // Catch:{ all -> 0x03e8 }
            r6.inPreferredConfig = r0     // Catch:{ all -> 0x03e8 }
            r0 = 0
            r6.inMutable = r0     // Catch:{ all -> 0x03e8 }
            goto L_0x029d
        L_0x0271:
            to r0 = p000.C0530to.f10517a     // Catch:{ all -> 0x03e8 }
            r7 = r20
            if (r7 != r0) goto L_0x027c
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x03e8 }
            r6.inPreferredConfig = r0     // Catch:{ all -> 0x03e8 }
            goto L_0x029d
        L_0x027c:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x03e8 }
            java.util.List r0 = r4.f116j     // Catch:{ IOException -> 0x028f }
            xe r7 = r4.f115i     // Catch:{ IOException -> 0x028f }
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = p000.bro.m4075a(r0, r2, r7)     // Catch:{ IOException -> 0x028f }
            boolean r0 = r0.hasAlpha()     // Catch:{ IOException -> 0x028f }
            if (r0 == 0) goto L_0x0290
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x03e8 }
            goto L_0x0292
        L_0x028f:
            r0 = move-exception
        L_0x0290:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ all -> 0x03e8 }
        L_0x0292:
            r6.inPreferredConfig = r0     // Catch:{ all -> 0x03e8 }
            android.graphics.Bitmap$Config r0 = r6.inPreferredConfig     // Catch:{ all -> 0x03e8 }
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ all -> 0x03e8 }
            if (r0 != r7) goto L_0x029d
            r7 = 1
            r6.inDither = r7     // Catch:{ all -> 0x03e8 }
        L_0x029d:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x03e8 }
            int r0 = r6.inSampleSize     // Catch:{ all -> 0x03e8 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x03e8 }
            if (r1 >= 0) goto L_0x02a6
            goto L_0x02ab
        L_0x02a6:
            if (r11 < 0) goto L_0x02ab
            if (r19 == 0) goto L_0x02ab
        L_0x02aa:
            goto L_0x02df
        L_0x02ab:
            boolean r0 = m160a(r6)     // Catch:{ all -> 0x03e8 }
            if (r0 == 0) goto L_0x02ba
            int r0 = r6.inTargetDensity     // Catch:{ all -> 0x03e8 }
            float r0 = (float) r0     // Catch:{ all -> 0x03e8 }
            int r5 = r6.inDensity     // Catch:{ all -> 0x03e8 }
            float r5 = (float) r5     // Catch:{ all -> 0x03e8 }
            float r10 = r0 / r5
            goto L_0x02bd
        L_0x02ba:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x02bd:
            int r0 = r6.inSampleSize     // Catch:{ all -> 0x03e8 }
            float r1 = (float) r1     // Catch:{ all -> 0x03e8 }
            float r0 = (float) r0     // Catch:{ all -> 0x03e8 }
            float r1 = r1 / r0
            double r7 = (double) r1     // Catch:{ all -> 0x03e8 }
            double r7 = java.lang.Math.ceil(r7)     // Catch:{ all -> 0x03e8 }
            int r1 = (int) r7     // Catch:{ all -> 0x03e8 }
            float r5 = (float) r11     // Catch:{ all -> 0x03e8 }
            float r5 = r5 / r0
            double r7 = (double) r5     // Catch:{ all -> 0x03e8 }
            double r7 = java.lang.Math.ceil(r7)     // Catch:{ all -> 0x03e8 }
            int r0 = (int) r7     // Catch:{ all -> 0x03e8 }
            float r1 = (float) r1     // Catch:{ all -> 0x03e8 }
            float r1 = r1 * r10
            int r5 = java.lang.Math.round(r1)     // Catch:{ all -> 0x03e8 }
            float r0 = (float) r0     // Catch:{ all -> 0x03e8 }
            float r0 = r0 * r10
            int r13 = java.lang.Math.round(r0)     // Catch:{ all -> 0x03e8 }
            goto L_0x02aa
        L_0x02df:
            if (r5 <= 0) goto L_0x02fa
            if (r13 <= 0) goto L_0x02fa
            xg r0 = r4.f113g     // Catch:{ all -> 0x03e8 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x03e8 }
            android.graphics.Bitmap$Config r1 = r6.inPreferredConfig     // Catch:{ all -> 0x03e8 }
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.HARDWARE     // Catch:{ all -> 0x03e8 }
            if (r1 == r7) goto L_0x02fa
            android.graphics.Bitmap$Config r1 = r6.outConfig     // Catch:{ all -> 0x03e8 }
            if (r1 == 0) goto L_0x02f2
            goto L_0x02f4
        L_0x02f2:
            android.graphics.Bitmap$Config r1 = r6.inPreferredConfig     // Catch:{ all -> 0x03e8 }
        L_0x02f4:
            android.graphics.Bitmap r0 = r0.mo6109b(r5, r13, r1)     // Catch:{ all -> 0x03e8 }
            r6.inBitmap = r0     // Catch:{ all -> 0x03e8 }
        L_0x02fa:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x03e8 }
            r1 = 28
            if (r0 >= r1) goto L_0x030b
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x03e8 }
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB     // Catch:{ all -> 0x03e8 }
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)     // Catch:{ all -> 0x03e8 }
            r6.inPreferredColorSpace = r0     // Catch:{ all -> 0x03e8 }
            goto L_0x0329
        L_0x030b:
            ty r0 = p000.C0540ty.DISPLAY_P3     // Catch:{ all -> 0x03e8 }
            r8 = r18
            if (r8 == r0) goto L_0x0312
            goto L_0x0321
        L_0x0312:
            android.graphics.ColorSpace r0 = r6.outColorSpace     // Catch:{ all -> 0x03e8 }
            if (r0 == 0) goto L_0x0321
            android.graphics.ColorSpace r0 = r6.outColorSpace     // Catch:{ all -> 0x03e8 }
            boolean r0 = r0.isWideGamut()     // Catch:{ all -> 0x03e8 }
            if (r0 == 0) goto L_0x0321
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DISPLAY_P3     // Catch:{ all -> 0x03e8 }
            goto L_0x0323
        L_0x0321:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB     // Catch:{ all -> 0x03e8 }
        L_0x0323:
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)     // Catch:{ all -> 0x03e8 }
            r6.inPreferredColorSpace = r0     // Catch:{ all -> 0x03e8 }
        L_0x0329:
            xg r0 = r4.f113g     // Catch:{ all -> 0x03e8 }
            android.graphics.Bitmap r0 = m163b(r2, r6, r3, r0)     // Catch:{ all -> 0x03e8 }
            xg r1 = r4.f113g     // Catch:{ all -> 0x03e8 }
            r3.mo58a(r1, r0)     // Catch:{ all -> 0x03e8 }
            if (r0 == 0) goto L_0x03d6
            android.util.DisplayMetrics r1 = r4.f114h     // Catch:{ all -> 0x03e8 }
            int r1 = r1.densityDpi     // Catch:{ all -> 0x03e8 }
            r0.setDensity(r1)     // Catch:{ all -> 0x03e8 }
            xg r1 = r4.f113g     // Catch:{ all -> 0x03e8 }
            boolean r2 = p000.adl.m200b(r29)     // Catch:{ all -> 0x03e8 }
            if (r2 == 0) goto L_0x03c8
            android.graphics.Matrix r2 = new android.graphics.Matrix     // Catch:{ all -> 0x03e8 }
            r2.<init>()     // Catch:{ all -> 0x03e8 }
            r3 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r5 = 1119092736(0x42b40000, float:90.0)
            r7 = 1127481344(0x43340000, float:180.0)
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r29) {
                case 2: goto L_0x0383;
                case 3: goto L_0x037e;
                case 4: goto L_0x0374;
                case 5: goto L_0x036a;
                case 6: goto L_0x0365;
                case 7: goto L_0x035b;
                case 8: goto L_0x0356;
                default: goto L_0x0355;
            }     // Catch:{ all -> 0x03e8 }
        L_0x0355:
            goto L_0x0389
        L_0x0356:
            r2.setRotate(r3)     // Catch:{ all -> 0x03e8 }
            goto L_0x0389
        L_0x035b:
            r2.setRotate(r3)     // Catch:{ all -> 0x03e8 }
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.postScale(r8, r3)     // Catch:{ all -> 0x03e8 }
            goto L_0x0389
        L_0x0365:
            r2.setRotate(r5)     // Catch:{ all -> 0x03e8 }
            goto L_0x0389
        L_0x036a:
            r2.setRotate(r5)     // Catch:{ all -> 0x03e8 }
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.postScale(r8, r3)     // Catch:{ all -> 0x03e8 }
            goto L_0x0389
        L_0x0374:
            r2.setRotate(r7)     // Catch:{ all -> 0x03e8 }
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.postScale(r8, r3)     // Catch:{ all -> 0x03e8 }
            goto L_0x0389
        L_0x037e:
            r2.setRotate(r7)     // Catch:{ all -> 0x03e8 }
            goto L_0x0389
        L_0x0383:
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setScale(r8, r3)     // Catch:{ all -> 0x03e8 }
        L_0x0389:
            android.graphics.RectF r3 = new android.graphics.RectF     // Catch:{ all -> 0x03e8 }
            int r5 = r0.getWidth()     // Catch:{ all -> 0x03e8 }
            float r5 = (float) r5     // Catch:{ all -> 0x03e8 }
            int r7 = r0.getHeight()     // Catch:{ all -> 0x03e8 }
            float r7 = (float) r7     // Catch:{ all -> 0x03e8 }
            r8 = 0
            r3.<init>(r8, r8, r5, r7)     // Catch:{ all -> 0x03e8 }
            r2.mapRect(r3)     // Catch:{ all -> 0x03e8 }
            float r5 = r3.width()     // Catch:{ all -> 0x03e8 }
            int r5 = java.lang.Math.round(r5)     // Catch:{ all -> 0x03e8 }
            float r7 = r3.height()     // Catch:{ all -> 0x03e8 }
            int r7 = java.lang.Math.round(r7)     // Catch:{ all -> 0x03e8 }
            android.graphics.Bitmap$Config r8 = p000.adl.m195a(r0)     // Catch:{ all -> 0x03e8 }
            android.graphics.Bitmap r1 = r1.mo6106a(r5, r7, r8)     // Catch:{ all -> 0x03e8 }
            float r5 = r3.left     // Catch:{ all -> 0x03e8 }
            float r5 = -r5
            float r3 = r3.top     // Catch:{ all -> 0x03e8 }
            float r3 = -r3
            r2.postTranslate(r5, r3)     // Catch:{ all -> 0x03e8 }
            boolean r3 = r0.hasAlpha()     // Catch:{ all -> 0x03e8 }
            r1.setHasAlpha(r3)     // Catch:{ all -> 0x03e8 }
            p000.adl.m198a(r0, r1, r2)     // Catch:{ all -> 0x03e8 }
            goto L_0x03c9
        L_0x03c8:
            r1 = r0
        L_0x03c9:
            boolean r2 = r0.equals(r1)     // Catch:{ all -> 0x03e8 }
            if (r2 == 0) goto L_0x03d0
            goto L_0x03d7
        L_0x03d0:
            xg r2 = r4.f113g     // Catch:{ all -> 0x03e8 }
            r2.mo60a(r0)     // Catch:{ all -> 0x03e8 }
            goto L_0x03d7
        L_0x03d6:
            r1 = 0
        L_0x03d7:
            xg r0 = r4.f113g     // Catch:{ all -> 0x03e8 }
            acf r0 = p000.acf.m107a(r1, r0)     // Catch:{ all -> 0x03e8 }
            m164b(r6)
            xe r1 = r4.f115i
            r5 = r17
            r1.mo6102a(r5)
            return r0
        L_0x03e8:
            r0 = move-exception
            goto L_0x00a2
        L_0x03eb:
            r0 = move-exception
            r4 = r1
        L_0x03ed:
            m164b(r6)
            xe r1 = r4.f115i
            r1.mo6102a(r5)
            goto L_0x03f7
        L_0x03f6:
            throw r0
        L_0x03f7:
            goto L_0x03f6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.acx.mo59a(java.io.InputStream, int, int, tx, acw):ww");
    }

    /* renamed from: b */
    private static Bitmap m163b(InputStream inputStream, BitmapFactory.Options options, acw acw, C0630xg xgVar) {
        IOException iOException;
        String str;
        BitmapFactory.Options options2 = options;
        if (options2.inJustDecodeBounds) {
            inputStream.mark(10485760);
        } else {
            acw.mo57a();
        }
        int i = options2.outWidth;
        int i2 = options2.outHeight;
        String str2 = options2.outMimeType;
        adl.f152a.lock();
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options2);
            adl.f152a.unlock();
            if (options2.inJustDecodeBounds) {
                inputStream.reset();
            }
            return decodeStream;
        } catch (IOException e) {
            throw iOException;
        } catch (IllegalArgumentException e2) {
            IllegalArgumentException illegalArgumentException = e2;
            Bitmap bitmap = options2.inBitmap;
            if (bitmap != null) {
                int i3 = Build.VERSION.SDK_INT;
                int allocationByteCount = bitmap.getAllocationByteCount();
                StringBuilder sb = new StringBuilder(14);
                sb.append(" (");
                sb.append(allocationByteCount);
                sb.append(")");
                String sb2 = sb.toString();
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                String valueOf = String.valueOf(bitmap.getConfig());
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 26 + String.valueOf(sb2).length());
                sb3.append("[");
                sb3.append(width);
                sb3.append("x");
                sb3.append(height);
                sb3.append("] ");
                sb3.append(valueOf);
                sb3.append(sb2);
                str = sb3.toString();
            } else {
                str = null;
            }
            StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 99 + String.valueOf(str).length());
            sb4.append("Exception decoding bitmap, outWidth: ");
            sb4.append(i);
            sb4.append(", outHeight: ");
            sb4.append(i2);
            sb4.append(", outMimeType: ");
            sb4.append(str2);
            sb4.append(", inBitmap: ");
            sb4.append(str);
            iOException = new IOException(sb4.toString(), illegalArgumentException);
            if (options2.inBitmap != null) {
                inputStream.reset();
                xgVar.mo60a(options2.inBitmap);
                options2.inBitmap = null;
                Bitmap b = m163b(inputStream, options, acw, xgVar);
                adl.f152a.unlock();
                return b;
            }
            throw iOException;
        } catch (Throwable th) {
            adl.f152a.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    private static synchronized BitmapFactory.Options m158a() {
        BitmapFactory.Options options;
        synchronized (acx.class) {
            synchronized (f112f) {
                options = (BitmapFactory.Options) f112f.poll();
            }
            if (options != null) {
                return options;
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            m165c(options2);
            return options2;
        }
    }

    /* renamed from: a */
    private static int m157a(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: a */
    private static int[] m161a(InputStream inputStream, BitmapFactory.Options options, acw acw, C0630xg xgVar) {
        options.inJustDecodeBounds = true;
        m163b(inputStream, options, acw, xgVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: a */
    private static boolean m160a(BitmapFactory.Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    /* renamed from: b */
    private static void m164b(BitmapFactory.Options options) {
        m165c(options);
        synchronized (f112f) {
            f112f.offer(options);
        }
    }

    /* renamed from: c */
    private static void m165c(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        int i = Build.VERSION.SDK_INT;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }
}
