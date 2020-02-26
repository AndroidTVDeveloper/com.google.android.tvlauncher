package com.google.android.tvlauncher.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class ProgramView extends FrameLayout {
    public cuz a;
    public View b;
    public ImageView c;
    public ImageView d;
    public cux e;
    public View f;
    public View g;
    public ProgressBar h;
    public View i;
    public View j;
    public ImageView k;
    public int l;
    public View m;
    public int n;
    public TextView o;
    public int p;
    public ImageView q;
    public int r;
    public TextView s;
    public int t;

    public ProgramView(Context context) {
        this(context, null);
    }

    public ProgramView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProgramView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.b = findViewById(R.id.preview_image_container);
        this.c = (ImageView) findViewById(R.id.preview_image_background);
        this.d = (ImageView) findViewById(R.id.preview_image);
        this.f = findViewById(R.id.preview_video_view);
        this.g = findViewById(R.id.preview_delay_progress);
        this.h = (ProgressBar) findViewById(R.id.playback_progress);
        this.i = findViewById(R.id.program_playback_progress_dimmer);
        this.j = findViewById(R.id.program_logo_and_badges_container);
        ImageView imageView = (ImageView) findViewById(R.id.program_card_logo);
        this.k = imageView;
        this.l = imageView.getVisibility();
        if (dcy.a(getContext())) {
            this.k.setScaleType(ImageView.ScaleType.FIT_END);
        }
        View findViewById = findViewById(R.id.program_logo_dimmer);
        this.m = findViewById;
        this.n = findViewById.getVisibility();
        TextView textView = (TextView) findViewById(R.id.program_live_badge);
        this.o = textView;
        this.p = textView.getVisibility();
        ImageView imageView2 = (ImageView) findViewById(R.id.program_live_icon);
        this.q = imageView2;
        this.r = imageView2.getVisibility();
        TextView textView2 = (TextView) findViewById(R.id.program_duration_badge);
        this.s = textView2;
        this.t = textView2.getVisibility();
        View view = (View) this.o.getParent();
        view.setOutlineProvider(new cuy());
        view.setClipToOutline(true);
        this.e = new cux(this.d, dcy.a(getResources(), (int) R.dimen.unfocused_channel_dimming_factor1), dcy.a(getResources(), (int) R.dimen.unfocused_channel_dimming_factor2));
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i2) {
        daw daw;
        super.onWindowVisibilityChanged(i2);
        cuz cuz = this.a;
        if (cuz == null) {
            return;
        }
        if ((i2 == 4 || i2 == 8) && (daw = ((crz) cuz).r) != null && daw.o) {
            daw.a();
        }
    }

    public final void f(int i2) {
        this.t = i2;
        this.s.setVisibility(i2);
    }

    public final void d(int i2) {
        this.p = i2;
        this.o.setVisibility(i2);
    }

    public final void e(int i2) {
        this.r = i2;
        this.q.setVisibility(i2);
    }

    public final void c(int i2) {
        this.n = i2;
        this.m.setVisibility(i2);
    }

    public final void b(int i2) {
        this.l = i2;
        this.k.setVisibility(i2);
    }

    public final void a(int i2) {
        this.e.a(i2);
    }
}
