package p000;

import android.content.Context;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.tvlauncher.R;

/* renamed from: cpn */
/* compiled from: PG */
class cpn extends C0285km {

    /* renamed from: A */
    public final TextView f6889A;

    /* renamed from: B */
    public dcw f6890B;

    /* renamed from: C */
    public final /* synthetic */ cpo f6891C;

    /* renamed from: p */
    private final int f6892p;

    /* renamed from: q */
    private final Runnable f6893q = new cpj(this);

    /* renamed from: y */
    public final Context f6894y;

    /* renamed from: z */
    public final ImageView f6895z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cpn(cpo cpo, View view) {
        super(view);
        this.f6891C = cpo;
        this.f6894y = view.getContext();
        this.f6889A = (TextView) view.findViewById(R.id.app_title);
        this.f6895z = (ImageView) view.findViewById(R.id.banner_image);
        this.f6892p = (-view.getResources().getDimensionPixelSize(R.dimen.app_banner_title_height)) / 2;
        cpk cpk = new cpk(this);
        if (!dcy.m6195d(this.f6894y)) {
            dcw dcw = new dcw(cpo.f6899e);
            this.f6890B = dcw;
            dcw.mo4132a(view);
            dcw dcw2 = this.f6890B;
            dcw2.f8307d = cpk;
            dcw2.f8309f = this.f6892p;
            return;
        }
        view.setOnFocusChangeListener(cpk);
    }

    /* renamed from: a */
    public void mo3546a(chn chn) {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r0 != 7) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0088  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3562y() {
        /*
            r4 = this;
            android.view.View r0 = r4.f9783a
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            cpo r1 = r4.f6891C
            int r2 = r1.f6897c
            r3 = 0
            switch(r2) {
                case 1: goto L_0x003f;
                case 2: goto L_0x002f;
                case 3: goto L_0x001f;
                case 4: goto L_0x001f;
                case 5: goto L_0x001f;
                case 6: goto L_0x001f;
                case 7: goto L_0x001f;
                default: goto L_0x0010;
            }
        L_0x0010:
            int r2 = r1.f6900f
            int r1 = r1.f6901g
            r0.setMargins(r3, r2, r3, r1)
            cpo r1 = r4.f6891C
            int r1 = r1.f6903i
            r0.setMarginEnd(r1)
            goto L_0x004e
        L_0x001f:
            int r2 = r1.f6906l
            int r1 = r1.f6907m
            r0.setMargins(r3, r2, r3, r1)
            cpo r1 = r4.f6891C
            int r1 = r1.f6905k
            r0.setMarginEnd(r1)
            goto L_0x004e
        L_0x002f:
            int r2 = r1.f6900f
            int r1 = r1.f6902h
            r0.setMargins(r3, r2, r3, r1)
            cpo r1 = r4.f6891C
            int r1 = r1.f6903i
            r0.setMarginEnd(r1)
            goto L_0x004e
        L_0x003f:
            int r2 = r1.f6900f
            int r1 = r1.f6904j
            r0.setMargins(r3, r2, r3, r1)
            cpo r1 = r4.f6891C
            int r1 = r1.f6903i
            r0.setMarginEnd(r1)
        L_0x004e:
            android.view.View r1 = r4.f9783a
            r1.setLayoutParams(r0)
            cpo r0 = r4.f6891C
            int r0 = r0.f6897c
            r1 = 1
            if (r0 == 0) goto L_0x0070
            if (r0 == r1) goto L_0x0070
            r2 = 3
            if (r0 == r2) goto L_0x0070
            r2 = 9
            if (r0 == r2) goto L_0x006d
            r2 = 5
            if (r0 == r2) goto L_0x0070
            r2 = 6
            if (r0 == r2) goto L_0x0070
            r2 = 7
            if (r0 == r2) goto L_0x0070
            goto L_0x0073
        L_0x006d:
            r3 = 2
            goto L_0x0073
        L_0x0070:
            r3 = 1
        L_0x0073:
            android.view.View r0 = r4.f9783a
            cus r0 = (p000.cus) r0
            r0.mo3224a(r3)
            android.view.View r0 = r4.f9783a
            cpo r1 = r4.f6891C
            int r1 = r1.f6897c
            r2 = 8
            if (r1 != r2) goto L_0x0088
            r1 = 1036831949(0x3dcccccd, float:0.1)
            goto L_0x008b
        L_0x0088:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x008b:
            r0.setAlpha(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cpn.mo3562y():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo3551b(boolean z) {
        if (dcy.m6195d(this.f6894y)) {
            this.f6891C.f6919y.removeCallbacks(this.f6893q);
            if (!z) {
                this.f6891C.f6898d = mo5436d();
                return;
            }
            RecyclerView recyclerView = this.f6891C.f6918x;
            if (recyclerView != null && !recyclerView.mo892l()) {
                this.f6893q.run();
            } else {
                this.f6891C.f6919y.post(this.f6893q);
            }
        } else {
            TextView textView = this.f6889A;
            if (textView != null) {
                textView.setSelected(this.f9783a.hasFocus());
                this.f9783a.postDelayed(new cpl(this, z), 60);
            }
        }
    }

    /* renamed from: u */
    public void mo3548u() {
        float f;
        boolean isFocused = this.f9783a.isFocused();
        float f2 = isFocused ? this.f6891C.f6911q : 1.0f;
        if (isFocused) {
            f = this.f6891C.f6912r;
        } else {
            f = 0.0f;
        }
        this.f9783a.setScaleX(f2);
        this.f9783a.setScaleY(f2);
        this.f9783a.setElevation(f);
        this.f6889A.setSelected(isFocused);
        int i = this.f9783a.getLayoutParams().width;
        int i2 = this.f9783a.getLayoutParams().height;
        if (i <= 0 || i2 <= 0) {
            i = this.f9783a.getWidth();
            i2 = this.f9783a.getHeight();
        }
        if (i > 0 && i2 > 0) {
            if (mo5436d() != 0) {
                i >>= 1;
            } else if (this.f9783a.getLayoutDirection() != 1) {
                i = 0;
            }
            this.f9783a.setPivotX((float) i);
            this.f9783a.setPivotY((float) ((i2 >> 1) + this.f6892p));
        }
    }
}
