package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: bg */
/* compiled from: PG */
public class C0035bg {
    public C0035bg() {
    }

    public C0035bg(C0005af afVar) {
        Handler handler = new Handler();
        new C0011al();
        Context context = (Context) C0086dc.m6104a(afVar, "context == null");
        Handler handler2 = (Handler) C0086dc.m6104a(handler, "handler == null");
    }

    /* renamed from: b */
    public static int m3116b(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return context.getColor(i);
    }

    /* renamed from: a */
    public static Drawable m3107a(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return context.getDrawable(i);
    }

    /* renamed from: a */
    public static int m3102a(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    /* renamed from: a */
    public static boolean m3111a(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    /* renamed from: d */
    public static int m3119d(TypedArray typedArray, int i, int i2) {
        return typedArray.getInt(i, typedArray.getInt(i2, Integer.MAX_VALUE));
    }

    /* renamed from: a */
    private static int m3104a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m3112a(xmlPullParser, str)) {
            return typedArray.getColor(i, 0);
        }
        return 0;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.graphics.Shader] */
    /* JADX WARN: Type inference failed for: r18v3, types: [android.graphics.RadialGradient] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r13v4, types: [android.graphics.LinearGradient] */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bg.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int, float):float
     arg types: [android.content.res.TypedArray, android.content.res.XmlResourceParser, java.lang.String, int, int]
     candidates:
      bg.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int, int):int
      bg.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme, java.lang.String, int):au
      bg.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int, float):float */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bg.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int, int):int
     arg types: [android.content.res.TypedArray, android.content.res.XmlResourceParser, java.lang.String, int, int]
     candidates:
      bg.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int, float):float
      bg.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme, java.lang.String, int):au
      bg.a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, java.lang.String, int, int):int */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        r7 = r0.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        r10 = r7.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        if (r10 == 89650992) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        if (r10 == 1191572447) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
        if (r7.equals("selector") == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
        if (r7.equals("gradient") == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        r10 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        r10 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        if (r10 == 0) goto L_0x023c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        if (r10 != 1) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r7 = r0.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        if (r7.equals("gradient") == false) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007e, code lost:
        r7 = m3106a(r4, r1, r6, p000.C0677z.f10847d);
        r14 = m3101a(r7, (org.xmlpull.v1.XmlPullParser) r0, "startX", 8, 0.0f);
        r15 = m3101a(r7, (org.xmlpull.v1.XmlPullParser) r0, "startY", 9, 0.0f);
        r16 = m3101a(r7, (org.xmlpull.v1.XmlPullParser) r0, "endX", 10, 0.0f);
        r17 = m3101a(r7, (org.xmlpull.v1.XmlPullParser) r0, "endY", 11, 0.0f);
        r10 = m3101a(r7, (org.xmlpull.v1.XmlPullParser) r0, "centerX", 3, 0.0f);
        r2 = m3101a(r7, (org.xmlpull.v1.XmlPullParser) r0, "centerY", 4, 0.0f);
        r13 = m3105a(r7, (org.xmlpull.v1.XmlPullParser) r0, "type", 2, r5);
        r8 = m3104a(r7, r0, "startColor", r5);
        r18 = m3112a(r0, "centerColor");
        r3 = m3104a(r7, r0, "centerColor", 7);
        r11 = m3104a(r7, r0, "endColor", 1);
        r9 = m3105a(r7, (org.xmlpull.v1.XmlPullParser) r0, "tileMode", 6, r5);
        r20 = r2;
        r21 = m3101a(r7, (org.xmlpull.v1.XmlPullParser) r0, "gradientRadius", 5, 0.0f);
        r7.recycle();
        r2 = r0.getDepth() + 1;
        r5 = new java.util.ArrayList(20);
        r12 = new java.util.ArrayList(20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f4, code lost:
        r7 = r0.next();
        r22 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00fb, code lost:
        if (r7 == 1) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fd, code lost:
        r10 = r0.getDepth();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0101, code lost:
        if (r10 >= r2) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0103, code lost:
        r23 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0106, code lost:
        if (r7 == 3) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0109, code lost:
        r23 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010d, code lost:
        if (r7 != 2) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010f, code lost:
        if (r10 > r2) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011b, code lost:
        if (r0.getName().equals("item") == false) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011d, code lost:
        r7 = m3106a(r4, r1, r6, p000.C0677z.f10848e);
        r15 = r7.hasValue(0);
        r24 = r7.hasValue(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012d, code lost:
        if (r15 == false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012f, code lost:
        if (r24 == false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0131, code lost:
        r15 = r7.getColor(0, 0);
        r25 = r7.getFloat(1, 0.0f);
        r7.recycle();
        r12.add(java.lang.Integer.valueOf(r15));
        r5.add(java.lang.Float.valueOf(r25));
        r10 = r22;
        r15 = r23;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0170, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r0.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0171, code lost:
        r24 = r2;
        r10 = r22;
        r15 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0179, code lost:
        r24 = r2;
        r10 = r22;
        r15 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0181, code lost:
        r23 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0187, code lost:
        if (r12.size() <= 0) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0189, code lost:
        r2 = new p000.C0027az(r12, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x018f, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0190, code lost:
        if (r2 == null) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0193, code lost:
        if (r18 != false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0195, code lost:
        r2 = new p000.C0027az(r8, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x019b, code lost:
        r2 = new p000.C0027az(r8, r3, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a2, code lost:
        if (r13 == 1) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a5, code lost:
        if (r13 == 2) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a7, code lost:
        r13 = new android.graphics.LinearGradient(r14, r23, r16, r17, r2.f2834a, r2.f2835b, p000.C0122el.m7245a(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01bc, code lost:
        r0 = new android.graphics.SweepGradient(r22, r20, r2.f2834a, r2.f2835b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01cb, code lost:
        r4 = r20;
        r3 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01d2, code lost:
        if (r21 <= 0.0f) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01d4, code lost:
        r18 = new android.graphics.RadialGradient(r3, r4, r21, r2.f2834a, r2.f2835b, p000.C0122el.m7245a(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r2 = new p000.C0022au(r0, null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01f5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f6, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ff, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x021d, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r0.getPositionDescription() + ": invalid gradient color tag " + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x023b, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r0.getPositionDescription() + ": unsupported complex color tag " + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x023c, code lost:
        r0 = p000.C0086dc.m6102a(r4, r0, r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0246, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r2 = new p000.C0022au(null, r0, r0.getDefaultColor());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x025a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x026b A[RETURN] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.C0022au m3108a(android.content.res.TypedArray r26, org.xmlpull.v1.XmlPullParser r27, android.content.res.Resources.Theme r28, java.lang.String r29, int r30) {
        /*
            r0 = r26
            r1 = r28
            r2 = r30
            java.lang.String r3 = "centerColor"
            r4 = r27
            r5 = r29
            boolean r4 = m3112a(r4, r5)
            r5 = 0
            if (r4 == 0) goto L_0x026c
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            r0.getValue(r2, r4)
            int r6 = r4.type
            r7 = 28
            if (r6 < r7) goto L_0x002f
            int r6 = r4.type
            r7 = 31
            if (r6 <= r7) goto L_0x0028
            goto L_0x002f
        L_0x0028:
            int r0 = r4.data
            au r0 = p000.C0022au.m2143a(r0)
            return r0
        L_0x002f:
            android.content.res.Resources r4 = r26.getResources()
            int r0 = r0.getResourceId(r2, r5)
            android.content.res.XmlResourceParser r0 = r4.getXml(r0)     // Catch:{ Exception -> 0x025c }
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r0)     // Catch:{ Exception -> 0x025c }
        L_0x003f:
            int r7 = r0.next()     // Catch:{ Exception -> 0x025c }
            r8 = 2
            r9 = 1
            if (r7 != r8) goto L_0x024b
            java.lang.String r7 = r0.getName()     // Catch:{ Exception -> 0x025c }
            int r10 = r7.hashCode()
            r11 = 89650992(0x557f730, float:1.01546526E-35)
            java.lang.String r12 = "gradient"
            if (r10 == r11) goto L_0x0067
            r11 = 1191572447(0x4705f3df, float:34291.87)
            if (r10 == r11) goto L_0x005c
        L_0x005b:
            goto L_0x006f
        L_0x005c:
            java.lang.String r10 = "selector"
            boolean r10 = r7.equals(r10)
            if (r10 == 0) goto L_0x005b
            r10 = 0
            goto L_0x0070
        L_0x0067:
            boolean r10 = r7.equals(r12)
            if (r10 == 0) goto L_0x005b
            r10 = 1
            goto L_0x0070
        L_0x006f:
            r10 = -1
        L_0x0070:
            if (r10 == 0) goto L_0x023c
            if (r10 != r9) goto L_0x021e
            java.lang.String r7 = r0.getName()     // Catch:{ Exception -> 0x025c }
            boolean r10 = r7.equals(r12)     // Catch:{ Exception -> 0x025c }
            if (r10 == 0) goto L_0x0200
            int[] r7 = p000.C0677z.f10847d     // Catch:{ Exception -> 0x025c }
            android.content.res.TypedArray r7 = m3106a(r4, r1, r6, r7)     // Catch:{ Exception -> 0x025c }
            java.lang.String r10 = "startX"
            r11 = 8
            r12 = 0
            float r14 = m3101a(r7, r0, r10, r11, r12)     // Catch:{ Exception -> 0x025c }
            java.lang.String r10 = "startY"
            r11 = 9
            float r15 = m3101a(r7, r0, r10, r11, r12)     // Catch:{ Exception -> 0x025c }
            java.lang.String r10 = "endX"
            r11 = 10
            float r16 = m3101a(r7, r0, r10, r11, r12)     // Catch:{ Exception -> 0x025c }
            java.lang.String r10 = "endY"
            r11 = 11
            float r17 = m3101a(r7, r0, r10, r11, r12)     // Catch:{ Exception -> 0x025c }
            java.lang.String r10 = "centerX"
            r11 = 3
            float r10 = m3101a(r7, r0, r10, r11, r12)     // Catch:{ Exception -> 0x025c }
            java.lang.String r13 = "centerY"
            r2 = 4
            float r2 = m3101a(r7, r0, r13, r2, r12)     // Catch:{ Exception -> 0x025c }
            java.lang.String r13 = "type"
            int r13 = m3105a(r7, r0, r13, r8, r5)     // Catch:{ Exception -> 0x025c }
            java.lang.String r8 = "startColor"
            int r8 = m3104a(r7, r0, r8, r5)     // Catch:{ Exception -> 0x025c }
            boolean r18 = m3112a(r0, r3)     // Catch:{ Exception -> 0x025c }
            r11 = 7
            int r3 = m3104a(r7, r0, r3, r11)     // Catch:{ Exception -> 0x025c }
            java.lang.String r11 = "endColor"
            int r11 = m3104a(r7, r0, r11, r9)     // Catch:{ Exception -> 0x025c }
            java.lang.String r9 = "tileMode"
            r12 = 6
            int r9 = m3105a(r7, r0, r9, r12, r5)     // Catch:{ Exception -> 0x025c }
            java.lang.String r12 = "gradientRadius"
            r5 = 5
            r20 = r2
            r2 = 0
            float r21 = m3101a(r7, r0, r12, r5, r2)     // Catch:{ Exception -> 0x025c }
            r7.recycle()     // Catch:{ Exception -> 0x025c }
            int r2 = r0.getDepth()     // Catch:{ Exception -> 0x025c }
            r5 = 1
            int r2 = r2 + r5
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x025c }
            r7 = 20
            r5.<init>(r7)     // Catch:{ Exception -> 0x025c }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ Exception -> 0x025c }
            r12.<init>(r7)     // Catch:{ Exception -> 0x025c }
        L_0x00f4:
            int r7 = r0.next()     // Catch:{ Exception -> 0x025c }
            r22 = r10
            r10 = 1
            if (r7 == r10) goto L_0x0181
            int r10 = r0.getDepth()     // Catch:{ Exception -> 0x025c }
            if (r10 >= r2) goto L_0x0109
            r23 = r15
            r15 = 3
            if (r7 == r15) goto L_0x0183
            goto L_0x010c
        L_0x0109:
            r23 = r15
            r15 = 3
        L_0x010c:
            r15 = 2
            if (r7 != r15) goto L_0x0179
            if (r10 > r2) goto L_0x0179
            java.lang.String r7 = r0.getName()     // Catch:{ Exception -> 0x025c }
            java.lang.String r10 = "item"
            boolean r7 = r7.equals(r10)     // Catch:{ Exception -> 0x025c }
            if (r7 == 0) goto L_0x0171
            int[] r7 = p000.C0677z.f10848e     // Catch:{ Exception -> 0x025c }
            android.content.res.TypedArray r7 = m3106a(r4, r1, r6, r7)     // Catch:{ Exception -> 0x025c }
            r10 = 0
            boolean r15 = r7.hasValue(r10)     // Catch:{ Exception -> 0x025c }
            r10 = 1
            boolean r24 = r7.hasValue(r10)     // Catch:{ Exception -> 0x025c }
            if (r15 == 0) goto L_0x0156
            if (r24 == 0) goto L_0x0156
            r10 = 0
            int r15 = r7.getColor(r10, r10)     // Catch:{ Exception -> 0x025c }
            r24 = r2
            r2 = 1
            r10 = 0
            float r25 = r7.getFloat(r2, r10)     // Catch:{ Exception -> 0x025c }
            r7.recycle()     // Catch:{ Exception -> 0x025c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x025c }
            r12.add(r2)     // Catch:{ Exception -> 0x025c }
            java.lang.Float r2 = java.lang.Float.valueOf(r25)     // Catch:{ Exception -> 0x025c }
            r5.add(r2)     // Catch:{ Exception -> 0x025c }
            r10 = r22
            r15 = r23
            r2 = r24
            goto L_0x00f4
        L_0x0156:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x025c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
            r2.<init>()     // Catch:{ Exception -> 0x025c }
            java.lang.String r0 = r0.getPositionDescription()     // Catch:{ Exception -> 0x025c }
            r2.append(r0)     // Catch:{ Exception -> 0x025c }
            java.lang.String r0 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r2.append(r0)     // Catch:{ Exception -> 0x025c }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x025c }
            r1.<init>(r0)     // Catch:{ Exception -> 0x025c }
            throw r1     // Catch:{ Exception -> 0x025c }
        L_0x0171:
            r24 = r2
            r10 = r22
            r15 = r23
            goto L_0x00f4
        L_0x0179:
            r24 = r2
            r10 = r22
            r15 = r23
            goto L_0x00f4
        L_0x0181:
            r23 = r15
        L_0x0183:
            int r0 = r12.size()     // Catch:{ Exception -> 0x025c }
            if (r0 <= 0) goto L_0x018f
            az r2 = new az     // Catch:{ Exception -> 0x025c }
            r2.<init>(r12, r5)     // Catch:{ Exception -> 0x025c }
            goto L_0x0190
        L_0x018f:
            r2 = 0
        L_0x0190:
            if (r2 == 0) goto L_0x0193
        L_0x0192:
            goto L_0x01a1
        L_0x0193:
            if (r18 != 0) goto L_0x019b
            az r2 = new az     // Catch:{ Exception -> 0x025c }
            r2.<init>(r8, r11)     // Catch:{ Exception -> 0x025c }
            goto L_0x0192
        L_0x019b:
            az r2 = new az     // Catch:{ Exception -> 0x025c }
            r2.<init>(r8, r3, r11)     // Catch:{ Exception -> 0x025c }
            goto L_0x0192
        L_0x01a1:
            r0 = 1
            if (r13 == r0) goto L_0x01cb
            r0 = 2
            if (r13 == r0) goto L_0x01bc
            android.graphics.LinearGradient r0 = new android.graphics.LinearGradient     // Catch:{ Exception -> 0x025c }
            int[] r1 = r2.f2834a     // Catch:{ Exception -> 0x025c }
            float[] r2 = r2.f2835b     // Catch:{ Exception -> 0x025c }
            android.graphics.Shader$TileMode r20 = p000.C0122el.m7245a(r9)     // Catch:{ Exception -> 0x025c }
            r13 = r0
            r15 = r23
            r18 = r1
            r19 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x025c }
            goto L_0x01ed
        L_0x01bc:
            android.graphics.SweepGradient r0 = new android.graphics.SweepGradient     // Catch:{ Exception -> 0x025c }
            int[] r1 = r2.f2834a     // Catch:{ Exception -> 0x025c }
            float[] r2 = r2.f2835b     // Catch:{ Exception -> 0x025c }
            r4 = r20
            r3 = r22
            r0.<init>(r3, r4, r1, r2)     // Catch:{ Exception -> 0x025c }
            goto L_0x01ed
        L_0x01cb:
            r4 = r20
            r3 = r22
            r0 = 0
            int r0 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01f8
            android.graphics.RadialGradient r0 = new android.graphics.RadialGradient     // Catch:{ Exception -> 0x025c }
            int[] r1 = r2.f2834a     // Catch:{ Exception -> 0x025c }
            float[] r2 = r2.f2835b     // Catch:{ Exception -> 0x025c }
            android.graphics.Shader$TileMode r24 = p000.C0122el.m7245a(r9)     // Catch:{ Exception -> 0x025c }
            r18 = r0
            r19 = r3
            r20 = r4
            r22 = r1
            r23 = r2
            r18.<init>(r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x025c }
        L_0x01ed:
            au r2 = new au     // Catch:{ Exception -> 0x025c }
            r1 = 0
            r3 = 0
            r2.<init>(r0, r1, r3)     // Catch:{ Exception -> 0x01f5 }
            goto L_0x024a
        L_0x01f5:
            r0 = move-exception
            r5 = r1
            goto L_0x025e
        L_0x01f8:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x025c }
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)     // Catch:{ Exception -> 0x025c }
            throw r0     // Catch:{ Exception -> 0x025c }
        L_0x0200:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x025c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
            r2.<init>()     // Catch:{ Exception -> 0x025c }
            java.lang.String r0 = r0.getPositionDescription()     // Catch:{ Exception -> 0x025c }
            r2.append(r0)     // Catch:{ Exception -> 0x025c }
            java.lang.String r0 = ": invalid gradient color tag "
            r2.append(r0)     // Catch:{ Exception -> 0x025c }
            r2.append(r7)     // Catch:{ Exception -> 0x025c }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x025c }
            r1.<init>(r0)     // Catch:{ Exception -> 0x025c }
            throw r1     // Catch:{ Exception -> 0x025c }
        L_0x021e:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x025c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025c }
            r2.<init>()     // Catch:{ Exception -> 0x025c }
            java.lang.String r0 = r0.getPositionDescription()     // Catch:{ Exception -> 0x025c }
            r2.append(r0)     // Catch:{ Exception -> 0x025c }
            java.lang.String r0 = ": unsupported complex color tag "
            r2.append(r0)     // Catch:{ Exception -> 0x025c }
            r2.append(r7)     // Catch:{ Exception -> 0x025c }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x025c }
            r1.<init>(r0)     // Catch:{ Exception -> 0x025c }
            throw r1     // Catch:{ Exception -> 0x025c }
        L_0x023c:
            android.content.res.ColorStateList r0 = p000.C0086dc.m6102a(r4, r0, r6, r1)     // Catch:{ Exception -> 0x025c }
            au r2 = new au     // Catch:{ Exception -> 0x025c }
            int r1 = r0.getDefaultColor()     // Catch:{ Exception -> 0x025c }
            r5 = 0
            r2.<init>(r5, r0, r1)     // Catch:{ Exception -> 0x025a }
        L_0x024a:
            goto L_0x0267
        L_0x024b:
            r5 = 0
            r2 = 1
            if (r7 == r2) goto L_0x0252
            r5 = 0
            goto L_0x003f
        L_0x0252:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x025a }
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)     // Catch:{ Exception -> 0x025a }
            throw r0     // Catch:{ Exception -> 0x025a }
        L_0x025a:
            r0 = move-exception
            goto L_0x025e
        L_0x025c:
            r0 = move-exception
            r5 = 0
        L_0x025e:
            java.lang.String r1 = "ComplexColorCompat"
            java.lang.String r2 = "Failed to inflate ComplexColor."
            android.util.Log.e(r1, r2, r0)
            r2 = r5
        L_0x0267:
            if (r2 != 0) goto L_0x026b
            goto L_0x026c
        L_0x026b:
            return r2
        L_0x026c:
            r1 = 0
            au r0 = p000.C0022au.m2143a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0035bg.m3108a(android.content.res.TypedArray, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme, java.lang.String, int):au");
    }

    /* renamed from: a */
    public static float m3101a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return m3112a(xmlPullParser, str) ? typedArray.getFloat(i, f) : f;
    }

    /* renamed from: a */
    public static int m3105a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return m3112a(xmlPullParser, str) ? typedArray.getInt(i, i2) : i2;
    }

    /* renamed from: a */
    public static int m3103a(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    /* renamed from: a */
    public static String m3109a(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    /* renamed from: b */
    public static CharSequence m3117b(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    /* renamed from: c */
    public static CharSequence[] m3118c(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    /* renamed from: a */
    public static boolean m3112a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: a */
    public static TypedArray m3106a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme != null) {
            return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        return resources.obtainAttributes(attributeSet, iArr);
    }

    /* renamed from: a */
    private static void m3110a(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new C0034bf(c, fArr));
    }

    /* renamed from: a */
    static float[] m3113a(float[] fArr, int i) {
        if (i >= 0) {
            int min = Math.min(i, fArr.length);
            float[] fArr2 = new float[i];
            System.arraycopy(fArr, 0, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ab A[Catch:{ NumberFormatException -> 0x00d5 }, LOOP:3: B:22:0x0073->B:40:0x00ab, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b2 A[Catch:{ NumberFormatException -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b3 A[Catch:{ NumberFormatException -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c7 A[Catch:{ NumberFormatException -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cb A[Catch:{ NumberFormatException -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00fd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00b0 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.C0034bf[] m3114a(java.lang.String r17) {
        /*
            r0 = r17
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = 0
            r4 = 1
            r5 = 0
        L_0x000a:
            int r6 = r17.length()
            if (r4 >= r6) goto L_0x0105
        L_0x0010:
            int r6 = r17.length()
            r7 = 69
            r8 = 101(0x65, float:1.42E-43)
            if (r4 >= r6) goto L_0x0037
            char r6 = r0.charAt(r4)
            int r9 = r6 + -65
            int r10 = r6 + -90
            int r9 = r9 * r10
            if (r9 <= 0) goto L_0x002f
            int r9 = r6 + -97
            int r10 = r6 + -122
            int r9 = r9 * r10
            if (r9 <= 0) goto L_0x002f
            goto L_0x0034
        L_0x002f:
            if (r6 == r8) goto L_0x0034
            if (r6 == r7) goto L_0x0034
            goto L_0x0037
        L_0x0034:
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0037:
            java.lang.String r5 = r0.substring(r5, r4)
            java.lang.String r5 = r5.trim()
            int r6 = r5.length()
            if (r6 > 0) goto L_0x0047
            goto L_0x00fd
        L_0x0047:
            char r6 = r5.charAt(r3)
            r9 = 122(0x7a, float:1.71E-43)
            if (r6 == r9) goto L_0x00f2
            char r6 = r5.charAt(r3)
            r9 = 90
            if (r6 != r9) goto L_0x0059
            goto L_0x00f2
        L_0x0059:
            int r6 = r5.length()     // Catch:{ NumberFormatException -> 0x00d5 }
            float[] r6 = new float[r6]     // Catch:{ NumberFormatException -> 0x00d5 }
            be r9 = new be     // Catch:{ NumberFormatException -> 0x00d5 }
            r9.<init>()     // Catch:{ NumberFormatException -> 0x00d5 }
            int r10 = r5.length()     // Catch:{ NumberFormatException -> 0x00d5 }
            r11 = 1
            r12 = 0
        L_0x006a:
            if (r11 >= r10) goto L_0x00ce
            r9.f3507a = r3     // Catch:{ NumberFormatException -> 0x00d5 }
            r13 = r11
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x0073:
            int r3 = r5.length()     // Catch:{ NumberFormatException -> 0x00d5 }
            if (r13 >= r3) goto L_0x00b0
            char r3 = r5.charAt(r13)     // Catch:{ NumberFormatException -> 0x00d5 }
            r2 = 32
            if (r3 == r2) goto L_0x00a6
            if (r3 == r7) goto L_0x00a4
            if (r3 == r8) goto L_0x00a4
            switch(r3) {
                case 44: goto L_0x00a6;
                case 45: goto L_0x0097;
                case 46: goto L_0x008b;
                default: goto L_0x0088;
            }     // Catch:{ NumberFormatException -> 0x00d5 }
        L_0x0088:
        L_0x0089:
            r15 = 0
            goto L_0x00a9
        L_0x008b:
            if (r14 != 0) goto L_0x008f
            r14 = 1
            goto L_0x0089
        L_0x008f:
            r2 = 1
            r9.f3507a = r2     // Catch:{ NumberFormatException -> 0x00d5 }
            r15 = 0
            r16 = 1
            goto L_0x00a9
        L_0x0097:
            if (r13 == r11) goto L_0x0088
            if (r15 != 0) goto L_0x00a3
            r2 = 1
            r9.f3507a = r2     // Catch:{ NumberFormatException -> 0x00d5 }
            r15 = 0
            r16 = 1
            goto L_0x00a9
        L_0x00a3:
            goto L_0x0088
        L_0x00a4:
            r15 = 1
            goto L_0x00a9
        L_0x00a6:
            r15 = 0
            r16 = 1
        L_0x00a9:
            if (r16 != 0) goto L_0x00b0
            int r13 = r13 + 1
            r3 = 0
            goto L_0x0073
        L_0x00b0:
            if (r11 < r13) goto L_0x00b3
            goto L_0x00c3
        L_0x00b3:
            int r2 = r12 + 1
            java.lang.String r3 = r5.substring(r11, r13)     // Catch:{ NumberFormatException -> 0x00d5 }
            float r3 = java.lang.Float.parseFloat(r3)     // Catch:{ NumberFormatException -> 0x00d5 }
            r6[r12] = r3     // Catch:{ NumberFormatException -> 0x00d5 }
            r12 = r2
        L_0x00c3:
            boolean r2 = r9.f3507a     // Catch:{ NumberFormatException -> 0x00d5 }
            if (r2 != 0) goto L_0x00cb
            int r11 = r13 + 1
            r3 = 0
            goto L_0x006a
        L_0x00cb:
            r11 = r13
            r3 = 0
            goto L_0x006a
        L_0x00ce:
            float[] r2 = m3113a(r6, r12)     // Catch:{ NumberFormatException -> 0x00d5 }
            r3 = r2
            r2 = 0
            goto L_0x00f5
        L_0x00d5:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "error in parsing \""
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = "\""
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x00f2:
            r2 = 0
            float[] r3 = new float[r2]
        L_0x00f5:
            char r5 = r5.charAt(r2)
            m3110a(r1, r5, r3)
        L_0x00fd:
            int r2 = r4 + 1
            r5 = r4
            r3 = 0
            r4 = r2
            goto L_0x000a
        L_0x0105:
            int r4 = r4 - r5
            r2 = 1
            if (r4 != r2) goto L_0x0119
            int r2 = r17.length()
            if (r5 >= r2) goto L_0x0119
            char r0 = r0.charAt(r5)
            r2 = 0
            float[] r2 = new float[r2]
            m3110a(r1, r0, r2)
        L_0x0119:
            int r0 = r1.size()
            bf[] r0 = new p000.C0034bf[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            bf[] r0 = (p000.C0034bf[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0035bg.m3114a(java.lang.String):bf[]");
    }

    /* renamed from: a */
    public static C0034bf[] m3115a(C0034bf[] bfVarArr) {
        if (bfVarArr == null) {
            return null;
        }
        C0034bf[] bfVarArr2 = new C0034bf[bfVarArr.length];
        for (int i = 0; i < bfVarArr.length; i++) {
            bfVarArr2[i] = new C0034bf(bfVarArr[i]);
        }
        return bfVarArr2;
    }
}
