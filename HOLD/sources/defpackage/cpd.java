package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.home.view.ChannelView;

/* renamed from: cpd  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cpd implements dav {
    private final cpi a;
    private final chn b;
    private final View c;

    public cpd(cpi cpi, chn chn, View view) {
        this.a = cpi;
        this.b = chn;
        this.c = view;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cfs.<init>(int, char):void
     arg types: [int, int]
     candidates:
      cfs.<init>(int, byte):void
      cfs.<init>(int, char):void */
    public final void a(day day) {
        cpi cpi = this.a;
        chn chn = this.b;
        View view = this.c;
        int i = day.a;
        if (i == 0) {
            cpi.a(chn, view);
        } else if (i == 1) {
            cpr cpr = cpi.w.s;
            if (cpr != null) {
                cpp cpp = (cpp) cpr;
                ChannelView channelView = cpp.a.a;
                channelView.D = false;
                if (!dcy.d(channelView.getContext())) {
                    cpp.a.b.a(new ia());
                }
            }
            cpi.p.b(true);
            if (dcy.b(cpi.y)) {
                if (cpi.q == null) {
                    cpi.q = new dad((Activity) cpi.y);
                    day day2 = new day(0, cpi.y.getString(R.string.accessibility_menu_item_move_left), cpi.y.getDrawable(R.drawable.ic_arrow_left_black_24dp));
                    day day3 = new day(1, cpi.y.getString(R.string.accessibility_menu_item_move_right), cpi.y.getDrawable(R.drawable.ic_arrow_right_black_24dp));
                    day day4 = new day(2, cpi.y.getString(R.string.accessibility_menu_item_done), cpi.y.getDrawable(R.drawable.ic_done_black_24dp));
                    if (dcy.a(cpi.y)) {
                        cpi.q.a(day3);
                        cpi.q.a(day2);
                        cpi.q.a(day4);
                    } else {
                        cpi.q.a(day2);
                        cpi.q.a(day3);
                        cpi.q.a(day4);
                    }
                    cpi.q.f = new cpe(cpi);
                    cpi.q.g = new cpf(cpi);
                }
                cpi.w();
                cpi.q.a();
            }
        } else if (i == 2) {
            cfs cfs = new cfs(20, 0);
            if (chn.h) {
                dja h = cfs.h();
                String str = chn.c;
                if (h.b) {
                    h.b();
                    h.b = false;
                }
                dmi dmi = (dmi) h.a;
                dmi dmi2 = dmi.e;
                str.getClass();
                dmi.a = 1 | dmi.a;
                dmi.b = str;
                if (chn.f != null) {
                    dja h2 = cfs.h();
                    String str2 = chn.f;
                    if (h2.b) {
                        h2.b();
                        h2.b = false;
                    }
                    dmi dmi3 = (dmi) h2.a;
                    str2.getClass();
                    dmi3.a = 2 | dmi3.a;
                    dmi3.c = str2;
                }
            }
            cpi.w.a(cfs);
            cpi.w.b.a(chn);
        }
    }
}
