package p000;

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

/* renamed from: cie */
/* compiled from: PG */
final class cie extends cif implements View.OnClickListener, View.OnLongClickListener, View.OnFocusChangeListener, cgx, cfp {

    /* renamed from: p */
    public final ArrayList f5599p = new ArrayList();

    /* renamed from: q */
    public final /* synthetic */ cij f5600q;

    /* renamed from: r */
    private final String f5601r;

    /* renamed from: s */
    private final String f5602s;

    /* renamed from: t */
    private final Drawable f5603t;

    /* renamed from: u */
    private final Drawable f5604u;

    /* renamed from: v */
    private daw f5605v;

    /* renamed from: w */
    private final LaunchItemsRowView f5606w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cie(cij cij, View view, cfp cfp) {
        super(view, cfp);
        this.f5600q = cij;
        this.f5606w = (LaunchItemsRowView) view;
        Context context = view.getContext();
        this.f5601r = context.getString(R.string.context_menu_favorite_text);
        this.f5602s = context.getString(R.string.context_menu_unfavorite_text);
        this.f5603t = context.getDrawable(R.drawable.ic_context_menu_favorite_black);
        this.f5604u = context.getDrawable(R.drawable.ic_context_menu_unfavorite_black);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo2847v() {
        return this.f5600q.mo2856f(mo5436d());
    }

    /* renamed from: a */
    public final void mo2842a(chn chn, BannerView bannerView) {
        chp chp = new chp(bannerView.getContext());
        chp.f5574a = new cir(chn, cjd.BANNER, this.f5600q.f5633o.mo2902h());
        chp.f5575b = bannerView.f6395d;
        cij cij = this.f5600q;
        chp.f5576c = cij.f5624f;
        chp.f5577d = cij.f5622d;
        chp.f5578e = cij.f5623e;
        chp.mo2819a();
    }

    /* renamed from: a */
    public final void mo2714a(cfs cfs) {
        int i = this.f9788f;
        int d = mo5436d() - this.f5600q.f5629k.indexOf(Integer.valueOf(i));
        if (i == 1) {
            cfs.mo2725a(dhs.f8537a).mo2728b(d);
        } else if (i == 2) {
            cfs.mo2725a(dhs.f8544h).mo2728b(d);
        }
        this.f5600q.f5634p.mo2714a(cfs);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cfs.<init>(int, char):void
     arg types: [int, int]
     candidates:
      cfs.<init>(int, byte):void
      cfs.<init>(int, char):void */
    /* renamed from: a */
    public final void mo2840a(chn chn, int i) {
        cfs cfs = new cfs(i, 0);
        cfs.mo2729b(dhs.f8553q);
        LaunchItemsRowView launchItemsRowView = (LaunchItemsRowView) this.f9783a;
        int childCount = launchItemsRowView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = launchItemsRowView.getChildAt(i2);
            if ((childAt instanceof BannerView) && ((BannerView) childAt).f6394c == chn) {
                cfs.mo2724a(i2);
                dja g = cfs.mo2734g();
                String str = chn.f5563c;
                if (g.f8673b) {
                    g.mo4505b();
                    g.f8673b = false;
                }
                dmj dmj = (dmj) g.f8672a;
                dmj dmj2 = dmj.f8832f;
                str.getClass();
                int i3 = dmj.f8833a | 1;
                dmj.f8833a = i3;
                dmj.f8834b = str;
                boolean z = chn.f5567g;
                dmj.f8833a = i3 | 4;
                dmj.f8835c = z;
                mo2714a(cfs);
                return;
            }
        }
        throw new IllegalStateException("Item not found in LaunchItemsRowView");
    }

    public final void onClick(View view) {
        if (!(view instanceof BannerView)) {
            return;
        }
        if (dcy.m6193b(view.getContext())) {
            m4776a((BannerView) view);
        } else {
            mo2841a(((BannerView) view).f6394c, view);
        }
    }

    public final void onFocusChange(View view, boolean z) {
        if (view instanceof BannerView) {
            daw daw = this.f5605v;
            if (daw != null && daw.f8105o && !z) {
                daw.mo4051a();
            }
            ((BannerView) view).mo3226a(z);
        }
    }

    public final boolean onLongClick(View view) {
        m4776a((BannerView) view);
        return true;
    }

    /* renamed from: a */
    public final void mo2841a(chn chn, View view) {
        if (chn == null || chn.f5561a == null || this.f5600q.f5635q == null) {
            Toast.makeText(this.f5606w.getContext(), (int) R.string.failed_launch, 0).show();
            if (chn == null) {
                Log.e("RowListAdapter", "Cannot start activity: item was null");
            } else if (chn.f5561a == null) {
                String valueOf = String.valueOf(chn);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
                sb.append("Cannot start activity: intent was null for ");
                sb.append(valueOf);
                Log.e("RowListAdapter", sb.toString());
            } else if (this.f5600q.f5635q == null) {
                String valueOf2 = String.valueOf(chn);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 44);
                sb2.append("Cannot start activity: no listener for item ");
                sb2.append(valueOf2);
                Log.e("RowListAdapter", sb2.toString());
            }
        } else {
            mo2840a(chn, 25);
            this.f5600q.f5635q.mo2763a(chn.f5561a, view);
        }
    }

