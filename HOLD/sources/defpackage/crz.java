package defpackage;

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

/* renamed from: crz  reason: default package */
/* compiled from: PG */
public final class crz implements View.OnClickListener, View.OnLongClickListener, dav, cuz, cez {
    private static boolean E = false;
    public csf A;
    public final csi B;
    public final Runnable C;
    public final dlk D;
    private final cfp F;
    private final MeasureFormat G;
    private final ctq H;
    private final ColorDrawable I;
    private final int J;
    private final int K;
    private final String L;
    private final String M;
    private final String N;
    private final String O;
    private dcw P;
    private final ColorStateList Q;
    private final ColorStateList R;
    private String S;
    private int T;
    private long U;
    private long V;
    private boolean W;
    private boolean X;
    private String Y;
    private boolean Z;
    public final View a;
    private long aa;
    private long ab;
    private long ac;
    private String ad;
    private String ae;
    private String af;
    private String ag;
    private Double ah;
    private Double ai;
    private int aj;
    private boolean ak;
    private ctm al;
    private ctm am;
    private ctm an;
    private ValueAnimator.AnimatorUpdateListener ao;
    private Animator.AnimatorListener ap;
    private final boolean aq;
    private final boolean ar;
    private final dbj as;
    private final Runnable at;
    private final Runnable au;
    private final View.OnFocusChangeListener av;
    private final agj aw;
    public final ProgramView b;
    public final InstantVideoView c;
    public final View d;
    public final ImageView e;
    public dbv f;
    public boolean g;
    public boolean h;
    public int i;
    public boolean j;
    public String k;
    public String l;
    public String m;
    public crl n;
    public csa o;
    public cey p;
    public long q;
    public daw r;
    public final SharedPreferences s;
    public pp t;
    public BitmapDrawable u;
    public float v;
    public ValueAnimator w;
    public ValueAnimator x;
    public Animator.AnimatorListener y;
    public csf z;

    private final boolean j() {
        if (this.h || this.af == null) {
            return false;
        }
        int i2 = this.i;
        return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5 || i2 == 6;
    }

    private final boolean k() {
        if (!this.h) {
            long j2 = this.ac;
            return j2 >= 1000 && j2 / 3600000 <= 99 && this.i == 4;
        }
    }

    public crz(ProgramView programView, cfp cfp, boolean z2, boolean z3) {
        csi csi;
        ctq ctq;
        if (z2) {
            csi = new csi(programView);
        } else {
            csi = null;
        }
        this.j = false;
        this.v = 1.0f;
        this.D = new crr(this);
        this.C = new crt(this);
        this.at = new cru(this);
        this.au = new crv(this);
        this.av = new crw(this);
        this.b = programView;
        this.F = cfp;
        this.aq = z2;
        this.ar = z3;
        this.B = csi;
        Context context = programView.getContext();
        this.as = ((cgg) context.getApplicationContext()).e();
        programView.setOutlineProvider(new crx());
        programView.setClipToOutline(true);
        programView.setOnClickListener(this);
        programView.setOnLongClickListener(this);
        this.b.a = this;
        this.s = context.getSharedPreferences("com.google.android.tvlauncher.data.TvDataManager.PREVIEW_VIDEO_PREF_FILE_NAME", 0);
        if (this.aq) {
            Resources resources = programView.getContext().getResources();
            ctq = new ctq();
            ctq.a = resources.getDimensionPixelSize(R.dimen.program_default_height);
            ctq.b = resources.getDimensionPixelSize(R.dimen.program_default_margin_top);
            ctq.c = resources.getDimensionPixelSize(R.dimen.program_default_margin_bottom);
            ctq.d = resources.getDimensionPixelSize(R.dimen.program_default_margin_horizontal);
            ctq.e = resources.getDimensionPixelSize(R.dimen.program_default_top_height);
            ctq.f = resources.getDimensionPixelSize(R.dimen.program_default_top_margin_top);
            ctq.g = resources.getDimensionPixelSize(R.dimen.program_default_top_margin_bottom);
            ctq.h = resources.getDimensionPixelSize(R.dimen.program_default_top_margin_bottom);
            ctq.i = resources.getDimensionPixelSize(R.dimen.sponsored_program_selected_height);
            ctq.j = resources.getDimensionPixelSize(R.dimen.sponsored_program_selected_margin_vertical);
            ctq.k = resources.getDimensionPixelSize(R.dimen.program_zoomed_out_height);
            ctq.l = resources.getDimensionPixelSize(R.dimen.program_zoomed_out_margin_vertical);
            ctq.m = resources.getDimensionPixelSize(R.dimen.program_zoomed_out_margin_horizontal);
            ctq.n = resources.getInteger(R.integer.program_focused_animation_duration_ms);
            ctq.o = resources.getFraction(R.fraction.sponsored_program_focused_scale, 1, 1);
            ctq.p = resources.getDimension(R.dimen.program_focused_elevation);
        } else {
            ctq = dhz.b(programView.getContext());
        }
        this.H = ctq;
        if (!E) {
            si.a(context).c.a(Bitmap.class, ctn.class, new ctp(context));
            E = true;
        }
        InstantVideoView instantVideoView = (InstantVideoView) programView.findViewById(R.id.preview_video_view);
        this.c = instantVideoView;
        instantVideoView.a(false);
        this.d = programView.findViewById(R.id.preview_audio_container);
        this.e = (ImageView) programView.findViewById(R.id.thumbnail);
        this.G = MeasureFormat.getInstance(Locale.getDefault(), MeasureFormat.FormatWidth.WIDE);
        this.a = programView.findViewById(R.id.preview_delay_overlay);
        if (dcy.d(context)) {
            this.b.setOnFocusChangeListener(this.av);
        } else {
            ctq ctq2 = this.H;
            dcw dcw = new dcw(ctq2.n, ctq2.o, ctq2.p, 1);
            this.P = dcw;
            dcw.a(programView);
            this.P.d = this.av;
        }
        int color = context.getColor(R.color.program_default_background);
        this.J = color;
        this.I = new ColorDrawable(color);
        this.K = this.b.getResources().getDimensionPixelOffset(R.dimen.program_preview_image_expanded_vertical_margin);
        int i2 = this.H.i;
        agj agj = new agj((byte) 0);
        double d2 = (double) i2;
        Double.isNaN(d2);
        this.aw = agj.a(((int) (d2 * 1.7777777777777777d)) + 20, i2).d().a((ub) new dae(this.J, false));
        this.L = context.getString(R.string.program_menu_add_to_play_next_text);
        this.M = context.getString(R.string.program_menu_remove_text);
        this.N = context.getString(R.string.program_menu_add_to_play_next_not_available_text);
        this.O = context.getString(R.string.program_menu_already_in_play_next_text);
        this.Q = ColorStateList.valueOf(this.b.getContext().getColor(R.color.program_playback_live_progress_bar_foreground_color));
        this.R = ColorStateList.valueOf(this.b.getContext().getColor(R.color.program_playback_watch_next_progress_bar_foreground_color));
        if (!this.aq) {
            return;
        }
        if (this.ar) {
            this.S = context.getString(R.string.sponsored_channel_branding, "Google Play");
            return;
        }
        this.S = context.getString(R.string.sponsored_channel_unbranded_logo_title);
    }

