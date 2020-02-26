package p000;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.home.view.WatchNextInfoView;

/* renamed from: csj */
/* compiled from: PG */
final class csj {

    /* renamed from: A */
    private final int f7200A;

    /* renamed from: B */
    private final int f7201B;

    /* renamed from: C */
    private final int f7202C;

    /* renamed from: D */
    private final float f7203D;

    /* renamed from: E */
    private final int f7204E;

    /* renamed from: F */
    private final int f7205F;

    /* renamed from: G */
    private final int f7206G;

    /* renamed from: H */
    private final int f7207H;

    /* renamed from: I */
    private final float f7208I;

    /* renamed from: J */
    private final float f7209J;

    /* renamed from: K */
    private final float f7210K;

    /* renamed from: L */
    private final float f7211L;

    /* renamed from: a */
    public final WatchNextInfoView f7212a;

    /* renamed from: b */
    public final ImageView f7213b;

    /* renamed from: c */
    public final TextView f7214c;

    /* renamed from: d */
    public final TextView f7215d;

    /* renamed from: e */
    public boolean f7216e;

    /* renamed from: f */
    public final int f7217f;

    /* renamed from: g */
    public final int f7218g;

    /* renamed from: h */
    public final int f7219h;

    /* renamed from: i */
    public final float f7220i;

    /* renamed from: j */
    public final int f7221j;

    /* renamed from: k */
    public final int f7222k;

    /* renamed from: l */
    public final int f7223l;

    /* renamed from: m */
    public final int f7224m;

    /* renamed from: n */
    public final int f7225n;

    /* renamed from: o */
    public final float f7226o;

    /* renamed from: p */
    public final int f7227p;

    /* renamed from: q */
    public final int f7228q;

    /* renamed from: r */
    public final int f7229r;

    /* renamed from: s */
    public final int f7230s;

    /* renamed from: t */
    public final int f7231t;

    /* renamed from: u */
    public final float f7232u;

    /* renamed from: v */
    public final int f7233v;

    /* renamed from: w */
    public final int f7234w;

    /* renamed from: x */
    public final ctq f7235x;

    /* renamed from: y */
    public int f7236y;

    /* renamed from: z */
    private final View f7237z;

