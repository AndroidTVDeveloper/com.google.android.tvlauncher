package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.appsview.BannerView;
import com.google.android.tvlauncher.appsview.LaunchItemsRowView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: cij */
/* compiled from: PG */
final class cij extends C0261jp implements cit, dcb {

    /* renamed from: A */
    private final Set f5617A = new HashSet(3);

    /* renamed from: B */
    private final List f5618B = new ArrayList(3);

    /* renamed from: C */
    private final Handler f5619C = new Handler();

    /* renamed from: b */
    public final int f5620b;

    /* renamed from: c */
    public final int f5621c;

    /* renamed from: d */
    public final int f5622d;

    /* renamed from: e */
    public final int f5623e;

    /* renamed from: f */
    public final Drawable f5624f;

    /* renamed from: g */
    public final Drawable f5625g;

    /* renamed from: h */
    public final Drawable f5626h;

    /* renamed from: i */
    public final String f5627i;

    /* renamed from: j */
    public final String f5628j;

    /* renamed from: k */
    public final ArrayList f5629k = new ArrayList();

    /* renamed from: l */
    public List f5630l = new ArrayList();

    /* renamed from: m */
    public final chq f5631m = new chq();

    /* renamed from: n */
    public final chq f5632n = new chq();

    /* renamed from: o */
    public final cja f5633o;

    /* renamed from: p */
    public final cfp f5634p;

    /* renamed from: q */
    public chr f5635q;

    /* renamed from: r */
    public cgr f5636r;

    /* renamed from: s */
    public boolean f5637s;

    /* renamed from: t */
    private final int f5638t;

    /* renamed from: u */
    private final int f5639u;

    /* renamed from: v */
    private final int f5640v;

    /* renamed from: w */
    private final int f5641w;

    /* renamed from: x */
    private final int f5642x;

    /* renamed from: y */
    private final int f5643y;

    /* renamed from: z */
    private final ArrayList f5644z = new ArrayList();

    public cij(Context context, cfp cfp, cja cja) {
        this.f5634p = cfp;
        Resources resources = context.getResources();
        this.f5638t = resources.getDimensionPixelOffset(R.dimen.app_view_grid_keyline_app_row_one);
        this.f5639u = resources.getDimensionPixelSize(R.dimen.app_view_grid_keyline_app_row_one_title_above);
        this.f5640v = resources.getDimensionPixelOffset(R.dimen.app_view_grid_keyline_app_row_two);
        this.f5641w = resources.getDimensionPixelOffset(R.dimen.app_view_grid_keyline_app_row_two_title_above);
        this.f5642x = resources.getDimensionPixelOffset(R.dimen.app_view_grid_keyline_app_row_three);
        this.f5643y = resources.getDimensionPixelOffset(R.dimen.app_view_grid_keyline_last_row);
        this.f5620b = resources.getDimensionPixelOffset(R.dimen.app_view_grid_store_offset);
        this.f5621c = resources.getDimensionPixelSize(R.dimen.app_banner_margin_end);
        this.f5627i = resources.getString(R.string.store_find_more_apps);
        this.f5628j = resources.getString(R.string.store_find_more_games);
        this.f5624f = new ColorDrawable(C0035bg.m3116b(context, R.color.app_banner_background_color));
        this.f5622d = resources.getDimensionPixelSize(R.dimen.app_banner_image_max_width);
        this.f5623e = resources.getDimensionPixelSize(R.dimen.app_banner_image_max_height);
        this.f5625g = context.getDrawable(R.drawable.product_logo_play_prism_color_36);
        this.f5626h = context.getDrawable(R.drawable.product_logo_play_games_color_36);
        this.f5633o = cja;
        dch h = dck.m6123a(context).mo4101h();
        this.f5618B.clear();
        this.f5617A.clear();
        this.f5617A.add(1);
        int ordinal = (h == null ? dch.APPS_OEM_GAMES : h).ordinal();
        if (ordinal == 0) {
            this.f5617A.add(4);
            this.f5617A.add(2);
            this.f5618B.addAll(Arrays.asList(1, 4, 2));
        } else if (ordinal == 1) {
            this.f5617A.add(4);
            this.f5617A.add(2);
            this.f5618B.addAll(Arrays.asList(1, 2, 4));
        } else if (ordinal == 2) {
            this.f5617A.add(4);
            this.f5617A.add(2);
            this.f5618B.addAll(Arrays.asList(2, 1, 4));
        } else if (ordinal == 3) {
            this.f5617A.add(4);
            this.f5618B.addAll(Arrays.asList(1, 4));
        }
    }

