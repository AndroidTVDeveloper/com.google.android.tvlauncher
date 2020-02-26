package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.tvlauncher.R;

/* renamed from: ft */
/* compiled from: PG */
public class C0157ft {

    /* renamed from: a */
    public View f9353a;

    /* renamed from: b */
    public int f9354b;

    /* renamed from: c */
    public PopupWindow.OnDismissListener f9355c;

    /* renamed from: d */
    private final Context f9356d;

    /* renamed from: e */
    private final C0152fo f9357e;

    /* renamed from: f */
    private final boolean f9358f;

    /* renamed from: g */
    private final int f9359g;

    /* renamed from: h */
    private boolean f9360h;

    /* renamed from: i */
    private C0158fu f9361i;

    /* renamed from: j */
    private C0155fr f9362j;

    /* renamed from: k */
    private final PopupWindow.OnDismissListener f9363k;

    public C0157ft(Context context, C0152fo foVar, View view, boolean z) {
        this(context, foVar, view, z, R.attr.actionOverflowMenuStyle);
    }

    public C0157ft(Context context, C0152fo foVar, View view, boolean z, int i) {
        this.f9354b = 8388611;
        this.f9363k = new C0156fs(this);
        this.f9356d = context;
        this.f9357e = foVar;
        this.f9353a = view;
        this.f9358f = z;
        this.f9359g = i;
    }

    /* renamed from: c */
    public final void mo5033c() {
        if (mo5035e()) {
            this.f9362j.mo4849d();
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r0v10, types: [fl] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.C0155fr mo5028a() {
        /*
            r11 = this;
            fr r0 = r11.f9362j
            if (r0 != 0) goto L_0x0071
            android.content.Context r0 = r11.f9356d
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
            android.content.Context r1 = r11.f9356d
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165206(0x7f070016, float:1.7944623E38)
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0041
            fl r0 = new fl
            android.content.Context r1 = r11.f9356d
            android.view.View r2 = r11.f9353a
            int r3 = r11.f9359g
            boolean r4 = r11.f9358f
            r0.<init>(r1, r2, r3, r4)
            goto L_0x0051
        L_0x0041:
            gb r0 = new gb
            android.content.Context r6 = r11.f9356d
            fo r7 = r11.f9357e
            android.view.View r8 = r11.f9353a
            int r9 = r11.f9359g
            boolean r10 = r11.f9358f
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x0051:
            fo r1 = r11.f9357e
            r0.mo4843a(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r11.f9363k
            r0.mo4842a(r1)
            android.view.View r1 = r11.f9353a
            r0.mo4841a(r1)
            fu r1 = r11.f9361i
            r0.mo4829a(r1)
            boolean r1 = r11.f9360h
            r0.mo4844a(r1)
            int r1 = r11.f9354b
            r0.mo4840a(r1)
            r11.f9362j = r0
        L_0x0071:
            fr r0 = r11.f9362j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0157ft.mo5028a():fr");
    }

    /* renamed from: e */
    public final boolean mo5035e() {
        C0155fr frVar = this.f9362j;
        return frVar != null && frVar.mo4850e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo5034d() {
        this.f9362j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f9355c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: a */
    public final void mo5031a(boolean z) {
        this.f9360h = z;
        C0155fr frVar = this.f9362j;
        if (frVar != null) {
            frVar.mo4844a(z);
        }
    }

    /* renamed from: a */
    public final void mo5030a(C0158fu fuVar) {
        this.f9361i = fuVar;
        C0155fr frVar = this.f9362j;
        if (frVar != null) {
            frVar.mo4829a(fuVar);
        }
    }

    /* renamed from: a */
    public final void mo5029a(int i, int i2, boolean z, boolean z2) {
        C0155fr a = mo5028a();
        a.mo4846b(z2);
        if (z) {
            if ((C0122el.m7244a(this.f9354b, C0107dx.m7209f(this.f9353a)) & 7) == 5) {
                i -= this.f9353a.getWidth();
            }
            a.mo4845b(i);
            a.mo4848c(i2);
            int i3 = (int) ((this.f9356d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.f9351g = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a.mo4847c();
    }

    /* renamed from: b */
    public final boolean mo5032b() {
        if (mo5035e()) {
            return true;
        }
        if (this.f9353a == null) {
            return false;
        }
        mo5029a(0, 0, false, false);
        return true;
    }
}
