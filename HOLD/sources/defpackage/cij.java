package defpackage;

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

/* renamed from: cij  reason: default package */
/* compiled from: PG */
final class cij extends jp implements cit, dcb {
    private final Set A = new HashSet(3);
    private final List B = new ArrayList(3);
    private final Handler C = new Handler();
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Drawable f;
    public final Drawable g;
    public final Drawable h;
    public final String i;
    public final String j;
    public final ArrayList k = new ArrayList();
    public List l = new ArrayList();
    public final chq m = new chq();
    public final chq n = new chq();
    public final cja o;
    public final cfp p;
    public chr q;
    public cgr r;
    public boolean s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private final ArrayList z = new ArrayList();

    public cij(Context context, cfp cfp, cja cja) {
        this.p = cfp;
        Resources resources = context.getResources();
        this.t = resources.getDimensionPixelOffset(R.dimen.app_view_grid_keyline_app_row_one);
        this.u = resources.getDimensionPixelSize(R.dimen.app_view_grid_keyline_app_row_one_title_above);
        this.v = resources.getDimensionPixelOffset(R.dimen.app_view_grid_keyline_app_row_two);
        this.w = resources.getDimensionPixelOffset(R.dimen.app_view_grid_keyline_app_row_two_title_above);
        this.x = resources.getDimensionPixelOffset(R.dimen.app_view_grid_keyline_app_row_three);
        this.y = resources.getDimensionPixelOffset(R.dimen.app_view_grid_keyline_last_row);
        this.b = resources.getDimensionPixelOffset(R.dimen.app_view_grid_store_offset);
        this.c = resources.getDimensionPixelSize(R.dimen.app_banner_margin_end);
        this.i = resources.getString(R.string.store_find_more_apps);
        this.j = resources.getString(R.string.store_find_more_games);
        this.f = new ColorDrawable(bg.b(context, R.color.app_banner_background_color));
        this.d = resources.getDimensionPixelSize(R.dimen.app_banner_image_max_width);
        this.e = resources.getDimensionPixelSize(R.dimen.app_banner_image_max_height);
        this.g = context.getDrawable(R.drawable.product_logo_play_prism_color_36);
        this.h = context.getDrawable(R.drawable.product_logo_play_games_color_36);
        this.o = cja;
        dch h2 = dck.a(context).h();
        this.B.clear();
        this.A.clear();
        this.A.add(1);
        int ordinal = (h2 == null ? dch.APPS_OEM_GAMES : h2).ordinal();
        if (ordinal == 0) {
            this.A.add(4);
            this.A.add(2);
            this.B.addAll(Arrays.asList(1, 4, 2));
        } else if (ordinal == 1) {
            this.A.add(4);
            this.A.add(2);
            this.B.addAll(Arrays.asList(1, 2, 4));
        } else if (ordinal == 2) {
            this.A.add(4);
            this.A.add(2);
            this.B.addAll(Arrays.asList(2, 1, 4));
        } else if (ordinal == 3) {
            this.A.add(4);
            this.B.addAll(Arrays.asList(1, 4));
        }
    }

    public final int a() {
        return this.k.size();
    }

    public final int a(int i2) {
        return ((Integer) this.k.get(i2)).intValue();
    }

    public final int f(int i2) {
        if (i2 >= 0 && i2 <= this.k.size() - 1) {
            int a = a();
            int b2 = this.m.b() + this.n.b() + (this.l.isEmpty() ^ true ? 1 : 0);
            if (b2 != 1) {
                if (b2 == 2) {
                    int i3 = a - 1;
                    if (i2 == i3 && ((Integer) this.k.get(i2 - 1)).intValue() == 5) {
                        return this.w;
                    }
                    if (i2 == i3) {
                        return this.v;
                    }
                } else if (b2 == 3) {
                    int i4 = a - 1;
                    if (i2 == i4 && (((Integer) this.k.get(i2 - 1)).intValue() == 5 || ((Integer) this.k.get(i2 - 2)).intValue() == 5)) {
                        return this.y;
                    }
                    if (i2 == i4) {
                        return this.x;
                    }
                    int i5 = a - 2;
                    if (i2 == i5 && ((Integer) this.k.get(i2 - 1)).intValue() == 5) {
                        return this.w;
                    }
                    if (i2 == i5) {
                        return this.v;
                    }
                    if (i2 == a - 3 && ((Integer) this.k.get(i2 + 1)).intValue() == 5) {
                        return this.v;
                    }
                } else if (i2 == a - 1) {
                    return this.y;
                } else {
                    if (i2 == a - 2) {
                        return this.w;
                    }
                    int i6 = a - 3;
                    if (i2 == i6 && ((Integer) this.k.get(i2 + 1)).intValue() == 5) {
                        return this.v;
                    }
                    if (i2 == i6) {
                        return this.u;
                    }
                }
                return this.t;
            }
        }
        return this.t;
    }