    public csj(WatchNextInfoView watchNextInfoView, ctq ctq) {
        this.f7212a = watchNextInfoView;
        this.f7237z = watchNextInfoView.f6589a;
        this.f7213b = watchNextInfoView.f6590b;
        this.f7214c = watchNextInfoView.f6591c;
        this.f7215d = watchNextInfoView.f6592d;
        this.f7235x = ctq;
        Context context = watchNextInfoView.getContext();
        Resources resources = context.getResources();
        this.f7200A = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_container_default_margin_horizontal);
        this.f7217f = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_default_icon_size);
        this.f7218g = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_default_title_margin_start);
        this.f7219h = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_default_title_width);
        this.f7220i = resources.getDimension(R.dimen.watch_next_info_card_default_title_text_size);
        this.f7221j = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_default_message_margin_top);
        this.f7222k = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_default_message_width);
        this.f7202C = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_container_width_change_ignored_threshold);
        this.f7201B = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_container_selected_margin_offset);
        this.f7223l = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_selected_icon_size);
        this.f7224m = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_selected_title_margin_start);
        this.f7225n = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_selected_title_width);
        this.f7226o = resources.getDimension(R.dimen.watch_next_info_card_selected_title_text_size);
        this.f7227p = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_selected_message_margin_top);
        this.f7228q = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_selected_message_width);
        this.f7229r = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_zoomed_out_icon_size);
        this.f7230s = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_zoomed_out_title_margin_start);
        this.f7231t = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_zoomed_out_title_width);
        this.f7232u = resources.getDimension(R.dimen.watch_next_info_card_zoomed_out_title_text_size);
        this.f7233v = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_zoomed_out_message_margin_top);
        this.f7234w = resources.getDimensionPixelSize(R.dimen.watch_next_info_card_zoomed_out_message_width);
        this.f7203D = resources.getFraction(R.fraction.watch_next_info_card_content_container_focused_scale, 1, 1);
        this.f7204E = context.getColor(R.color.watch_next_info_card_focused_color);
        this.f7205F = context.getColor(R.color.watch_next_info_card_unfocused_color);
        this.f7206G = context.getColor(R.color.watch_next_info_card_dimmed_color1);
        this.f7207H = context.getColor(R.color.watch_next_info_card_dimmed_color2);
        this.f7208I = dcy.m6184a(context.getResources(), (int) R.dimen.watch_next_info_icon_focused_alpha);
        this.f7209J = dcy.m6184a(context.getResources(), (int) R.dimen.watch_next_info_icon_unfocused_alpha);
        this.f7210K = dcy.m6184a(context.getResources(), (int) R.dimen.watch_next_info_icon_dimmed_alpha1);
        this.f7211L = dcy.m6184a(context.getResources(), (int) R.dimen.watch_next_info_icon_dimmed_alpha2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3705a(float f) {
        this.f7216e = this.f7236y == 4 && this.f7212a.isFocused();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7237z.getLayoutParams();
        int i = this.f7236y;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 13:
                marginLayoutParams.setMarginStart(this.f7200A);
                marginLayoutParams.setMarginEnd(this.f7200A);
                this.f7237z.setScaleX(1.0f);
                this.f7237z.setScaleY(1.0f);
                this.f7237z.setAlpha(1.0f);
                break;
            case 4:
            case 5:
                float f2 = f + ((float) this.f7201B);
                if (this.f7216e) {
                    marginLayoutParams.setMarginStart(this.f7200A);
                    float f3 = ((float) this.f7228q) * (this.f7203D - 4.0f);
                    float f4 = (((float) this.f7200A) - f2) + f3;
                    if (Math.abs(f4) < ((float) this.f7202C)) {
                        f3 -= f4;
                    }
                    marginLayoutParams.setMarginEnd((int) (((float) this.f7200A) + f3));
                    this.f7237z.setScaleX(this.f7203D);
                    this.f7237z.setScaleY(this.f7203D);
                } else {
                    marginLayoutParams.setMarginStart((int) f2);
                    marginLayoutParams.setMarginEnd(this.f7200A);
                    this.f7237z.setScaleX(1.0f);
                    this.f7237z.setScaleY(1.0f);
                }
                this.f7237z.setAlpha(1.0f);
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
                marginLayoutParams.setMarginStart(0);
                marginLayoutParams.setMarginEnd(0);
                this.f7237z.setScaleX(1.0f);
                this.f7237z.setScaleY(1.0f);
                this.f7237z.setAlpha(0.0f);
                break;
            case 10:
            case 12:
                String valueOf = String.valueOf(dej.m6253b(i));
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Unsupported Watch Next program state: ") : "Unsupported Watch Next program state: ".concat(valueOf));
        }
        this.f7237z.setLayoutParams(marginLayoutParams);
        int i2 = this.f7236y;
        if (i2 == 0 || i2 == 13 || i2 == 1 || i2 == 8) {
            this.f7213b.setAlpha(this.f7210K);
            this.f7214c.setTextColor(this.f7206G);
            this.f7215d.setTextColor(this.f7206G);
        } else if (i2 == 2) {
            this.f7213b.setAlpha(this.f7211L);
            this.f7214c.setTextColor(this.f7207H);
            this.f7215d.setTextColor(this.f7207H);
        } else if (!this.f7216e) {
            this.f7213b.setAlpha(this.f7209J);
            this.f7214c.setTextColor(this.f7205F);
            this.f7215d.setTextColor(this.f7205F);
        } else {
            this.f7213b.setAlpha(this.f7208I);
            this.f7214c.setTextColor(this.f7204E);
            this.f7215d.setTextColor(this.f7204E);
        }
    }
}