    /* renamed from: a */
    public final int mo2794a() {
        return this.f5629k.size();
    }

    /* renamed from: a */
    public final int mo2850a(int i) {
        return ((Integer) this.f5629k.get(i)).intValue();
    }

    /* renamed from: f */
    public final int mo2856f(int i) {
        if (i >= 0 && i <= this.f5629k.size() - 1) {
            int a = mo2794a();
            int b = this.f5631m.mo2823b() + this.f5632n.mo2823b() + (this.f5630l.isEmpty() ^ true ? 1 : 0);
            if (b != 1) {
                if (b == 2) {
                    int i2 = a - 1;
                    if (i == i2 && ((Integer) this.f5629k.get(i - 1)).intValue() == 5) {
                        return this.f5641w;
                    }
                    if (i == i2) {
                        return this.f5640v;
                    }
                } else if (b == 3) {
                    int i3 = a - 1;
                    if (i == i3 && (((Integer) this.f5629k.get(i - 1)).intValue() == 5 || ((Integer) this.f5629k.get(i - 2)).intValue() == 5)) {
                        return this.f5643y;
                    }
                    if (i == i3) {
                        return this.f5642x;
                    }
                    int i4 = a - 2;
                    if (i == i4 && ((Integer) this.f5629k.get(i - 1)).intValue() == 5) {
                        return this.f5641w;
                    }
                    if (i == i4) {
                        return this.f5640v;
                    }
                    if (i == a - 3 && ((Integer) this.f5629k.get(i + 1)).intValue() == 5) {
                        return this.f5640v;
                    }
                } else if (i == a - 1) {
                    return this.f5643y;
                } else {
                    if (i == a - 2) {
                        return this.f5641w;
                    }
                    int i5 = a - 3;
                    if (i == i5 && ((Integer) this.f5629k.get(i + 1)).intValue() == 5) {
                        return this.f5640v;
                    }
                    if (i == i5) {
                        return this.f5639u;
                    }
                }
                return this.f5638t;
            }
        }
        return this.f5638t;
    }

    /* renamed from: a */
    public final int mo2851a(chn chn) {
        ArrayList arrayList;
        if (!mo2858g(2)) {
            arrayList = this.f5633o.mo2895d();
        } else if (!chn.f5567g) {
            arrayList = this.f5633o.mo2893c();
        } else {
            arrayList = this.f5633o.mo2889b();
        }
        return arrayList.indexOf(chn);
    }

