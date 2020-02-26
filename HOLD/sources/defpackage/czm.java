package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.settings.SummaryPreferenceCategory;
import java.util.Comparator;
import java.util.List;

/* renamed from: czm  reason: default package */
/* compiled from: PG */
public final class czm extends mh implements czg, qm {
    public String h = null;
    private int i;
    private int j;
    private czh k;
    private cla l;
    private SummaryPreferenceCategory m;
    private final cfr n = new cfr(this);
    private final Comparator o = new czk(this);
    private agj p;

    public czm() {
        int i2 = cla.x;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: com.google.android.tvlauncher.settings.AppBannerDrillDownPreference} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: com.google.android.tvlauncher.settings.AppBannerSwitchPreference} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: com.google.android.tvlauncher.settings.AppBannerDrillDownPreference} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: com.google.android.tvlauncher.settings.AppBannerDrillDownPreference} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cfs.<init>(int, char):void
     arg types: [int, int]
     candidates:
      cfs.<init>(int, byte):void
      cfs.<init>(int, char):void */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List r13) {
        /*
            r12 = this;
            boolean r0 = r12.isAdded()
            if (r0 == 0) goto L_0x00fe
            ri r0 = r12.b
            android.content.Context r0 = r0.a
            com.google.android.tvlauncher.settings.SummaryPreferenceCategory r1 = r12.m
            r1.s()
            int r1 = r13.size()
            r2 = 0
            if (r1 <= 0) goto L_0x00f2
            java.util.Comparator r1 = r12.o
            r13.sort(r1)
            int r1 = r13.size()
            r3 = 0
        L_0x0020:
            if (r3 >= r1) goto L_0x00f2
            java.lang.Object r4 = r13.get(r3)
            czf r4 = (defpackage.czf) r4
            cxs r5 = r4.c
            java.lang.String r6 = r4.a
            java.lang.String r7 = "sponsored.legacy"
            boolean r6 = r7.equals(r6)
            r7 = 1
            if (r6 == 0) goto L_0x0036
            goto L_0x0067
        L_0x0036:
            int r8 = r5.b
            if (r8 != r7) goto L_0x0067
            com.google.android.tvlauncher.settings.AppBannerSwitchPreference r8 = new com.google.android.tvlauncher.settings.AppBannerSwitchPreference
            r8.<init>(r0)
            boolean r9 = r5.g
            r8.d = r9
            boolean r9 = r5.e
            r8.d(r9)
            r8.c = r7
            boolean r7 = r5.f
            if (r7 == 0) goto L_0x0055
            r7 = 2131886300(0x7f1200dc, float:1.9407175E38)
            r8.c(r7)
            goto L_0x005a
        L_0x0055:
            java.lang.String r7 = r5.c
            r8.a(r7)
        L_0x005a:
            long r9 = r5.d
            java.lang.String r5 = java.lang.Long.toString(r9)
            r8.c(r5)
            r8.n = r12
            goto L_0x00aa
        L_0x0067:
            com.google.android.tvlauncher.settings.AppBannerDrillDownPreference r8 = new com.google.android.tvlauncher.settings.AppBannerDrillDownPreference
            r8.<init>(r0)
            r9 = r6 ^ 1
            r8.a = r9
            java.lang.String r9 = r4.a
            r8.c(r9)
            android.content.res.Resources r9 = r0.getResources()
            int r5 = r5.b
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            r7[r2] = r10
            r10 = 2131755008(0x7f100000, float:1.9140883E38)
            java.lang.String r5 = r9.getQuantityString(r10, r5, r7)
            r8.a(r5)
            java.lang.Class<czj> r5 = defpackage.czj.class
            java.lang.String r5 = r5.getName()
            r8.t = r5
            android.os.Bundle r5 = r8.h()
            java.lang.String r7 = r4.a
            java.lang.String r9 = "channel_app"
            r5.putString(r9, r7)
            java.lang.CharSequence r7 = r4.b
            java.lang.String r7 = r7.toString()
            java.lang.String r9 = "app_name"
            r5.putString(r9, r7)
        L_0x00aa:
            java.lang.CharSequence r5 = r4.b
            r8.b(r5)
            r8.r()
            if (r6 != 0) goto L_0x00e9
            czl r5 = new czl
            int r6 = r12.j
            int r7 = r12.i
            r5.<init>(r6, r7, r8)
            android.content.Context r6 = r12.getContext()
            sx r6 = defpackage.si.c(r6)
            cje r7 = new cje
            java.lang.String r9 = r4.a
            android.content.pm.ResolveInfo r4 = r4.d
            cjd r10 = defpackage.cjd.BANNER
            android.content.Context r11 = r12.getContext()
            cja r11 = defpackage.dbq.a(r11)
            java.util.Locale r11 = r11.h()
            r7.<init>(r9, r4, r10, r11)
            su r4 = r6.a(r7)
            agj r6 = r12.p
            su r4 = r4.b(r6)
            r4.a(r5)
        L_0x00e9:
            com.google.android.tvlauncher.settings.SummaryPreferenceCategory r4 = r12.m
            r4.a(r8)
            int r3 = r3 + 1
            goto L_0x0020
        L_0x00f2:
            cfr r13 = r12.n
            cfs r0 = new cfs
            r1 = 21
            r0.<init>(r1, r2)
            r13.a(r0)
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czm.a(java.util.List):void");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        this.i = context.getResources().getDimensionPixelSize(R.dimen.preference_item_banner_height);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.preference_item_banner_width);
        ColorDrawable colorDrawable = new ColorDrawable(bg.b(context, R.color.app_banner_background_color));
        this.p = new agj((byte) 0).a(colorDrawable).c(colorDrawable).a(vy.a).a((ub) new dae(getContext().getColor(R.color.app_banner_background_color), true));
        this.l = cla.a(context);
    }

    public final void a(Bundle bundle) {
        ri riVar = this.b;
        Context context = riVar.a;
        PreferenceScreen a = riVar.a(context);
        a.b((int) R.string.add_channels_title);
        a(a);
        PreferenceScreen b = b();
        Preference preference = new Preference(this.b.a);
        preference.y = R.layout.watch_next_preference;
        preference.c("show_watch_next_row_key");
        preference.b((int) R.string.play_next_setting_title);
        preference.c((int) R.string.play_next_setting_summary);
        preference.t = cze.class.getName();
        preference.r();
        b.a(preference);
        this.k = new czh(this.b.a);
        SummaryPreferenceCategory summaryPreferenceCategory = new SummaryPreferenceCategory(context);
        this.m = summaryPreferenceCategory;
        summaryPreferenceCategory.b((int) R.string.home_screen_channels_group_title);
        this.m.c((int) R.string.home_screen_channels_group_summary);
        this.m.d(true);
        a.a((Preference) this.m);
        List list = dck.a(getContext()).e.w;
        if (list != null && !list.isEmpty()) {
            this.h = (String) list.get(0);
        }
    }

    public final void onPause() {
        super.onPause();
        this.k.a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cla.a(long, boolean, boolean):void
     arg types: [long, boolean, int]
     candidates:
      cla.a(java.util.Map, java.lang.Object, java.lang.Object):void
      cla.a(long, boolean, boolean):void */
    public final boolean a(Preference preference, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            this.l.a((long) Integer.parseInt(preference.s), bool.booleanValue(), true);
        }
        return true;
    }

    public final void onResume() {
        super.onResume();
        this.k.a(this);
    }
}
