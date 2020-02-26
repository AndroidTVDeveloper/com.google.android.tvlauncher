package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.widget.HorizontalGridView;
import com.google.android.tvlauncher.home.view.ChannelView;
import com.google.android.tvlauncher.home.view.ConfigureChannelsRowView;
import com.google.android.tvlauncher.view.HomeTopRowView;
import com.google.android.tvlauncher.view.SearchOrb;
import com.google.android.tvlauncher.view.SearchView;
import java.util.ArrayList;

/* renamed from: cuw  reason: default package */
/* compiled from: PG */
public final class cuw extends den {
    private final Interpolator a = new DecelerateInterpolator();

    public cuw() {
        g();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dei.a(android.view.View, int, int, android.view.animation.Interpolator):android.animation.Animator
     arg types: [android.widget.TextView, int, int, android.view.animation.Interpolator]
     candidates:
      dei.a(android.view.View, float, float, android.view.animation.Interpolator):android.animation.Animator
      dei.a(android.view.View, int, int, float):android.animation.Animator
      dei.a(android.view.View, android.graphics.Rect, android.graphics.Rect, android.view.animation.Interpolator):android.animation.Animator
      dei.a(android.widget.ImageView, float, float, android.view.animation.Interpolator):android.animation.Animator
      dei.a(android.widget.TextView, int, int, android.view.animation.Interpolator):android.animation.Animator
      dei.a(android.view.View, int, int, android.view.animation.Interpolator):android.animation.Animator */
    /* access modifiers changed from: protected */
    public final boolean d(km kmVar, jt jtVar, jt jtVar2) {
        km kmVar2 = kmVar;
        g(kmVar);
        cuv cuv = (cuv) jtVar;
        cuv cuv2 = (cuv) jtVar2;
        ArrayList arrayList = new ArrayList();
        dei.a(arrayList, dei.a(kmVar2.a, cuv.e, cuv2.e, this.a));
        View view = kmVar2.a;
        if (view instanceof ChannelView) {
            ChannelView channelView = (ChannelView) view;
            HorizontalGridView horizontalGridView = channelView.b;
            if (cuv.h == 4 && cuv2.h == 4) {
                dei.a(arrayList, dei.a(horizontalGridView, cuv.f, cuv2.f, this.a));
            }
            View view2 = (View) horizontalGridView.getParent();
            for (int i = 0; i < cuv2.g.size(); i++) {
                dei.a(arrayList, dei.a(view2, (Rect) cuv.g.get(i), (Rect) cuv2.g.get(i), this.a));
                view2 = (View) view2.getParent();
            }
            TextView textView = channelView.j;
            if (cuv.h == 0 && cuv2.h == 0) {
                dei.a(arrayList, dei.a(textView, cuv.j, cuv.k, cuv2.j, cuv2.k, cuv.l, cuv.m, this.a));
            }
            dei.a(arrayList, dei.e(textView, cuv.h, cuv2.h, cuv.i, this.a));
            if (channelView.G) {
                ImageView imageView = channelView.h;
                dei.a(arrayList, dei.a(imageView, cuv.v.left, cuv.v.top, cuv2.v.left, cuv2.v.top, cuv.w, cuv.x, this.a));
                dei.a(arrayList, dei.a(imageView, cuv.v, cuv2.v, cuv.z, this.a));
                View view3 = channelView.p;
                dei.a(arrayList, dei.b(view3, cuv.n, cuv2.n, cuv.q, this.a));
                dei.a(arrayList, dei.d(view3, cuv.o, cuv2.o, cuv.p, this.a));
                dei.a(arrayList, dei.a(view3, cuv.t, cuv2.t, this.a));
                dei.a(arrayList, dei.e(view3, cuv.r, cuv2.r, cuv.s, this.a));
            } else {
                ImageView imageView2 = channelView.h;
                dei.a(arrayList, dei.a((View) imageView2.getParent(), cuv.u, cuv2.u, this.a));
                dei.a(arrayList, dei.a(imageView2, cuv.v, cuv2.v, cuv.z, this.a));
                dei.a(arrayList, dei.a(imageView2, (float) cuv.A, (float) cuv2.A, cuv.y, this.a));
                dei.a(arrayList, dei.b(imageView2, cuv.v, cuv2.v, cuv.w, this.a));
                dei.a(arrayList, dei.c(imageView2, cuv.v, cuv2.v, cuv.x, this.a));
                dei.a(arrayList, dei.a(imageView2, cuv.B, cuv2.B, this.a));
            }
            TextView textView2 = channelView.c;
            dei.a(arrayList, dei.a(textView2, cuv.C, cuv.D, cuv2.C, cuv2.D, cuv.E, cuv.F, this.a));
            dei.a(arrayList, dei.a(textView2, cuv.G, cuv2.G, cuv.H));
            if (cuv.G == 0 && cuv2.G == 0) {
                dei.a(arrayList, dei.a(textView2, cuv.J, cuv2.I, this.a));
            }
            TextView textView3 = channelView.e;
            dei.a(arrayList, dei.a(textView3, cuv.K, cuv.L, cuv2.K, cuv2.L, cuv.M, cuv.N, this.a));
            dei.a(arrayList, dei.a(textView3, cuv.O, cuv2.O, cuv.P));
            if (cuv.O == 0 && cuv2.O == 0) {
                dei.a(arrayList, dei.a(textView3, cuv.R, cuv2.Q, this.a));
            }
            TextView textView4 = channelView.g;
            dei.a(arrayList, dei.a(textView4, cuv.S, cuv.U, cuv2.S, cuv2.U, cuv.T, cuv.V, this.a));
            dei.a(arrayList, dei.a(textView4, cuv.W, cuv2.W, cuv.X));
            if (cuv.W == 0 && cuv2.W == 0) {
                dei.a(arrayList, dei.a(textView4, cuv.Z, cuv2.Y, this.a));
            }
            View view4 = channelView.k;
            dei.a(arrayList, dei.a(view4, cuv.ac, cuv.ad, cuv2.ac, cuv2.ad, cuv.ae, cuv.af, this.a));
            dei.a(arrayList, dei.a(view4, cuv.ag, cuv2.ag, cuv.ah));
            View view5 = channelView.r;
            dei.a(arrayList, dei.a(view5, cuv.ai, cuv.aj, cuv2.ai, cuv2.aj, cuv.ak, cuv.al, this.a));
            dei.a(arrayList, dei.a(view5, cuv.am, cuv2.am, cuv.an));
            dei.a(arrayList, dei.e(channelView.n, cuv.aa, cuv2.aa, cuv.ab, this.a));
        } else if (view instanceof HomeTopRowView) {
            HomeTopRowView homeTopRowView = (HomeTopRowView) view;
            ViewGroup viewGroup = homeTopRowView.d;
            dei.a(arrayList, dei.d(viewGroup, cuv.ao, cuv2.ao, cuv.ap, this.a));
            int i2 = (int) (((float) (cuv2.as - cuv.as)) - cuv.at);
            if (((float) i2) != 0.0f) {
                arrayList.add(ObjectAnimator.ofFloat(viewGroup.getChildAt(0), View.TRANSLATION_X, (float) (-i2), 0.0f));
            }
            dei.a(arrayList, dei.d(homeTopRowView.f, cuv.aq, cuv2.aq, cuv.ar, this.a));
            SearchView searchView = homeTopRowView.e;
            SearchOrb searchOrb = searchView.d;
            SearchOrb searchOrb2 = searchView.e;
            dei.a(arrayList, dei.a(searchOrb.a, cuv.au, cuv2.au, this.a));
            dei.a(arrayList, dei.a(searchOrb2.a, cuv.av, cuv2.av, this.a));
            dei.a(arrayList, dei.a(searchOrb2, cuv.ax, cuv2.ax, this.a));
            dei.a(arrayList, dei.a(searchOrb, cuv.aw, cuv2.aw, this.a));
            dei.a(arrayList, dei.e(searchView.f, cuv.aA, cuv2.aA, cuv.aB, this.a));
            dei.a(arrayList, dei.c(searchView.g, cuv.aC, cuv2.aC, cuv2.aD, this.a));
            dei.a(arrayList, dei.c(searchView.h, cuv.aF, cuv2.aF, cuv2.aE, this.a));
            dei.a(arrayList, dei.e(searchOrb2, cuv.ay, cuv2.ay, cuv.az, this.a));
        } else if (view instanceof ConfigureChannelsRowView) {
            ConfigureChannelsRowView configureChannelsRowView = (ConfigureChannelsRowView) view;
            for (int i3 = 0; i3 < cuv.aH.length; i3++) {
                dei.a(arrayList, dei.a(configureChannelsRowView.getChildAt(i3), cuv.aG[i3], cuv.aH[i3], cuv2.aG[i3], cuv2.aH[i3], cuv.aI[i3], cuv.aJ[i3], this.a));
            }
            dei.a(arrayList, dei.e(configureChannelsRowView.b, cuv.aK, cuv2.aK, cuv2.aL, this.a));
            TextView textView5 = configureChannelsRowView.a;
            dei.a(arrayList, dei.a(textView5, cuv.aN, cuv2.aN, this.a));
            dei.a(arrayList, dei.a((View) textView5, cuv.aM, cuv2.aM, this.a));
        }
        if (!arrayList.isEmpty()) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(this.i);
            animatorSet.addListener(new cuu(this, kmVar2, cuv2));
            this.c.put(kmVar2, animatorSet);
            animatorSet.start();
            return true;
        }
        e(kmVar);
        return false;
    }

    public final jt f() {
        return new cuv((byte) 0);
    }
}
