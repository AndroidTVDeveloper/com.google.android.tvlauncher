package p000;

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

/* renamed from: chc */
/* compiled from: PG */
public final class chc extends Fragment {

    /* renamed from: a */
    public EditModeGridView f5502a;

    /* renamed from: b */
    public cht f5503b;

    /* renamed from: c */
    private View f5504c;

    /* renamed from: d */
    private int f5505d;

    /* renamed from: e */
    private chf f5506e;

    /* renamed from: f */
    private int f5507f;

    /* renamed from: g */
    private final cfr f5508g = new cfr(this);

    /* renamed from: h */
    private final cja f5509h = dbq.m6093a(getContext());

    /* renamed from: i */
    private dch f5510i = dck.m6123a(getContext()).mo4101h();

    /* renamed from: j */
    private final aic f5511j = new cha(this);

    public chc() {
        if (this.f5510i == null) {
            this.f5510i = dch.APPS_OEM_GAMES;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f5507f = arguments.getInt("key_edit_mode_type");
        this.f5505d = arguments.getInt("key_edit_mode_focused_position");
        chf chf = new chf(getContext(), this.f5508g);
        this.f5506e = chf;
        chf.mo5307a(this.f5511j);
        this.f5509h.mo2897e();
        this.f5509h.mo2886a(this.f5506e);
        this.f5506e.f5517e = arguments.getInt("key_top_keyline");
        this.f5506e.f5518f = arguments.getInt("key_bottom_keyline");
        this.f5503b = new cgy(this);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) R.layout.edit_mode_view, viewGroup, false);
        this.f5504c = inflate;
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f5506e.mo5310b(this.f5511j);
        this.f5509h.mo2890b(this.f5506e);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cfs.<init>(int, char):void
     arg types: [int, int]
     candidates:
      cfs.<init>(int, byte):void
      cfs.<init>(int, char):void */
    public final void onPause() {
        boolean z;
        int r = this.f5502a.mo5622r();
        ArrayList arrayList = this.f5506e.f5514b;
        cja cja = this.f5509h;
        if (this.f5507f == 1) {
            z = true;
        } else {
            z = false;
        }
        Pair a = chq.m4748a(r);
        cjc cjc = cja.f5680b;
        SharedPreferences.Editor edit = cjc.f5701d.edit();
        boolean z2 = cjc.f5701d.getBoolean("key_use_default_order", true);
        if (z2) {
            edit.putBoolean("key_use_default_order", false);
            cjc.f5702e = false;
        }
        cjc.mo2910a(arrayList, edit);
        edit.apply();
        cja.f5680b.mo2909a(cja.f5687i);
        if (z2) {
            cja.f5680b.mo2912c(cja.mo2895d());
        }
        for (cit a2 : cja.f5686h) {
            a2.mo2798a(z, a);
        }
        this.f5503b.mo2782a(false);
        super.onPause();
        cfs cfs = new cfs(16, 0);
        dja k = cfs.mo2738k();
        if (this.f5507f == 0) {
            int size = arrayList.size();
            if (k.f8673b) {
                k.mo4505b();
                k.f8673b = false;
            }
            dms dms = (dms) k.f8672a;
            dms dms2 = dms.f8864e;
            dms.f8865a |= 1;
            dms.f8866b = size;
        } else {
            int size2 = arrayList.size();
            if (k.f8673b) {
                k.mo4505b();
                k.f8673b = false;
            }
            dms dms3 = (dms) k.f8672a;
            dms dms4 = dms.f8864e;
            dms3.f8865a |= 2;
            dms3.f8867c = size2;
        }
        int size3 = arrayList.size();
        for (int i = 0; i < size3; i++) {
            chn chn = (chn) arrayList.get(i);
            dja l = dmr.f8860d.mo4516l();
            if (!chn.f5568h) {
                dja l2 = dmj.f8832f.mo4516l();
                String str = chn.f5563c;
                if (l2.f8673b) {
                    l2.mo4505b();
                    l2.f8673b = false;
                }
                dmj dmj = (dmj) l2.f8672a;
                str.getClass();
                int i2 = dmj.f8833a | 1;
                dmj.f8833a = i2;
                dmj.f8834b = str;
                boolean z3 = chn.f5567g;
                dmj.f8833a = i2 | 4;
                dmj.f8835c = z3;
                if (l.f8673b) {
                    l.mo4505b();
                    l.f8673b = false;
                }
                dmr dmr = (dmr) l.f8672a;
                dmj dmj2 = (dmj) l2.mo4509g();
                dmj2.getClass();
                dmr.f8862b = dmj2;
                dmr.f8861a |= 1;
            } else {
                dja l3 = dmi.f8827e.mo4516l();
                String str2 = chn.f5563c;
                if (l3.f8673b) {
                    l3.mo4505b();
                    l3.f8673b = false;
                }
                dmi dmi = (dmi) l3.f8672a;
                str2.getClass();
                int i3 = dmi.f8828a | 1;
                dmi.f8828a = i3;
                dmi.f8829b = str2;
                String str3 = chn.f5566f;
                if (str3 != null) {
                    str3.getClass();
                    dmi.f8828a = i3 | 2;
                    dmi.f8830c = str3;
                }
                if (l.f8673b) {
                    l.mo4505b();
                    l.f8673b = false;
                }
                dmr dmr2 = (dmr) l.f8672a;
                dmi dmi2 = (dmi) l3.mo4509g();
                dmi2.getClass();
                dmr2.f8863c = dmi2;
                dmr2.f8861a |= 2;
            }
            if (k.f8673b) {
                k.mo4505b();
                k.f8673b = false;
            }
            dms dms5 = (dms) k.f8672a;
            dmr dmr3 = (dmr) l.mo4509g();
            dmr3.getClass();
            if (!dms5.f8868d.mo4374a()) {
                dms5.f8868d = dje.m6690a(dms5.f8868d);
            }
            dms5.f8868d.add(dmr3);
        }
        this.f5508g.mo2714a(cfs);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cfs.<init>(int, char):void
     arg types: [int, int]
     candidates:
      cfs.<init>(int, byte):void
      cfs.<init>(int, char):void */
    public final void onResume() {
        super.onResume();
        this.f5508g.mo2714a(new cfs(15, 0));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.f5502a = (EditModeGridView) this.f5504c.findViewById(R.id.edit_mode_grid);
        dch dch = dch.APPS_OEM_GAMES;
        int ordinal = this.f5510i.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            int i = this.f5507f;
            if (i == 0) {
                this.f5506e.mo2800c(this.f5509h.mo2893c());
            } else if (i == 1) {
                this.f5506e.mo2800c(this.f5509h.mo2889b());
            }
        } else if (ordinal == 3) {
            this.f5506e.mo2800c(this.f5509h.mo2895d());
        }
        chf chf = this.f5506e;
        chf.f5515c = this.f5503b;
        chf.f5516d = new cgz(this);
        if (this.f5506e.mo2794a() <= 0) {
            getFragmentManager().popBackStack();
        }
        this.f5502a.mo1064l(4);
        this.f5502a.mo831a(this.f5506e);
        this.f5502a.mo5617i(this.f5505d);
        this.f5502a.getViewTreeObserver().addOnGlobalLayoutListener(new chb(this));
        this.f5502a.mo5613g(0);
        this.f5502a.mo5609a(-1.0f);
        this.f5502a.requestFocus();
    }
}
