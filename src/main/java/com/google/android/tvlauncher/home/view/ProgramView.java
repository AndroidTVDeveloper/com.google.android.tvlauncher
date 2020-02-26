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

    /* renamed from: a */
    public cuz f6565a;

    /* renamed from: b */
    public View f6566b;

    /* renamed from: c */
    public ImageView f6567c;

    /* renamed from: d */
    public ImageView f6568d;

    /* renamed from: e */
    public cux f6569e;

    /* renamed from: f */
    public View f6570f;

    /* renamed from: g */
    public View f6571g;

    /* renamed from: h */
    public ProgressBar f6572h;

    /* renamed from: i */
    public View f6573i;

    /* renamed from: j */
    public View f6574j;

    /* renamed from: k */
    public ImageView f6575k;

    /* renamed from: l */
    public int f6576l;

    /* renamed from: m */
    public View f6577m;

    /* renamed from: n */
    public int f6578n;

    /* renamed from: o */
    public TextView f6579o;

    /* renamed from: p */
    public int f6580p;

    /* renamed from: q */
    public ImageView f6581q;

    /* renamed from: r */
    public int f6582r;

    /* renamed from: s */
    public TextView f6583s;

    /* renamed from: t */
    public int f6584t;

    public ProgramView(Context context) {
        this(context, null);
    }

    public ProgramView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProgramView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f6566b = findViewById(R.id.preview_image_container);
        this.f6567c = (ImageView) findViewById(R.id.preview_image_background);
        this.f6568d = (ImageView) findViewById(R.id.preview_image);
        this.f6570f = findViewById(R.id.preview_video_view);
        this.f6571g = findViewById(R.id.preview_delay_progress);
        this.f6572h = (ProgressBar) findViewById(R.id.playback_progress);
        this.f6573i = findViewById(R.id.program_playback_progress_dimmer);
        this.f6574j = findViewById(R.id.program_logo_and_badges_container);
        ImageView imageView = (ImageView) findViewById(R.id.program_card_logo);
        this.f6575k = imageView;
        this.f6576l = imageView.getVisibility();
        if (dcy.m6191a(getContext())) {
            this.f6575k.setScaleType(ImageView.ScaleType.FIT_END);
        }
        View findViewById = findViewById(R.id.program_logo_dimmer);
        this.f6577m = findViewById;
        this.f6578n = findViewById.getVisibility();
        TextView textView = (TextView) findViewById(R.id.program_live_badge);
        this.f6579o = textView;
        this.f6580p = textView.getVisibility();
        ImageView imageView2 = (ImageView) findViewById(R.id.program_live_icon);
        this.f6581q = imageView2;
        this.f6582r = imageView2.getVisibility();
        TextView textView2 = (TextView) findViewById(R.id.program_duration_badge);
        this.f6583s = textView2;
        this.f6584t = textView2.getVisibility();
        View view = (View) this.f6579o.getParent();
        view.setOutlineProvider(new cuy());
        view.setClipToOutline(true);
        this.f6569e = new cux(this.f6568d, dcy.m6184a(getResources(), (int) R.dimen.unfocused_channel_dimming_factor1), dcy.m6184a(getResources(), (int) R.dimen.unfocused_channel_dimming_factor2));
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        daw daw;
        super.onWindowVisibilityChanged(i);
        cuz cuz = this.f6565a;
        if (cuz == null) {
            return;
        }
        if ((i == 4 || i == 8) && (daw = ((crz) cuz).f7149r) != null && daw.f8105o) {
            daw.mo4051a();
        }
    }

    /* renamed from: f */
    public final void mo3407f(int i) {
        this.f6584t = i;
        this.f6583s.setVisibility(i);
    }

    /* renamed from: d */
    public final void mo3405d(int i) {
        this.f6580p = i;
        this.f6579o.setVisibility(i);
    }

    /* renamed from: e */
    public final void mo3406e(int i) {
        this.f6582r = i;
        this.f6581q.setVisibility(i);
    }

    /* renamed from: c */
    public final void mo3404c(int i) {
        this.f6578n = i;
        this.f6577m.setVisibility(i);
    }

    /* renamed from: b */
    public final void mo3403b(int i) {
        this.f6576l = i;
        this.f6575k.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo3402a(int i) {
        this.f6569e.mo3780a(i);
    }
}
