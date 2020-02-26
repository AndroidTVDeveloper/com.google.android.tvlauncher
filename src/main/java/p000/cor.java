package p000;

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

/* renamed from: cor */
/* compiled from: PG */
final class cor implements cqz, cuo, cun, cum, cup, cuq, cul, cfp, cex, cez, cey, csf, csd {

    /* renamed from: A */
    private crj f6808A;

    /* renamed from: B */
    private cri f6809B;

    /* renamed from: C */
    private crh f6810C;

    /* renamed from: D */
    private final ctr f6811D;

    /* renamed from: E */
    private final dbj f6812E;

    /* renamed from: a */
    public final ChannelView f6813a;

    /* renamed from: b */
    public final HorizontalGridView f6814b;

    /* renamed from: c */
    public final C0512sx f6815c;

    /* renamed from: d */
    public final cok f6816d;

    /* renamed from: e */
    public final ahb f6817e;

    /* renamed from: f */
    public long f6818f;

    /* renamed from: g */
    public String f6819g;

    /* renamed from: h */
    public String f6820h;

    /* renamed from: i */
    public String f6821i;

    /* renamed from: j */
    public final String f6822j;

    /* renamed from: k */
    public Uri f6823k;

    /* renamed from: l */
    public boolean f6824l;

    /* renamed from: m */
    public coo f6825m = null;

    /* renamed from: n */
    public cse f6826n = null;

    /* renamed from: o */
    public crk f6827o;

    /* renamed from: p */
    public cew f6828p;

    /* renamed from: q */
    public cey f6829q;

    /* renamed from: r */
    public csf f6830r;

    /* renamed from: s */
    public dad f6831s;

    /* renamed from: t */
    public final boolean f6832t;

    /* renamed from: u */
    public final boolean f6833u;

    /* renamed from: v */
    public boolean f6834v;

    /* renamed from: w */
    public boolean f6835w;

    /* renamed from: x */
    private final cfp f6836x;

    /* renamed from: y */
    private final cjs f6837y;

    /* renamed from: z */
    private boolean f6838z;