    /* renamed from: h */
    public final int mo2859h(int i) {
        int indexOf = this.f5618B.indexOf(Integer.valueOf(i));
        for (int i2 = indexOf - 1; i2 >= 0; i2--) {
            int lastIndexOf = this.f5629k.lastIndexOf(Integer.valueOf(((Integer) this.f5618B.get(i2)).intValue()));
            if (lastIndexOf != -1) {
                return lastIndexOf + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f5618B.size()) {
                return this.f5629k.size();
            }
            int indexOf2 = this.f5629k.indexOf(Integer.valueOf(((Integer) this.f5618B.get(indexOf)).intValue()));
            if (indexOf2 != -1) {
                return indexOf2 - 1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo2857f() {
        if (this.f5633o.f5681c) {
            this.f5629k.clear();
            if (!this.f5644z.isEmpty()) {
                this.f5629k.add(3);
            }
            List list = this.f5618B;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                int intValue = ((Integer) list.get(i)).intValue();
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue == 4 && !this.f5630l.isEmpty() && mo2858g(4)) {
                            this.f5629k.add(5);
                            this.f5629k.add(4);
                        }
                    } else if (this.f5632n.mo2826c() > 0) {
                        this.f5629k.add(5);
                        for (int i2 = 0; i2 < this.f5632n.mo2823b(); i2++) {
                            this.f5629k.add(2);
                        }
                    }
                } else if (this.f5631m.mo2826c() > 0) {
                    this.f5629k.add(5);
                    for (int i3 = 0; i3 < this.f5631m.mo2823b(); i3++) {
                        this.f5629k.add(1);
                    }
                }
            }
            mo5303O();
        }
    }

    /* renamed from: g */
    public final boolean mo2858g(int i) {
        return this.f5617A.contains(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo2852a(List list) {
        this.f5630l = list;
        if (!list.isEmpty()) {
            int indexOf = this.f5629k.indexOf(4);
            if (indexOf == -1) {
                int h = mo2859h(4);
                this.f5629k.add(h, 5);
                mo5313d(h);
                int i = h + 1;
                this.f5629k.add(i, 4);
                mo5313d(i);
            } else if (indexOf != -1) {
                mo5312c(indexOf);
                return;
            } else {
                return;
            }
        } else {
            int indexOf2 = this.f5629k.indexOf(4);
            if (indexOf2 != -1) {
                this.f5629k.remove(indexOf2);
                mo5314e(indexOf2);
                int i2 = indexOf2 - 1;
                this.f5629k.remove(i2);
                mo5314e(i2);
            } else {
                return;
            }
        }
        mo5303O();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2797a(C0285km kmVar, int i) {
        int i2;
        List list;
        cif cif = (cif) kmVar;
        if (cif instanceof cih) {
            ((cih) cif).f5611p = this.f5644z;
        }
        boolean z = cif instanceof cie;
        if (z) {
            int intValue = ((Integer) this.f5629k.get(i)).intValue();
            int i3 = i;
            while (true) {
                i2 = -1;
                if (i3 < 0) {
                    break;
                } else if (((Integer) this.f5629k.get(i3)).intValue() == 5) {
                    i2 = -1 + (i - i3);
                    break;
                } else {
                    i3--;
                }
            }
            if (i2 >= 0 && i2 < this.f5629k.size()) {
                if (intValue == 1) {
                    list = this.f5631m.mo2825b(i2);
                } else if (intValue == 2) {
                    list = this.f5632n.mo2825b(i2);
                }
                if (z) {
                    cie cie = (cie) cif;
                    cie.f5599p.clear();
                    cie.f5599p.addAll(list);
                }
            } else {
                StringBuilder sb = new StringBuilder(103);
                sb.append("RowListAdapter: Title relative position was out of bounds : ");
                sb.append(i2);
                sb.append(", in addLaunchItemToViewHolder()");
                Log.e("RowListAdapter", sb.toString());
            }
        }
        if (cif instanceof cii) {
            int i4 = i + 1;
            if (i4 >= this.f5629k.size()) {
                ((cii) cif).f5615p = "";
            } else {
                Resources resources = cif.f9783a.getContext().getResources();
                int intValue2 = ((Integer) this.f5629k.get(i4)).intValue();
                if (intValue2 == 1) {
                    ((cii) cif).f5615p = resources.getString(R.string.app_folder_title);
                } else if (intValue2 == 2) {
                    ((cii) cif).f5615p = resources.getString(R.string.game_folder_title);
                } else if (intValue2 != 4) {
                    ((cii) cif).f5615p = "";
                } else {
                    cii cii = (cii) cif;
                    cii.f5615p = dcc.m6108a(cif.f9783a.getContext()).f8206i;
                    cii.f5616q = resources.getColor(R.color.reference_white_10, null);
                }
            }
        }
        cif.mo2846u();
        if (this.f5637s) {
            cif.mo2849x();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2854a(C0285km kmVar, int i, List list) {
        cif cif = (cif) kmVar;
        if (!(cif instanceof cie) || list.isEmpty() || !(list.get(0) instanceof Integer)) {
            mo2797a(cif, i);
            return;
        }
        cie cie = (cie) cif;
        int intValue = ((Integer) list.get(0)).intValue();
        LaunchItemsRowView launchItemsRowView = (LaunchItemsRowView) cie.f9783a;
        if (intValue < launchItemsRowView.getChildCount()) {
            BannerView bannerView = (BannerView) launchItemsRowView.getChildAt(intValue);
            bannerView.mo3225a((chn) cie.f5599p.get(intValue));
            cie.mo2842a((chn) cie.f5599p.get(intValue), bannerView);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0285km mo2795a(ViewGroup viewGroup, int i) {
        if (i == 1 || i == 2) {
            return new cie(this, LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.apps_view_base_row_view, viewGroup, false), this.f5634p);
        }
        if (i == 3) {
            return new cih(this, LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.apps_view_store_row_view, viewGroup, false), this.f5634p);
        }
        if (i == 4) {
            return new cig(this, LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.apps_promotion_row, viewGroup, false), this.f5634p);
        }
        if (i == 5) {
            return new cii(LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.title_row_view, viewGroup, false), this.f5634p);
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unexpected row type : ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo2798a(boolean z, Pair pair) {
        mo2855e();
        mo2857f();
        ArrayList arrayList = this.f5629k;
        int i = 1;
        if (z && mo2858g(2)) {
            i = 2;
        }
        int indexOf = arrayList.indexOf(Integer.valueOf(i));
        if (pair != null && indexOf != -1 && this.f5636r != null) {
            int intValue = ((Integer) pair.first).intValue();
            cgr cgr = this.f5636r;
            int intValue2 = ((Integer) pair.second).intValue();
            cgr.f5478a.f5481c.mo5619k(indexOf + intValue);
            cgr.f5478a.f5481c.getViewTreeObserver().addOnGlobalLayoutListener(new cgq(cgr, intValue2));
        }
    }

    /* renamed from: a */
    public final void mo2796a(ArrayList arrayList) {
        this.f5619C.post(new cib(this, arrayList));
    }

    /* renamed from: d */
    public final void mo2801d() {
        mo2855e();
        mo2857f();
        int c = this.f5631m.mo2826c();
        int c2 = this.f5632n.mo2826c();
        cft cft = new cft(14, "app_count");
        dja k = cft.mo2738k();
        int i = c + c2;
        if (k.f8673b) {
            k.mo4505b();
            k.f8673b = false;
        }
        dms dms = (dms) k.f8672a;
        dms dms2 = dms.f8864e;
        int i2 = dms.f8865a | 1;
        dms.f8865a = i2;
        dms.f8866b = i;
        dms.f8865a = i2 | 2;
        dms.f8867c = c2;
        this.f5634p.mo2714a(cft);
    }

    /* renamed from: b */
    public final void mo2799b(ArrayList arrayList) {
        this.f5619C.post(new cic(this, arrayList));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2853a(C0285km kmVar) {
        ((cif) kmVar).mo2848w();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo2855e() {
        this.f5631m.mo2821a();
        this.f5632n.mo2821a();
        this.f5644z.clear();
        if (mo2858g(2)) {
            this.f5631m.mo2822a(this.f5633o.mo2893c());
            this.f5632n.mo2822a(this.f5633o.mo2889b());
        } else {
            this.f5631m.mo2822a(this.f5633o.mo2895d());
        }
        this.f5644z.add(this.f5633o.f5690l);
        this.f5644z.add(this.f5633o.f5691m);
        this.f5644z.removeAll(Collections.singleton(null));
    }
}