    public final boolean a() {
        return !this.h && this.s.getBoolean("enable_preview_audio_key", true);
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
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.cxu r20, java.lang.String r21, int r22, boolean r23, boolean r24, boolean r25) {
        /*
            r19 = this;
            r1 = r19
            daw r0 = r1.r
            if (r0 == 0) goto L_0x000e
            boolean r2 = r0.o
            if (r2 != 0) goto L_0x000b
            goto L_0x000e
        L_0x000b:
            r0.a()
        L_0x000e:
            boolean r0 = r1.j
            if (r0 != 0) goto L_0x0015
            r0 = r21
            goto L_0x0019
        L_0x0015:
            java.lang.String r0 = r20.O()
        L_0x0019:
            r1.ad = r0
            r0 = r22
            r1.c(r0)
            r0 = r23
            r1.W = r0
            r0 = r24
            r1.X = r0
            r0 = r25
            r1.h = r0
            long r2 = r20.a()
            r1.U = r2
            long r2 = r20.b()
            r1.V = r2
            java.lang.String r0 = r20.E()
            r1.ae = r0
            int r0 = r20.c()
            r1.i = r0
            r2 = 4
            r3 = 1001(0x3e9, float:1.403E-42)
            r4 = 1002(0x3ea, float:1.404E-42)
            if (r0 != r4) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            if (r0 != r3) goto L_0x0058
        L_0x004e:
            boolean r5 = r1.aq
            if (r5 == 0) goto L_0x0053
            goto L_0x0058
        L_0x0053:
            r1.i = r2
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
            csi r3 = r1.B
            long r11 = r20.a()
            r3.b = r11
            int r0 = r20.c()
            r3.c = r0
            java.lang.String r0 = r20.P()
            r3.d = r0
            r3.b()
            java.lang.String r0 = r3.d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01a8
            byte[] r4 = r20.Q()
            if (r4 == 0) goto L_0x00aa
            dis r0 = defpackage.dis.b()     // Catch:{ djn -> 0x0095 }
            cmc r11 = defpackage.cmc.f     // Catch:{ djn -> 0x0095 }
            dje r0 = defpackage.dje.a(r11, r4, r0)     // Catch:{ djn -> 0x0095 }
            cmc r0 = (defpackage.cmc) r0     // Catch:{ djn -> 0x0095 }
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
            int r4 = r0.b
            if (r4 != r7) goto L_0x012f
            java.lang.Object r4 = r0.c
            cmj r4 = (defpackage.cmj) r4
            int r6 = r4.b
            if (r6 == r7) goto L_0x00e1
            if (r6 == r2) goto L_0x00dc
            java.lang.String r0 = defpackage.dcr.a(r0)
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
            coc r0 = defpackage.coe.a(r0)
            goto L_0x0132
        L_0x00e1:
            java.lang.Object r4 = r4.c
            cmg r4 = (defpackage.cmg) r4
            int r6 = r4.b
            r11 = 5
            if (r6 == r11) goto L_0x0100
            java.lang.Object[] r4 = new java.lang.Object[r8]
            java.lang.String r0 = defpackage.dcr.a(r0)
            r4[r9] = r0
            java.lang.String r0 = "createVastVideoAd: a non-app install ad passed: %s"
            java.lang.String r0 = java.lang.String.format(r0, r4)
            java.lang.String r4 = "CustomCreativeVideoAdFactory"
            android.util.Log.e(r4, r0)
            r0 = r10
            goto L_0x0132
        L_0x0100:
            java.lang.Object r6 = r4.c
            cmd r6 = (defpackage.cmd) r6
            clu r11 = new clu
            r11.<init>(r9)
            r11.l = r0
            java.lang.String r0 = r4.d
            r11.a = r0
            java.lang.String r0 = r4.e
            r11.b = r0
            java.lang.String r0 = r4.f
            r11.c = r0
            r11.d = r10
            java.lang.String r0 = r4.g
            r11.f = r0
            java.lang.String r0 = r6.b
            r11.h = r0
            java.lang.String r0 = r6.c
            r11.i = r0
            java.lang.String r0 = r6.d
            r11.j = r0
            cma r0 = new cma
            r0.<init>(r11)
            goto L_0x0132
        L_0x012f:
        L_0x0130:
        L_0x0131:
            r0 = r10
        L_0x0132:
            r3.f = r0
            boolean r0 = r3.a()
            r3.e = r0
            if (r0 == 0) goto L_0x01ad
            clf r0 = r3.j
            java.lang.String r4 = r3.d
            clv r6 = r3.f
            java.util.List r6 = r6.d
            java.lang.String r11 = r0.a
            boolean r11 = android.text.TextUtils.equals(r11, r4)
            if (r11 == 0) goto L_0x0158
            java.util.List r11 = r0.c
            boolean r11 = r6.equals(r11)
            if (r11 != 0) goto L_0x0156
            r11 = 1
            goto L_0x0159
        L_0x0156:
        L_0x0158:
            r11 = 0
        L_0x0159:
            r0.b = r11
            if (r11 == 0) goto L_0x0161
            r11 = -1
            r0.d = r11
        L_0x0161:
            r0.c = r6
            r0.a = r4
            clv r0 = r3.f
            java.lang.String r0 = r0.c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0194
            clv r0 = r3.f
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
            java.lang.String r0 = r3.l
            clv r4 = r3.f
            java.lang.String r4 = r4.c
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 != 0) goto L_0x01ad
            android.os.Handler r0 = r3.h
            java.lang.Runnable r4 = r3.m
            r0.post(r4)
            goto L_0x01ad
        L_0x01a8:
            r3.f = r10
            r3.e = r9
        L_0x01ad:
            clv r0 = r3.f
            if (r0 != 0) goto L_0x01b4
            r0 = 0
            goto L_0x024b
        L_0x01b4:
            goto L_0x024a
        L_0x01b6:
            if (r0 != r3) goto L_0x0249
            csi r3 = r1.B
            long r11 = r20.a()
            r3.b = r11
            int r0 = r20.c()
            r3.c = r0
            r3.d = r10
            byte[] r4 = r20.Q()
            if (r4 == 0) goto L_0x0211
            cmc r0 = defpackage.cmc.f     // Catch:{ djn -> 0x01fc }
            dja r0 = r0.l()     // Catch:{ djn -> 0x01fc }
            dis r11 = defpackage.dis.b()     // Catch:{ djn -> 0x01fc }
            cmh r12 = defpackage.cmh.d     // Catch:{ djn -> 0x01fc }
            dje r11 = defpackage.dje.a(r12, r4, r11)     // Catch:{ djn -> 0x01fc }
            cmh r11 = (defpackage.cmh) r11     // Catch:{ djn -> 0x01fc }
            boolean r12 = r0.b     // Catch:{ djn -> 0x01fc }
            if (r12 != 0) goto L_0x01e5
            goto L_0x01ea
        L_0x01e5:
            r0.b()     // Catch:{ djn -> 0x01fc }
            r0.b = r9     // Catch:{ djn -> 0x01fc }
        L_0x01ea:
            dje r12 = r0.a     // Catch:{ djn -> 0x01fc }
            cmc r12 = (defpackage.cmc) r12     // Catch:{ djn -> 0x01fc }
            r11.getClass()     // Catch:{ djn -> 0x01fc }
            r12.c = r11     // Catch:{ djn -> 0x01fc }
            r12.b = r8     // Catch:{ djn -> 0x01fc }
            dje r0 = r0.g()     // Catch:{ djn -> 0x01fc }
            cmc r0 = (defpackage.cmc) r0     // Catch:{ djn -> 0x01fc }
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
            int r4 = r0.b
            if (r4 != r8) goto L_0x0238
            java.lang.Object r4 = r0.c
            cmh r4 = (defpackage.cmh) r4
            clu r5 = new clu
            r5.<init>(r9)
            java.lang.String r6 = r4.b
            r5.h = r6
            java.lang.String r4 = r4.c
            r5.i = r4
            r5.j = r4
            r5.l = r0
            cln r0 = new cln
            r0.<init>(r5)
            r3.f = r0
            r0 = 1
            goto L_0x024b
        L_0x0238:
            java.lang.String r0 = "AdAsset for a DirectAd does not contain any DirectAd configuration."
            android.util.Log.e(r5, r0)
            r3.f = r10
            r0 = 1
            goto L_0x024b
        L_0x0243:
            r3.f = r10
            r0 = 1
            goto L_0x024b
        L_0x0249:
        L_0x024a:
            r0 = 1
        L_0x024b:
            java.lang.String r3 = r20.j()
            r1.k = r3
            com.google.android.tvlauncher.instantvideo.widget.InstantVideoView r3 = r1.c
            android.net.Uri r3 = r3.c
            if (r3 == 0) goto L_0x025c
            java.lang.String r3 = r3.toString()
            goto L_0x025e
        L_0x025c:
            r3 = r10
        L_0x025e:
            if (r3 == 0) goto L_0x026d
            java.lang.String r4 = r1.k
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0269
            goto L_0x026d
        L_0x0269:
            r1.a(r9, r9)
        L_0x026d:
            java.lang.String r3 = r1.k
            if (r3 == 0) goto L_0x027a
            com.google.android.tvlauncher.instantvideo.widget.InstantVideoView r4 = r1.c
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r4.c = r3
            goto L_0x027e
        L_0x027a:
            com.google.android.tvlauncher.instantvideo.widget.InstantVideoView r3 = r1.c
            r3.c = r10
        L_0x027e:
            int r3 = r1.i
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
            r1.l = r10
            goto L_0x029d
        L_0x0297:
            java.lang.String r3 = r20.k()
            r1.l = r3
        L_0x029d:
            java.lang.String r3 = r1.l
            if (r3 != 0) goto L_0x02a8
            dbv r3 = r1.f
            if (r3 == 0) goto L_0x02d0
            r3.b = r10
            goto L_0x02d0
        L_0x02a8:
            dbv r3 = r1.f
            if (r3 == 0) goto L_0x02ad
            goto L_0x02b4
        L_0x02ad:
            dbv r3 = new dbv
            r3.<init>()
            r1.f = r3
        L_0x02b4:
            java.lang.String r3 = r1.l
            dbv r4 = r1.f
            java.lang.String r4 = r4.b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x02d0
            dbv r3 = r1.f
            java.lang.String r3 = r3.b
            if (r3 != 0) goto L_0x02c7
            goto L_0x02ca
        L_0x02c7:
            r19.b()
        L_0x02ca:
            dbv r3 = r1.f
            java.lang.String r4 = r1.l
            r3.b = r4
        L_0x02d0:
            r1.aj = r9
            java.lang.String r3 = r20.l()
            r1.Y = r3
            long r3 = r20.x()
            r1.ac = r3
            boolean r3 = r20.H()
            r1.Z = r3
            r11 = 0
            if (r3 == 0) goto L_0x02ee
            long r3 = r20.I()
            goto L_0x02f0
        L_0x02ee:
            r3 = r11
        L_0x02f0:
            r1.aa = r3
            boolean r3 = r1.Z
            if (r3 == 0) goto L_0x02fb
            long r3 = r20.J()
            goto L_0x02fd
        L_0x02fb:
            r3 = r11
        L_0x02fd:
            r1.ab = r3
            int r3 = r20.g()
            double r3 = defpackage.dhz.a(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r1.ai = r3
            r1.m = r10
            r1.ah = r10
            boolean r3 = r1.j
            if (r3 != 0) goto L_0x038c
            java.lang.String r3 = r1.k
            if (r3 == 0) goto L_0x0364
            int r3 = r20.K()
            int r4 = r20.L()
            if (r3 > 0) goto L_0x0324
            goto L_0x0354
        L_0x0324:
            if (r4 <= 0) goto L_0x0354
            double r13 = (double) r3
            double r3 = (double) r4
            java.lang.Double.isNaN(r13)
            java.lang.Double.isNaN(r3)
            double r13 = r13 / r3
            java.lang.Double r3 = r1.ai
            double r3 = r3.doubleValue()
            int r6 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x033e
            java.lang.Double r3 = r1.ai
            r1.ah = r3
            goto L_0x0354
        L_0x033e:
            java.lang.Double r3 = r1.ai
            double r3 = r3.doubleValue()
            int r6 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r6 > 0) goto L_0x0354
            r3 = 4616189618054758400(0x4010000000000000, double:4.0)
            int r6 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x0354
            java.lang.Double r3 = java.lang.Double.valueOf(r13)
            r1.ah = r3
        L_0x0354:
            java.lang.Double r3 = r1.ah
            if (r3 != 0) goto L_0x038c
            r3 = 4610685218510194460(0x3ffc71c71c71c71c, double:1.7777777777777777)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r1.ah = r3
            goto L_0x038c
        L_0x0364:
            java.lang.String r3 = r20.h()
            r1.m = r3
            if (r3 == 0) goto L_0x038c
            int r3 = r20.i()
            double r3 = defpackage.dhz.a(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r1.ah = r3
            double r3 = r3.doubleValue()
            java.lang.Double r6 = r1.ai
            double r13 = r6.doubleValue()
            int r6 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r6 >= 0) goto L_0x038c
            java.lang.Double r3 = r1.ai
            r1.ah = r3
        L_0x038c:
            java.lang.Double r3 = r1.ah
            if (r3 != 0) goto L_0x0394
            java.lang.Double r3 = r1.ai
            r1.ah = r3
        L_0x0394:
            java.lang.String r3 = r1.k
            if (r3 == 0) goto L_0x03b5
            java.lang.Double r3 = r1.ai
            double r3 = r3.doubleValue()
            java.lang.Double r6 = r1.ah
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
            r1.ak = r3
            r1.u = r10
            com.google.android.tvlauncher.home.view.ProgramView r3 = r1.b
            android.content.Context r3 = r3.getContext()
            boolean r3 = defpackage.dcy.d(r3)
            if (r3 != 0) goto L_0x03cb
            dcw r3 = r1.P
            r3.a()
        L_0x03cb:
            r19.n()
            r19.g()
            if (r0 == 0) goto L_0x0449
            com.google.android.tvlauncher.home.view.ProgramView r0 = r1.b
            android.widget.ImageView r0 = r0.d
            java.lang.String r3 = r20.d()
            r0.setContentDescription(r3)
            java.lang.String r0 = r20.f()
            r19.m()
            r1.t = r10
            r1.u = r10
            boolean r3 = r1.ak
            if (r3 == 0) goto L_0x041b
            com.google.android.tvlauncher.home.view.ProgramView r3 = r1.b
            android.content.Context r3 = r3.getContext()
            sx r3 = defpackage.si.c(r3)
            java.lang.Class<ctn> r4 = defpackage.ctn.class
            su r3 = r3.a(r4)
            r3.a(r0)
            agj r0 = r1.aw
            su r0 = r3.b(r0)
            ctm r3 = r1.am
            if (r3 != 0) goto L_0x0415
            cry r3 = new cry
            com.google.android.tvlauncher.home.view.ProgramView r4 = r1.b
            android.widget.ImageView r4 = r4.d
            r3.<init>(r1, r4)
            r1.am = r3
        L_0x0415:
            ctm r3 = r1.am
            r0.a(r3)
            goto L_0x044c
        L_0x041b:
            com.google.android.tvlauncher.home.view.ProgramView r3 = r1.b
            android.content.Context r3 = r3.getContext()
            sx r3 = defpackage.si.c(r3)
            java.lang.Class<dcz> r4 = defpackage.dcz.class
            su r3 = r3.a(r4)
            r3.a(r0)
            agj r0 = r1.aw
            su r0 = r3.b(r0)
            ctm r3 = r1.al
            if (r3 != 0) goto L_0x0443
            crm r3 = new crm
            com.google.android.tvlauncher.home.view.ProgramView r4 = r1.b
            android.widget.ImageView r4 = r4.d
            r3.<init>(r1, r4)
            r1.al = r3
        L_0x0443:
            ctm r3 = r1.al
            r0.a(r3)
            goto L_0x044c
        L_0x0449:
            r19.m()
        L_0x044c:
            boolean r0 = r1.aq
            if (r0 == 0) goto L_0x0459
            com.google.android.tvlauncher.home.view.ProgramView r0 = r1.b
            android.widget.ImageView r0 = r0.d
            java.lang.String r3 = r1.S
            r0.setContentDescription(r3)
        L_0x0459:
            r19.l()
            android.widget.ImageView r0 = r1.e
            r0.setVisibility(r5)
            java.lang.String r0 = r1.m
            if (r0 != 0) goto L_0x0472
            android.widget.ImageView r0 = r1.e
            r0.setImageDrawable(r10)
            com.google.android.tvlauncher.home.view.ProgramView r0 = r1.b
            android.view.View r0 = r0.b
            r0.setVisibility(r9)
            goto L_0x04b6
        L_0x0472:
            android.widget.ImageView r0 = r1.e
            r0.setImageDrawable(r10)
            android.widget.ImageView r0 = r1.e
            android.graphics.drawable.ColorDrawable r3 = r1.I
            r0.setBackground(r3)
            android.widget.ImageView r0 = r1.e
            android.content.Context r0 = r0.getContext()
            sx r0 = defpackage.si.c(r0)
            java.lang.String r3 = r1.m
            su r0 = r0.a(r3)
            agj r3 = r1.aw
            su r0 = r0.b(r3)
            ctm r3 = r1.an
            if (r3 != 0) goto L_0x04a1
            crn r3 = new crn
            android.widget.ImageView r4 = r1.e
            r3.<init>(r4)
            r1.an = r3
        L_0x04a1:
            ctm r3 = r1.an
            r0.a(r3)
            boolean r0 = r1.g
            if (r0 == 0) goto L_0x04b6
            android.widget.ImageView r0 = r1.e
            r0.setVisibility(r9)
            com.google.android.tvlauncher.home.view.ProgramView r0 = r1.b
            android.view.View r0 = r0.b
            r0.setVisibility(r5)
        L_0x04b6:
            java.lang.String r0 = r20.u()
            r1.af = r0
            java.lang.String r0 = r20.v()
            r1.ag = r0
            boolean r0 = r19.j()
            if (r0 != 0) goto L_0x04d0
            com.google.android.tvlauncher.home.view.ProgramView r0 = r1.b
            android.widget.ImageView r0 = r0.k
            r0.setContentDescription(r10)
            goto L_0x04f7
        L_0x04d0:
            com.google.android.tvlauncher.home.view.ProgramView r0 = r1.b
            android.widget.ImageView r0 = r0.k
            r0.setImageDrawable(r10)
            com.google.android.tvlauncher.home.view.ProgramView r0 = r1.b
            android.content.Context r0 = r0.getContext()
            sx r0 = defpackage.si.c(r0)
            java.lang.String r3 = r1.af
            su r0 = r0.a(r3)
            com.google.android.tvlauncher.home.view.ProgramView r3 = r1.b
            android.widget.ImageView r3 = r3.k
            r0.a(r3)
            com.google.android.tvlauncher.home.view.ProgramView r0 = r1.b
            android.widget.ImageView r0 = r0.k
            java.lang.String r3 = r1.ag
            r0.setContentDescription(r3)
        L_0x04f7:
            boolean r0 = r19.k()
            if (r0 == 0) goto L_0x0586
            com.google.android.tvlauncher.home.view.ProgramView r0 = r1.b
            android.widget.TextView r0 = r0.s
            long r3 = r1.ac
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            java.lang.String r3 = android.text.format.DateUtils.formatElapsedTime(r3)
            r0.setText(r3)
            long r3 = r1.ac
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
            android.icu.text.MeasureFormat r5 = r1.G
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
            android.icu.text.MeasureFormat r2 = r1.G
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
            boolean r0 = r1.g
            r1.a(r0)
            r19.a(r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crz.a(cxu, java.lang.String, int, boolean, boolean, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        c(i2);
        l();
        a(this.g);
        n();
    }

    public final void f() {
        if (this.b.d.getDrawable() != null) {
            this.b.c.setVisibility(4);
            this.b.c.setImageDrawable(null);
        }
    }

    public final void a(int i2) {
        csi csi = this.B;
        if (csi != null) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (csi.d()) {
                        csi.c();
                    }
                } else if (csi.d()) {
                    Handler handler = csi.k.d;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 2));
                }
            } else if (csi.d()) {
                csi.c();
            }
        }
        this.c.setVisibility(8);
        this.c.a();
    }

    public final ValueAnimator.AnimatorUpdateListener h() {
        if (this.ao == null) {
            this.ao = new crq(this);
        }
        return this.ao;
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return this.b.isFocused();
    }

    public final void onClick(View view) {
        if (dcy.b(view.getContext())) {
            onLongClick(view);
        } else {
            a(view);
        }
    }

    public final void d(Context context) {
        daw daw = this.r;
        if (daw != null && daw.o) {
            daw.a();
            return;
        }
        cey cey = this.p;
        if (cey != null) {
            cey.c(context);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cfs.<init>(int, char):void
     arg types: [int, int]
     candidates:
      cfs.<init>(int, byte):void
      cfs.<init>(int, char):void */
    public final void a(day day) {
        cla a2 = cla.a(this.b.getContext());
        int i2 = day.a;
        if (i2 == 1) {
            a(this.b);
        } else if (i2 == 2) {
            new ckw(a2, this.U, this.ad).executeOnExecutor(daz.a, new Object[0]);
            String str = this.ae;
            String str2 = this.ad;
            if (!(str == null || str2 == null)) {
                a2.s.add(a2.a(str, str2));
            }
            cfs cfs = new cfs(29, 0);
            if (this.ad != null) {
                dja i3 = cfs.i();
                String str3 = this.ad;
                if (i3.b) {
                    i3.b();
                    i3.b = false;
                }
                dnb dnb = (dnb) i3.a;
                dnb dnb2 = dnb.j;
                str3.getClass();
                dnb.a = 1 | dnb.a;
                dnb.b = str3;
            }
            this.F.a(cfs);
        } else if (i2 == 3) {
            new cku(a2, this.U, this.ad, this.V).executeOnExecutor(daz.a, new Object[0]);
            cfs cfs2 = new cfs(31, 0);
            int d2 = cfs.d(this.i);
            if (d2 != 0) {
                dja i4 = cfs2.i();
                if (i4.b) {
                    i4.b();
                    i4.b = false;
                }
                dnb dnb3 = (dnb) i4.a;
                dnb dnb4 = dnb.j;
                dnb3.c = d2;
                dnb3.a |= 4;
            }
            if (this.ad != null) {
                dja i5 = cfs2.i();
                String str4 = this.ad;
                if (i5.b) {
                    i5.b();
                    i5.b = false;
                }
                dnb dnb5 = (dnb) i5.a;
                dnb dnb6 = dnb.j;
                str4.getClass();
                dnb5.a = 1 | dnb5.a;
                dnb5.b = str4;
            }
            this.F.a(cfs2);
        } else if (i2 == 4) {
            new ckv(a2, this.U, this.ad).executeOnExecutor(daz.a, new Object[0]);
            String str5 = this.ae;
            String str6 = this.ad;
            if (!(str5 == null || str6 == null)) {
                a2.s.remove(a2.a(str5, str6));
            }
            cfs cfs3 = new cfs(30, 0);
            if (!TextUtils.isEmpty(this.ad)) {
                dja i6 = cfs3.i();
                String str7 = this.ad;
                if (i6.b) {
                    i6.b();
                    i6.b = false;
                }
                dnb dnb7 = (dnb) i6.a;
                dnb dnb8 = dnb.j;
                str7.getClass();
                dnb7.a = 1 | dnb7.a;
                dnb7.b = str7;
            }
            this.F.a(cfs3);
        }
    }

    public final boolean onLongClick(View view) {
        csf csf;
        csf csf2;
        boolean z2;
        boolean z3;
        if (!view.hasFocus() || (((csf = this.z) != null && csf.g()) || ((csf2 = this.A) != null && csf2.g()))) {
            return true;
        }
        dck.a(this.b.getContext());
        boolean z4 = false;
        if (this.X) {
            dck.a(this.b.getContext());
            z2 = true;
        } else {
            z2 = false;
        }
        this.r = new daw((Activity) view.getContext(), view, view.getResources().getDimensionPixelSize(R.dimen.card_rounded_corner_radius));
        if (dcy.b(view.getContext())) {
            day day = new day(1, view.getContext().getString(R.string.context_menu_primary_action_text), view.getContext().getDrawable(R.drawable.ic_context_menu_open_black));
            day.a();
            this.r.a(day);
        }
        if (this.j) {
            this.r.a(new day(4, view.getContext().getString(R.string.program_menu_remove_for_play_next_text), view.getContext().getDrawable(R.drawable.ic_context_menu_uninstall_black)));
        } else {
            cla a2 = cla.a(view.getContext());
            String str = this.ae;
            String str2 = this.ad;
            if (str == null || str2 == null) {
                z3 = false;
            } else {
                z3 = a2.s.contains(a2.a(str, str2));
            }
            day day2 = new day(2, null, view.getContext().getDrawable(R.drawable.ic_context_menu_add_to_watch_next_black));
            this.r.a(day2);
            if (this.W && !z3) {
                z4 = true;
            }
            day2.a(z4);
            if (z3) {
                day2.a(this.O);
            } else {
                day2.a(!this.W ? this.N : this.L);
            }
            if (z2) {
                day day3 = new day(3, null, view.getContext().getDrawable(R.drawable.ic_context_menu_uninstall_black));
                this.r.a(day3);
                day3.a(this.M);
            }
        }
        daw daw = this.r;
        daw.f = this;
        daw.b();
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
    private final void a(View view) {
        boolean z2;
        csi csi;
        clv clv;
        String str;
        String str2;
        String str3;
        int i2;
        if (this.Y != null || (i2 = this.i) == 1002 || i2 == 1001) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean z3 = this.k != null && !this.j;
            if (this.q != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            cfs cfs = new cfs(8, (byte) 0);
            cfs.b(dhs.v);
            dja i3 = cfs.i();
            String str4 = this.ad;
            if (i3.b) {
                i3.b();
                i3.b = false;
            }
            dnb dnb = (dnb) i3.a;
            dnb dnb2 = dnb.j;
            str4.getClass();
            dnb.a |= 1;
            dnb.b = str4;
            int d2 = cfs.d(this.i);
            if (d2 != 0) {
                dja i4 = cfs.i();
                if (i4.b) {
                    i4.b();
                    i4.b = false;
                }
                dnb dnb3 = (dnb) i4.a;
                dnb3.c = d2;
                dnb3.a |= 4;
            }
            if (z3) {
                a(true, 0);
                dja l2 = dmy.d.l();
                int i5 = this.aj;
                if (i5 != 0) {
                    if (l2.b) {
                        l2.b();
                        l2.b = false;
                    }
                    dmy dmy = (dmy) l2.a;
                    dmy.a = 8 | dmy.a;
                    dmy.c = i5;
                }
                dja i6 = cfs.i();
                if (i6.b) {
                    i6.b();
                    i6.b = false;
                }
                dnb dnb4 = (dnb) i6.a;
                dmy dmy2 = (dmy) l2.g();
                dmy2.getClass();
                dnb4.e = dmy2;
                dnb4.a |= 16;
            }
            if (!this.j && this.l != null) {
                b();
            }
            this.F.a(cfs);
            int i7 = this.i;
            String str5 = null;
            if (i7 == 1002 || i7 == 1001) {
                csi csi2 = this.B;
                String str6 = this.Y;
                int i8 = csi2.c;
                if (i8 == 1001) {
                    clv clv2 = csi2.f;
                    if (clv2 != null) {
                        str2 = clv2.h;
                        str3 = clv2.j;
                    } else {
                        str3 = str6;
                        str2 = null;
                    }
                    if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
                        str5 = csi2.i.a(str2, str3);
                    } else {
                        Log.e("SponsoredProgramControllerHelper", "Error launching direct ad program - both package name and URLs are empty");
                    }
                } else if (i8 == 1002) {
                    clv clv3 = csi2.f;
                    String str7 = clv3 != null ? clv3.h : null;
                    if (!TextUtils.isEmpty(str7)) {
                        dbj dbj = csi2.i;
                        clv clv4 = csi2.f;
                        String str8 = clv4.j;
                        String str9 = clv4.i;
                        if (dcr.c(dbj.a, str7)) {
                            if (TextUtils.isEmpty(str8)) {
                                dcr.d(dbj.a, str7);
                            } else if (!dbj.b(str7, str8)) {
                                dcr.d(dbj.a, str7);
                            } else {
                                str5 = str8;
                            }
                        } else if (TextUtils.isEmpty(str9)) {
                            dcx.a(dbj.a, str7);
                        } else if (!dbj.a(str9, false)) {
                            dcx.a(dbj.a, str7);
                        }
                    }
                }
                if (this.i == 1002 && (clv = (csi = this.B).f) != null) {
                    if (!z2) {
                        str = clv.f;
                    } else {
                        str = clv.g;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        cll cll = csi.g;
                        cll.c.a(new clh(cll.b, str));
                    }
                }
            } else if (this.as.a(this.ad, this.Y, true, view)) {
                str5 = this.Y;
            }
            if (!TextUtils.isEmpty(str5)) {
                Intent putExtra = new Intent("com.google.android.tvrecommendations.PROGRAM_LAUNCH_LOG_EVENT").putExtra("timestamp", currentTimeMillis).putExtra("uri", str5).putExtra("has_preview", z3).putExtra("is_playing_preview", z2);
                putExtra.setPackage("com.google.android.tvrecommendations");
                this.b.getContext().sendBroadcast(putExtra);
            }
        }
    }

    private final void m() {
        this.b.c.setVisibility(0);
        this.b.c.setImageDrawable(this.I);
    }

    public final void e() {
        this.b.c.setVisibility(0);
        if (this.u == null || this.b.d.getDrawable() == null) {
            this.b.c.setImageDrawable(this.I);
        } else {
            this.b.c.setImageDrawable(this.u);
        }
    }

    public final void a(float f2) {
        this.v = f2;
        this.b.b.setAlpha(f2);
        this.b.j.setAlpha(this.v);
        this.b.i.setAlpha(this.v);
        this.b.h.setAlpha(this.v);
        if (a()) {
            this.c.a(1.0f - this.v);
        }
    }

    public final void c() {
        this.b.removeCallbacks(this.at);
        this.b.postDelayed(this.at, 1250);
        this.a.setVisibility(0);
    }

    public final void b() {
        this.b.removeCallbacks(this.C);
        dbv dbv = this.f;
        if (dbv != null) {
            dbv.a();
        }
        this.a.setVisibility(4);
        this.d.setVisibility(8);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cfs.<init>(int, char):void
     arg types: [int, int]
     candidates:
      cfs.<init>(int, byte):void
      cfs.<init>(int, char):void */
    public final void a(boolean z2, int i2) {
        if (this.q != 0) {
            int elapsedRealtime = (int) ((SystemClock.elapsedRealtime() - this.q) / 1000);
            this.aj = elapsedRealtime;
            if (elapsedRealtime > 0) {
                cfs cfs = new cfs(9, 0);
                dja i3 = cfs.i();
                dja l2 = dmy.d.l();
                long j2 = this.q;
                if (l2.b) {
                    l2.b();
                    l2.b = false;
                }
                dmy dmy = (dmy) l2.a;
                int i4 = dmy.a | 4;
                dmy.a = i4;
                dmy.b = j2;
                int i5 = this.aj;
                dmy.a = i4 | 8;
                dmy.c = i5;
                if (i3.b) {
                    i3.b();
                    i3.b = false;
                }
                dnb dnb = (dnb) i3.a;
                dmy dmy2 = (dmy) l2.g();
                dnb dnb2 = dnb.j;
                dmy2.getClass();
                dnb.e = dmy2;
                dnb.a |= 16;
                this.F.a(cfs);
            }
            this.q = 0;
        }
        this.b.removeCallbacks(this.at);
        this.a.setVisibility(4);
        if (this.v == 1.0f) {
            a(i2);
        } else if (z2) {
            ValueAnimator valueAnimator = this.x;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.w;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.w.cancel();
                    this.w = null;
                }
                if (this.ap == null) {
                    this.ap = new crp(this, i2);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.v, 1.0f);
                this.x = ofFloat;
                ofFloat.addUpdateListener(h());
                this.x.addListener(this.ap);
                this.x.setDuration(300L);
                this.x.start();
            }
        } else {
            this.b.b.setVisibility(0);
            a(1.0f);
            a(i2);
        }
    }

