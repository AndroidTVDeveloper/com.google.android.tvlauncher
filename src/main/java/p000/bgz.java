package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.tvlauncher.R;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: bgz */
/* compiled from: PG */
public final class bgz extends FrameLayout {

    /* renamed from: A */
    private boolean f3878A;

    /* renamed from: B */
    private final int f3879B = 5000;

    /* renamed from: C */
    private final int f3880C = 15000;

    /* renamed from: D */
    private final int f3881D = 200;

    /* renamed from: E */
    private long f3882E = -9223372036854775807L;

    /* renamed from: F */
    private long[] f3883F = new long[0];

    /* renamed from: G */
    private boolean[] f3884G = new boolean[0];

    /* renamed from: H */
    private final long[] f3885H = new long[0];

    /* renamed from: I */
    private final boolean[] f3886I = new boolean[0];

    /* renamed from: J */
    private long f3887J;

    /* renamed from: a */
    public final CopyOnWriteArrayList f3888a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final View f3889b;

    /* renamed from: c */
    public final View f3890c;

    /* renamed from: d */
    public final View f3891d;

    /* renamed from: e */
    public final View f3892e;

    /* renamed from: f */
    public final View f3893f;

    /* renamed from: g */
    public final View f3894g;

    /* renamed from: h */
    public final ImageView f3895h;

    /* renamed from: i */
    public final ImageView f3896i;

    /* renamed from: j */
    public final TextView f3897j;

    /* renamed from: k */
    public final StringBuilder f3898k = new StringBuilder();

    /* renamed from: l */
    public final Formatter f3899l = new Formatter(this.f3898k, Locale.getDefault());

    /* renamed from: m */
    public akt f3900m;

    /* renamed from: n */
    public final ajb f3901n = new ajc();

    /* renamed from: o */
    public boolean f3902o;

    /* renamed from: p */
    public int f3903p = 5000;

    /* renamed from: q */
    private final bgx f3904q = new bgx(this);

    /* renamed from: r */
    private final View f3905r;

    /* renamed from: s */
    private final TextView f3906s;

    /* renamed from: t */
    private final bhg f3907t;

    /* renamed from: u */
    private final alf f3908u = new alf();

    /* renamed from: v */
    private final alg f3909v = new alg();

    /* renamed from: w */
    private final Runnable f3910w = new bgv(this);

    /* renamed from: x */
    private final Runnable f3911x = new bgw(this);

    /* renamed from: y */
    private final float f3912y;

    /* renamed from: z */
    private final float f3913z;

    static {
        akf.m726a("goog.exo.ui");
    }

