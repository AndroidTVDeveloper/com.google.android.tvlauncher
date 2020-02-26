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
    private final ImageView a;
    private final ImageView b;
    private final ImageView c;
    private final ObjectAnimator d;
    private final ObjectAnimator e;
    private final ObjectAnimator f;
    private final LinearInterpolator g = new LinearInterpolator();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, androidx.leanback.widget.MediaNowPlayingView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public MediaNowPlayingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate((int) R.layout.lb_playback_now_playing_bars, (ViewGroup) this, true);
        this.a = (ImageView) findViewById(R.id.bar1);
        this.b = (ImageView) findViewById(R.id.bar2);
        this.c = (ImageView) findViewById(R.id.bar3);
        ImageView imageView = this.a;
        imageView.setPivotY((float) imageView.getDrawable().getIntrinsicHeight());
        ImageView imageView2 = this.b;
        imageView2.setPivotY((float) imageView2.getDrawable().getIntrinsicHeight());
        ImageView imageView3 = this.c;
        imageView3.setPivotY((float) imageView3.getDrawable().getIntrinsicHeight());
        a(this.a);
        a(this.b);
        a(this.c);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.a, "scaleY", 0.41666666f, 0.25f, 0.41666666f, 0.5833333f, 0.75f, 0.8333333f, 0.9166667f, 1.0f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.5f, 0.33333334f, 0.16666667f, 0.33333334f, 0.5f, 0.5833333f, 0.75f, 0.9166667f, 0.75f, 0.5833333f, 0.41666666f, 0.25f, 0.41666666f, 0.6666667f, 0.41666666f, 0.25f, 0.33333334f, 0.41666666f);
        this.d = ofFloat;
        ofFloat.setRepeatCount(-1);
        this.d.setDuration(2320L);
        this.d.setInterpolator(this.g);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.b, "scaleY", 1.0f, 0.9166667f, 0.8333333f, 0.9166667f, 1.0f, 0.9166667f, 0.75f, 0.5833333f, 0.75f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.8333333f, 1.0f, 0.9166667f, 0.75f, 0.41666666f, 0.25f, 0.41666666f, 0.6666667f, 0.8333333f, 1.0f, 0.8333333f, 0.75f, 0.6666667f, 1.0f);
        this.e = ofFloat2;
        ofFloat2.setRepeatCount(-1);
        this.e.setDuration(2080L);
        this.e.setInterpolator(this.g);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.c, "scaleY", 0.6666667f, 0.75f, 0.8333333f, 1.0f, 0.9166667f, 0.75f, 0.5833333f, 0.41666666f, 0.5833333f, 0.6666667f, 0.75f, 1.0f, 0.9166667f, 1.0f, 0.75f, 0.5833333f, 0.75f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.75f, 0.5833333f, 0.41666666f, 0.25f, 0.6666667f);
        this.f = ofFloat3;
        ofFloat3.setRepeatCount(-1);
        this.f.setDuration(2000L);
        this.f.setInterpolator(this.g);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    private static void a(View view) {
        view.setScaleY(0.083333336f);
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            b();
        } else {
            a();
        }
    }

    private final void a() {
        a(this.d);
        a(this.e);
        a(this.f);
        this.a.setVisibility(0);
        this.b.setVisibility(0);
        this.c.setVisibility(0);
    }

    private static final void a(Animator animator) {
        if (!animator.isStarted()) {
            animator.start();
        }
    }

    private final void b() {
        a(this.d, this.a);
        a(this.e, this.b);
        a(this.f, this.c);
        this.a.setVisibility(8);
        this.b.setVisibility(8);
        this.c.setVisibility(8);
    }

    private static final void a(Animator animator, View view) {
        if (animator.isStarted()) {
            animator.cancel();
            a(view);
        }
    }
}
