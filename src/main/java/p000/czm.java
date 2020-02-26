package p000;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.settings.SummaryPreferenceCategory;
import java.util.Comparator;
import java.util.List;

/* renamed from: czm */
/* compiled from: PG */
public final class czm extends C0334mh implements czg, C0447qm {

    /* renamed from: h */
    public String f7984h = null;

    /* renamed from: i */
    private int f7985i;

    /* renamed from: j */
    private int f7986j;

    /* renamed from: k */
    private czh f7987k;

    /* renamed from: l */
    private cla f7988l;

    /* renamed from: m */
    private SummaryPreferenceCategory f7989m;

    /* renamed from: n */
    private final cfr f7990n = new cfr(this);

    /* renamed from: o */
    private final Comparator f7991o = new czk(this);

    /* renamed from: p */
    private agj f7992p;

    public czm() {
        int i = cla.f5856x;
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
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3996a(java.util.List r13) {
        /*
            r12 = this;
            boolean r0 = r12.isAdded()
            if (r0 == 0) goto L_0x00fe
            ri r0 = r12.f10224b
            android.content.Context r0 = r0.f10247a
            com.google.android.tvlauncher.settings.SummaryPreferenceCategory r1 = r12.f7989m
            r1.mo1123s()
            int r1 = r13.size()
            r2 = 0
            if (r1 <= 0) goto L_0x00f2
            java.util.Comparator r1 = r12.f7991o
            r13.sort(r1)
            int r1 = r13.size()
            r3 = 0
        L_0x0020:
            if (r3 >= r1) goto L_0x00f2
            java.lang.Object r4 = r13.get(r3)
            czf r4 = (p000.czf) r4
            cxs r5 = r4.f7966c
            java.lang.String r6 = r4.f7964a
            java.lang.String r7 = "sponsored.legacy"
            boolean r6 = r7.equals(r6)
            r7 = 1
            if (r6 == 0) goto L_0x0036
            goto L_0x0067
        L_0x0036:
            int r8 = r5.f7867b
            if (r8 != r7) goto L_0x0067
            com.google.android.tvlauncher.settings.AppBannerSwitchPreference r8 = new com.google.android.tvlauncher.settings.AppBannerSwitchPreference
            r8.<init>(r0)
            boolean r9 = r5.f7872g
            r8.f6687d = r9
            boolean r9 = r5.f7870e
            r8.mo1131d(r9)
            r8.f6685c = r7
            boolean r7 = r5.f7871f
            if (r7 == 0) goto L_0x0055
            r7 = 2131886300(0x7f1200dc, float:1.9407175E38)
            r8.mo1097c(r7)
            goto L_0x005a
        L_0x0055:
            java.lang.String r7 = r5.f7868c
            r8.mo1078a(r7)
        L_0x005a:
            long r9 = r5.f7869d
            java.lang.String r5 = java.lang.Long.toString(r9)
            r8.mo1098c(r5)
            r8.f1360n = r12
            goto L_0x00aa
        L_0x0067:
            com.google.android.tvlauncher.settings.AppBannerDrillDownPreference r8 = new com.google.android.tvlauncher.settings.AppBannerDrillDownPreference
            r8.<init>(r0)
            r9 = r6 ^ 1
            r8.f6683a = r9
            java.lang.String r9 = r4.f7964a
            r8.mo1098c(r9)
            android.content.res.Resources r9 = r0.getResources()
            int r5 = r5.f7867b
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            r7[r2] = r10
            r10 = 2131755008(0x7f100000, float:1.9140883E38)
            java.lang.String r5 = r9.getQuantityString(r10, r5, r7)
            r8.mo1078a(r5)
            java.lang.Class<czj> r5 = p000.czj.class
            java.lang.String r5 = r5.getName()
            r8.f1366t = r5
            android.os.Bundle r5 = r8.mo1105h()
            java.lang.String r7 = r4.f7964a
            java.lang.String r9 = "channel_app"
            r5.putString(r9, r7)
            java.lang.CharSequence r7 = r4.f7965b
            java.lang.String r7 = r7.toString()
            java.lang.String r9 = "app_name"
            r5.putString(r9, r7)
        L_0x00aa:
            java.lang.CharSequence r5 = r4.f7965b
            r8.mo1094b(r5)
            r8.mo1115r()
            if (r6 != 0) goto L_0x00e9
            czl r5 = new czl
            int r6 = r12.f7986j
            int r7 = r12.f7985i
            r5.<init>(r6, r7, r8)
            android.content.Context r6 = r12.getContext()
            sx r6 = p000.C0497si.m8296c(r6)
            cje r7 = new cje
            java.lang.String r9 = r4.f7964a
            android.content.pm.ResolveInfo r4 = r4.f7967d
            cjd r10 = p000.cjd.BANNER
            android.content.Context r11 = r12.getContext()
            cja r11 = p000.dbq.m6093a(r11)
            java.util.Locale r11 = r11.mo2902h()
            r7.<init>(r9, r4, r10, r11)
            su r4 = r6.mo5944a(r7)
            agj r6 = r12.f7992p
            su r4 = r4.mo202b(r6)
            r4.mo5937a(r5)
        L_0x00e9:
            com.google.android.tvlauncher.settings.SummaryPreferenceCategory r4 = r12.f7989m
            r4.mo1117a(r8)
            int r3 = r3 + 1
            goto L_0x0020
        L_0x00f2:
            cfr r13 = r12.f7990n
            cfs r0 = new cfs
            r1 = 21
            r0.<init>(r1, r2)
            r13.mo2714a(r0)
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.czm.mo3996a(java.util.List):void");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        this.f7985i = context.getResources().getDimensionPixelSize(R.dimen.preference_item_banner_height);
        this.f7986j = context.getResources().getDimensionPixelSize(R.dimen.preference_item_banner_width);
        ColorDrawable colorDrawable = new ColorDrawable(C0035bg.m3116b(context, R.color.app_banner_background_color));
        this.f7992p = new agj((byte) 0).mo195a(colorDrawable).mo205c(colorDrawable).mo199a(C0594vy.f10649a).mo198a((C0544ub) new dae(getContext().getColor(R.color.app_banner_background_color), true));
        this.f7988l = cla.m5025a(context);
    }

    /* renamed from: a */
    public final void mo3836a(Bundle bundle) {
        C0470ri riVar = this.f10224b;
        Context context = riVar.f10247a;
        PreferenceScreen a = riVar.mo5809a(context);
        a.mo1092b((int) R.string.add_channels_title);
        mo5792a(a);
        PreferenceScreen b = mo5793b();
        Preference preference = new Preference(this.f10224b.f10247a);
        preference.f1371y = R.layout.watch_next_preference;
        preference.mo1098c("show_watch_next_row_key");
        preference.mo1092b((int) R.string.play_next_setting_title);
        preference.mo1097c((int) R.string.play_next_setting_summary);
        preference.f1366t = cze.class.getName();
        preference.mo1115r();
        b.mo1117a(preference);
        this.f7987k = new czh(this.f10224b.f10247a);
        SummaryPreferenceCategory summaryPreferenceCategory = new SummaryPreferenceCategory(context);
        this.f7989m = summaryPreferenceCategory;
        summaryPreferenceCategory.mo1092b((int) R.string.home_screen_channels_group_title);
        this.f7989m.mo1097c((int) R.string.home_screen_channels_group_summary);
        this.f7989m.mo1131d(true);
        a.mo1117a((Preference) this.f7989m);
        List list = dck.m6123a(getContext()).f8228e.f8288w;
        if (list != null && !list.isEmpty()) {
            this.f7984h = (String) list.get(0);
        }
    }

    public final void onPause() {
        super.onPause();
        this.f7987k.mo4002a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cla.a(long, boolean, boolean):void
     arg types: [long, boolean, int]
     candidates:
      cla.a(java.util.Map, java.lang.Object, java.lang.Object):void
      cla.a(long, boolean, boolean):void */
    /* renamed from: a */
    public final boolean mo3997a(Preference preference, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            this.f7988l.mo3052a((long) Integer.parseInt(preference.f1365s), bool.booleanValue(), true);
        }
        return true;
    }

    public final void onResume() {
        super.onResume();
        this.f7987k.mo4003a(this);
    }
}
