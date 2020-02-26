package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.tvlauncher.R;

/* renamed from: cpn  reason: default package */
/* compiled from: PG */
class cpn extends km {
    public final TextView A;
    public dcw B;
    public final /* synthetic */ cpo C;
    private final int p;
    private final Runnable q = new cpj(this);
    public final Context y;
    public final ImageView z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cpn(cpo cpo, View view) {
        super(view);
        this.C = cpo;
        this.y = view.getContext();
        this.A = (TextView) view.findViewById(R.id.app_title);
        this.z = (ImageView) view.findViewById(R.id.banner_image);
        this.p = (-view.getResources().getDimensionPixelSize(R.dimen.app_banner_title_height)) / 2;
        cpk cpk = new cpk(this);
        if (!dcy.d(this.y)) {
            dcw dcw = new dcw(cpo.e);
            this.B = dcw;
            dcw.a(view);
            dcw dcw2 = this.B;
            dcw2.d = cpk;
            dcw2.f = this.p;
            return;
        }
        view.setOnFocusChangeListener(cpk);
    }

    public void a(chn chn) {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r0 != 7) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void y() {
        /*
            r4 = this;
            android.view.View r0 = r4.a
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            cpo r1 = r4.C
            int r2 = r1.c
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
            int r2 = r1.f
            int r1 = r1.g
            r0.setMargins(r3, r2, r3, r1)
            cpo r1 = r4.C
            int r1 = r1.i
            r0.setMarginEnd(r1)
            goto L_0x004e
        L_0x001f:
            int r2 = r1.l
            int r1 = r1.m
            r0.setMargins(r3, r2, r3, r1)
            cpo r1 = r4.C
            int r1 = r1.k
            r0.setMarginEnd(r1)
            goto L_0x004e
        L_0x002f:
            int r2 = r1.f
            int r1 = r1.h
            r0.setMargins(r3, r2, r3, r1)
            cpo r1 = r4.C
            int r1 = r1.i
            r0.setMarginEnd(r1)
            goto L_0x004e
        L_0x003f:
            int r2 = r1.f
            int r1 = r1.j
            r0.setMargins(r3, r2, r3, r1)
            cpo r1 = r4.C
            int r1 = r1.i
            r0.setMarginEnd(r1)
        L_0x004e:
            android.view.View r1 = r4.a
            r1.setLayoutParams(r0)
            cpo r0 = r4.C
            int r0 = r0.c
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
            android.view.View r0 = r4.a
            cus r0 = (defpackage.cus) r0
            r0.a(r3)
            android.view.View r0 = r4.a
            cpo r1 = r4.C
            int r1 = r1.c
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpn.y():void");
    }

    /* access modifiers changed from: protected */
    public void b(boolean z2) {
        if (dcy.d(this.y)) {
            this.C.y.removeCallbacks(this.q);
            if (!z2) {
                this.C.d = d();
                return;
            }
            RecyclerView recyclerView = this.C.x;
            if (recyclerView != null && !recyclerView.l()) {
                this.q.run();
            } else {
                this.C.y.post(this.q);
            }
        } else {
            TextView textView = this.A;
            if (textView != null) {
                textView.setSelected(this.a.hasFocus());
                this.a.postDelayed(new cpl(this, z2), 60);
            }
        }
    }

    public void u() {
        float f;
        boolean isFocused = this.a.isFocused();
        float f2 = isFocused ? this.C.q : 1.0f;
        if (isFocused) {
            f = this.C.r;
        } else {
            f = 0.0f;
        }
        this.a.setScaleX(f2);
        this.a.setScaleY(f2);
        this.a.setElevation(f);
        this.A.setSelected(isFocused);
        int i = this.a.getLayoutParams().width;
        int i2 = this.a.getLayoutParams().height;
        if (i <= 0 || i2 <= 0) {
            i = this.a.getWidth();
            i2 = this.a.getHeight();
        }
        if (i > 0 && i2 > 0) {
            if (d() != 0) {
                i >>= 1;
            } else if (this.a.getLayoutDirection() != 1) {
                i = 0;
            }
            this.a.setPivotX((float) i);
            this.a.setPivotY((float) ((i2 >> 1) + this.p));
        }
    }
}
