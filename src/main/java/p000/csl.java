package p000;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.tvlauncher.R;

/* renamed from: csl */
/* compiled from: PG */
public final class csl {

    /* renamed from: a */
    public final cja f7239a = dbq.m6093a(this.f7240b);

    /* renamed from: b */
    public final Context f7240b;

    /* renamed from: c */
    public final TextView f7241c;

    /* renamed from: d */
    public final TextView f7242d;

    /* renamed from: e */
    public final TextView f7243e;

    /* renamed from: f */
    public final ImageView f7244f;

    /* renamed from: g */
    public final String f7245g;

    /* renamed from: h */
    public final String f7246h;

    /* renamed from: i */
    public final String f7247i;

    /* renamed from: j */
    public final String f7248j;

    /* renamed from: k */
    public final String f7249k;

    /* renamed from: l */
    public final String f7250l;

    /* renamed from: m */
    public final String f7251m;

    /* renamed from: n */
    public final String f7252n;

    /* renamed from: o */
    public final String f7253o;

    /* renamed from: p */
    public final String f7254p;

    /* renamed from: q */
    public final String f7255q;

    /* renamed from: r */
    public final String f7256r;

    /* renamed from: s */
    public final String f7257s;

    /* renamed from: t */
    public final String f7258t;

    /* renamed from: u */
    public final String f7259u;

    /* renamed from: v */
    public final String f7260v;

    /* renamed from: w */
    public final Drawable f7261w;

    /* renamed from: x */
    private final View f7262x;

    public csl(View view) {
        this.f7240b = view.getContext();
        this.f7241c = (TextView) view.findViewById(R.id.first);
        this.f7242d = (TextView) view.findViewById(R.id.second);
        this.f7243e = (TextView) view.findViewById(R.id.third);
        ImageView imageView = (ImageView) view.findViewById(R.id.program_logo);
        this.f7244f = imageView;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = this.f7240b.getResources().getDimensionPixelSize(R.dimen.program_meta_watch_next_logo_height);
        double d = (double) layoutParams.height;
        Double.isNaN(d);
        layoutParams.width = (int) (d * 1.7777777777777777d);
        this.f7244f.setLayoutParams(layoutParams);
        this.f7244f.setOutlineProvider(new csk(this));
        this.f7244f.setClipToOutline(true);
        this.f7241c.setTextAppearance(2131951787);
        this.f7242d.setTextAppearance(2131951792);
        this.f7262x = view.findViewById(R.id.second_row_container);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f7244f.getLayoutParams();
        layoutParams2.setMarginEnd(this.f7240b.getResources().getDimensionPixelSize(R.dimen.program_meta_watch_next_logo_component_spacing));
        this.f7244f.setLayoutParams(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f7262x.getLayoutParams();
        layoutParams3.topMargin = this.f7240b.getResources().getDimensionPixelSize(R.dimen.program_meta_watch_next_second_row_margin_top);
        this.f7262x.setLayoutParams(layoutParams3);
        this.f7245g = this.f7240b.getResources().getString(R.string.watch_next_type_continue_video_text);
        this.f7246h = this.f7240b.getResources().getString(R.string.watch_next_type_continue_music_text);
        this.f7247i = this.f7240b.getResources().getString(R.string.watch_next_type_continue_game_text);
        this.f7248j = this.f7240b.getResources().getString(R.string.watch_next_type_next_no_season_episode_text);
        this.f7249k = this.f7240b.getResources().getString(R.string.watch_next_type_next_season_episode_text);
        this.f7250l = this.f7240b.getResources().getString(R.string.watch_next_type_next_season_chapter_text);
        this.f7251m = this.f7240b.getResources().getString(R.string.watch_next_type_next_season_only_text);
        this.f7252n = this.f7240b.getResources().getString(R.string.watch_next_type_next_episode_only_text);
        this.f7253o = this.f7240b.getResources().getString(R.string.watch_next_type_next_chapter_only_text);
        this.f7254p = this.f7240b.getResources().getString(R.string.watch_next_type_new_no_season_episode_text);
        this.f7255q = this.f7240b.getResources().getString(R.string.watch_next_type_new_season_episode_text);
        this.f7256r = this.f7240b.getResources().getString(R.string.watch_next_type_new_season_chapter_text);
        this.f7257s = this.f7240b.getResources().getString(R.string.watch_next_type_new_season_only_text);
        this.f7258t = this.f7240b.getResources().getString(R.string.watch_next_type_new_episode_only_text);
        this.f7259u = this.f7240b.getResources().getString(R.string.watch_next_type_new_chapter_only_text);
        this.f7260v = this.f7240b.getResources().getString(R.string.play_next_type_watch_list_text);
        this.f7261w = new ColorDrawable(C0035bg.m3116b(this.f7240b, R.color.app_banner_background_color));
        this.f7243e.setAutoSizeTextTypeUniformWithConfiguration(this.f7240b.getResources().getDimensionPixelSize(R.dimen.text_size_h5), this.f7240b.getResources().getDimensionPixelSize(R.dimen.text_size_b1), this.f7240b.getResources().getDimensionPixelSize(R.dimen.last_program_meta_third_row_text_auto_size_step_granularity), 0);
    }

    /* renamed from: a */
    public final void mo3707a() {
        this.f7241c.setText((CharSequence) null);
        this.f7242d.setText((CharSequence) null);
        this.f7243e.setText((CharSequence) null);
        this.f7244f.setImageDrawable(null);
        mo3708b();
    }

    /* renamed from: a */
    private static final void m5628a(View view, boolean z) {
        boolean z2;
        int i = 0;
        if (view.getVisibility() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 != z) {
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: b */
    public final void mo3708b() {
        TextView textView = this.f7241c;
        boolean z = true;
        m5628a(textView, textView.length() != 0);
        TextView textView2 = this.f7242d;
        m5628a(textView2, textView2.length() != 0);
        TextView textView3 = this.f7243e;
        m5628a(textView3, textView3.length() != 0);
        ImageView imageView = this.f7244f;
        if (imageView.getDrawable() == null) {
            z = false;
        }
        m5628a(imageView, z);
    }
}
