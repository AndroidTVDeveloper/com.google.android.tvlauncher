package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.tvlauncher.R;

/* renamed from: csl  reason: default package */
/* compiled from: PG */
public final class csl {
    public final cja a = dbq.a(this.b);
    public final Context b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final Drawable w;
    private final View x;

    public csl(View view) {
        this.b = view.getContext();
        this.c = (TextView) view.findViewById(R.id.first);
        this.d = (TextView) view.findViewById(R.id.second);
        this.e = (TextView) view.findViewById(R.id.third);
        ImageView imageView = (ImageView) view.findViewById(R.id.program_logo);
        this.f = imageView;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = this.b.getResources().getDimensionPixelSize(R.dimen.program_meta_watch_next_logo_height);
        double d2 = (double) layoutParams.height;
        Double.isNaN(d2);
        layoutParams.width = (int) (d2 * 1.7777777777777777d);
        this.f.setLayoutParams(layoutParams);
        this.f.setOutlineProvider(new csk(this));
        this.f.setClipToOutline(true);
        this.c.setTextAppearance(2131951787);
        this.d.setTextAppearance(2131951792);
        this.x = view.findViewById(R.id.second_row_container);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f.getLayoutParams();
        layoutParams2.setMarginEnd(this.b.getResources().getDimensionPixelSize(R.dimen.program_meta_watch_next_logo_component_spacing));
        this.f.setLayoutParams(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.x.getLayoutParams();
        layoutParams3.topMargin = this.b.getResources().getDimensionPixelSize(R.dimen.program_meta_watch_next_second_row_margin_top);
        this.x.setLayoutParams(layoutParams3);
        this.g = this.b.getResources().getString(R.string.watch_next_type_continue_video_text);
        this.h = this.b.getResources().getString(R.string.watch_next_type_continue_music_text);
        this.i = this.b.getResources().getString(R.string.watch_next_type_continue_game_text);
        this.j = this.b.getResources().getString(R.string.watch_next_type_next_no_season_episode_text);
        this.k = this.b.getResources().getString(R.string.watch_next_type_next_season_episode_text);
        this.l = this.b.getResources().getString(R.string.watch_next_type_next_season_chapter_text);
        this.m = this.b.getResources().getString(R.string.watch_next_type_next_season_only_text);
        this.n = this.b.getResources().getString(R.string.watch_next_type_next_episode_only_text);
        this.o = this.b.getResources().getString(R.string.watch_next_type_next_chapter_only_text);
        this.p = this.b.getResources().getString(R.string.watch_next_type_new_no_season_episode_text);
        this.q = this.b.getResources().getString(R.string.watch_next_type_new_season_episode_text);
        this.r = this.b.getResources().getString(R.string.watch_next_type_new_season_chapter_text);
        this.s = this.b.getResources().getString(R.string.watch_next_type_new_season_only_text);
        this.t = this.b.getResources().getString(R.string.watch_next_type_new_episode_only_text);
        this.u = this.b.getResources().getString(R.string.watch_next_type_new_chapter_only_text);
        this.v = this.b.getResources().getString(R.string.play_next_type_watch_list_text);
        this.w = new ColorDrawable(bg.b(this.b, R.color.app_banner_background_color));
        this.e.setAutoSizeTextTypeUniformWithConfiguration(this.b.getResources().getDimensionPixelSize(R.dimen.text_size_h5), this.b.getResources().getDimensionPixelSize(R.dimen.text_size_b1), this.b.getResources().getDimensionPixelSize(R.dimen.last_program_meta_third_row_text_auto_size_step_granularity), 0);
    }

    public final void a() {
        this.c.setText((CharSequence) null);
        this.d.setText((CharSequence) null);
        this.e.setText((CharSequence) null);
        this.f.setImageDrawable(null);
        b();
    }

    private static final void a(View view, boolean z) {
        boolean z2;
        int i2 = 0;
        if (view.getVisibility() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 != z) {
            if (!z) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    public final void b() {
        TextView textView = this.c;
        boolean z = true;
        a(textView, textView.length() != 0);
        TextView textView2 = this.d;
        a(textView2, textView2.length() != 0);
        TextView textView3 = this.e;
        a(textView3, textView3.length() != 0);
        ImageView imageView = this.f;
        if (imageView.getDrawable() == null) {
            z = false;
        }
        a(imageView, z);
    }
}
