package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.icu.text.MeasureFormat;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.home.view.ProgramView;
import com.google.android.tvlauncher.instantvideo.widget.InstantVideoView;
import java.util.Locale;

/* renamed from: crz */
/* compiled from: PG */
public final class crz implements View.OnClickListener, View.OnLongClickListener, dav, cuz, cez {

    /* renamed from: E */
    private static boolean f7083E = false;

    /* renamed from: A */
    public csf f7084A;

    /* renamed from: B */
    public final csi f7085B;

    /* renamed from: C */
    public final Runnable f7086C;

    /* renamed from: D */
    public final dlk f7087D;

    /* renamed from: F */
    private final cfp f7088F;

    /* renamed from: G */
    private final MeasureFormat f7089G;

    /* renamed from: H */
    private final ctq f7090H;

    /* renamed from: I */
    private final ColorDrawable f7091I;

    /* renamed from: J */
    private final int f7092J;

    /* renamed from: K */
    private final int f7093K;

    /* renamed from: L */
    private final String f7094L;

    /* renamed from: M */
    private final String f7095M;

    /* renamed from: N */
    private final String f7096N;

    /* renamed from: O */
    private final String f7097O;

    /* renamed from: P */
    private dcw f7098P;

    /* renamed from: Q */
    private final ColorStateList f7099Q;

    /* renamed from: R */
    private final ColorStateList f7100R;

    /* renamed from: S */
    private String f7101S;

    /* renamed from: T */
    private int f7102T;

    /* renamed from: U */
    private long f7103U;

    /* renamed from: V */
    private long f7104V;

    /* renamed from: W */
    private boolean f7105W;

    /* renamed from: X */
    private boolean f7106X;

    /* renamed from: Y */
    private String f7107Y;

    /* renamed from: Z */
    private boolean f7108Z;

    /* renamed from: a */
    public final View f7109a;

    /* renamed from: aa */
    private long f7110aa;

    /* renamed from: ab */
    private long f7111ab;

    /* renamed from: ac */
    private long f7112ac;

    /* renamed from: ad */
    private String f7113ad;

    /* renamed from: ae */
    private String f7114ae;

    /* renamed from: af */
    private String f7115af;

    /* renamed from: ag */
    private String f7116ag;

    /* renamed from: ah */
    private Double f7117ah;

    /* renamed from: ai */
    private Double f7118ai;

    /* renamed from: aj */
    private int f7119aj;

    /* renamed from: ak */
    private boolean f7120ak;

    /* renamed from: al */
    private ctm f7121al;

    /* renamed from: am */
    private ctm f7122am;

    /* renamed from: an */
    private ctm f7123an;

    /* renamed from: ao */
    private ValueAnimator.AnimatorUpdateListener f7124ao;

    /* renamed from: ap */
    private Animator.AnimatorListener f7125ap;

    /* renamed from: aq */
    private final boolean f7126aq;

    /* renamed from: ar */
    private final boolean f7127ar;

    /* renamed from: as */
    private final dbj f7128as;

    /* renamed from: at */
    private final Runnable f7129at;

    /* renamed from: au */
    private final Runnable f7130au;

    /* renamed from: av */
    private final View.OnFocusChangeListener f7131av;

    /* renamed from: aw */
    private final agj f7132aw;

    /* renamed from: b */
    public final ProgramView f7133b;

    /* renamed from: c */
    public final InstantVideoView f7134c;

    /* renamed from: d */
    public final View f7135d;

    /* renamed from: e */
    public final ImageView f7136e;

    /* renamed from: f */
    public dbv f7137f;

    /* renamed from: g */
    public boolean f7138g;

    /* renamed from: h */
    public boolean f7139h;

    /* renamed from: i */
    public int f7140i;

    /* renamed from: j */
    public boolean f7141j;

    /* renamed from: k */
    public String f7142k;

    /* renamed from: l */
    public String f7143l;

    /* renamed from: m */
    public String f7144m;

    /* renamed from: n */
    public crl f7145n;

    /* renamed from: o */
    public csa f7146o;

    /* renamed from: p */
    public cey f7147p;

    /* renamed from: q */
    public long f7148q;

    /* renamed from: r */
    public daw f7149r;

    /* renamed from: s */
    public final SharedPreferences f7150s;

    /* renamed from: t */
    public C0423pp f7151t;

    /* renamed from: u */
    public BitmapDrawable f7152u;

    /* renamed from: v */
    public float f7153v;

    /* renamed from: w */
    public ValueAnimator f7154w;

    /* renamed from: x */
    public ValueAnimator f7155x;

    /* renamed from: y */
    public Animator.AnimatorListener f7156y;

    /* renamed from: z */
    public csf f7157z;

    /* renamed from: j */
    private final boolean m5593j() {
        if (this.f7139h || this.f7115af == null) {
            return false;
        }
        int i = this.f7140i;
        return i == 0 || i == 1 || i == 2 || i == 3 || i == 5 || i == 6;
    }

    /* renamed from: k */
    private final boolean m5594k() {
        if (!this.f7139h) {
            long j = this.f7112ac;
            return j >= 1000 && j / 3600000 <= 99 && this.f7140i == 4;
        }
    }

    public crz(ProgramView programView, cfp cfp, boolean z, boolean z2) {
        csi csi;
        ctq ctq;
        if (z) {
            csi = new csi(programView);
        } else {
            csi = null;
        }
        this.f7141j = false;
        this.f7153v = 1.0f;
        this.f7087D = new crr(this);
        this.f7086C = new crt(this);
        this.f7129at = new cru(this);
        this.f7130au = new crv(this);
        this.f7131av = new crw(this);
        this.f7133b = programView;
        this.f7088F = cfp;
        this.f7126aq = z;
        this.f7127ar = z2;
        this.f7085B = csi;
        Context context = programView.getContext();
        this.f7128as = ((cgg) context.getApplicationContext()).mo2750e();
        programView.setOutlineProvider(new crx());
        programView.setClipToOutline(true);
        programView.setOnClickListener(this);
        programView.setOnLongClickListener(this);
        this.f7133b.f6565a = this;
        this.f7150s = context.getSharedPreferences("com.google.android.tvlauncher.data.TvDataManager.PREVIEW_VIDEO_PREF_FILE_NAME", 0);
        if (this.f7126aq) {
            Resources resources = programView.getContext().getResources();
            ctq = new ctq();
            ctq.f7400a = resources.getDimensionPixelSize(R.dimen.program_default_height);
            ctq.f7401b = resources.getDimensionPixelSize(R.dimen.program_default_margin_top);
            ctq.f7402c = resources.getDimensionPixelSize(R.dimen.program_default_margin_bottom);
            ctq.f7403d = resources.getDimensionPixelSize(R.dimen.program_default_margin_horizontal);
            ctq.f7404e = resources.getDimensionPixelSize(R.dimen.program_default_top_height);
            ctq.f7405f = resources.getDimensionPixelSize(R.dimen.program_default_top_margin_top);
            ctq.f7406g = resources.getDimensionPixelSize(R.dimen.program_default_top_margin_bottom);
            ctq.f7407h = resources.getDimensionPixelSize(R.dimen.program_default_top_margin_bottom);
            ctq.f7408i = resources.getDimensionPixelSize(R.dimen.sponsored_program_selected_height);
            ctq.f7409j = resources.getDimensionPixelSize(R.dimen.sponsored_program_selected_margin_vertical);
            ctq.f7410k = resources.getDimensionPixelSize(R.dimen.program_zoomed_out_height);
            ctq.f7411l = resources.getDimensionPixelSize(R.dimen.program_zoomed_out_margin_vertical);
            ctq.f7412m = resources.getDimensionPixelSize(R.dimen.program_zoomed_out_margin_horizontal);
            ctq.f7413n = resources.getInteger(R.integer.program_focused_animation_duration_ms);
            ctq.f7414o = resources.getFraction(R.fraction.sponsored_program_focused_scale, 1, 1);
            ctq.f7415p = resources.getDimension(R.dimen.program_focused_elevation);
        } else {
            ctq = dhz.m6485b(programView.getContext());
        }
        this.f7090H = ctq;
        if (!f7083E) {
            C0497si.m8291a(context).f10364c.mo5928a(Bitmap.class, ctn.class, new ctp(context));
            f7083E = true;
        }
        InstantVideoView instantVideoView = (InstantVideoView) programView.findViewById(R.id.preview_video_view);
        this.f7134c = instantVideoView;
        instantVideoView.mo3431a(false);
        this.f7135d = programView.findViewById(R.id.preview_audio_container);
        this.f7136e = (ImageView) programView.findViewById(R.id.thumbnail);
        this.f7089G = MeasureFormat.getInstance(Locale.getDefault(), MeasureFormat.FormatWidth.WIDE);
        this.f7109a = programView.findViewById(R.id.preview_delay_overlay);
        if (dcy.m6195d(context)) {
            this.f7133b.setOnFocusChangeListener(this.f7131av);
        } else {
            ctq ctq2 = this.f7090H;
            dcw dcw = new dcw(ctq2.f7413n, ctq2.f7414o, ctq2.f7415p, 1);
            this.f7098P = dcw;
            dcw.mo4132a(programView);
            this.f7098P.f8307d = this.f7131av;
        }
        int color = context.getColor(R.color.program_default_background);
        this.f7092J = color;
        this.f7091I = new ColorDrawable(color);
        this.f7093K = this.f7133b.getResources().getDimensionPixelOffset(R.dimen.program_preview_image_expanded_vertical_margin);
        int i = this.f7090H.f7408i;
        agj agj = new agj((byte) 0);
        double d = (double) i;
        Double.isNaN(d);
        this.f7132aw = agj.mo192a(((int) (d * 1.7777777777777777d)) + 20, i).mo207d().mo198a((C0544ub) new dae(this.f7092J, false));
        this.f7094L = context.getString(R.string.program_menu_add_to_play_next_text);
        this.f7095M = context.getString(R.string.program_menu_remove_text);
        this.f7096N = context.getString(R.string.program_menu_add_to_play_next_not_available_text);
        this.f7097O = context.getString(R.string.program_menu_already_in_play_next_text);
        this.f7099Q = ColorStateList.valueOf(this.f7133b.getContext().getColor(R.color.program_playback_live_progress_bar_foreground_color));
        this.f7100R = ColorStateList.valueOf(this.f7133b.getContext().getColor(R.color.program_playback_watch_next_progress_bar_foreground_color));
        if (!this.f7126aq) {
            return;
        }
        if (this.f7127ar) {
            this.f7101S = context.getString(R.string.sponsored_channel_branding, "Google Play");
            return;
        }
        this.f7101S = context.getString(R.string.sponsored_channel_unbranded_logo_title);
    }