    public bgz(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate((int) R.layout.exo_player_control_view, this);
        setDescendantFocusability(262144);
        bhg bhg = (bhg) findViewById(R.id.exo_progress);
        View findViewById = findViewById(R.id.exo_progress_placeholder);
        if (bhg != null) {
            this.f3907t = bhg;
        } else if (findViewById != null) {
            bgu bgu = new bgu(context);
            bgu.setId(R.id.exo_progress);
            bgu.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(bgu, indexOfChild);
            this.f3907t = bgu;
        } else {
            this.f3907t = null;
        }
        this.f3906s = (TextView) findViewById(R.id.exo_duration);
        this.f3897j = (TextView) findViewById(R.id.exo_position);
        bhg bhg2 = this.f3907t;
        if (bhg2 != null) {
            bhg2.mo1874a(this.f3904q);
        }
        View findViewById2 = findViewById(R.id.exo_play);
        this.f3891d = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this.f3904q);
        }
        View findViewById3 = findViewById(R.id.exo_pause);
        this.f3892e = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(this.f3904q);
        }
        View findViewById4 = findViewById(R.id.exo_prev);
        this.f3889b = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(this.f3904q);
        }
        View findViewById5 = findViewById(R.id.exo_next);
        this.f3890c = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(this.f3904q);
        }
        View findViewById6 = findViewById(R.id.exo_rew);
        this.f3894g = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(this.f3904q);
        }
        View findViewById7 = findViewById(R.id.exo_ffwd);
        this.f3893f = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(this.f3904q);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f3895h = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(this.f3904q);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f3896i = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this.f3904q);
        }
        View findViewById8 = findViewById(R.id.exo_vr);
        this.f3905r = findViewById8;
        if (findViewById8 != null) {
            findViewById8.setVisibility(8);
        }
        Resources resources = context.getResources();
        this.f3912y = ((float) resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled)) / 100.0f;
        this.f3913z = ((float) resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled)) / 100.0f;
        resources.getDrawable(R.drawable.exo_controls_repeat_off);
        resources.getDrawable(R.drawable.exo_controls_repeat_one);
        resources.getDrawable(R.drawable.exo_controls_repeat_all);
        resources.getDrawable(R.drawable.exo_controls_shuffle_on);
        resources.getDrawable(R.drawable.exo_controls_shuffle_off);
        resources.getString(R.string.exo_controls_repeat_off_description);
        resources.getString(R.string.exo_controls_repeat_one_description);
        resources.getString(R.string.exo_controls_repeat_all_description);
        resources.getString(R.string.exo_controls_shuffle_on_description);
        resources.getString(R.string.exo_controls_shuffle_off_description);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return mo1899a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: a */
    public final boolean mo1899a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.f3900m == null || (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                mo1909e(this.f3900m);
            } else if (keyCode == 89) {
                mo1905d(this.f3900m);
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 85) {
                    ajb ajb = this.f3901n;
                    akt akt = this.f3900m;
                    ajb.mo374a(akt, !akt.mo394h());
                } else if (keyCode == 87) {
                    mo1903c(this.f3900m);
                } else if (keyCode == 88) {
                    mo1900b(this.f3900m);
                } else if (keyCode == 126) {
                    this.f3901n.mo374a(this.f3900m, true);
                } else if (keyCode == 127) {
                    this.f3901n.mo374a(this.f3900m, false);
                }
            }
        }
        return true;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f3911x);
        } else if (motionEvent.getAction() == 1) {
            mo1902c();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final void mo1909e(akt akt) {
        int i;
        if (akt.mo342d() && (i = this.f3880C) > 0) {
            m3193a(akt, (long) i);
        }
    }

    /* renamed from: a */
    public final void mo1897a() {
        if (mo1901b()) {
            setVisibility(8);
            Iterator it = this.f3888a.iterator();
            while (it.hasNext()) {
                getVisibility();
                ((bgy) it.next()).mo1896l();
            }
            removeCallbacks(this.f3910w);
            removeCallbacks(this.f3911x);
            this.f3882E = -9223372036854775807L;
        }
    }

    /* renamed from: c */
    public final void mo1902c() {
        removeCallbacks(this.f3911x);
        if (this.f3903p > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = (long) this.f3903p;
            this.f3882E = uptimeMillis + j;
            if (this.f3878A) {
                postDelayed(this.f3911x, j);
                return;
            }
            return;
        }
        this.f3882E = -9223372036854775807L;
    }

    /* renamed from: b */
    public final boolean mo1901b() {
        return getVisibility() == 0;
    }

    /* renamed from: c */
    public final void mo1903c(akt akt) {
        alh r = akt.mo404r();
        if (!r.mo552c() && !akt.mo400n()) {
            int k = akt.mo397k();
            int b = akt.mo340b();
            if (b != -1) {
                m3192a(akt, b, -9223372036854775807L);
            } else if (r.mo548a(k, this.f3909v).f675d) {
                m3192a(akt, k, -9223372036854775807L);
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3878A = true;
        long j = this.f3882E;
        if (j != -9223372036854775807L) {
            long uptimeMillis = j - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                mo1897a();
            } else {
                postDelayed(this.f3911x, uptimeMillis);
            }
        } else if (mo1901b()) {
            mo1902c();
        }
        mo1904d();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3878A = false;
        removeCallbacks(this.f3910w);
        removeCallbacks(this.f3911x);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r2.f674c == false) goto L_0x0035;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1900b(p000.akt r8) {
        /*
            r7 = this;
            alh r0 = r8.mo404r()
            boolean r1 = r0.mo552c()
            if (r1 != 0) goto L_0x0043
            boolean r1 = r8.mo400n()
            if (r1 == 0) goto L_0x0011
            goto L_0x0043
        L_0x0011:
            int r1 = r8.mo397k()
            alg r2 = r7.f3909v
            r0.mo548a(r1, r2)
            int r0 = r8.mo341c()
            r2 = -1
            if (r0 == r2) goto L_0x003e
            long r2 = r8.mo398l()
            r4 = 3000(0xbb8, double:1.482E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0035
            alg r2 = r7.f3909v
            boolean r3 = r2.f675d
            if (r3 == 0) goto L_0x003e
            boolean r2 = r2.f674c
            if (r2 != 0) goto L_0x003e
        L_0x0035:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            m3192a(r8, r0, r1)
            return
        L_0x003e:
            r2 = 0
            m3192a(r8, r1, r2)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bgz.mo1900b(akt):void");
    }

    /* renamed from: k */
    public final void mo1915k() {
        if (!m3195l()) {
            View view = this.f3891d;
            if (view != null) {
                view.requestFocus();
                return;
            }
            return;
        }
        View view2 = this.f3892e;
        if (view2 != null) {
            view2.requestFocus();
        }
    }

    /* renamed from: d */
    public final void mo1905d(akt akt) {
        int i;
        if (akt.mo342d() && (i = this.f3879B) > 0) {
            m3193a(akt, (long) (-i));
        }
    }

    /* renamed from: a */
    public static final void m3192a(akt akt, int i, long j) {
        ald ald = (ald) akt;
        ald.mo523u();
        alk alk = ald.f653k;
        if (!alk.f697b.f695h) {
            alk.mo568n();
            alk.f697b.f695h = true;
            Iterator it = alk.f696a.iterator();
            while (it.hasNext()) {
                ((all) it.next()).mo572B();
            }
        }
        ajy ajy = ald.f644b;
        alh alh = ajy.f491p.f611a;
        if (i < 0 || (!alh.mo552c() && i >= alh.mo524a())) {
            throw new akj();
        }
        ajy.f488m = true;
        ajy.f486k++;
        if (!ajy.mo400n()) {
            ajy.f492q = i;
            if (alh.mo552c()) {
                ajy.f494s = j == -9223372036854775807L ? 0 : j;
                ajy.f493r = 0;
            } else {
                long b = j == -9223372036854775807L ? alh.mo548a(i, ajy.f419a).f678g : aja.m633b(j);
                Pair a = alh.mo549a(ajy.f419a, ajy.f481f, i, b);
                ajy.f494s = aja.m632a(b);
                ajy.f493r = alh.mo525a(a.first);
            }
            ajy.f479d.f516a.mo2043a(3, new akd(alh, i, aja.m633b(j))).sendToTarget();
            ajy.mo386a(ajl.f455a);
            return;
        }
        Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
        ajy.f478c.obtainMessage(0, 1, -1, ajy.f491p).sendToTarget();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    private static final void m3193a(akt akt, long j) {
        long j2;
        long l = akt.mo398l() + j;
        ald ald = (ald) akt;
        ald.mo523u();
        ajy ajy = ald.f644b;
        if (ajy.mo400n()) {
            akp akp = ajy.f491p;
            akp.f611a.mo547a(akp.f612b.f2566a, ajy.f481f);
            j2 = aja.m632a(ajy.f481f.mo536b());
        } else {
            alh r = ajy.mo404r();
            j2 = r.mo552c() ? -9223372036854775807L : r.mo548a(ajy.mo397k(), ajy.f419a).mo542b();
        }
        if (j2 != -9223372036854775807L) {
            l = Math.min(l, j2);
        }
        m3192a(akt, akt.mo397k(), Math.max(l, 0L));
    }

    /* renamed from: a */
    private final void m3194a(boolean z, View view) {
        float f;
        if (view != null) {
            view.setEnabled(z);
            if (!z) {
                f = this.f3913z;
            } else {
                f = this.f3912y;
            }
            view.setAlpha(f);
            view.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo1898a(akt akt) {
        boolean z = true;
        bks.m3512b(Looper.myLooper() == Looper.getMainLooper());
        if (!(akt == null || akt.mo391e() == Looper.getMainLooper())) {
            z = false;
        }
        bks.m3510a(z);
        akt akt2 = this.f3900m;
        if (akt2 != akt) {
            if (akt2 != null) {
                akt2.mo390b(this.f3904q);
            }
            this.f3900m = akt;
            if (akt != null) {
                akt.mo388a(this.f3904q);
            }
            mo1904d();
        }
    }

    /* renamed from: l */
    private final boolean m3195l() {
        akt akt = this.f3900m;
        if (akt == null || akt.mo392f() == 4 || this.f3900m.mo392f() == 1 || !this.f3900m.mo394h()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo1904d() {
        mo1908e();
        mo1910f();
        mo1911g();
        mo1912h();
        mo1913i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1910f() {
        /*
            r9 = this;
            boolean r0 = r9.mo1901b()
            if (r0 == 0) goto L_0x0093
            boolean r0 = r9.f3878A
            if (r0 == 0) goto L_0x0093
            akt r0 = r9.f3900m
            r1 = 0
            if (r0 != 0) goto L_0x0015
        L_0x000f:
            r0 = 0
            r2 = 0
            r5 = 0
            r6 = 0
            goto L_0x0077
        L_0x0015:
            alh r0 = r0.mo404r()
            boolean r2 = r0.mo552c()
            if (r2 != 0) goto L_0x000f
            akt r2 = r9.f3900m
            boolean r2 = r2.mo400n()
            if (r2 != 0) goto L_0x0076
            akt r2 = r9.f3900m
            int r2 = r2.mo397k()
            alg r3 = r9.f3909v
            r0.mo548a(r2, r3)
            alg r0 = r9.f3909v
            boolean r2 = r0.f674c
            r3 = -1
            r4 = 1
            if (r2 == 0) goto L_0x003c
        L_0x003a:
            r0 = 1
            goto L_0x004b
        L_0x003c:
            boolean r0 = r0.f675d
            if (r0 == 0) goto L_0x003a
            akt r0 = r9.f3900m
            aiy r0 = (p000.aiy) r0
            int r0 = r0.mo341c()
            if (r0 != r3) goto L_0x003a
            r0 = 0
        L_0x004b:
            if (r2 == 0) goto L_0x0053
            int r5 = r9.f3879B
            if (r5 <= 0) goto L_0x0053
            r5 = 1
            goto L_0x0054
        L_0x0053:
            r5 = 0
        L_0x0054:
            if (r2 == 0) goto L_0x005e
            int r6 = r9.f3880C
            if (r6 <= 0) goto L_0x005c
            r6 = 1
            goto L_0x005f
        L_0x005c:
        L_0x005e:
            r6 = 0
        L_0x005f:
            alg r7 = r9.f3909v
            boolean r7 = r7.f675d
            if (r7 != 0) goto L_0x0070
            akt r7 = r9.f3900m
            aiy r7 = (p000.aiy) r7
            int r7 = r7.mo340b()
            if (r7 != r3) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            r1 = 1
        L_0x0071:
            r8 = r1
            r1 = r0
            r0 = r8
            goto L_0x0077
        L_0x0076:
            goto L_0x000f
        L_0x0077:
            android.view.View r3 = r9.f3889b
            r9.m3194a(r1, r3)
            android.view.View r1 = r9.f3894g
            r9.m3194a(r5, r1)
            android.view.View r1 = r9.f3893f
            r9.m3194a(r6, r1)
            android.view.View r1 = r9.f3890c
            r9.m3194a(r0, r1)
            bhg r0 = r9.f3907t
            if (r0 == 0) goto L_0x0092
            r0.setEnabled(r2)
        L_0x0092:
            return
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bgz.mo1910f():void");
    }

    /* renamed from: e */
    public final void mo1908e() {
        boolean z;
        if (mo1901b() && this.f3878A) {
            boolean l = m3195l();
            View view = this.f3891d;
            int i = 8;
            boolean z2 = true;
            if (view == null) {
                z = false;
            } else {
                z = l && view.isFocused();
                this.f3891d.setVisibility(!l ? 0 : 8);
            }
            View view2 = this.f3892e;
            if (view2 != null) {
                if (l || !view2.isFocused()) {
                    z2 = false;
                }
                z |= z2;
                View view3 = this.f3892e;
                if (l) {
                    i = 0;
                }
                view3.setVisibility(i);
            }
            if (z) {
                mo1915k();
            }
        }
    }

    /* renamed from: j */
    public final void mo1914j() {
        long j;
        long j2;
        if (mo1901b() && this.f3878A) {
            akt akt = this.f3900m;
            long j3 = 0;
            if (akt != null) {
                j3 = this.f3887J + akt.mo403q();
                long j4 = this.f3887J;
                ald ald = (ald) this.f3900m;
                ald.mo523u();
                ajy ajy = ald.f644b;
                if (!ajy.mo405s()) {
                    akp akp = ajy.f491p;
                    if (akp.f620j.f2569d == akp.f612b.f2569d) {
                        long j5 = akp.f621k;
                        if (ajy.f491p.f620j.mo1504a()) {
                            akp akp2 = ajy.f491p;
                            alf a = akp2.f611a.mo547a(akp2.f620j.f2566a, ajy.f481f);
                            long a2 = a.mo532a(ajy.f491p.f620j.f2567b);
                            if (a2 == Long.MIN_VALUE) {
                                j5 = a.f668b;
                            } else {
                                j5 = a2;
                            }
                        }
                        j2 = ajy.mo383a(ajy.f491p.f620j, j5);
                    } else {
                        j2 = akp.f611a.mo548a(ajy.mo397k(), ajy.f419a).mo542b();
                    }
                } else {
                    j2 = ajy.f494s;
                }
                j = j4 + j2;
            } else {
                j = 0;
            }
            TextView textView = this.f3897j;
            if (textView != null && !this.f3902o) {
                textView.setText(blm.m3639a(this.f3898k, this.f3899l, j3));
            }
            bhg bhg = this.f3907t;
            if (bhg != null) {
                bhg.mo1873a(j3);
                this.f3907t.mo1877b(j);
            }
            removeCallbacks(this.f3910w);
            akt akt2 = this.f3900m;
            int f = akt2 != null ? akt2.mo392f() : 1;
            akt akt3 = this.f3900m;
            long j6 = 1000;
            if (akt3 != null && akt3.mo339a()) {
                bhg bhg2 = this.f3907t;
                long min = Math.min(bhg2 != null ? bhg2.mo1872a() : 1000, 1000 - (j3 % 1000));
                ald ald2 = (ald) this.f3900m;
                ald2.mo523u();
                float f2 = ald2.f644b.f490o.f625b;
                if (f2 > 0.0f) {
                    j6 = (long) (((float) min) / f2);
                }
                postDelayed(this.f3910w, blm.m3632a(j6, (long) this.f3881D, 1000));
            } else if (f != 4 && f != 1) {
                postDelayed(this.f3910w, 1000);
            }
        }
    }

    /* renamed from: g */
    public final void mo1911g() {
        ImageView imageView;
        if (mo1901b() && this.f3878A && (imageView = this.f3895h) != null) {
            imageView.setVisibility(8);
        }
    }

    /* renamed from: h */
    public final void mo1912h() {
        ImageView imageView;
        if (mo1901b() && this.f3878A && (imageView = this.f3896i) != null) {
            imageView.setVisibility(8);
        }
    }

    /* renamed from: i */
    public final void mo1913i() {
        int i;
        alg alg;
        int i2;
        int i3;
        akt akt = this.f3900m;
        if (akt != null) {
            long j = 0;
            this.f3887J = 0;
            alh r = akt.mo404r();
            if (!r.mo552c()) {
                int k = this.f3900m.mo397k();
                long j2 = 0;
                int i4 = k;
                i = 0;
                while (true) {
                    if (i4 > k) {
                        break;
                    }
                    if (i4 == k) {
                        this.f3887J = aja.m632a(j2);
                    }
                    r.mo548a(i4, this.f3909v);
                    alg alg2 = this.f3909v;
                    if (alg2.f679h == -9223372036854775807L) {
                        bks.m3512b(true);
                        break;
                    }
                    int i5 = alg2.f676e;
                    int i6 = i;
                    int i7 = 0;
                    while (true) {
                        alg = this.f3909v;
                        if (i7 > alg.f677f) {
                            break;
                        }
                        r.mo551a(i7, this.f3908u);
                        int i8 = this.f3908u.f670d.f2758b;
                        int i9 = i6;
                        int i10 = 0;
                        while (i10 < i8) {
                            long a = this.f3908u.mo532a(i10);
                            if (a == Long.MIN_VALUE) {
                                i2 = i4;
                                long j3 = this.f3908u.f668b;
                                if (j3 == -9223372036854775807L) {
                                    i10++;
                                    i4 = i2;
                                } else {
                                    a = j3;
                                }
                            } else {
                                i2 = i4;
                            }
                            long j4 = a + this.f3908u.f669c;
                            if (j4 >= 0 && j4 <= this.f3909v.f679h) {
                                long[] jArr = this.f3883F;
                                int length = jArr.length;
                                if (i9 == length) {
                                    if (length != 0) {
                                        i3 = length + length;
                                    } else {
                                        i3 = 1;
                                    }
                                    this.f3883F = Arrays.copyOf(jArr, i3);
                                    this.f3884G = Arrays.copyOf(this.f3884G, i3);
                                }
                                this.f3883F[i9] = aja.m632a(j2 + j4);
                                boolean[] zArr = this.f3884G;
                                ayg[] aygArr = this.f3908u.f670d.f2760d;
                                zArr[i9] = false;
                                i9++;
                            }
                            i10++;
                            i4 = i2;
                        }
                        i7++;
                        i6 = i9;
                    }
                    j2 += alg.f679h;
                    i4++;
                    i = i6;
                }
                j = j2;
            } else {
                i = 0;
            }
            long a2 = aja.m632a(j);
            TextView textView = this.f3906s;
            if (textView != null) {
                textView.setText(blm.m3639a(this.f3898k, this.f3899l, a2));
            }
            bhg bhg = this.f3907t;
            if (bhg != null) {
                bhg.mo1878c(a2);
                int length2 = this.f3885H.length;
                int i11 = i + length2;
                long[] jArr2 = this.f3883F;
                if (i11 > jArr2.length) {
                    this.f3883F = Arrays.copyOf(jArr2, i11);
                    this.f3884G = Arrays.copyOf(this.f3884G, i11);
                }
                System.arraycopy(this.f3885H, 0, this.f3883F, i, length2);
                System.arraycopy(this.f3886I, 0, this.f3884G, i, length2);
                this.f3907t.mo1876a(this.f3883F, this.f3884G, i11);
            }
            mo1914j();
        }
    }
}