    public final void d() {
        this.b.removeCallbacks(this.au);
    }

    public final String toString() {
        String programView = this.b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(programView).length() + 12 + String.valueOf((Object) null).length());
        sb.append('{');
        sb.append(programView);
        sb.append(", title='null'}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        Double d2;
        double d3;
        int i2;
        float f2;
        float f3;
        int i3;
        c(this.T);
        boolean z2 = this.g;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
        if (!z2) {
            d2 = this.ai;
        } else {
            d2 = this.ah;
        }
        double doubleValue = d2.doubleValue();
        if (marginLayoutParams.height > 0) {
            double d4 = (double) marginLayoutParams.width;
            double d5 = (double) marginLayoutParams.height;
            Double.isNaN(d4);
            Double.isNaN(d5);
            d3 = d4 / d5;
        } else {
            d3 = 0.0d;
        }
        if (Math.abs(doubleValue - d3) > 0.001d) {
            double d6 = (double) marginLayoutParams.height;
            Double.isNaN(d6);
            marginLayoutParams.width = (int) Math.round(d6 * doubleValue);
            this.b.setLayoutParams(marginLayoutParams);
        }
        int i4 = -1;
        if (marginLayoutParams.width > 0 && this.ai.doubleValue() != 0.0d) {
            if (z2) {
                double d7 = (double) marginLayoutParams.width;
                double doubleValue2 = this.ai.doubleValue();
                Double.isNaN(d7);
                i3 = (int) Math.round(d7 / doubleValue2);
            } else {
                i3 = -1;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.b.c.getLayoutParams();
            if (i3 != marginLayoutParams2.height) {
                marginLayoutParams2.height = i3;
                this.b.c.setLayoutParams(marginLayoutParams2);
            }
        }
        boolean z3 = this.g;
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.b.d.getLayoutParams();
        int i5 = marginLayoutParams4.height;
        int i6 = marginLayoutParams4.width;
        if (!z3 || !this.ak) {
            i2 = -1;
        } else if (marginLayoutParams3.height > 0) {
            int i7 = marginLayoutParams3.height;
            int i8 = this.K;
            i4 = i7 - (i8 + i8);
            double d8 = (double) i4;
            double doubleValue3 = this.ai.doubleValue();
            Double.isNaN(d8);
            i2 = (int) Math.round(d8 * doubleValue3);
        } else {
            i4 = i5;
            i2 = i6;
        }
        if (!(marginLayoutParams4.height == i4 && marginLayoutParams4.width == i2)) {
            marginLayoutParams4.height = i4;
            marginLayoutParams4.width = i2;
            this.b.d.setLayoutParams(marginLayoutParams4);
        }
        if (this.g && this.ak) {
            e();
        } else if (!dcy.d(this.b.getContext())) {
            f();
        }
        boolean z4 = this.g;
        if (dcy.d(this.b.getContext())) {
            int i9 = this.b.getLayoutParams().width;
            int i10 = this.b.getLayoutParams().height;
            if (i9 <= 0 || i10 <= 0) {
                i9 = this.b.getWidth();
                i10 = this.b.getHeight();
            }
            if (i9 > 0 && i10 > 0) {
                if (this.b.getLayoutDirection() != 1) {
                    i9 = 0;
                }
                this.b.setPivotX((float) i9);
                this.b.setPivotY((float) (i10 >> 1));
            }
            if (z4) {
                f2 = this.H.o;
            } else {
                f2 = 1.0f;
            }
            if (z4) {
                f3 = this.H.p;
            } else {
                f3 = 0.0f;
            }
            this.b.setScaleX(f2);
            this.b.setScaleY(f2);
            this.b.setElevation(f3);
        }
        a(this.g);
    }

    private final void a(boolean z2) {
        boolean z3;
        Double d2;
        int i2 = this.T;
        if (i2 != 4 || !j()) {
            this.b.b(4);
            this.b.c(4);
        } else {
            this.b.b(0);
            this.b.c(0);
        }
        if (!this.h && this.Z) {
            if (!z2) {
                d2 = this.ai;
            } else {
                d2 = this.ah;
            }
            double doubleValue = d2.doubleValue();
            if (i2 != 4) {
                this.b.d(4);
                this.b.e(4);
                z3 = false;
            } else if (Double.compare(doubleValue, 0.6666666666666666d) > 0) {
                this.b.d(0);
                this.b.e(4);
                z3 = false;
            } else {
                this.b.d(4);
                this.b.e(0);
                z3 = true;
            }
        } else {
            this.b.d(8);
            this.b.e(8);
            z3 = false;
        }
        if (!k()) {
            this.b.f(8);
        } else if (i2 == 4 && !z3) {
            this.b.f(0);
        } else {
            this.b.f(4);
        }
    }

    private final void l() {
        int i2 = this.T;
        if (!(i2 == 0 || i2 == 1)) {
            if (i2 == 2) {
                this.b.a(2);
                return;
            } else if (!(i2 == 6 || i2 == 11 || i2 == 13 || i2 == 8 || i2 == 9)) {
                this.b.a(0);
                return;
            }
        }
        this.b.a(1);
    }

    private final void c(int i2) {
        this.T = i2;
        boolean z2 = false;
        if (i2 == 4 && this.b.isFocused()) {
            z2 = true;
        }
        this.g = z2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.cxu r12) {
        /*
            r11 = this;
            long r0 = java.lang.System.currentTimeMillis()
            boolean r2 = r11.Z
            r3 = 1
            r4 = 0
            r6 = 0
            if (r2 == 0) goto L_0x0050
            long r7 = r11.aa
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0050
            long r9 = r11.ab
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0050
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0050
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x004f
            com.google.android.tvlauncher.home.view.ProgramView r2 = r11.b
            android.widget.ProgressBar r2 = r2.h
            r2.setMin(r6)
            long r7 = r11.ab
            long r9 = r11.aa
            long r7 = r7 - r9
            int r8 = (int) r7
            r2.setMax(r8)
            long r7 = r11.aa
            long r0 = r0 - r7
            int r1 = (int) r0
            r2.setProgress(r1)
            android.content.res.ColorStateList r0 = r11.Q
            r2.setProgressTintList(r0)
            com.google.android.tvlauncher.home.view.ProgramView r0 = r11.b
            java.lang.Runnable r1 = r11.au
            r0.removeCallbacks(r1)
            com.google.android.tvlauncher.home.view.ProgramView r0 = r11.b
            java.lang.Runnable r1 = r11.au
            r7 = 60000(0xea60, double:2.9644E-319)
            r0.postDelayed(r1, r7)
            r0 = 1
            goto L_0x0051
        L_0x004f:
        L_0x0050:
            r0 = 0
        L_0x0051:
            if (r0 != 0) goto L_0x008e
            boolean r0 = r11.j
            if (r0 == 0) goto L_0x008c
            long r0 = r12.x()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x008c
            long r0 = r12.D()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x008c
            int r0 = r12.N()
            if (r0 != 0) goto L_0x008b
            com.google.android.tvlauncher.home.view.ProgramView r0 = r11.b
            android.widget.ProgressBar r0 = r0.h
            r0.setMin(r6)
            long r1 = r12.x()
            int r2 = (int) r1
            r0.setMax(r2)
            long r1 = r12.D()
            int r12 = (int) r1
            r0.setProgress(r12)
            android.content.res.ColorStateList r12 = r11.R
            r0.setProgressTintList(r12)
            r0 = 1
            goto L_0x008f
        L_0x008b:
        L_0x008c:
            r0 = 0
            goto L_0x008f
        L_0x008e:
        L_0x008f:
            com.google.android.tvlauncher.home.view.ProgramView r12 = r11.b
            android.view.View r12 = r12.i
            r1 = 8
            if (r0 == 0) goto L_0x009f
            boolean r2 = r11.j()
            if (r2 != 0) goto L_0x009f
            r2 = 0
            goto L_0x00a1
        L_0x009f:
            r2 = 8
        L_0x00a1:
            r12.setVisibility(r2)
            com.google.android.tvlauncher.home.view.ProgramView r12 = r11.b
            android.widget.ProgressBar r12 = r12.h
            if (r0 != 0) goto L_0x00ab
            goto L_0x00ad
        L_0x00ab:
            r1 = 0
        L_0x00ad:
            r12.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crz.a(cxu):void");
    }

    private final void n() {
        dhz.a(this.b, this.T, this.ai.doubleValue(), this.H);
    }
}
