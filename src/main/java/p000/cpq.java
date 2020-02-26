package p000;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import androidx.leanback.widget.HorizontalGridView;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.appsview.AppsViewActivity;
import com.google.android.tvlauncher.home.view.ChannelView;

/* renamed from: cpq */
/* compiled from: PG */
final class cpq implements cqz, cuo, cuq, cex, cez, cey, cew, csf {

    /* renamed from: a */
    public final ChannelView f6922a;

    /* renamed from: b */
    public final HorizontalGridView f6923b;

    /* renamed from: c */
    public final cfp f6924c;

    /* renamed from: d */
    public cpo f6925d = null;

    /* renamed from: e */
    public cse f6926e;

    /* renamed from: f */
    public final cpr f6927f;

    /* renamed from: g */
    public cew f6928g;

    /* renamed from: h */
    public cey f6929h;

    /* renamed from: i */
    public csf f6930i;

    /* renamed from: j */
    private final int f6931j;

    /* renamed from: k */
    private final int f6932k;

    /* renamed from: l */
    private boolean f6933l;

    /* renamed from: m */
    private cri f6934m;

    /* renamed from: n */
    private crj f6935n;

    /* renamed from: o */
    private final ctr f6936o;

    public cpq(ChannelView channelView, cfp cfp) {
        ctr ctr = new ctr(channelView.f6517b);
        this.f6922a = channelView;
        this.f6924c = cfp;
        this.f6936o = ctr;
        channelView.mo3376a(this);
        ChannelView channelView2 = this.f6922a;
        channelView2.f6464O = this;
        channelView2.f6451B = false;
        channelView2.f6452C = false;
        channelView2.mo3387d();
        ChannelView channelView3 = this.f6922a;
        channelView3.f6454E = false;
        Context context = channelView.getContext();
        SparseArray sparseArray = new SparseArray();
        Resources resources = context.getResources();
        ctk ctk = new ctk();
        ctk.f7362a = resources.getDimensionPixelSize(R.dimen.home_app_banner_height);
        ctk.f7363b = resources.getDimensionPixelSize(R.dimen.home_app_banner_default_margin_top);
        ctk.f7364c = resources.getDimensionPixelSize(R.dimen.home_app_banner_default_margin_bottom);
        ctk.f7367f = resources.getDimensionPixelSize(R.dimen.home_app_channel_logo_default_alignment_origin_margin);
        ctk.f7368g = resources.getDimensionPixelSize(R.dimen.channel_logo_size);
        ctk.f7369h = resources.getDimensionPixelSize(R.dimen.channel_logo_size);
        ctk.f7370i = resources.getDimensionPixelSize(R.dimen.channel_logo_margin_start);
        ctk.f7371j = resources.getDimensionPixelSize(R.dimen.channel_logo_margin_end);
        ctl a = ctk.mo3737a();
        sparseArray.put(0, a);
        ctl ctl = new ctl(a);
        sparseArray.put(1, ctl);
        sparseArray.put(5, ctl);
        sparseArray.put(6, ctl);
        ctl ctl2 = new ctl(a);
        ctl2.f7381f = resources.getDimensionPixelSize(R.dimen.home_app_channel_logo_default_alignment_origin_margin);
        ctl2.f7378c = resources.getDimensionPixelSize(R.dimen.home_app_banner_default_above_selected_last_row_margin_bottom);
        sparseArray.put(17, ctl2);
        ctl ctl3 = new ctl(ctl2);
        ctl3.f7376a = resources.getDimensionPixelSize(R.dimen.home_app_banner_image_height);
        ctl3.f7381f = resources.getDimensionPixelSize(R.dimen.channel_logo_above_selected_alignment_origin_margin);
        ctl3.f7378c = resources.getDimensionPixelSize(R.dimen.home_app_banner_default_above_selected_margin_bottom);
        sparseArray.put(2, ctl3);
        ctk ctk2 = new ctk();
        ctk2.f7362a = resources.getDimensionPixelSize(R.dimen.home_app_banner_image_height);
        ctk2.f7363b = resources.getDimensionPixelSize(R.dimen.home_app_banner_zoomed_out_margin_top);
        ctk2.f7364c = resources.getDimensionPixelSize(R.dimen.home_app_banner_zoomed_out_margin_bottom);
        ctk2.f7365d = resources.getDimensionPixelSize(R.dimen.home_apps_row_zoomed_out_margin_top);
        ctk2.f7366e = resources.getDimensionPixelSize(R.dimen.channel_zoomed_out_margin_bottom);
        ctk2.f7368g = resources.getDimensionPixelSize(R.dimen.channel_logo_selected_size);
        ctk2.f7369h = resources.getDimensionPixelSize(R.dimen.channel_logo_selected_size);
        ctk2.f7370i = resources.getDimensionPixelSize(R.dimen.channel_logo_zoomed_out_selected_margin);
        ctk2.f7371j = resources.getDimensionPixelSize(R.dimen.channel_logo_zoomed_out_selected_margin);
        ctl a2 = ctk2.mo3737a();
        sparseArray.put(10, a2);
        ctl ctl4 = new ctl(a2);
        ctl4.f7382g = resources.getDimensionPixelSize(R.dimen.channel_action_button_size);
        ctl4.f7383h = resources.getDimensionPixelSize(R.dimen.channel_action_button_size);
        ctl4.f7384i = resources.getDimensionPixelSize(R.dimen.channel_logo_zoomed_out_margin);
        ctl4.f7385j = resources.getDimensionPixelSize(R.dimen.channel_logo_zoomed_out_margin);
        sparseArray.put(11, ctl4);
        sparseArray.put(12, ctl4);
        sparseArray.put(13, ctl4);
        sparseArray.put(14, ctl4);
        sparseArray.put(15, ctl4);
        sparseArray.put(16, ctl4);
        channelView3.f6455F = sparseArray;
        this.f6922a.mo3375a();
        Context context2 = this.f6922a.getContext();
        String string = context2.getString(R.string.action_apps_view);
        this.f6922a.mo3377a(string);
        this.f6922a.mo3384b(string);
        this.f6922a.mo3386c(string);
        this.f6923b = this.f6922a.f6517b;
        Resources resources2 = context2.getResources();
        this.f6931j = resources2.getDimensionPixelOffset(R.dimen.home_app_channel_items_list_default_window_alignment_offset);
        this.f6932k = resources2.getDimensionPixelOffset(R.dimen.home_app_channel_items_list_default_padding_end);
        HorizontalGridView horizontalGridView = this.f6923b;
        horizontalGridView.mo5613g(3);
        horizontalGridView.mo5609a(0.0f);
        ChannelView channelView4 = this.f6922a;
        channelView4.f6517b.mo5615h(this.f6931j);
        ChannelView channelView5 = this.f6922a;
        int i = this.f6932k;
        HorizontalGridView horizontalGridView2 = channelView5.f6517b;
        horizontalGridView2.setPaddingRelative(horizontalGridView2.getPaddingStart(), channelView5.f6517b.getPaddingTop(), i, channelView5.f6517b.getPaddingBottom());
        ImageView imageView = this.f6922a.f6523h;
        imageView.setImageDrawable(context2.getDrawable(R.drawable.apps_view_logo));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f6927f = new cpp(this);
    }