    public cor(ChannelView channelView, C0512sx sxVar, cfp cfp, cjs cjs, cok cok, dbj dbj, boolean z, boolean z2) {
        String str;
        ctr ctr = new ctr(channelView.f6517b);
        this.f6813a = channelView;
        this.f6815c = sxVar;
        this.f6836x = cfp;
        this.f6837y = cjs;
        this.f6816d = cok;
        channelView.mo3376a(this);
        ChannelView channelView2 = this.f6813a;
        channelView2.f6460K = this;
        channelView2.f6461L = this;
        channelView2.f6462M = this;
        channelView2.f6464O = this;
        channelView2.f6463N = this;
        this.f6812E = dbj;
        this.f6832t = z;
        this.f6833u = z2;
        this.f6811D = ctr;
        if (z) {
            channelView2.mo3387d();
            ChannelView channelView3 = this.f6813a;
            if (this.f6833u) {
                str = channelView3.getContext().getString(R.string.sponsored_channel_logo_title);
            } else {
                str = channelView3.getContext().getString(R.string.sponsored_channel_unbranded_logo_title);
            }
            channelView3.mo3377a(str);
            if (!z2) {
                String string = this.f6813a.getContext().getString(R.string.sponsored_channel_unbranded_logo_title);
                this.f6813a.mo3386c(string);
                this.f6813a.mo3384b(string);
            }
        }
        ChannelView channelView4 = this.f6813a;
        boolean z3 = this.f6832t;
        boolean z4 = this.f6833u;
        channelView4.f6456G = z3;
        channelView4.f6457H = z4;
        ChannelViewMainContent channelViewMainContent = channelView4.f6473a;
        channelViewMainContent.f6542a = z3;
        channelViewMainContent.f6543b = z4;
        if (z3) {
            channelView4.mo3375a();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) channelView4.f6531p.getLayoutParams();
            layoutParams.setMarginStart(0);
            channelView4.f6531p.setLayoutParams(layoutParams);
            channelView4.f6523h.setOutlineProvider(null);
            if (channelView4.f6457H) {
                channelView4.f6518c.setVisibility(0);
                channelView4.f6518c.setTextAppearance(2131951784);
            } else {
                channelView4.f6536u = 0.0f;
            }
        }
        if (this.f6832t) {
            ChannelView channelView5 = this.f6813a;
            Context context = channelView.getContext();
            SparseArray sparseArray = new SparseArray();
            Resources resources = context.getResources();
            ctk ctk = new ctk();
            ctk.f7362a = resources.getDimensionPixelSize(R.dimen.sponsored_program_selected_height);
            ctk.f7363b = resources.getDimensionPixelSize(R.dimen.sponsored_program_selected_margin_vertical);
            ctk.f7364c = resources.getDimensionPixelSize(R.dimen.sponsored_program_selected_margin_vertical);
            ctk.f7365d = resources.getDimensionPixelSize(R.dimen.channel_selected_margin_top);
            ctk.f7366e = resources.getDimensionPixelSize(R.dimen.sponsored_channel_margin_bottom);
            ctk.f7372k = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_selected_keyline_offset);
            ctk.f7368g = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_default_selected_width);
            ctk.f7369h = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_default_selected_height);
            ctk.f7370i = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_selected_margin_start);
            ctk.f7367f = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_selected_margin_top);
            ctk.f7371j = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_selected_margin_end);
            ctk.f7373l = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_title_default_selected_margin_bottom);
            ctk.f7374m = resources.getDimensionPixelSize(R.dimen.channel_items_title_selected_margin_bottom);
            ctk.f7375n = resources.getDimensionPixelSize(R.dimen.sponsored_channel_empty_message_margin_top);
            ctl a = ctk.mo3737a();
            sparseArray.put(0, a);
            sparseArray.put(18, a);
            sparseArray.put(8, a);
            sparseArray.put(9, a);
            sparseArray.put(25, a);
            ctl ctl = new ctl(a);
            ctl.f7388m = resources.getDimensionPixelSize(R.dimen.sponsored_channel_items_title_default_above_selected_last_row_margin_top);
            ctl.f7389n = resources.getDimensionPixelSize(R.dimen.sponsored_channel_items_title_default_above_selected_last_row_margin_bottom);
            sparseArray.put(17, ctl);
            sparseArray.put(32, ctl);
            ctk ctk2 = new ctk();
            ctk2.f7362a = resources.getDimensionPixelSize(R.dimen.program_default_height);
            ctk2.f7363b = resources.getDimensionPixelSize(R.dimen.program_default_margin_top);
            ctk2.f7364c = resources.getDimensionPixelSize(R.dimen.program_default_margin_bottom);
            ctk2.f7372k = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_keyline_offset);
            ctk2.f7368g = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_default_width);
            ctk2.f7369h = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_default_height);
            ctk2.f7370i = resources.getDimensionPixelSize(R.dimen.channel_logo_margin_start);
            ctk2.f7367f = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_default_margin_top);
            ctk2.f7371j = resources.getDimensionPixelSize(R.dimen.channel_logo_margin_end);
            ctk2.f7373l = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_title_default_margin_bottom);
            ctk2.f7374m = resources.getDimensionPixelSize(R.dimen.channel_items_title_default_margin_bottom);
            ctk2.f7375n = resources.getDimensionPixelSize(R.dimen.empty_channel_message_default_margin_top);
            ctl a2 = ctk2.mo3737a();
            sparseArray.put(1, a2);
            sparseArray.put(19, a2);
            sparseArray.put(26, a2);
            ctl ctl2 = new ctl(a2);
            ctl2.f7376a = resources.getDimensionPixelSize(R.dimen.program_default_top_height);
            ctl2.f7377b = resources.getDimensionPixelSize(R.dimen.program_default_top_margin_top);
            ctl2.f7378c = resources.getDimensionPixelSize(R.dimen.program_default_top_margin_bottom);
            sparseArray.put(7, ctl2);
            sparseArray.put(24, ctl2);
            ctl ctl3 = new ctl(ctl2);
            ctl3.f7378c = resources.getDimensionPixelSize(R.dimen.program_default_top_margin_bottom);
            sparseArray.put(4, ctl3);
            sparseArray.put(5, ctl3);
            sparseArray.put(22, ctl3);
            sparseArray.put(23, ctl3);
            ctl ctl4 = new ctl(a2);
            ctl4.f7376a = resources.getDimensionPixelSize(R.dimen.program_default_height);
            ctl4.f7390o = resources.getDimensionPixelSize(R.dimen.empty_channel_message_above_selected_margin_top);
            sparseArray.put(2, ctl4);
            sparseArray.put(20, ctl4);
            ctl ctl5 = new ctl(ctl4);
            ctl5.f7389n = resources.getDimensionPixelSize(R.dimen.channel_items_title_below_selected_margin_bottom);
            ctl5.f7390o = resources.getDimensionPixelSize(R.dimen.sponsored_channel_empty_message_below_selected_margin_top);
            sparseArray.put(3, ctl5);
            sparseArray.put(21, ctl5);
            ctk ctk3 = new ctk();
            ctk3.f7362a = resources.getDimensionPixelSize(R.dimen.program_zoomed_out_height);
            ctk3.f7363b = resources.getDimensionPixelSize(R.dimen.program_zoomed_out_margin_vertical);
            ctk3.f7364c = resources.getDimensionPixelSize(R.dimen.program_zoomed_out_margin_vertical);
            ctk3.f7366e = resources.getDimensionPixelSize(R.dimen.channel_zoomed_out_margin_bottom);
            ctk3.f7368g = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_zoomed_out_selected_width);
            ctk3.f7369h = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_zoomed_out_selected_height);
            ctk3.f7372k = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_zoomed_out_keyline_offset);
            ctk3.f7370i = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_zoomed_out_selected_margin_start);
            ctk3.f7367f = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_zoomed_out_selected_margin_top);
            ctk3.f7371j = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_zoomed_out_selected_margin_end);
            ctk3.f7373l = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_title_zoomed_out_margin_bottom);
            ctk3.f7374m = resources.getDimensionPixelSize(R.dimen.channel_items_title_default_margin_bottom);
            ctk3.f7375n = resources.getDimensionPixelSize(R.dimen.empty_channel_message_zoomed_out_margin_top);
            ctl a3 = ctk3.mo3737a();
            sparseArray.put(10, a3);
            sparseArray.put(27, a3);
            ctl ctl6 = new ctl(a3);
            ctl6.f7384i = resources.getDimensionPixelSize(R.dimen.channel_logo_zoomed_out_margin);
            ctl6.f7381f = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_zoomed_out_margin_top);
            ctl6.f7382g = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_zoomed_out_width);
            ctl6.f7383h = resources.getDimensionPixelSize(R.dimen.sponsored_channel_logo_zoomed_out_height);
            ctl6.f7384i = resources.getDimensionPixelSize(R.dimen.channel_logo_zoomed_out_margin);
            ctl6.f7385j = resources.getDimensionPixelSize(R.dimen.channel_logo_zoomed_out_margin);
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
            channelView5.f6455F = sparseArray;
        } else {
            this.f6813a.f6455F = dcy.m6196e(channelView.getContext());
        }
        HorizontalGridView horizontalGridView = this.f6813a.f6517b;
        this.f6814b = horizontalGridView;
        dcy.m6188a(horizontalGridView);
        int color = channelView.getContext().getColor(R.color.channel_logo_default_background);
        if (this.f6832t && !this.f6833u) {
            this.f6813a.f6523h.setBackground(null);
            this.f6813a.f6523h.setImageDrawable(null);
        } else {
            this.f6813a.f6523h.setBackgroundColor(color);
        }
        this.f6817e = new coq(this.f6813a.f6523h, z, color);
        this.f6822j = channelView.getContext().getString(R.string.sponsored_channel_branding);
    }

    /* renamed from: a */
    public final View mo3472a() {
        return this.f6813a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo3523d() {
        String str;
        chn h = dbq.m6093a(this.f6813a.getContext()).mo2901h(this.f6821i);
        if (h != null) {
            str = h.f5562b.toString();
        } else {
            str = "";
        }
        this.f6813a.mo3377a(str);
        this.f6813a.mo3384b(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo3520c() {
        this.f6813a.mo3379a(this.f6837y.mo2929b(this.f6818f), this.f6837y.mo2930c(this.f6818f));
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
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3525e() {
        /*
            r25 = this;
            r1 = r25
            boolean r0 = r1.f6832t
            if (r0 != 0) goto L_0x08bc
            androidx.leanback.widget.HorizontalGridView r0 = r1.f6814b
            int r0 = r0.mo5622r()
            androidx.leanback.widget.HorizontalGridView r2 = r1.f6814b
            android.content.Context r2 = r2.getContext()
            cla r2 = p000.cla.m5025a(r2)
            r3 = -1
            if (r0 == r3) goto L_0x08b4
            coo r4 = r1.f6825m
            int r4 = r4.mo2794a()
            if (r4 != 0) goto L_0x0023
            goto L_0x08b4
        L_0x0023:
            if (r0 < 0) goto L_0x08b3
            long r4 = r1.f6818f
            int r4 = r2.mo3068d(r4)
            if (r0 >= r4) goto L_0x08b3
            cok r4 = r1.f6816d
            long r5 = r1.f6818f
            cxu r2 = r2.mo3046a(r5, r0)
            coj r0 = new coj
            r5 = 0
            r0.<init>(r5)
            r4.f6184H = r0
            java.lang.String r6 = r2.mo3004d()
            int r7 = r4.f6213w
            r8 = 0
            r4.f6183G = r8
            boolean r0 = r4.f6182F
            r9 = 2
            r10 = 1
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = r2.mo3005e()
            java.lang.String r11 = r2.mo3022u()
            r4.f6183G = r11
            r11 = r7
            r3 = r8
            r7 = r3
            r12 = r7
            r21 = r12
            goto L_0x0658
        L_0x005e:
            int r0 = r2.mo3003c()
            r11 = 10
            r12 = 4
            if (r0 != r12) goto L_0x0068
            goto L_0x006b
        L_0x0068:
            if (r0 != r11) goto L_0x0071
        L_0x006b:
            java.lang.String r13 = r2.mo3022u()
            r4.f6183G = r13
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
            java.lang.String r0 = r2.mo3020t()
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
            android.content.Context r0 = r4.f6191a     // Catch:{ IllegalArgumentException -> 0x02d2 }
            ctd r0 = p000.ctd.m5668a(r0)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3 = r8[r5]     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r0.mo3730a()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            if (r3 == 0) goto L_0x0113
            java.util.List r8 = r0.f7337b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ IllegalArgumentException -> 0x02d2 }
        L_0x00c1:
            boolean r11 = r8.hasNext()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            if (r11 == 0) goto L_0x0112
            java.lang.Object r11 = r8.next()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            ctb r11 = (p000.ctb) r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r13 = r11.f7332b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r14 = r3.getDomain()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            boolean r13 = r13.equals(r14)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            if (r13 == 0) goto L_0x010e
            java.lang.String r13 = r11.f7331a     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r14 = r3.getRatingSystem()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            boolean r13 = r13.equals(r14)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            if (r13 == 0) goto L_0x010a
            java.util.List r11 = r11.f7333c     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ IllegalArgumentException -> 0x02d2 }
        L_0x00eb:
            boolean r13 = r11.hasNext()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            if (r13 == 0) goto L_0x0106
            java.lang.Object r13 = r11.next()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            csy r13 = (p000.csy) r13     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r14 = r13.f7319a     // Catch:{ IllegalArgumentException -> 0x02d2 }
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
            java.util.List r12 = r13.f7321c     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ IllegalArgumentException -> 0x02d2 }
        L_0x013d:
            boolean r14 = r12.hasNext()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            if (r14 == 0) goto L_0x0158
            java.lang.Object r14 = r12.next()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r14 = (p000.cta) r14     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r15 = r14.f7329a     // Catch:{ IllegalArgumentException -> 0x02d2 }
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
            android.content.Context r0 = r0.f7336a     // Catch:{ IllegalArgumentException -> 0x02d2 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object[] r3 = new java.lang.Object[r10]     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r8 = r13.f7320b     // Catch:{ IllegalArgumentException -> 0x02d2 }
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
            android.content.Context r0 = r0.f7336a     // Catch:{ IllegalArgumentException -> 0x02d2 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object[] r8 = new java.lang.Object[r9]     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r11 = r13.f7320b     // Catch:{ IllegalArgumentException -> 0x02d2 }
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
            cta r11 = (p000.cta) r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r11 = r11.f7330b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3.append(r11)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r11 = ", "
            r3.append(r11)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            goto L_0x018f
        L_0x01c7:
            android.content.Context r0 = r0.f7336a     // Catch:{ IllegalArgumentException -> 0x02d2 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3 = 6
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r11 = r13.f7320b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3[r5] = r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r11 = r8.get(r5)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r11 = (p000.cta) r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r11 = r11.f7330b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3[r10] = r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r11 = r8.get(r10)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r11 = (p000.cta) r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r11 = r11.f7330b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3[r9] = r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r11 = r8.get(r9)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r11 = (p000.cta) r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r11 = r11.f7330b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r12 = 3
            r3[r12] = r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r11 = r8.get(r12)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r11 = (p000.cta) r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r11 = r11.f7330b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r12 = 4
            r3[r12] = r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r8 = r8.get(r12)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r8 = (p000.cta) r8     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r8 = r8.f7330b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r11 = 5
            r3[r11] = r8     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r8 = 2131886198(0x7f120076, float:1.9406968E38)
            java.lang.String r8 = r0.getString(r8, r3)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            goto L_0x02d4
        L_0x0212:
            android.content.Context r0 = r0.f7336a     // Catch:{ IllegalArgumentException -> 0x02d2 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3 = 5
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r3 = r13.f7320b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r11[r5] = r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r3 = r8.get(r5)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r3 = (p000.cta) r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r3 = r3.f7330b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r11[r10] = r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r3 = r8.get(r10)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r3 = (p000.cta) r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r3 = r3.f7330b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r11[r9] = r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r3 = r8.get(r9)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r3 = (p000.cta) r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r3 = r3.f7330b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r12 = 3
            r11[r12] = r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r3 = r8.get(r12)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r3 = (p000.cta) r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r3 = r3.f7330b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r8 = 4
            r11[r8] = r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3 = 2131886197(0x7f120075, float:1.9406966E38)
            java.lang.String r8 = r0.getString(r3, r11)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            goto L_0x02d4
        L_0x0252:
            android.content.Context r0 = r0.f7336a     // Catch:{ IllegalArgumentException -> 0x02d2 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3 = 4
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r3 = r13.f7320b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r11[r5] = r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r3 = r8.get(r5)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r3 = (p000.cta) r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r3 = r3.f7330b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r11[r10] = r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r3 = r8.get(r10)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r3 = (p000.cta) r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r3 = r3.f7330b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r11[r9] = r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r3 = r8.get(r9)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r3 = (p000.cta) r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r3 = r3.f7330b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r8 = 3
            r11[r8] = r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3 = 2131886196(0x7f120074, float:1.9406964E38)
            java.lang.String r8 = r0.getString(r3, r11)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            goto L_0x02d4
        L_0x0286:
            android.content.Context r0 = r0.f7336a     // Catch:{ IllegalArgumentException -> 0x02d2 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3 = 3
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r3 = r13.f7320b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r11[r5] = r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r3 = r8.get(r5)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r3 = (p000.cta) r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r3 = r3.f7330b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r11[r10] = r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r3 = r8.get(r10)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r3 = (p000.cta) r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r3 = r3.f7330b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r11[r9] = r3     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3 = 2131886195(0x7f120073, float:1.9406962E38)
            java.lang.String r8 = r0.getString(r3, r11)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            goto L_0x02d4
        L_0x02af:
            android.content.Context r0 = r0.f7336a     // Catch:{ IllegalArgumentException -> 0x02d2 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r11 = r13.f7320b     // Catch:{ IllegalArgumentException -> 0x02d2 }
            r3[r5] = r11     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.Object r8 = r8.get(r5)     // Catch:{ IllegalArgumentException -> 0x02d2 }
            cta r8 = (p000.cta) r8     // Catch:{ IllegalArgumentException -> 0x02d2 }
            java.lang.String r8 = r8.f7330b     // Catch:{ IllegalArgumentException -> 0x02d2 }
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
            int r0 = r2.mo3003c()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r11 = 150(0x96, float:2.1E-43)
            r3.<init>(r11)
            r13 = 8
            r14 = 7
            r19 = 0
            r15 = 4
            if (r0 != r15) goto L_0x0315
            java.lang.String r0 = r2.mo3013m()
            r4.mo3169a(r3, r0)
            java.lang.String r0 = r2.mo3014n()
            java.lang.CharSequence r0 = r4.mo3166a(r0)
            r4.mo3169a(r3, r0)
            long r11 = r2.mo3016p()
            int r0 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x0538
            int r0 = r2.mo3015o()
            java.lang.CharSequence r15 = r4.mo3164a(r0, r11)
            r4.mo3169a(r3, r15)
            coj r15 = r4.f6184H
            r15.f6173k = r0
            r15.f6174l = r11
            goto L_0x0538
        L_0x0315:
            if (r0 != 0) goto L_0x0332
            java.lang.String r0 = r2.mo3014n()
            java.lang.CharSequence r0 = r4.mo3166a(r0)
            r4.mo3169a(r3, r0)
            r4.mo3168a(r3, r2)
            long r11 = r2.mo3025x()
            java.lang.CharSequence r0 = r4.mo3165a(r11)
            r4.mo3169a(r3, r0)
            goto L_0x0538
        L_0x0332:
            if (r0 != r10) goto L_0x0354
            java.lang.String r0 = r2.mo3014n()
            java.lang.CharSequence r0 = r4.mo3166a(r0)
            r4.mo3169a(r3, r0)
            r4.mo3168a(r3, r2)
            int r0 = r2.mo3026y()
            if (r0 <= 0) goto L_0x0538
            r11 = 2131755019(0x7f10000b, float:1.9140905E38)
            java.lang.CharSequence r0 = r4.mo3163a(r11, r0)
            r4.mo3169a(r3, r0)
            goto L_0x0538
        L_0x0354:
            if (r0 != r9) goto L_0x03a2
            java.lang.String r0 = r2.mo3014n()
            java.lang.CharSequence r0 = r4.mo3166a(r0)
            r4.mo3169a(r3, r0)
            java.lang.String r0 = r2.mo3027z()
            boolean r11 = android.text.TextUtils.isEmpty(r0)
            if (r11 != 0) goto L_0x037c
            java.util.Locale r11 = java.util.Locale.getDefault()
            java.lang.String r12 = r4.f6216z
            java.lang.Object[] r15 = new java.lang.Object[r10]
            r15[r5] = r0
            java.lang.String r0 = java.lang.String.format(r11, r12, r15)
            r4.mo3169a(r3, r0)
        L_0x037c:
            int r0 = r2.mo3026y()
            if (r0 <= 0) goto L_0x039d
            int r11 = r2.mo2984A()
            if (r11 != r10) goto L_0x0393
            r11 = 2131755017(0x7f100009, float:1.9140901E38)
            java.lang.CharSequence r0 = r4.mo3163a(r11, r0)
            r4.mo3169a(r3, r0)
            goto L_0x039d
        L_0x0393:
            r11 = 2131755018(0x7f10000a, float:1.9140903E38)
            java.lang.CharSequence r0 = r4.mo3163a(r11, r0)
            r4.mo3169a(r3, r0)
        L_0x039d:
            r4.mo3168a(r3, r2)
            goto L_0x0538
        L_0x03a2:
            r11 = 3
            if (r0 != r11) goto L_0x040e
            java.lang.String r0 = r2.mo3014n()
            java.lang.CharSequence r0 = r4.mo3166a(r0)
            r4.mo3169a(r3, r0)
            java.lang.String r0 = r2.mo3027z()
            boolean r11 = android.text.TextUtils.isEmpty(r0)
            if (r11 != 0) goto L_0x03cb
            java.util.Locale r11 = java.util.Locale.getDefault()
            java.lang.String r12 = r4.f6216z
            java.lang.Object[] r15 = new java.lang.Object[r10]
            r15[r5] = r0
            java.lang.String r0 = java.lang.String.format(r11, r12, r15)
            r4.mo3169a(r3, r0)
        L_0x03cb:
            java.lang.String r0 = r2.mo2985B()
            boolean r11 = android.text.TextUtils.isEmpty(r0)
            if (r11 != 0) goto L_0x03fe
            int r11 = r2.mo2984A()
            if (r11 != r10) goto L_0x03ed
            java.util.Locale r11 = java.util.Locale.getDefault()
            java.lang.String r12 = r4.f6178B
            java.lang.Object[] r15 = new java.lang.Object[r10]
            r15[r5] = r0
            java.lang.String r0 = java.lang.String.format(r11, r12, r15)
            r4.mo3169a(r3, r0)
            goto L_0x03fe
        L_0x03ed:
            java.util.Locale r11 = java.util.Locale.getDefault()
            java.lang.String r12 = r4.f6177A
            java.lang.Object[] r15 = new java.lang.Object[r10]
            r15[r5] = r0
            java.lang.String r0 = java.lang.String.format(r11, r12, r15)
            r4.mo3169a(r3, r0)
        L_0x03fe:
            long r11 = r2.mo3025x()
            java.lang.CharSequence r0 = r4.mo3165a(r11)
            r4.mo3169a(r3, r0)
            r4.mo3168a(r3, r2)
            goto L_0x0538
        L_0x040e:
            r11 = 5
            if (r0 != r11) goto L_0x043c
            java.lang.String r0 = r2.mo3014n()
            java.lang.CharSequence r0 = r4.mo3166a(r0)
            r4.mo3169a(r3, r0)
            long r11 = r2.mo3025x()
            java.lang.CharSequence r0 = r4.mo3165a(r11)
            r4.mo3169a(r3, r0)
            long r11 = r2.mo3016p()
            int r0 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x0538
            int r0 = r2.mo3015o()
            java.lang.CharSequence r0 = r4.mo3164a(r0, r11)
            r4.mo3169a(r3, r0)
            goto L_0x0538
        L_0x043c:
            if (r0 != r14) goto L_0x04d6
            java.lang.String r0 = r2.mo2996M()
            r4.mo3169a(r3, r0)
            java.lang.String r0 = r2.mo3013m()
            r4.mo3169a(r3, r0)
            long r11 = r2.mo3025x()
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
            android.icu.text.MeasureFormat r0 = r4.f6207q
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
            android.icu.text.MeasureFormat r0 = r4.f6207q
            android.icu.util.Measure r14 = new android.icu.util.Measure
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            android.icu.util.TimeUnit r12 = android.icu.util.MeasureUnit.MINUTE
            r14.<init>(r11, r12)
            java.lang.String r0 = r0.format(r14)
            goto L_0x04d2
        L_0x049f:
            int r0 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x04b5
            android.icu.text.MeasureFormat r0 = r4.f6207q
            android.icu.util.Measure r11 = new android.icu.util.Measure
            java.lang.Long r12 = java.lang.Long.valueOf(r21)
            android.icu.util.TimeUnit r14 = android.icu.util.MeasureUnit.SECOND
            r11.<init>(r12, r14)
            java.lang.String r0 = r0.format(r11)
            goto L_0x04d2
        L_0x04b5:
            int r0 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x04cb
            android.icu.text.MeasureFormat r0 = r4.f6207q
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
            java.lang.CharSequence r0 = r4.mo3165a(r11)
        L_0x04d2:
            r4.mo3169a(r3, r0)
            goto L_0x0538
        L_0x04d6:
            if (r0 == r13) goto L_0x051a
            r11 = 10
            if (r0 == r11) goto L_0x051a
            r11 = 9
            if (r0 != r11) goto L_0x04e9
            java.lang.String r0 = r2.mo2996M()
            r4.mo3169a(r3, r0)
            goto L_0x0538
        L_0x04e9:
            r11 = 11
            if (r0 != r11) goto L_0x04fc
            java.lang.String r0 = r2.mo2996M()
            r4.mo3169a(r3, r0)
            java.lang.String r0 = r2.mo3013m()
            r4.mo3169a(r3, r0)
            goto L_0x0538
        L_0x04fc:
            r11 = 12
            if (r0 != r11) goto L_0x0538
            java.lang.String r0 = r2.mo2996M()
            r4.mo3169a(r3, r0)
            java.lang.String r0 = r2.mo3013m()
            r4.mo3169a(r3, r0)
            java.lang.String r0 = r2.mo3014n()
            java.lang.CharSequence r0 = r4.mo3166a(r0)
            r4.mo3169a(r3, r0)
            goto L_0x0538
        L_0x051a:
            java.lang.String r0 = r2.mo2996M()
            r4.mo3169a(r3, r0)
            java.lang.String r0 = r2.mo3013m()
            r4.mo3169a(r3, r0)
            int r0 = r2.mo3026y()
            if (r0 <= 0) goto L_0x0538
            r11 = 2131755020(0x7f10000c, float:1.9140907E38)
            java.lang.CharSequence r0 = r4.mo3163a(r11, r0)
            r4.mo3169a(r3, r0)
        L_0x0538:
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x0548
            java.lang.String r0 = r4.f6208r
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L_0x054a
        L_0x0548:
            r0 = 0
        L_0x054a:
            int r3 = r2.mo3017q()
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
            java.lang.String r3 = r2.mo3018r()
            java.lang.String r7 = r4.f6211u
            int r11 = r4.f6215y
            r12 = r3
            r3 = r7
            r7 = 0
            goto L_0x0595
        L_0x056c:
            java.lang.String r3 = r4.f6210t
            android.graphics.drawable.Drawable r7 = r4.f6212v
            int r11 = r4.f6214x
            r12 = 0
            goto L_0x0595
        L_0x0575:
            java.lang.String r3 = r2.mo3018r()
            java.lang.String r11 = r2.mo3019s()
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
            java.lang.String r3 = r4.f6209s
            r11 = r7
            goto L_0x0593
        L_0x058f:
            r11 = r7
            r3 = 0
        L_0x0593:
            r7 = 0
            r12 = 0
        L_0x0595:
            int r14 = r2.mo3003c()
            java.lang.String r18 = r2.mo3005e()
            java.lang.CharSequence r18 = p000.dcy.m6186a(r18)
            boolean r19 = android.text.TextUtils.isEmpty(r18)
            r15 = 3
            if (r14 != r15) goto L_0x05f9
            java.lang.String r13 = r2.mo2986C()
            java.lang.CharSequence r13 = p000.dcy.m6186a(r13)
            java.lang.String r14 = r2.mo3005e()
            java.lang.CharSequence r14 = p000.dcy.m6186a(r14)
            boolean r15 = android.text.TextUtils.isEmpty(r13)
            if (r15 != 0) goto L_0x05f5
            boolean r15 = android.text.TextUtils.isEmpty(r14)
            if (r15 == 0) goto L_0x05db
            java.util.Locale r14 = java.util.Locale.getDefault()
            java.lang.String r15 = r4.f6179C
            java.lang.Object[] r9 = new java.lang.Object[r10]
            r9[r5] = r13
            java.lang.String r9 = java.lang.String.format(r14, r15, r9)
            android.text.Spanned r9 = android.text.Html.fromHtml(r9, r5)
            r21 = r0
            r0 = r9
            goto L_0x0658
        L_0x05db:
            java.util.Locale r9 = java.util.Locale.getDefault()
            java.lang.String r15 = r4.f6180D
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
            int r0 = r2.mo3015o()
            long r9 = r2.mo3016p()
            java.lang.CharSequence r0 = r4.mo3164a(r0, r9)
            if (r0 == 0) goto L_0x0632
            if (r19 != 0) goto L_0x0658
            java.util.Locale r9 = java.util.Locale.getDefault()
            java.lang.String r10 = r4.f6181E
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
            java.lang.String r0 = r2.mo3014n()
            java.lang.CharSequence r0 = r4.mo3166a(r0)
            if (r0 == 0) goto L_0x0654
            if (r19 != 0) goto L_0x0658
            java.util.Locale r9 = java.util.Locale.getDefault()
            java.lang.String r10 = r4.f6181E
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
            android.widget.TextView r9 = r4.f6192b
            java.lang.CharSequence r6 = p000.dcy.m6186a(r6)
            r9.setText(r6)
            android.widget.TextView r6 = r4.f6193c
            java.lang.CharSequence r9 = p000.dcy.m6186a(r21)
            r6.setText(r9)
            android.widget.TextView r6 = r4.f6194d
            java.lang.CharSequence r0 = p000.dcy.m6186a(r0)
            r6.setText(r0)
            android.widget.TextView r0 = r4.f6194d
            int r6 = r4.f6195e
            r0.setMaxLines(r6)
            java.lang.String r0 = r2.mo2990G()
            int r6 = r2.mo2989F()
            r4.f6200j = r5
            android.widget.TextView r9 = r4.f6196f
            r10 = 0
            r9.setText(r10)
            android.widget.TextView r9 = r4.f6197g
            r9.setText(r10)
            android.widget.TextView r9 = r4.f6198h
            r9.setText(r10)
            boolean r9 = r4.f6182F
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
            android.widget.TextView r9 = r4.f6198h     // Catch:{ NumberFormatException -> 0x080f }
            r9.setText(r0)     // Catch:{ NumberFormatException -> 0x080f }
            coj r0 = r4.f6184H     // Catch:{ NumberFormatException -> 0x080f }
            r9 = 1
            r0.f6165c = r9     // Catch:{ NumberFormatException -> 0x080f }
            r0.f6170h = r6     // Catch:{ NumberFormatException -> 0x080f }
            goto L_0x0810
        L_0x06d6:
            java.util.regex.Pattern r6 = r4.f6201k
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
            android.widget.TextView r6 = r4.f6196f
            java.lang.String r15 = r0.format(r13)
            r6.setText(r15)
            android.widget.TextView r6 = r4.f6197g
            java.lang.String r0 = r0.format(r9)
            r6.setText(r0)
            android.widget.TextView r0 = r4.f6196f
            android.content.Context r6 = r4.f6191a
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
            android.widget.TextView r0 = r4.f6197g
            android.content.Context r1 = r4.f6191a
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
            coj r0 = r4.f6184H
            r1 = 1
            r0.f6164b = r1
            r0.f6171i = r13
            r0.f6172j = r9
            goto L_0x0810
        L_0x0756:
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x080f }
            com.google.android.tvlauncher.widget.BarRatingView r1 = r4.f6199i     // Catch:{ NumberFormatException -> 0x080f }
            r5 = 1084227584(0x40a00000, float:5.0)
            float r6 = r0 / r5
            int r9 = r1.f6770a     // Catch:{ NumberFormatException -> 0x080f }
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
            int r6 = r1.f6770a     // Catch:{ NumberFormatException -> 0x080f }
            float r6 = (float) r6     // Catch:{ NumberFormatException -> 0x080f }
            float r5 = r5 / r6
            r1.f6771b = r5     // Catch:{ NumberFormatException -> 0x080f }
            int r5 = r1.getLayoutDirection()     // Catch:{ NumberFormatException -> 0x080f }
            r6 = 1
            if (r5 == r6) goto L_0x07c0
            android.graphics.RectF r5 = new android.graphics.RectF     // Catch:{ NumberFormatException -> 0x080f }
            float r6 = r1.f6771b     // Catch:{ NumberFormatException -> 0x080f }
            int r9 = r1.f6772c     // Catch:{ NumberFormatException -> 0x080f }
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x080f }
            float r6 = r6 * r9
            int r9 = r1.f6773d     // Catch:{ NumberFormatException -> 0x080f }
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x080f }
            r5.<init>(r14, r14, r6, r9)     // Catch:{ NumberFormatException -> 0x080f }
            r1.f6774e = r5     // Catch:{ NumberFormatException -> 0x080f }
            android.graphics.RectF r5 = new android.graphics.RectF     // Catch:{ NumberFormatException -> 0x080f }
            float r6 = r1.f6771b     // Catch:{ NumberFormatException -> 0x080f }
            int r9 = r1.f6772c     // Catch:{ NumberFormatException -> 0x080f }
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x080f }
            float r6 = r6 * r9
            int r10 = r1.f6773d     // Catch:{ NumberFormatException -> 0x080f }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x080f }
            r5.<init>(r6, r14, r9, r10)     // Catch:{ NumberFormatException -> 0x080f }
            r1.f6775f = r5     // Catch:{ NumberFormatException -> 0x080f }
            goto L_0x07e5
        L_0x07c0:
            android.graphics.RectF r5 = new android.graphics.RectF     // Catch:{ NumberFormatException -> 0x080f }
            float r6 = r1.f6771b     // Catch:{ NumberFormatException -> 0x080f }
            float r6 = r13 - r6
            int r9 = r1.f6772c     // Catch:{ NumberFormatException -> 0x080f }
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x080f }
            float r6 = r6 * r9
            int r10 = r1.f6773d     // Catch:{ NumberFormatException -> 0x080f }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x080f }
            r5.<init>(r6, r14, r9, r10)     // Catch:{ NumberFormatException -> 0x080f }
            r1.f6774e = r5     // Catch:{ NumberFormatException -> 0x080f }
            android.graphics.RectF r5 = new android.graphics.RectF     // Catch:{ NumberFormatException -> 0x080f }
            float r6 = r1.f6771b     // Catch:{ NumberFormatException -> 0x080f }
            float r13 = r13 - r6
            int r6 = r1.f6772c     // Catch:{ NumberFormatException -> 0x080f }
            float r6 = (float) r6     // Catch:{ NumberFormatException -> 0x080f }
            float r13 = r13 * r6
            int r6 = r1.f6773d     // Catch:{ NumberFormatException -> 0x080f }
            float r6 = (float) r6     // Catch:{ NumberFormatException -> 0x080f }
            r5.<init>(r14, r14, r13, r6)     // Catch:{ NumberFormatException -> 0x080f }
            r1.f6775f = r5     // Catch:{ NumberFormatException -> 0x080f }
        L_0x07e5:
            r1.invalidate()     // Catch:{ NumberFormatException -> 0x080f }
            r1 = 1
            r4.f6200j = r1     // Catch:{ NumberFormatException -> 0x080f }
            com.google.android.tvlauncher.widget.BarRatingView r1 = r4.f6199i     // Catch:{ NumberFormatException -> 0x080f }
            android.content.Context r5 = r4.f6191a     // Catch:{ NumberFormatException -> 0x080f }
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ NumberFormatException -> 0x080f }
            r6 = 1
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ NumberFormatException -> 0x080f }
            java.lang.Float r6 = java.lang.Float.valueOf(r0)     // Catch:{ NumberFormatException -> 0x080f }
            r10 = 0
            r9[r10] = r6     // Catch:{ NumberFormatException -> 0x080f }
            r6 = 2131886448(0x7f120170, float:1.9407475E38)
            java.lang.String r5 = r5.getString(r6, r9)     // Catch:{ NumberFormatException -> 0x080f }
            r1.setContentDescription(r5)     // Catch:{ NumberFormatException -> 0x080f }
            coj r1 = r4.f6184H     // Catch:{ NumberFormatException -> 0x080f }
            r5 = 1
            r1.f6163a = r5     // Catch:{ NumberFormatException -> 0x080f }
            r1.f6169g = r0     // Catch:{ NumberFormatException -> 0x080f }
            goto L_0x0810
        L_0x080f:
            r0 = move-exception
        L_0x0810:
            android.widget.TextView r0 = r4.f6204n
            java.lang.CharSequence r1 = p000.dcy.m6186a(r3)
            r0.setText(r1)
            android.widget.TextView r0 = r4.f6204n
            r1 = 0
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r7, r1, r1, r1)
            android.widget.TextView r0 = r4.f6204n
            r0.setTextColor(r11)
            android.widget.TextView r0 = r4.f6203m
            java.lang.CharSequence r1 = p000.dcy.m6186a(r12)
            r0.setText(r1)
            android.widget.TextView r0 = r4.f6205o
            java.lang.CharSequence r1 = p000.dcy.m6186a(r8)
            r0.setText(r1)
            android.widget.TextView r0 = r4.f6205o
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0843
            coj r0 = r4.f6184H
            r1 = 1
            r0.f6166d = r1
        L_0x0843:
            android.widget.TextView r0 = r4.f6194d
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0850
            coj r0 = r4.f6184H
            r1 = 1
            r0.f6167e = r1
        L_0x0850:
            java.lang.String r0 = r4.f6183G
            if (r0 != 0) goto L_0x0855
            goto L_0x0866
        L_0x0855:
            android.content.Context r0 = r4.f6191a
            sx r0 = p000.C0497si.m8296c(r0)
            java.lang.String r1 = r4.f6183G
            su r0 = r0.mo5945a(r1)
            android.widget.ImageView r1 = r4.f6206p
            r0.mo5938a(r1)
        L_0x0866:
            android.content.Context r0 = r4.f6191a
            boolean r0 = p000.dcy.m6193b(r0)
            android.widget.ImageView r1 = r4.f6206p
            r5 = 0
            r1.setContentDescription(r5)
            if (r0 != 0) goto L_0x0875
            goto L_0x08af
        L_0x0875:
            if (r3 != 0) goto L_0x0878
            goto L_0x0896
        L_0x0878:
            if (r12 == 0) goto L_0x0896
            android.view.View r0 = r4.f6202l
            android.content.Context r1 = r4.f6191a
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
            android.view.View r0 = r4.f6202l
            r0.setContentDescription(r3)
        L_0x089b:
            java.lang.String r0 = r4.f6183G
            if (r0 == 0) goto L_0x08a9
            android.widget.ImageView r0 = r4.f6206p
            java.lang.String r1 = r2.mo3023v()
            r0.setContentDescription(r1)
            goto L_0x08af
        L_0x08a9:
            android.widget.ImageView r0 = r4.f6206p
            r1 = 0
            r0.setContentDescription(r1)
        L_0x08af:
            r4.mo3170b()
            return
        L_0x08b3:
            return
        L_0x08b4:
            r1 = r25
            cok r0 = r1.f6816d
            r0.mo3167a()
            return
        L_0x08bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cor.mo3525e():void");
    }

    /* renamed from: b */
    public static final int m5412b(int i) {
        if (i == 0) {
            return 4;
        }
        switch (i) {
            case 4:
                return 1;
            case 5:
                return 2;
            case 6:
                String valueOf = String.valueOf(ChannelView.m5291a(i));
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

    /* renamed from: g */
    public final boolean mo3527g() {
        C0266ju juVar = this.f6814b.f1084x;
        return juVar != null && juVar.mo4191b();
    }

    /* renamed from: a */
    public final void mo2714a(cfs cfs) {
        coj coj;
        int i;
        if (cfs.f5420c == 8 && (coj = this.f6816d.f6184H) != null) {
            dja i2 = cfs.mo2736i();
            if (!TextUtils.isEmpty(coj.f6168f)) {
                String str = coj.f6168f;
                if (i2.f8673b) {
                    i2.mo4505b();
                    i2.f8673b = false;
                }
                dnb dnb = (dnb) i2.f8672a;
                dnb dnb2 = dnb.f8897j;
                str.getClass();
                dnb.f8898a |= 64;
                dnb.f8904g = str;
            }
            if (coj.f6163a || coj.f6164b || coj.f6165c) {
                dja l = dmz.f8890f.mo4516l();
                if (coj.f6163a) {
                    float f = coj.f6169g;
                    if (l.f8673b) {
                        l.mo4505b();
                        l.f8673b = false;
                    }
                    dmz dmz = (dmz) l.f8672a;
                    dmz.f8891a |= 1;
                    dmz.f8892b = f;
                } else if (!coj.f6165c) {
                    long j = coj.f6171i;
                    if (l.f8673b) {
                        l.mo4505b();
                        l.f8673b = false;
                    }
                    dmz dmz2 = (dmz) l.f8672a;
                    int i3 = dmz2.f8891a | 4;
                    dmz2.f8891a = i3;
                    dmz2.f8894d = j;
                    long j2 = coj.f6172j;
                    dmz2.f8891a = i3 | 8;
                    dmz2.f8895e = j2;
                } else {
                    float f2 = coj.f6170h;
                    if (l.f8673b) {
                        l.mo4505b();
                        l.f8673b = false;
                    }
                    dmz dmz3 = (dmz) l.f8672a;
                    dmz3.f8891a |= 2;
                    dmz3.f8893c = f2;
                }
                if (i2.f8673b) {
                    i2.mo4505b();
                    i2.f8673b = false;
                }
                dnb dnb3 = (dnb) i2.f8672a;
                dmz dmz4 = (dmz) l.mo4509g();
                dnb dnb4 = dnb.f8897j;
                dmz4.getClass();
                dnb3.f8901d = dmz4;
                dnb3.f8898a = 8 | dnb3.f8898a;
            }
            if (coj.f6174l != 0) {
                dja l2 = dmx.f8882d.mo4516l();
                switch (coj.f6173k) {
                    case 0:
                        i = 1;
                        break;
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 3;
                        break;
                    case 3:
                        i = 4;
                        break;
                    case 4:
                        i = 5;
                        break;
                    case 5:
                        i = 6;
                        break;
                    case 6:
                        i = 7;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i != 0) {
                    if (l2.f8673b) {
                        l2.mo4505b();
                        l2.f8673b = false;
                    }
                    dmx dmx = (dmx) l2.f8672a;
                    dmx.f8884b = i;
                    dmx.f8883a |= 1;
                }
                long j3 = coj.f6174l;
                if (l2.f8673b) {
                    l2.mo4505b();
                    l2.f8673b = false;
                }
                dmx dmx2 = (dmx) l2.f8672a;
                dmx2.f8883a |= 2;
                dmx2.f8885c = j3;
                if (i2.f8673b) {
                    i2.mo4505b();
                    i2.f8673b = false;
                }
                dnb dnb5 = (dnb) i2.f8672a;
                dmx dmx3 = (dmx) l2.mo4509g();
                dnb dnb6 = dnb.f8897j;
                dmx3.getClass();
                dnb5.f8903f = dmx3;
                dnb5.f8898a |= 32;
            }
            boolean z = coj.f6166d;
            if (i2.f8673b) {
                i2.mo4505b();
                i2.f8673b = false;
            }
            dnb dnb7 = (dnb) i2.f8672a;
            dnb dnb8 = dnb.f8897j;
            int i4 = dnb7.f8898a | 512;
            dnb7.f8898a = i4;
            dnb7.f8906i = z;
            boolean z2 = coj.f6167e;
            dnb7.f8898a = i4 | 256;
            dnb7.f8905h = z2;
        }
        dja c = cfs.mo2730c();
        String str2 = this.f6821i;
        if (c.f8673b) {
            c.mo4505b();
            c.f8673b = false;
        }
        dmk dmk = (dmk) c.f8672a;
        dmk dmk2 = dmk.f8838f;
        str2.getClass();
        dmk.f8839a = 1 | dmk.f8839a;
        dmk.f8840b = str2;
        coo coo = this.f6825m;
        if (coo != null) {
            int a = coo.mo2794a();
            if (c.f8673b) {
                c.mo4505b();
                c.f8673b = false;
            }
            dmk dmk3 = (dmk) c.f8672a;
            dmk3.f8839a = 4 | dmk3.f8839a;
            dmk3.f8842d = a;
        }
        if (!TextUtils.isEmpty(this.f6819g)) {
            String str3 = this.f6819g;
            if (c.f8673b) {
                c.mo4505b();
                c.f8673b = false;
            }
            dmk dmk4 = (dmk) c.f8672a;
            str3.getClass();
            dmk4.f8839a = 2 | dmk4.f8839a;
            dmk4.f8841c = str3;
        }
        boolean z3 = this.f6824l;
        if (c.f8673b) {
            c.mo4505b();
            c.f8673b = false;
        }
        dmk dmk5 = (dmk) c.f8672a;
        dmk5.f8839a |= 16;
        dmk5.f8843e = z3;
        this.f6836x.mo2714a(cfs);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cfs.<init>(int, char):void
     arg types: [int, int]
     candidates:
      cfs.<init>(int, byte):void
      cfs.<init>(int, char):void */
    /* renamed from: a */
    private final void m5411a(Context context, int i, cek cek) {
        cfs cfs = new cfs(i, 0);
        cfs.mo2729b(cek);
        dja c = cfs.mo2730c();
        String str = this.f6821i;
        if (c.f8673b) {
            c.mo4505b();
            c.f8673b = false;
        }
        dmk dmk = (dmk) c.f8672a;
        dmk dmk2 = dmk.f8838f;
        str.getClass();
        dmk.f8839a |= 1;
        dmk.f8840b = str;
        if (!TextUtils.isEmpty(this.f6819g)) {
            String str2 = this.f6819g;
            if (c.f8673b) {
                c.mo4505b();
                c.f8673b = false;
            }
            dmk dmk3 = (dmk) c.f8672a;
            str2.getClass();
            dmk3.f8839a |= 2;
            dmk3.f8841c = str2;
        }
        cla a = cla.m5025a(context);
        dja d = cfs.mo2731d();
        int h = a.mo3074h();
        if (d.f8673b) {
            d.mo4505b();
            d.f8673b = false;
        }
        dml dml = (dml) d.f8672a;
        dml dml2 = dml.f8844c;
        dml.f8845a |= 2;
        dml.f8846b = h;
        coo coo = this.f6825m;
        if (coo != null) {
            int a2 = coo.mo2794a();
            if (c.f8673b) {
                c.mo4505b();
                c.f8673b = false;
            }
            dmk dmk4 = (dmk) c.f8672a;
            dmk4.f8839a |= 4;
            dmk4.f8842d = a2;
        }
        boolean z = this.f6824l;
        if (c.f8673b) {
            c.mo4505b();
            c.f8673b = false;
        }
        dmk dmk5 = (dmk) c.f8672a;
        dmk5.f8839a |= 16;
        dmk5.f8843e = z;
        this.f6836x.mo2714a(cfs);
    }

    /* renamed from: b */
    public final void mo2703b(Context context) {
        HorizontalGridView horizontalGridView = this.f6814b;
        if (horizontalGridView.f1067g == null) {
            return;
        }
        if (this.f6813a.f6450A != 0 || horizontalGridView.mo5622r() == 0 || this.f6814b.f1067g.mo2794a() <= 0) {
            int i = this.f6813a.f6450A;
            if (i == 15 || i == 13) {
                mo3521c(10);
                return;
            }
            cew cew = this.f6828p;
            if (cew != null) {
                cew.mo2702a(context);
            }
        } else if (dcy.m6195d(this.f6813a.getContext())) {
            this.f6814b.mo5617i(0);
        } else {
            this.f6814b.mo5618j(0);
        }
    }

    /* renamed from: f */
    public final void mo3526f() {
        this.f6825m.mo5306a(this.f6814b.mo5622r(), "PAYLOAD_FOCUS_CHANGED");
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
    /* renamed from: b */
    public final void mo3519b(boolean z) {
        if (!z) {
            this.f6825m.mo3508a(m5412b(this.f6813a.f6450A), true);
        } else {
            this.f6825m.mo3508a(5, false);
        }
    }

    /* renamed from: c */
    public final void mo2704c(Context context) {
        cey cey = this.f6829q;
        if (cey != null) {
            cey.mo2704c(context);
        }
    }

    /* renamed from: d */
    public final void mo2705d(Context context) {
        dad dad = this.f6831s;
        if (dad != null && dad.f8024h) {
            dad.mo4031b();
            return;
        }
        int i = this.f6813a.f6450A;
        if (i == 15 || i == 13) {
            mo3521c(10);
            return;
        }
        if (i == 0) {
            C0285km a = this.f6811D.mo3738a(this.f6814b.mo5622r());
            if (a instanceof cez) {
                ((cez) a).mo2705d(context);
                return;
            }
        }
        mo2704c(context);
    }

    /* renamed from: c */
    public final void mo3522c(ChannelView channelView) {
        if (this.f6837y.mo2930c(this.f6818f)) {
            cjs cjs = this.f6837y;
            long j = this.f6818f;
            int a = cjs.mo2923a(j, 1);
            if (a != -1) {
                cjs.mo2926a(((Integer) cjs.f5741c.get(j)).intValue(), a);
                m5411a(channelView.getContext(), 27, dhs.f8554r);
                this.f6813a.mo3379a(this.f6837y.mo2929b(this.f6818f), this.f6837y.mo2930c(this.f6818f));
                mo3528h();
                return;
            }
            StringBuilder sb = new StringBuilder(44);
            sb.append("Can't move channel ");
            sb.append(j);
            sb.append(" down");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    public final void mo3518b(ChannelView channelView) {
        if (this.f6837y.mo2929b(this.f6818f)) {
            cjs cjs = this.f6837y;
            long j = this.f6818f;
            int a = cjs.mo2923a(j, -1);
            if (a != -1) {
                cjs.mo2926a(((Integer) cjs.f5741c.get(j)).intValue(), a);
                m5411a(channelView.getContext(), 26, dhs.f8554r);
                this.f6813a.mo3379a(this.f6837y.mo2929b(this.f6818f), this.f6837y.mo2930c(this.f6818f));
                mo3528h();
                return;
            }
            StringBuilder sb = new StringBuilder(42);
            sb.append("Can't move channel ");
            sb.append(j);
            sb.append(" up");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo3516a(ChannelView channelView) {
        if (dcy.m6190a(channelView.f6450A) || !dcy.m6193b(channelView.getContext()) || (!this.f6834v && !this.f6835w)) {
            mo3515a(channelView.f6523h);
            return;
        }
        if (this.f6831s == null) {
            Context context = this.f6813a.getContext();
            dad dad = new dad((Activity) context);
            this.f6831s = dad;
            dad.mo4030a(new day(0, context.getString(R.string.context_menu_primary_action_text), context.getDrawable(R.drawable.ic_context_menu_open_black)));
            this.f6831s.mo4030a(new day(1, context.getString(R.string.accessibility_menu_item_move_up), context.getDrawable(R.drawable.ic_arrow_up_black_24dp)));
            this.f6831s.mo4030a(new day(2, context.getString(R.string.accessibility_menu_item_move_down), context.getDrawable(R.drawable.ic_arrow_down_black_24dp)));
            this.f6831s.mo4030a(new day(3, context.getString(R.string.channel_action_remove), context.getDrawable(R.drawable.ic_remove_circle_black)));
            this.f6831s.mo4030a(new day(4, context.getString(R.string.accessibility_menu_item_done), context.getDrawable(R.drawable.ic_done_black_24dp)));
            this.f6831s.f8022f = new cop(this);
        }
        m5413i();
        this.f6831s.mo4029a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cla.a(long, boolean, boolean):void
     arg types: [long, int, int]
     candidates:
      cla.a(java.util.Map, java.lang.Object, java.lang.Object):void
      cla.a(long, boolean, boolean):void */
    /* renamed from: d */
    public final void mo3524d(ChannelView channelView) {
        m5411a(channelView.getContext(), 24, dhs.f8559w);
        cla a = cla.m5025a(channelView.getContext());
        long j = this.f6818f;
        Integer a2 = a.f5895w.mo2924a(j);
        if (a2 != null) {
            a.f5883k.remove(a2.intValue());
            HashSet hashSet = a.f5885m;
            Long valueOf = Long.valueOf(j);
            hashSet.remove(valueOf);
            a.f5882j.remove(valueOf);
        }
        a.mo3052a(j, false, false);
        crh crh = this.f6810C;
        if (crh != null) {
            ((cqo) crh).f6974q.mo3605i(((C0285km) crh).mo5436d());
        }
    }

    /* renamed from: c */
    public final void mo3521c(int i) {
        switch (i) {
            case 0:
            case 8:
            case 18:
            case 25:
                cri cri = this.f6809B;
                if (cri != null) {
                    cri.mo3585u();
                }
                crj crj = this.f6808A;
                if (crj != null) {
                    crj.mo3584c(0);
                    return;
                }
                return;
            case 1:
            case 9:
            case 19:
            case 26:
                crj crj2 = this.f6808A;
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
                String valueOf = String.valueOf(ChannelView.m5291a(i));
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Unsupported ChannelView state change gesture: ") : "Unsupported ChannelView state change gesture: ".concat(valueOf));
            case 10:
            case 27:
                cri cri2 = this.f6809B;
                if (cri2 != null) {
                    cri2.mo3585u();
                }
                crj crj3 = this.f6808A;
                if (crj3 != null) {
                    crj3.mo3584c(1);
                    return;
                }
                return;
            case 11:
            case 28:
                crj crj4 = this.f6808A;
                if (crj4 != null) {
                    crj4.mo3584c(1);
                    return;
                }
                return;
            case 13:
                cri cri3 = this.f6809B;
                if (cri3 != null) {
                    cri3.mo3585u();
                }
                crj crj5 = this.f6808A;
                if (crj5 != null) {
                    crj5.mo3584c(2);
                    return;
                }
                return;
            case 15:
                cri cri4 = this.f6809B;
                if (cri4 != null) {
                    cri4.mo3585u();
                }
                crj crj6 = this.f6808A;
                if (crj6 != null) {
                    crj6.mo3584c(3);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo3515a(View view) {
        if (this.f6820h != null) {
            m5411a(this.f6813a.getContext(), 25, dhs.f8541e);
            this.f6812E.mo4068a(this.f6821i, this.f6820h, false, view);
        }
    }

    /* renamed from: a */
    public final void mo3477a(boolean z) {
        if (this.f6838z != z) {
            this.f6838z = z;
            mo3517b();
        }
    }

    /* renamed from: a */
    public final void mo3473a(crh crh) {
        this.f6810C = crh;
    }

    /* renamed from: a */
    public final void mo3474a(cri cri) {
        this.f6809B = cri;
    }

    /* renamed from: a */
    public final void mo3475a(crj crj) {
        this.f6808A = crj;
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
    /* renamed from: a */
    public final void mo3513a(int i) {
        dad dad;
        if (this.f6813a.f6450A != i && this.f6826n.f7168b && this.f6814b.mo5622r() == 0) {
            this.f6826n.mo3697b(!this.f6838z);
        }
        this.f6813a.mo3383b(i);
        int i2 = this.f6825m.f6788e;
        int b = m5412b(i);
        this.f6825m.mo3508a(b, true);
        mo3514a(b, i2);
        if (dcy.m6190a(i) && (dad = this.f6831s) != null && dad.f8024h) {
            dad.mo4031b();
        }
    }

    public final String toString() {
        String obj = super.toString();
        long j = this.f6818f;
        String str = this.f6819g;
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 46 + String.valueOf(str).length());
        sb.append('{');
        sb.append(obj);
        sb.append(", channelId='");
        sb.append(j);
        sb.append("', title='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    /* renamed from: i */
    private final void m5413i() {
        boolean z = false;
        day a = this.f6831s.mo4028a(0);
        if (this.f6820h != null) {
            z = true;
        }
        a.mo4058a(z);
        this.f6831s.mo4028a(1).mo4058a(this.f6837y.mo2929b(this.f6818f));
        this.f6831s.mo4028a(2).mo4058a(this.f6837y.mo2930c(this.f6818f));
        this.f6831s.mo4028a(3).mo4058a(this.f6835w);
    }

    /* renamed from: h */
    public final void mo3528h() {
        dad dad = this.f6831s;
        if (dad != null && dad.f8024h) {
            m5413i();
        }
    }

    /* renamed from: a */
    public final void mo3514a(int i, int i2) {
        if (i != i2 && dej.m6248a(i) && this.f6825m.mo2794a() > 1 && this.f6814b.mo5622r() != 0) {
            this.f6814b.mo5619k(0);
        }
    }

    /* renamed from: b */
    public final void mo3517b() {
        this.f6826n.mo3697b(!this.f6838z);
        this.f6826n.mo3698c(false);
    }
}
