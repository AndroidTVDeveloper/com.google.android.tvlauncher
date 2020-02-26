package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.appsview.BannerView;
import com.google.android.tvlauncher.appsview.LaunchItemsRowView;
import java.util.ArrayList;

/* renamed from: cie  reason: default package */
/* compiled from: PG */
final class cie extends cif implements View.OnClickListener, View.OnLongClickListener, View.OnFocusChangeListener, cgx, cfp {
    public final ArrayList p = new ArrayList();
    public final /* synthetic */ cij q;
    private final String r;
    private final String s;
    private final Drawable t;
    private final Drawable u;
    private daw v;
    private final LaunchItemsRowView w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cie(cij cij, View view, cfp cfp) {
        super(view, cfp);
        this.q = cij;
        this.w = (LaunchItemsRowView) view;
        Context context = view.getContext();
        this.r = context.getString(R.string.context_menu_favorite_text);
        this.s = context.getString(R.string.context_menu_unfavorite_text);
        this.t = context.getDrawable(R.drawable.ic_context_menu_favorite_black);
        this.u = context.getDrawable(R.drawable.ic_context_menu_unfavorite_black);
    }

    /* access modifiers changed from: protected */
    public final int v() {
        return this.q.f(d());
    }

    public final void a(chn chn, BannerView bannerView) {
        chp chp = new chp(bannerView.getContext());
        chp.a = new cir(chn, cjd.BANNER, this.q.o.h());
        chp.b = bannerView.d;
        cij cij = this.q;
        chp.c = cij.f;
        chp.d = cij.d;
        chp.e = cij.e;
        chp.a();
    }

    public final void a(cfs cfs) {
        int i = this.f;
        int d = d() - this.q.k.indexOf(Integer.valueOf(i));
        if (i == 1) {
            cfs.a(dhs.a).b(d);
        } else if (i == 2) {
            cfs.a(dhs.h).b(d);
        }
        this.q.p.a(cfs);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cfs.<init>(int, char):void
     arg types: [int, int]
     candidates:
      cfs.<init>(int, byte):void
      cfs.<init>(int, char):void */
    public final void a(chn chn, int i) {
        cfs cfs = new cfs(i, 0);
        cfs.b(dhs.q);
        LaunchItemsRowView launchItemsRowView = (LaunchItemsRowView) this.a;
        int childCount = launchItemsRowView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = launchItemsRowView.getChildAt(i2);
            if ((childAt instanceof BannerView) && ((BannerView) childAt).c == chn) {
                cfs.a(i2);
                dja g = cfs.g();
                String str = chn.c;
                if (g.b) {
                    g.b();
                    g.b = false;
                }
                dmj dmj = (dmj) g.a;
                dmj dmj2 = dmj.f;
                str.getClass();
                int i3 = dmj.a | 1;
                dmj.a = i3;
                dmj.b = str;
                boolean z = chn.g;
                dmj.a = i3 | 4;
                dmj.c = z;
                a(cfs);
                return;
            }
        }
        throw new IllegalStateException("Item not found in LaunchItemsRowView");
    }

    public final void onClick(View view) {
        if (!(view instanceof BannerView)) {
            return;
        }
        if (dcy.b(view.getContext())) {
            a((BannerView) view);
        } else {
            a(((BannerView) view).c, view);
        }
    }

    public final void onFocusChange(View view, boolean z) {
        if (view instanceof BannerView) {
            daw daw = this.v;
            if (daw != null && daw.o && !z) {
                daw.a();
            }
            ((BannerView) view).a(z);
        }
    }

    public final boolean onLongClick(View view) {
        a((BannerView) view);
        return true;
    }

