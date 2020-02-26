package defpackage;

import android.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.appsview.EditModeGridView;
import java.util.ArrayList;

/* renamed from: chc  reason: default package */
/* compiled from: PG */
public final class chc extends Fragment {
    public EditModeGridView a;
    public cht b;
    private View c;
    private int d;
    private chf e;
    private int f;
    private final cfr g = new cfr(this);
    private final cja h = dbq.a(getContext());
    private dch i = dck.a(getContext()).h();
    private final aic j = new cha(this);

    public chc() {
        if (this.i == null) {
            this.i = dch.APPS_OEM_GAMES;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f = arguments.getInt("key_edit_mode_type");
        this.d = arguments.getInt("key_edit_mode_focused_position");
        chf chf = new chf(getContext(), this.g);
        this.e = chf;
        chf.a(this.j);
        this.h.e();
        this.h.a(this.e);
        this.e.e = arguments.getInt("key_top_keyline");
        this.e.f = arguments.getInt("key_bottom_keyline");
        this.b = new cgy(this);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) R.layout.edit_mode_view, viewGroup, false);
        this.c = inflate;
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.e.b(this.j);
        this.h.b(this.e);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cfs.<init>(int, char):void
     arg types: [int, int]
     candidates:
      cfs.<init>(int, byte):void
      cfs.<init>(int, char):void */
    public final void onPause() {
        boolean z;
        int r = this.a.r();
        ArrayList arrayList = this.e.b;
        cja cja = this.h;
        if (this.f == 1) {
            z = true;
        } else {
            z = false;
        }
        Pair a2 = chq.a(r);
        cjc cjc = cja.b;
        SharedPreferences.Editor edit = cjc.d.edit();
        boolean z2 = cjc.d.getBoolean("key_use_default_order", true);
        if (z2) {
            edit.putBoolean("key_use_default_order", false);
            cjc.e = false;
        }
        cjc.a(arrayList, edit);
        edit.apply();
        cja.b.a(cja.i);
        if (z2) {
            cja.b.c(cja.d());
        }
        for (cit a3 : cja.h) {
            a3.a(z, a2);
        }
        this.b.a(false);
        super.onPause();
        cfs cfs = new cfs(16, 0);
        dja k = cfs.k();
        if (this.f == 0) {
            int size = arrayList.size();
            if (k.b) {
                k.b();
                k.b = false;
            }
            dms dms = (dms) k.a;
            dms dms2 = dms.e;
            dms.a |= 1;
            dms.b = size;
        } else {
            int size2 = arrayList.size();
            if (k.b) {
                k.b();
                k.b = false;
            }
            dms dms3 = (dms) k.a;
            dms dms4 = dms.e;
            dms3.a |= 2;
            dms3.c = size2;
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            chn chn = (chn) arrayList.get(i2);
            dja l = dmr.d.l();
            if (!chn.h) {
                dja l2 = dmj.f.l();
                String str = chn.c;
                if (l2.b) {
                    l2.b();
                    l2.b = false;
                }
                dmj dmj = (dmj) l2.a;
                str.getClass();
                int i3 = dmj.a | 1;
                dmj.a = i3;
                dmj.b = str;
                boolean z3 = chn.g;
                dmj.a = i3 | 4;
                dmj.c = z3;
                if (l.b) {
                    l.b();
                    l.b = false;
                }
                dmr dmr = (dmr) l.a;
                dmj dmj2 = (dmj) l2.g();
                dmj2.getClass();
                dmr.b = dmj2;
                dmr.a |= 1;
            } else {
                dja l3 = dmi.e.l();
                String str2 = chn.c;
                if (l3.b) {
                    l3.b();
                    l3.b = false;
                }
                dmi dmi = (dmi) l3.a;
                str2.getClass();
                int i4 = dmi.a | 1;
                dmi.a = i4;
                dmi.b = str2;
                String str3 = chn.f;
                if (str3 != null) {
                    str3.getClass();
                    dmi.a = i4 | 2;
                    dmi.c = str3;
                }
                if (l.b) {
                    l.b();
                    l.b = false;
                }
                dmr dmr2 = (dmr) l.a;
                dmi dmi2 = (dmi) l3.g();
                dmi2.getClass();
                dmr2.c = dmi2;
                dmr2.a |= 2;
            }
            if (k.b) {
                k.b();
                k.b = false;
            }
            dms dms5 = (dms) k.a;
            dmr dmr3 = (dmr) l.g();
            dmr3.getClass();
            if (!dms5.d.a()) {
                dms5.d = dje.a(dms5.d);
            }
            dms5.d.add(dmr3);
        }
        this.g.a(cfs);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cfs.<init>(int, char):void
     arg types: [int, int]
     candidates:
      cfs.<init>(int, byte):void
      cfs.<init>(int, char):void */
    public final void onResume() {
        super.onResume();
        this.g.a(new cfs(15, 0));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.a = (EditModeGridView) this.c.findViewById(R.id.edit_mode_grid);
        dch dch = dch.APPS_OEM_GAMES;
        int ordinal = this.i.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            int i2 = this.f;
            if (i2 == 0) {
                this.e.c(this.h.c());
            } else if (i2 == 1) {
                this.e.c(this.h.b());
            }
        } else if (ordinal == 3) {
            this.e.c(this.h.d());
        }
        chf chf = this.e;
        chf.c = this.b;
        chf.d = new cgz(this);
        if (this.e.a() <= 0) {
            getFragmentManager().popBackStack();
        }
        this.a.l(4);
        this.a.a(this.e);
        this.a.i(this.d);
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(new chb(this));
        this.a.g(0);
        this.a.a(-1.0f);
        this.a.requestFocus();
    }
}
