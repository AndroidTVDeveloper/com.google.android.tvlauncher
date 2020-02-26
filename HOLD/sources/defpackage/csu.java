package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.leanback.widget.HorizontalGridView;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.home.view.ChannelView;

/* renamed from: csu  reason: default package */
/* compiled from: PG */
final class csu implements cqz, cuq, cex, cez, cey, csf, csd {
    public final ChannelView a;
    public final HorizontalGridView b;
    public final cfp c;
    public csl d;
    public cst e;
    public cse f;
    public boolean g;
    public crk h;
    public cew i;
    public cey j;
    public csf k;
    private crj l;
    private cri m;

    public csu(ChannelView channelView, cfp cfp) {
        this.a = channelView;
        this.c = cfp;
        channelView.O = this;
        channelView.B = false;
        channelView.C = false;
        channelView.F = dcy.e(channelView.getContext());
        String string = this.a.getContext().getString(R.string.play_next_channel_title);
        this.a.a(string);
        this.a.b(string);
        this.a.c(string);
        ImageView imageView = this.a.h;
        Context context = imageView.getContext();
        imageView.setContentDescription(context.getString(R.string.play_next_channel_title));
        imageView.setImageDrawable(context.getDrawable(R.drawable.watch_next_logo));
        HorizontalGridView horizontalGridView = this.a.b;
        this.b = horizontalGridView;
        dcy.a(horizontalGridView);
    }

    public final View a() {
        return this.a;
    }