    public final int a(chn chn) {
        ArrayList arrayList;
        if (!g(2)) {
            arrayList = this.o.d();
        } else if (!chn.g) {
            arrayList = this.o.c();
        } else {
            arrayList = this.o.b();
        }
        return arrayList.indexOf(chn);
    }

    public final int h(int i2) {
        int indexOf = this.B.indexOf(Integer.valueOf(i2));
        for (int i3 = indexOf - 1; i3 >= 0; i3--) {
            int lastIndexOf = this.k.lastIndexOf(Integer.valueOf(((Integer) this.B.get(i3)).intValue()));
            if (lastIndexOf != -1) {
                return lastIndexOf + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.B.size()) {
                return this.k.size();
            }
            int indexOf2 = this.k.indexOf(Integer.valueOf(((Integer) this.B.get(indexOf)).intValue()));
            if (indexOf2 != -1) {
                return indexOf2 - 1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        if (this.o.c) {
            this.k.clear();
            if (!this.z.isEmpty()) {
                this.k.add(3);
            }
            List list = this.B;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                int intValue = ((Integer) list.get(i2)).intValue();
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue == 4 && !this.l.isEmpty() && g(4)) {
                            this.k.add(5);
                            this.k.add(4);
                        }
                    } else if (this.n.c() > 0) {
                        this.k.add(5);
                        for (int i3 = 0; i3 < this.n.b(); i3++) {
                            this.k.add(2);
                        }
                    }
                } else if (this.m.c() > 0) {
                    this.k.add(5);
                    for (int i4 = 0; i4 < this.m.b(); i4++) {
                        this.k.add(1);
                    }
                }
            }
            O();
        }
    }

    public final boolean g(int i2) {
        return this.A.contains(Integer.valueOf(i2));
    }

    public final void a(List list) {
        this.l = list;
        if (!list.isEmpty()) {
            int indexOf = this.k.indexOf(4);
            if (indexOf == -1) {
                int h2 = h(4);
                this.k.add(h2, 5);
                d(h2);
                int i2 = h2 + 1;
                this.k.add(i2, 4);
                d(i2);
            } else if (indexOf != -1) {
                c(indexOf);
                return;
            } else {
                return;
            }
        } else {
            int indexOf2 = this.k.indexOf(4);
            if (indexOf2 != -1) {
                this.k.remove(indexOf2);
                e(indexOf2);
                int i3 = indexOf2 - 1;
                this.k.remove(i3);
                e(i3);
            } else {
                return;
            }
        }
        O();
    }

    public final /* bridge */ /* synthetic */ void a(km kmVar, int i2) {
        int i3;
        List list;
        cif cif = (cif) kmVar;
        if (cif instanceof cih) {
            ((cih) cif).p = this.z;
        }
        boolean z2 = cif instanceof cie;
        if (z2) {
            int intValue = ((Integer) this.k.get(i2)).intValue();
            int i4 = i2;
            while (true) {
                i3 = -1;
                if (i4 < 0) {
                    break;
                } else if (((Integer) this.k.get(i4)).intValue() == 5) {
                    i3 = -1 + (i2 - i4);
                    break;
                } else {
                    i4--;
                }
            }
            if (i3 >= 0 && i3 < this.k.size()) {
                if (intValue == 1) {
                    list = this.m.b(i3);
                } else if (intValue == 2) {
                    list = this.n.b(i3);
                }
                if (z2) {
                    cie cie = (cie) cif;
                    cie.p.clear();
                    cie.p.addAll(list);
                }
            } else {
                StringBuilder sb = new StringBuilder(103);
                sb.append("RowListAdapter: Title relative position was out of bounds : ");
                sb.append(i3);
                sb.append(", in addLaunchItemToViewHolder()");
                Log.e("RowListAdapter", sb.toString());
            }
        }
        if (cif instanceof cii) {
            int i5 = i2 + 1;
            if (i5 >= this.k.size()) {
                ((cii) cif).p = "";
            } else {
                Resources resources = cif.a.getContext().getResources();
                int intValue2 = ((Integer) this.k.get(i5)).intValue();
                if (intValue2 == 1) {
                    ((cii) cif).p = resources.getString(R.string.app_folder_title);
                } else if (intValue2 == 2) {
                    ((cii) cif).p = resources.getString(R.string.game_folder_title);
                } else if (intValue2 != 4) {
                    ((cii) cif).p = "";
                } else {
                    cii cii = (cii) cif;
                    cii.p = dcc.a(cif.a.getContext()).i;
                    cii.q = resources.getColor(R.color.reference_white_10, null);
                }
            }
        }
        cif.u();
        if (this.s) {
            cif.x();
        }
    }

    public final /* bridge */ /* synthetic */ void a(km kmVar, int i2, List list) {
        cif cif = (cif) kmVar;
        if (!(cif instanceof cie) || list.isEmpty() || !(list.get(0) instanceof Integer)) {
            a(cif, i2);
            return;
        }
        cie cie = (cie) cif;
        int intValue = ((Integer) list.get(0)).intValue();
        LaunchItemsRowView launchItemsRowView = (LaunchItemsRowView) cie.a;
        if (intValue < launchItemsRowView.getChildCount()) {
            BannerView bannerView = (BannerView) launchItemsRowView.getChildAt(intValue);
            bannerView.a((chn) cie.p.get(intValue));
            cie.a((chn) cie.p.get(intValue), bannerView);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final /* bridge */ /* synthetic */ km a(ViewGroup viewGroup, int i2) {
        if (i2 == 1 || i2 == 2) {
            return new cie(this, LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.apps_view_base_row_view, viewGroup, false), this.p);
        }
        if (i2 == 3) {
            return new cih(this, LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.apps_view_store_row_view, viewGroup, false), this.p);
        }
        if (i2 == 4) {
            return new cig(this, LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.apps_promotion_row, viewGroup, false), this.p);
        }
        if (i2 == 5) {
            return new cii(LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.title_row_view, viewGroup, false), this.p);
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unexpected row type : ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void a(boolean z2, Pair pair) {
        e();
        f();
        ArrayList arrayList = this.k;
        int i2 = 1;
        if (z2 && g(2)) {
            i2 = 2;
        }
        int indexOf = arrayList.indexOf(Integer.valueOf(i2));
        if (pair != null && indexOf != -1 && this.r != null) {
            int intValue = ((Integer) pair.first).intValue();
            cgr cgr = this.r;
            int intValue2 = ((Integer) pair.second).intValue();
            cgr.a.c.k(indexOf + intValue);
            cgr.a.c.getViewTreeObserver().addOnGlobalLayoutListener(new cgq(cgr, intValue2));
        }
    }

    public final void a(ArrayList arrayList) {
        this.C.post(new cib(this, arrayList));
    }

    public final void d() {
        e();
        f();
        int c2 = this.m.c();
        int c3 = this.n.c();
        cft cft = new cft(14, "app_count");
        dja k2 = cft.k();
        int i2 = c2 + c3;
        if (k2.b) {
            k2.b();
            k2.b = false;
        }
        dms dms = (dms) k2.a;
        dms dms2 = dms.e;
        int i3 = dms.a | 1;
        dms.a = i3;
        dms.b = i2;
        dms.a = i3 | 2;
        dms.c = c3;
        this.p.a(cft);
    }

    public final void b(ArrayList arrayList) {
        this.C.post(new cic(this, arrayList));
    }

    public final /* bridge */ /* synthetic */ void a(km kmVar) {
        ((cif) kmVar).w();
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        this.m.a();
        this.n.a();
        this.z.clear();
        if (g(2)) {
            this.m.a(this.o.c());
            this.n.a(this.o.b());
        } else {
            this.m.a(this.o.d());
        }
        this.z.add(this.o.l);
        this.z.add(this.o.m);
        this.z.removeAll(Collections.singleton(null));
    }
}
