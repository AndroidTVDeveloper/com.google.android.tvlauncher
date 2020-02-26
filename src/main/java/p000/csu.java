package p000;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.leanback.widget.HorizontalGridView;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.home.view.ChannelView;

/* renamed from: csu */
/* compiled from: PG */
final class csu implements cqz, cuq, cex, cez, cey, csf, csd {

    /* renamed from: a */
    public final ChannelView f7293a;

    /* renamed from: b */
    public final HorizontalGridView f7294b;

    /* renamed from: c */
    public final cfp f7295c;

    /* renamed from: d */
    public csl f7296d;

    /* renamed from: e */
    public cst f7297e;

    /* renamed from: f */
    public cse f7298f;

    /* renamed from: g */
    public boolean f7299g;

    /* renamed from: h */
    public crk f7300h;

    /* renamed from: i */
    public cew f7301i;

    /* renamed from: j */
    public cey f7302j;

    /* renamed from: k */
    public csf f7303k;

    /* renamed from: l */
    private crj f7304l;

    /* renamed from: m */
    private cri f7305m;

    public csu(ChannelView channelView, cfp cfp) {
        this.f7293a = channelView;
        this.f7295c = cfp;
        channelView.f6464O = this;
        channelView.f6451B = false;
        channelView.f6452C = false;
        channelView.f6455F = dcy.m6196e(channelView.getContext());
        String string = this.f7293a.getContext().getString(R.string.play_next_channel_title);
        this.f7293a.mo3377a(string);
        this.f7293a.mo3384b(string);
        this.f7293a.mo3386c(string);
        ImageView imageView = this.f7293a.f6523h;
        Context context = imageView.getContext();
        imageView.setContentDescription(context.getString(R.string.play_next_channel_title));
        imageView.setImageDrawable(context.getDrawable(R.drawable.watch_next_logo));
        HorizontalGridView horizontalGridView = this.f7293a.f6517b;
        this.f7294b = horizontalGridView;
        dcy.m6188a(horizontalGridView);
    }

    /* renamed from: a */
    public final View mo3472a() {
        return this.f7293a;
    }

