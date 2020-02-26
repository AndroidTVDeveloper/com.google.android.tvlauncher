package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.widget.HorizontalGridView;
import com.google.android.tvlauncher.home.view.ChannelView;
import com.google.android.tvlauncher.home.view.ConfigureChannelsRowView;
import com.google.android.tvlauncher.view.HomeTopRowView;
import com.google.android.tvlauncher.view.SearchOrb;
import com.google.android.tvlauncher.view.SearchView;

/* renamed from: cuu */
/* compiled from: PG */
final class cuu extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ C0285km f7520a;

    /* renamed from: b */
    private final /* synthetic */ cuv f7521b;

    /* renamed from: c */
    private final /* synthetic */ cuw f7522c;

    public cuu(cuw cuw, C0285km kmVar, cuv cuv) {
        this.f7522c = cuw;
        this.f7520a = kmVar;
        this.f7521b = cuv;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        animator.removeListener(this);
        dei.m6237a(this.f7520a.f9783a, this.f7521b.f7589e);
        View view = this.f7520a.f9783a;
        int i = 0;
        if (view instanceof ChannelView) {
            ChannelView channelView = (ChannelView) view;
            cuv cuv = this.f7521b;
            HorizontalGridView horizontalGridView = channelView.f6517b;
            dei.m6237a(horizontalGridView, cuv.f7590f);
            View view2 = (View) horizontalGridView.getParent();
            while (i < cuv.f7591g.size()) {
                dei.m6237a(view2, (Rect) cuv.f7591g.get(i));
                view2 = (View) view2.getParent();
                i++;
            }
            cuv cuv2 = this.f7521b;
            TextView textView = channelView.f6525j;
            textView.setVisibility(cuv2.f7592h);
            textView.setAlpha(1.0f);
            textView.setTranslationX(0.0f);
            textView.setTranslationY(0.0f);
            if (channelView.f6456G) {
                cuv cuv3 = this.f7521b;
                ImageView imageView = channelView.f6523h;
                imageView.setTranslationX(0.0f);
                imageView.setTranslationY(0.0f);
                imageView.setScaleX(1.0f);
                imageView.setScaleY(1.0f);
                View view3 = channelView.f6531p;
                view3.setScaleY(1.0f);
                view3.setTranslationY(0.0f);
                view3.setBackgroundColor(cuv3.f7604t);
                view3.setVisibility(cuv3.f7602r);
                view3.setAlpha(1.0f);
            } else {
                cuv cuv4 = this.f7521b;
                ImageView imageView2 = channelView.f6523h;
                dei.m6237a((View) imageView2.getParent(), cuv4.f7605u);
                imageView2.setScaleX(1.0f);
                imageView2.setScaleY(1.0f);
                imageView2.setTranslationZ(0.0f);
                imageView2.setTranslationX(0.0f);
                imageView2.setTranslationY(0.0f);
                float f = cuv4.f7524B;
                if (f < 0.001f) {
                    imageView2.setColorFilter((ColorFilter) null);
                } else {
                    imageView2.setColorFilter(dej.m6252b(-16777216, f));
                }
            }
            cuv cuv5 = this.f7521b;
            TextView textView2 = channelView.f6518c;
            textView2.setTranslationY(0.0f);
            textView2.setTranslationX(0.0f);
            textView2.setVisibility(cuv5.f7529G);
            textView2.setAlpha(1.0f);
            textView2.setTextColor(cuv5.f7531I);
            TextView textView3 = channelView.f6520e;
            textView3.setTranslationX(0.0f);
            textView3.setTranslationY(0.0f);
            textView3.setVisibility(cuv5.f7537O);
            textView3.setAlpha(1.0f);
            textView3.setTextColor(cuv5.f7539Q);
            TextView textView4 = channelView.f6522g;
            textView4.setTranslationX(0.0f);
            textView4.setVisibility(cuv5.f7545W);
            textView4.setAlpha(1.0f);
            textView4.setTextColor(cuv5.f7547Y);
            View view4 = channelView.f6526k;
            view4.setTranslationX(0.0f);
            view4.setTranslationY(0.0f);
            view4.setVisibility(cuv5.f7569ag);
            view4.setAlpha(1.0f);
            cuv cuv6 = this.f7521b;
            View view5 = channelView.f6533r;
            view5.setTranslationX(0.0f);
            view5.setTranslationY(0.0f);
            view5.setVisibility(cuv6.f7575am);
            view5.setAlpha(1.0f);
            View view6 = channelView.f6529n;
            view6.setVisibility(this.f7521b.f7563aa);
            view6.setAlpha(1.0f);
        } else if (view instanceof HomeTopRowView) {
            HomeTopRowView homeTopRowView = (HomeTopRowView) view;
            cuv cuv7 = this.f7521b;
            ViewGroup viewGroup = homeTopRowView.f6701d;
            viewGroup.setTranslationY(0.0f);
            viewGroup.getChildAt(0).setTranslationX(0.0f);
            homeTopRowView.f6703f.setTranslationY(0.0f);
            SearchView searchView = homeTopRowView.f6702e;
            SearchOrb searchOrb = searchView.f6747d;
            SearchOrb searchOrb2 = searchView.f6748e;
            searchOrb.f6724a.setBackgroundColor(cuv7.f7583au);
            searchOrb2.f6724a.setBackgroundColor(cuv7.f7584av);
            ImageView imageView3 = searchView.f6749f;
            imageView3.setVisibility(cuv7.f7549aA);
            imageView3.setAlpha(1.0f);
            searchOrb2.setScaleX(cuv7.f7586ax);
            searchOrb2.setScaleY(cuv7.f7586ax);
            searchOrb2.setVisibility(cuv7.f7587ay);
            searchOrb2.setAlpha(1.0f);
            searchOrb.setScaleX(cuv7.f7585aw);
            searchOrb.setScaleY(cuv7.f7585aw);
            searchView.f6750g.setTranslationX(0.0f);
            searchView.f6751h.setTranslationX(0.0f);
        } else if (view instanceof ConfigureChannelsRowView) {
            ConfigureChannelsRowView configureChannelsRowView = (ConfigureChannelsRowView) view;
            cuv cuv8 = this.f7521b;
            while (i < configureChannelsRowView.getChildCount()) {
                configureChannelsRowView.getChildAt(i).setTranslationX(0.0f);
                configureChannelsRowView.getChildAt(i).setTranslationY(0.0f);
                i++;
            }
            configureChannelsRowView.f6555b.setVisibility(cuv8.f7559aK);
            configureChannelsRowView.f6555b.setAlpha(1.0f);
            TextView textView5 = configureChannelsRowView.f6554a;
            textView5.setBackgroundColor(cuv8.f7561aM);
            textView5.setScaleX(cuv8.f7562aN);
            textView5.setScaleY(cuv8.f7562aN);
        }
        this.f7522c.mo5324e(this.f7520a);
        this.f7522c.f8386c.remove(this.f7520a);
        this.f7522c.mo4193c();
    }
}
