package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import com.google.android.tvlauncher.R;
import java.util.Iterator;

/* renamed from: bhb  reason: default package */
/* compiled from: PG */
public class bhb extends FrameLayout {
    public final AspectRatioFrameLayout a;
    public final View b;
    public final View c;
    public final SubtitleView d;
    public final bgz e;
    public boolean f;
    public boolean g;
    private final ImageView h;
    private final View i;
    private final TextView j;
    private final bha k;
    private akt l;
    private boolean m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bhb(Context context) {
        super(context, null, 0);
        boolean z;
        int i2;
        bdi bdi;
        boolean z2 = false;
        if (isInEditMode()) {
            this.a = null;
            this.b = null;
            this.c = null;
            this.h = null;
            this.d = null;
            this.i = null;
            this.j = null;
            this.e = null;
            this.k = null;
            ImageView imageView = new ImageView(context);
            if (blm.a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo, null));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(R.drawable.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        LayoutInflater.from(context).inflate((int) R.layout.exo_player_view, this);
        this.k = new bha(this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.a = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.a(0);
        }
        this.b = findViewById(R.id.exo_shutter);
        if (this.a != null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            SurfaceView surfaceView = new SurfaceView(context);
            this.c = surfaceView;
            surfaceView.setLayoutParams(layoutParams);
            this.a.addView(this.c, 0);
        } else {
            this.c = null;
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.h = imageView2;
        if (imageView2 == null) {
            z = false;
        } else {
            z = true;
        }
        this.m = z;
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.d = subtitleView;
        if (subtitleView != null) {
            if (blm.a < 19 || !((CaptioningManager) subtitleView.getContext().getSystemService("captioning")).isEnabled() || subtitleView.isInEditMode()) {
                bdi = bdi.a;
            } else {
                bdi = bdi.a(((CaptioningManager) subtitleView.getContext().getSystemService("captioning")).getUserStyle());
            }
            if (subtitleView.b != bdi) {
                subtitleView.b = bdi;
                subtitleView.invalidate();
            }
            SubtitleView subtitleView2 = this.d;
            float f2 = 1.0f;
            if (blm.a >= 19 && !subtitleView2.isInEditMode()) {
                f2 = ((CaptioningManager) subtitleView2.getContext().getSystemService("captioning")).getFontScale();
            }
            float f3 = f2 * 0.0533f;
            if (subtitleView2.a != f3) {
                subtitleView2.a = f3;
                subtitleView2.invalidate();
            }
        }
        View findViewById = findViewById(R.id.exo_buffering);
        this.i = findViewById;
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.j = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        bgz bgz = (bgz) findViewById(R.id.exo_controller);
        View findViewById2 = findViewById(R.id.exo_controller_placeholder);
        if (bgz != null) {
            this.e = bgz;
        } else if (findViewById2 != null) {
            bgz bgz2 = new bgz(context);
            this.e = bgz2;
            bgz2.setId(R.id.exo_controller);
            this.e.setLayoutParams(findViewById2.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById2.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById2);
            viewGroup.removeView(findViewById2);
            viewGroup.addView(this.e, indexOfChild);
        } else {
            this.e = null;
        }
        bgz bgz3 = this.e;
        if (bgz3 != null) {
            i2 = 5000;
        } else {
            i2 = 0;
        }
        this.n = i2;
        this.p = true;
        this.o = true;
        this.g = true;
        this.f = bgz3 != null ? true : z2;
        a();
        e();
        bgz bgz4 = this.e;
        if (bgz4 != null) {
            bgz4.a.add(this.k);
        }
    }

    private final void g() {
        View view = this.b;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        akt akt = this.l;
        if (akt != null && akt.n()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = (keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23) && this.f;
        if (z && !this.e.b()) {
            a(true);
            return true;
        } else if ((this.f && this.e.a(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            a(true);
            return true;
        } else if (!z) {
            return false;
        } else {
            a(true);
            return false;
        }
    }

    private final void f() {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.h.setVisibility(4);
        }
    }

    public final void a() {
        bgz bgz = this.e;
        if (bgz != null) {
            bgz.a();
        }
    }

    public final boolean b() {
        akt akt = this.l;
        return akt != null && akt.n() && this.l.h();
    }

    public final void a(boolean z) {
        if ((!b() || !this.g) && this.f) {
            boolean z2 = true;
            boolean z3 = this.e.b() && this.e.p <= 0;
            akt akt = this.l;
            if (akt != null) {
                int f2 = akt.f();
                if (!this.o || !(f2 == 1 || f2 == 4 || !this.l.h())) {
                    z2 = false;
                }
            }
            if ((z || z3 || z2) && this.f) {
                bgz bgz = this.e;
                bgz.p = !z2 ? this.n : 0;
                if (bgz.b()) {
                    bgz.c();
                }
                bgz bgz2 = this.e;
                if (!bgz2.b()) {
                    bgz2.setVisibility(0);
                    Iterator it = bgz2.a.iterator();
                    while (it.hasNext()) {
                        bgz2.getVisibility();
                        ((bgy) it.next()).l();
                    }
                    bgz2.d();
                    bgz2.k();
                }
                bgz2.c();
            }
        }
    }

    protected static final void a(float f2, AspectRatioFrameLayout aspectRatioFrameLayout, View view) {
        if (aspectRatioFrameLayout != null) {
            if (view instanceof bhi) {
                f2 = 0.0f;
            }
            if (aspectRatioFrameLayout.a != f2) {
                aspectRatioFrameLayout.a = f2;
                aspectRatioFrameLayout.requestLayout();
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f || this.l == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.q = true;
            return true;
        } else if (action != 1 || !this.q) {
            return false;
        } else {
            this.q = false;
            performClick();
            return true;
        }
    }

    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!this.f || this.l == null) {
            return false;
        }
        a(true);
        return true;
    }

    public final boolean performClick() {
        super.performClick();
        if (!this.f || this.l == null) {
            return false;
        }
        if (!this.e.b()) {
            a(true);
        } else if (this.p) {
            this.e.a();
            return true;
        }
        return true;
    }

    private final boolean a(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                a(((float) intrinsicWidth) / ((float) intrinsicHeight), this.a, this.h);
                this.h.setImageDrawable(drawable);
                this.h.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final void a(akt akt) {
        bks.b(Looper.myLooper() == Looper.getMainLooper());
        bks.a(akt == null || akt.e() == Looper.getMainLooper());
        akt akt2 = this.l;
        if (akt2 != akt) {
            SurfaceHolder surfaceHolder = null;
            if (akt2 != null) {
                akt2.b(this.k);
                akt akt3 = this.l;
                if (akt3 != null) {
                    ald ald = (ald) akt3;
                    ald.d.remove(this.k);
                    View view = this.c;
                    if (view instanceof SurfaceView) {
                        SurfaceHolder holder = view == null ? null : ((SurfaceView) view).getHolder();
                        ald.u();
                        if (holder != null && holder == ald.o) {
                            ald.a((SurfaceHolder) null);
                        }
                    }
                }
                akt akt4 = this.l;
                if (akt4 != null) {
                    ((ald) akt4).f.remove(this.k);
                }
            }
            this.l = akt;
            if (this.f) {
                this.e.a(akt);
            }
            SubtitleView subtitleView = this.d;
            if (subtitleView != null) {
                subtitleView.b(null);
            }
            c();
            d();
            b(true);
            if (akt != null) {
                View view2 = this.c;
                if (view2 instanceof SurfaceView) {
                    if (view2 != null) {
                        surfaceHolder = ((SurfaceView) view2).getHolder();
                    }
                    ((ald) akt).a(surfaceHolder);
                }
                ald ald2 = (ald) akt;
                ald2.d.add(this.k);
                bha bha = this.k;
                if (!ald2.s.isEmpty()) {
                    bha.a(ald2.s);
                }
                ald2.f.add(bha);
                akt.a(this.k);
                a(false);
                return;
            }
            a();
        }
    }

    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.c;
        if (view instanceof SurfaceView) {
            view.setVisibility(i2);
        }
    }

    public final void c() {
        if (this.i != null) {
            akt akt = this.l;
            if (akt != null) {
                akt.f();
            }
            this.i.setVisibility(8);
        }
    }

    public final void e() {
        bgz bgz = this.e;
        String str = null;
        if (bgz == null || !this.f) {
            setContentDescription(null);
        } else if (bgz.getVisibility() == 0) {
            if (this.p) {
                str = getResources().getString(R.string.exo_controls_hide);
            }
            setContentDescription(str);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public final void d() {
        if (this.j != null) {
            akt akt = this.l;
            if (akt != null) {
                akt.f();
            }
            this.j.setVisibility(8);
        }
    }

    public final void b(boolean z) {
        byte[] bArr;
        int i2;
        akt akt = this.l;
        if (akt != null) {
            ald ald = (ald) akt;
            ald.u();
            if (ald.b.p.h.b != 0) {
                if (z) {
                    g();
                }
                ald ald2 = (ald) this.l;
                ald2.u();
                bgm bgm = ald2.b.p.i.c;
                for (int i3 = 0; i3 < bgm.a; i3++) {
                    ald ald3 = (ald) this.l;
                    ald3.u();
                    if (ald3.b.b[i3].a() == 2 && bgm.a(i3) != null) {
                        f();
                        return;
                    }
                }
                g();
                if (this.m) {
                    for (int i4 = 0; i4 < bgm.a; i4++) {
                        bgl a2 = bgm.a(i4);
                        if (a2 != null) {
                            for (int i5 = 0; i5 < a2.f(); i5++) {
                                atw atw = a2.a(i5).g;
                                if (atw != null) {
                                    int i6 = 0;
                                    int i7 = -1;
                                    boolean z2 = false;
                                    while (i6 < atw.a()) {
                                        atv a3 = atw.a(i6);
                                        if (a3 instanceof aup) {
                                            aup aup = (aup) a3;
                                            bArr = aup.b;
                                            i2 = aup.a;
                                        } else if (a3 instanceof aui) {
                                            aui aui = (aui) a3;
                                            bArr = aui.b;
                                            i2 = aui.a;
                                        } else {
                                            continue;
                                            i6++;
                                        }
                                        if (i7 == -1 || i2 == 3) {
                                            z2 = a(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                                            if (i2 == 3) {
                                                break;
                                            }
                                            i7 = i2;
                                            i6++;
                                        } else {
                                            i6++;
                                        }
                                    }
                                    if (z2) {
                                        return;
                                    }
                                }
                            }
                            continue;
                        }
                    }
                    if (a((Drawable) null)) {
                        return;
                    }
                }
                f();
                return;
            }
        }
        f();
        g();
    }
}
