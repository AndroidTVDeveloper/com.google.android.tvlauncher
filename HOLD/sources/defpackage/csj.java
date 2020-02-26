package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.home.view.WatchNextInfoView;

/* renamed from: csj  reason: default package */
/* compiled from: PG */
final class csj {
    private final int A;
    private final int B;
    private final int C;
    private final float D;
    private final int E;
    private final int F;
    private final int G;
    private final int H;
    private final float I;
    private final float J;
    private final float K;
    private final float L;
    public final WatchNextInfoView a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final float i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final float u;
    public final int v;
    public final int w;
    public final ctq x;
    public int y;
    private final View z;

    public csj(WatchNextInfoView watchNextInfoView, ctq ctq) {
        this.a = watchNextInfoView;
        this.z = watchNextInfoView.a;
        this.b = watchNextInfoView.b;
        this.c = watchNextInfoView.c;
        this.d = watchNextInfoView.d;
        this.x = ctq;
        Context context = watchNextInfoView.getContext();
        Resources resources = context.getResources();
        this.A = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_container_default_margin_horizontal);
        this.f = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_default_icon_size);
        this.g = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_default_title_margin_start);
        this.h = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_default_title_width);
        this.i = resources.getDimension(R.dimen.watch_next_info_card_default_title_text_size);
        this.j = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_default_message_margin_top);
        this.k = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_default_message_width);
        this.C = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_container_width_change_ignored_threshold);
        this.B = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_container_selected_margin_offset);
        this.l = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_selected_icon_size);
        this.m = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_selected_title_margin_start);
        this.n = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_selected_title_width);
        this.o = resources.getDimension(R.dimen.watch_next_info_card_selected_title_text_size);
        this.p = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_selected_message_margin_top);
        this.q = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_selected_message_width);
        this.r = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_zoomed_out_icon_size);
        this.s = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_zoomed_out_title_margin_start);
        this.t = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_zoomed_out_title_width);
        this.u = resources.getDimension(R.dimen.watch_next_info_card_zoomed_out_title_text_size);
        this.v = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_zoomed_out_message_margin_top);
        this.w = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_zoomed_out_message_width);
        this.D = resources.getFraction(R.fraction.watch_next_info_card_content_container_focused_scale, 1, 1);
        this.E = context.getColor(R.color.watch_next_info_card_focused_color);
        this.F = context.getColor(R.color.watch_next_info_card_unfocused_color);
        this.G = context.getColor(R.color.watch_next_info_card_dimmed_color1);
        this.H = context.getColor(R.color.watch_next_info_card_dimmed_color2);
        this.I = dcy.a(context.getResources(), (int) R.dimen.watch_next_info_icon_focused_alpha);
        this.J = dcy.a(context.getResources(), (int) R.dimen.watch_next_info_icon_unfocused_alpha);
        this.K = dcy.a(context.getResources(), (int) R.dimen.watch_next_info_icon_dimmed_alpha1);
        this.L = dcy.a(context.getResources(), (int) R.dimen.watch_next_info_icon_dimmed_alpha2);
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2) {
        this.e = this.y == 4 && this.a.isFocused();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.z.getLayoutParams();
        int i2 = this.y;
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 13:
                marginLayoutParams.setMarginStart(this.A);
                marginLayoutParams.setMarginEnd(this.A);
                this.z.setScaleX(1.0f);
                this.z.setScaleY(1.0f);
                this.z.setAlpha(1.0f);
                break;
            case 4:
            case 5:
                float f3 = f2 + ((float) this.B);
                if (this.e) {
                    marginLayoutParams.setMarginStart(this.A);
                    float f4 = ((float) this.q) * (this.D - 4.0f);
                    float f5 = (((float) this.A) - f3) + f4;
                    if (Math.abs(f5) < ((float) this.C)) {
                        f4 -= f5;
                    }
                    marginLayoutParams.setMarginEnd((int) (((float) this.A) + f4));
                    this.z.setScaleX(this.D);
                    this.z.setScaleY(this.D);
                } else {
                    marginLayoutParams.setMarginStart((int) f3);
                    marginLayoutParams.setMarginEnd(this.A);
                    this.z.setScaleX(1.0f);
                    this.z.setScaleY(1.0f);
                }
                this.z.setAlpha(1.0f);
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
                marginLayoutParams.setMarginStart(0);
                marginLayoutParams.setMarginEnd(0);
                this.z.setScaleX(1.0f);
                this.z.setScaleY(1.0f);
                this.z.setAlpha(0.0f);
                break;
            case 10:
            case 12:
                String valueOf = String.valueOf(dej.b(i2));
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Unsupported Watch Next program state: ") : "Unsupported Watch Next program state: ".concat(valueOf));
        }
        this.z.setLayoutParams(marginLayoutParams);
        int i3 = this.y;
        if (i3 == 0 || i3 == 13 || i3 == 1 || i3 == 8) {
            this.b.setAlpha(this.K);
            this.c.setTextColor(this.G);
            this.d.setTextColor(this.G);
        } else if (i3 == 2) {
            this.b.setAlpha(this.L);
            this.c.setTextColor(this.H);
            this.d.setTextColor(this.H);
        } else if (!this.e) {
            this.b.setAlpha(this.J);
            this.c.setTextColor(this.F);
            this.d.setTextColor(this.F);
        } else {
            this.b.setAlpha(this.I);
            this.c.setTextColor(this.E);
            this.d.setTextColor(this.E);
        }
    }
}
