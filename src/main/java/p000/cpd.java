package p000;

import android.app.Activity;
import android.view.View;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.home.view.ChannelView;

/* renamed from: cpd */
/* compiled from: PG */
final /* synthetic */ class cpd implements dav {

    /* renamed from: a */
    private final cpi f6866a;

    /* renamed from: b */
    private final chn f6867b;

    /* renamed from: c */
    private final View f6868c;

    public cpd(cpi cpi, chn chn, View view) {
        this.f6866a = cpi;
        this.f6867b = chn;
        this.f6868c = view;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cfs.<init>(int, char):void
     arg types: [int, int]
     candidates:
      cfs.<init>(int, byte):void
      cfs.<init>(int, char):void */
    /* renamed from: a */
    public final void mo2802a(day day) {
        cpi cpi = this.f6866a;
        chn chn = this.f6867b;
        View view = this.f6868c;
        int i = day.f8117a;
        if (i == 0) {
            cpi.mo3550a(chn, view);
        } else if (i == 1) {
            cpr cpr = cpi.f6883w.f6913s;
            if (cpr != null) {
                cpp cpp = (cpp) cpr;
                ChannelView channelView = cpp.f6921a.f6922a;
                channelView.f6453D = false;
                if (!dcy.m6195d(channelView.getContext())) {
                    cpp.f6921a.f6923b.mo832a(new C0219ia());
                }
            }
            cpi.f6876p.mo3228b(true);
            if (dcy.m6193b(cpi.f6894y)) {
                if (cpi.f6877q == null) {
                    cpi.f6877q = new dad((Activity) cpi.f6894y);
                    day day2 = new day(0, cpi.f6894y.getString(R.string.accessibility_menu_item_move_left), cpi.f6894y.getDrawable(R.drawable.ic_arrow_left_black_24dp));
                    day day3 = new day(1, cpi.f6894y.getString(R.string.accessibility_menu_item_move_right), cpi.f6894y.getDrawable(R.drawable.ic_arrow_right_black_24dp));
                    day day4 = new day(2, cpi.f6894y.getString(R.string.accessibility_menu_item_done), cpi.f6894y.getDrawable(R.drawable.ic_done_black_24dp));
                    if (dcy.m6191a(cpi.f6894y)) {
                        cpi.f6877q.mo4030a(day3);
                        cpi.f6877q.mo4030a(day2);
                        cpi.f6877q.mo4030a(day4);
                    } else {
                        cpi.f6877q.mo4030a(day2);
                        cpi.f6877q.mo4030a(day3);
                        cpi.f6877q.mo4030a(day4);
                    }
                    cpi.f6877q.f8022f = new cpe(cpi);
                    cpi.f6877q.f8023g = new cpf(cpi);
                }
                cpi.mo3555w();
                cpi.f6877q.mo4029a();
            }
        } else if (i == 2) {
            cfs cfs = new cfs(20, 0);
            if (chn.f5568h) {
                dja h = cfs.mo2735h();
                String str = chn.f5563c;
                if (h.f8673b) {
                    h.mo4505b();
                    h.f8673b = false;
                }
                dmi dmi = (dmi) h.f8672a;
                dmi dmi2 = dmi.f8827e;
                str.getClass();
                dmi.f8828a = 1 | dmi.f8828a;
                dmi.f8829b = str;
                if (chn.f5566f != null) {
                    dja h2 = cfs.mo2735h();
                    String str2 = chn.f5566f;
                    if (h2.f8673b) {
                        h2.mo4505b();
                        h2.f8673b = false;
                    }
                    dmi dmi3 = (dmi) h2.f8672a;
                    str2.getClass();
                    dmi3.f8828a = 2 | dmi3.f8828a;
                    dmi3.f8830c = str2;
                }
            }
            cpi.f6883w.mo2714a(cfs);
            cpi.f6883w.f6896b.mo2884a(chn);
        }
    }
}
