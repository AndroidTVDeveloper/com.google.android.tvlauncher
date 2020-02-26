package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.home.view.ConfigureChannelsRowView;

/* renamed from: cov  reason: default package */
/* compiled from: PG */
final class cov implements cqz {
    public final ConfigureChannelsRowView a;
    public final View b;
    public cri c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final int l;
    public final int m;

    public cov(ConfigureChannelsRowView configureChannelsRowView) {
        this.a = configureChannelsRowView;
        TextView textView = configureChannelsRowView.a;
        this.b = textView;
        textView.setOnClickListener(cot.a);
        Resources resources = configureChannelsRowView.getContext().getResources();
        this.k = resources.getFraction(R.fraction.home_configure_channels_button_focused_scale, 1, 1);
        cou cou = new cou(this);
        if (dcy.d(this.a.getContext())) {
            this.b.setOnFocusChangeListener(cou);
        } else {
            dcw dcw = new dcw(resources.getInteger(R.integer.home_configure_channels_button_focused_animation_duration_ms), this.k, 0.0f, 1);
            dcw.a(this.b);
            dcw.d = cou;
        }
        this.d = resources.getDimensionPixelSize(R.dimen.home_configure_channels_row_margin_top);
        this.e = resources.getDimensionPixelSize(R.dimen.home_configure_channels_row_below_apps_row_margin_top);
        this.f = resources.getDimensionPixelSize(R.dimen.home_configure_channels_row_zoomed_out_margin_top);
        this.g = resources.getDimensionPixelSize(R.dimen.home_configure_channels_button_margin_default);
        this.h = resources.getDimensionPixelSize(R.dimen.home_configure_channels_button_margin_zoomed_out);
        this.i = resources.getDimensionPixelSize(R.dimen.home_configure_channels_button_margin_channel_actions);
        this.j = resources.getDimensionPixelSize(R.dimen.home_configure_channels_button_margin_move_channel);
        this.l = configureChannelsRowView.getContext().getColor(R.color.home_configure_channels_button_focused_background_color);
        this.m = configureChannelsRowView.getContext().getColor(R.color.home_configure_channels_button_unfocused_background_color);
    }

    public final View a() {
        return this.a;
    }

    public final void a(crh crh) {
    }

    public final void a(crj crj) {
    }

    public final void a(boolean z) {
    }

    public final void a(cri cri) {
        this.c = cri;
    }
}
