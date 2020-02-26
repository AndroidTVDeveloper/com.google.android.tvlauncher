package defpackage;

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

/* renamed from: bgz  reason: default package */
/* compiled from: PG */
public final class bgz extends FrameLayout {
    private boolean A;
    private final int B = 5000;
    private final int C = 15000;
    private final int D = 200;
    private long E = -9223372036854775807L;
    private long[] F = new long[0];
    private boolean[] G = new boolean[0];
    private final long[] H = new long[0];
    private final boolean[] I = new boolean[0];
    private long J;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final View b;
    public final View c;
    public final View d;
    public final View e;
    public final View f;
    public final View g;
    public final ImageView h;
    public final ImageView i;
    public final TextView j;
    public final StringBuilder k = new StringBuilder();
    public final Formatter l = new Formatter(this.k, Locale.getDefault());
    public akt m;
    public final ajb n = new ajc();
    public boolean o;
    public int p = 5000;
    private final bgx q = new bgx(this);
    private final View r;
    private final TextView s;
    private final bhg t;
    private final alf u = new alf();
    private final alg v = new alg();
    private final Runnable w = new bgv(this);
    private final Runnable x = new bgw(this);
    private final float y;
    private final float z;

    static {
        akf.a("goog.exo.ui");
    }

    public bgz(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate((int) R.layout.exo_player_control_view, this);
        setDescendantFocusability(262144);
        bhg bhg = (bhg) findViewById(R.id.exo_progress);
        View findViewById = findViewById(R.id.exo_progress_placeholder);
        if (bhg != null) {
            this.t = bhg;
        } else if (findViewById != null) {
            bgu bgu = new bgu(context);
            bgu.setId(R.id.exo_progress);
            bgu.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(bgu, indexOfChild);
            this.t = bgu;
        } else {
            this.t = null;
        }
        this.s = (TextView) findViewById(R.id.exo_duration);
        this.j = (TextView) findViewById(R.id.exo_position);
        bhg bhg2 = this.t;
        if (bhg2 != null) {
            bhg2.a(this.q);
        }
        View findViewById2 = findViewById(R.id.exo_play);
        this.d = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this.q);
        }
        View findViewById3 = findViewById(R.id.exo_pause);
        this.e = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(this.q);
        }
        View findViewById4 = findViewById(R.id.exo_prev);
        this.b = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(this.q);
        }
        View findViewById5 = findViewById(R.id.exo_next);
        this.c = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(this.q);
        }
        View findViewById6 = findViewById(R.id.exo_rew);
        this.g = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(this.q);
        }
        View findViewById7 = findViewById(R.id.exo_ffwd);
        this.f = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(this.q);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.h = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(this.q);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.i = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this.q);
        }
        View findViewById8 = findViewById(R.id.exo_vr);
        this.r = findViewById8;
        if (findViewById8 != null) {
            findViewById8.setVisibility(8);
        }
        Resources resources = context.getResources();
        this.y = ((float) resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled)) / 100.0f;
        this.z = ((float) resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled)) / 100.0f;
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
        return a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.m == null || (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                e(this.m);
            } else if (keyCode == 89) {
                d(this.m);
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 85) {
                    ajb ajb = this.n;
                    akt akt = this.m;
                    ajb.a(akt, !akt.h());
                } else if (keyCode == 87) {
                    c(this.m);
                } else if (keyCode == 88) {
                    b(this.m);
                } else if (keyCode == 126) {
                    this.n.a(this.m, true);
                } else if (keyCode == 127) {
                    this.n.a(this.m, false);
                }
            }
        }
        return true;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.x);
        } else if (motionEvent.getAction() == 1) {
            c();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(akt akt) {
        int i2;
        if (akt.d() && (i2 = this.C) > 0) {
            a(akt, (long) i2);
        }
    }

    public final void a() {
        if (b()) {
            setVisibility(8);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                getVisibility();
                ((bgy) it.next()).l();
            }
            removeCallbacks(this.w);
            removeCallbacks(this.x);
            this.E = -9223372036854775807L;
        }
    }

    public final void c() {
        removeCallbacks(this.x);
        if (this.p > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j2 = (long) this.p;
            this.E = uptimeMillis + j2;
            if (this.A) {
                postDelayed(this.x, j2);
                return;
            }
            return;
        }
        this.E = -9223372036854775807L;
    }

    public final boolean b() {
        return getVisibility() == 0;
    }

    public final void c(akt akt) {
        alh r2 = akt.r();
        if (!r2.c() && !akt.n()) {
            int k2 = akt.k();
            int b2 = akt.b();
            if (b2 != -1) {
                a(akt, b2, -9223372036854775807L);
            } else if (r2.a(k2, this.v).d) {
                a(akt, k2, -9223372036854775807L);
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A = true;
        long j2 = this.E;
        if (j2 != -9223372036854775807L) {
            long uptimeMillis = j2 - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                a();
            } else {
                postDelayed(this.x, uptimeMillis);
            }
        } else if (b()) {
            c();
        }
        d();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A = false;
        removeCallbacks(this.w);
        removeCallbacks(this.x);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r2.c == false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.akt r8) {
        /*
            r7 = this;
            alh r0 = r8.r()
            boolean r1 = r0.c()
            if (r1 != 0) goto L_0x0043
            boolean r1 = r8.n()
            if (r1 == 0) goto L_0x0011
            goto L_0x0043
        L_0x0011:
            int r1 = r8.k()
            alg r2 = r7.v
            r0.a(r1, r2)
            int r0 = r8.c()
            r2 = -1
            if (r0 == r2) goto L_0x003e
            long r2 = r8.l()
            r4 = 3000(0xbb8, double:1.482E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0035
            alg r2 = r7.v
            boolean r3 = r2.d
            if (r3 == 0) goto L_0x003e
            boolean r2 = r2.c
            if (r2 != 0) goto L_0x003e
        L_0x0035:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            a(r8, r0, r1)
            return
        L_0x003e:
            r2 = 0
            a(r8, r1, r2)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgz.b(akt):void");
    }

    public final void k() {
        if (!l()) {
            View view = this.d;
            if (view != null) {
                view.requestFocus();
                return;
            }
            return;
        }
        View view2 = this.e;
        if (view2 != null) {
            view2.requestFocus();
        }
    }

    public final void d(akt akt) {
        int i2;
        if (akt.d() && (i2 = this.B) > 0) {
            a(akt, (long) (-i2));
        }
    }

    public static final void a(akt akt, int i2, long j2) {
        ald ald = (ald) akt;
        ald.u();
        alk alk = ald.k;
        if (!alk.b.h) {
            alk.n();
            alk.b.h = true;
            Iterator it = alk.a.iterator();
            while (it.hasNext()) {
                ((all) it.next()).B();
            }
        }
        ajy ajy = ald.b;
        alh alh = ajy.p.a;
        if (i2 < 0 || (!alh.c() && i2 >= alh.a())) {
            throw new akj();
        }
        ajy.m = true;
        ajy.k++;
        if (!ajy.n()) {
            ajy.q = i2;
            if (alh.c()) {
                ajy.s = j2 == -9223372036854775807L ? 0 : j2;
                ajy.r = 0;
            } else {
                long b2 = j2 == -9223372036854775807L ? alh.a(i2, ajy.a).g : aja.b(j2);
                Pair a2 = alh.a(ajy.a, ajy.f, i2, b2);
                ajy.s = aja.a(b2);
                ajy.r = alh.a(a2.first);
            }
            ajy.d.a.a(3, new akd(alh, i2, aja.b(j2))).sendToTarget();
            ajy.a(ajl.a);
            return;
        }
        Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
        ajy.c.obtainMessage(0, 1, -1, ajy.p).sendToTarget();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    private static final void a(akt akt, long j2) {
        long j3;
        long l2 = akt.l() + j2;
        ald ald = (ald) akt;
        ald.u();
        ajy ajy = ald.b;
        if (ajy.n()) {
            akp akp = ajy.p;
            akp.a.a(akp.b.a, ajy.f);
            j3 = aja.a(ajy.f.b());
        } else {
            alh r2 = ajy.r();
            j3 = r2.c() ? -9223372036854775807L : r2.a(ajy.k(), ajy.a).b();
        }
        if (j3 != -9223372036854775807L) {
            l2 = Math.min(l2, j3);
        }
        a(akt, akt.k(), Math.max(l2, 0L));
    }

    private final void a(boolean z2, View view) {
        float f2;
        if (view != null) {
            view.setEnabled(z2);
            if (!z2) {
                f2 = this.z;
            } else {
                f2 = this.y;
            }
            view.setAlpha(f2);
            view.setVisibility(0);
        }
    }

    public final void a(akt akt) {
        boolean z2 = true;
        bks.b(Looper.myLooper() == Looper.getMainLooper());
        if (!(akt == null || akt.e() == Looper.getMainLooper())) {
            z2 = false;
        }
        bks.a(z2);
        akt akt2 = this.m;
        if (akt2 != akt) {
            if (akt2 != null) {
                akt2.b(this.q);
            }
            this.m = akt;
            if (akt != null) {
                akt.a(this.q);
            }
            d();
        }
    }

    private final boolean l() {
        akt akt = this.m;
        if (akt == null || akt.f() == 4 || this.m.f() == 1 || !this.m.h()) {
            return false;
        }
        return true;
    }

    public final void d() {
        e();
        f();
        g();
        h();
        i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r9 = this;
            boolean r0 = r9.b()
            if (r0 == 0) goto L_0x0093
            boolean r0 = r9.A
            if (r0 == 0) goto L_0x0093
            akt r0 = r9.m
            r1 = 0
            if (r0 != 0) goto L_0x0015
        L_0x000f:
            r0 = 0
            r2 = 0
            r5 = 0
            r6 = 0
            goto L_0x0077
        L_0x0015:
            alh r0 = r0.r()
            boolean r2 = r0.c()
            if (r2 != 0) goto L_0x000f
            akt r2 = r9.m
            boolean r2 = r2.n()
            if (r2 != 0) goto L_0x0076
            akt r2 = r9.m
            int r2 = r2.k()
            alg r3 = r9.v
            r0.a(r2, r3)
            alg r0 = r9.v
            boolean r2 = r0.c
            r3 = -1
            r4 = 1
            if (r2 == 0) goto L_0x003c
        L_0x003a:
            r0 = 1
            goto L_0x004b
        L_0x003c:
            boolean r0 = r0.d
            if (r0 == 0) goto L_0x003a
            akt r0 = r9.m
            aiy r0 = (defpackage.aiy) r0
            int r0 = r0.c()
            if (r0 != r3) goto L_0x003a
            r0 = 0
        L_0x004b:
            if (r2 == 0) goto L_0x0053
            int r5 = r9.B
            if (r5 <= 0) goto L_0x0053
            r5 = 1
            goto L_0x0054
        L_0x0053:
            r5 = 0
        L_0x0054:
            if (r2 == 0) goto L_0x005e
            int r6 = r9.C
            if (r6 <= 0) goto L_0x005c
            r6 = 1
            goto L_0x005f
        L_0x005c:
        L_0x005e:
            r6 = 0
        L_0x005f:
            alg r7 = r9.v
            boolean r7 = r7.d
            if (r7 != 0) goto L_0x0070
            akt r7 = r9.m
            aiy r7 = (defpackage.aiy) r7
            int r7 = r7.b()
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
            android.view.View r3 = r9.b
            r9.a(r1, r3)
            android.view.View r1 = r9.g
            r9.a(r5, r1)
            android.view.View r1 = r9.f
            r9.a(r6, r1)
            android.view.View r1 = r9.c
            r9.a(r0, r1)
            bhg r0 = r9.t
            if (r0 == 0) goto L_0x0092
            r0.setEnabled(r2)
        L_0x0092:
            return
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgz.f():void");
    }

    public final void e() {
        boolean z2;
        if (b() && this.A) {
            boolean l2 = l();
            View view = this.d;
            int i2 = 8;
            boolean z3 = true;
            if (view == null) {
                z2 = false;
            } else {
                z2 = l2 && view.isFocused();
                this.d.setVisibility(!l2 ? 0 : 8);
            }
            View view2 = this.e;
            if (view2 != null) {
                if (l2 || !view2.isFocused()) {
                    z3 = false;
                }
                z2 |= z3;
                View view3 = this.e;
                if (l2) {
                    i2 = 0;
                }
                view3.setVisibility(i2);
            }
            if (z2) {
                k();
            }
        }
    }

    public final void j() {
        long j2;
        long j3;
        if (b() && this.A) {
            akt akt = this.m;
            long j4 = 0;
            if (akt != null) {
                j4 = this.J + akt.q();
                long j5 = this.J;
                ald ald = (ald) this.m;
                ald.u();
                ajy ajy = ald.b;
                if (!ajy.s()) {
                    akp akp = ajy.p;
                    if (akp.j.d == akp.b.d) {
                        long j6 = akp.k;
                        if (ajy.p.j.a()) {
                            akp akp2 = ajy.p;
                            alf a2 = akp2.a.a(akp2.j.a, ajy.f);
                            long a3 = a2.a(ajy.p.j.b);
                            if (a3 == Long.MIN_VALUE) {
                                j6 = a2.b;
                            } else {
                                j6 = a3;
                            }
                        }
                        j3 = ajy.a(ajy.p.j, j6);
                    } else {
                        j3 = akp.a.a(ajy.k(), ajy.a).b();
                    }
                } else {
                    j3 = ajy.s;
                }
                j2 = j5 + j3;
            } else {
                j2 = 0;
            }
            TextView textView = this.j;
            if (textView != null && !this.o) {
                textView.setText(blm.a(this.k, this.l, j4));
            }
            bhg bhg = this.t;
            if (bhg != null) {
                bhg.a(j4);
                this.t.b(j2);
            }
            removeCallbacks(this.w);
            akt akt2 = this.m;
            int f2 = akt2 != null ? akt2.f() : 1;
            akt akt3 = this.m;
            long j7 = 1000;
            if (akt3 != null && akt3.a()) {
                bhg bhg2 = this.t;
                long min = Math.min(bhg2 != null ? bhg2.a() : 1000, 1000 - (j4 % 1000));
                ald ald2 = (ald) this.m;
                ald2.u();
                float f3 = ald2.b.o.b;
                if (f3 > 0.0f) {
                    j7 = (long) (((float) min) / f3);
                }
                postDelayed(this.w, blm.a(j7, (long) this.D, 1000));
            } else if (f2 != 4 && f2 != 1) {
                postDelayed(this.w, 1000);
            }
        }
    }

    public final void g() {
        ImageView imageView;
        if (b() && this.A && (imageView = this.h) != null) {
            imageView.setVisibility(8);
        }
    }

    public final void h() {
        ImageView imageView;
        if (b() && this.A && (imageView = this.i) != null) {
            imageView.setVisibility(8);
        }
    }

    public final void i() {
        int i2;
        alg alg;
        int i3;
        int i4;
        akt akt = this.m;
        if (akt != null) {
            long j2 = 0;
            this.J = 0;
            alh r2 = akt.r();
            if (!r2.c()) {
                int k2 = this.m.k();
                long j3 = 0;
                int i5 = k2;
                i2 = 0;
                while (true) {
                    if (i5 > k2) {
                        break;
                    }
                    if (i5 == k2) {
                        this.J = aja.a(j3);
                    }
                    r2.a(i5, this.v);
                    alg alg2 = this.v;
                    if (alg2.h == -9223372036854775807L) {
                        bks.b(true);
                        break;
                    }
                    int i6 = alg2.e;
                    int i7 = i2;
                    int i8 = 0;
                    while (true) {
                        alg = this.v;
                        if (i8 > alg.f) {
                            break;
                        }
                        r2.a(i8, this.u);
                        int i9 = this.u.d.b;
                        int i10 = i7;
                        int i11 = 0;
                        while (i11 < i9) {
                            long a2 = this.u.a(i11);
                            if (a2 == Long.MIN_VALUE) {
                                i3 = i5;
                                long j4 = this.u.b;
                                if (j4 == -9223372036854775807L) {
                                    i11++;
                                    i5 = i3;
                                } else {
                                    a2 = j4;
                                }
                            } else {
                                i3 = i5;
                            }
                            long j5 = a2 + this.u.c;
                            if (j5 >= 0 && j5 <= this.v.h) {
                                long[] jArr = this.F;
                                int length = jArr.length;
                                if (i10 == length) {
                                    if (length != 0) {
                                        i4 = length + length;
                                    } else {
                                        i4 = 1;
                                    }
                                    this.F = Arrays.copyOf(jArr, i4);
                                    this.G = Arrays.copyOf(this.G, i4);
                                }
                                this.F[i10] = aja.a(j3 + j5);
                                boolean[] zArr = this.G;
                                ayg[] aygArr = this.u.d.d;
                                zArr[i10] = false;
                                i10++;
                            }
                            i11++;
                            i5 = i3;
                        }
                        i8++;
                        i7 = i10;
                    }
                    j3 += alg.h;
                    i5++;
                    i2 = i7;
                }
                j2 = j3;
            } else {
                i2 = 0;
            }
            long a3 = aja.a(j2);
            TextView textView = this.s;
            if (textView != null) {
                textView.setText(blm.a(this.k, this.l, a3));
            }
            bhg bhg = this.t;
            if (bhg != null) {
                bhg.c(a3);
                int length2 = this.H.length;
                int i12 = i2 + length2;
                long[] jArr2 = this.F;
                if (i12 > jArr2.length) {
                    this.F = Arrays.copyOf(jArr2, i12);
                    this.G = Arrays.copyOf(this.G, i12);
                }
                System.arraycopy(this.H, 0, this.F, i2, length2);
                System.arraycopy(this.I, 0, this.G, i2, length2);
                this.t.a(this.F, this.G, i12);
            }
            j();
        }
    }
}
