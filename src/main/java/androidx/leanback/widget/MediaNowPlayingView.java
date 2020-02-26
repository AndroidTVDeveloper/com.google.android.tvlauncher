package androidx.leanback.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class MediaNowPlayingView extends LinearLayout {

    /* renamed from: a */
    private final ImageView f1202a;

    /* renamed from: b */
    private final ImageView f1203b;

    /* renamed from: c */
    private final ImageView f1204c;

    /* renamed from: d */
    private final ObjectAnimator f1205d;

    /* renamed from: e */
    private final ObjectAnimator f1206e;

    /* renamed from: f */
    private final ObjectAnimator f1207f;

    /* renamed from: g */
    private final LinearInterpolator f1208g = new LinearInterpolator();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, androidx.leanback.widget.MediaNowPlayingView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public MediaNowPlayingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate((int) R.layout.lb_playback_now_playing_bars, (ViewGroup) this, true);
        this.f1202a = (ImageView) findViewById(R.id.bar1);
        this.f1203b = (ImageView) findViewById(R.id.bar2);
        this.f1204c = (ImageView) findViewById(R.id.bar3);
        ImageView imageView = this.f1202a;
        imageView.setPivotY((float) imageView.getDrawable().getIntrinsicHeight());
        ImageView imageView2 = this.f1203b;
        imageView2.setPivotY((float) imageView2.getDrawable().getIntrinsicHeight());
        ImageView imageView3 = this.f1204c;
        imageView3.setPivotY((float) imageView3.getDrawable().getIntrinsicHeight());
        m1409a(this.f1202a);
        m1409a(this.f1203b);
        m1409a(this.f1204c);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f1202a, "scaleY", 0.41666666f, 0.25f, 0.41666666f, 0.5833333f, 0.75f, 0.8333333f, 0.9166667f, 1.0f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.5f, 0.33333334f, 0.16666667f, 0.33333334f, 0.5f, 0.5833333f, 0.75f, 0.9166667f, 0.75f, 0.5833333f, 0.41666666f, 0.25f, 0.41666666f, 0.6666667f, 0.41666666f, 0.25f, 0.33333334f, 0.41666666f);
        this.f1205d = ofFloat;
        ofFloat.setRepeatCount(-1);
        this.f1205d.setDuration(2320L);
        this.f1205d.setInterpolator(this.f1208g);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f1203b, "scaleY", 1.0f, 0.9166667f, 0.8333333f, 0.9166667f, 1.0f, 0.9166667f, 0.75f, 0.5833333f, 0.75f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.8333333f, 1.0f, 0.9166667f, 0.75f, 0.41666666f, 0.25f, 0.41666666f, 0.6666667f, 0.8333333f, 1.0f, 0.8333333f, 0.75f, 0.6666667f, 1.0f);
        this.f1206e = ofFloat2;
        ofFloat2.setRepeatCount(-1);
        this.f1206e.setDuration(2080L);
        this.f1206e.setInterpolator(this.f1208g);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f1204c, "scaleY", 0.6666667f, 0.75f, 0.8333333f, 1.0f, 0.9166667f, 0.75f, 0.5833333f, 0.41666666f, 0.5833333f, 0.6666667f, 0.75f, 1.0f, 0.9166667f, 1.0f, 0.75f, 0.5833333f, 0.75f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.75f, 0.5833333f, 0.41666666f, 0.25f, 0.6666667f);
        this.f1207f = ofFloat3;
        ofFloat3.setRepeatCount(-1);
        this.f1207f.setDuration(2000L);
        this.f1207f.setInterpolator(this.f1208g);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            m1406a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1410b();
    }

    /* renamed from: a */
    private static void m1409a(View view) {
        view.setScaleY(0.083333336f);
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            m1410b();
        } else {
            m1406a();
        }
    }

    /* renamed from: a */
    private final void m1406a() {
        m1407a(this.f1205d);
        m1407a(this.f1206e);
        m1407a(this.f1207f);
        this.f1202a.setVisibility(0);
        this.f1203b.setVisibility(0);
        this.f1204c.setVisibility(0);
    }

    /* renamed from: a */
    private static final void m1407a(Animator animator) {
        if (!animator.isStarted()) {
            animator.start();
        }
    }

    /* renamed from: b */
    private final void m1410b() {
        m1408a(this.f1205d, this.f1202a);
        m1408a(this.f1206e, this.f1203b);
        m1408a(this.f1207f, this.f1204c);
        this.f1202a.setVisibility(8);
        this.f1203b.setVisibility(8);
        this.f1204c.setVisibility(8);
    }

    /* renamed from: a */
    private static final void m1408a(Animator animator, View view) {
        if (animator.isStarted()) {
            animator.cancel();
            m1409a(view);
        }
    }
}
