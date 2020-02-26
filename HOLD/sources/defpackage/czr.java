package defpackage;

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

/* renamed from: czr  reason: default package */
/* compiled from: PG */
public final class czr extends mh implements cit, qn {
    private cja h;
    private int i;
    private int j;
    private Drawable k;
    private agj l;

    public final void a(boolean z, Pair pair) {
    }

    private final void a(PreferenceScreen preferenceScreen, chn chn, Preference preference) {
        su suVar;
        preference.c(chn.c);
        preference.b(chn.b);
        preference.o = this;
        czq czq = new czq(this.j, this.i, preference);
        sx c = si.c(getContext());
        String str = chn.e;
        if (str != null) {
            suVar = c.a(str);
        } else {
            suVar = c.a(new cir(chn, cjd.BANNER, this.h.h()));
        }
        suVar.b(this.l).a((ahg) czq);
        preferenceScreen.a(preference);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        this.h = dbq.a(context);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.favorite_preference_icon_height);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.favorite_preference_icon_width);
        this.k = new ColorDrawable(bg.b(context, R.color.app_banner_background_color));
        this.l = new agj((byte) 0).a(this.k).c(this.k).a(vy.a).a((ub) new dae(getContext().getColor(R.color.app_banner_background_color), true));
    }

    public final void a(Bundle bundle) {
        ri riVar = this.b;
        PreferenceScreen a = riVar.a(riVar.a);
        a.b((int) R.string.select_favorite_apps_title);
        a(a);
        a.c = false;
    }

    public final void a(ArrayList arrayList) {
        PreferenceScreen b = b();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            chn chn = (chn) arrayList.get(i2);
            if (!this.h.b(chn) && !chn.a()) {
                Preference a = this.b.a(chn.c);
                if (a == null) {
                    a = new FavoriteLaunchItemPreference(this.b.a);
                }
                a(b, chn, a);
            }
        }
        a(b);
    }

    public final void d() {
        PreferenceScreen b = b();
        b.s();
        cja cja = this.h;
        ArrayList arrayList = new ArrayList();
        ArrayList c = cja.c();
        int size = c.size();
        for (int i2 = 0; i2 < size; i2++) {
            chn chn = (chn) c.get(i2);
            if (!cja.b(chn) && !chn.a()) {
                arrayList.add(chn);
            }
        }
        ArrayList b2 = cja.b();
        int size2 = b2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            chn chn2 = (chn) b2.get(i3);
            if (!cja.b(chn2) && !chn2.a()) {
                arrayList.add(chn2);
            }
        }
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            a(b, (chn) arrayList.get(i4), new FavoriteLaunchItemPreference(this.b.a));
        }
        a(b);
    }

    public final void b(ArrayList arrayList) {
        PreferenceScreen b = b();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Preference a = this.b.a(((chn) arrayList.get(i2)).c);
            if (a != null) {
                b.b(a);
                b.m();
            }
        }
        a(b);
    }

    public final boolean a(Preference preference) {
        cja cja = this.h;
        cja.k.a(cja.h(preference.s));
        getActivity().finish();
        return false;
    }

    public final void onStart() {
        super.onStart();
        this.h.a(this);
        this.h.e();
    }

    public final void onStop() {
        super.onStop();
        this.h.b(this);
    }
}
