package p000;

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
import com.google.android.exoplayer2.p003ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.p003ui.SubtitleView;
import com.google.android.tvlauncher.R;
import java.util.Iterator;

/* renamed from: bhb */
/* compiled from: PG */
public class bhb extends FrameLayout {

    /* renamed from: a */
    public final AspectRatioFrameLayout f3917a;

    /* renamed from: b */
    public final View f3918b;

    /* renamed from: c */
    public final View f3919c;

    /* renamed from: d */
    public final SubtitleView f3920d;

    /* renamed from: e */
    public final bgz f3921e;

    /* renamed from: f */
    public boolean f3922f;

    /* renamed from: g */
    public boolean f3923g;

    /* renamed from: h */
    private final ImageView f3924h;

    /* renamed from: i */
    private final View f3925i;

    /* renamed from: j */
    private final TextView f3926j;

    /* renamed from: k */
    private final bha f3927k;

    /* renamed from: l */
    private akt f3928l;

    /* renamed from: m */
    private boolean f3929m;

    /* renamed from: n */
    private int f3930n;

    /* renamed from: o */
    private boolean f3931o;

    /* renamed from: p */
    private boolean f3932p;

    /* renamed from: q */
    private boolean f3933q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bhb(Context context) {
        super(context, null, 0);
        boolean z;
        int i;
        bdi bdi;
        boolean z2 = false;
        if (isInEditMode()) {
            this.f3917a = null;
            this.f3918b = null;
            this.f3919c = null;
            this.f3924h = null;
            this.f3920d = null;
            this.f3925i = null;
            this.f3926j = null;
            this.f3921e = null;
            this.f3927k = null;
            ImageView imageView = new ImageView(context);
            if (blm.f4293a >= 23) {
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
        this.f3927k = new bha(this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f3917a = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.mo3174a(0);
        }
        this.f3918b = findViewById(R.id.exo_shutter);
        if (this.f3917a != null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            SurfaceView surfaceView = new SurfaceView(context);
            this.f3919c = surfaceView;
            surfaceView.setLayoutParams(layoutParams);
            this.f3917a.addView(this.f3919c, 0);
        } else {
            this.f3919c = null;
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f3924h = imageView2;
        if (imageView2 == null) {
            z = false;
        } else {
            z = true;
        }
        this.f3929m = z;
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f3920d = subtitleView;
        if (subtitleView != null) {
            if (blm.f4293a < 19 || !((CaptioningManager) subtitleView.getContext().getSystemService("captioning")).isEnabled() || subtitleView.isInEditMode()) {
                bdi = bdi.f3399a;
            } else {
                bdi = bdi.m2897a(((CaptioningManager) subtitleView.getContext().getSystemService("captioning")).getUserStyle());
            }
            if (subtitleView.f6231b != bdi) {
                subtitleView.f6231b = bdi;
                subtitleView.invalidate();
            }
            SubtitleView subtitleView2 = this.f3920d;
            float f = 1.0f;
            if (blm.f4293a >= 19 && !subtitleView2.isInEditMode()) {
                f = ((CaptioningManager) subtitleView2.getContext().getSystemService("captioning")).getFontScale();
            }
            float f2 = f * 0.0533f;
            if (subtitleView2.f6230a != f2) {
                subtitleView2.f6230a = f2;
                subtitleView2.invalidate();
            }
        }
        View findViewById = findViewById(R.id.exo_buffering);
        this.f3925i = findViewById;
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.f3926j = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        bgz bgz = (bgz) findViewById(R.id.exo_controller);
        View findViewById2 = findViewById(R.id.exo_controller_placeholder);
        if (bgz != null) {
            this.f3921e = bgz;
        } else if (findViewById2 != null) {
            bgz bgz2 = new bgz(context);
            this.f3921e = bgz2;
            bgz2.setId(R.id.exo_controller);
            this.f3921e.setLayoutParams(findViewById2.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById2.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById2);
            viewGroup.removeView(findViewById2);
            viewGroup.addView(this.f3921e, indexOfChild);
        } else {
            this.f3921e = null;
        }
        bgz bgz3 = this.f3921e;
        if (bgz3 != null) {
            i = 5000;
        } else {
            i = 0;
        }
        this.f3930n = i;
        this.f3932p = true;
        this.f3931o = true;
        this.f3923g = true;
        this.f3922f = bgz3 != null ? true : z2;
        mo1919a();
        mo1927e();
        bgz bgz4 = this.f3921e;
        if (bgz4 != null) {
            bgz4.f3888a.add(this.f3927k);
        }
    }

    /* renamed from: g */
    private final void m3238g() {
        View view = this.f3918b;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        akt akt = this.f3928l;
        if (akt != null && akt.mo400n()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = (keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23) && this.f3922f;
        if (z && !this.f3921e.mo1901b()) {
            mo1921a(true);
            return true;
        } else if ((this.f3922f && this.f3921e.mo1899a(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            mo1921a(true);
            return true;
        } else if (!z) {
            return false;
        } else {
            mo1921a(true);
            return false;
        }
    }

    /* renamed from: f */
    private final void m3237f() {
        ImageView imageView = this.f3924h;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.f3924h.setVisibility(4);
        }
    }

    /* renamed from: a */
    public final void mo1919a() {
        bgz bgz = this.f3921e;
        if (bgz != null) {
            bgz.mo1897a();
        }
    }

    /* renamed from: b */
    public final boolean mo1923b() {
        akt akt = this.f3928l;
        return akt != null && akt.mo400n() && this.f3928l.mo394h();
    }

    /* renamed from: a */
    public final void mo1921a(boolean z) {
        if ((!mo1923b() || !this.f3923g) && this.f3922f) {
            boolean z2 = true;
            boolean z3 = this.f3921e.mo1901b() && this.f3921e.f3903p <= 0;
            akt akt = this.f3928l;
            if (akt != null) {
                int f = akt.mo392f();
                if (!this.f3931o || !(f == 1 || f == 4 || !this.f3928l.mo394h())) {
                    z2 = false;
                }
            }
            if ((z || z3 || z2) && this.f3922f) {
                bgz bgz = this.f3921e;
                bgz.f3903p = !z2 ? this.f3930n : 0;
                if (bgz.mo1901b()) {
                    bgz.mo1902c();
                }
                bgz bgz2 = this.f3921e;
                if (!bgz2.mo1901b()) {
                    bgz2.setVisibility(0);
                    Iterator it = bgz2.f3888a.iterator();
                    while (it.hasNext()) {
                        bgz2.getVisibility();
                        ((bgy) it.next()).mo1896l();
                    }
                    bgz2.mo1904d();
                    bgz2.mo1915k();
                }
                bgz2.mo1902c();
            }
        }
    }

    /* renamed from: a */
    protected static final void m3235a(float f, AspectRatioFrameLayout aspectRatioFrameLayout, View view) {
        if (aspectRatioFrameLayout != null) {
            if (view instanceof bhi) {
                f = 0.0f;
            }
            if (aspectRatioFrameLayout.f6227a != f) {
                aspectRatioFrameLayout.f6227a = f;
                aspectRatioFrameLayout.requestLayout();
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f3922f || this.f3928l == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f3933q = true;
            return true;
        } else if (action != 1 || !this.f3933q) {
            return false;
        } else {
            this.f3933q = false;
            performClick();
            return true;
        }
    }

    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!this.f3922f || this.f3928l == null) {
            return false;
        }
        mo1921a(true);
        return true;
    }

    public final boolean performClick() {
        super.performClick();
        if (!this.f3922f || this.f3928l == null) {
            return false;
        }
        if (!this.f3921e.mo1901b()) {
            mo1921a(true);
        } else if (this.f3932p) {
            this.f3921e.mo1897a();
            return true;
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m3236a(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                m3235a(((float) intrinsicWidth) / ((float) intrinsicHeight), this.f3917a, this.f3924h);
                this.f3924h.setImageDrawable(drawable);
                this.f3924h.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo1920a(akt akt) {
        bks.m3512b(Looper.myLooper() == Looper.getMainLooper());
        bks.m3510a(akt == null || akt.mo391e() == Looper.getMainLooper());
        akt akt2 = this.f3928l;
        if (akt2 != akt) {
            SurfaceHolder surfaceHolder = null;
            if (akt2 != null) {
                akt2.mo390b(this.f3927k);
                akt akt3 = this.f3928l;
                if (akt3 != null) {
                    ald ald = (ald) akt3;
                    ald.f646d.remove(this.f3927k);
                    View view = this.f3919c;
                    if (view instanceof SurfaceView) {
                        SurfaceHolder holder = view == null ? null : ((SurfaceView) view).getHolder();
                        ald.mo523u();
                        if (holder != null && holder == ald.f657o) {
                            ald.mo519a((SurfaceHolder) null);
                        }
                    }
                }
                akt akt4 = this.f3928l;
                if (akt4 != null) {
                    ((ald) akt4).f648f.remove(this.f3927k);
                }
            }
            this.f3928l = akt;
            if (this.f3922f) {
                this.f3921e.mo1898a(akt);
            }
            SubtitleView subtitleView = this.f3920d;
            if (subtitleView != null) {
                subtitleView.mo3176b(null);
            }
            mo1924c();
            mo1925d();
            mo1922b(true);
            if (akt != null) {
                View view2 = this.f3919c;
                if (view2 instanceof SurfaceView) {
                    if (view2 != null) {
                        surfaceHolder = ((SurfaceView) view2).getHolder();
                    }
                    ((ald) akt).mo519a(surfaceHolder);
                }
                ald ald2 = (ald) akt;
                ald2.f646d.add(this.f3927k);
                bha bha = this.f3927k;
                if (!ald2.f661s.isEmpty()) {
                    bha.mo503a(ald2.f661s);
                }
                ald2.f648f.add(bha);
                akt.mo388a(this.f3927k);
                mo1921a(false);
                return;
            }
            mo1919a();
        }
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f3919c;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    /* renamed from: c */
    public final void mo1924c() {
        if (this.f3925i != null) {
            akt akt = this.f3928l;
            if (akt != null) {
                akt.mo392f();
            }
            this.f3925i.setVisibility(8);
        }
    }

    /* renamed from: e */
    public final void mo1927e() {
        bgz bgz = this.f3921e;
        String str = null;
        if (bgz == null || !this.f3922f) {
            setContentDescription(null);
        } else if (bgz.getVisibility() == 0) {
            if (this.f3932p) {
                str = getResources().getString(R.string.exo_controls_hide);
            }
            setContentDescription(str);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    /* renamed from: d */
    public final void mo1925d() {
        if (this.f3926j != null) {
            akt akt = this.f3928l;
            if (akt != null) {
                akt.mo392f();
            }
            this.f3926j.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo1922b(boolean z) {
        byte[] bArr;
        int i;
        akt akt = this.f3928l;
        if (akt != null) {
            ald ald = (ald) akt;
            ald.mo523u();
            if (ald.f644b.f491p.f618h.f2751b != 0) {
                if (z) {
                    m3238g();
                }
                ald ald2 = (ald) this.f3928l;
                ald2.mo523u();
                bgm bgm = ald2.f644b.f491p.f619i.f3835c;
                for (int i2 = 0; i2 < bgm.f3809a; i2++) {
                    ald ald3 = (ald) this.f3928l;
                    ald3.mo523u();
                    if (ald3.f644b.f477b[i2].mo344a() == 2 && bgm.mo1861a(i2) != null) {
                        m3237f();
                        return;
                    }
                }
                m3238g();
                if (this.f3929m) {
                    for (int i3 = 0; i3 < bgm.f3809a; i3++) {
                        bgl a = bgm.mo1861a(i3);
                        if (a != null) {
                            for (int i4 = 0; i4 < a.mo1835f(); i4++) {
                                atw atw = a.mo1828a(i4).f554g;
                                if (atw != null) {
                                    int i5 = 0;
                                    int i6 = -1;
                                    boolean z2 = false;
                                    while (i5 < atw.mo1344a()) {
                                        atv a2 = atw.mo1345a(i5);
                                        if (a2 instanceof aup) {
                                            aup aup = (aup) a2;
                                            bArr = aup.f2458b;
                                            i = aup.f2457a;
                                        } else if (a2 instanceof aui) {
                                            aui aui = (aui) a2;
                                            bArr = aui.f2440b;
                                            i = aui.f2439a;
                                        } else {
                                            continue;
                                            i5++;
                                        }
                                        if (i6 == -1 || i == 3) {
                                            z2 = m3236a(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                                            if (i == 3) {
                                                break;
                                            }
                                            i6 = i;
                                            i5++;
                                        } else {
                                            i5++;
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
                    if (m3236a((Drawable) null)) {
                        return;
                    }
                }
                m3237f();
                return;
            }
        }
        m3237f();
        m3238g();
    }
}