    public final void a(crh crh) {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r17 = this;
            r0 = r17
            androidx.leanback.widget.HorizontalGridView r1 = r0.b
            int r1 = r1.r()
            androidx.leanback.widget.HorizontalGridView r2 = r0.b
            android.content.Context r2 = r2.getContext()
            cla r2 = defpackage.cla.a(r2)
            r3 = -1
            if (r1 == r3) goto L_0x015c
            cst r3 = r0.e
            int r3 = r3.a()
            if (r3 != 0) goto L_0x001f
            goto L_0x015c
        L_0x001f:
            cst r3 = r0.e
            int r3 = r3.a()
            r4 = 1
            if (r3 <= 0) goto L_0x0037
            cst r3 = r0.e
            int r3 = r3.a(r1)
            if (r3 == r4) goto L_0x0031
            goto L_0x0037
        L_0x0031:
            csl r1 = r0.d
            r1.a()
            return
        L_0x0037:
            cst r3 = r0.e
            int r1 = r3.f(r1)
            if (r1 < 0) goto L_0x015b
            int r3 = r2.j()
            if (r1 >= r3) goto L_0x015b
            csl r3 = r0.d
            cxu r1 = r2.c(r1)
            java.lang.String r2 = r1.d()
            java.lang.String r5 = r1.z()
            java.lang.String r6 = r1.B()
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            int r9 = r1.A()
            if (r9 == r4) goto L_0x006e
            java.lang.String r9 = r3.k
            java.lang.String r10 = r3.n
            java.lang.String r11 = r3.q
            java.lang.String r12 = r3.t
            goto L_0x0076
        L_0x006e:
            java.lang.String r9 = r3.l
            java.lang.String r10 = r3.o
            java.lang.String r11 = r3.r
            java.lang.String r12 = r3.u
        L_0x0076:
            int r13 = r1.N()
            r14 = 0
            if (r13 == 0) goto L_0x00fd
            r15 = 2
            r16 = 0
            if (r13 == r4) goto L_0x00c6
            if (r13 == r15) goto L_0x008e
            r4 = 3
            if (r13 == r4) goto L_0x008a
        L_0x0087:
            r4 = r14
            goto L_0x010d
        L_0x008a:
            java.lang.String r4 = r3.v
            goto L_0x010d
        L_0x008e:
            if (r7 != 0) goto L_0x00a3
            if (r8 == 0) goto L_0x0093
            goto L_0x00a3
        L_0x0093:
            java.util.Locale r7 = java.util.Locale.getDefault()
            java.lang.Object[] r8 = new java.lang.Object[r15]
            r8[r16] = r5
            r8[r4] = r6
            java.lang.String r4 = java.lang.String.format(r7, r11, r8)
            goto L_0x010d
        L_0x00a3:
            if (r7 != 0) goto L_0x00b4
            java.util.Locale r6 = java.util.Locale.getDefault()
            java.lang.String r7 = r3.s
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r16] = r5
            java.lang.String r4 = java.lang.String.format(r6, r7, r4)
            goto L_0x010d
        L_0x00b4:
            if (r8 != 0) goto L_0x00c3
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r16] = r6
            java.lang.String r4 = java.lang.String.format(r5, r12, r4)
            goto L_0x010d
        L_0x00c3:
            java.lang.String r4 = r3.p
            goto L_0x010d
        L_0x00c6:
            if (r7 != 0) goto L_0x00da
            if (r8 == 0) goto L_0x00cb
            goto L_0x00da
        L_0x00cb:
            java.util.Locale r7 = java.util.Locale.getDefault()
            java.lang.Object[] r8 = new java.lang.Object[r15]
            r8[r16] = r5
            r8[r4] = r6
            java.lang.String r4 = java.lang.String.format(r7, r9, r8)
            goto L_0x010d
        L_0x00da:
            if (r7 != 0) goto L_0x00eb
            java.util.Locale r6 = java.util.Locale.getDefault()
            java.lang.String r7 = r3.m
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r16] = r5
            java.lang.String r4 = java.lang.String.format(r6, r7, r4)
            goto L_0x010d
        L_0x00eb:
            if (r8 != 0) goto L_0x00fa
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r16] = r6
            java.lang.String r4 = java.lang.String.format(r5, r10, r4)
            goto L_0x010d
        L_0x00fa:
            java.lang.String r4 = r3.j
            goto L_0x010d
        L_0x00fd:
            int r4 = r1.c()
            switch(r4) {
                case 0: goto L_0x010b;
                case 1: goto L_0x010b;
                case 2: goto L_0x010b;
                case 3: goto L_0x010b;
                case 4: goto L_0x010b;
                case 5: goto L_0x010b;
                case 6: goto L_0x010b;
                case 7: goto L_0x0108;
                case 8: goto L_0x0108;
                case 9: goto L_0x0108;
                case 10: goto L_0x0108;
                case 11: goto L_0x0108;
                case 12: goto L_0x0105;
                default: goto L_0x0104;
            }
        L_0x0104:
            goto L_0x0087
        L_0x0105:
            java.lang.String r4 = r3.i
            goto L_0x010d
        L_0x0108:
            java.lang.String r4 = r3.h
            goto L_0x010d
        L_0x010b:
            java.lang.String r4 = r3.g
        L_0x010d:
            cja r5 = r3.a
            java.lang.String r1 = r1.O()
            chn r1 = r5.h(r1)
            if (r1 == 0) goto L_0x013b
            chp r5 = new chp
            android.content.Context r6 = r3.b
            r5.<init>(r6)
            cir r6 = new cir
            cjd r7 = defpackage.cjd.BANNER
            cja r8 = r3.a
            java.util.Locale r8 = r8.h()
            r6.<init>(r1, r7, r8)
            r5.a = r6
            android.widget.ImageView r1 = r3.f
            r5.b = r1
            android.graphics.drawable.Drawable r1 = r3.w
            r5.c = r1
            r5.a()
            goto L_0x0140
        L_0x013b:
            android.widget.ImageView r1 = r3.f
            r1.setImageDrawable(r14)
        L_0x0140:
            android.widget.TextView r1 = r3.c
            java.lang.CharSequence r2 = defpackage.dcy.a(r2)
            r1.setText(r2)
            android.widget.TextView r1 = r3.d
            java.lang.CharSequence r2 = defpackage.dcy.a(r4)
            r1.setText(r2)
            android.widget.TextView r1 = r3.e
            r1.setText(r14)
            r3.b()
            return
        L_0x015b:
            return
        L_0x015c:
            csl r1 = r0.d
            r1.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csu.c():void");
    }

    public static final int a(int i2) {
        if (i2 == 0) {
            return 4;
        }
        switch (i2) {
            case 4:
                return 1;
            case 5:
                return 2;
            case 6:
            case 8:
            case 9:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                String valueOf = String.valueOf(ChannelView.a(i2));
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Unsupported Watch Next row state ") : "Unsupported Watch Next row state ".concat(valueOf));
            case 7:
                return 3;
            case 10:
                return 7;
            case 11:
                return 6;
            case 12:
                return 8;
            case 14:
                return 9;
            case 16:
                return 11;
            case 17:
                return 13;
            default:
                return 0;
        }
    }

    public final boolean g() {
        ju juVar = this.b.x;
        return juVar != null && juVar.b();
    }

    public final void b(Context context) {
        HorizontalGridView horizontalGridView = this.b;
        if (horizontalGridView.g == null) {
            return;
        }
        if (this.a.A != 0 || horizontalGridView.r() == 0 || this.b.g.a() <= 0) {
            cew cew = this.i;
            if (cew != null) {
                cew.a(context);
            }
        } else if (dcy.d(this.a.getContext())) {
            this.b.i(0);
        } else {
            this.b.j(0);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cst.a(int, boolean):void
     arg types: [int, int]
     candidates:
      cst.a(android.view.ViewGroup, int):km
      cst.a(km, int):void
      jp.a(android.view.ViewGroup, int):km
      jp.a(int, int):void
      jp.a(int, java.lang.Object):void
      jp.a(km, int):void
      cst.a(int, boolean):void */
    public final void b(boolean z) {
        if (!z) {
            this.e.a(a(this.a.A), true);
        } else {
            this.e.a(5, false);
        }
        ChannelView channelView = this.a;
        channelView.I = z;
        if (!z) {
            channelView.c();
        }
    }

    public final void c(Context context) {
        cey cey = this.j;
        if (cey != null) {
            cey.c(context);
        }
    }

    public final void d(Context context) {
        if (this.a.A == 0) {
            HorizontalGridView horizontalGridView = this.b;
            km e2 = horizontalGridView.e(horizontalGridView.r());
            if (e2 instanceof cez) {
                ((cez) e2).d(context);
                return;
            }
        }
        c(context);
    }

    public final void c(int i2) {
        switch (i2) {
            case 0:
                cri cri = this.m;
                if (cri != null) {
                    cri.u();
                }
                crj crj = this.l;
                if (crj != null) {
                    crj.c(0);
                    return;
                }
                return;
            case 1:
                crj crj2 = this.l;
                if (crj2 != null) {
                    crj2.c(0);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                String valueOf = String.valueOf(ChannelView.a(i2));
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Unsupported ChannelView state change gesture: ") : "Unsupported ChannelView state change gesture: ".concat(valueOf));
            case 10:
                cri cri2 = this.m;
                if (cri2 != null) {
                    cri2.u();
                }
                crj crj3 = this.l;
                if (crj3 != null) {
                    crj3.c(1);
                    return;
                }
                return;
            case 11:
                crj crj4 = this.l;
                if (crj4 != null) {
                    crj4.c(1);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void a(boolean z) {
        if (this.g != z) {
            this.g = z;
            b();
        }
    }

    public final void a(cri cri) {
        this.m = cri;
    }

    public final void a(crj crj) {
        this.l = crj;
    }

    public final void a(int i2, int i3) {
        if (i2 != i3 && dej.a(i2) && this.e.a() > 1 && this.b.r() != 0) {
            this.b.k(0);
        }
    }

    public final void b() {
        this.f.b(!this.g);
        this.f.c(false);
    }
}
