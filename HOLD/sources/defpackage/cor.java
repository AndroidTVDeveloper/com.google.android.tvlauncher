package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.leanback.widget.HorizontalGridView;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.home.view.ChannelView;
import com.google.android.tvlauncher.home.view.ChannelViewMainContent;
import java.util.HashSet;

/* renamed from: cor  reason: default package */
/* compiled from: PG */
final class cor implements cqz, cuo, cun, cum, cup, cuq, cul, cfp, cex, cez, cey, csf, csd {
    private crj A;
    private cri B;
    private crh C;
    private final ctr D;
    private final dbj E;
    public final ChannelView a;
    public final HorizontalGridView b;
    public final sx c;
    public final cok d;
    public final ahb e;
    public long f;
    public String g;
    public String h;
    public String i;
    public final String j;
    public Uri k;
    public boolean l;
    public coo m = null;
    public cse n = null;
    public crk o;
    public cew p;
    public cey q;
    public csf r;
    public dad s;
    public final boolean t;
    public final boolean u;
    public boolean v;
    public boolean w;
    private final cfp x;
    private final cjs y;
    private boolean z;

    public cor(ChannelView channelView, sx sxVar, cfp cfp, cjs cjs, cok cok, dbj dbj, boolean z2, boolean z3) {
        String str;
        ctr ctr = new ctr(channelView.b);
        this.a = channelView;
        this.c = sxVar;
        this.x = cfp;
        this.y = cjs;
        this.d = cok;
        channelView.a(this);
        ChannelView channelView2 = this.a;
        channelView2.K = this;
        channelView2.L = this;
        channelView2.M = this;
        channelView2.O = this;
        channelView2.N = this;
        this.E = dbj;
        this.t = z2;
        this.u = z3;
        this.D = ctr;
        if (z2) {
            channelView2.d();
            ChannelView channelView3 = this.a;
            if (this.u) {
                str = channelView3.getContext().getString(R.string.sponsored_channel_logo_title);
            } else {
                str = channelView3.getContext().getString(R.string.sponsored_channel_unbranded_logo_title);
            }
            channelView3.a(str);
            if (!z3) {
                String string = this.a.getContext().getString(R.string.sponsored_channel_unbranded_logo_title);
                this.a.c(string);
                this.a.b(string);
            }
        }
        ChannelView channelView4 = this.a;
        boolean z4 = this.t;
        boolean z5 = this.u;
        channelView4.G = z4;
        channelView4.H = z5;
        ChannelViewMainContent channelViewMainContent = channelView4.a;
        channelViewMainContent.a = z4;
        channelViewMainContent.b = z5;
        if (z4) {
            channelView4.a();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) channelView4.p.getLayoutParams();
            layoutParams.setMarginStart(0);
            channelView4.p.setLayoutParams(layoutParams);
            channelView4.h.setOutlineProvider(null);
            if (channelView4.H) {
                channelView4.c.setVisibility(0);
                channelView4.c.setTextAppearance(2131951784);
            } else {
                channelView4.u = 0.0f;
            }
        }
        if (this.t) {
            ChannelView channelView5 = this.a;
            Context context = channelView.getContext();
            SparseArray sparseArray = new SparseArray();
            Resources resources = context.getResources();
            ctk ctk = new ctk();
            ctk.a = resources.getDimensionPixelSize(R.dimen.sponsored_program_selected_height);
            ctk.b = resources.getDimensionPixelSize(R.dimen.sponsored_program_selected_margin_vertical);
            ctk.c = resources.getDimensionPixelSize(R.dimen.sponsored_program_selected_margin_vertical);
            ctk.d = resources.getDimensionPixelSize(R.dimen.channel_selected_margin_top);
            ctk.e = resources.getDimensionPixelSize(R.dimen.sponsored_channel_margin_bottom);
            ctk.k = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_selected_keyline_offset);
            ctk.g = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_default_selected_width);
            ctk.h = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_default_selected_height);
            ctk.i = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_selected_margin_start);
            ctk.f = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_selected_margin_top);
            ctk.j = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_selected_margin_end);
            ctk.l = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_title_default_selected_margin_bottom);
            ctk.m = resources.getDimensionPixelSize(R.dimen.channel_items_title_selected_margin_bottom);
            ctk.n = resources.getDimensionPixelSize(R.dimen.sponsored_channel_empty_message_margin_top);
            ctl a2 = ctk.a();
            sparseArray.put(0, a2);
            sparseArray.put(18, a2);
            sparseArray.put(8, a2);
            sparseArray.put(9, a2);
            sparseArray.put(25, a2);
            ctl ctl = new ctl(a2);
            ctl.m = resources.getDimensionPixelSize(R.dimen.sponsored_channel_items_title_default_above_selected_last_row_margin_top);
            ctl.n = resources.getDimensionPixelSize(R.dimen.sponsored_channel_items_title_default_above_selected_last_row_margin_bottom);
            sparseArray.put(17, ctl);
            sparseArray.put(32, ctl);
            ctk ctk2 = new ctk();
            ctk2.a = resources.getDimensionPixelSize(R.dimen.program_default_height);
            ctk2.b = resources.getDimensionPixelSize(R.dimen.program_default_margin_top);
            ctk2.c = resources.getDimensionPixelSize(R.dimen.program_default_margin_bottom);
            ctk2.k = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_keyline_offset);
            ctk2.g = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_default_width);
            ctk2.h = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_default_height);
            ctk2.i = resources.getDimensionPixelSize(R.dimen.channel_logo_margin_start);
            ctk2.f = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_default_margin_top);
            ctk2.j = resources.getDimensionPixelSize(R.dimen.channel_logo_margin_end);
            ctk2.l = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_title_default_margin_bottom);
            ctk2.m = resources.getDimensionPixelSize(R.dimen.channel_items_title_default_margin_bottom);
            ctk2.n = resources.getDimensionPixelSize(R.dimen.empty_channel_message_default_margin_top);
            ctl a3 = ctk2.a();
            sparseArray.put(1, a3);
            sparseArray.put(19, a3);
            sparseArray.put(26, a3);
            ctl ctl2 = new ctl(a3);
            ctl2.a = resources.getDimensionPixelSize(R.dimen.program_default_top_height);
            ctl2.b = resources.getDimensionPixelSize(R.dimen.program_default_top_margin_top);
            ctl2.c = resources.getDimensionPixelSize(R.dimen.program_default_top_margin_bottom);
            sparseArray.put(7, ctl2);
            sparseArray.put(24, ctl2);
            ctl ctl3 = new ctl(ctl2);
            ctl3.c = resources.getDimensionPixelSize(R.dimen.program_default_top_margin_bottom);
            sparseArray.put(4, ctl3);
            sparseArray.put(5, ctl3);
            sparseArray.put(22, ctl3);
            sparseArray.put(23, ctl3);
            ctl ctl4 = new ctl(a3);
            ctl4.a = resources.getDimensionPixelSize(R.dimen.program_default_height);
            ctl4.o = resources.getDimensionPixelSize(R.dimen.empty_channel_message_above_selected_margin_top);
            sparseArray.put(2, ctl4);
            sparseArray.put(20, ctl4);
            ctl ctl5 = new ctl(ctl4);
            ctl5.n = resources.getDimensionPixelSize(R.dimen.channel_items_title_below_selected_margin_bottom);
            ctl5.o = resources.getDimensionPixelSize(R.dimen.sponsored_channel_empty_message_below_selected_margin_top);
            sparseArray.put(3, ctl5);
            sparseArray.put(21, ctl5);
            ctk ctk3 = new ctk();
            ctk3.a = resources.getDimensionPixelSize(R.dimen.program_zoomed_out_height);
            ctk3.b = resources.getDimensionPixelSize(R.dimen.program_zoomed_out_margin_vertical);
            ctk3.c = resources.getDimensionPixelSize(R.dimen.program_zoomed_out_margin_vertical);
            ctk3.e = resources.getDimensionPixelSize(R.dimen.channel_zoomed_out_margin_bottom);
            ctk3.g = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_zoomed_out_selected_width);
            ctk3.h = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_zoomed_out_selected_height);
            ctk3.k = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_zoomed_out_keyline_offset);
            ctk3.i = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_zoomed_out_selected_margin_start);
            ctk3.f = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_zoomed_out_selected_margin_top);
            ctk3.j = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_zoomed_out_selected_margin_end);
            ctk3.l = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_title_zoomed_out_margin_bottom);
            ctk3.m = resources.getDimensionPixelSize(R.dimen.channel_items_title_default_margin_bottom);
            ctk3.n = resources.getDimensionPixelSize(R.dimen.empty_channel_message_zoomed_out_margin_top);
            ctl a4 = ctk3.a();
            sparseArray.put(10, a4);
            sparseArray.put(27, a4);
            ctl ctl6 = new ctl(a4);
            ctl6.i = resources.getDimensionPixelSize(R.dimen.channel_logo_zoomed_out_margin);
            ctl6.f = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_zoomed_out_margin_top);
            ctl6.g = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_zoomed_out_width);
            ctl6.h = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_zoomed_out_height);
            ctl6.i = resources.getDimensionPixelSize(R.dimen.channel_logo_zoomed_out_margin);
            ctl6.j = resources.getDimensionPixelSize(R.dimen.channel_logo_zoomed_out_margin);
            sparseArray.put(11, ctl6);
            sparseArray.put(12, ctl6);
            sparseArray.put(13, ctl6);
            sparseArray.put(14, ctl6);
            sparseArray.put(15, ctl6);
            sparseArray.put(16, ctl6);
            sparseArray.put(28, ctl6);
            sparseArray.put(29, ctl6);
            sparseArray.put(30, ctl6);
            sparseArray.put(31, ctl6);
            channelView5.F = sparseArray;
        } else {
            this.a.F = dcy.e(channelView.getContext());
        }
        HorizontalGridView horizontalGridView = this.a.b;
        this.b = horizontalGridView;
        dcy.a(horizontalGridView);
        int color = channelView.getContext().getColor(R.color.channel_logo_default_background);
        if (this.t && !this.u) {
            this.a.h.setBackground(null);
            this.a.h.setImageDrawable(null);
        } else {
            this.a.h.setBackgroundColor(color);
        }
        this.e = new coq(this.a.h, z2, color);
        this.j = channelView.getContext().getString(R.string.sponsored_channel_branding);
    }

    public final View a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        String str;
        chn h2 = dbq.a(this.a.getContext()).h(this.i);
        if (h2 != null) {
            str = h2.b.toString();
        } else {
            str = "";
        }
        this.a.a(str);
        this.a.b(str);
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.a.a(this.y.b(this.f), this.y.c(this.f));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0632, code lost:
        if (r19 == false) goto L_0x0656;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0654, code lost:
        if (r19 == false) goto L_0x0656;
     */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x05a8  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x05f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r25 = this;
            r1 = r25
            boolean r0 = r1.t
            if (r0 != 0) goto L_0x08bc
            androidx.leanback.widget.HorizontalGridView r0 = r1.b
            int r0 = r0.r()
            androidx.leanback.widget.HorizontalGridView r2 = r1.b
            android.content.Context r2 = r2.getContext()
            cla r2 = defpackage.cla.a(r2)
            r3 = -1
            if (r0 == r3) goto L_0x08b4
            coo r4 = r1.m
            int r4 = r4.a()
            if (r4 != 0) goto L_0x0023
            goto L_0x08b4
        L_0x0023:
            if (r0 < 0) goto L_0x08b3
            long r4 = r1.f
            int r4 = r2.d(r4)
            if (r0 >= r4) goto L_0x08b3
            cok r4 = r1.d
            long r5 = r1.f
            cxu r2 = r2.a(r5, r0)
            coj r0 = new coj
            r5 = 0
            r0.<init>(r5)
            r4.H = r0
            java.lang.String r6 = r2.d()
            int r7 = r4.w
            r8 = 0
            r4.G = r8
            boolean r0 = r4.F
            r9 = 2
            r10 = 1
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = r2.e()
            java.lang.String r11 = r2.u()
            r4.G = r11
            r11 = r7
            r3 = r8
            r7 = r3
            r12 = r7
            r21 = r12
            goto L_0x0658
        L_0x005e:
            int r0 = r2.c()
            r11 = 10
            r12 = 4
            if (r0 != r12) goto L_0x0068
            goto L_0x006b
        L_0x0068:
            if (r0 != r11) goto L_0x0071
        L_0x006b:
            java.lang.String r13 = r2.u()
            r4.G = r13
        L_0x0071:
            r13 = 6
            r14 = 5
            r15 = 3
            if (r0 != r12) goto L_0x0077
            goto L_0x0085
        L_0x0077:
            if (r0 == 0) goto L_0x0085
            if (r0 == r10) goto L_0x0085
            if (r0 == r9) goto L_0x0085
            if (r0 == r15) goto L_0x0085
            if (r0 == r13) goto L_0x0085
            if (r0 == r14) goto L_0x0085
        L_0x0083:
            goto L_0x02d4
        L_0x0085:
            java.lang.String r0 = r2.t()
            boolean r16 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            if (r16 != 0) goto L_0x00a7
            java.lang.String r3 = "\\s*,\\s*"
            java.lang.String[] r0 = r0.split(r3)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            int r3 = r0.length     // Catch:{ IllegalArgumentException -> 0x02d2 }
            android.media.tv.TvContentRating[] r8 = new android.media.tv.TvContentRating[r3]     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r11 = 0
        L_0x0099:
            if (r11 >= r3) goto L_0x00a6
            r17 = r0[r11]     // Catch:{ IllegalArgumentException -> 0x02d2 }
            android.media.tv.TvContentRating r17 = android.media.tv.TvContentRating.unflattenFromString(r17)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r8[r11] = r17     // Catch:{ IllegalArgumentException -> 0x02d2 }
            int r11 = r11 + 1
            goto L_0x0099
        L_0x00a6:
            goto L_0x00a9
        L_0x00a7:
            r8 = 0
        L_0x00a9:
            if (r8 == 0) goto L_0x02d0
            int r0 = r8.length     // Catch:{ IllegalArgumentException -> 0x02d2 }
            if (r0 <= 0) goto L_0x02cf
            android.content.Context r0 = r4.a     // Catch:{ IllegalArgumentException -> 0x02d2 }
            ctd r0 = defpackage.ctd.a(r0)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3 = r8[r5]     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r0.a()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            if (r3 == 0) goto L_0x0113
            java.util.List r8 = r0.b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ IllegalArgumentException -> 0x02d2 }
        L_0x00c1:
            boolean r11 = r8.hasNext()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            if (r11 == 0) goto L_0x0112
            java.lang.Object r11 = r8.next()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            ctb r11 = (defpackage.ctb) r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r13 = r11.b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r14 = r3.getDomain()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            boolean r13 = r13.equals(r14)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            if (r13 == 0) goto L_0x010e
            java.lang.String r13 = r11.a     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r14 = r3.getRatingSystem()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            boolean r13 = r13.equals(r14)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            if (r13 == 0) goto L_0x010a
            java.util.List r11 = r11.c     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ IllegalArgumentException -> 0x02d2 }
        L_0x00eb:
            boolean r13 = r11.hasNext()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            if (r13 == 0) goto L_0x0106
            java.lang.Object r13 = r11.next()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            csy r13 = (defpackage.csy) r13     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r14 = r13.a     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r12 = r3.getMainRating()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            boolean r12 = r14.equals(r12)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            if (r12 == 0) goto L_0x0104
            goto L_0x0114
        L_0x0104:
            r12 = 4
            goto L_0x00eb
        L_0x0106:
            r12 = 4
            r13 = 6
            r14 = 5
            goto L_0x00c1
        L_0x010a:
            r12 = 4
            r13 = 6
            r14 = 5
            goto L_0x00c1
        L_0x010e:
            r12 = 4
            r13 = 6
            r14 = 5
            goto L_0x00c1
        L_0x0112:
        L_0x0113:
            r13 = 0
        L_0x0114:
            if (r13 == 0) goto L_0x02ce
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r8.<init>()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            if (r3 == 0) goto L_0x015a
            java.util.List r11 = r3.getSubRatings()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            if (r11 == 0) goto L_0x015a
            java.util.List r3 = r3.getSubRatings()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IllegalArgumentException -> 0x02d2 }
        L_0x012b:
            boolean r11 = r3.hasNext()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            if (r11 == 0) goto L_0x015a
            java.lang.Object r11 = r3.next()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.util.List r12 = r13.c     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ IllegalArgumentException -> 0x02d2 }
        L_0x013d:
            boolean r14 = r12.hasNext()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            if (r14 == 0) goto L_0x0158
            java.lang.Object r14 = r12.next()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r14 = (defpackage.cta) r14     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r15 = r14.a     // Catch:{ IllegalArgumentException -> 0x02d2 }
            boolean r15 = r15.equals(r11)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            if (r15 == 0) goto L_0x0156
            r8.add(r14)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r15 = 3
            goto L_0x012b
        L_0x0156:
            r15 = 3
            goto L_0x013d
        L_0x0158:
            r15 = 3
            goto L_0x012b
        L_0x015a:
            boolean r3 = r8.isEmpty()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            if (r3 == 0) goto L_0x0175
            android.content.Context r0 = r0.a     // Catch:{ IllegalArgumentException -> 0x02d2 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object[] r3 = new java.lang.Object[r10]     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r8 = r13.b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3[r5] = r8     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r8 = 2131886200(0x7f120078, float:1.9406972E38)
            java.lang.String r8 = r0.getString(r8, r3)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            goto L_0x02d4
        L_0x0175:
            int r3 = r8.size()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            if (r3 == r10) goto L_0x02af
            if (r3 == r9) goto L_0x0286
            r11 = 3
            if (r3 == r11) goto L_0x0252
            r11 = 4
            if (r3 == r11) goto L_0x0212
            r11 = 5
            if (r3 == r11) goto L_0x01c7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ IllegalArgumentException -> 0x02d2 }
        L_0x018f:
            boolean r11 = r8.hasNext()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            if (r11 != 0) goto L_0x01b6
            android.content.Context r0 = r0.a     // Catch:{ IllegalArgumentException -> 0x02d2 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object[] r8 = new java.lang.Object[r9]     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r11 = r13.b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r8[r5] = r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            int r11 = r3.length()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            int r11 = r11 + -2
            java.lang.String r3 = r3.substring(r5, r11)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r8[r10] = r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3 = 2131886199(0x7f120077, float:1.940697E38)
            java.lang.String r8 = r0.getString(r3, r8)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            goto L_0x02d4
        L_0x01b6:
            java.lang.Object r11 = r8.next()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r11 = (defpackage.cta) r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r11 = r11.b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3.append(r11)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r11 = ", "
            r3.append(r11)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            goto L_0x018f
        L_0x01c7:
            android.content.Context r0 = r0.a     // Catch:{ IllegalArgumentException -> 0x02d2 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3 = 6
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r11 = r13.b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3[r5] = r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r11 = r8.get(r5)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r11 = (defpackage.cta) r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r11 = r11.b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3[r10] = r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r11 = r8.get(r10)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r11 = (defpackage.cta) r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r11 = r11.b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3[r9] = r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r11 = r8.get(r9)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r11 = (defpackage.cta) r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r11 = r11.b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r12 = 3
            r3[r12] = r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r11 = r8.get(r12)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r11 = (defpackage.cta) r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r11 = r11.b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r12 = 4
            r3[r12] = r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r8 = r8.get(r12)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r8 = (defpackage.cta) r8     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r8 = r8.b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r11 = 5
            r3[r11] = r8     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r8 = 2131886198(0x7f120076, float:1.9406968E38)
            java.lang.String r8 = r0.getString(r8, r3)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            goto L_0x02d4
        L_0x0212:
            android.content.Context r0 = r0.a     // Catch:{ IllegalArgumentException -> 0x02d2 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3 = 5
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r3 = r13.b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r11[r5] = r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r3 = r8.get(r5)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r3 = (defpackage.cta) r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r3 = r3.b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r11[r10] = r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r3 = r8.get(r10)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r3 = (defpackage.cta) r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r3 = r3.b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r11[r9] = r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r3 = r8.get(r9)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r3 = (defpackage.cta) r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r3 = r3.b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r12 = 3
            r11[r12] = r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r3 = r8.get(r12)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r3 = (defpackage.cta) r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r3 = r3.b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r8 = 4
            r11[r8] = r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3 = 2131886197(0x7f120075, float:1.9406966E38)
            java.lang.String r8 = r0.getString(r3, r11)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            goto L_0x02d4
        L_0x0252:
            android.content.Context r0 = r0.a     // Catch:{ IllegalArgumentException -> 0x02d2 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3 = 4
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r3 = r13.b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r11[r5] = r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r3 = r8.get(r5)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r3 = (defpackage.cta) r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r3 = r3.b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r11[r10] = r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r3 = r8.get(r10)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r3 = (defpackage.cta) r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r3 = r3.b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r11[r9] = r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r3 = r8.get(r9)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r3 = (defpackage.cta) r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r3 = r3.b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r8 = 3
            r11[r8] = r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3 = 2131886196(0x7f120074, float:1.9406964E38)
            java.lang.String r8 = r0.getString(r3, r11)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            goto L_0x02d4
        L_0x0286:
            android.content.Context r0 = r0.a     // Catch:{ IllegalArgumentException -> 0x02d2 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3 = 3
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r3 = r13.b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r11[r5] = r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r3 = r8.get(r5)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r3 = (defpackage.cta) r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r3 = r3.b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r11[r10] = r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r3 = r8.get(r10)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r3 = (defpackage.cta) r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r3 = r3.b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r11[r9] = r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3 = 2131886195(0x7f120073, float:1.9406962E38)
            java.lang.String r8 = r0.getString(r3, r11)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            goto L_0x02d4
        L_0x02af:
            android.content.Context r0 = r0.a     // Catch:{ IllegalArgumentException -> 0x02d2 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r11 = r13.b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3[r5] = r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r8 = r8.get(r5)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r8 = (defpackage.cta) r8     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r8 = r8.b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3[r10] = r8     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r8 = 2131886194(0x7f120072, float:1.940696E38)
            java.lang.String r8 = r0.getString(r8, r3)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            goto L_0x0083
        L_0x02ce:
            goto L_0x02d0
        L_0x02cf:
        L_0x02d0:
            r8 = 0
            goto L_0x02d4
        L_0x02d2:
            r0 = move-exception
            r8 = 0
        L_0x02d4:
            int r0 = r2.c()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r11 = 150(0x96, float:2.1E-43)
            r3.<init>(r11)
            r13 = 8
            r14 = 7
            r19 = 0
            r15 = 4
            if (r0 != r15) goto L_0x0315
            java.lang.String r0 = r2.m()
            r4.a(r3, r0)
            java.lang.String r0 = r2.n()
            java.lang.CharSequence r0 = r4.a(r0)
            r4.a(r3, r0)
            long r11 = r2.p()
            int r0 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x0538
            int r0 = r2.o()
            java.lang.CharSequence r15 = r4.a(r0, r11)
            r4.a(r3, r15)
            coj r15 = r4.H
            r15.k = r0
            r15.l = r11
            goto L_0x0538
        L_0x0315:
            if (r0 != 0) goto L_0x0332
            java.lang.String r0 = r2.n()
            java.lang.CharSequence r0 = r4.a(r0)
            r4.a(r3, r0)
            r4.a(r3, r2)
            long r11 = r2.x()
            java.lang.CharSequence r0 = r4.a(r11)
            r4.a(r3, r0)
            goto L_0x0538
        L_0x0332:
            if (r0 != r10) goto L_0x0354
            java.lang.String r0 = r2.n()
            java.lang.CharSequence r0 = r4.a(r0)
            r4.a(r3, r0)
            r4.a(r3, r2)
            int r0 = r2.y()
            if (r0 <= 0) goto L_0x0538
            r11 = 2131755019(0x7f10000b, float:1.9140905E38)
            java.lang.CharSequence r0 = r4.a(r11, r0)
            r4.a(r3, r0)
            goto L_0x0538
        L_0x0354:
            if (r0 != r9) goto L_0x03a2
            java.lang.String r0 = r2.n()
            java.lang.CharSequence r0 = r4.a(r0)
            r4.a(r3, r0)
            java.lang.String r0 = r2.z()
            boolean r11 = android.text.TextUtils.isEmpty(r0)
            if (r11 != 0) goto L_0x037c
            java.util.Locale r11 = java.util.Locale.getDefault()
            java.lang.String r12 = r4.z
            java.lang.Object[] r15 = new java.lang.Object[r10]
            r15[r5] = r0
            java.lang.String r0 = java.lang.String.format(r11, r12, r15)
            r4.a(r3, r0)
        L_0x037c:
            int r0 = r2.y()
            if (r0 <= 0) goto L_0x039d
            int r11 = r2.A()
            if (r11 != r10) goto L_0x0393
            r11 = 2131755017(0x7f100009, float:1.9140901E38)
            java.lang.CharSequence r0 = r4.a(r11, r0)
            r4.a(r3, r0)
            goto L_0x039d
        L_0x0393:
            r11 = 2131755018(0x7f10000a, float:1.9140903E38)
            java.lang.CharSequence r0 = r4.a(r11, r0)
            r4.a(r3, r0)
        L_0x039d:
            r4.a(r3, r2)
            goto L_0x0538
        L_0x03a2:
            r11 = 3
            if (r0 != r11) goto L_0x040e
            java.lang.String r0 = r2.n()
            java.lang.CharSequence r0 = r4.a(r0)
            r4.a(r3, r0)
            java.lang.String r0 = r2.z()
            boolean r11 = android.text.TextUtils.isEmpty(r0)
            if (r11 != 0) goto L_0x03cb
            java.util.Locale r11 = java.util.Locale.getDefault()
            java.lang.String r12 = r4.z
            java.lang.Object[] r15 = new java.lang.Object[r10]
            r15[r5] = r0
            java.lang.String r0 = java.lang.String.format(r11, r12, r15)
            r4.a(r3, r0)
        L_0x03cb:
            java.lang.String r0 = r2.B()
            boolean r11 = android.text.TextUtils.isEmpty(r0)
            if (r11 != 0) goto L_0x03fe
            int r11 = r2.A()
            if (r11 != r10) goto L_0x03ed
            java.util.Locale r11 = java.util.Locale.getDefault()
            java.lang.String r12 = r4.B
            java.lang.Object[] r15 = new java.lang.Object[r10]
            r15[r5] = r0
            java.lang.String r0 = java.lang.String.format(r11, r12, r15)
            r4.a(r3, r0)
            goto L_0x03fe
        L_0x03ed:
            java.util.Locale r11 = java.util.Locale.getDefault()
            java.lang.String r12 = r4.A
            java.lang.Object[] r15 = new java.lang.Object[r10]
            r15[r5] = r0
            java.lang.String r0 = java.lang.String.format(r11, r12, r15)
            r4.a(r3, r0)
        L_0x03fe:
            long r11 = r2.x()
            java.lang.CharSequence r0 = r4.a(r11)
            r4.a(r3, r0)
            r4.a(r3, r2)
            goto L_0x0538
        L_0x040e:
            r11 = 5
            if (r0 != r11) goto L_0x043c
            java.lang.String r0 = r2.n()
            java.lang.CharSequence r0 = r4.a(r0)
            r4.a(r3, r0)
            long r11 = r2.x()
            java.lang.CharSequence r0 = r4.a(r11)
            r4.a(r3, r0)
            long r11 = r2.p()
            int r0 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x0538
            int r0 = r2.o()
            java.lang.CharSequence r0 = r4.a(r0, r11)
            r4.a(r3, r0)
            goto L_0x0538
        L_0x043c:
            if (r0 != r14) goto L_0x04d6
            java.lang.String r0 = r2.M()
            r4.a(r3, r0)
            java.lang.String r0 = r2.m()
            r4.a(r3, r0)
            long r11 = r2.x()
            r21 = 1000(0x3e8, double:4.94E-321)
            long r21 = r11 / r21
            r23 = 3600(0xe10, double:1.7786E-320)
            int r0 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r0 >= 0) goto L_0x04ce
            r23 = 60
            int r0 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r0 < 0) goto L_0x049f
            long r11 = r21 / r23
            long r23 = r23 * r11
            long r21 = r21 - r23
            int r0 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x048d
            android.icu.text.MeasureFormat r0 = r4.q
            android.icu.util.Measure[] r15 = new android.icu.util.Measure[r9]
            android.icu.util.Measure r14 = new android.icu.util.Measure
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            android.icu.util.TimeUnit r12 = android.icu.util.MeasureUnit.MINUTE
            r14.<init>(r11, r12)
            r15[r5] = r14
            android.icu.util.Measure r11 = new android.icu.util.Measure
            java.lang.Long r12 = java.lang.Long.valueOf(r21)
            android.icu.util.TimeUnit r14 = android.icu.util.MeasureUnit.SECOND
            r11.<init>(r12, r14)
            r15[r10] = r11
            java.lang.String r0 = r0.formatMeasures(r15)
            goto L_0x04d2
        L_0x048d:
            android.icu.text.MeasureFormat r0 = r4.q
            android.icu.util.Measure r14 = new android.icu.util.Measure
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            android.icu.util.TimeUnit r12 = android.icu.util.MeasureUnit.MINUTE
            r14.<init>(r11, r12)
            java.lang.String r0 = r0.format(r14)
            goto L_0x04d2
        L_0x049f:
            int r0 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x04b5
            android.icu.text.MeasureFormat r0 = r4.q
            android.icu.util.Measure r11 = new android.icu.util.Measure
            java.lang.Long r12 = java.lang.Long.valueOf(r21)
            android.icu.util.TimeUnit r14 = android.icu.util.MeasureUnit.SECOND
            r11.<init>(r12, r14)
            java.lang.String r0 = r0.format(r11)
            goto L_0x04d2
        L_0x04b5:
            int r0 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x04cb
            android.icu.text.MeasureFormat r0 = r4.q
            android.icu.util.Measure r11 = new android.icu.util.Measure
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            android.icu.util.TimeUnit r14 = android.icu.util.MeasureUnit.SECOND
            r11.<init>(r12, r14)
            java.lang.String r0 = r0.format(r11)
            goto L_0x04d2
        L_0x04cb:
            r0 = 0
            goto L_0x04d2
        L_0x04ce:
            java.lang.CharSequence r0 = r4.a(r11)
        L_0x04d2:
            r4.a(r3, r0)
            goto L_0x0538
        L_0x04d6:
            if (r0 == r13) goto L_0x051a
            r11 = 10
            if (r0 == r11) goto L_0x051a
            r11 = 9
            if (r0 != r11) goto L_0x04e9
            java.lang.String r0 = r2.M()
            r4.a(r3, r0)
            goto L_0x0538
        L_0x04e9:
            r11 = 11
            if (r0 != r11) goto L_0x04fc
            java.lang.String r0 = r2.M()
            r4.a(r3, r0)
            java.lang.String r0 = r2.m()
            r4.a(r3, r0)
            goto L_0x0538
        L_0x04fc:
            r11 = 12
            if (r0 != r11) goto L_0x0538
            java.lang.String r0 = r2.M()
            r4.a(r3, r0)
            java.lang.String r0 = r2.m()
            r4.a(r3, r0)
            java.lang.String r0 = r2.n()
            java.lang.CharSequence r0 = r4.a(r0)
            r4.a(r3, r0)
            goto L_0x0538
        L_0x051a:
            java.lang.String r0 = r2.M()
            r4.a(r3, r0)
            java.lang.String r0 = r2.m()
            r4.a(r3, r0)
            int r0 = r2.y()
            if (r0 <= 0) goto L_0x0538
            r11 = 2131755020(0x7f10000c, float:1.9140907E38)
            java.lang.CharSequence r0 = r4.a(r11, r0)
            r4.a(r3, r0)
        L_0x0538:
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x0548
            java.lang.String r0 = r4.r
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L_0x054a
        L_0x0548:
            r0 = 0
        L_0x054a:
            int r3 = r2.q()
            if (r3 == 0) goto L_0x058f
            if (r3 == r10) goto L_0x058a
            if (r3 == r9) goto L_0x0575
            r11 = 3
            if (r3 == r11) goto L_0x056c
            r11 = 4
            if (r3 == r11) goto L_0x055f
            r11 = r7
            r3 = 0
        L_0x055c:
            r7 = 0
            r12 = 0
            goto L_0x0595
        L_0x055f:
            java.lang.String r3 = r2.r()
            java.lang.String r7 = r4.u
            int r11 = r4.y
            r12 = r3
            r3 = r7
            r7 = 0
            goto L_0x0595
        L_0x056c:
            java.lang.String r3 = r4.t
            android.graphics.drawable.Drawable r7 = r4.v
            int r11 = r4.x
            r12 = 0
            goto L_0x0595
        L_0x0575:
            java.lang.String r3 = r2.r()
            java.lang.String r11 = r2.s()
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 == 0) goto L_0x0585
            r11 = r7
            goto L_0x055c
        L_0x0585:
            r12 = r3
            r3 = r11
            r11 = r7
            r7 = 0
            goto L_0x0595
        L_0x058a:
            java.lang.String r3 = r4.s
            r11 = r7
            goto L_0x0593
        L_0x058f:
            r11 = r7
            r3 = 0
        L_0x0593:
            r7 = 0
            r12 = 0
        L_0x0595:
            int r14 = r2.c()
            java.lang.String r18 = r2.e()
            java.lang.CharSequence r18 = defpackage.dcy.a(r18)
            boolean r19 = android.text.TextUtils.isEmpty(r18)
            r15 = 3
            if (r14 != r15) goto L_0x05f9
            java.lang.String r13 = r2.C()
            java.lang.CharSequence r13 = defpackage.dcy.a(r13)
            java.lang.String r14 = r2.e()
            java.lang.CharSequence r14 = defpackage.dcy.a(r14)
            boolean r15 = android.text.TextUtils.isEmpty(r13)
            if (r15 != 0) goto L_0x05f5
            boolean r15 = android.text.TextUtils.isEmpty(r14)
            if (r15 == 0) goto L_0x05db
            java.util.Locale r14 = java.util.Locale.getDefault()
            java.lang.String r15 = r4.C
            java.lang.Object[] r9 = new java.lang.Object[r10]
            r9[r5] = r13
            java.lang.String r9 = java.lang.String.format(r14, r15, r9)
            android.text.Spanned r9 = android.text.Html.fromHtml(r9, r5)
            r21 = r0
            r0 = r9
            goto L_0x0658
        L_0x05db:
            java.util.Locale r9 = java.util.Locale.getDefault()
            java.lang.String r15 = r4.D
            r21 = r0
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r5] = r13
            r10 = 1
            r0[r10] = r14
            java.lang.String r0 = java.lang.String.format(r9, r15, r0)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0, r5)
            goto L_0x0658
        L_0x05f5:
            r21 = r0
            r0 = r14
            goto L_0x0658
        L_0x05f9:
            r21 = r0
            r0 = 7
            if (r14 == r0) goto L_0x0635
            if (r14 == r13) goto L_0x0635
            r0 = 9
            if (r14 != r0) goto L_0x0605
            goto L_0x060f
        L_0x0605:
            r9 = 10
            if (r14 == r9) goto L_0x060f
            r0 = 11
            if (r14 == r0) goto L_0x060f
            goto L_0x0656
        L_0x060f:
            int r0 = r2.o()
            long r9 = r2.p()
            java.lang.CharSequence r0 = r4.a(r0, r9)
            if (r0 == 0) goto L_0x0632
            if (r19 != 0) goto L_0x0658
            java.util.Locale r9 = java.util.Locale.getDefault()
            java.lang.String r10 = r4.E
            r13 = 2
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r14[r5] = r0
            r13 = 1
            r14[r13] = r18
            java.lang.String r0 = java.lang.String.format(r9, r10, r14)
            goto L_0x0658
        L_0x0632:
            if (r19 != 0) goto L_0x0658
            goto L_0x0656
        L_0x0635:
            java.lang.String r0 = r2.n()
            java.lang.CharSequence r0 = r4.a(r0)
            if (r0 == 0) goto L_0x0654
            if (r19 != 0) goto L_0x0658
            java.util.Locale r9 = java.util.Locale.getDefault()
            java.lang.String r10 = r4.E
            r13 = 2
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r14[r5] = r0
            r13 = 1
            r14[r13] = r18
            java.lang.String r0 = java.lang.String.format(r9, r10, r14)
            goto L_0x0658
        L_0x0654:
            if (r19 != 0) goto L_0x0658
        L_0x0656:
            r0 = r18
        L_0x0658:
            android.widget.TextView r9 = r4.b
            java.lang.CharSequence r6 = defpackage.dcy.a(r6)
            r9.setText(r6)
            android.widget.TextView r6 = r4.c
            java.lang.CharSequence r9 = defpackage.dcy.a(r21)
            r6.setText(r9)
            android.widget.TextView r6 = r4.d
            java.lang.CharSequence r0 = defpackage.dcy.a(r0)
            r6.setText(r0)
            android.widget.TextView r0 = r4.d
            int r6 = r4.e
            r0.setMaxLines(r6)
            java.lang.String r0 = r2.G()
            int r6 = r2.F()
            r4.j = r5
            android.widget.TextView r9 = r4.f
            r10 = 0
            r9.setText(r10)
            android.widget.TextView r9 = r4.g
            r9.setText(r10)
            android.widget.TextView r9 = r4.h
            r9.setText(r10)
            boolean r9 = r4.F
            if (r9 == 0) goto L_0x069a
            goto L_0x0810
        L_0x069a:
            if (r0 == 0) goto L_0x0810
            if (r6 == 0) goto L_0x0756
            r9 = 1
            if (r6 == r9) goto L_0x06d6
            r9 = 2
            if (r6 == r9) goto L_0x06a6
            goto L_0x0810
        L_0x06a6:
            float r6 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x080f }
            r9 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 / r9
            java.text.NumberFormat r9 = java.text.NumberFormat.getPercentInstance()     // Catch:{ NumberFormatException -> 0x080f }
            r10 = 46
            int r0 = r0.indexOf(r10)     // Catch:{ NumberFormatException -> 0x080f }
            r10 = -1
            if (r0 == r10) goto L_0x06bf
            r10 = 1
            r9.setMaximumFractionDigits(r10)     // Catch:{ NumberFormatException -> 0x080f }
            goto L_0x06c3
        L_0x06bf:
            r9.setMaximumFractionDigits(r5)     // Catch:{ NumberFormatException -> 0x080f }
        L_0x06c3:
            double r13 = (double) r6     // Catch:{ NumberFormatException -> 0x080f }
            java.lang.String r0 = r9.format(r13)     // Catch:{ NumberFormatException -> 0x080f }
            android.widget.TextView r9 = r4.h     // Catch:{ NumberFormatException -> 0x080f }
            r9.setText(r0)     // Catch:{ NumberFormatException -> 0x080f }
            coj r0 = r4.H     // Catch:{ NumberFormatException -> 0x080f }
            r9 = 1
            r0.c = r9     // Catch:{ NumberFormatException -> 0x080f }
            r0.h = r6     // Catch:{ NumberFormatException -> 0x080f }
            goto L_0x0810
        L_0x06d6:
            java.util.regex.Pattern r6 = r4.k
            java.util.regex.Matcher r0 = r6.matcher(r0)
            boolean r6 = r0.find()
            if (r6 == 0) goto L_0x0810
            int r6 = r0.groupCount()
            r9 = 2
            if (r6 != r9) goto L_0x0810
            r6 = 1
            java.lang.String r10 = r0.group(r6)
            long r13 = java.lang.Long.parseLong(r10)
            java.lang.String r0 = r0.group(r9)
            long r9 = java.lang.Long.parseLong(r0)
            java.text.NumberFormat r0 = java.text.NumberFormat.getInstance()
            android.widget.TextView r6 = r4.f
            java.lang.String r15 = r0.format(r13)
            r6.setText(r15)
            android.widget.TextView r6 = r4.g
            java.lang.String r0 = r0.format(r9)
            r6.setText(r0)
            android.widget.TextView r0 = r4.f
            android.content.Context r6 = r4.a
            android.content.res.Resources r6 = r6.getResources()
            r15 = 1
            java.lang.Object[] r5 = new java.lang.Object[r15]
            java.lang.Long r15 = java.lang.Long.valueOf(r13)
            r16 = 0
            r5[r16] = r15
            r15 = 2131755022(0x7f10000e, float:1.9140912E38)
            int r1 = (int) r13
            java.lang.String r1 = r6.getQuantityString(r15, r1, r5)
            r0.setContentDescription(r1)
            android.widget.TextView r0 = r4.g
            android.content.Context r1 = r4.a
            android.content.res.Resources r1 = r1.getResources()
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            r15 = 0
            r6[r15] = r5
            r5 = 2131755021(0x7f10000d, float:1.914091E38)
            int r15 = (int) r9
            java.lang.String r1 = r1.getQuantityString(r5, r15, r6)
            r0.setContentDescription(r1)
            coj r0 = r4.H
            r1 = 1
            r0.b = r1
            r0.i = r13
            r0.j = r9
            goto L_0x0810
        L_0x0756:
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x080f }
            com.google.android.tvlauncher.widget.BarRatingView r1 = r4.i     // Catch:{ NumberFormatException -> 0x080f }
            r5 = 1084227584(0x40a00000, float:5.0)
            float r6 = r0 / r5
            int r9 = r1.a     // Catch:{ NumberFormatException -> 0x080f }
            float r10 = (float) r9     // Catch:{ NumberFormatException -> 0x080f }
            float r6 = r6 * r10
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            int r15 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r15 < 0) goto L_0x078e
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x078c
            int r5 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r5 > 0) goto L_0x0775
        L_0x0774:
            goto L_0x077c
        L_0x0775:
            int r5 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0774
            r5 = 1
            goto L_0x078f
        L_0x077c:
            int r5 = r9 + -1
            float r9 = (float) r5     // Catch:{ NumberFormatException -> 0x080f }
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x0787
            int r9 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r9 < 0) goto L_0x078b
        L_0x0787:
            int r5 = java.lang.Math.round(r6)     // Catch:{ NumberFormatException -> 0x080f }
        L_0x078b:
            goto L_0x078f
        L_0x078c:
            r5 = r9
            goto L_0x078f
        L_0x078e:
            r5 = 0
        L_0x078f:
            float r5 = (float) r5     // Catch:{ NumberFormatException -> 0x080f }
            int r6 = r1.a     // Catch:{ NumberFormatException -> 0x080f }
            float r6 = (float) r6     // Catch:{ NumberFormatException -> 0x080f }
            float r5 = r5 / r6
            r1.b = r5     // Catch:{ NumberFormatException -> 0x080f }
            int r5 = r1.getLayoutDirection()     // Catch:{ NumberFormatException -> 0x080f }
            r6 = 1
            if (r5 == r6) goto L_0x07c0
            android.graphics.RectF r5 = new android.graphics.RectF     // Catch:{ NumberFormatException -> 0x080f }
            float r6 = r1.b     // Catch:{ NumberFormatException -> 0x080f }
            int r9 = r1.c     // Catch:{ NumberFormatException -> 0x080f }
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x080f }
            float r6 = r6 * r9
            int r9 = r1.d     // Catch:{ NumberFormatException -> 0x080f }
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x080f }
            r5.<init>(r14, r14, r6, r9)     // Catch:{ NumberFormatException -> 0x080f }
            r1.e = r5     // Catch:{ NumberFormatException -> 0x080f }
            android.graphics.RectF r5 = new android.graphics.RectF     // Catch:{ NumberFormatException -> 0x080f }
            float r6 = r1.b     // Catch:{ NumberFormatException -> 0x080f }
            int r9 = r1.c     // Catch:{ NumberFormatException -> 0x080f }
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x080f }
            float r6 = r6 * r9
            int r10 = r1.d     // Catch:{ NumberFormatException -> 0x080f }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x080f }
            r5.<init>(r6, r14, r9, r10)     // Catch:{ NumberFormatException -> 0x080f }
            r1.f = r5     // Catch:{ NumberFormatException -> 0x080f }
            goto L_0x07e5
        L_0x07c0:
            android.graphics.RectF r5 = new android.graphics.RectF     // Catch:{ NumberFormatException -> 0x080f }
            float r6 = r1.b     // Catch:{ NumberFormatException -> 0x080f }
            float r6 = r13 - r6
            int r9 = r1.c     // Catch:{ NumberFormatException -> 0x080f }
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x080f }
            float r6 = r6 * r9
            int r10 = r1.d     // Catch:{ NumberFormatException -> 0x080f }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x080f }
            r5.<init>(r6, r14, r9, r10)     // Catch:{ NumberFormatException -> 0x080f }
            r1.e = r5     // Catch:{ NumberFormatException -> 0x080f }
            android.graphics.RectF r5 = new android.graphics.RectF     // Catch:{ NumberFormatException -> 0x080f }
            float r6 = r1.b     // Catch:{ NumberFormatException -> 0x080f }
            float r13 = r13 - r6
            int r6 = r1.c     // Catch:{ NumberFormatException -> 0x080f }
            float r6 = (float) r6     // Catch:{ NumberFormatException -> 0x080f }
            float r13 = r13 * r6
            int r6 = r1.d     // Catch:{ NumberFormatException -> 0x080f }
            float r6 = (float) r6     // Catch:{ NumberFormatException -> 0x080f }
            r5.<init>(r14, r14, r13, r6)     // Catch:{ NumberFormatException -> 0x080f }
            r1.f = r5     // Catch:{ NumberFormatException -> 0x080f }
        L_0x07e5:
            r1.invalidate()     // Catch:{ NumberFormatException -> 0x080f }
            r1 = 1
            r4.j = r1     // Catch:{ NumberFormatException -> 0x080f }
            com.google.android.tvlauncher.widget.BarRatingView r1 = r4.i     // Catch:{ NumberFormatException -> 0x080f }
            android.content.Context r5 = r4.a     // Catch:{ NumberFormatException -> 0x080f }
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ NumberFormatException -> 0x080f }
            r6 = 1
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ NumberFormatException -> 0x080f }
            java.lang.Float r6 = java.lang.Float.valueOf(r0)     // Catch:{ NumberFormatException -> 0x080f }
            r10 = 0
            r9[r10] = r6     // Catch:{ NumberFormatException -> 0x080f }
            r6 = 2131886448(0x7f120170, float:1.9407475E38)
            java.lang.String r5 = r5.getString(r6, r9)     // Catch:{ NumberFormatException -> 0x080f }
            r1.setContentDescription(r5)     // Catch:{ NumberFormatException -> 0x080f }
            coj r1 = r4.H     // Catch:{ NumberFormatException -> 0x080f }
            r5 = 1
            r1.a = r5     // Catch:{ NumberFormatException -> 0x080f }
            r1.g = r0     // Catch:{ NumberFormatException -> 0x080f }
            goto L_0x0810
        L_0x080f:
            r0 = move-exception
        L_0x0810:
            android.widget.TextView r0 = r4.n
            java.lang.CharSequence r1 = defpackage.dcy.a(r3)
            r0.setText(r1)
            android.widget.TextView r0 = r4.n
            r1 = 0
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r7, r1, r1, r1)
            android.widget.TextView r0 = r4.n
            r0.setTextColor(r11)
            android.widget.TextView r0 = r4.m
            java.lang.CharSequence r1 = defpackage.dcy.a(r12)
            r0.setText(r1)
            android.widget.TextView r0 = r4.o
            java.lang.CharSequence r1 = defpackage.dcy.a(r8)
            r0.setText(r1)
            android.widget.TextView r0 = r4.o
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0843
            coj r0 = r4.H
            r1 = 1
            r0.d = r1
        L_0x0843:
            android.widget.TextView r0 = r4.d
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0850
            coj r0 = r4.H
            r1 = 1
            r0.e = r1
        L_0x0850:
            java.lang.String r0 = r4.G
            if (r0 != 0) goto L_0x0855
            goto L_0x0866
        L_0x0855:
            android.content.Context r0 = r4.a
            sx r0 = defpackage.si.c(r0)
            java.lang.String r1 = r4.G
            su r0 = r0.a(r1)
            android.widget.ImageView r1 = r4.p
            r0.a(r1)
        L_0x0866:
            android.content.Context r0 = r4.a
            boolean r0 = defpackage.dcy.b(r0)
            android.widget.ImageView r1 = r4.p
            r5 = 0
            r1.setContentDescription(r5)
            if (r0 != 0) goto L_0x0875
            goto L_0x08af
        L_0x0875:
            if (r3 != 0) goto L_0x0878
            goto L_0x0896
        L_0x0878:
            if (r12 == 0) goto L_0x0896
            android.view.View r0 = r4.l
            android.content.Context r1 = r4.a
            android.content.res.Resources r1 = r1.getResources()
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r3
            r3 = 1
            r5[r3] = r12
            r3 = 2131886446(0x7f12016e, float:1.9407471E38)
            java.lang.String r1 = r1.getString(r3, r5)
            r0.setContentDescription(r1)
            goto L_0x089b
        L_0x0896:
            android.view.View r0 = r4.l
            r0.setContentDescription(r3)
        L_0x089b:
            java.lang.String r0 = r4.G
            if (r0 == 0) goto L_0x08a9
            android.widget.ImageView r0 = r4.p
            java.lang.String r1 = r2.v()
            r0.setContentDescription(r1)
            goto L_0x08af
        L_0x08a9:
            android.widget.ImageView r0 = r4.p
            r1 = 0
            r0.setContentDescription(r1)
        L_0x08af:
            r4.b()
            return
        L_0x08b3:
            return
        L_0x08b4:
            r1 = r25
            cok r0 = r1.d
            r0.a()
            return
        L_0x08bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cor.e():void");
    }

    public static final int b(int i2) {
        if (i2 == 0) {
            return 4;
        }
        switch (i2) {
            case 4:
                return 1;
            case 5:
                return 2;
            case 6:
                String valueOf = String.valueOf(ChannelView.a(i2));
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Unsupported ChannelView state: ") : "Unsupported ChannelView state: ".concat(valueOf));
            case 7:
                return 3;
            case 8:
            case 9:
                return 5;
            case 10:
                return 7;
            case 11:
                return 6;
            case 12:
                return 8;
            case 13:
                return 10;
            case 14:
                return 9;
            case 15:
                return 12;
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

    public final void a(cfs cfs) {
        coj coj;
        int i2;
        if (cfs.c == 8 && (coj = this.d.H) != null) {
            dja i3 = cfs.i();
            if (!TextUtils.isEmpty(coj.f)) {
                String str = coj.f;
                if (i3.b) {
                    i3.b();
                    i3.b = false;
                }
                dnb dnb = (dnb) i3.a;
                dnb dnb2 = dnb.j;
                str.getClass();
                dnb.a |= 64;
                dnb.g = str;
            }
            if (coj.a || coj.b || coj.c) {
                dja l2 = dmz.f.l();
                if (coj.a) {
                    float f2 = coj.g;
                    if (l2.b) {
                        l2.b();
                        l2.b = false;
                    }
                    dmz dmz = (dmz) l2.a;
                    dmz.a |= 1;
                    dmz.b = f2;
                } else if (!coj.c) {
                    long j2 = coj.i;
                    if (l2.b) {
                        l2.b();
                        l2.b = false;
                    }
                    dmz dmz2 = (dmz) l2.a;
                    int i4 = dmz2.a | 4;
                    dmz2.a = i4;
                    dmz2.d = j2;
                    long j3 = coj.j;
                    dmz2.a = i4 | 8;
                    dmz2.e = j3;
                } else {
                    float f3 = coj.h;
                    if (l2.b) {
                        l2.b();
                        l2.b = false;
                    }
                    dmz dmz3 = (dmz) l2.a;
                    dmz3.a |= 2;
                    dmz3.c = f3;
                }
                if (i3.b) {
                    i3.b();
                    i3.b = false;
                }
                dnb dnb3 = (dnb) i3.a;
                dmz dmz4 = (dmz) l2.g();
                dnb dnb4 = dnb.j;
                dmz4.getClass();
                dnb3.d = dmz4;
                dnb3.a = 8 | dnb3.a;
            }
            if (coj.l != 0) {
                dja l3 = dmx.d.l();
                switch (coj.k) {
                    case 0:
                        i2 = 1;
                        break;
                    case 1:
                        i2 = 2;
                        break;
                    case 2:
                        i2 = 3;
                        break;
                    case 3:
                        i2 = 4;
                        break;
                    case 4:
                        i2 = 5;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                if (i2 != 0) {
                    if (l3.b) {
                        l3.b();
                        l3.b = false;
                    }
                    dmx dmx = (dmx) l3.a;
                    dmx.b = i2;
                    dmx.a |= 1;
                }
                long j4 = coj.l;
                if (l3.b) {
                    l3.b();
                    l3.b = false;
                }
                dmx dmx2 = (dmx) l3.a;
                dmx2.a |= 2;
                dmx2.c = j4;
                if (i3.b) {
                    i3.b();
                    i3.b = false;
                }
                dnb dnb5 = (dnb) i3.a;
                dmx dmx3 = (dmx) l3.g();
                dnb dnb6 = dnb.j;
                dmx3.getClass();
                dnb5.f = dmx3;
                dnb5.a |= 32;
            }
            boolean z2 = coj.d;
            if (i3.b) {
                i3.b();
                i3.b = false;
            }
            dnb dnb7 = (dnb) i3.a;
            dnb dnb8 = dnb.j;
            int i5 = dnb7.a | 512;
            dnb7.a = i5;
            dnb7.i = z2;
            boolean z3 = coj.e;
            dnb7.a = i5 | 256;
            dnb7.h = z3;
        }
        dja c2 = cfs.c();
        String str2 = this.i;
        if (c2.b) {
            c2.b();
            c2.b = false;
        }
        dmk dmk = (dmk) c2.a;
        dmk dmk2 = dmk.f;
        str2.getClass();
        dmk.a = 1 | dmk.a;
        dmk.b = str2;
        coo coo = this.m;
        if (coo != null) {
            int a2 = coo.a();
            if (c2.b) {
                c2.b();
                c2.b = false;
            }
            dmk dmk3 = (dmk) c2.a;
            dmk3.a = 4 | dmk3.a;
            dmk3.d = a2;
        }
        if (!TextUtils.isEmpty(this.g)) {
            String str3 = this.g;
            if (c2.b) {
                c2.b();
                c2.b = false;
            }
            dmk dmk4 = (dmk) c2.a;
            str3.getClass();
            dmk4.a = 2 | dmk4.a;
            dmk4.c = str3;
        }
        boolean z4 = this.l;
        if (c2.b) {
            c2.b();
            c2.b = false;
        }
        dmk dmk5 = (dmk) c2.a;
        dmk5.a |= 16;
        dmk5.e = z4;
        this.x.a(cfs);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cfs.<init>(int, char):void
     arg types: [int, int]
     candidates:
      cfs.<init>(int, byte):void
      cfs.<init>(int, char):void */
    private final void a(Context context, int i2, cek cek) {
        cfs cfs = new cfs(i2, 0);
        cfs.b(cek);
        dja c2 = cfs.c();
        String str = this.i;
        if (c2.b) {
            c2.b();
            c2.b = false;
        }
        dmk dmk = (dmk) c2.a;
        dmk dmk2 = dmk.f;
        str.getClass();
        dmk.a |= 1;
        dmk.b = str;
        if (!TextUtils.isEmpty(this.g)) {
            String str2 = this.g;
            if (c2.b) {
                c2.b();
                c2.b = false;
            }
            dmk dmk3 = (dmk) c2.a;
            str2.getClass();
            dmk3.a |= 2;
            dmk3.c = str2;
        }
        cla a2 = cla.a(context);
        dja d2 = cfs.d();
        int h2 = a2.h();
        if (d2.b) {
            d2.b();
            d2.b = false;
        }
        dml dml = (dml) d2.a;
        dml dml2 = dml.c;
        dml.a |= 2;
        dml.b = h2;
        coo coo = this.m;
        if (coo != null) {
            int a3 = coo.a();
            if (c2.b) {
                c2.b();
                c2.b = false;
            }
            dmk dmk4 = (dmk) c2.a;
            dmk4.a |= 4;
            dmk4.d = a3;
        }
        boolean z2 = this.l;
        if (c2.b) {
            c2.b();
            c2.b = false;
        }
        dmk dmk5 = (dmk) c2.a;
        dmk5.a |= 16;
        dmk5.e = z2;
        this.x.a(cfs);
    }

    public final void b(Context context) {
        HorizontalGridView horizontalGridView = this.b;
        if (horizontalGridView.g == null) {
            return;
        }
        if (this.a.A != 0 || horizontalGridView.r() == 0 || this.b.g.a() <= 0) {
            int i2 = this.a.A;
            if (i2 == 15 || i2 == 13) {
                c(10);
                return;
            }
            cew cew = this.p;
            if (cew != null) {
                cew.a(context);
            }
        } else if (dcy.d(this.a.getContext())) {
            this.b.i(0);
        } else {
            this.b.j(0);
        }
    }

    public final void f() {
        this.m.a(this.b.r(), "PAYLOAD_FOCUS_CHANGED");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: coo.a(int, boolean):void
     arg types: [int, int]
     candidates:
      coo.a(android.view.ViewGroup, int):km
      coo.a(km, int):void
      jp.a(android.view.ViewGroup, int):km
      jp.a(int, int):void
      jp.a(int, java.lang.Object):void
      jp.a(km, int):void
      coo.a(int, boolean):void */
    public final void b(boolean z2) {
        if (!z2) {
            this.m.a(b(this.a.A), true);
        } else {
            this.m.a(5, false);
        }
    }

    public final void c(Context context) {
        cey cey = this.q;
        if (cey != null) {
            cey.c(context);
        }
    }

    public final void d(Context context) {
        dad dad = this.s;
        if (dad != null && dad.h) {
            dad.b();
            return;
        }
        int i2 = this.a.A;
        if (i2 == 15 || i2 == 13) {
            c(10);
            return;
        }
        if (i2 == 0) {
            km a2 = this.D.a(this.b.r());
            if (a2 instanceof cez) {
                ((cez) a2).d(context);
                return;
            }
        }
        c(context);
    }

    public final void c(ChannelView channelView) {
        if (this.y.c(this.f)) {
            cjs cjs = this.y;
            long j2 = this.f;
            int a2 = cjs.a(j2, 1);
            if (a2 != -1) {
                cjs.a(((Integer) cjs.c.get(j2)).intValue(), a2);
                a(channelView.getContext(), 27, dhs.r);
                this.a.a(this.y.b(this.f), this.y.c(this.f));
                h();
                return;
            }
            StringBuilder sb = new StringBuilder(44);
            sb.append("Can't move channel ");
            sb.append(j2);
            sb.append(" down");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final void b(ChannelView channelView) {
        if (this.y.b(this.f)) {
            cjs cjs = this.y;
            long j2 = this.f;
            int a2 = cjs.a(j2, -1);
            if (a2 != -1) {
                cjs.a(((Integer) cjs.c.get(j2)).intValue(), a2);
                a(channelView.getContext(), 26, dhs.r);
                this.a.a(this.y.b(this.f), this.y.c(this.f));
                h();
                return;
            }
            StringBuilder sb = new StringBuilder(42);
            sb.append("Can't move channel ");
            sb.append(j2);
            sb.append(" up");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final void a(ChannelView channelView) {
        if (dcy.a(channelView.A) || !dcy.b(channelView.getContext()) || (!this.v && !this.w)) {
            a(channelView.h);
            return;
        }
        if (this.s == null) {
            Context context = this.a.getContext();
            dad dad = new dad((Activity) context);
            this.s = dad;
            dad.a(new day(0, context.getString(R.string.context_menu_primary_action_text), context.getDrawable(R.drawable.ic_context_menu_open_black)));
            this.s.a(new day(1, context.getString(R.string.accessibility_menu_item_move_up), context.getDrawable(R.drawable.ic_arrow_up_black_24dp)));
            this.s.a(new day(2, context.getString(R.string.accessibility_menu_item_move_down), context.getDrawable(R.drawable.ic_arrow_down_black_24dp)));
            this.s.a(new day(3, context.getString(R.string.channel_action_remove), context.getDrawable(R.drawable.ic_remove_circle_black)));
            this.s.a(new day(4, context.getString(R.string.accessibility_menu_item_done), context.getDrawable(R.drawable.ic_done_black_24dp)));
            this.s.f = new cop(this);
        }
        i();
        this.s.a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cla.a(long, boolean, boolean):void
     arg types: [long, int, int]
     candidates:
      cla.a(java.util.Map, java.lang.Object, java.lang.Object):void
      cla.a(long, boolean, boolean):void */
    public final void d(ChannelView channelView) {
        a(channelView.getContext(), 24, dhs.w);
        cla a2 = cla.a(channelView.getContext());
        long j2 = this.f;
        Integer a3 = a2.w.a(j2);
        if (a3 != null) {
            a2.k.remove(a3.intValue());
            HashSet hashSet = a2.m;
            Long valueOf = Long.valueOf(j2);
            hashSet.remove(valueOf);
            a2.j.remove(valueOf);
        }
        a2.a(j2, false, false);
        crh crh = this.C;
        if (crh != null) {
            ((cqo) crh).q.i(((km) crh).d());
        }
    }

    public final void c(int i2) {
        switch (i2) {
            case 0:
            case 8:
            case 18:
            case 25:
                cri cri = this.B;
                if (cri != null) {
                    cri.u();
                }
                crj crj = this.A;
                if (crj != null) {
                    crj.c(0);
                    return;
                }
                return;
            case 1:
            case 9:
            case 19:
            case 26:
                crj crj2 = this.A;
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
            case 12:
            case 14:
            case 16:
            case 17:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 29:
            case 30:
            case 31:
            case 32:
                String valueOf = String.valueOf(ChannelView.a(i2));
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Unsupported ChannelView state change gesture: ") : "Unsupported ChannelView state change gesture: ".concat(valueOf));
            case 10:
            case 27:
                cri cri2 = this.B;
                if (cri2 != null) {
                    cri2.u();
                }
                crj crj3 = this.A;
                if (crj3 != null) {
                    crj3.c(1);
                    return;
                }
                return;
            case 11:
            case 28:
                crj crj4 = this.A;
                if (crj4 != null) {
                    crj4.c(1);
                    return;
                }
                return;
            case 13:
                cri cri3 = this.B;
                if (cri3 != null) {
                    cri3.u();
                }
                crj crj5 = this.A;
                if (crj5 != null) {
                    crj5.c(2);
                    return;
                }
                return;
            case 15:
                cri cri4 = this.B;
                if (cri4 != null) {
                    cri4.u();
                }
                crj crj6 = this.A;
                if (crj6 != null) {
                    crj6.c(3);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void a(View view) {
        if (this.h != null) {
            a(this.a.getContext(), 25, dhs.e);
            this.E.a(this.i, this.h, false, view);
        }
    }

    public final void a(boolean z2) {
        if (this.z != z2) {
            this.z = z2;
            b();
        }
    }

    public final void a(crh crh) {
        this.C = crh;
    }

    public final void a(cri cri) {
        this.B = cri;
    }

    public final void a(crj crj) {
        this.A = crj;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: coo.a(int, boolean):void
     arg types: [int, int]
     candidates:
      coo.a(android.view.ViewGroup, int):km
      coo.a(km, int):void
      jp.a(android.view.ViewGroup, int):km
      jp.a(int, int):void
      jp.a(int, java.lang.Object):void
      jp.a(km, int):void
      coo.a(int, boolean):void */
    public final void a(int i2) {
        dad dad;
        if (this.a.A != i2 && this.n.b && this.b.r() == 0) {
            this.n.b(!this.z);
        }
        this.a.b(i2);
        int i3 = this.m.e;
        int b2 = b(i2);
        this.m.a(b2, true);
        a(b2, i3);
        if (dcy.a(i2) && (dad = this.s) != null && dad.h) {
            dad.b();
        }
    }

    public final String toString() {
        String obj = super.toString();
        long j2 = this.f;
        String str = this.g;
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 46 + String.valueOf(str).length());
        sb.append('{');
        sb.append(obj);
        sb.append(", channelId='");
        sb.append(j2);
        sb.append("', title='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    private final void i() {
        boolean z2 = false;
        day a2 = this.s.a(0);
        if (this.h != null) {
            z2 = true;
        }
        a2.a(z2);
        this.s.a(1).a(this.y.b(this.f));
        this.s.a(2).a(this.y.c(this.f));
        this.s.a(3).a(this.w);
    }

    public final void h() {
        dad dad = this.s;
        if (dad != null && dad.h) {
            i();
        }
    }

    public final void a(int i2, int i3) {
        if (i2 != i3 && dej.a(i2) && this.m.a() > 1 && this.b.r() != 0) {
            this.b.k(0);
        }
    }

    public final void b() {
        this.n.b(!this.z);
        this.n.c(false);
    }
}