    /* renamed from: a */
    public final void mo3473a(crh crh) {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3723c() {
        /*
            r17 = this;
            r0 = r17
            androidx.leanback.widget.HorizontalGridView r1 = r0.f7294b
            int r1 = r1.mo5622r()
            androidx.leanback.widget.HorizontalGridView r2 = r0.f7294b
            android.content.Context r2 = r2.getContext()
            cla r2 = p000.cla.m5025a(r2)
            r3 = -1
            if (r1 == r3) goto L_0x015c
            cst r3 = r0.f7297e
            int r3 = r3.mo2794a()
            if (r3 != 0) goto L_0x001f
            goto L_0x015c
        L_0x001f:
            cst r3 = r0.f7297e
            int r3 = r3.mo2794a()
            r4 = 1
            if (r3 <= 0) goto L_0x0037
            cst r3 = r0.f7297e
            int r3 = r3.mo2850a(r1)
            if (r3 == r4) goto L_0x0031
            goto L_0x0037
        L_0x0031:
            csl r1 = r0.f7296d
            r1.mo3707a()
            return
        L_0x0037:
            cst r3 = r0.f7297e
            int r1 = r3.mo3720f(r1)
            if (r1 < 0) goto L_0x015b
            int r3 = r2.mo3076j()
            if (r1 >= r3) goto L_0x015b
            csl r3 = r0.f7296d
            cxu r1 = r2.mo3065c(r1)
            java.lang.String r2 = r1.mo3004d()
            java.lang.String r5 = r1.mo3027z()
            java.lang.String r6 = r1.mo2985B()
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            int r9 = r1.mo2984A()
            if (r9 == r4) goto L_0x006e
            java.lang.String r9 = r3.f7249k
            java.lang.String r10 = r3.f7252n
            java.lang.String r11 = r3.f7255q
            java.lang.String r12 = r3.f7258t
            goto L_0x0076
        L_0x006e:
            java.lang.String r9 = r3.f7250l
            java.lang.String r10 = r3.f7253o
            java.lang.String r11 = r3.f7256r
            java.lang.String r12 = r3.f7259u
        L_0x0076:
            int r13 = r1.mo2997N()
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
            java.lang.String r4 = r3.f7260v
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
            java.lang.String r7 = r3.f7257s
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
            java.lang.String r4 = r3.f7254p
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
            java.lang.String r7 = r3.f7251m
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
            java.lang.String r4 = r3.f7248j
            goto L_0x010d
        L_0x00fd:
            int r4 = r1.mo3003c()
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
            java.lang.String r4 = r3.f7247i
            goto L_0x010d
        L_0x0108:
            java.lang.String r4 = r3.f7246h
            goto L_0x010d
        L_0x010b:
            java.lang.String r4 = r3.f7245g
        L_0x010d:
            cja r5 = r3.f7239a
            java.lang.String r1 = r1.mo2998O()
            chn r1 = r5.mo2901h(r1)
            if (r1 == 0) goto L_0x013b
            chp r5 = new chp
            android.content.Context r6 = r3.f7240b
            r5.<init>(r6)
            cir r6 = new cir
            cjd r7 = p000.cjd.BANNER
            cja r8 = r3.f7239a
            java.util.Locale r8 = r8.mo2902h()
            r6.<init>(r1, r7, r8)
            r5.f5574a = r6
            android.widget.ImageView r1 = r3.f7244f
            r5.f5575b = r1
            android.graphics.drawable.Drawable r1 = r3.f7261w
            r5.f5576c = r1
            r5.mo2819a()
            goto L_0x0140
        L_0x013b:
            android.widget.ImageView r1 = r3.f7244f
            r1.setImageDrawable(r14)
        L_0x0140:
            android.widget.TextView r1 = r3.f7241c
            java.lang.CharSequence r2 = p000.dcy.m6186a(r2)
            r1.setText(r2)
            android.widget.TextView r1 = r3.f7242d
            java.lang.CharSequence r2 = p000.dcy.m6186a(r4)
            r1.setText(r2)
            android.widget.TextView r1 = r3.f7243e
            r1.setText(r14)
            r3.mo3708b()
            return
        L_0x015b:
            return
        L_0x015c:
            csl r1 = r0.f7296d
            r1.mo3707a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.csu.mo3723c():void");
    }

    /* renamed from: a */
    public static final int m5653a(int i) {
        if (i == 0) {
            return 4;
        }
        switch (i) {
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
                String valueOf = String.valueOf(ChannelView.m5291a(i));
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

    /* renamed from: g */
    public final boolean mo3527g() {
        C0266ju juVar = this.f7294b.f1084x;
        return juVar != null && juVar.mo4191b();
    }

    /* renamed from: b */
    public final void mo2703b(Context context) {
        HorizontalGridView horizontalGridView = this.f7294b;
        if (horizontalGridView.f1067g == null) {
            return;
        }
        if (this.f7293a.f6450A != 0 || horizontalGridView.mo5622r() == 0 || this.f7294b.f1067g.mo2794a() <= 0) {
            cew cew = this.f7301i;
            if (cew != null) {
                cew.mo2702a(context);
            }
        } else if (dcy.m6195d(this.f7293a.getContext())) {
            this.f7294b.mo5617i(0);
        } else {
            this.f7294b.mo5618j(0);
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
    /* renamed from: b */
    public final void mo3519b(boolean z) {
        if (!z) {
            this.f7297e.mo3716a(m5653a(this.f7293a.f6450A), true);
        } else {
            this.f7297e.mo3716a(5, false);
        }
        ChannelView channelView = this.f7293a;
        channelView.f6458I = z;
        if (!z) {
            channelView.mo3385c();
        }
    }

    /* renamed from: c */
    public final void mo2704c(Context context) {
        cey cey = this.f7302j;
        if (cey != null) {
            cey.mo2704c(context);
        }
    }

    /* renamed from: d */
    public final void mo2705d(Context context) {
        if (this.f7293a.f6450A == 0) {
            HorizontalGridView horizontalGridView = this.f7294b;
            C0285km e = horizontalGridView.mo871e(horizontalGridView.mo5622r());
            if (e instanceof cez) {
                ((cez) e).mo2705d(context);
                return;
            }
        }
        mo2704c(context);
    }

    /* renamed from: c */
    public final void mo3521c(int i) {
        switch (i) {
            case 0:
                cri cri = this.f7305m;
                if (cri != null) {
                    cri.mo3585u();
                }
                crj crj = this.f7304l;
                if (crj != null) {
                    crj.mo3584c(0);
                    return;
                }
                return;
            case 1:
                crj crj2 = this.f7304l;
                if (crj2 != null) {
                    crj2.mo3584c(0);
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
                String valueOf = String.valueOf(ChannelView.m5291a(i));
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Unsupported ChannelView state change gesture: ") : "Unsupported ChannelView state change gesture: ".concat(valueOf));
            case 10:
                cri cri2 = this.f7305m;
                if (cri2 != null) {
                    cri2.mo3585u();
                }
                crj crj3 = this.f7304l;
                if (crj3 != null) {
                    crj3.mo3584c(1);
                    return;
                }
                return;
            case 11:
                crj crj4 = this.f7304l;
                if (crj4 != null) {
                    crj4.mo3584c(1);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo3477a(boolean z) {
        if (this.f7299g != z) {
            this.f7299g = z;
            mo3722b();
        }
    }

    /* renamed from: a */
    public final void mo3474a(cri cri) {
        this.f7305m = cri;
    }

    /* renamed from: a */
    public final void mo3475a(crj crj) {
        this.f7304l = crj;
    }

    /* renamed from: a */
    public final void mo3721a(int i, int i2) {
        if (i != i2 && dej.m6248a(i) && this.f7297e.mo2794a() > 1 && this.f7294b.mo5622r() != 0) {
            this.f7294b.mo5619k(0);
        }
    }

    /* renamed from: b */
    public final void mo3722b() {
        this.f7298f.mo3697b(!this.f7299g);
        this.f7298f.mo3698c(false);
    }
}
