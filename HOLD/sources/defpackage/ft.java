package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.tvlauncher.R;

/* renamed from: ft  reason: default package */
/* compiled from: PG */
public class ft {
    public View a;
    public int b;
    public PopupWindow.OnDismissListener c;
    private final Context d;
    private final fo e;
    private final boolean f;
    private final int g;
    private boolean h;
    private fu i;
    private fr j;
    private final PopupWindow.OnDismissListener k;

    public ft(Context context, fo foVar, View view, boolean z) {
        this(context, foVar, view, z, R.attr.actionOverflowMenuStyle);
    }

    public ft(Context context, fo foVar, View view, boolean z, int i2) {
        this.b = 8388611;
        this.k = new fs(this);
        this.d = context;
        this.e = foVar;
        this.a = view;
        this.f = z;
        this.g = i2;
    }

    public final void c() {
        if (e()) {
            this.j.d();
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r0v10, types: [fl] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.fr a() {
        /*
            r11 = this;
            fr r0 = r11.j
            if (r0 != 0) goto L_0x0071
            android.content.Context r0 = r11.d
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r0.getRealSize(r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r11.d
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165206(0x7f070016, float:1.7944623E38)
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0041
            fl r0 = new fl
            android.content.Context r1 = r11.d
            android.view.View r2 = r11.a
            int r3 = r11.g
            boolean r4 = r11.f
            r0.<init>(r1, r2, r3, r4)
            goto L_0x0051
        L_0x0041:
            gb r0 = new gb
            android.content.Context r6 = r11.d
            fo r7 = r11.e
            android.view.View r8 = r11.a
            int r9 = r11.g
            boolean r10 = r11.f
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x0051:
            fo r1 = r11.e
            r0.a(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r11.k
            r0.a(r1)
            android.view.View r1 = r11.a
            r0.a(r1)
            fu r1 = r11.i
            r0.a(r1)
            boolean r1 = r11.h
            r0.a(r1)
            int r1 = r11.b
            r0.a(r1)
            r11.j = r0
        L_0x0071:
            fr r0 = r11.j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ft.a():fr");
    }

    public final boolean e() {
        fr frVar = this.j;
        return frVar != null && frVar.e();
    }

    /* access modifiers changed from: protected */
    public void d() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void a(boolean z) {
        this.h = z;
        fr frVar = this.j;
        if (frVar != null) {
            frVar.a(z);
        }
    }

    public final void a(fu fuVar) {
        this.i = fuVar;
        fr frVar = this.j;
        if (frVar != null) {
            frVar.a(fuVar);
        }
    }

    public final void a(int i2, int i3, boolean z, boolean z2) {
        fr a2 = a();
        a2.b(z2);
        if (z) {
            if ((el.a(this.b, dx.f(this.a)) & 7) == 5) {
                i2 -= this.a.getWidth();
            }
            a2.b(i2);
            a2.c(i3);
            int i4 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.g = new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4);
        }
        a2.c();
    }

    public final boolean b() {
        if (e()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        a(0, 0, false, false);
        return true;
    }
}
