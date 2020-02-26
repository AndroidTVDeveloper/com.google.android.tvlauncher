package p000;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.home.view.ConfigureChannelsRowView;

/* renamed from: cov */
/* compiled from: PG */
final class cov implements cqz {

    /* renamed from: a */
    public final ConfigureChannelsRowView f6841a;

    /* renamed from: b */
    public final View f6842b;

    /* renamed from: c */
    public cri f6843c;

    /* renamed from: d */
    public final int f6844d;

    /* renamed from: e */
    public final int f6845e;

    /* renamed from: f */
    public final int f6846f;

    /* renamed from: g */
    public final int f6847g;

    /* renamed from: h */
    public final int f6848h;

    /* renamed from: i */
    public final int f6849i;

    /* renamed from: j */
    public final int f6850j;

    /* renamed from: k */
    public final float f6851k;

    /* renamed from: l */
    public final int f6852l;

    /* renamed from: m */
    public final int f6853m;

    public cov(ConfigureChannelsRowView configureChannelsRowView) {
        this.f6841a = configureChannelsRowView;
        TextView textView = configureChannelsRowView.f6554a;
        this.f6842b = textView;
        textView.setOnClickListener(cot.f6839a);
        Resources resources = configureChannelsRowView.getContext().getResources();
        this.f6851k = resources.getFraction(R.fraction.home_configure_channels_button_focused_scale, 1, 1);
        cou cou = new cou(this);
        if (dcy.m6195d(this.f6841a.getContext())) {
            this.f6842b.setOnFocusChangeListener(cou);
        } else {
            dcw dcw = new dcw(resources.getInteger(R.integer.home_configure_channels_button_focused_animation_duration_ms), this.f6851k, 0.0f, 1);
            dcw.mo4132a(this.f6842b);
            dcw.f8307d = cou;
        }
        this.f6844d = resources.getDimensionPixelSize(R.dimen.home_configure_channels_row_margin_top);
        this.f6845e = resources.getDimensionPixelSize(R.dimen.home_configure_channels_row_below_apps_row_margin_top);
        this.f6846f = resources.getDimensionPixelSize(R.dimen.home_configure_channels_row_zoomed_out_margin_top);
        this.f6847g = resources.getDimensionPixelSize(R.dimen.home_configure_channels_button_margin_default);
        this.f6848h = resources.getDimensionPixelSize(R.dimen.home_configure_channels_button_margin_zoomed_out);
        this.f6849i = resources.getDimensionPixelSize(R.dimen.home_configure_channels_button_margin_channel_actions);
        this.f6850j = resources.getDimensionPixelSize(R.dimen.home_configure_channels_button_margin_move_channel);
        this.f6852l = configureChannelsRowView.getContext().getColor(R.color.home_configure_channels_button_focused_background_color);
        this.f6853m = configureChannelsRowView.getContext().getColor(R.color.home_configure_channels_button_unfocused_background_color);
    }

    /* renamed from: a */
    public final View mo3472a() {
        return this.f6841a;
    }

    /* renamed from: a */
    public final void mo3473a(crh crh) {
    }

    /* renamed from: a */
    public final void mo3475a(crj crj) {
    }

    /* renamed from: a */
    public final void mo3477a(boolean z) {
    }

    /* renamed from: a */
    public final void mo3474a(cri cri) {
        this.f6843c = cri;
    }
}
