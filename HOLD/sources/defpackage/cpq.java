package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import androidx.leanback.widget.HorizontalGridView;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.appsview.AppsViewActivity;
import com.google.android.tvlauncher.home.view.ChannelView;

/* renamed from: cpq  reason: default package */
/* compiled from: PG */
final class cpq implements cqz, cuo, cuq, cex, cez, cey, cew, csf {
    public final ChannelView a;
    public final HorizontalGridView b;
    public final cfp c;
    public cpo d = null;
    public cse e;
    public final cpr f;
    public cew g;
    public cey h;
    public csf i;
    private final int j;
    private final int k;
    private boolean l;
    private cri m;
    private crj n;
    private final ctr o;

    public cpq(ChannelView channelView, cfp cfp) {
        ctr ctr = new ctr(channelView.b);
        this.a = channelView;
        this.c = cfp;
        this.o = ctr;
        channelView.a(this);
        ChannelView channelView2 = this.a;
        channelView2.O = this;
        channelView2.B = false;
        channelView2.C = false;
        channelView2.d();
        ChannelView channelView3 = this.a;
        channelView3.E = false;
        Context context = channelView.getContext();
        SparseArray sparseArray = new SparseArray();
        Resources resources = context.getResources();
        ctk ctk = new ctk();
        ctk.a = resources.getDimensionPixelSize(R.dimen.home_app_banner_height);
        ctk.b = resources.getDimensionPixelSize(R.dimen.home_app_banner_default_margin_top);
        ctk.c = resources.getDimensionPixelSize(R.dimen.home_app_banner_default_margin_bottom);
        ctk.f = resources.getDimensionPixelSize(R.dimen.home_app_channel_logo_default_alignment_origin_margin);
        ctk.g = resources.getDimensionPixelSize(R.dimen.channel_logo_size);
        ctk.h = resources.getDimensionPixelSize(R.dimen.channel_logo_size);
        ctk.i = resources.getDimensionPixelSize(R.dimen.channel_logo_margin_start);
        ctk.j = resources.getDimensionPixelSize(R.dimen.channel_logo_margin_end);
        ctl a2 = ctk.a();
        sparseArray.put(0, a2);
        ctl ctl = new ctl(a2);
        sparseArray.put(1, ctl);
        sparseArray.put(5, ctl);
        sparseArray.put(6, ctl);
        ctl ctl2 = new ctl(a2);
        ctl2.f = resources.getDimensionPixelSize(R.dimen.home_app_channel_logo_default_alignment_origin_margin);
        ctl2.c = resources.getDimensionPixelSize(R.dimen.home_app_banner_default_above_selected_last_row_margin_bottom);
        sparseArray.put(17, ctl2);
        ctl ctl3 = new ctl(ctl2);
        ctl3.a = resources.getDimensionPixelSize(R.dimen.home_app_banner_image_height);
        ctl3.f = resources.getDimensionPixelSize(R.dimen.channel_logo_above_selected_alignment_origin_margin);
        ctl3.c = resources.getDimensionPixelSize(R.dimen.home_app_banner_default_above_selected_margin_bottom);
        sparseArray.put(2, ctl3);
        ctk ctk2 = new ctk();
        ctk2.a = resources.getDimensionPixelSize(R.dimen.home_app_banner_image_height);
        ctk2.b = resources.getDimensionPixelSize(R.dimen.home_app_banner_zoomed_out_margin_top);
        ctk2.c = resources.getDimensionPixelSize(R.dimen.home_app_banner_zoomed_out_margin_bottom);
        ctk2.d = resources.getDimensionPixelSize(R.dimen.home_apps_row_zoomed_out_margin_top);
        ctk2.e = resources.getDimensionPixelSize(R.dimen.channel_zoomed_out_margin_bottom);
        ctk2.g = resources.getDimensionPixelSize(R.dimen.channel_logo_selected_size);
        ctk2.h = resources.getDimensionPixelSize(R.dimen.channel_logo_selected_size);
        ctk2.i = resources.getDimensionPixelSize(R.dimen.channel_logo_zoomed_out_selected_margin);
        ctk2.j = resources.getDimensionPixelSize(R.dimen.channel_logo_zoomed_out_selected_margin);
        ctl a3 = ctk2.a();
        sparseArray.put(10, a3);
        ctl ctl4 = new ctl(a3);
        ctl4.g = resources.getDimensionPixelSize(R.dimen.channel_action_button_size);
        ctl4.h = resources.getDimensionPixelSize(R.dimen.channel_action_button_size);
        ctl4.i = resources.getDimensionPixelSize(R.dimen.channel_logo_zoomed_out_margin);
        ctl4.j = resources.getDimensionPixelSize(R.dimen.channel_logo_zoomed_out_margin);
        sparseArray.put(11, ctl4);
        sparseArray.put(12, ctl4);
        sparseArray.put(13, ctl4);
        sparseArray.put(14, ctl4);
        sparseArray.put(15, ctl4);
        sparseArray.put(16, ctl4);
        channelView3.F = sparseArray;
        this.a.a();
        Context context2 = this.a.getContext();
        String string = context2.getString(R.string.action_apps_view);
        this.a.a(string);
        this.a.b(string);
        this.a.c(string);
        this.b = this.a.b;
        Resources resources2 = context2.getResources();
        this.j = resources2.getDimensionPixelOffset(R.dimen.home_app_channel_items_list_default_window_alignment_offset);
        this.k = resources2.getDimensionPixelOffset(R.dimen.home_app_channel_items_list_default_padding_end);
        HorizontalGridView horizontalGridView = this.b;
        horizontalGridView.g(3);
        horizontalGridView.a(0.0f);
        ChannelView channelView4 = this.a;
        channelView4.b.h(this.j);
        ChannelView channelView5 = this.a;
        int i2 = this.k;
        HorizontalGridView horizontalGridView2 = channelView5.b;
        horizontalGridView2.setPaddingRelative(horizontalGridView2.getPaddingStart(), channelView5.b.getPaddingTop(), i2, channelView5.b.getPaddingBottom());
        ImageView imageView = this.a.h;
        imageView.setImageDrawable(context2.getDrawable(R.drawable.apps_view_logo));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f = new cpp(this);
    }

