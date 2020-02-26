package p000;

/* renamed from: dc */
/* compiled from: PG */
public class C0086dc {
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m6102a(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) {
        /*
            r0 = r19
            r1 = r20
            java.lang.String r2 = r18.getName()
            java.lang.String r3 = "selector"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x0105
            int r2 = r18.getDepth()
            r3 = 1
            int r2 = r2 + r3
            r4 = 20
            int[][] r5 = new int[r4][]
            int[] r4 = new int[r4]
            r6 = 0
            r7 = 0
        L_0x001e:
            int r8 = r18.next()
            if (r8 == r3) goto L_0x00f5
            int r9 = r18.getDepth()
            if (r9 >= r2) goto L_0x002d
            r10 = 3
            if (r8 == r10) goto L_0x00f5
        L_0x002d:
            r10 = 2
            if (r8 != r10) goto L_0x00f0
            if (r9 > r2) goto L_0x00f0
            java.lang.String r8 = r18.getName()
            java.lang.String r9 = "item"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x00ed
            int[] r8 = p000.C0677z.f10844a
            if (r1 == 0) goto L_0x0049
            android.content.res.TypedArray r8 = r1.obtainStyledAttributes(r0, r8, r6, r6)
            r9 = r17
            goto L_0x004f
        L_0x0049:
            r9 = r17
            android.content.res.TypedArray r8 = r9.obtainAttributes(r0, r8)
        L_0x004f:
            r11 = -65281(0xffffffffffff00ff, float:NaN)
            int r11 = r8.getColor(r6, r11)
            boolean r12 = r8.hasValue(r3)
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto L_0x0063
            float r13 = r8.getFloat(r3, r13)
            goto L_0x0070
        L_0x0063:
            boolean r12 = r8.hasValue(r10)
            if (r12 != 0) goto L_0x006b
            goto L_0x0070
        L_0x006b:
            float r13 = r8.getFloat(r10, r13)
        L_0x0070:
            r8.recycle()
            int r8 = r19.getAttributeCount()
            int[] r10 = new int[r8]
            r12 = 0
            r14 = 0
        L_0x007b:
            if (r12 >= r8) goto L_0x00a2
            int r15 = r0.getAttributeNameResource(r12)
            r3 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r15 != r3) goto L_0x0087
        L_0x0086:
            goto L_0x009e
        L_0x0087:
            r3 = 16843551(0x101031f, float:2.3695797E-38)
            if (r15 == r3) goto L_0x0086
            r3 = 2130968622(0x7f04002e, float:1.7545903E38)
            if (r15 == r3) goto L_0x0086
            int r3 = r14 + 1
            boolean r16 = r0.getAttributeBooleanValue(r12, r6)
            if (r16 != 0) goto L_0x009a
            int r15 = -r15
        L_0x009a:
            r10[r14] = r15
            r14 = r3
        L_0x009e:
            int r12 = r12 + 1
            r3 = 1
            goto L_0x007b
        L_0x00a2:
            int[] r3 = android.util.StateSet.trimStateSet(r10, r14)
            r8 = 16777215(0xffffff, float:2.3509886E-38)
            r8 = r8 & r11
            int r10 = android.graphics.Color.alpha(r11)
            float r10 = (float) r10
            float r10 = r10 * r13
            int r10 = java.lang.Math.round(r10)
            int r10 = r10 << 24
            r8 = r8 | r10
            int r10 = r7 + 1
            int r11 = r4.length
            if (r10 > r11) goto L_0x00be
            goto L_0x00c9
        L_0x00be:
            int r11 = p000.C0194hc.m7489c(r7)
            int[] r11 = new int[r11]
            java.lang.System.arraycopy(r4, r6, r11, r6, r7)
            r4 = r11
        L_0x00c9:
            r4[r7] = r8
            int r8 = r5.length
            if (r10 <= r8) goto L_0x00e4
            java.lang.Class r8 = r5.getClass()
            java.lang.Class r8 = r8.getComponentType()
            int r11 = p000.C0194hc.m7489c(r7)
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r8, r11)
            java.lang.Object[] r8 = (java.lang.Object[]) r8
            java.lang.System.arraycopy(r5, r6, r8, r6, r7)
            r5 = r8
        L_0x00e4:
            r5[r7] = r3
            int[][] r5 = (int[][]) r5
            r7 = r10
            r3 = 1
            goto L_0x001e
        L_0x00ed:
            r9 = r17
            goto L_0x00f2
        L_0x00f0:
            r9 = r17
        L_0x00f2:
            r3 = 1
            goto L_0x001e
        L_0x00f5:
            int[] r0 = new int[r7]
            int[][] r1 = new int[r7][]
            java.lang.System.arraycopy(r4, r6, r0, r6, r7)
            java.lang.System.arraycopy(r5, r6, r1, r6, r7)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        L_0x0105:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r18.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = ": invalid color state list tag "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            goto L_0x0124
        L_0x0123:
            throw r0
        L_0x0124:
            goto L_0x0123
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0086dc.m6102a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* renamed from: a */
    public static void m6106a(Object obj, StringBuilder sb) {
        int lastIndexOf;
        if (obj != null) {
            String simpleName = obj.getClass().getSimpleName();
            if ((simpleName == null || simpleName.length() <= 0) && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
            return;
        }
        sb.append("null");
    }

    /* renamed from: a */
    public static void m6105a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static Object m6103a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw null;
    }

    /* renamed from: a */
    public static Object m6104a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }
}
