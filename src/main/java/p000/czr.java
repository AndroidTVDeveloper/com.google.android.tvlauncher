package p000;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Pair;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.settings.FavoriteLaunchItemPreference;
import java.util.ArrayList;

/* renamed from: czr */
/* compiled from: PG */
public final class czr extends C0334mh implements cit, C0448qn {

    /* renamed from: h */
    private cja f7997h;

    /* renamed from: i */
    private int f7998i;

    /* renamed from: j */
    private int f7999j;

    /* renamed from: k */
    private Drawable f8000k;

    /* renamed from: l */
    private agj f8001l;

    /* renamed from: a */
    public final void mo2798a(boolean z, Pair pair) {
    }

    /* renamed from: a */
    private final void m6022a(PreferenceScreen preferenceScreen, chn chn, Preference preference) {
        C0509su suVar;
        preference.mo1098c(chn.f5563c);
        preference.mo1094b(chn.f5562b);
        preference.f1361o = this;
        czq czq = new czq(this.f7999j, this.f7998i, preference);
        C0512sx c = C0497si.m8296c(getContext());
        String str = chn.f5565e;
        if (str != null) {
            suVar = c.mo5945a(str);
        } else {
            suVar = c.mo5944a(new cir(chn, cjd.BANNER, this.f7997h.mo2902h()));
        }
        suVar.mo202b(this.f8001l).mo5937a((ahg) czq);
        preferenceScreen.mo1117a(preference);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        this.f7997h = dbq.m6093a(context);
        this.f7998i = context.getResources().getDimensionPixelSize(R.dimen.favorite_preference_icon_height);
        this.f7999j = context.getResources().getDimensionPixelSize(R.dimen.favorite_preference_icon_width);
        this.f8000k = new ColorDrawable(C0035bg.m3116b(context, R.color.app_banner_background_color));
        this.f8001l = new agj((byte) 0).mo195a(this.f8000k).mo205c(this.f8000k).mo199a(C0594vy.f10649a).mo198a((C0544ub) new dae(getContext().getColor(R.color.app_banner_background_color), true));
    }

    /* renamed from: a */
    public final void mo3836a(Bundle bundle) {
        C0470ri riVar = this.f10224b;
        PreferenceScreen a = riVar.mo5809a(riVar.f10247a);
        a.mo1092b((int) R.string.select_favorite_apps_title);
        mo5792a(a);
        a.f1375c = false;
    }

    /* renamed from: a */
    public final void mo2796a(ArrayList arrayList) {
        PreferenceScreen b = mo5793b();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            chn chn = (chn) arrayList.get(i);
            if (!this.f7997h.mo2892b(chn) && !chn.mo2812a()) {
                Preference a = this.f10224b.mo5808a(chn.f5563c);
                if (a == null) {
                    a = new FavoriteLaunchItemPreference(this.f10224b.f10247a);
                }
                m6022a(b, chn, a);
            }
        }
        mo5792a(b);
    }

    /* renamed from: d */
    public final void mo2801d() {
        PreferenceScreen b = mo5793b();
        b.mo1123s();
        cja cja = this.f7997h;
        ArrayList arrayList = new ArrayList();
        ArrayList c = cja.mo2893c();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            chn chn = (chn) c.get(i);
            if (!cja.mo2892b(chn) && !chn.mo2812a()) {
                arrayList.add(chn);
            }
        }
        ArrayList b2 = cja.mo2889b();
        int size2 = b2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            chn chn2 = (chn) b2.get(i2);
            if (!cja.mo2892b(chn2) && !chn2.mo2812a()) {
                arrayList.add(chn2);
            }
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            m6022a(b, (chn) arrayList.get(i3), new FavoriteLaunchItemPreference(this.f10224b.f10247a));
        }
        mo5792a(b);
    }

    /* renamed from: b */
    public final void mo2799b(ArrayList arrayList) {
        PreferenceScreen b = mo5793b();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Preference a = this.f10224b.mo5808a(((chn) arrayList.get(i)).f5563c);
            if (a != null) {
                b.mo1118b(a);
                b.mo1110m();
            }
        }
        mo5792a(b);
    }

    /* renamed from: a */
    public final boolean mo3837a(Preference preference) {
        cja cja = this.f7997h;
        cja.f5689k.mo2866a(cja.mo2901h(preference.f1365s));
        getActivity().finish();
        return false;
    }

    public final void onStart() {
        super.onStart();
        this.f7997h.mo2886a(this);
        this.f7997h.mo2897e();
    }

    public final void onStop() {
        super.onStop();
        this.f7997h.mo2890b(this);
    }
}