    /* renamed from: a */
    public final View mo3472a() {
        return this.f6922a;
    }

    /* renamed from: a */
    public final void mo3473a(crh crh) {
    }

    /* renamed from: g */
    public final boolean mo3527g() {
        C0266ju juVar = this.f6923b.f1084x;
        return juVar != null && juVar.mo4191b();
    }

    /* renamed from: a */
    public final void mo2702a(Context context) {
        cew cew;
        if (!m5487d() && (cew = this.f6928g) != null) {
            cew.mo2702a(context);
        }
    }

    /* renamed from: b */
    public final void mo2703b(Context context) {
        C0261jp jpVar = this.f6923b.f1067g;
        if (jpVar != null) {
            if (this.f6922a.f6450A == 0 && jpVar.mo2794a() > 0) {
                C0285km a = this.f6936o.mo3738a(this.f6923b.mo5622r());
                if (a instanceof cex) {
                    ((cex) a).mo2703b(context);
                    return;
                }
            }
            mo2702a(context);
        }
    }

    /* renamed from: c */
    public final void mo2704c(Context context) {
        cey cey;
        if (!m5487d() && (cey = this.f6929h) != null) {
            cey.mo2704c(context);
        }
    }

    /* renamed from: d */
    public final void mo2705d(Context context) {
        C0261jp jpVar = this.f6923b.f1067g;
        if (jpVar != null) {
            if (this.f6922a.f6450A == 0 && jpVar.mo2794a() > 0) {
                C0285km a = this.f6936o.mo3738a(this.f6923b.mo5622r());
                if (a instanceof cez) {
                    ((cez) a).mo2705d(context);
                    return;
                }
            }
            mo2704c(context);
        }
    }

    /* renamed from: a */
    public final void mo3516a(ChannelView channelView) {
        AppsViewActivity.m5255a(null, channelView.getContext());
    }

    /* renamed from: c */
    public final void mo3521c(int i) {
        switch (i) {
            case 0:
                cri cri = this.f6934m;
                if (cri != null) {
                    cri.mo3585u();
                }
                crj crj = this.f6935n;
                if (crj != null) {
                    crj.mo3584c(0);
                    return;
                }
                return;
            case 1:
                crj crj2 = this.f6935n;
                if (crj2 != null) {
                    crj2.mo3584c(0);
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
                String valueOf = String.valueOf(ChannelView.m5291a(i));
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Unsupported ChannelView state change gesture: ") : "Unsupported ChannelView state change gesture: ".concat(valueOf));
            case 10:
                cri cri2 = this.f6934m;
                if (cri2 != null) {
                    cri2.mo3585u();
                }
                crj crj3 = this.f6935n;
                if (crj3 != null) {
                    crj3.mo3584c(1);
                    return;
                }
                return;
            case 11:
                crj crj4 = this.f6935n;
                if (crj4 != null) {
                    crj4.mo3584c(1);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    private final boolean m5487d() {
        C0261jp jpVar = this.f6923b.f1067g;
        if (jpVar == null || this.f6922a.f6450A != 0 || jpVar.mo2794a() <= 0 || this.f6923b.mo5622r() == 0) {
            return false;
        }
        mo3564c();
        return true;
    }

    /* renamed from: a */
    public final void mo3477a(boolean z) {
        if (this.f6933l != z) {
            this.f6933l = z;
            mo3563b();
        }
    }

    /* renamed from: a */
    public final void mo3474a(cri cri) {
        this.f6934m = cri;
    }

    /* renamed from: a */
    public final void mo3475a(crj crj) {
        this.f6935n = crj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo3564c() {
        C0261jp jpVar = this.f6923b.f1067g;
        if (jpVar != null && jpVar.mo2794a() > 0) {
            if (dcy.m6195d(this.f6922a.getContext())) {
                this.f6923b.mo5617i(0);
            } else {
                this.f6923b.mo5618j(0);
            }
        }
    }

    /* renamed from: b */
    public final void mo3563b() {
        this.f6926e.mo3697b(!this.f6933l);
        this.f6926e.mo3698c(false);
    }
}