    public final void a(chn chn, View view) {
        if (chn == null || chn.a == null || this.q.q == null) {
            Toast.makeText(this.w.getContext(), (int) R.string.failed_launch, 0).show();
            if (chn == null) {
                Log.e("RowListAdapter", "Cannot start activity: item was null");
            } else if (chn.a == null) {
                String valueOf = String.valueOf(chn);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
                sb.append("Cannot start activity: intent was null for ");
                sb.append(valueOf);
                Log.e("RowListAdapter", sb.toString());
            } else if (this.q.q == null) {
                String valueOf2 = String.valueOf(chn);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 44);
                sb2.append("Cannot start activity: no listener for item ");
                sb2.append(valueOf2);
                Log.e("RowListAdapter", sb2.toString());
            }
        } else {
            a(chn, 25);
            this.q.q.a(chn.a, view);
        }
    }

    public final void a(int i) {
        daw daw;
        if ((i == 4 || i == 8) && (daw = this.v) != null && daw.o) {
            daw.a();
        }
    }

    public final void w() {
        LaunchItemsRowView launchItemsRowView = this.w;
        for (int i = 0; i < launchItemsRowView.getChildCount(); i++) {
            View childAt = launchItemsRowView.getChildAt(i);
            if (childAt instanceof BannerView) {
                BannerView bannerView = (BannerView) childAt;
                chm chm = bannerView.g;
                if (chm != null) {
                    if (chm.a.getAnimation() != null) {
                        chm.a.getAnimation().cancel();
                    }
                    if (chm.c.getAnimation() != null) {
                        chm.c.getAnimation().cancel();
                    }
                    if (chm.d.getAnimation() != null) {
                        chm.d.getAnimation().cancel();
                    }
                    Animator animator = chm.n;
                    if (animator != null) {
                        animator.end();
                    }
                    bannerView.g.b();
                }
                if (bannerView.d.getAnimation() != null) {
                    bannerView.d.getAnimation().cancel();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [android.view.View] */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.tvlauncher.appsview.LaunchItemsRowView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = 4
            if (r1 >= r2) goto L_0x00a2
            java.util.ArrayList r2 = r7.p
            int r2 = r2.size()
            r3 = 8
            if (r1 >= r2) goto L_0x0082
            java.util.ArrayList r2 = r7.p
            java.lang.Object r2 = r2.get(r1)
            chn r2 = (defpackage.chn) r2
            com.google.android.tvlauncher.appsview.LaunchItemsRowView r4 = r7.w
            int r4 = r4.getChildCount()
            if (r1 >= r4) goto L_0x003f
            com.google.android.tvlauncher.appsview.LaunchItemsRowView r4 = r7.w
            android.view.View r4 = r4.getChildAt(r1)
            boolean r5 = r4 instanceof com.google.android.tvlauncher.appsview.BannerView
            if (r5 == 0) goto L_0x003d
            com.google.android.tvlauncher.appsview.BannerView r4 = (com.google.android.tvlauncher.appsview.BannerView) r4
            android.widget.ImageView r5 = r4.d
            int r6 = r5.getVisibility()
            if (r6 != r3) goto L_0x0036
            r5.setVisibility(r0)
        L_0x0036:
            r4.a(r2)
            r4.setVisibility(r0)
            goto L_0x007b
        L_0x003d:
            r4 = 0
            goto L_0x007b
        L_0x003f:
            com.google.android.tvlauncher.appsview.LaunchItemsRowView r3 = r7.w
            android.content.Context r3 = r3.getContext()
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131624116(0x7f0e00b4, float:1.8875403E38)
            com.google.android.tvlauncher.appsview.LaunchItemsRowView r5 = r7.w
            android.view.View r3 = r3.inflate(r4, r5, r0)
            r4 = r3
            com.google.android.tvlauncher.appsview.BannerView r4 = (com.google.android.tvlauncher.appsview.BannerView) r4
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            r3.<init>(r5)
            cij r5 = r7.q
            int r5 = r5.c
            r3.setMarginEnd(r5)
            r4.setLayoutParams(r3)
            r4.a(r2)
            r4.setOnClickListener(r7)
            r4.setOnLongClickListener(r7)
            r4.setOnFocusChangeListener(r7)
            r4.n = r7
            com.google.android.tvlauncher.appsview.LaunchItemsRowView r3 = r7.w
            r3.addView(r4)
        L_0x007b:
            if (r4 != 0) goto L_0x007e
            goto L_0x009e
        L_0x007e:
            r7.a(r2, r4)
            goto L_0x009e
        L_0x0082:
            com.google.android.tvlauncher.appsview.LaunchItemsRowView r2 = r7.w
            int r2 = r2.getChildCount()
            if (r1 >= r2) goto L_0x009e
            com.google.android.tvlauncher.appsview.LaunchItemsRowView r2 = r7.w
            android.view.View r2 = r2.getChildAt(r1)
            boolean r4 = r2 instanceof com.google.android.tvlauncher.appsview.BannerView
            if (r4 == 0) goto L_0x009e
            com.google.android.tvlauncher.appsview.BannerView r2 = (com.google.android.tvlauncher.appsview.BannerView) r2
            r2.setVisibility(r3)
            android.widget.ImageView r2 = r2.d
            r2.setVisibility(r3)
        L_0x009e:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cie.u():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00c9, code lost:
        if (r12.contains(r1) != false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00df, code lost:
        if (r12.contains(r1) != false) goto L_0x00e1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0111 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(com.google.android.tvlauncher.appsview.BannerView r12) {
        /*
            r11 = this;
            android.content.Context r0 = r12.getContext()
            chn r1 = r12.c
            cij r2 = r11.q
            cja r2 = r2.o
            boolean r2 = r2.b(r1)
            daw r9 = new daw
            r4 = r0
            android.app.Activity r4 = (android.app.Activity) r4
            android.widget.FrameLayout r5 = r12.h
            int r6 = r12.a
            float r7 = r12.getScaleX()
            float r8 = r12.getScaleY()
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r11.v = r9
            day r3 = new day
            r4 = 2131886207(0x7f12007f, float:1.9406986E38)
            java.lang.String r4 = r0.getString(r4)
            r5 = 2131230905(0x7f0800b9, float:1.8077876E38)
            android.graphics.drawable.Drawable r5 = r0.getDrawable(r5)
            r6 = 0
            r3.<init>(r6, r4, r5)
            r3.a()
            daw r4 = r11.v
            r4.a(r3)
            daw r3 = r11.v
            day r4 = new day
            r5 = 2131886206(0x7f12007e, float:1.9406984E38)
            java.lang.String r5 = r0.getString(r5)
            r7 = 2131230903(0x7f0800b7, float:1.8077872E38)
            android.graphics.drawable.Drawable r7 = r0.getDrawable(r7)
            r8 = 1
            r4.<init>(r8, r5, r7)
            r3.a(r4)
            daw r3 = r11.v
            day r4 = new day
            if (r2 != 0) goto L_0x0063
            java.lang.String r5 = r11.r
            goto L_0x0065
        L_0x0063:
            java.lang.String r5 = r11.s
        L_0x0065:
            if (r2 != 0) goto L_0x006a
            android.graphics.drawable.Drawable r2 = r11.t
            goto L_0x006c
        L_0x006a:
            android.graphics.drawable.Drawable r2 = r11.u
        L_0x006c:
            r7 = 2
            r4.<init>(r7, r5, r2)
            r3.a(r4)
            boolean r2 = r1.h
            r3 = 3
            if (r2 != 0) goto L_0x0091
            daw r2 = r11.v
            day r4 = new day
            r5 = 2131886205(0x7f12007d, float:1.9406982E38)
            java.lang.String r5 = r0.getString(r5)
            r9 = 2131230902(0x7f0800b6, float:1.807787E38)
            android.graphics.drawable.Drawable r9 = r0.getDrawable(r9)
            r4.<init>(r3, r5, r9)
            r2.a(r4)
        L_0x0091:
            daw r2 = r11.v
            day r4 = new day
            r5 = 2131886209(0x7f120081, float:1.940699E38)
            java.lang.String r5 = r0.getString(r5)
            r9 = 2131230907(0x7f0800bb, float:1.807788E38)
            android.graphics.drawable.Drawable r9 = r0.getDrawable(r9)
            r10 = 4
            r4.<init>(r10, r5, r9)
            r2.a(r4)
            daw r2 = r11.v
            cid r4 = new cid
            r4.<init>(r11, r1, r12)
            r2.f = r4
            boolean r12 = r1.g
            if (r12 != 0) goto L_0x00cd
            cij r12 = r11.q
            cja r12 = r12.o
            java.util.ArrayList r12 = r12.c()
            int r2 = r12.size()
            if (r2 != r8) goto L_0x00e3
            boolean r12 = r12.contains(r1)
            if (r12 == 0) goto L_0x00cc
            goto L_0x00e1
        L_0x00cc:
            goto L_0x00e3
        L_0x00cd:
            cij r12 = r11.q
            cja r12 = r12.o
            java.util.ArrayList r12 = r12.b()
            int r2 = r12.size()
            if (r2 != r8) goto L_0x00e3
            boolean r12 = r12.contains(r1)
            if (r12 == 0) goto L_0x00e3
        L_0x00e1:
            r12 = 1
            goto L_0x00e4
        L_0x00e3:
            r12 = 0
        L_0x00e4:
            daw r2 = r11.v
            day r2 = r2.a(r8)
            r12 = r12 ^ r8
            r2.a(r12)
            dck r12 = defpackage.dck.a(r0)
            dcn r12 = r12.e
            java.util.List r12 = r12.y
            int r2 = r12.size()
            r4 = 0
        L_0x00fb:
            if (r4 >= r2) goto L_0x0111
            int r5 = r4 + 1
            java.lang.Object r4 = r12.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r9 = r1.c
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L_0x010f
            r12 = 1
            goto L_0x0112
        L_0x010f:
            r4 = r5
            goto L_0x00fb
        L_0x0111:
            r12 = 0
        L_0x0112:
            daw r2 = r11.v
            day r2 = r2.a(r10)
            boolean r4 = r1.a()
            if (r4 != 0) goto L_0x012b
            java.lang.String r4 = r1.c
            boolean r4 = defpackage.dej.a(r0, r4)
            if (r4 == 0) goto L_0x0127
            goto L_0x012b
        L_0x0127:
            if (r12 != 0) goto L_0x012b
            r12 = 1
            goto L_0x012c
        L_0x012b:
            r12 = 0
        L_0x012c:
            r2.a(r12)
            daw r12 = r11.v
            day r12 = r12.a(r7)
            boolean r2 = r1.a()
            if (r2 != 0) goto L_0x0159
            cij r2 = r11.q
            cja r2 = r2.o
            cip r2 = r2.k
            java.util.Map r2 = r2.a
            int r2 = r2.size()
            r4 = 100
            if (r2 != r4) goto L_0x0157
            cij r2 = r11.q
            cja r2 = r2.o
            boolean r2 = r2.b(r1)
            if (r2 == 0) goto L_0x0156
            goto L_0x0157
        L_0x0156:
            goto L_0x0159
        L_0x0157:
            r2 = 1
            goto L_0x015a
        L_0x0159:
            r2 = 0
        L_0x015a:
            r12.a(r2)
            boolean r12 = r1.h
            if (r12 != 0) goto L_0x017e
            daw r12 = r11.v
            day r12 = r12.a(r3)
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x017a
            czw r0 = defpackage.czw.a(r0)
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0179
            r6 = 1
            goto L_0x017b
        L_0x0179:
        L_0x017a:
        L_0x017b:
            r12.a(r6)
        L_0x017e:
            daw r12 = r11.v
            r12.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cie.a(com.google.android.tvlauncher.appsview.BannerView):void");
    }
}
