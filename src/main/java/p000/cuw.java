package p000;

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

/* renamed from: cuw */
/* compiled from: PG */
public final class cuw extends den {

    /* renamed from: a */
    private final Interpolator f7611a = new DecelerateInterpolator();

    public cuw() {
        mo5326g();
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
    /* renamed from: d */
    public final boolean mo3745d(C0285km kmVar, C0265jt jtVar, C0265jt jtVar2) {
        C0285km kmVar2 = kmVar;
        mo4197g(kmVar);
        cuv cuv = (cuv) jtVar;
        cuv cuv2 = (cuv) jtVar2;
        ArrayList arrayList = new ArrayList();
        dei.m6238a(arrayList, dei.m6232a(kmVar2.f9783a, cuv.f7589e, cuv2.f7589e, this.f7611a));
        View view = kmVar2.f9783a;
        if (view instanceof ChannelView) {
            ChannelView channelView = (ChannelView) view;
            HorizontalGridView horizontalGridView = channelView.f6517b;
            if (cuv.f7592h == 4 && cuv2.f7592h == 4) {
                dei.m6238a(arrayList, dei.m6232a(horizontalGridView, cuv.f7590f, cuv2.f7590f, this.f7611a));
            }
            View view2 = (View) horizontalGridView.getParent();
            for (int i = 0; i < cuv2.f7591g.size(); i++) {
                dei.m6238a(arrayList, dei.m6232a(view2, (Rect) cuv.f7591g.get(i), (Rect) cuv2.f7591g.get(i), this.f7611a));
                view2 = (View) view2.getParent();
            }
            TextView textView = channelView.f6525j;
            if (cuv.f7592h == 0 && cuv2.f7592h == 0) {
                dei.m6238a(arrayList, dei.m6228a(textView, cuv.f7594j, cuv.f7595k, cuv2.f7594j, cuv2.f7595k, cuv.f7596l, cuv.f7597m, this.f7611a));
            }
            dei.m6238a(arrayList, dei.m6246e(textView, cuv.f7592h, cuv2.f7592h, cuv.f7593i, this.f7611a));
            if (channelView.f6456G) {
                ImageView imageView = channelView.f6523h;
                dei.m6238a(arrayList, dei.m6228a(imageView, cuv.f7606v.left, cuv.f7606v.top, cuv2.f7606v.left, cuv2.f7606v.top, cuv.f7607w, cuv.f7608x, this.f7611a));
                dei.m6238a(arrayList, dei.m6231a(imageView, cuv.f7606v, cuv2.f7606v, cuv.f7610z, this.f7611a));
                View view3 = channelView.f6531p;
                dei.m6238a(arrayList, dei.m6240b(view3, cuv.f7598n, cuv2.f7598n, cuv.f7601q, this.f7611a));
                dei.m6238a(arrayList, dei.m6245d(view3, cuv.f7599o, cuv2.f7599o, cuv.f7600p, this.f7611a));
                dei.m6238a(arrayList, dei.m6229a(view3, cuv.f7604t, cuv2.f7604t, this.f7611a));
                dei.m6238a(arrayList, dei.m6246e(view3, cuv.f7602r, cuv2.f7602r, cuv.f7603s, this.f7611a));
            } else {
                ImageView imageView2 = channelView.f6523h;
                dei.m6238a(arrayList, dei.m6232a((View) imageView2.getParent(), cuv.f7605u, cuv2.f7605u, this.f7611a));
                dei.m6238a(arrayList, dei.m6231a(imageView2, cuv.f7606v, cuv2.f7606v, cuv.f7610z, this.f7611a));
                dei.m6238a(arrayList, dei.m6224a(imageView2, (float) cuv.f7523A, (float) cuv2.f7523A, cuv.f7609y, this.f7611a));
                dei.m6238a(arrayList, dei.m6241b(imageView2, cuv.f7606v, cuv2.f7606v, cuv.f7607w, this.f7611a));
                dei.m6238a(arrayList, dei.m6244c(imageView2, cuv.f7606v, cuv2.f7606v, cuv.f7608x, this.f7611a));
                dei.m6238a(arrayList, dei.m6233a(imageView2, cuv.f7524B, cuv2.f7524B, this.f7611a));
            }
            TextView textView2 = channelView.f6518c;
            dei.m6238a(arrayList, dei.m6228a(textView2, cuv.f7525C, cuv.f7526D, cuv2.f7525C, cuv2.f7526D, cuv.f7527E, cuv.f7528F, this.f7611a));
            dei.m6238a(arrayList, dei.m6226a(textView2, cuv.f7529G, cuv2.f7529G, cuv.f7530H));
            if (cuv.f7529G == 0 && cuv2.f7529G == 0) {
                dei.m6238a(arrayList, dei.m6234a(textView2, cuv.f7532J, cuv2.f7531I, this.f7611a));
            }
            TextView textView3 = channelView.f6520e;
            dei.m6238a(arrayList, dei.m6228a(textView3, cuv.f7533K, cuv.f7534L, cuv2.f7533K, cuv2.f7534L, cuv.f7535M, cuv.f7536N, this.f7611a));
            dei.m6238a(arrayList, dei.m6226a(textView3, cuv.f7537O, cuv2.f7537O, cuv.f7538P));
            if (cuv.f7537O == 0 && cuv2.f7537O == 0) {
                dei.m6238a(arrayList, dei.m6234a(textView3, cuv.f7540R, cuv2.f7539Q, this.f7611a));
            }
            TextView textView4 = channelView.f6522g;
            dei.m6238a(arrayList, dei.m6228a(textView4, cuv.f7541S, cuv.f7543U, cuv2.f7541S, cuv2.f7543U, cuv.f7542T, cuv.f7544V, this.f7611a));
            dei.m6238a(arrayList, dei.m6226a(textView4, cuv.f7545W, cuv2.f7545W, cuv.f7546X));
            if (cuv.f7545W == 0 && cuv2.f7545W == 0) {
                dei.m6238a(arrayList, dei.m6234a(textView4, cuv.f7548Z, cuv2.f7547Y, this.f7611a));
            }
            View view4 = channelView.f6526k;
            dei.m6238a(arrayList, dei.m6228a(view4, cuv.f7565ac, cuv.f7566ad, cuv2.f7565ac, cuv2.f7566ad, cuv.f7567ae, cuv.f7568af, this.f7611a));
            dei.m6238a(arrayList, dei.m6226a(view4, cuv.f7569ag, cuv2.f7569ag, cuv.f7570ah));
            View view5 = channelView.f6533r;
            dei.m6238a(arrayList, dei.m6228a(view5, cuv.f7571ai, cuv.f7572aj, cuv2.f7571ai, cuv2.f7572aj, cuv.f7573ak, cuv.f7574al, this.f7611a));
            dei.m6238a(arrayList, dei.m6226a(view5, cuv.f7575am, cuv2.f7575am, cuv.f7576an));
            dei.m6238a(arrayList, dei.m6246e(channelView.f6529n, cuv.f7563aa, cuv2.f7563aa, cuv.f7564ab, this.f7611a));
        } else if (view instanceof HomeTopRowView) {
            HomeTopRowView homeTopRowView = (HomeTopRowView) view;
            ViewGroup viewGroup = homeTopRowView.f6701d;
            dei.m6238a(arrayList, dei.m6245d(viewGroup, cuv.f7577ao, cuv2.f7577ao, cuv.f7578ap, this.f7611a));
            int i2 = (int) (((float) (cuv2.f7581as - cuv.f7581as)) - cuv.f7582at);
            if (((float) i2) != 0.0f) {
                arrayList.add(ObjectAnimator.ofFloat(viewGroup.getChildAt(0), View.TRANSLATION_X, (float) (-i2), 0.0f));
            }
            dei.m6238a(arrayList, dei.m6245d(homeTopRowView.f6703f, cuv.f7579aq, cuv2.f7579aq, cuv.f7580ar, this.f7611a));
            SearchView searchView = homeTopRowView.f6702e;
            SearchOrb searchOrb = searchView.f6747d;
            SearchOrb searchOrb2 = searchView.f6748e;
            dei.m6238a(arrayList, dei.m6229a(searchOrb.f6724a, cuv.f7583au, cuv2.f7583au, this.f7611a));
            dei.m6238a(arrayList, dei.m6229a(searchOrb2.f6724a, cuv.f7584av, cuv2.f7584av, this.f7611a));
            dei.m6238a(arrayList, dei.m6225a(searchOrb2, cuv.f7586ax, cuv2.f7586ax, this.f7611a));
            dei.m6238a(arrayList, dei.m6225a(searchOrb, cuv.f7585aw, cuv2.f7585aw, this.f7611a));
            dei.m6238a(arrayList, dei.m6246e(searchView.f6749f, cuv.f7549aA, cuv2.f7549aA, cuv.f7550aB, this.f7611a));
            dei.m6238a(arrayList, dei.m6243c(searchView.f6750g, cuv.f7551aC, cuv2.f7551aC, cuv2.f7552aD, this.f7611a));
            dei.m6238a(arrayList, dei.m6243c(searchView.f6751h, cuv.f7554aF, cuv2.f7554aF, cuv2.f7553aE, this.f7611a));
            dei.m6238a(arrayList, dei.m6246e(searchOrb2, cuv.f7587ay, cuv2.f7587ay, cuv.f7588az, this.f7611a));
        } else if (view instanceof ConfigureChannelsRowView) {
            ConfigureChannelsRowView configureChannelsRowView = (ConfigureChannelsRowView) view;
            for (int i3 = 0; i3 < cuv.f7556aH.length; i3++) {
                dei.m6238a(arrayList, dei.m6228a(configureChannelsRowView.getChildAt(i3), cuv.f7555aG[i3], cuv.f7556aH[i3], cuv2.f7555aG[i3], cuv2.f7556aH[i3], cuv.f7557aI[i3], cuv.f7558aJ[i3], this.f7611a));
            }
            dei.m6238a(arrayList, dei.m6246e(configureChannelsRowView.f6555b, cuv.f7559aK, cuv2.f7559aK, cuv2.f7560aL, this.f7611a));
            TextView textView5 = configureChannelsRowView.f6554a;
            dei.m6238a(arrayList, dei.m6225a(textView5, cuv.f7562aN, cuv2.f7562aN, this.f7611a));
            dei.m6238a(arrayList, dei.m6229a((View) textView5, cuv.f7561aM, cuv2.f7561aM, this.f7611a));
        }
        if (!arrayList.isEmpty()) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(this.f9705i);
            animatorSet.addListener(new cuu(this, kmVar2, cuv2));
            this.f8386c.put(kmVar2, animatorSet);
            animatorSet.start();
            return true;
        }
        mo5324e(kmVar);
        return false;
    }

    /* renamed from: f */
    public final C0265jt mo3746f() {
        return new cuv((byte) 0);
    }
}