    public final View a() {
        return this.a;
    }

    public final void a(crh crh) {
    }

    public final boolean g() {
        ju juVar = this.b.x;
        return juVar != null && juVar.b();
    }

    public final void a(Context context) {
        cew cew;
        if (!d() && (cew = this.g) != null) {
            cew.a(context);
        }
    }

    public final void b(Context context) {
        jp jpVar = this.b.g;
        if (jpVar != null) {
            if (this.a.A == 0 && jpVar.a() > 0) {
                km a2 = this.o.a(this.b.r());
                if (a2 instanceof cex) {
                    ((cex) a2).b(context);
                    return;
                }
            }
            a(context);
        }
    }

    public final void c(Context context) {
        cey cey;
        if (!d() && (cey = this.h) != null) {
            cey.c(context);
        }
    }

    public final void d(Context context) {
        jp jpVar = this.b.g;
        if (jpVar != null) {
            if (this.a.A == 0 && jpVar.a() > 0) {
                km a2 = this.o.a(this.b.r());
                if (a2 instanceof cez) {
                    ((cez) a2).d(context);
                    return;
                }
            }
            c(context);
        }
    }

    public final void a(ChannelView channelView) {
        AppsViewActivity.a(null, channelView.getContext());
    }

    public final void c(int i2) {
        switch (i2) {
            case 0:
                cri cri = this.m;
                if (cri != null) {
                    cri.u();
                }
                crj crj = this.n;
                if (crj != null) {
                    crj.c(0);
                    return;
                }
                return;
            case 1:
                crj crj2 = this.n;
                if (crj2 != null) {
                    crj2.c(0);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                String valueOf = String.valueOf(ChannelView.a(i2));
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Unsupported ChannelView state change gesture: ") : "Unsupported ChannelView state change gesture: ".concat(valueOf));
            case 10:
                cri cri2 = this.m;
                if (cri2 != null) {
                    cri2.u();
                }
                crj crj3 = this.n;
                if (crj3 != null) {
                    crj3.c(1);
                    return;
                }
                return;
            case 11:
                crj crj4 = this.n;
                if (crj4 != null) {
                    crj4.c(1);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final boolean d() {
        jp jpVar = this.b.g;
        if (jpVar == null || this.a.A != 0 || jpVar.a() <= 0 || this.b.r() == 0) {
            return false;
        }
        c();
        return true;
    }

    public final void a(boolean z) {
        if (this.l != z) {
            this.l = z;
            b();
        }
    }

    public final void a(cri cri) {
        this.m = cri;
    }

    public final void a(crj crj) {
        this.n = crj;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        jp jpVar = this.b.g;
        if (jpVar != null && jpVar.a() > 0) {
            if (dcy.d(this.a.getContext())) {
                this.b.i(0);
            } else {
                this.b.j(0);
            }
        }
    }

    public final void b() {
        this.e.b(!this.l);
        this.e.c(false);
    }
}