    /* renamed from: a */
    public final void mo2781a(int i) {
        daw daw;
        if ((i == 4 || i == 8) && (daw = this.f5605v) != null && daw.f8105o) {
            daw.mo4051a();
        }
    }

    /* renamed from: w */
    public final void mo2848w() {
        LaunchItemsRowView launchItemsRowView = this.f5606w;
        for (int i = 0; i < launchItemsRowView.getChildCount(); i++) {
            View childAt = launchItemsRowView.getChildAt(i);
            if (childAt instanceof BannerView) {
                BannerView bannerView = (BannerView) childAt;
                chm chm = bannerView.f6398g;
                if (chm != null) {
                    if (chm.f5535a.getAnimation() != null) {
                        chm.f5535a.getAnimation().cancel();
                    }
                    if (chm.f5537c.getAnimation() != null) {
                        chm.f5537c.getAnimation().cancel();
                    }
                    if (chm.f5538d.getAnimation() != null) {
                        chm.f5538d.getAnimation().cancel();
                    }
                    Animator animator = chm.f5548n;
                    if (animator != null) {
                        animator.end();
                    }
                    bannerView.f6398g.mo2810b();
                }
                if (bannerView.f6395d.getAnimation() != null) {
                    bannerView.f6395d.getAnimation().cancel();
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
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2846u() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = 4
            if (r1 >= r2) goto L_0x00a2
            java.util.ArrayList r2 = r7.f5599p
            int r2 = r2.size()
            r3 = 8
            if (r1 >= r2) goto L_0x0082
            java.util.ArrayList r2 = r7.f5599p
            java.lang.Object r2 = r2.get(r1)
            chn r2 = (p000.chn) r2
            com.google.android.tvlauncher.appsview.LaunchItemsRowView r4 = r7.f5606w
            int r4 = r4.getChildCount()
            if (r1 >= r4) goto L_0x003f
            com.google.android.tvlauncher.appsview.LaunchItemsRowView r4 = r7.f5606w
            android.view.View r4 = r4.getChildAt(r1)
            boolean r5 = r4 instanceof com.google.android.tvlauncher.appsview.BannerView
            if (r5 == 0) goto L_0x003d
            com.google.android.tvlauncher.appsview.BannerView r4 = (com.google.android.tvlauncher.appsview.BannerView) r4
            android.widget.ImageView r5 = r4.f6395d
            int r6 = r5.getVisibility()
            if (r6 != r3) goto L_0x0036
            r5.setVisibility(r0)
        L_0x0036:
            r4.mo3225a(r2)
            r4.setVisibility(r0)
            goto L_0x007b
        L_0x003d:
            r4 = 0
            goto L_0x007b
        L_0x003f:
            com.google.android.tvlauncher.appsview.LaunchItemsRowView r3 = r7.f5606w
            android.content.Context r3 = r3.getContext()
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131624116(0x7f0e00b4, float:1.8875403E38)
            com.google.android.tvlauncher.appsview.LaunchItemsRowView r5 = r7.f5606w
            android.view.View r3 = r3.inflate(r4, r5, r0)
            r4 = r3
            com.google.android.tvlauncher.appsview.BannerView r4 = (com.google.android.tvlauncher.appsview.BannerView) r4
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            r3.<init>(r5)
            cij r5 = r7.f5600q
            int r5 = r5.f5621c
            r3.setMarginEnd(r5)
            r4.setLayoutParams(r3)
            r4.mo3225a(r2)
            r4.setOnClickListener(r7)
            r4.setOnLongClickListener(r7)
            r4.setOnFocusChangeListener(r7)
            r4.f6405n = r7
            com.google.android.tvlauncher.appsview.LaunchItemsRowView r3 = r7.f5606w
            r3.addView(r4)
        L_0x007b:
            if (r4 != 0) goto L_0x007e
            goto L_0x009e
        L_0x007e:
            r7.mo2842a(r2, r4)
            goto L_0x009e
        L_0x0082:
            com.google.android.tvlauncher.appsview.LaunchItemsRowView r2 = r7.f5606w
            int r2 = r2.getChildCount()
            if (r1 >= r2) goto L_0x009e
            com.google.android.tvlauncher.appsview.LaunchItemsRowView r2 = r7.f5606w
            android.view.View r2 = r2.getChildAt(r1)
            boolean r4 = r2 instanceof com.google.android.tvlauncher.appsview.BannerView
            if (r4 == 0) goto L_0x009e
            com.google.android.tvlauncher.appsview.BannerView r2 = (com.google.android.tvlauncher.appsview.BannerView) r2
            r2.setVisibility(r3)
            android.widget.ImageView r2 = r2.f6395d
            r2.setVisibility(r3)
        L_0x009e:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cie.mo2846u():void");
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
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m4776a(com.google.android.tvlauncher.appsview.BannerView r12) {
        /*
            r11 = this;
            android.content.Context r0 = r12.getContext()
            chn r1 = r12.f6394c
            cij r2 = r11.f5600q
            cja r2 = r2.f5633o
            boolean r2 = r2.mo2892b(r1)
            daw r9 = new daw
            r4 = r0
            android.app.Activity r4 = (android.app.Activity) r4
            android.widget.FrameLayout r5 = r12.f6399h
            int r6 = r12.f6392a
            float r7 = r12.getScaleX()
            float r8 = r12.getScaleY()
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r11.f5605v = r9
            day r3 = new day
            r4 = 2131886207(0x7f12007f, float:1.9406986E38)
            java.lang.String r4 = r0.getString(r4)
            r5 = 2131230905(0x7f0800b9, float:1.8077876E38)
            android.graphics.drawable.Drawable r5 = r0.getDrawable(r5)
            r6 = 0
            r3.<init>(r6, r4, r5)
            r3.mo4056a()
            daw r4 = r11.f5605v
            r4.mo4053a(r3)
            daw r3 = r11.f5605v
            day r4 = new day
            r5 = 2131886206(0x7f12007e, float:1.9406984E38)
            java.lang.String r5 = r0.getString(r5)
            r7 = 2131230903(0x7f0800b7, float:1.8077872E38)
            android.graphics.drawable.Drawable r7 = r0.getDrawable(r7)
            r8 = 1
            r4.<init>(r8, r5, r7)
            r3.mo4053a(r4)
            daw r3 = r11.f5605v
            day r4 = new day
            if (r2 != 0) goto L_0x0063
            java.lang.String r5 = r11.f5601r
            goto L_0x0065
        L_0x0063:
            java.lang.String r5 = r11.f5602s
        L_0x0065:
            if (r2 != 0) goto L_0x006a
            android.graphics.drawable.Drawable r2 = r11.f5603t
            goto L_0x006c
        L_0x006a:
            android.graphics.drawable.Drawable r2 = r11.f5604u
        L_0x006c:
            r7 = 2
            r4.<init>(r7, r5, r2)
            r3.mo4053a(r4)
            boolean r2 = r1.f5568h
            r3 = 3
            if (r2 != 0) goto L_0x0091
            daw r2 = r11.f5605v
            day r4 = new day
            r5 = 2131886205(0x7f12007d, float:1.9406982E38)
            java.lang.String r5 = r0.getString(r5)
            r9 = 2131230902(0x7f0800b6, float:1.807787E38)
            android.graphics.drawable.Drawable r9 = r0.getDrawable(r9)
            r4.<init>(r3, r5, r9)
            r2.mo4053a(r4)
        L_0x0091:
            daw r2 = r11.f5605v
            day r4 = new day
            r5 = 2131886209(0x7f120081, float:1.940699E38)
            java.lang.String r5 = r0.getString(r5)
            r9 = 2131230907(0x7f0800bb, float:1.807788E38)
            android.graphics.drawable.Drawable r9 = r0.getDrawable(r9)
            r10 = 4
            r4.<init>(r10, r5, r9)
            r2.mo4053a(r4)
            daw r2 = r11.f5605v
            cid r4 = new cid
            r4.<init>(r11, r1, r12)
            r2.f8096f = r4
            boolean r12 = r1.f5567g
            if (r12 != 0) goto L_0x00cd
            cij r12 = r11.f5600q
            cja r12 = r12.f5633o
            java.util.ArrayList r12 = r12.mo2893c()
            int r2 = r12.size()
            if (r2 != r8) goto L_0x00e3
            boolean r12 = r12.contains(r1)
            if (r12 == 0) goto L_0x00cc
            goto L_0x00e1
        L_0x00cc:
            goto L_0x00e3
        L_0x00cd:
            cij r12 = r11.f5600q
            cja r12 = r12.f5633o
            java.util.ArrayList r12 = r12.mo2889b()
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
            daw r2 = r11.f5605v
            day r2 = r2.mo4050a(r8)
            r12 = r12 ^ r8
            r2.mo4058a(r12)
            dck r12 = p000.dck.m6123a(r0)
            dcn r12 = r12.f8228e
            java.util.List r12 = r12.f8290y
            int r2 = r12.size()
            r4 = 0
        L_0x00fb:
            if (r4 >= r2) goto L_0x0111
            int r5 = r4 + 1
            java.lang.Object r4 = r12.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r9 = r1.f5563c
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
            daw r2 = r11.f5605v
            day r2 = r2.mo4050a(r10)
            boolean r4 = r1.mo2812a()
            if (r4 != 0) goto L_0x012b
            java.lang.String r4 = r1.f5563c
            boolean r4 = p000.dej.m6249a(r0, r4)
            if (r4 == 0) goto L_0x0127
            goto L_0x012b
        L_0x0127:
            if (r12 != 0) goto L_0x012b
            r12 = 1
            goto L_0x012c
        L_0x012b:
            r12 = 0
        L_0x012c:
            r2.mo4058a(r12)
            daw r12 = r11.f5605v
            day r12 = r12.mo4050a(r7)
            boolean r2 = r1.mo2812a()
            if (r2 != 0) goto L_0x0159
            cij r2 = r11.f5600q
            cja r2 = r2.f5633o
            cip r2 = r2.f5689k
            java.util.Map r2 = r2.f5652a
            int r2 = r2.size()
            r4 = 100
            if (r2 != r4) goto L_0x0157
            cij r2 = r11.f5600q
            cja r2 = r2.f5633o
            boolean r2 = r2.mo2892b(r1)
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
            r12.mo4058a(r2)
            boolean r12 = r1.f5568h
            if (r12 != 0) goto L_0x017e
            daw r12 = r11.f5605v
            day r12 = r12.mo4050a(r3)
            boolean r1 = r1.mo2812a()
            if (r1 != 0) goto L_0x017a
            czw r0 = p000.czw.m6037a(r0)
            boolean r0 = r0.mo4020a()
            if (r0 != 0) goto L_0x0179
            r6 = 1
            goto L_0x017b
        L_0x0179:
        L_0x017a:
        L_0x017b:
            r12.mo4058a(r6)
        L_0x017e:
            daw r12 = r11.f5605v
            r12.mo4054b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cie.m4776a(com.google.android.tvlauncher.appsview.BannerView):void");
    }
}
