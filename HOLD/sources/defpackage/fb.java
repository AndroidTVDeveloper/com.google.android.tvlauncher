package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.MenuInflater;

/* renamed from: fb  reason: default package */
/* compiled from: PG */
public final class fb extends MenuInflater {
    public static final Class[] a;
    private static final Class[] e;
    public final Object[] b;
    public final Context c;
    public Object d;
    private final Object[] f;

    static {
        Class[] clsArr = {Context.class};
        a = clsArr;
        e = clsArr;
    }

    public fb(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.b = objArr;
        this.f = objArr;
    }

    public final Object a(Object obj) {
        return ((obj instanceof Activity) || !(obj instanceof ContextWrapper)) ? obj : a(((ContextWrapper) obj).getBaseContext());
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void inflate(int r4, android.view.Menu r5) {
        /*
            r3 = this;
            java.lang.String r0 = "Error inflating menu XML"
            boolean r1 = r5 instanceof defpackage.bs
            if (r1 == 0) goto L_0x003c
            r1 = 0
            android.content.Context r2 = r3.c     // Catch:{ XmlPullParserException -> 0x002b, IOException -> 0x0024, all -> 0x0022 }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ XmlPullParserException -> 0x002b, IOException -> 0x0024, all -> 0x0022 }
            android.content.res.XmlResourceParser r1 = r2.getLayout(r4)     // Catch:{ XmlPullParserException -> 0x002b, IOException -> 0x0024, all -> 0x0022 }
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r1)     // Catch:{ XmlPullParserException -> 0x0020, IOException -> 0x001e }
            r3.a(r1, r4, r5)     // Catch:{ XmlPullParserException -> 0x0020, IOException -> 0x001e }
            if (r1 == 0) goto L_0x001d
            r1.close()
        L_0x001d:
            return
        L_0x001e:
            r4 = move-exception
            goto L_0x0025
        L_0x0020:
            r4 = move-exception
            goto L_0x002c
        L_0x0022:
            r4 = move-exception
            goto L_0x0035
        L_0x0024:
            r4 = move-exception
        L_0x0025:
            android.view.InflateException r5 = new android.view.InflateException     // Catch:{ all -> 0x0032 }
            r5.<init>(r0, r4)     // Catch:{ all -> 0x0032 }
            throw r5     // Catch:{ all -> 0x0032 }
        L_0x002b:
            r4 = move-exception
        L_0x002c:
            android.view.InflateException r5 = new android.view.InflateException     // Catch:{ all -> 0x0032 }
            r5.<init>(r0, r4)     // Catch:{ all -> 0x0032 }
            throw r5     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r4 = move-exception
        L_0x0035:
            if (r1 != 0) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            r1.close()
        L_0x003b:
            throw r4
        L_0x003c:
            super.inflate(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb.inflate(int, android.view.Menu):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: kz.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      kz.a(int, int):int
      kz.a(int, boolean):boolean */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(org.xmlpull.v1.XmlPullParser r17, android.util.AttributeSet r18, android.view.Menu r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            fa r2 = new fa
            r3 = r19
            r2.<init>(r0, r3)
            int r3 = r17.getEventType()
        L_0x000f:
            java.lang.String r4 = "menu"
            r5 = 2
            r6 = 1
            if (r3 == r5) goto L_0x001c
            int r3 = r17.next()
            if (r3 != r6) goto L_0x000f
            goto L_0x002a
        L_0x001c:
            java.lang.String r3 = r17.getName()
            boolean r7 = r3.equals(r4)
            if (r7 == 0) goto L_0x0256
            int r3 = r17.next()
        L_0x002a:
            r7 = 0
            r8 = 0
            r9 = r3
            r11 = r7
            r3 = 0
            r10 = 0
        L_0x0031:
            if (r3 != 0) goto L_0x0255
            if (r9 == r6) goto L_0x024d
            java.lang.String r12 = "item"
            java.lang.String r13 = "group"
            r14 = 3
            if (r9 == r5) goto L_0x00a0
            if (r9 == r14) goto L_0x0042
        L_0x003e:
            r12 = r17
            r5 = r7
            goto L_0x0079
        L_0x0042:
            java.lang.String r9 = r17.getName()
            if (r10 != 0) goto L_0x0049
            goto L_0x0057
        L_0x0049:
            boolean r14 = r9.equals(r11)
            if (r14 == 0) goto L_0x0057
            r12 = r17
            r5 = r7
            r11 = r5
            r7 = 2
            r10 = 0
            goto L_0x0244
        L_0x0057:
            boolean r13 = r9.equals(r13)
            if (r13 == 0) goto L_0x0068
            r2.a()
            r12 = r17
            r5 = r7
            r7 = 2
            goto L_0x0244
        L_0x0068:
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x007c
            boolean r9 = r9.equals(r4)
            if (r9 == 0) goto L_0x003e
            r12 = r17
            r5 = r7
            r3 = 1
        L_0x0079:
            r7 = 2
            goto L_0x0244
        L_0x007c:
            boolean r9 = r2.h
            if (r9 != 0) goto L_0x003e
            el r9 = r2.F
            if (r9 != 0) goto L_0x009e
            r2.h = r6
            android.view.Menu r9 = r2.a
            int r12 = r2.b
            int r13 = r2.i
            int r14 = r2.j
            java.lang.CharSequence r15 = r2.k
            android.view.MenuItem r9 = r9.add(r12, r13, r14, r15)
            r2.a(r9)
            r12 = r17
            r5 = r7
            r7 = 2
            goto L_0x0244
        L_0x009e:
            throw r7
        L_0x00a0:
            if (r10 != 0) goto L_0x0240
            java.lang.String r9 = r17.getName()
            boolean r13 = r9.equals(r13)
            r15 = 5
            r7 = 4
            if (r13 != 0) goto L_0x0209
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x00e3
            boolean r7 = r9.equals(r4)
            if (r7 == 0) goto L_0x00db
            r2.h = r6
            android.view.Menu r7 = r2.a
            int r9 = r2.b
            int r12 = r2.i
            int r13 = r2.j
            java.lang.CharSequence r14 = r2.k
            android.view.SubMenu r7 = r7.addSubMenu(r9, r12, r13, r14)
            android.view.MenuItem r9 = r7.getItem()
            r2.a(r9)
            r12 = r17
            r0.a(r12, r1, r7)
            r5 = 0
            r7 = 2
            goto L_0x0244
        L_0x00db:
            r12 = r17
            r11 = r9
            r5 = 0
            r7 = 2
            r10 = 1
            goto L_0x0244
        L_0x00e3:
            r12 = r17
            fb r9 = r2.E
            android.content.Context r9 = r9.c
            int[] r13 = defpackage.er.m
            kz r9 = defpackage.kz.a(r9, r1, r13)
            int r13 = r9.e(r5, r8)
            r2.i = r13
            int r13 = r2.c
            int r13 = r9.a(r15, r13)
            r15 = -65536(0xffffffffffff0000, float:NaN)
            r13 = r13 & r15
            r15 = 6
            int r5 = r2.d
            int r5 = r9.a(r15, r5)
            char r5 = (char) r5
            r5 = r5 | r13
            r2.j = r5
            r5 = 7
            java.lang.CharSequence r5 = r9.b(r5)
            r2.k = r5
            r5 = 8
            java.lang.CharSequence r5 = r9.b(r5)
            r2.l = r5
            int r5 = r9.e(r8, r8)
            r2.m = r5
            r5 = 9
            java.lang.String r5 = r9.c(r5)
            char r5 = defpackage.fa.a(r5)
            r2.n = r5
            r5 = 16
            r13 = 4096(0x1000, float:5.74E-42)
            int r5 = r9.a(r5, r13)
            r2.o = r5
            r5 = 10
            java.lang.String r5 = r9.c(r5)
            char r5 = defpackage.fa.a(r5)
            r2.p = r5
            r5 = 20
            int r5 = r9.a(r5, r13)
            r2.q = r5
            r5 = 11
            boolean r13 = r9.e(r5)
            if (r13 == 0) goto L_0x0157
            boolean r5 = r9.a(r5, r8)
            r2.r = r5
            goto L_0x015b
        L_0x0157:
            int r5 = r2.e
            r2.r = r5
        L_0x015b:
            boolean r5 = r9.a(r14, r8)
            r2.s = r5
            boolean r5 = r2.f
            boolean r5 = r9.a(r7, r5)
            r2.t = r5
            boolean r5 = r2.g
            boolean r5 = r9.a(r6, r5)
            r2.u = r5
            r5 = 21
            r7 = -1
            int r5 = r9.a(r5, r7)
            r2.v = r5
            r5 = 12
            java.lang.String r5 = r9.c(r5)
            r2.z = r5
            r5 = 13
            int r5 = r9.e(r5, r8)
            r2.w = r5
            r5 = 15
            java.lang.String r5 = r9.c(r5)
            r2.x = r5
            r5 = 14
            java.lang.String r5 = r9.c(r5)
            r2.y = r5
            java.lang.String r5 = r2.y
            if (r5 == 0) goto L_0x01bf
            int r13 = r2.w
            if (r13 == 0) goto L_0x01a4
            goto L_0x01b7
        L_0x01a4:
            java.lang.String r13 = r2.x
            if (r13 != 0) goto L_0x01b7
            java.lang.Class[] r13 = defpackage.fb.e
            fb r14 = r2.E
            java.lang.Object[] r14 = r14.f
            java.lang.Object r5 = r2.a(r5, r13, r14)
            el r5 = (defpackage.el) r5
            r2.F = r5
            goto L_0x01c3
        L_0x01b7:
            java.lang.String r5 = "SupportMenuInflater"
            java.lang.String r13 = "Ignoring attribute 'actionProviderClass'. Action view already specified."
            android.util.Log.w(r5, r13)
        L_0x01bf:
            r5 = 0
            r2.F = r5
        L_0x01c3:
            r5 = 17
            java.lang.CharSequence r5 = r9.b(r5)
            r2.A = r5
            r5 = 22
            java.lang.CharSequence r5 = r9.b(r5)
            r2.B = r5
            r5 = 19
            boolean r13 = r9.e(r5)
            if (r13 == 0) goto L_0x01e8
            int r5 = r9.a(r5, r7)
            android.graphics.PorterDuff$Mode r7 = r2.D
            android.graphics.PorterDuff$Mode r5 = defpackage.ib.a(r5, r7)
            r2.D = r5
            goto L_0x01ec
        L_0x01e8:
            r5 = 0
            r2.D = r5
        L_0x01ec:
            r5 = 18
            boolean r7 = r9.e(r5)
            if (r7 == 0) goto L_0x01fd
            android.content.res.ColorStateList r5 = r9.d(r5)
            r2.C = r5
            r5 = 0
            goto L_0x0201
        L_0x01fd:
            r5 = 0
            r2.C = r5
        L_0x0201:
            r9.a()
            r2.h = r8
            r7 = 2
            goto L_0x0244
        L_0x0209:
            r12 = r17
            r5 = 0
            fb r9 = r2.E
            android.content.Context r9 = r9.c
            int[] r13 = defpackage.er.l
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r1, r13)
            int r13 = r9.getResourceId(r6, r8)
            r2.b = r13
            int r13 = r9.getInt(r14, r8)
            r2.c = r13
            int r7 = r9.getInt(r7, r8)
            r2.d = r7
            int r7 = r9.getInt(r15, r8)
            r2.e = r7
            r7 = 2
            boolean r13 = r9.getBoolean(r7, r6)
            r2.f = r13
            boolean r13 = r9.getBoolean(r8, r6)
            r2.g = r13
            r9.recycle()
            goto L_0x0244
        L_0x0240:
            r12 = r17
            r5 = r7
            r7 = 2
        L_0x0244:
            int r9 = r17.next()
            r7 = r5
            r5 = 2
            goto L_0x0031
        L_0x024d:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unexpected end of document"
            r1.<init>(r2)
            throw r1
        L_0x0255:
            return
        L_0x0256:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Expecting menu, got "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            goto L_0x026e
        L_0x026d:
            throw r1
        L_0x026e:
            goto L_0x026d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb.a(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }
}
