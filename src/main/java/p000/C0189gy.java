package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: gy */
/* compiled from: PG */
final class C0189gy {

    /* renamed from: a */
    private final View f9437a;

    /* renamed from: b */
    private final C0192ha f9438b;

    /* renamed from: c */
    private int f9439c = -1;

    /* renamed from: d */
    private C0296kx f9440d;

    /* renamed from: e */
    private C0296kx f9441e;

    public C0189gy(View view) {
        this.f9437a = view;
        this.f9438b = C0192ha.m7478a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5099a() {
        Drawable background = this.f9437a.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            if (this.f9440d != null) {
                if (this.f9441e == null) {
                    this.f9441e = new C0296kx();
                }
                C0296kx kxVar = this.f9441e;
                kxVar.f9829a = null;
                kxVar.f9832d = false;
                kxVar.f9830b = null;
                kxVar.f9831c = false;
                ColorStateList k = C0107dx.m7214k(this.f9437a);
                if (k != null) {
                    kxVar.f9832d = true;
                    kxVar.f9829a = k;
                }
                PorterDuff.Mode l = C0107dx.m7215l(this.f9437a);
                if (l != null) {
                    kxVar.f9831c = true;
                    kxVar.f9830b = l;
                }
                if (kxVar.f9832d || kxVar.f9831c) {
                    C0192ha.m7479a(background, kxVar, this.f9437a.getDrawableState());
                    return;
                }
            }
            C0296kx kxVar2 = this.f9440d;
            if (kxVar2 != null) {
                C0192ha.m7479a(background, kxVar2, this.f9437a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5101a(AttributeSet attributeSet, int i) {
        C0298kz a = C0298kz.m7865a(this.f9437a.getContext(), attributeSet, C0128er.f9182t, i);
        try {
            if (a.mo5522e(0)) {
                this.f9439c = a.mo5521e(0, -1);
                ColorStateList b = this.f9438b.mo5106b(this.f9437a.getContext(), this.f9439c);
                if (b != null) {
                    m7468a(b);
                }
            }
            if (a.mo5522e(1)) {
                C0107dx.m7197a(this.f9437a, a.mo5520d(1));
            }
            if (a.mo5522e(2)) {
                C0107dx.m7198a(this.f9437a, C0220ib.m7558a(a.mo5511a(2, -1), null));
            }
        } finally {
            a.mo5513a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo5102b() {
        this.f9439c = -1;
        m7468a((ColorStateList) null);
        mo5099a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5100a(int i) {
        ColorStateList colorStateList;
        this.f9439c = i;
        C0192ha haVar = this.f9438b;
        if (haVar != null) {
            colorStateList = haVar.mo5106b(this.f9437a.getContext(), i);
        } else {
            colorStateList = null;
        }
        m7468a(colorStateList);
        mo5099a();
    }

    /* renamed from: a */
    private final void m7468a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f9440d == null) {
                this.f9440d = new C0296kx();
            }
            C0296kx kxVar = this.f9440d;
            kxVar.f9829a = colorStateList;
            kxVar.f9832d = true;
        } else {
            this.f9440d = null;
        }
        mo5099a();
    }
}