    /* renamed from: a */
    public final boolean mo3679a() {
        return !this.f7139h && this.f7150s.getBoolean("enable_preview_audio_key", true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: crz.a(boolean, int):void
     arg types: [int, int]
     candidates:
      crz.a(crz, int):void
      crz.a(boolean, int):void */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0449  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x04fd  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0285 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3677a(p000.cxu r20, java.lang.String r21, int r22, boolean r23, boolean r24, boolean r25) {
        /*
            r19 = this;
            r1 = r19
            daw r0 = r1.f7149r
            if (r0 == 0) goto L_0x000e
            boolean r2 = r0.f8105o
            if (r2 != 0) goto L_0x000b
            goto L_0x000e
        L_0x000b:
            r0.mo4051a()
        L_0x000e:
            boolean r0 = r1.f7141j
            if (r0 != 0) goto L_0x0015
            r0 = r21
            goto L_0x0019
        L_0x0015:
            java.lang.String r0 = r20.mo2998O()
        L_0x0019:
            r1.f7113ad = r0
            r0 = r22
            r1.m5592c(r0)
            r0 = r23
            r1.f7105W = r0
            r0 = r24
            r1.f7106X = r0
            r0 = r25
            r1.f7139h = r0
            long r2 = r20.mo3001a()
            r1.f7103U = r2
            long r2 = r20.mo3002b()
            r1.f7104V = r2
            java.lang.String r0 = r20.mo2988E()
            r1.f7114ae = r0
            int r0 = r20.mo3003c()
            r1.f7140i = r0
            r2 = 4
            r3 = 1001(0x3e9, float:1.403E-42)
            r4 = 1002(0x3ea, float:1.404E-42)
            if (r0 != r4) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            if (r0 != r3) goto L_0x0058
        L_0x004e:
            boolean r5 = r1.f7126aq
            if (r5 == 0) goto L_0x0053
            goto L_0x0058
        L_0x0053:
            r1.f7140i = r2
            r0 = 4
        L_0x0058:
            r2 = 3
            java.lang.String r5 = "SponsoredProgramControllerHelper"
            java.lang.String r6 = "Could not deserialize: %s into AdConfig.AdAsset: "
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = 0
            if (r0 != r4) goto L_0x01b6
            csi r3 = r1.f7085B
            long r11 = r20.mo3001a()
            r3.f7185b = r11
            int r0 = r20.mo3003c()
            r3.f7186c = r0
            java.lang.String r0 = r20.mo2999P()
            r3.f7187d = r0
            r3.mo3702b()
            java.lang.String r0 = r3.f7187d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01a8
            byte[] r4 = r20.mo3000Q()
            if (r4 == 0) goto L_0x00aa
            dis r0 = p000.dis.m6617b()     // Catch:{ djn -> 0x0095 }
            cmc r11 = p000.cmc.f5966f     // Catch:{ djn -> 0x0095 }
            dje r0 = p000.dje.m6688a(r11, r4, r0)     // Catch:{ djn -> 0x0095 }
            cmc r0 = (p000.cmc) r0     // Catch:{ djn -> 0x0095 }
            goto L_0x00ac
        L_0x0095:
            r0 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r8]
            java.lang.String r4 = java.util.Arrays.toString(r4)
            r11[r9] = r4
            java.lang.String r4 = java.lang.String.format(r6, r11)
            java.lang.String r6 = "DoubleClickAdConfigSerializer"
            android.util.Log.e(r6, r4, r0)
            r0 = r10
            goto L_0x00ac
        L_0x00aa:
            r0 = r10
        L_0x00ac:
            if (r0 == 0) goto L_0x0130
            int r4 = r0.f5968b
            if (r4 != r7) goto L_0x012f
            java.lang.Object r4 = r0.f5969c
            cmj r4 = (p000.cmj) r4
            int r6 = r4.f6001b
            if (r6 == r7) goto L_0x00e1
            if (r6 == r2) goto L_0x00dc
            java.lang.String r0 = p000.dcr.m6167a(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = "DoubleClickAdConfig does not have any known format set: "
            int r6 = r0.length()
            if (r6 != 0) goto L_0x00d2
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            goto L_0x00d6
        L_0x00d2:
            java.lang.String r0 = r4.concat(r0)
        L_0x00d6:
            java.lang.String r4 = "OutstreamVideoAdFactory"
            android.util.Log.e(r4, r0)
            goto L_0x0131
        L_0x00dc:
            coc r0 = p000.coe.m5203a(r0)
            goto L_0x0132
        L_0x00e1:
            java.lang.Object r4 = r4.f6002c
            cmg r4 = (p000.cmg) r4
            int r6 = r4.f5985b
            r11 = 5
            if (r6 == r11) goto L_0x0100
            java.lang.Object[] r4 = new java.lang.Object[r8]
            java.lang.String r0 = p000.dcr.m6167a(r0)
            r4[r9] = r0
            java.lang.String r0 = "createVastVideoAd: a non-app install ad passed: %s"
            java.lang.String r0 = java.lang.String.format(r0, r4)
            java.lang.String r4 = "CustomCreativeVideoAdFactory"
            android.util.Log.e(r4, r0)
            r0 = r10
            goto L_0x0132
        L_0x0100:
            java.lang.Object r6 = r4.f5986c
            cmd r6 = (p000.cmd) r6
            clu r11 = new clu
            r11.<init>(r9)
            r11.f5940l = r0
            java.lang.String r0 = r4.f5987d
            r11.f5929a = r0
            java.lang.String r0 = r4.f5988e
            r11.f5930b = r0
            java.lang.String r0 = r4.f5989f
            r11.f5931c = r0
            r11.f5932d = r10
            java.lang.String r0 = r4.f5990g
            r11.f5934f = r0
            java.lang.String r0 = r6.f5975b
            r11.f5936h = r0
            java.lang.String r0 = r6.f5976c
            r11.f5937i = r0
            java.lang.String r0 = r6.f5977d
            r11.f5938j = r0
            cma r0 = new cma
            r0.<init>(r11)
            goto L_0x0132
        L_0x012f:
        L_0x0130:
        L_0x0131:
            r0 = r10
        L_0x0132:
            r3.f7189f = r0
            boolean r0 = r3.mo3701a()
            r3.f7188e = r0
            if (r0 == 0) goto L_0x01ad
            clf r0 = r3.f7193j
            java.lang.String r4 = r3.f7187d
            clv r6 = r3.f7189f
            java.util.List r6 = r6.f5944d
            java.lang.String r11 = r0.f5897a
            boolean r11 = android.text.TextUtils.equals(r11, r4)
            if (r11 == 0) goto L_0x0158
            java.util.List r11 = r0.f5899c
            boolean r11 = r6.equals(r11)
            if (r11 != 0) goto L_0x0156
            r11 = 1
            goto L_0x0159
        L_0x0156:
        L_0x0158:
            r11 = 0
        L_0x0159:
            r0.f5898b = r11
            if (r11 == 0) goto L_0x0161
            r11 = -1
            r0.f5900d = r11
        L_0x0161:
            r0.f5899c = r6
            r0.f5897a = r4
            clv r0 = r3.f7189f
            java.lang.String r0 = r0.f5943c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0194
            clv r0 = r3.f7189f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r4 = r4.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 34
            r6.<init>(r4)
            java.lang.String r4 = "The ad has empty impression URLs: "
            r6.append(r4)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.e(r5, r0)
            goto L_0x01ad
        L_0x0194:
            java.lang.String r0 = r3.f7195l
            clv r4 = r3.f7189f
            java.lang.String r4 = r4.f5943c
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 != 0) goto L_0x01ad
            android.os.Handler r0 = r3.f7191h
            java.lang.Runnable r4 = r3.f7196m
            r0.post(r4)
            goto L_0x01ad
        L_0x01a8:
            r3.f7189f = r10
            r3.f7188e = r9
        L_0x01ad:
            clv r0 = r3.f7189f
            if (r0 != 0) goto L_0x01b4
            r0 = 0
            goto L_0x024b
        L_0x01b4:
            goto L_0x024a
        L_0x01b6:
            if (r0 != r3) goto L_0x0249
            csi r3 = r1.f7085B
            long r11 = r20.mo3001a()
            r3.f7185b = r11
            int r0 = r20.mo3003c()
            r3.f7186c = r0
            r3.f7187d = r10
            byte[] r4 = r20.mo3000Q()
            if (r4 == 0) goto L_0x0211
            cmc r0 = p000.cmc.f5966f     // Catch:{ djn -> 0x01fc }
            dja r0 = r0.mo4516l()     // Catch:{ djn -> 0x01fc }
            dis r11 = p000.dis.m6617b()     // Catch:{ djn -> 0x01fc }
            cmh r12 = p000.cmh.f5991d     // Catch:{ djn -> 0x01fc }
            dje r11 = p000.dje.m6688a(r12, r4, r11)     // Catch:{ djn -> 0x01fc }
            cmh r11 = (p000.cmh) r11     // Catch:{ djn -> 0x01fc }
            boolean r12 = r0.f8673b     // Catch:{ djn -> 0x01fc }
            if (r12 != 0) goto L_0x01e5
            goto L_0x01ea
        L_0x01e5:
            r0.mo4505b()     // Catch:{ djn -> 0x01fc }
            r0.f8673b = r9     // Catch:{ djn -> 0x01fc }
        L_0x01ea:
            dje r12 = r0.f8672a     // Catch:{ djn -> 0x01fc }
            cmc r12 = (p000.cmc) r12     // Catch:{ djn -> 0x01fc }
            r11.getClass()     // Catch:{ djn -> 0x01fc }
            r12.f5969c = r11     // Catch:{ djn -> 0x01fc }
            r12.f5968b = r8     // Catch:{ djn -> 0x01fc }
            dje r0 = r0.mo4509g()     // Catch:{ djn -> 0x01fc }
            cmc r0 = (p000.cmc) r0     // Catch:{ djn -> 0x01fc }
            goto L_0x0213
        L_0x01fc:
            r0 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r8]
            java.lang.String r4 = java.util.Arrays.toString(r4)
            r11[r9] = r4
            java.lang.String r4 = java.lang.String.format(r6, r11)
            java.lang.String r6 = "DirectAdConfigSerializer"
            android.util.Log.e(r6, r4, r0)
            r0 = r10
            goto L_0x0213
        L_0x0211:
            r0 = r10
        L_0x0213:
            if (r0 == 0) goto L_0x0243
            int r4 = r0.f5968b
            if (r4 != r8) goto L_0x0238
            java.lang.Object r4 = r0.f5969c
            cmh r4 = (p000.cmh) r4
            clu r5 = new clu
            r5.<init>(r9)
            java.lang.String r6 = r4.f5993b
            r5.f5936h = r6
            java.lang.String r4 = r4.f5994c
            r5.f5937i = r4
            r5.f5938j = r4
            r5.f5940l = r0
            cln r0 = new cln
            r0.<init>(r5)
            r3.f7189f = r0
            r0 = 1
            goto L_0x024b
        L_0x0238:
            java.lang.String r0 = "AdAsset for a DirectAd does not contain any DirectAd configuration."
            android.util.Log.e(r5, r0)
            r3.f7189f = r10
            r0 = 1
            goto L_0x024b
        L_0x0243:
            r3.f7189f = r10
            r0 = 1
            goto L_0x024b
        L_0x0249:
        L_0x024a:
            r0 = 1
        L_0x024b:
            java.lang.String r3 = r20.mo3010j()
            r1.f7142k = r3
            com.google.android.tvlauncher.instantvideo.widget.InstantVideoView r3 = r1.f7134c
            android.net.Uri r3 = r3.f6601c
            if (r3 == 0) goto L_0x025c
            java.lang.String r3 = r3.toString()
            goto L_0x025e
        L_0x025c:
            r3 = r10
        L_0x025e:
            if (r3 == 0) goto L_0x026d
            java.lang.String r4 = r1.f7142k
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0269
            goto L_0x026d
        L_0x0269:
            r1.mo3678a(r9, r9)
        L_0x026d:
            java.lang.String r3 = r1.f7142k
            if (r3 == 0) goto L_0x027a
            com.google.android.tvlauncher.instantvideo.widget.InstantVideoView r4 = r1.f7134c
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r4.f6601c = r3
            goto L_0x027e
        L_0x027a:
            com.google.android.tvlauncher.instantvideo.widget.InstantVideoView r3 = r1.f7134c
            r3.f6601c = r10
        L_0x027e:
            int r3 = r1.f7140i
            r4 = 7
            r5 = 8
            if (r3 == r4) goto L_0x0297
            if (r3 == r5) goto L_0x0297
            r4 = 9
            if (r3 == r4) goto L_0x0297
            r4 = 10
            if (r3 == r4) goto L_0x0297
            r4 = 11
            if (r3 != r4) goto L_0x0294
            goto L_0x0297
        L_0x0294:
            r1.f7143l = r10
            goto L_0x029d
        L_0x0297:
            java.lang.String r3 = r20.mo3011k()
            r1.f7143l = r3
        L_0x029d:
            java.lang.String r3 = r1.f7143l
            if (r3 != 0) goto L_0x02a8
            dbv r3 = r1.f7137f
            if (r3 == 0) goto L_0x02d0
            r3.f8170b = r10
            goto L_0x02d0
        L_0x02a8:
            dbv r3 = r1.f7137f
            if (r3 == 0) goto L_0x02ad
            goto L_0x02b4
        L_0x02ad:
            dbv r3 = new dbv
            r3.<init>()
            r1.f7137f = r3
        L_0x02b4:
            java.lang.String r3 = r1.f7143l
            dbv r4 = r1.f7137f
            java.lang.String r4 = r4.f8170b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x02d0
            dbv r3 = r1.f7137f
            java.lang.String r3 = r3.f8170b
            if (r3 != 0) goto L_0x02c7
            goto L_0x02ca
        L_0x02c7:
            r19.mo3680b()
        L_0x02ca:
            dbv r3 = r1.f7137f
            java.lang.String r4 = r1.f7143l
            r3.f8170b = r4
        L_0x02d0:
            r1.f7119aj = r9
            java.lang.String r3 = r20.mo3012l()
            r1.f7107Y = r3
            long r3 = r20.mo3025x()
            r1.f7112ac = r3
            boolean r3 = r20.mo2991H()
            r1.f7108Z = r3
            r11 = 0
            if (r3 == 0) goto L_0x02ee
            long r3 = r20.mo2992I()
            goto L_0x02f0
        L_0x02ee:
            r3 = r11
        L_0x02f0:
            r1.f7110aa = r3
            boolean r3 = r1.f7108Z
            if (r3 == 0) goto L_0x02fb
            long r3 = r20.mo2993J()
            goto L_0x02fd
        L_0x02fb:
            r3 = r11
        L_0x02fd:
            r1.f7111ab = r3
            int r3 = r20.mo3007g()
            double r3 = p000.dhz.m6469a(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r1.f7118ai = r3
            r1.f7144m = r10
            r1.f7117ah = r10
            boolean r3 = r1.f7141j
            if (r3 != 0) goto L_0x038c
            java.lang.String r3 = r1.f7142k
            if (r3 == 0) goto L_0x0364
            int r3 = r20.mo2994K()
            int r4 = r20.mo2995L()
            if (r3 > 0) goto L_0x0324
            goto L_0x0354
        L_0x0324:
            if (r4 <= 0) goto L_0x0354
            double r13 = (double) r3
            double r3 = (double) r4
            java.lang.Double.isNaN(r13)
            java.lang.Double.isNaN(r3)
            double r13 = r13 / r3
            java.lang.Double r3 = r1.f7118ai
            double r3 = r3.doubleValue()
            int r6 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x033e
            java.lang.Double r3 = r1.f7118ai
            r1.f7117ah = r3
            goto L_0x0354
        L_0x033e:
            java.lang.Double r3 = r1.f7118ai
            double r3 = r3.doubleValue()
            int r6 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r6 > 0) goto L_0x0354
            r3 = 4616189618054758400(0x4010000000000000, double:4.0)
            int r6 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x0354
            java.lang.Double r3 = java.lang.Double.valueOf(r13)
            r1.f7117ah = r3
        L_0x0354:
            java.lang.Double r3 = r1.f7117ah
            if (r3 != 0) goto L_0x038c
            r3 = 4610685218510194460(0x3ffc71c71c71c71c, double:1.7777777777777777)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r1.f7117ah = r3
            goto L_0x038c
        L_0x0364:
            java.lang.String r3 = r20.mo3008h()
            r1.f7144m = r3
            if (r3 == 0) goto L_0x038c
            int r3 = r20.mo3009i()
            double r3 = p000.dhz.m6469a(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r1.f7117ah = r3
            double r3 = r3.doubleValue()
            java.lang.Double r6 = r1.f7118ai
            double r13 = r6.doubleValue()
            int r6 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r6 >= 0) goto L_0x038c
            java.lang.Double r3 = r1.f7118ai
            r1.f7117ah = r3
        L_0x038c:
            java.lang.Double r3 = r1.f7117ah
            if (r3 != 0) goto L_0x0394
            java.lang.Double r3 = r1.f7118ai
            r1.f7117ah = r3
        L_0x0394:
            java.lang.String r3 = r1.f7142k
            if (r3 == 0) goto L_0x03b5
            java.lang.Double r3 = r1.f7118ai
            double r3 = r3.doubleValue()
            java.lang.Double r6 = r1.f7117ah
            double r13 = r6.doubleValue()
            double r3 = r3 - r13
            double r3 = java.lang.Math.abs(r3)
            r13 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r6 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r6 <= 0) goto L_0x03b4
            r3 = 1
            goto L_0x03b6
        L_0x03b4:
        L_0x03b5:
            r3 = 0
        L_0x03b6:
            r1.f7120ak = r3
            r1.f7152u = r10
            com.google.android.tvlauncher.home.view.ProgramView r3 = r1.f7133b
            android.content.Context r3 = r3.getContext()
            boolean r3 = p000.dcy.m6195d(r3)
            if (r3 != 0) goto L_0x03cb
            dcw r3 = r1.f7098P
            r3.mo4131a()
        L_0x03cb:
            r19.m5597n()
            r19.mo3686g()
            if (r0 == 0) goto L_0x0449
            com.google.android.tvlauncher.home.view.ProgramView r0 = r1.f7133b
            android.widget.ImageView r0 = r0.f6568d
            java.lang.String r3 = r20.mo3004d()
            r0.setContentDescription(r3)
            java.lang.String r0 = r20.mo3006f()
            r19.m5596m()
            r1.f7151t = r10
            r1.f7152u = r10
            boolean r3 = r1.f7120ak
            if (r3 == 0) goto L_0x041b
            com.google.android.tvlauncher.home.view.ProgramView r3 = r1.f7133b
            android.content.Context r3 = r3.getContext()
            sx r3 = p000.C0497si.m8296c(r3)
            java.lang.Class<ctn> r4 = p000.ctn.class
            su r3 = r3.mo5943a(r4)
            r3.mo5939a(r0)
            agj r0 = r1.f7132aw
            su r0 = r3.mo202b(r0)
            ctm r3 = r1.f7122am
            if (r3 != 0) goto L_0x0415
            cry r3 = new cry
            com.google.android.tvlauncher.home.view.ProgramView r4 = r1.f7133b
            android.widget.ImageView r4 = r4.f6568d
            r3.<init>(r1, r4)
            r1.f7122am = r3
        L_0x0415:
            ctm r3 = r1.f7122am
            r0.mo5937a(r3)
            goto L_0x044c
        L_0x041b:
            com.google.android.tvlauncher.home.view.ProgramView r3 = r1.f7133b
            android.content.Context r3 = r3.getContext()
            sx r3 = p000.C0497si.m8296c(r3)
            java.lang.Class<dcz> r4 = p000.dcz.class
            su r3 = r3.mo5943a(r4)
            r3.mo5939a(r0)
            agj r0 = r1.f7132aw
            su r0 = r3.mo202b(r0)
            ctm r3 = r1.f7121al
            if (r3 != 0) goto L_0x0443
            crm r3 = new crm
            com.google.android.tvlauncher.home.view.ProgramView r4 = r1.f7133b
            android.widget.ImageView r4 = r4.f6568d
            r3.<init>(r1, r4)
            r1.f7121al = r3
        L_0x0443:
            ctm r3 = r1.f7121al
            r0.mo5937a(r3)
            goto L_0x044c
        L_0x0449:
            r19.m5596m()
        L_0x044c:
            boolean r0 = r1.f7126aq
            if (r0 == 0) goto L_0x0459
            com.google.android.tvlauncher.home.view.ProgramView r0 = r1.f7133b
            android.widget.ImageView r0 = r0.f6568d
            java.lang.String r3 = r1.f7101S
            r0.setContentDescription(r3)
        L_0x0459:
            r19.m5595l()
            android.widget.ImageView r0 = r1.f7136e
            r0.setVisibility(r5)
            java.lang.String r0 = r1.f7144m
            if (r0 != 0) goto L_0x0472
            android.widget.ImageView r0 = r1.f7136e
            r0.setImageDrawable(r10)
            com.google.android.tvlauncher.home.view.ProgramView r0 = r1.f7133b
            android.view.View r0 = r0.f6566b
            r0.setVisibility(r9)
            goto L_0x04b6
        L_0x0472:
            android.widget.ImageView r0 = r1.f7136e
            r0.setImageDrawable(r10)
            android.widget.ImageView r0 = r1.f7136e
            android.graphics.drawable.ColorDrawable r3 = r1.f7091I
            r0.setBackground(r3)
            android.widget.ImageView r0 = r1.f7136e
            android.content.Context r0 = r0.getContext()
            sx r0 = p000.C0497si.m8296c(r0)
            java.lang.String r3 = r1.f7144m
            su r0 = r0.mo5945a(r3)
            agj r3 = r1.f7132aw
            su r0 = r0.mo202b(r3)
            ctm r3 = r1.f7123an
            if (r3 != 0) goto L_0x04a1
            crn r3 = new crn
            android.widget.ImageView r4 = r1.f7136e
            r3.<init>(r4)
            r1.f7123an = r3
        L_0x04a1:
            ctm r3 = r1.f7123an
            r0.mo5937a(r3)
            boolean r0 = r1.f7138g
            if (r0 == 0) goto L_0x04b6
            android.widget.ImageView r0 = r1.f7136e
            r0.setVisibility(r9)
            com.google.android.tvlauncher.home.view.ProgramView r0 = r1.f7133b
            android.view.View r0 = r0.f6566b
            r0.setVisibility(r5)
        L_0x04b6:
            java.lang.String r0 = r20.mo3022u()
            r1.f7115af = r0
            java.lang.String r0 = r20.mo3023v()
            r1.f7116ag = r0
            boolean r0 = r19.m5593j()
            if (r0 != 0) goto L_0x04d0
            com.google.android.tvlauncher.home.view.ProgramView r0 = r1.f7133b
            android.widget.ImageView r0 = r0.f6575k
            r0.setContentDescription(r10)
            goto L_0x04f7
        L_0x04d0:
            com.google.android.tvlauncher.home.view.ProgramView r0 = r1.f7133b
            android.widget.ImageView r0 = r0.f6575k
            r0.setImageDrawable(r10)
            com.google.android.tvlauncher.home.view.ProgramView r0 = r1.f7133b
            android.content.Context r0 = r0.getContext()
            sx r0 = p000.C0497si.m8296c(r0)
            java.lang.String r3 = r1.f7115af
            su r0 = r0.mo5945a(r3)
            com.google.android.tvlauncher.home.view.ProgramView r3 = r1.f7133b
            android.widget.ImageView r3 = r3.f6575k
            r0.mo5938a(r3)
            com.google.android.tvlauncher.home.view.ProgramView r0 = r1.f7133b
            android.widget.ImageView r0 = r0.f6575k
            java.lang.String r3 = r1.f7116ag
            r0.setContentDescription(r3)
        L_0x04f7:
            boolean r0 = r19.m5594k()
            if (r0 == 0) goto L_0x0586
            com.google.android.tvlauncher.home.view.ProgramView r0 = r1.f7133b
            android.widget.TextView r0 = r0.f6583s
            long r3 = r1.f7112ac
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            java.lang.String r3 = android.text.format.DateUtils.formatElapsedTime(r3)
            r0.setText(r3)
            long r3 = r1.f7112ac
            r13 = 3600000(0x36ee80, double:1.7786363E-317)
            int r10 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r10 < 0) goto L_0x051c
            long r15 = r3 / r13
            long r13 = r13 * r15
            long r3 = r3 - r13
            goto L_0x051d
        L_0x051c:
            r15 = r11
        L_0x051d:
            r13 = 60000(0xea60, double:2.9644E-319)
            int r10 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r10 < 0) goto L_0x052a
            long r17 = r3 / r13
            long r13 = r13 * r17
            long r3 = r3 - r13
            goto L_0x052c
        L_0x052a:
            r17 = r11
        L_0x052c:
            long r3 = r3 / r5
            int r5 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r5 <= 0) goto L_0x0561
            android.icu.text.MeasureFormat r5 = r1.f7089G
            android.icu.util.Measure[] r2 = new android.icu.util.Measure[r2]
            android.icu.util.Measure r6 = new android.icu.util.Measure
            java.lang.Long r10 = java.lang.Long.valueOf(r15)
            android.icu.util.TimeUnit r11 = android.icu.util.MeasureUnit.HOUR
            r6.<init>(r10, r11)
            r2[r9] = r6
            android.icu.util.Measure r6 = new android.icu.util.Measure
            java.lang.Long r9 = java.lang.Long.valueOf(r17)
            android.icu.util.TimeUnit r10 = android.icu.util.MeasureUnit.MINUTE
            r6.<init>(r9, r10)
            r2[r8] = r6
            android.icu.util.Measure r6 = new android.icu.util.Measure
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            android.icu.util.TimeUnit r4 = android.icu.util.MeasureUnit.SECOND
            r6.<init>(r3, r4)
            r2[r7] = r6
            java.lang.String r2 = r5.formatMeasures(r2)
            goto L_0x0583
        L_0x0561:
            android.icu.text.MeasureFormat r2 = r1.f7089G
            android.icu.util.Measure[] r5 = new android.icu.util.Measure[r7]
            android.icu.util.Measure r6 = new android.icu.util.Measure
            java.lang.Long r7 = java.lang.Long.valueOf(r17)
            android.icu.util.TimeUnit r10 = android.icu.util.MeasureUnit.MINUTE
            r6.<init>(r7, r10)
            r5[r9] = r6
            android.icu.util.Measure r6 = new android.icu.util.Measure
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            android.icu.util.TimeUnit r4 = android.icu.util.MeasureUnit.SECOND
            r6.<init>(r3, r4)
            r5[r8] = r6
            java.lang.String r2 = r2.formatMeasures(r5)
        L_0x0583:
            r0.setContentDescription(r2)
        L_0x0586:
            boolean r0 = r1.f7138g
            r1.m5591a(r0)
            r19.mo3676a(r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.crz.mo3677a(cxu, java.lang.String, int, boolean, boolean, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo3681b(int i) {
        m5592c(i);
        m5595l();
        m5591a(this.f7138g);
        m5597n();
    }

    /* renamed from: f */
    public final void mo3685f() {
        if (this.f7133b.f6568d.getDrawable() != null) {
            this.f7133b.f6567c.setVisibility(4);
            this.f7133b.f6567c.setImageDrawable(null);
        }
    }

    /* renamed from: a */
    public final void mo3675a(int i) {
        csi csi = this.f7085B;
        if (csi != null) {
            if (i != 0) {
                if (i != 1) {
                    if (csi.mo3704d()) {
                        csi.mo3703c();
                    }
                } else if (csi.mo3704d()) {
                    Handler handler = csi.f7194k.f5958d;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 2));
                }
            } else if (csi.mo3704d()) {
                csi.mo3703c();
            }
        }
        this.f7134c.setVisibility(8);
        this.f7134c.mo3428a();
    }

    /* renamed from: h */
    public final ValueAnimator.AnimatorUpdateListener mo3687h() {
        if (this.f7124ao == null) {
            this.f7124ao = new crq(this);
        }
        return this.f7124ao;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo3688i() {
        return this.f7133b.isFocused();
    }

    public final void onClick(View view) {
        if (dcy.m6193b(view.getContext())) {
            onLongClick(view);
        } else {
            m5589a(view);
        }
    }

    /* renamed from: d */
    public final void mo2705d(Context context) {
        daw daw = this.f7149r;
        if (daw != null && daw.f8105o) {
            daw.mo4051a();
            return;
        }
        cey cey = this.f7147p;
        if (cey != null) {
            cey.mo2704c(context);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cfs.<init>(int, char):void
     arg types: [int, int]
     candidates:
      cfs.<init>(int, byte):void
      cfs.<init>(int, char):void */
    /* renamed from: a */
    public final void mo2802a(day day) {
        cla a = cla.m5025a(this.f7133b.getContext());
        int i = day.f8117a;
        if (i == 1) {
            m5589a(this.f7133b);
        } else if (i == 2) {
            new ckw(a, this.f7103U, this.f7113ad).executeOnExecutor(daz.f8124a, new Object[0]);
            String str = this.f7114ae;
            String str2 = this.f7113ad;
            if (!(str == null || str2 == null)) {
                a.f5891s.add(a.mo3047a(str, str2));
            }
            cfs cfs = new cfs(29, 0);
            if (this.f7113ad != null) {
                dja i2 = cfs.mo2736i();
                String str3 = this.f7113ad;
                if (i2.f8673b) {
                    i2.mo4505b();
                    i2.f8673b = false;
                }
                dnb dnb = (dnb) i2.f8672a;
                dnb dnb2 = dnb.f8897j;
                str3.getClass();
                dnb.f8898a = 1 | dnb.f8898a;
                dnb.f8899b = str3;
            }
            this.f7088F.mo2714a(cfs);
        } else if (i == 3) {
            new cku(a, this.f7103U, this.f7113ad, this.f7104V).executeOnExecutor(daz.f8124a, new Object[0]);
            cfs cfs2 = new cfs(31, 0);
            int d = cfs.m4666d(this.f7140i);
            if (d != 0) {
                dja i3 = cfs2.mo2736i();
                if (i3.f8673b) {
                    i3.mo4505b();
                    i3.f8673b = false;
                }
                dnb dnb3 = (dnb) i3.f8672a;
                dnb dnb4 = dnb.f8897j;
                dnb3.f8900c = d;
                dnb3.f8898a |= 4;
            }
            if (this.f7113ad != null) {
                dja i4 = cfs2.mo2736i();
                String str4 = this.f7113ad;
                if (i4.f8673b) {
                    i4.mo4505b();
                    i4.f8673b = false;
                }
                dnb dnb5 = (dnb) i4.f8672a;
                dnb dnb6 = dnb.f8897j;
                str4.getClass();
                dnb5.f8898a = 1 | dnb5.f8898a;
                dnb5.f8899b = str4;
            }
            this.f7088F.mo2714a(cfs2);
        } else if (i == 4) {
            new ckv(a, this.f7103U, this.f7113ad).executeOnExecutor(daz.f8124a, new Object[0]);
            String str5 = this.f7114ae;
            String str6 = this.f7113ad;
            if (!(str5 == null || str6 == null)) {
                a.f5891s.remove(a.mo3047a(str5, str6));
            }
            cfs cfs3 = new cfs(30, 0);
            if (!TextUtils.isEmpty(this.f7113ad)) {
                dja i5 = cfs3.mo2736i();
                String str7 = this.f7113ad;
                if (i5.f8673b) {
                    i5.mo4505b();
                    i5.f8673b = false;
                }
                dnb dnb7 = (dnb) i5.f8672a;
                dnb dnb8 = dnb.f8897j;
                str7.getClass();
                dnb7.f8898a = 1 | dnb7.f8898a;
                dnb7.f8899b = str7;
            }
            this.f7088F.mo2714a(cfs3);
        }
    }

    public final boolean onLongClick(View view) {
        csf csf;
        csf csf2;
        boolean z;
        boolean z2;
        if (!view.hasFocus() || (((csf = this.f7157z) != null && csf.mo3527g()) || ((csf2 = this.f7084A) != null && csf2.mo3527g()))) {
            return true;
        }
        dck.m6123a(this.f7133b.getContext());
        boolean z3 = false;
        if (this.f7106X) {
            dck.m6123a(this.f7133b.getContext());
            z = true;
        } else {
            z = false;
        }
        this.f7149r = new daw((Activity) view.getContext(), view, view.getResources().getDimensionPixelSize(R.dimen.card_rounded_corner_radius));
        if (dcy.m6193b(view.getContext())) {
            day day = new day(1, view.getContext().getString(R.string.context_menu_primary_action_text), view.getContext().getDrawable(R.drawable.ic_context_menu_open_black));
            day.mo4056a();
            this.f7149r.mo4053a(day);
        }
        if (this.f7141j) {
            this.f7149r.mo4053a(new day(4, view.getContext().getString(R.string.program_menu_remove_for_play_next_text), view.getContext().getDrawable(R.drawable.ic_context_menu_uninstall_black)));
        } else {
            cla a = cla.m5025a(view.getContext());
            String str = this.f7114ae;
            String str2 = this.f7113ad;
            if (str == null || str2 == null) {
                z2 = false;
            } else {
                z2 = a.f5891s.contains(a.mo3047a(str, str2));
            }
            day day2 = new day(2, null, view.getContext().getDrawable(R.drawable.ic_context_menu_add_to_watch_next_black));
            this.f7149r.mo4053a(day2);
            if (this.f7105W && !z2) {
                z3 = true;
            }
            day2.mo4058a(z3);
            if (z2) {
                day2.mo4057a(this.f7097O);
            } else {
                day2.mo4057a(!this.f7105W ? this.f7096N : this.f7094L);
            }
            if (z) {
                day day3 = new day(3, null, view.getContext().getDrawable(R.drawable.ic_context_menu_uninstall_black));
                this.f7149r.mo4053a(day3);
                day3.mo4057a(this.f7095M);
            }
        }
        daw daw = this.f7149r;
        daw.f8096f = this;
        daw.mo4054b();
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: crz.a(boolean, int):void
     arg types: [int, int]
     candidates:
      crz.a(crz, int):void
      crz.a(boolean, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dbj.a(java.lang.String, boolean):boolean
     arg types: [java.lang.String, int]
     candidates:
      dbj.a(java.lang.String, java.lang.String):java.lang.String
      dbj.a(java.lang.String, boolean):boolean */
    /* renamed from: a */
    private final void m5589a(View view) {
        boolean z;
        csi csi;
        clv clv;
        String str;
        String str2;
        String str3;
        int i;
        if (this.f7107Y != null || (i = this.f7140i) == 1002 || i == 1001) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean z2 = this.f7142k != null && !this.f7141j;
            if (this.f7148q != 0) {
                z = true;
            } else {
                z = false;
            }
            cfs cfs = new cfs(8, (byte) 0);
            cfs.mo2729b(dhs.f8558v);
            dja i2 = cfs.mo2736i();
            String str4 = this.f7113ad;
            if (i2.f8673b) {
                i2.mo4505b();
                i2.f8673b = false;
            }
            dnb dnb = (dnb) i2.f8672a;
            dnb dnb2 = dnb.f8897j;
            str4.getClass();
            dnb.f8898a |= 1;
            dnb.f8899b = str4;
            int d = cfs.m4666d(this.f7140i);
            if (d != 0) {
                dja i3 = cfs.mo2736i();
                if (i3.f8673b) {
                    i3.mo4505b();
                    i3.f8673b = false;
                }
                dnb dnb3 = (dnb) i3.f8672a;
                dnb3.f8900c = d;
                dnb3.f8898a |= 4;
            }
            if (z2) {
                mo3678a(true, 0);
                dja l = dmy.f8886d.mo4516l();
                int i4 = this.f7119aj;
                if (i4 != 0) {
                    if (l.f8673b) {
                        l.mo4505b();
                        l.f8673b = false;
                    }
                    dmy dmy = (dmy) l.f8672a;
                    dmy.f8887a = 8 | dmy.f8887a;
                    dmy.f8889c = i4;
                }
                dja i5 = cfs.mo2736i();
                if (i5.f8673b) {
                    i5.mo4505b();
                    i5.f8673b = false;
                }
                dnb dnb4 = (dnb) i5.f8672a;
                dmy dmy2 = (dmy) l.mo4509g();
                dmy2.getClass();
                dnb4.f8902e = dmy2;
                dnb4.f8898a |= 16;
            }
            if (!this.f7141j && this.f7143l != null) {
                mo3680b();
            }
            this.f7088F.mo2714a(cfs);
            int i6 = this.f7140i;
            String str5 = null;
            if (i6 == 1002 || i6 == 1001) {
                csi csi2 = this.f7085B;
                String str6 = this.f7107Y;
                int i7 = csi2.f7186c;
                if (i7 == 1001) {
                    clv clv2 = csi2.f7189f;
                    if (clv2 != null) {
                        str2 = clv2.f5948h;
                        str3 = clv2.f5950j;
                    } else {
                        str3 = str6;
                        str2 = null;
                    }
                    if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
                        str5 = csi2.f7192i.mo4067a(str2, str3);
                    } else {
                        Log.e("SponsoredProgramControllerHelper", "Error launching direct ad program - both package name and URLs are empty");
                    }
                } else if (i7 == 1002) {
                    clv clv3 = csi2.f7189f;
                    String str7 = clv3 != null ? clv3.f5948h : null;
                    if (!TextUtils.isEmpty(str7)) {
                        dbj dbj = csi2.f7192i;
                        clv clv4 = csi2.f7189f;
                        String str8 = clv4.f5950j;
                        String str9 = clv4.f5949i;
                        if (dcr.m6172c(dbj.f8150a, str7)) {
                            if (TextUtils.isEmpty(str8)) {
                                dcr.m6173d(dbj.f8150a, str7);
                            } else if (!dbj.mo4070b(str7, str8)) {
                                dcr.m6173d(dbj.f8150a, str7);
                            } else {
                                str5 = str8;
                            }
                        } else if (TextUtils.isEmpty(str9)) {
                            dcx.m6182a(dbj.f8150a, str7);
                        } else if (!dbj.mo4069a(str9, false)) {
                            dcx.m6182a(dbj.f8150a, str7);
                        }
                    }
                }
                if (this.f7140i == 1002 && (clv = (csi = this.f7085B).f7189f) != null) {
                    if (!z) {
                        str = clv.f5946f;
                    } else {
                        str = clv.f5947g;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        cll cll = csi.f7190g;
                        cll.f5918c.mo3105a(new clh(cll.f5917b, str));
                    }
                }
            } else if (this.f7128as.mo4068a(this.f7113ad, this.f7107Y, true, view)) {
                str5 = this.f7107Y;
            }
            if (!TextUtils.isEmpty(str5)) {
                Intent putExtra = new Intent("com.google.android.tvrecommendations.PROGRAM_LAUNCH_LOG_EVENT").putExtra("timestamp", currentTimeMillis).putExtra("uri", str5).putExtra("has_preview", z2).putExtra("is_playing_preview", z);
                putExtra.setPackage("com.google.android.tvrecommendations");
                this.f7133b.getContext().sendBroadcast(putExtra);
            }
        }
    }

    /* renamed from: m */
    private final void m5596m() {
        this.f7133b.f6567c.setVisibility(0);
        this.f7133b.f6567c.setImageDrawable(this.f7091I);
    }

    /* renamed from: e */
    public final void mo3684e() {
        this.f7133b.f6567c.setVisibility(0);
        if (this.f7152u == null || this.f7133b.f6568d.getDrawable() == null) {
            this.f7133b.f6567c.setImageDrawable(this.f7091I);
        } else {
            this.f7133b.f6567c.setImageDrawable(this.f7152u);
        }
    }

    /* renamed from: a */
    public final void mo3674a(float f) {
        this.f7153v = f;
        this.f7133b.f6566b.setAlpha(f);
        this.f7133b.f6574j.setAlpha(this.f7153v);
        this.f7133b.f6573i.setAlpha(this.f7153v);
        this.f7133b.f6572h.setAlpha(this.f7153v);
        if (mo3679a()) {
            this.f7134c.mo3429a(1.0f - this.f7153v);
        }
    }

    /* renamed from: c */
    public final void mo3682c() {
        this.f7133b.removeCallbacks(this.f7129at);
        this.f7133b.postDelayed(this.f7129at, 1250);
        this.f7109a.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo3680b() {
        this.f7133b.removeCallbacks(this.f7086C);
        dbv dbv = this.f7137f;
        if (dbv != null) {
            dbv.mo4078a();
        }
        this.f7109a.setVisibility(4);
        this.f7135d.setVisibility(8);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cfs.<init>(int, char):void
     arg types: [int, int]
     candidates:
      cfs.<init>(int, byte):void
      cfs.<init>(int, char):void */
    /* renamed from: a */
    public final void mo3678a(boolean z, int i) {
        if (this.f7148q != 0) {
            int elapsedRealtime = (int) ((SystemClock.elapsedRealtime() - this.f7148q) / 1000);
            this.f7119aj = elapsedRealtime;
            if (elapsedRealtime > 0) {
                cfs cfs = new cfs(9, 0);
                dja i2 = cfs.mo2736i();
                dja l = dmy.f8886d.mo4516l();
                long j = this.f7148q;
                if (l.f8673b) {
                    l.mo4505b();
                    l.f8673b = false;
                }
                dmy dmy = (dmy) l.f8672a;
                int i3 = dmy.f8887a | 4;
                dmy.f8887a = i3;
                dmy.f8888b = j;
                int i4 = this.f7119aj;
                dmy.f8887a = i3 | 8;
                dmy.f8889c = i4;
                if (i2.f8673b) {
                    i2.mo4505b();
                    i2.f8673b = false;
                }
                dnb dnb = (dnb) i2.f8672a;
                dmy dmy2 = (dmy) l.mo4509g();
                dnb dnb2 = dnb.f8897j;
                dmy2.getClass();
                dnb.f8902e = dmy2;
                dnb.f8898a |= 16;
                this.f7088F.mo2714a(cfs);
            }
            this.f7148q = 0;
        }
        this.f7133b.removeCallbacks(this.f7129at);
        this.f7109a.setVisibility(4);
        if (this.f7153v == 1.0f) {
            mo3675a(i);
        } else if (z) {
            ValueAnimator valueAnimator = this.f7155x;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.f7154w;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.f7154w.cancel();
                    this.f7154w = null;
                }
                if (this.f7125ap == null) {
                    this.f7125ap = new crp(this, i);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f7153v, 1.0f);
                this.f7155x = ofFloat;
                ofFloat.addUpdateListener(mo3687h());
                this.f7155x.addListener(this.f7125ap);
                this.f7155x.setDuration(300L);
                this.f7155x.start();
            }
        } else {
            this.f7133b.f6566b.setVisibility(0);
            mo3674a(1.0f);
            mo3675a(i);
        }
    }

    /* renamed from: d */
    public final void mo3683d() {
        this.f7133b.removeCallbacks(this.f7130au);
    }

    public final String toString() {
        String programView = this.f7133b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(programView).length() + 12 + String.valueOf((Object) null).length());
        sb.append('{');
        sb.append(programView);
        sb.append(", title='null'}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo3686g() {
        Double d;
        double d2;
        int i;
        float f;
        float f2;
        int i2;
        m5592c(this.f7102T);
        boolean z = this.f7138g;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7133b.getLayoutParams();
        if (!z) {
            d = this.f7118ai;
        } else {
            d = this.f7117ah;
        }
        double doubleValue = d.doubleValue();
        if (marginLayoutParams.height > 0) {
            double d3 = (double) marginLayoutParams.width;
            double d4 = (double) marginLayoutParams.height;
            Double.isNaN(d3);
            Double.isNaN(d4);
            d2 = d3 / d4;
        } else {
            d2 = 0.0d;
        }
        if (Math.abs(doubleValue - d2) > 0.001d) {
            double d5 = (double) marginLayoutParams.height;
            Double.isNaN(d5);
            marginLayoutParams.width = (int) Math.round(d5 * doubleValue);
            this.f7133b.setLayoutParams(marginLayoutParams);
        }
        int i3 = -1;
        if (marginLayoutParams.width > 0 && this.f7118ai.doubleValue() != 0.0d) {
            if (z) {
                double d6 = (double) marginLayoutParams.width;
                double doubleValue2 = this.f7118ai.doubleValue();
                Double.isNaN(d6);
                i2 = (int) Math.round(d6 / doubleValue2);
            } else {
                i2 = -1;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f7133b.f6567c.getLayoutParams();
            if (i2 != marginLayoutParams2.height) {
                marginLayoutParams2.height = i2;
                this.f7133b.f6567c.setLayoutParams(marginLayoutParams2);
            }
        }
        boolean z2 = this.f7138g;
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f7133b.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.f7133b.f6568d.getLayoutParams();
        int i4 = marginLayoutParams4.height;
        int i5 = marginLayoutParams4.width;
        if (!z2 || !this.f7120ak) {
            i = -1;
        } else if (marginLayoutParams3.height > 0) {
            int i6 = marginLayoutParams3.height;
            int i7 = this.f7093K;
            i3 = i6 - (i7 + i7);
            double d7 = (double) i3;
            double doubleValue3 = this.f7118ai.doubleValue();
            Double.isNaN(d7);
            i = (int) Math.round(d7 * doubleValue3);
        } else {
            i3 = i4;
            i = i5;
        }
        if (!(marginLayoutParams4.height == i3 && marginLayoutParams4.width == i)) {
            marginLayoutParams4.height = i3;
            marginLayoutParams4.width = i;
            this.f7133b.f6568d.setLayoutParams(marginLayoutParams4);
        }
        if (this.f7138g && this.f7120ak) {
            mo3684e();
        } else if (!dcy.m6195d(this.f7133b.getContext())) {
            mo3685f();
        }
        boolean z3 = this.f7138g;
        if (dcy.m6195d(this.f7133b.getContext())) {
            int i8 = this.f7133b.getLayoutParams().width;
            int i9 = this.f7133b.getLayoutParams().height;
            if (i8 <= 0 || i9 <= 0) {
                i8 = this.f7133b.getWidth();
                i9 = this.f7133b.getHeight();
            }
            if (i8 > 0 && i9 > 0) {
                if (this.f7133b.getLayoutDirection() != 1) {
                    i8 = 0;
                }
                this.f7133b.setPivotX((float) i8);
                this.f7133b.setPivotY((float) (i9 >> 1));
            }
            if (z3) {
                f = this.f7090H.f7414o;
            } else {
                f = 1.0f;
            }
            if (z3) {
                f2 = this.f7090H.f7415p;
            } else {
                f2 = 0.0f;
            }
            this.f7133b.setScaleX(f);
            this.f7133b.setScaleY(f);
            this.f7133b.setElevation(f2);
        }
        m5591a(this.f7138g);
    }

    /* renamed from: a */
    private final void m5591a(boolean z) {
        boolean z2;
        Double d;
        int i = this.f7102T;
        if (i != 4 || !m5593j()) {
            this.f7133b.mo3403b(4);
            this.f7133b.mo3404c(4);
        } else {
            this.f7133b.mo3403b(0);
            this.f7133b.mo3404c(0);
        }
        if (!this.f7139h && this.f7108Z) {
            if (!z) {
                d = this.f7118ai;
            } else {
                d = this.f7117ah;
            }
            double doubleValue = d.doubleValue();
            if (i != 4) {
                this.f7133b.mo3405d(4);
                this.f7133b.mo3406e(4);
                z2 = false;
            } else if (Double.compare(doubleValue, 0.6666666666666666d) > 0) {
                this.f7133b.mo3405d(0);
                this.f7133b.mo3406e(4);
                z2 = false;
            } else {
                this.f7133b.mo3405d(4);
                this.f7133b.mo3406e(0);
                z2 = true;
            }
        } else {
            this.f7133b.mo3405d(8);
            this.f7133b.mo3406e(8);
            z2 = false;
        }
        if (!m5594k()) {
            this.f7133b.mo3407f(8);
        } else if (i == 4 && !z2) {
            this.f7133b.mo3407f(0);
        } else {
            this.f7133b.mo3407f(4);
        }
    }

    /* renamed from: l */
    private final void m5595l() {
        int i = this.f7102T;
        if (!(i == 0 || i == 1)) {
            if (i == 2) {
                this.f7133b.mo3402a(2);
                return;
            } else if (!(i == 6 || i == 11 || i == 13 || i == 8 || i == 9)) {
                this.f7133b.mo3402a(0);
                return;
            }
        }
        this.f7133b.mo3402a(1);
    }

    /* renamed from: c */
    private final void m5592c(int i) {
        this.f7102T = i;
        boolean z = false;
        if (i == 4 && this.f7133b.isFocused()) {
            z = true;
        }
        this.f7138g = z;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ab  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3676a(p000.cxu r12) {
        /*
            r11 = this;
            long r0 = java.lang.System.currentTimeMillis()
            boolean r2 = r11.f7108Z
            r3 = 1
            r4 = 0
            r6 = 0
            if (r2 == 0) goto L_0x0050
            long r7 = r11.f7110aa
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0050
            long r9 = r11.f7111ab
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0050
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0050
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x004f
            com.google.android.tvlauncher.home.view.ProgramView r2 = r11.f7133b
            android.widget.ProgressBar r2 = r2.f6572h
            r2.setMin(r6)
            long r7 = r11.f7111ab
            long r9 = r11.f7110aa
            long r7 = r7 - r9
            int r8 = (int) r7
            r2.setMax(r8)
            long r7 = r11.f7110aa
            long r0 = r0 - r7
            int r1 = (int) r0
            r2.setProgress(r1)
            android.content.res.ColorStateList r0 = r11.f7099Q
            r2.setProgressTintList(r0)
            com.google.android.tvlauncher.home.view.ProgramView r0 = r11.f7133b
            java.lang.Runnable r1 = r11.f7130au
            r0.removeCallbacks(r1)
            com.google.android.tvlauncher.home.view.ProgramView r0 = r11.f7133b
            java.lang.Runnable r1 = r11.f7130au
            r7 = 60000(0xea60, double:2.9644E-319)
            r0.postDelayed(r1, r7)
            r0 = 1
            goto L_0x0051
        L_0x004f:
        L_0x0050:
            r0 = 0
        L_0x0051:
            if (r0 != 0) goto L_0x008e
            boolean r0 = r11.f7141j
            if (r0 == 0) goto L_0x008c
            long r0 = r12.mo3025x()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x008c
            long r0 = r12.mo2987D()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x008c
            int r0 = r12.mo2997N()
            if (r0 != 0) goto L_0x008b
            com.google.android.tvlauncher.home.view.ProgramView r0 = r11.f7133b
            android.widget.ProgressBar r0 = r0.f6572h
            r0.setMin(r6)
            long r1 = r12.mo3025x()
            int r2 = (int) r1
            r0.setMax(r2)
            long r1 = r12.mo2987D()
            int r12 = (int) r1
            r0.setProgress(r12)
            android.content.res.ColorStateList r12 = r11.f7100R
            r0.setProgressTintList(r12)
            r0 = 1
            goto L_0x008f
        L_0x008b:
        L_0x008c:
            r0 = 0
            goto L_0x008f
        L_0x008e:
        L_0x008f:
            com.google.android.tvlauncher.home.view.ProgramView r12 = r11.f7133b
            android.view.View r12 = r12.f6573i
            r1 = 8
            if (r0 == 0) goto L_0x009f
            boolean r2 = r11.m5593j()
            if (r2 != 0) goto L_0x009f
            r2 = 0
            goto L_0x00a1
        L_0x009f:
            r2 = 8
        L_0x00a1:
            r12.setVisibility(r2)
            com.google.android.tvlauncher.home.view.ProgramView r12 = r11.f7133b
            android.widget.ProgressBar r12 = r12.f6572h
            if (r0 != 0) goto L_0x00ab
            goto L_0x00ad
        L_0x00ab:
            r1 = 0
        L_0x00ad:
            r12.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.crz.mo3676a(cxu):void");
    }

    /* renamed from: n */
    private final void m5597n() {
        dhz.m6480a(this.f7133b, this.f7102T, this.f7118ai.doubleValue(), this.f7090H);
    }
}
